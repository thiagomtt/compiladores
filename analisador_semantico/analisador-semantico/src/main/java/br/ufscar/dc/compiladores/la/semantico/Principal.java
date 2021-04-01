package br.ufscar.dc.compiladores.la.semantico;

import br.ufscar.dc.compiladores.la.semantico.LaParser.ProgramaContext;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

public class Principal {

    static CharStream cs;
    static LaLexer lexer;
    static FileWriter f;
    static CommonTokenStream tokens;
    static LaParser parser;
    static PrintWriter pw;
    static LaGeradorC laC;
    static LaSemantico laSemantic;

    public static void main(String args[]) throws IOException {
        // Inicia o PrintWriter para escrever o output no arquivo passado como parâmetro
        // CharStreams do arquivo de entrada passado como parâmetro
        pw = new PrintWriter(new File(args[1]));

        if (parser(args[0])) {
            if(semantic(args[0])){
                code(args[0]);
            }
        }
    }

    // Gerador de codigo C
    static boolean code(String file) throws IOException {
        try {
            cs = CharStreams.fromFileName(file);
            lexer = new LaLexer(cs);
            tokens = new CommonTokenStream(lexer);
            parser = new LaParser(tokens);
            ProgramaContext arvore = parser.programa();
            laC = new LaGeradorC();
            laC.visitPrograma(arvore);
            pw.write(LaGeradorC.codigoC.toString());
            pw.close();
            return true;
        } catch (IOException | RecognitionException e) {
            return false;
        }
    }

    // Analisador Semantico
    static boolean semantic(String file) throws IOException {
        try {
            cs = CharStreams.fromFileName(file);
            lexer = new LaLexer(cs);
            tokens = new CommonTokenStream(lexer);
            parser = new LaParser(tokens);
            ProgramaContext arvore = parser.programa();
            laSemantic = new LaSemantico();
            laSemantic.visitPrograma(arvore);
            if (LaSemanticoUtils.errosSemanticos.isEmpty()) {
                return true;
            }
            LaSemanticoUtils.errosSemanticos.forEach((s) -> pw.write(s + "\n"));
            pw.write("Fim da compilacao\n");
            pw.close();
            return false;
        } catch (IOException | RecognitionException e) {
            return false;
        }
    }

    // Analise sintatica
    static boolean parser(String file) throws IOException {
        try {
            cs = CharStreams.fromFileName(file);
            lexer = new LaLexer(cs);
            tokens = new CommonTokenStream(lexer);
            parser = new LaParser(tokens);
            ErrorListener mcel = new ErrorListener(pw);
            parser.addErrorListener(mcel);
            parser.programa();
            return true;
        } catch (IOException | RecognitionException e) {
            System.out.println(e.toString());
        }
        return false;
    }

    // Analisador lexico
    static boolean lexer(String file) throws IOException {
        // Declaracao para inicializar os objetos do antlr
        cs = CharStreams.fromFileName(file);
        lexer = new LaLexer(cs);
        Token t;
        boolean error = false;
        // Escreve a saida da analise lexica dentro do arquivo
        OUTER:
        while ((t = lexer.nextToken()).getType() != Token.EOF) {
            switch (LaLexer.VOCABULARY.getDisplayName(t.getType())) {
                case "ERRO" -> {
//                    pw.write("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado\n");
                    error = true;
                    break OUTER;
                }
                case "COMENTARIO_ERRADO" -> {
//                    pw.write("Linha " + t.getLine() + ": comentario nao fechado\n");
                    error = true;
                    break OUTER;
                }
                case "CADEIA_ERRADA" -> {
//                    pw.write("Linha " + t.getLine() + ": cadeia literal nao fechada\n");
                    error = true;
                    break OUTER;
                }
                default -> {
                    error = false;
//                    pw.write("<'" + t.getText() + "'," + LaLexer.VOCABULARY.getDisplayName(t.getType()) + ">\n");
                }
            }
        }
        if (error) {
            return false;
        }
        return true;
    }
}
