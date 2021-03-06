package br.ufscar.dc.compiladores.la.semantico;

import java.io.PrintWriter;
import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class ErrorListener implements ANTLRErrorListener {

    PrintWriter myWriter;

    public ErrorListener(PrintWriter myWriter) {
        this.myWriter = myWriter;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object offendingSymbol, int i, int i1, String string, RecognitionException re) {
        // Compara os erros pelo texto
        Token t = (Token) offendingSymbol;
        System.out.print("\n\nERRO: " + t.getText().length());
        System.out.println("\n\n" + t.getText());
        switch (t.getText()) {
            case "{ " -> {
                myWriter.print("Linha " + i + ": comentario nao fechado\n");
            }
            case "@" -> {
                myWriter.print("Linha " + i + ": " + t.getText() + " - simbolo nao identificado\n");
            }
            case "|" -> {
                myWriter.print("Linha " + i + ": " + t.getText() + " - simbolo nao identificado\n");
            }
            case "!" -> {
                myWriter.print("Linha " + i + ": " + t.getText() + " - simbolo nao identificado\n");
            }
            case "<EOF>" -> {
                myWriter.print("Linha " + i + ": erro sintatico proximo a EOF\n");
            }
            default -> {
                if (t.getText().startsWith("\"") && !t.getText().endsWith("\"")) {
                    myWriter.print("Linha " + i + ": cadeia literal nao fechada\n");
                } else {
                    myWriter.print("Linha " + i + ": erro sintatico proximo a " + t.getText() + "\n");
                }
            }
        }
        throw new RuntimeException();
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa,
            int i, int i1, boolean bln, BitSet bitset,
            ATNConfigSet atncs
    ) {
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa,
            int i, int i1, BitSet bitset,
            ATNConfigSet atncs
    ) {
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa,
            int i, int i1, int i2, ATNConfigSet atncs
    ) {
    }

}

