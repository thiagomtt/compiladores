// Generated from br/ufscar/dc/compiladores/la/sintatico/La.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.la.sintatico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FIM_ALGORITMO=2, DECLARE=3, TIPO=4, E=5, OU=6, ATE=7, NAO=8, 
		ESCREVA=9, LEIA=10, FACA=11, SEJA=12, LOGICO=13, RETORNE=14, ENTAO=15, 
		ENQUANTO=16, FIM_ENQUANTO=17, CASO=18, FIM_CASO=19, SE=20, SENAO=21, FIM_SE=22, 
		PARA=23, FIM_PARA=24, FUNCAO=25, FIM_FUNCAO=26, REGISTRO=27, FIM_REGISTRO=28, 
		PROCEDIMENTO=29, FIM_PROCEDIMENTO=30, VAR=31, LITERAL=32, CONSTANTE=33, 
		INTEIRO=34, REAL=35, VERDADEIRO=36, FALSO=37, IDENT=38, CADEIA=39, NUM_INT=40, 
		NUM_REAL=41, IGUAL=42, DIF=43, MENOR=44, MENOR_IGUAL=45, MAIOR=46, MAIOR_IGUAL=47, 
		ATRIBUICAO=48, AD=49, SUB=50, DIV=51, RESTO=52, MULT=53, ELEVADO=54, E_COMERCIAL=55, 
		PONTO=56, INTERVALO=57, DOIS_PONTOS=58, VIRGULA=59, ABREPAR=60, FECHAPAR=61, 
		ABRECOL=62, FECHACOL=63, COMENTARIO=64, WS=65, COMENTARIO_ERRADO=66, CADEIA_ERRADA=67, 
		ERRO=68;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_dec1_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_dimensao = 6, RULE_tipo = 7, 
		RULE_tipo_basico = 8, RULE_tipo_basico_ident = 9, RULE_tipo_estendido = 10, 
		RULE_valor_constante = 11, RULE_registro = 12, RULE_declaracao_global = 13, 
		RULE_parametro = 14, RULE_parametros = 15, RULE_corpo = 16, RULE_cmd = 17, 
		RULE_cmdLeia = 18, RULE_cmdEscreva = 19, RULE_cmdSe = 20, RULE_cmdCaso = 21, 
		RULE_cmdPara = 22, RULE_cmdEnquanto = 23, RULE_cmdFaca = 24, RULE_cmdAtribuicao = 25, 
		RULE_cmdChamada = 26, RULE_cmdRetorne = 27, RULE_selecao = 28, RULE_item_selecao = 29, 
		RULE_constantes = 30, RULE_numero_intervalo = 31, RULE_op_unario = 32, 
		RULE_exp_aritmetica = 33, RULE_termo = 34, RULE_fator = 35, RULE_op1 = 36, 
		RULE_op2 = 37, RULE_op3 = 38, RULE_parcela = 39, RULE_parcela_unario = 40, 
		RULE_parcela_nao_unario = 41, RULE_exp_relacional = 42, RULE_op_relacional = 43, 
		RULE_expressao = 44, RULE_termo_logico = 45, RULE_fator_logico = 46, RULE_parcela_logica = 47, 
		RULE_op_logico_1 = 48, RULE_op_logico_2 = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "dec1_local_global", "declaracao_local", "variavel", 
			"identificador", "dimensao", "tipo", "tipo_basico", "tipo_basico_ident", 
			"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
			"parametro", "parametros", "corpo", "cmd", "cmdLeia", "cmdEscreva", "cmdSe", 
			"cmdCaso", "cmdPara", "cmdEnquanto", "cmdFaca", "cmdAtribuicao", "cmdChamada", 
			"cmdRetorne", "selecao", "item_selecao", "constantes", "numero_intervalo", 
			"op_unario", "exp_aritmetica", "termo", "fator", "op1", "op2", "op3", 
			"parcela", "parcela_unario", "parcela_nao_unario", "exp_relacional", 
			"op_relacional", "expressao", "termo_logico", "fator_logico", "parcela_logica", 
			"op_logico_1", "op_logico_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'tipo'", "'e'", 
			"'ou'", "'ate'", "'nao'", "'escreva'", "'leia'", "'faca'", "'seja'", 
			"'logico'", "'retorne'", "'entao'", "'enquanto'", "'fim_enquanto'", "'caso'", 
			"'fim_caso'", "'se'", "'senao'", "'fim_se'", "'para'", "'fim_para'", 
			"'funcao'", "'fim_funcao'", "'registro'", "'fim_registro'", "'procedimento'", 
			"'fim_procedimento'", "'var'", "'literal'", "'constante'", "'inteiro'", 
			"'real'", "'verdadeiro'", "'falso'", null, null, null, null, "'='", "'<>'", 
			"'<'", "'<='", "'>'", "'>='", "'<-'", "'+'", "'-'", "'/'", "'%'", "'*'", 
			"'^'", "'&'", "'.'", "'..'", "':'", "','", "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "FIM_ALGORITMO", "DECLARE", "TIPO", "E", "OU", "ATE", 
			"NAO", "ESCREVA", "LEIA", "FACA", "SEJA", "LOGICO", "RETORNE", "ENTAO", 
			"ENQUANTO", "FIM_ENQUANTO", "CASO", "FIM_CASO", "SE", "SENAO", "FIM_SE", 
			"PARA", "FIM_PARA", "FUNCAO", "FIM_FUNCAO", "REGISTRO", "FIM_REGISTRO", 
			"PROCEDIMENTO", "FIM_PROCEDIMENTO", "VAR", "LITERAL", "CONSTANTE", "INTEIRO", 
			"REAL", "VERDADEIRO", "FALSO", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", 
			"IGUAL", "DIF", "MENOR", "MENOR_IGUAL", "MAIOR", "MAIOR_IGUAL", "ATRIBUICAO", 
			"AD", "SUB", "DIV", "RESTO", "MULT", "ELEVADO", "E_COMERCIAL", "PONTO", 
			"INTERVALO", "DOIS_PONTOS", "VIRGULA", "ABREPAR", "FECHAPAR", "ABRECOL", 
			"FECHACOL", "COMENTARIO", "WS", "COMENTARIO_ERRADO", "CADEIA_ERRADA", 
			"ERRO"
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
	public String getGrammarFileName() { return "La.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(LaParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(LaParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			declaracoes();
			setState(101);
			match(ALGORITMO);
			setState(102);
			corpo();
			setState(103);
			match(FIM_ALGORITMO);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Dec1_local_globalContext> dec1_local_global() {
			return getRuleContexts(Dec1_local_globalContext.class);
		}
		public Dec1_local_globalContext dec1_local_global(int i) {
			return getRuleContext(Dec1_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << TIPO) | (1L << FUNCAO) | (1L << PROCEDIMENTO) | (1L << CONSTANTE))) != 0)) {
				{
				{
				setState(105);
				dec1_local_global();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Dec1_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Dec1_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec1_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterDec1_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitDec1_local_global(this);
		}
	}

	public final Dec1_local_globalContext dec1_local_global() throws RecognitionException {
		Dec1_local_globalContext _localctx = new Dec1_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec1_local_global);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case TIPO:
			case CONSTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				declaracao_local();
				}
				break;
			case FUNCAO:
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				declaracao_global();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(LaParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(LaParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(LaParser.DOIS_PONTOS, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(LaParser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(LaParser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(DECLARE);
				setState(116);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(CONSTANTE);
				setState(118);
				match(IDENT);
				setState(119);
				match(DOIS_PONTOS);
				setState(120);
				tipo_basico();
				setState(121);
				match(IGUAL);
				setState(122);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(TIPO);
				setState(125);
				match(IDENT);
				setState(126);
				match(DOIS_PONTOS);
				setState(127);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LaParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LaParser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			identificador();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(131);
				match(VIRGULA);
				setState(132);
				identificador();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(DOIS_PONTOS);
			setState(139);
			tipo();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(LaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LaParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public List<TerminalNode> PONTO() { return getTokens(LaParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(LaParser.PONTO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IDENT);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(142);
				match(PONTO);
				setState(143);
				match(IDENT);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			dimensao();
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

	public static class DimensaoContext extends ParserRuleContext {
		public List<TerminalNode> ABRECOL() { return getTokens(LaParser.ABRECOL); }
		public TerminalNode ABRECOL(int i) {
			return getToken(LaParser.ABRECOL, i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> FECHACOL() { return getTokens(LaParser.FECHACOL); }
		public TerminalNode FECHACOL(int i) {
			return getToken(LaParser.FECHACOL, i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitDimensao(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRECOL) {
				{
				{
				setState(151);
				match(ABRECOL);
				setState(152);
				exp_aritmetica();
				setState(153);
				match(FECHACOL);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				registro();
				}
				break;
			case LOGICO:
			case LITERAL:
			case INTEIRO:
			case REAL:
			case IDENT:
			case ELEVADO:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				tipo_estendido();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(LaParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(LaParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(LaParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(LaParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGICO) | (1L << LITERAL) | (1L << INTEIRO) | (1L << REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitTipo_basico_ident(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_basico_ident);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICO:
			case LITERAL:
			case INTEIRO:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public List<TerminalNode> ELEVADO() { return getTokens(LaParser.ELEVADO); }
		public TerminalNode ELEVADO(int i) {
			return getToken(LaParser.ELEVADO, i);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELEVADO) {
				{
				{
				setState(170);
				match(ELEVADO);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			tipo_basico_ident();
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LaParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LaParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LaParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(LaParser.FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VERDADEIRO) | (1L << FALSO) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(LaParser.REGISTRO, 0); }
		public TerminalNode FIM_REGISTRO() { return getToken(LaParser.FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(REGISTRO);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(181);
				variavel();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(FIM_REGISTRO);
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

	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(LaParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(LaParser.ABREPAR, 0); }
		public TerminalNode FECHAPAR() { return getToken(LaParser.FECHAPAR, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(LaParser.FIM_PROCEDIMENTO, 0); }
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(LaParser.FUNCAO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(LaParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(LaParser.FIM_FUNCAO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracao_global);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(PROCEDIMENTO);
				setState(190);
				match(IDENT);
				setState(191);
				match(ABREPAR);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR || _la==IDENT) {
					{
					{
					setState(192);
					parametros();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(FECHAPAR);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << TIPO) | (1L << CONSTANTE))) != 0)) {
					{
					{
					setState(199);
					declaracao_local();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCREVA) | (1L << LEIA) | (1L << FACA) | (1L << RETORNE) | (1L << ENQUANTO) | (1L << CASO) | (1L << SE) | (1L << PARA) | (1L << IDENT) | (1L << ELEVADO))) != 0)) {
					{
					{
					setState(205);
					cmd();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(FUNCAO);
				setState(213);
				match(IDENT);
				setState(214);
				match(ABREPAR);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR || _la==IDENT) {
					{
					{
					setState(215);
					parametros();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(FECHAPAR);
				setState(222);
				match(DOIS_PONTOS);
				setState(223);
				tipo_estendido();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << TIPO) | (1L << CONSTANTE))) != 0)) {
					{
					{
					setState(224);
					declaracao_local();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCREVA) | (1L << LEIA) | (1L << FACA) | (1L << RETORNE) | (1L << ENQUANTO) | (1L << CASO) | (1L << SE) | (1L << PARA) | (1L << IDENT) | (1L << ELEVADO))) != 0)) {
					{
					{
					setState(230);
					cmd();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(FIM_FUNCAO);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LaParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(LaParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LaParser.VAR, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LaParser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(240);
				match(VAR);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			identificador();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(247);
				match(VIRGULA);
				setState(248);
				identificador();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(DOIS_PONTOS);
			setState(255);
			tipo_estendido();
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LaParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			parametro();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(258);
				match(VIRGULA);
				setState(259);
				parametro();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << TIPO) | (1L << CONSTANTE))) != 0)) {
				{
				{
				setState(265);
				declaracao_local();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCREVA) | (1L << LEIA) | (1L << FACA) | (1L << RETORNE) | (1L << ENQUANTO) | (1L << CASO) | (1L << SE) | (1L << PARA) | (1L << IDENT) | (1L << ELEVADO))) != 0)) {
				{
				{
				setState(271);
				cmd();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmd);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(283);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(284);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(285);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(286);
				cmdRetorne();
				}
				break;
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

	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(LaParser.LEIA, 0); }
		public TerminalNode ABREPAR() { return getToken(LaParser.ABREPAR, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LaParser.FECHAPAR, 0); }
		public List<TerminalNode> ELEVADO() { return getTokens(LaParser.ELEVADO); }
		public TerminalNode ELEVADO(int i) {
			return getToken(LaParser.ELEVADO, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LaParser.VIRGULA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmdLeia(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(LEIA);
			setState(290);
			match(ABREPAR);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELEVADO) {
				{
				{
				setState(291);
				match(ELEVADO);
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			identificador();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(298);
				match(VIRGULA);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELEVADO) {
					{
					{
					setState(299);
					match(ELEVADO);
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				identificador();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(FECHAPAR);
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

	public static class CmdEscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(LaParser.ESCREVA, 0); }
		public TerminalNode ABREPAR() { return getToken(LaParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LaParser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(LaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LaParser.VIRGULA, i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmdEscreva(this);
		}
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(ESCREVA);
			setState(314);
			match(ABREPAR);
			setState(315);
			expressao();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(316);
				match(VIRGULA);
				setState(317);
				expressao();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(FECHAPAR);
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

	public static class CmdSeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(LaParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(LaParser.ENTAO, 0); }
		public TerminalNode FIM_SE() { return getToken(LaParser.FIM_SE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> SENAO() { return getTokens(LaParser.SENAO); }
		public TerminalNode SENAO(int i) {
			return getToken(LaParser.SENAO, i);
		}
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmdSe(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(SE);
			setState(326);
			expressao();
			setState(327);
			match(ENTAO);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCREVA) | (1L << LEIA) | (1L << FACA) | (1L << RETORNE) | (1L << ENQUANTO) | (1L << CASO) | (1L << SE) | (1L << PARA) | (1L << IDENT) | (1L << ELEVADO))) != 0)) {
				{
				{
				setState(328);
				cmd();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SENAO) {
				{
				{
				setState(334);
				match(SENAO);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCREVA) | (1L << LEIA) | (1L << FACA) | (1L << RETORNE) | (1L << ENQUANTO) | (1L << CASO) | (1L << SE) | (1L << PARA) | (1L << IDENT) | (1L << ELEVADO))) != 0)) {
					{
					{
					setState(335);
					cmd();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			match(FIM_SE);
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

	public static class CmdCasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(LaParser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(LaParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(LaParser.FIM_CASO, 0); }
		public List<TerminalNode> SENAO() { return getTokens(LaParser.SENAO); }
		public TerminalNode SENAO(int i) {
			return getToken(LaParser.SENAO, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmdCaso(this);
		}
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(CASO);
			setState(349);
			exp_aritmetica();
			setState(350);
			match(SEJA);
			setState(351);
			selecao();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SENAO) {
				{
				{
				setState(352);
				match(SENAO);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCREVA) | (1L << LEIA) | (1L << FACA) | (1L << RETORNE) | (1L << ENQUANTO) | (1L << CASO) | (1L << SE) | (1L << PARA) | (1L << IDENT) | (1L << ELEVADO))) != 0)) {
					{
					{
					setState(353);
					cmd();
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(FIM_CASO);
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

	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(LaParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(LaParser.ATRIBUICAO, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(LaParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(LaParser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(LaParser.FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmdPara(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(PARA);
			setState(367);
			match(IDENT);
			setState(368);
			match(ATRIBUICAO);
			setState(369);
			exp_aritmetica();
			setState(370);
			match(ATE);
			setState(371);
			exp_aritmetica();
			setState(372);
			match(FACA);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCREVA) | (1L << LEIA) | (1L << FACA) | (1L << RETORNE) | (1L << ENQUANTO) | (1L << CASO) | (1L << SE) | (1L << PARA) | (1L << IDENT) | (1L << ELEVADO))) != 0)) {
				{
				{
				setState(373);
				cmd();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(FIM_PARA);
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

	public static class CmdEnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(LaParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(LaParser.FACA, 0); }
		public TerminalNode FIM_ENQUANTO() { return getToken(LaParser.FIM_ENQUANTO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmdEnquanto(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ENQUANTO);
			setState(382);
			expressao();
			setState(383);
			match(FACA);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCREVA) | (1L << LEIA) | (1L << FACA) | (1L << RETORNE) | (1L << ENQUANTO) | (1L << CASO) | (1L << SE) | (1L << PARA) | (1L << IDENT) | (1L << ELEVADO))) != 0)) {
				{
				{
				setState(384);
				cmd();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			match(FIM_ENQUANTO);
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

	public static class CmdFacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(LaParser.FACA, 0); }
		public TerminalNode ATE() { return getToken(LaParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmdFaca(this);
		}
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(FACA);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCREVA) | (1L << LEIA) | (1L << FACA) | (1L << RETORNE) | (1L << ENQUANTO) | (1L << CASO) | (1L << SE) | (1L << PARA) | (1L << IDENT) | (1L << ELEVADO))) != 0)) {
				{
				{
				setState(393);
				cmd();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(ATE);
			setState(400);
			expressao();
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

	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(LaParser.ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<TerminalNode> ELEVADO() { return getTokens(LaParser.ELEVADO); }
		public TerminalNode ELEVADO(int i) {
			return getToken(LaParser.ELEVADO, i);
		}
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmdAtribuicao(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELEVADO) {
				{
				{
				setState(402);
				match(ELEVADO);
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			identificador();
			setState(409);
			match(ATRIBUICAO);
			setState(410);
			expressao();
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

	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(LaParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LaParser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(LaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LaParser.VIRGULA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmdChamada(this);
		}
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(IDENT);
			setState(413);
			match(ABREPAR);
			setState(414);
			expressao();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(415);
				match(VIRGULA);
				setState(416);
				expressao();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
			match(FECHAPAR);
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

	public static class CmdRetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(LaParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmdRetorne(this);
		}
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(RETORNE);
			setState(425);
			expressao();
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

	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM_INT || _la==SUB) {
				{
				{
				setState(427);
				item_selecao();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LaParser.DOIS_PONTOS, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitItem_selecao(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			constantes();
			setState(434);
			match(DOIS_PONTOS);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCREVA) | (1L << LEIA) | (1L << FACA) | (1L << RETORNE) | (1L << ENQUANTO) | (1L << CASO) | (1L << SE) | (1L << PARA) | (1L << IDENT) | (1L << ELEVADO))) != 0)) {
				{
				{
				setState(435);
				cmd();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LaParser.VIRGULA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			numero_intervalo();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(442);
				match(VIRGULA);
				setState(443);
				numero_intervalo();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(LaParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(LaParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public List<TerminalNode> INTERVALO() { return getTokens(LaParser.INTERVALO); }
		public TerminalNode INTERVALO(int i) {
			return getToken(LaParser.INTERVALO, i);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB) {
				{
				{
				setState(449);
				op_unario();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(NUM_INT);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERVALO) {
				{
				{
				setState(456);
				match(INTERVALO);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB) {
					{
					{
					setState(457);
					op_unario();
					}
					}
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(463);
				match(NUM_INT);
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(LaParser.SUB, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(SUB);
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

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			termo();
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(472);
					op1();
					setState(473);
					termo();
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			fator();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV || _la==MULT) {
				{
				{
				setState(481);
				op2();
				setState(482);
				fator();
				}
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			parcela();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RESTO) {
				{
				{
				setState(490);
				op3();
				setState(491);
				parcela();
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Op1Context extends ParserRuleContext {
		public TerminalNode AD() { return getToken(LaParser.AD, 0); }
		public TerminalNode SUB() { return getToken(LaParser.SUB, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOp1(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !(_la==AD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(LaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LaParser.DIV, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOp2(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !(_la==DIV || _la==MULT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Op3Context extends ParserRuleContext {
		public TerminalNode RESTO() { return getToken(LaParser.RESTO, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOp3(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(RESTO);
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

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parcela);
		int _la;
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
			case SUB:
			case ELEVADO:
			case ABREPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB) {
					{
					{
					setState(504);
					op_unario();
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(510);
				parcela_unario();
				}
				break;
			case CADEIA:
			case E_COMERCIAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				parcela_nao_unario();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public List<TerminalNode> ELEVADO() { return getTokens(LaParser.ELEVADO); }
		public TerminalNode ELEVADO(int i) {
			return getToken(LaParser.ELEVADO, i);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(LaParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LaParser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(LaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LaParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LaParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parcela_unario);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELEVADO) {
					{
					{
					setState(514);
					match(ELEVADO);
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(IDENT);
				setState(522);
				match(ABREPAR);
				setState(523);
				expressao();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(524);
					match(VIRGULA);
					setState(525);
					expressao();
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
				match(FECHAPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(535);
				match(ABREPAR);
				setState(536);
				expressao();
				setState(537);
				match(FECHAPAR);
				}
				break;
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode E_COMERCIAL() { return getToken(LaParser.E_COMERCIAL, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LaParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parcela_nao_unario);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case E_COMERCIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(E_COMERCIAL);
				setState(542);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<Op_relacionalContext> op_relacional() {
			return getRuleContexts(Op_relacionalContext.class);
		}
		public Op_relacionalContext op_relacional(int i) {
			return getRuleContext(Op_relacionalContext.class,i);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			exp_aritmetica();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIF) | (1L << MENOR) | (1L << MENOR_IGUAL) | (1L << MAIOR) | (1L << MAIOR_IGUAL))) != 0)) {
				{
				{
				setState(547);
				op_relacional();
				setState(548);
				exp_aritmetica();
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(LaParser.IGUAL, 0); }
		public TerminalNode DIF() { return getToken(LaParser.DIF, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(LaParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(LaParser.MENOR_IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(LaParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(LaParser.MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIF) | (1L << MENOR) | (1L << MENOR_IGUAL) | (1L << MAIOR) | (1L << MAIOR_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			termo_logico();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(558);
				op_logico_1();
				setState(559);
				termo_logico();
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			fator_logico();
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(567);
				op_logico_2();
				setState(568);
				fator_logico();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public List<TerminalNode> NAO() { return getTokens(LaParser.NAO); }
		public TerminalNode NAO(int i) {
			return getToken(LaParser.NAO, i);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAO) {
				{
				{
				setState(575);
				match(NAO);
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(581);
			parcela_logica();
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

	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(LaParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(LaParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_logica);
		int _la;
		try {
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				_la = _input.LA(1);
				if ( !(_la==VERDADEIRO || _la==FALSO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IDENT:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
			case SUB:
			case ELEVADO:
			case E_COMERCIAL:
			case ABREPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				exp_relacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Op_logico_1Context extends ParserRuleContext {
		public TerminalNode OU() { return getToken(LaParser.OU, 0); }
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOp_logico_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOp_logico_1(this);
		}
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(OU);
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

	public static class Op_logico_2Context extends ParserRuleContext {
		public TerminalNode E() { return getToken(LaParser.E, 0); }
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOp_logico_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOp_logico_2(this);
		}
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(E);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u0252\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\7\3m\n\3\f\3\16\3p\13\3\3\4\3\4\5\4t\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0083\n\5\3\6\3\6\3\6\7\6"+
		"\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0093\n\7\f"+
		"\7\16\7\u0096\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1"+
		"\13\b\3\t\3\t\5\t\u00a5\n\t\3\n\3\n\3\13\3\13\5\13\u00ab\n\13\3\f\7\f"+
		"\u00ae\n\f\f\f\16\f\u00b1\13\f\3\f\3\f\3\r\3\r\3\16\3\16\7\16\u00b9\n"+
		"\16\f\16\16\16\u00bc\13\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00c4\n"+
		"\17\f\17\16\17\u00c7\13\17\3\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce"+
		"\13\17\3\17\7\17\u00d1\n\17\f\17\16\17\u00d4\13\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00db\n\17\f\17\16\17\u00de\13\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00e4\n\17\f\17\16\17\u00e7\13\17\3\17\7\17\u00ea\n\17\f\17\16\17\u00ed"+
		"\13\17\3\17\3\17\5\17\u00f1\n\17\3\20\7\20\u00f4\n\20\f\20\16\20\u00f7"+
		"\13\20\3\20\3\20\3\20\7\20\u00fc\n\20\f\20\16\20\u00ff\13\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u0107\n\21\f\21\16\21\u010a\13\21\3\22\7\22"+
		"\u010d\n\22\f\22\16\22\u0110\13\22\3\22\7\22\u0113\n\22\f\22\16\22\u0116"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0122\n"+
		"\23\3\24\3\24\3\24\7\24\u0127\n\24\f\24\16\24\u012a\13\24\3\24\3\24\3"+
		"\24\7\24\u012f\n\24\f\24\16\24\u0132\13\24\3\24\7\24\u0135\n\24\f\24\16"+
		"\24\u0138\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0141\n\25\f\25"+
		"\16\25\u0144\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u014c\n\26\f\26"+
		"\16\26\u014f\13\26\3\26\3\26\7\26\u0153\n\26\f\26\16\26\u0156\13\26\7"+
		"\26\u0158\n\26\f\26\16\26\u015b\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\7\27\u0165\n\27\f\27\16\27\u0168\13\27\7\27\u016a\n\27\f\27\16"+
		"\27\u016d\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u0179\n\30\f\30\16\30\u017c\13\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31"+
		"\u0184\n\31\f\31\16\31\u0187\13\31\3\31\3\31\3\32\3\32\7\32\u018d\n\32"+
		"\f\32\16\32\u0190\13\32\3\32\3\32\3\32\3\33\7\33\u0196\n\33\f\33\16\33"+
		"\u0199\13\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u01a4\n"+
		"\34\f\34\16\34\u01a7\13\34\3\34\3\34\3\35\3\35\3\35\3\36\7\36\u01af\n"+
		"\36\f\36\16\36\u01b2\13\36\3\37\3\37\3\37\7\37\u01b7\n\37\f\37\16\37\u01ba"+
		"\13\37\3 \3 \3 \7 \u01bf\n \f \16 \u01c2\13 \3!\7!\u01c5\n!\f!\16!\u01c8"+
		"\13!\3!\3!\3!\7!\u01cd\n!\f!\16!\u01d0\13!\3!\7!\u01d3\n!\f!\16!\u01d6"+
		"\13!\3\"\3\"\3#\3#\3#\3#\7#\u01de\n#\f#\16#\u01e1\13#\3$\3$\3$\3$\7$\u01e7"+
		"\n$\f$\16$\u01ea\13$\3%\3%\3%\3%\7%\u01f0\n%\f%\16%\u01f3\13%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\7)\u01fc\n)\f)\16)\u01ff\13)\3)\3)\5)\u0203\n)\3*\7*\u0206"+
		"\n*\f*\16*\u0209\13*\3*\3*\3*\3*\3*\3*\7*\u0211\n*\f*\16*\u0214\13*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\5*\u021e\n*\3+\3+\3+\5+\u0223\n+\3,\3,\3,\3,\7"+
		",\u0229\n,\f,\16,\u022c\13,\3-\3-\3.\3.\3.\3.\7.\u0234\n.\f.\16.\u0237"+
		"\13.\3/\3/\3/\3/\7/\u023d\n/\f/\16/\u0240\13/\3\60\7\60\u0243\n\60\f\60"+
		"\16\60\u0246\13\60\3\60\3\60\3\61\3\61\5\61\u024c\n\61\3\62\3\62\3\63"+
		"\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\b\5\2\17\17\"\"$%\4\2&\')+\3\2\63\64"+
		"\4\2\65\65\67\67\3\2,\61\3\2&\'\2\u0264\2f\3\2\2\2\4n\3\2\2\2\6s\3\2\2"+
		"\2\b\u0082\3\2\2\2\n\u0084\3\2\2\2\f\u008f\3\2\2\2\16\u009f\3\2\2\2\20"+
		"\u00a4\3\2\2\2\22\u00a6\3\2\2\2\24\u00aa\3\2\2\2\26\u00af\3\2\2\2\30\u00b4"+
		"\3\2\2\2\32\u00b6\3\2\2\2\34\u00f0\3\2\2\2\36\u00f5\3\2\2\2 \u0103\3\2"+
		"\2\2\"\u010e\3\2\2\2$\u0121\3\2\2\2&\u0123\3\2\2\2(\u013b\3\2\2\2*\u0147"+
		"\3\2\2\2,\u015e\3\2\2\2.\u0170\3\2\2\2\60\u017f\3\2\2\2\62\u018a\3\2\2"+
		"\2\64\u0197\3\2\2\2\66\u019e\3\2\2\28\u01aa\3\2\2\2:\u01b0\3\2\2\2<\u01b3"+
		"\3\2\2\2>\u01bb\3\2\2\2@\u01c6\3\2\2\2B\u01d7\3\2\2\2D\u01d9\3\2\2\2F"+
		"\u01e2\3\2\2\2H\u01eb\3\2\2\2J\u01f4\3\2\2\2L\u01f6\3\2\2\2N\u01f8\3\2"+
		"\2\2P\u0202\3\2\2\2R\u021d\3\2\2\2T\u0222\3\2\2\2V\u0224\3\2\2\2X\u022d"+
		"\3\2\2\2Z\u022f\3\2\2\2\\\u0238\3\2\2\2^\u0244\3\2\2\2`\u024b\3\2\2\2"+
		"b\u024d\3\2\2\2d\u024f\3\2\2\2fg\5\4\3\2gh\7\3\2\2hi\5\"\22\2ij\7\4\2"+
		"\2j\3\3\2\2\2km\5\6\4\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\5\3\2"+
		"\2\2pn\3\2\2\2qt\5\b\5\2rt\5\34\17\2sq\3\2\2\2sr\3\2\2\2t\7\3\2\2\2uv"+
		"\7\5\2\2v\u0083\5\n\6\2wx\7#\2\2xy\7(\2\2yz\7<\2\2z{\5\22\n\2{|\7,\2\2"+
		"|}\5\30\r\2}\u0083\3\2\2\2~\177\7\6\2\2\177\u0080\7(\2\2\u0080\u0081\7"+
		"<\2\2\u0081\u0083\5\20\t\2\u0082u\3\2\2\2\u0082w\3\2\2\2\u0082~\3\2\2"+
		"\2\u0083\t\3\2\2\2\u0084\u0089\5\f\7\2\u0085\u0086\7=\2\2\u0086\u0088"+
		"\5\f\7\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7<"+
		"\2\2\u008d\u008e\5\20\t\2\u008e\13\3\2\2\2\u008f\u0094\7(\2\2\u0090\u0091"+
		"\7:\2\2\u0091\u0093\7(\2\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\5\16\b\2\u0098\r\3\2\2\2\u0099\u009a\7@\2\2\u009a\u009b"+
		"\5D#\2\u009b\u009c\7A\2\2\u009c\u009e\3\2\2\2\u009d\u0099\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\17\3\2\2"+
		"\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\5\32\16\2\u00a3\u00a5\5\26\f\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\21\3\2\2\2\u00a6\u00a7\t\2\2"+
		"\2\u00a7\23\3\2\2\2\u00a8\u00ab\5\22\n\2\u00a9\u00ab\7(\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\25\3\2\2\2\u00ac\u00ae\78\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\5\24\13\2\u00b3"+
		"\27\3\2\2\2\u00b4\u00b5\t\3\2\2\u00b5\31\3\2\2\2\u00b6\u00ba\7\35\2\2"+
		"\u00b7\u00b9\5\n\6\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\7\36\2\2\u00be\33\3\2\2\2\u00bf\u00c0\7\37\2\2\u00c0\u00c1\7(\2"+
		"\2\u00c1\u00c5\7>\2\2\u00c2\u00c4\5 \21\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00cc\7?\2\2\u00c9\u00cb\5\b\5\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00d2\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\5$\23\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00f1\7 \2\2\u00d6\u00d7\7\33"+
		"\2\2\u00d7\u00d8\7(\2\2\u00d8\u00dc\7>\2\2\u00d9\u00db\5 \21\2\u00da\u00d9"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7?\2\2\u00e0\u00e1\7<\2"+
		"\2\u00e1\u00e5\5\26\f\2\u00e2\u00e4\5\b\5\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00eb\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\5$\23\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\34\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00bf\3\2\2\2\u00f0\u00d6\3\2\2\2\u00f1\35\3\2\2\2\u00f2\u00f4\7!\2\2"+
		"\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fd\5\f\7\2\u00f9"+
		"\u00fa\7=\2\2\u00fa\u00fc\5\f\7\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\7<\2\2\u0101\u0102\5\26\f\2\u0102\37\3\2\2"+
		"\2\u0103\u0108\5\36\20\2\u0104\u0105\7=\2\2\u0105\u0107\5\36\20\2\u0106"+
		"\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109!\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\5\b\5\2\u010c\u010b"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0114\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\5$\23\2\u0112\u0111\3\2"+
		"\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"#\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0122\5&\24\2\u0118\u0122\5(\25\2"+
		"\u0119\u0122\5*\26\2\u011a\u0122\5,\27\2\u011b\u0122\5.\30\2\u011c\u0122"+
		"\5\60\31\2\u011d\u0122\5\62\32\2\u011e\u0122\5\64\33\2\u011f\u0122\5\66"+
		"\34\2\u0120\u0122\58\35\2\u0121\u0117\3\2\2\2\u0121\u0118\3\2\2\2\u0121"+
		"\u0119\3\2\2\2\u0121\u011a\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011c\3\2"+
		"\2\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0120\3\2\2\2\u0122%\3\2\2\2\u0123\u0124\7\f\2\2\u0124\u0128\7>\2\2\u0125"+
		"\u0127\78\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u0136\5\f\7\2\u012c\u0130\7=\2\2\u012d\u012f\78\2\2\u012e\u012d\3\2\2"+
		"\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\5\f\7\2\u0134\u012c\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7?\2\2\u013a\'\3\2\2\2\u013b\u013c"+
		"\7\13\2\2\u013c\u013d\7>\2\2\u013d\u0142\5Z.\2\u013e\u013f\7=\2\2\u013f"+
		"\u0141\5Z.\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2"+
		"\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146"+
		"\7?\2\2\u0146)\3\2\2\2\u0147\u0148\7\26\2\2\u0148\u0149\5Z.\2\u0149\u014d"+
		"\7\21\2\2\u014a\u014c\5$\23\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2"+
		"\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0159\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0154\7\27\2\2\u0151\u0153\5$\23\2\u0152\u0151\3\2\2\2"+
		"\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0150\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u015d\7\30\2\2\u015d+\3\2\2\2\u015e\u015f\7\24\2\2\u015f\u0160"+
		"\5D#\2\u0160\u0161\7\16\2\2\u0161\u016b\5:\36\2\u0162\u0166\7\27\2\2\u0163"+
		"\u0165\5$\23\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u0162\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7\25\2\2\u016f"+
		"-\3\2\2\2\u0170\u0171\7\31\2\2\u0171\u0172\7(\2\2\u0172\u0173\7\62\2\2"+
		"\u0173\u0174\5D#\2\u0174\u0175\7\t\2\2\u0175\u0176\5D#\2\u0176\u017a\7"+
		"\r\2\2\u0177\u0179\5$\23\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017d\u017e\7\32\2\2\u017e/\3\2\2\2\u017f\u0180\7\22\2\2\u0180\u0181"+
		"\5Z.\2\u0181\u0185\7\r\2\2\u0182\u0184\5$\23\2\u0183\u0182\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7\23\2\2\u0189\61\3\2\2\2\u018a\u018e"+
		"\7\r\2\2\u018b\u018d\5$\23\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0191\u0192\7\t\2\2\u0192\u0193\5Z.\2\u0193\63\3\2\2\2\u0194\u0196"+
		"\78\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\5\f"+
		"\7\2\u019b\u019c\7\62\2\2\u019c\u019d\5Z.\2\u019d\65\3\2\2\2\u019e\u019f"+
		"\7(\2\2\u019f\u01a0\7>\2\2\u01a0\u01a5\5Z.\2\u01a1\u01a2\7=\2\2\u01a2"+
		"\u01a4\5Z.\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2"+
		"\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9"+
		"\7?\2\2\u01a9\67\3\2\2\2\u01aa\u01ab\7\20\2\2\u01ab\u01ac\5Z.\2\u01ac"+
		"9\3\2\2\2\u01ad\u01af\5<\37\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2"+
		"\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1;\3\2\2\2\u01b2\u01b0\3"+
		"\2\2\2\u01b3\u01b4\5> \2\u01b4\u01b8\7<\2\2\u01b5\u01b7\5$\23\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9=\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01c0\5@!\2\u01bc\u01bd"+
		"\7=\2\2\u01bd\u01bf\5@!\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1?\3\2\2\2\u01c2\u01c0\3\2\2\2"+
		"\u01c3\u01c5\5B\"\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9"+
		"\u01d4\7*\2\2\u01ca\u01ce\7;\2\2\u01cb\u01cd\5B\"\2\u01cc\u01cb\3\2\2"+
		"\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1"+
		"\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d3\7*\2\2\u01d2\u01ca\3\2\2\2\u01d3"+
		"\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5A\3\2\2\2"+
		"\u01d6\u01d4\3\2\2\2\u01d7\u01d8\7\64\2\2\u01d8C\3\2\2\2\u01d9\u01df\5"+
		"F$\2\u01da\u01db\5J&\2\u01db\u01dc\5F$\2\u01dc\u01de\3\2\2\2\u01dd\u01da"+
		"\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"E\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e8\5H%\2\u01e3\u01e4\5L\'\2\u01e4"+
		"\u01e5\5H%\2\u01e5\u01e7\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e7\u01ea\3\2\2"+
		"\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9G\3\2\2\2\u01ea\u01e8"+
		"\3\2\2\2\u01eb\u01f1\5P)\2\u01ec\u01ed\5N(\2\u01ed\u01ee\5P)\2\u01ee\u01f0"+
		"\3\2\2\2\u01ef\u01ec\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2I\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\t\4\2\2"+
		"\u01f5K\3\2\2\2\u01f6\u01f7\t\5\2\2\u01f7M\3\2\2\2\u01f8\u01f9\7\66\2"+
		"\2\u01f9O\3\2\2\2\u01fa\u01fc\5B\"\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3"+
		"\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u0200\u0203\5R*\2\u0201\u0203\5T+\2\u0202\u01fd\3\2\2\2"+
		"\u0202\u0201\3\2\2\2\u0203Q\3\2\2\2\u0204\u0206\78\2\2\u0205\u0204\3\2"+
		"\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u021e\5\f\7\2\u020b\u020c\7("+
		"\2\2\u020c\u020d\7>\2\2\u020d\u0212\5Z.\2\u020e\u020f\7=\2\2\u020f\u0211"+
		"\5Z.\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7?"+
		"\2\2\u0216\u021e\3\2\2\2\u0217\u021e\7*\2\2\u0218\u021e\7+\2\2\u0219\u021a"+
		"\7>\2\2\u021a\u021b\5Z.\2\u021b\u021c\7?\2\2\u021c\u021e\3\2\2\2\u021d"+
		"\u0207\3\2\2\2\u021d\u020b\3\2\2\2\u021d\u0217\3\2\2\2\u021d\u0218\3\2"+
		"\2\2\u021d\u0219\3\2\2\2\u021eS\3\2\2\2\u021f\u0220\79\2\2\u0220\u0223"+
		"\5\f\7\2\u0221\u0223\7)\2\2\u0222\u021f\3\2\2\2\u0222\u0221\3\2\2\2\u0223"+
		"U\3\2\2\2\u0224\u022a\5D#\2\u0225\u0226\5X-\2\u0226\u0227\5D#\2\u0227"+
		"\u0229\3\2\2\2\u0228\u0225\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022bW\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e"+
		"\t\6\2\2\u022eY\3\2\2\2\u022f\u0235\5\\/\2\u0230\u0231\5b\62\2\u0231\u0232"+
		"\5\\/\2\u0232\u0234\3\2\2\2\u0233\u0230\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236[\3\2\2\2\u0237\u0235\3\2\2\2"+
		"\u0238\u023e\5^\60\2\u0239\u023a\5d\63\2\u023a\u023b\5^\60\2\u023b\u023d"+
		"\3\2\2\2\u023c\u0239\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f]\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0243\7\n\2\2"+
		"\u0242\u0241\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245"+
		"\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\5`\61\2\u0248"+
		"_\3\2\2\2\u0249\u024c\t\7\2\2\u024a\u024c\5V,\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024a\3\2\2\2\u024ca\3\2\2\2\u024d\u024e\7\b\2\2\u024ec\3\2\2\2\u024f"+
		"\u0250\7\7\2\2\u0250e\3\2\2\2;ns\u0082\u0089\u0094\u009f\u00a4\u00aa\u00af"+
		"\u00ba\u00c5\u00cc\u00d2\u00dc\u00e5\u00eb\u00f0\u00f5\u00fd\u0108\u010e"+
		"\u0114\u0121\u0128\u0130\u0136\u0142\u014d\u0154\u0159\u0166\u016b\u017a"+
		"\u0185\u018e\u0197\u01a5\u01b0\u01b8\u01c0\u01c6\u01ce\u01d4\u01df\u01e8"+
		"\u01f1\u01fd\u0202\u0207\u0212\u021d\u0222\u022a\u0235\u023e\u0244\u024b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}