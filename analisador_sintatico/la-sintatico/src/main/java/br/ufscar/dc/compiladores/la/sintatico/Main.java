package br.ufscar.dc.compiladores.la.sintatico;

// imports
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

// main class
public class Main {

    public static void main(String args[]) throws IOException {
        // Declaracao para inicializar os objetos do antlr
        CharStream cs = CharStreams.fromFileName(args[0]);
        LaLexer lex = new LaLexer(cs);
        // Cria o arquivo de saida no path recebido via linha de comando
        File myFile = new File(args[1]);

        // Roda o analisador sintatico
        try (PrintWriter myWriter = new PrintWriter(myFile)) {
            CommonTokenStream tokens = new CommonTokenStream(lex);
            LaParser parser = new LaParser(tokens);
            parser.addErrorListener(new MeuErrorListener(myWriter));
            try {
                parser.programa();
            } catch (Exception e) {
            }
            myWriter.println("Fim da compilacao");
        }

    }
}
