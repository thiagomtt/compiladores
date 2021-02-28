// Generated from br/ufscar/dc/compiladores/la/lexico/LaLexer.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.la.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaLexer extends Lexer {
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
		ATRIBUICAO=48, AD=49, SUB=50, DIV=51, RESTO=52, MULT=53, OU_LOGICO=54, 
		E_LOGICO=55, PONTO=56, RETICENCIAS=57, DOIS_PONTOS=58, VIRGULA=59, ABREPAR=60, 
		FECHAPAR=61, ABRECOL=62, FECHACOL=63, COMENTARIO=64, WS=65, COMENTARIO_ERRADO=66, 
		CADEIA_ERRADA=67, ERRO=68;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALGORITMO", "FIM_ALGORITMO", "DECLARE", "TIPO", "E", "OU", "ATE", "NAO", 
			"ESCREVA", "LEIA", "FACA", "SEJA", "LOGICO", "RETORNE", "ENTAO", "ENQUANTO", 
			"FIM_ENQUANTO", "CASO", "FIM_CASO", "SE", "SENAO", "FIM_SE", "PARA", 
			"FIM_PARA", "FUNCAO", "FIM_FUNCAO", "REGISTRO", "FIM_REGISTRO", "PROCEDIMENTO", 
			"FIM_PROCEDIMENTO", "VAR", "LITERAL", "CONSTANTE", "INTEIRO", "REAL", 
			"VERDADEIRO", "FALSO", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "IGUAL", 
			"DIF", "MENOR", "MENOR_IGUAL", "MAIOR", "MAIOR_IGUAL", "ATRIBUICAO", 
			"AD", "SUB", "DIV", "RESTO", "MULT", "OU_LOGICO", "E_LOGICO", "PONTO", 
			"RETICENCIAS", "DOIS_PONTOS", "VIRGULA", "ABREPAR", "FECHAPAR", "ABRECOL", 
			"FECHACOL", "COMENTARIO", "WS", "COMENTARIO_ERRADO", "CADEIA_ERRADA", 
			"ERRO"
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
			"AD", "SUB", "DIV", "RESTO", "MULT", "OU_LOGICO", "E_LOGICO", "PONTO", 
			"RETICENCIAS", "DOIS_PONTOS", "VIRGULA", "ABREPAR", "FECHAPAR", "ABRECOL", 
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


	public LaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u0213\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\7\'\u01a8\n\'\f\'\16\'\u01ab"+
		"\13\'\3(\3(\7(\u01af\n(\f(\16(\u01b2\13(\3(\3(\3)\6)\u01b7\n)\r)\16)\u01b8"+
		"\3*\6*\u01bc\n*\r*\16*\u01bd\3*\3*\6*\u01c2\n*\r*\16*\u01c3\3+\3+\3,\3"+
		",\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;"+
		"\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\7A\u01f9\nA\fA\16A\u01fc\13A\3"+
		"A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3D\3D\7D\u020b\nD\fD\16D\u020e\13D\3D"+
		"\3D\3E\3E\2\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F"+
		"\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f$$\4\2\f\f\177\177\5\2\13\f\17"+
		"\17\"\"\3\2$$\2\u0219\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008b"+
		"\3\2\2\2\5\u0095\3\2\2\2\7\u00a3\3\2\2\2\t\u00ab\3\2\2\2\13\u00b0\3\2"+
		"\2\2\r\u00b2\3\2\2\2\17\u00b5\3\2\2\2\21\u00b9\3\2\2\2\23\u00bd\3\2\2"+
		"\2\25\u00c5\3\2\2\2\27\u00ca\3\2\2\2\31\u00cf\3\2\2\2\33\u00d4\3\2\2\2"+
		"\35\u00db\3\2\2\2\37\u00e3\3\2\2\2!\u00e9\3\2\2\2#\u00f2\3\2\2\2%\u00ff"+
		"\3\2\2\2\'\u0104\3\2\2\2)\u010d\3\2\2\2+\u0110\3\2\2\2-\u0116\3\2\2\2"+
		"/\u011d\3\2\2\2\61\u0122\3\2\2\2\63\u012b\3\2\2\2\65\u0132\3\2\2\2\67"+
		"\u013d\3\2\2\29\u0146\3\2\2\2;\u0153\3\2\2\2=\u0160\3\2\2\2?\u0171\3\2"+
		"\2\2A\u0175\3\2\2\2C\u017d\3\2\2\2E\u0187\3\2\2\2G\u018f\3\2\2\2I\u0194"+
		"\3\2\2\2K\u019f\3\2\2\2M\u01a5\3\2\2\2O\u01ac\3\2\2\2Q\u01b6\3\2\2\2S"+
		"\u01bb\3\2\2\2U\u01c5\3\2\2\2W\u01c7\3\2\2\2Y\u01ca\3\2\2\2[\u01cc\3\2"+
		"\2\2]\u01cf\3\2\2\2_\u01d1\3\2\2\2a\u01d4\3\2\2\2c\u01d7\3\2\2\2e\u01d9"+
		"\3\2\2\2g\u01db\3\2\2\2i\u01dd\3\2\2\2k\u01df\3\2\2\2m\u01e1\3\2\2\2o"+
		"\u01e3\3\2\2\2q\u01e5\3\2\2\2s\u01e7\3\2\2\2u\u01ea\3\2\2\2w\u01ec\3\2"+
		"\2\2y\u01ee\3\2\2\2{\u01f0\3\2\2\2}\u01f2\3\2\2\2\177\u01f4\3\2\2\2\u0081"+
		"\u01f6\3\2\2\2\u0083\u0201\3\2\2\2\u0085\u0205\3\2\2\2\u0087\u0208\3\2"+
		"\2\2\u0089\u0211\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7n\2\2\u008d\u008e"+
		"\7i\2\2\u008e\u008f\7q\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7v\2\2\u0092\u0093\7o\2\2\u0093\u0094\7q\2\2\u0094\4\3\2\2\2\u0095"+
		"\u0096\7h\2\2\u0096\u0097\7k\2\2\u0097\u0098\7o\2\2\u0098\u0099\7a\2\2"+
		"\u0099\u009a\7c\2\2\u009a\u009b\7n\2\2\u009b\u009c\7i\2\2\u009c\u009d"+
		"\7q\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\u00a1\7o\2\2\u00a1\u00a2\7q\2\2\u00a2\6\3\2\2\2\u00a3\u00a4\7f\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7c\2\2"+
		"\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\b\3\2\2\2\u00ab\u00ac\7v"+
		"\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7q\2\2\u00af\n"+
		"\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\f\3\2\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4"+
		"\7w\2\2\u00b4\16\3\2\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc"+
		"\7q\2\2\u00bc\22\3\2\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0"+
		"\7e\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7x\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\24\3\2\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\u00c8\7k\2\2\u00c8\u00c9\7c\2\2\u00c9\26\3\2\2\2\u00ca\u00cb\7h\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce\7c\2\2\u00ce\30\3\2\2\2\u00cf"+
		"\u00d0\7u\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7l\2\2\u00d2\u00d3\7c\2\2"+
		"\u00d3\32\3\2\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7"+
		"i\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7q\2\2\u00da\34"+
		"\3\2\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7v\2\2\u00de"+
		"\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7g\2\2"+
		"\u00e2\36\3\2\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7"+
		"v\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7q\2\2\u00e8 \3\2\2\2\u00e9\u00ea"+
		"\7g\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7s\2\2\u00ec\u00ed\7w\2\2\u00ed"+
		"\u00ee\7c\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7q\2\2"+
		"\u00f1\"\3\2\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7o"+
		"\2\2\u00f5\u00f6\7a\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9"+
		"\7s\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7p\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7q\2\2\u00fe$\3\2\2\2\u00ff\u0100\7e\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7u\2\2\u0102\u0103\7q\2\2\u0103&\3\2\2\2\u0104"+
		"\u0105\7h\2\2\u0105\u0106\7k\2\2\u0106\u0107\7o\2\2\u0107\u0108\7a\2\2"+
		"\u0108\u0109\7e\2\2\u0109\u010a\7c\2\2\u010a\u010b\7u\2\2\u010b\u010c"+
		"\7q\2\2\u010c(\3\2\2\2\u010d\u010e\7u\2\2\u010e\u010f\7g\2\2\u010f*\3"+
		"\2\2\2\u0110\u0111\7u\2\2\u0111\u0112\7g\2\2\u0112\u0113\7p\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u0115\7q\2\2\u0115,\3\2\2\2\u0116\u0117\7h\2\2\u0117"+
		"\u0118\7k\2\2\u0118\u0119\7o\2\2\u0119\u011a\7a\2\2\u011a\u011b\7u\2\2"+
		"\u011b\u011c\7g\2\2\u011c.\3\2\2\2\u011d\u011e\7r\2\2\u011e\u011f\7c\2"+
		"\2\u011f\u0120\7t\2\2\u0120\u0121\7c\2\2\u0121\60\3\2\2\2\u0122\u0123"+
		"\7h\2\2\u0123\u0124\7k\2\2\u0124\u0125\7o\2\2\u0125\u0126\7a\2\2\u0126"+
		"\u0127\7r\2\2\u0127\u0128\7c\2\2\u0128\u0129\7t\2\2\u0129\u012a\7c\2\2"+
		"\u012a\62\3\2\2\2\u012b\u012c\7h\2\2\u012c\u012d\7w\2\2\u012d\u012e\7"+
		"p\2\2\u012e\u012f\7e\2\2\u012f\u0130\7c\2\2\u0130\u0131\7q\2\2\u0131\64"+
		"\3\2\2\2\u0132\u0133\7h\2\2\u0133\u0134\7k\2\2\u0134\u0135\7o\2\2\u0135"+
		"\u0136\7a\2\2\u0136\u0137\7h\2\2\u0137\u0138\7w\2\2\u0138\u0139\7p\2\2"+
		"\u0139\u013a\7e\2\2\u013a\u013b\7c\2\2\u013b\u013c\7q\2\2\u013c\66\3\2"+
		"\2\2\u013d\u013e\7t\2\2\u013e\u013f\7g\2\2\u013f\u0140\7i\2\2\u0140\u0141"+
		"\7k\2\2\u0141\u0142\7u\2\2\u0142\u0143\7v\2\2\u0143\u0144\7t\2\2\u0144"+
		"\u0145\7q\2\2\u01458\3\2\2\2\u0146\u0147\7h\2\2\u0147\u0148\7k\2\2\u0148"+
		"\u0149\7o\2\2\u0149\u014a\7a\2\2\u014a\u014b\7t\2\2\u014b\u014c\7g\2\2"+
		"\u014c\u014d\7i\2\2\u014d\u014e\7k\2\2\u014e\u014f\7u\2\2\u014f\u0150"+
		"\7v\2\2\u0150\u0151\7t\2\2\u0151\u0152\7q\2\2\u0152:\3\2\2\2\u0153\u0154"+
		"\7r\2\2\u0154\u0155\7t\2\2\u0155\u0156\7q\2\2\u0156\u0157\7e\2\2\u0157"+
		"\u0158\7g\2\2\u0158\u0159\7f\2\2\u0159\u015a\7k\2\2\u015a\u015b\7o\2\2"+
		"\u015b\u015c\7g\2\2\u015c\u015d\7p\2\2\u015d\u015e\7v\2\2\u015e\u015f"+
		"\7q\2\2\u015f<\3\2\2\2\u0160\u0161\7h\2\2\u0161\u0162\7k\2\2\u0162\u0163"+
		"\7o\2\2\u0163\u0164\7a\2\2\u0164\u0165\7r\2\2\u0165\u0166\7t\2\2\u0166"+
		"\u0167\7q\2\2\u0167\u0168\7e\2\2\u0168\u0169\7g\2\2\u0169\u016a\7f\2\2"+
		"\u016a\u016b\7k\2\2\u016b\u016c\7o\2\2\u016c\u016d\7g\2\2\u016d\u016e"+
		"\7p\2\2\u016e\u016f\7v\2\2\u016f\u0170\7q\2\2\u0170>\3\2\2\2\u0171\u0172"+
		"\7x\2\2\u0172\u0173\7c\2\2\u0173\u0174\7t\2\2\u0174@\3\2\2\2\u0175\u0176"+
		"\7n\2\2\u0176\u0177\7k\2\2\u0177\u0178\7v\2\2\u0178\u0179\7g\2\2\u0179"+
		"\u017a\7t\2\2\u017a\u017b\7c\2\2\u017b\u017c\7n\2\2\u017cB\3\2\2\2\u017d"+
		"\u017e\7e\2\2\u017e\u017f\7q\2\2\u017f\u0180\7p\2\2\u0180\u0181\7u\2\2"+
		"\u0181\u0182\7v\2\2\u0182\u0183\7c\2\2\u0183\u0184\7p\2\2\u0184\u0185"+
		"\7v\2\2\u0185\u0186\7g\2\2\u0186D\3\2\2\2\u0187\u0188\7k\2\2\u0188\u0189"+
		"\7p\2\2\u0189\u018a\7v\2\2\u018a\u018b\7g\2\2\u018b\u018c\7k\2\2\u018c"+
		"\u018d\7t\2\2\u018d\u018e\7q\2\2\u018eF\3\2\2\2\u018f\u0190\7t\2\2\u0190"+
		"\u0191\7g\2\2\u0191\u0192\7c\2\2\u0192\u0193\7n\2\2\u0193H\3\2\2\2\u0194"+
		"\u0195\7x\2\2\u0195\u0196\7g\2\2\u0196\u0197\7t\2\2\u0197\u0198\7f\2\2"+
		"\u0198\u0199\7c\2\2\u0199\u019a\7f\2\2\u019a\u019b\7g\2\2\u019b\u019c"+
		"\7k\2\2\u019c\u019d\7t\2\2\u019d\u019e\7q\2\2\u019eJ\3\2\2\2\u019f\u01a0"+
		"\7h\2\2\u01a0\u01a1\7c\2\2\u01a1\u01a2\7n\2\2\u01a2\u01a3\7u\2\2\u01a3"+
		"\u01a4\7q\2\2\u01a4L\3\2\2\2\u01a5\u01a9\t\2\2\2\u01a6\u01a8\t\3\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aaN\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01b0\7$\2\2\u01ad\u01af"+
		"\n\4\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7$"+
		"\2\2\u01b4P\3\2\2\2\u01b5\u01b7\4\62;\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9R\3\2\2\2\u01ba"+
		"\u01bc\4\62;\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\7\60\2\2\u01c0"+
		"\u01c2\4\62;\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4T\3\2\2\2\u01c5\u01c6\7?\2\2\u01c6V\3\2"+
		"\2\2\u01c7\u01c8\7>\2\2\u01c8\u01c9\7@\2\2\u01c9X\3\2\2\2\u01ca\u01cb"+
		"\7>\2\2\u01cbZ\3\2\2\2\u01cc\u01cd\7>\2\2\u01cd\u01ce\7?\2\2\u01ce\\\3"+
		"\2\2\2\u01cf\u01d0\7@\2\2\u01d0^\3\2\2\2\u01d1\u01d2\7@\2\2\u01d2\u01d3"+
		"\7?\2\2\u01d3`\3\2\2\2\u01d4\u01d5\7>\2\2\u01d5\u01d6\7/\2\2\u01d6b\3"+
		"\2\2\2\u01d7\u01d8\7-\2\2\u01d8d\3\2\2\2\u01d9\u01da\7/\2\2\u01daf\3\2"+
		"\2\2\u01db\u01dc\7\61\2\2\u01dch\3\2\2\2\u01dd\u01de\7\'\2\2\u01dej\3"+
		"\2\2\2\u01df\u01e0\7,\2\2\u01e0l\3\2\2\2\u01e1\u01e2\7`\2\2\u01e2n\3\2"+
		"\2\2\u01e3\u01e4\7(\2\2\u01e4p\3\2\2\2\u01e5\u01e6\7\60\2\2\u01e6r\3\2"+
		"\2\2\u01e7\u01e8\7\60\2\2\u01e8\u01e9\7\60\2\2\u01e9t\3\2\2\2\u01ea\u01eb"+
		"\7<\2\2\u01ebv\3\2\2\2\u01ec\u01ed\7.\2\2\u01edx\3\2\2\2\u01ee\u01ef\7"+
		"*\2\2\u01efz\3\2\2\2\u01f0\u01f1\7+\2\2\u01f1|\3\2\2\2\u01f2\u01f3\7]"+
		"\2\2\u01f3~\3\2\2\2\u01f4\u01f5\7_\2\2\u01f5\u0080\3\2\2\2\u01f6\u01fa"+
		"\7}\2\2\u01f7\u01f9\n\5\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fd\u01fe\7\177\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\bA\2\2\u0200"+
		"\u0082\3\2\2\2\u0201\u0202\t\6\2\2\u0202\u0203\3\2\2\2\u0203\u0204\bB"+
		"\2\2\u0204\u0084\3\2\2\2\u0205\u0206\7}\2\2\u0206\u0207\13\2\2\2\u0207"+
		"\u0086\3\2\2\2\u0208\u020c\7$\2\2\u0209\u020b\n\7\2\2\u020a\u0209\3\2"+
		"\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7\f\2\2\u0210\u0088\3\2"+
		"\2\2\u0211\u0212\13\2\2\2\u0212\u008a\3\2\2\2\n\2\u01a9\u01b0\u01b8\u01bd"+
		"\u01c3\u01fa\u020c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}