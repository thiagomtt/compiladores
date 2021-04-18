package br.ufscar.dc.compiladores.geradornotafiscal;

import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class ErrorListener implements ANTLRErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Token t = (Token) offendingSymbol;
        System.out.println("ERRO="+t.getText());
        switch (NotasLexer.VOCABULARY.getDisplayName(t.getType())) {
            case "ERRO" -> {
                System.out.println("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado");
            }
            case "COMENTARIO_ERRADO" -> {
                System.out.println("Linha " + t.getLine() + ": " + t.getText() + " - comentario nao fechado");
            }
            case "CADEIA_ERRADA" -> {
                System.out.println("Linha " + t.getLine() + ": " + t.getText() + " - cadeia nao fechada");
            }
            default -> {
                System.out.println("<'" + t.getText() + "'," + NotasLexer.VOCABULARY.getDisplayName(t.getType()) + ">");
            }
        }
        throw new RuntimeException();
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
