/*
 * Trabalho 1 - Compiladores ENPE 2020/2
 * Implementação de um analisador sintático para a linguagem LA utilizando ANTLR
 * 
 * Grupo:
 * Thiago de Moraes Teixeira    - 760667
 * Victoria de Martini de Souza - 759378
 *
 */
package br.ufscar.dc.compiladores.la.sintatico;

// imports
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

// main class
public class Main {

    public static void main(String args[]) throws IOException {
        // Declaracao para inicializar os objetos do antlr
        CharStream cs = CharStreams.fromFileName(args[0]);
        LaLexer lex = new LaLexer(cs);
        // Para controlar o número de erros impressos dentro do arquivo
        int errorsPrinted = 0;
        // Cria o arquivo de saida no path recebido via linha de comando
        File myFile = new File(args[1]);

        try (PrintWriter myWriter = new PrintWriter(myFile)) {
            CommonTokenStream tokens = new CommonTokenStream(lex);
            LaParser parser = new LaParser(tokens);
            parser.addErrorListener(new MeuErrorListener(myWriter, errorsPrinted));
            try {
                parser.programa();
            } catch (Exception e) {
            }
            myWriter.println("Fim da compilacao");
        }

    }
}
