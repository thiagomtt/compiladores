/*
 * Trabalho 1 - Compiladores ENPE 2020/2
 * Implementação de um analisador léxico para a linguagem LA utilizando ANTLR
 * 
 * Grupo:
 * Thiago de Moraes Teixeira    - 760667
 * Victoria de Martini de Souza - 759378
 *
 */
package br.ufscar.dc.compiladores.la.lexico;

// imports
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

// main class
public class Main {
    public static void main(String args[]) throws IOException {
        // Declaracao para inicializar os objetos do antlr
        CharStream cs = CharStreams.fromFileName(args[0]);
        LaLexer lex = new LaLexer(cs);
        Token t = null;
        // Cria o arquivo de saida no path recebido via linha de comando
        try {
            File myFile = new File(args[1]);
        } catch (Exception e) {
            System.out.println("Error creating output file");
        }
        // Escreve a saida da analise lexica dentro do arquivo
        try {
            FileWriter myWriter = new FileWriter(args[1]);
            OUTER:
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                switch (LaLexer.VOCABULARY.getDisplayName(t.getType())) {
                    case "ERRO" -> {
                        myWriter.write("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado\n");
                        break OUTER;
                    }
                    case "COMENTARIO_ERRADO" -> {
                        myWriter.write("Linha " + t.getLine() + ": comentario nao fechado\n");
                        break OUTER;
                    }
                    case "CADEIA_ERRADA" -> {
                        myWriter.write("Linha " + t.getLine() + ": cadeia literal nao fechada\n");
                        break OUTER;
                    }
                    default -> myWriter.write("<'" + t.getText() + "'," + LaLexer.VOCABULARY.getDisplayName(t.getType()) + ">\n");
                }
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error writing output file");
        }
    }
}
