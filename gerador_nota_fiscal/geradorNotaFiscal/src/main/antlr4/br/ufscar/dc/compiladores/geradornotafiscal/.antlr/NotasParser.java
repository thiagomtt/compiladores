// Generated from /home/thiago/compiladores/notaFiscal/geradorNotaFiscal/src/main/antlr4/br/ufscar/dc/compiladores/geradornotafiscal/Notas.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NotasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NOTA=3, FIM_NOTA=4, EMITENTE=5, DESTINATARIO=6, ITENS=7, 
		PAGAMENTO=8, IDENT=9, CADEIA=10, NUM_INT=11, NUM_REAL=12, ABREPAR=13, 
		FECHAPAR=14, DOIS_PONTOS=15, COMENTARIO=16, BLOCO_COMENTARIO=17, WHITE_SPACE=18, 
		COMENTARIO_ERRADO=19, CADEIA_ERRADA=20, ERRO=21;
	public static final int
		RULE_notaFiscal = 0, RULE_corpo = 1, RULE_emitente = 2, RULE_cpf_cnpj = 3, 
		RULE_destinatario = 4, RULE_razaoSocial = 5, RULE_itens = 6, RULE_item = 7, 
		RULE_pagamento = 8, RULE_meio = 9, RULE_valor = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"notaFiscal", "corpo", "emitente", "cpf_cnpj", "destinatario", "razaoSocial", 
			"itens", "item", "pagamento", "meio", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'-'", "'nota'", "'fim_nota'", "'emitente'", "'destinatario'", 
			"'itens'", "'pagamento'", null, null, null, null, "'('", "')'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NOTA", "FIM_NOTA", "EMITENTE", "DESTINATARIO", "ITENS", 
			"PAGAMENTO", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "ABREPAR", "FECHAPAR", 
			"DOIS_PONTOS", "COMENTARIO", "BLOCO_COMENTARIO", "WHITE_SPACE", "COMENTARIO_ERRADO", 
			"CADEIA_ERRADA", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Notas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NotaFiscalContext extends ParserRuleContext {
		public TerminalNode NOTA() { return getToken(NotasParser.NOTA, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_NOTA() { return getToken(NotasParser.FIM_NOTA, 0); }
		public NotaFiscalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notaFiscal; }
	}

	public final NotaFiscalContext notaFiscal() throws RecognitionException {
		NotaFiscalContext _localctx = new NotaFiscalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_notaFiscal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(NOTA);
			setState(23);
			corpo();
			setState(24);
			match(FIM_NOTA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public EmitenteContext emitente() {
			return getRuleContext(EmitenteContext.class,0);
		}
		public DestinatarioContext destinatario() {
			return getRuleContext(DestinatarioContext.class,0);
		}
		public ItensContext itens() {
			return getRuleContext(ItensContext.class,0);
		}
		public PagamentoContext pagamento() {
			return getRuleContext(PagamentoContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			emitente();
			setState(27);
			destinatario();
			setState(28);
			itens();
			setState(29);
			pagamento();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmitenteContext extends ParserRuleContext {
		public TerminalNode EMITENTE() { return getToken(NotasParser.EMITENTE, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(NotasParser.DOIS_PONTOS, 0); }
		public Cpf_cnpjContext cpf_cnpj() {
			return getRuleContext(Cpf_cnpjContext.class,0);
		}
		public EmitenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitente; }
	}

	public final EmitenteContext emitente() throws RecognitionException {
		EmitenteContext _localctx = new EmitenteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_emitente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(EMITENTE);
			setState(32);
			match(DOIS_PONTOS);
			setState(33);
			cpf_cnpj();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cpf_cnpjContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(NotasParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(NotasParser.NUM_INT, i);
		}
		public Cpf_cnpjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpf_cnpj; }
	}

	public final Cpf_cnpjContext cpf_cnpj() throws RecognitionException {
		Cpf_cnpjContext _localctx = new Cpf_cnpjContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cpf_cnpj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(NUM_INT);
			setState(36);
			match(NUM_INT);
			setState(37);
			match(NUM_INT);
			setState(38);
			match(T__0);
			setState(39);
			match(NUM_INT);
			setState(40);
			match(NUM_INT);
			setState(41);
			match(NUM_INT);
			setState(42);
			match(T__0);
			setState(43);
			match(NUM_INT);
			setState(44);
			match(NUM_INT);
			setState(45);
			match(NUM_INT);
			setState(46);
			match(T__1);
			setState(47);
			match(NUM_INT);
			setState(48);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DestinatarioContext extends ParserRuleContext {
		public TerminalNode DESTINATARIO() { return getToken(NotasParser.DESTINATARIO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(NotasParser.DOIS_PONTOS, 0); }
		public RazaoSocialContext razaoSocial() {
			return getRuleContext(RazaoSocialContext.class,0);
		}
		public DestinatarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinatario; }
	}

	public final DestinatarioContext destinatario() throws RecognitionException {
		DestinatarioContext _localctx = new DestinatarioContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_destinatario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(DESTINATARIO);
			setState(51);
			match(DOIS_PONTOS);
			setState(52);
			razaoSocial();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RazaoSocialContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(NotasParser.CADEIA, 0); }
		public RazaoSocialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_razaoSocial; }
	}

	public final RazaoSocialContext razaoSocial() throws RecognitionException {
		RazaoSocialContext _localctx = new RazaoSocialContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_razaoSocial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItensContext extends ParserRuleContext {
		public TerminalNode ITENS() { return getToken(NotasParser.ITENS, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(NotasParser.DOIS_PONTOS, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ItensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itens; }
	}

	public final ItensContext itens() throws RecognitionException {
		ItensContext _localctx = new ItensContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_itens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ITENS);
			setState(57);
			match(DOIS_PONTOS);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				item();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public Token quantidade;
		public TerminalNode IDENT() { return getToken(NotasParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(NotasParser.ABREPAR, 0); }
		public TerminalNode FECHAPAR() { return getToken(NotasParser.FECHAPAR, 0); }
		public TerminalNode NUM_INT() { return getToken(NotasParser.NUM_INT, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(IDENT);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABREPAR) {
				{
				setState(64);
				match(ABREPAR);
				setState(65);
				((ItemContext)_localctx).quantidade = match(NUM_INT);
				setState(66);
				match(FECHAPAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PagamentoContext extends ParserRuleContext {
		public TerminalNode PAGAMENTO() { return getToken(NotasParser.PAGAMENTO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(NotasParser.DOIS_PONTOS, 0); }
		public MeioContext meio() {
			return getRuleContext(MeioContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public PagamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pagamento; }
	}

	public final PagamentoContext pagamento() throws RecognitionException {
		PagamentoContext _localctx = new PagamentoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pagamento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(PAGAMENTO);
			setState(70);
			match(DOIS_PONTOS);
			setState(71);
			meio();
			setState(72);
			valor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeioContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(NotasParser.NUM_INT, 0); }
		public MeioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meio; }
	}

	public final MeioContext meio() throws RecognitionException {
		MeioContext _localctx = new MeioContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_meio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(NotasParser.NUM_REAL, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(NUM_REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\6\b>\n\b\r\b\16\b?\3\t\3\t\3\t\3\t\5\tF\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2"+
		"G\2\30\3\2\2\2\4\34\3\2\2\2\6!\3\2\2\2\b%\3\2\2\2\n\64\3\2\2\2\f8\3\2"+
		"\2\2\16:\3\2\2\2\20A\3\2\2\2\22G\3\2\2\2\24L\3\2\2\2\26N\3\2\2\2\30\31"+
		"\7\5\2\2\31\32\5\4\3\2\32\33\7\6\2\2\33\3\3\2\2\2\34\35\5\6\4\2\35\36"+
		"\5\n\6\2\36\37\5\16\b\2\37 \5\22\n\2 \5\3\2\2\2!\"\7\7\2\2\"#\7\21\2\2"+
		"#$\5\b\5\2$\7\3\2\2\2%&\7\r\2\2&\'\7\r\2\2\'(\7\r\2\2()\7\3\2\2)*\7\r"+
		"\2\2*+\7\r\2\2+,\7\r\2\2,-\7\3\2\2-.\7\r\2\2./\7\r\2\2/\60\7\r\2\2\60"+
		"\61\7\4\2\2\61\62\7\r\2\2\62\63\7\r\2\2\63\t\3\2\2\2\64\65\7\b\2\2\65"+
		"\66\7\21\2\2\66\67\5\f\7\2\67\13\3\2\2\289\7\f\2\29\r\3\2\2\2:;\7\t\2"+
		"\2;=\7\21\2\2<>\5\20\t\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\17\3"+
		"\2\2\2AE\7\13\2\2BC\7\17\2\2CD\7\r\2\2DF\7\20\2\2EB\3\2\2\2EF\3\2\2\2"+
		"F\21\3\2\2\2GH\7\n\2\2HI\7\21\2\2IJ\5\24\13\2JK\5\26\f\2K\23\3\2\2\2L"+
		"M\7\r\2\2M\25\3\2\2\2NO\7\16\2\2O\27\3\2\2\2\4?E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}