package br.ufscar.dc.compiladores.geradornotafiscal;

import br.ufscar.dc.compiladores.geradornotafiscal.NotasParser.NotaFiscalContext;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

public class Principal {

    static CharStream cs;
    static NotasLexer lexer;
    static CommonTokenStream tokens;
    static NotasParser parser;
    static SemanticoVisitor notaSemantico;
    static GeradorNotaFiscal notaGerada;
    static PrintWriter pw;

    static BancoDeDados bd = new BancoDeDados();

    public static void main(String args[]) throws IOException {
        // Lista destinatários
        bd.inserir("17.453.915/0001-55", "NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL", "thiagomt@estudante.ufscar.br", "AVENIDA DUQUE DE CAXIAS", 882, "CENTRO", "PR", "87020025", "4115200", "MARINGA");

        // Inicia o PrintWriter para escrever o output no arquivo passado como parâmetro
        // CharStreams do arquivo de entrada passado como parâmetro
        pw = new PrintWriter(new File(args[1]));        
        
        // Realiza analises antes da geracao do json 
        if (parser(args[0])) {
            if (semantico(args[0])) {
                geradorNota(args[0]);
            }
        }
    }

    static boolean geradorNota(String file) throws IOException {
        try {
            cs = CharStreams.fromFileName(file);
            lexer = new NotasLexer(cs);
            tokens = new CommonTokenStream(lexer);
            parser = new NotasParser(tokens);
            NotaFiscalContext arvore = parser.notaFiscal();
            notaGerada = new GeradorNotaFiscal();
            notaGerada.visitNotaFiscal(arvore);
            pw.write(notaGerada.notaFiscal.toString());
            pw.close();
            return true;
        } catch (IOException | RecognitionException e) {
            System.out.println(e.toString());
        }
        return false;

    }
    
    static boolean semantico(String file) throws IOException {
        cs = CharStreams.fromFileName(file);
        lexer = new NotasLexer(cs);
        tokens = new CommonTokenStream(lexer);
        parser = new NotasParser(tokens);
        NotaFiscalContext arvore = parser.notaFiscal();
        notaSemantico = new SemanticoVisitor();
        notaSemantico.visitNotaFiscal(arvore);
        if (SemanticoUtils.errosSemanticos.isEmpty()) {
            return true;
        }
        SemanticoUtils.errosSemanticos.forEach((s) -> pw.write(s + "\n"));
        pw.write("Fim da compilação\n");
        pw.close();
        return false;
    }

    static boolean parser(String file) throws IOException {
        try {
            cs = CharStreams.fromFileName(file);
            lexer = new NotasLexer(cs);
            tokens = new CommonTokenStream(lexer);
            parser = new NotasParser(tokens);
            parser.addErrorListener(new ErrorListener(pw));
            parser.notaFiscal();
            return true;
        } catch (IOException | RecognitionException e) {
            System.out.println(e.toString());
        }
        return false;
    }

    static void lexer(String file) throws IOException {
        cs = CharStreams.fromFileName(file);
        lexer = new NotasLexer(cs);
        Token t;

        OUTER:
        while ((t = lexer.nextToken()).getType() != Token.EOF) {
            switch (NotasLexer.VOCABULARY.getDisplayName(t.getType())) {
                case "ERRO" -> {
                    pw.write("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado");
                    break OUTER;
                }
                case "COMENTARIO_ERRADO" -> {
                    pw.write("Linha " + t.getLine() + ": " + t.getText() + " - comentario nao fechado");
                    break OUTER;
                }
                case "CADEIA_ERRADA" -> {
                    pw.write("Linha " + t.getLine() + ": " + t.getText() + " - cadeia nao fechada");
                    break OUTER;
                }
                default -> {
                    pw.write("<'" + t.getText() + "'," + NotasLexer.VOCABULARY.getDisplayName(t.getType()) + ">");
                }
            }
        }
    }
}
