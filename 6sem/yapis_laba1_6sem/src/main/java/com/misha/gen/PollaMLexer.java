// Generated from C:/Users/����/IdeaProjectsM/YapisParser/src/main/resources\PollaM.g4 by ANTLR 4.9.2
package com.misha.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PollaMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, DEF=2, VOID=3, IF=4, ELSE=5, WHILE=6, FOR=7, RETURN=8, FROM=9, 
		SET=10, ELEMENT=11, VAR=12, PRINT=13, SIZE=14, CLEAR=15, ADD=16, REMOVE=17, 
		ID=18, STRING=19, NUMBER=20, COLON=21, SEMICOLON=22, DOT=23, COMMA=24, 
		ASSIGN=25, UNION=26, DIFERENCE=27, INTERSECTION=28, SYMMETRIC_DIFFERENCE=29, 
		EQUALS=30, NOT_EQUALS=31, GT_EQ=32, LT_EQ=33, GT=34, LT=35, OPEN_BRACKET=36, 
		CLOSE_BRACKET=37, OPEN_CURLY_BRACKET=38, CLOSE_CURLY_BRACKET=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "DEF", "VOID", "IF", "ELSE", "WHILE", "FOR", "RETURN", "FROM", 
			"SET", "ELEMENT", "VAR", "PRINT", "SIZE", "CLEAR", "ADD", "REMOVE", "ID", 
			"STRING", "NUMBER", "COLON", "SEMICOLON", "DOT", "COMMA", "ASSIGN", "UNION", 
			"DIFERENCE", "INTERSECTION", "SYMMETRIC_DIFFERENCE", "EQUALS", "NOT_EQUALS", 
			"GT_EQ", "LT_EQ", "GT", "LT", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLY_BRACKET", 
			"CLOSE_CURLY_BRACKET", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'def'", "'void'", "'if'", "'else'", "'while'", "'for'", 
			"'return'", "'from'", "'set'", "'element'", "'var'", "'print'", "'size'", 
			"'clear'", "'add'", "'remove'", null, null, null, "':'", "';'", "'.'", 
			"','", "'='", "'+'", "'-'", "'&'", "'^'", "'=='", "'!='", "'>='", "'<='", 
			"'>'", "'<'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "DEF", "VOID", "IF", "ELSE", "WHILE", "FOR", "RETURN", 
			"FROM", "SET", "ELEMENT", "VAR", "PRINT", "SIZE", "CLEAR", "ADD", "REMOVE", 
			"ID", "STRING", "NUMBER", "COLON", "SEMICOLON", "DOT", "COMMA", "ASSIGN", 
			"UNION", "DIFERENCE", "INTERSECTION", "SYMMETRIC_DIFFERENCE", "EQUALS", 
			"NOT_EQUALS", "GT_EQ", "LT_EQ", "GT", "LT", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "WS"
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


	public PollaMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PollaM.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\6\23\u00ad\n\23\r\23\16\23\u00ae\3\24\3\24\6"+
		"\24\u00b3\n\24\r\24\16\24\u00b4\3\24\3\24\3\25\3\25\5\25\u00bb\n\25\3"+
		"\25\3\25\7\25\u00bf\n\25\f\25\16\25\u00c2\13\25\5\25\u00c4\n\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\6)\u00f1\n)\r)\16)\u00f2\3)\3)\3\u00b4"+
		"\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\6\5\2C\\aac|\3\2\63;\3\2\62;\5\2\13\f"+
		"\17\17\"\"\2\u00fb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\3S\3\2\2\2\5X\3\2\2\2\7\\\3\2\2\2\ta\3\2\2\2\13d\3\2\2\2\ri\3\2\2"+
		"\2\17o\3\2\2\2\21s\3\2\2\2\23z\3\2\2\2\25\177\3\2\2\2\27\u0083\3\2\2\2"+
		"\31\u008b\3\2\2\2\33\u008f\3\2\2\2\35\u0095\3\2\2\2\37\u009a\3\2\2\2!"+
		"\u00a0\3\2\2\2#\u00a4\3\2\2\2%\u00ac\3\2\2\2\'\u00b0\3\2\2\2)\u00c3\3"+
		"\2\2\2+\u00c5\3\2\2\2-\u00c7\3\2\2\2/\u00c9\3\2\2\2\61\u00cb\3\2\2\2\63"+
		"\u00cd\3\2\2\2\65\u00cf\3\2\2\2\67\u00d1\3\2\2\29\u00d3\3\2\2\2;\u00d5"+
		"\3\2\2\2=\u00d7\3\2\2\2?\u00da\3\2\2\2A\u00dd\3\2\2\2C\u00e0\3\2\2\2E"+
		"\u00e3\3\2\2\2G\u00e5\3\2\2\2I\u00e7\3\2\2\2K\u00e9\3\2\2\2M\u00eb\3\2"+
		"\2\2O\u00ed\3\2\2\2Q\u00f0\3\2\2\2ST\7o\2\2TU\7c\2\2UV\7k\2\2VW\7p\2\2"+
		"W\4\3\2\2\2XY\7f\2\2YZ\7g\2\2Z[\7h\2\2[\6\3\2\2\2\\]\7x\2\2]^\7q\2\2^"+
		"_\7k\2\2_`\7f\2\2`\b\3\2\2\2ab\7k\2\2bc\7h\2\2c\n\3\2\2\2de\7g\2\2ef\7"+
		"n\2\2fg\7u\2\2gh\7g\2\2h\f\3\2\2\2ij\7y\2\2jk\7j\2\2kl\7k\2\2lm\7n\2\2"+
		"mn\7g\2\2n\16\3\2\2\2op\7h\2\2pq\7q\2\2qr\7t\2\2r\20\3\2\2\2st\7t\2\2"+
		"tu\7g\2\2uv\7v\2\2vw\7w\2\2wx\7t\2\2xy\7p\2\2y\22\3\2\2\2z{\7h\2\2{|\7"+
		"t\2\2|}\7q\2\2}~\7o\2\2~\24\3\2\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2"+
		"\2\u0081\u0082\7v\2\2\u0082\26\3\2\2\2\u0083\u0084\7g\2\2\u0084\u0085"+
		"\7n\2\2\u0085\u0086\7g\2\2\u0086\u0087\7o\2\2\u0087\u0088\7g\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a\30\3\2\2\2\u008b\u008c\7x\2\2\u008c"+
		"\u008d\7c\2\2\u008d\u008e\7t\2\2\u008e\32\3\2\2\2\u008f\u0090\7r\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7v\2\2"+
		"\u0094\34\3\2\2\2\u0095\u0096\7u\2\2\u0096\u0097\7k\2\2\u0097\u0098\7"+
		"|\2\2\u0098\u0099\7g\2\2\u0099\36\3\2\2\2\u009a\u009b\7e\2\2\u009b\u009c"+
		"\7n\2\2\u009c\u009d\7g\2\2\u009d\u009e\7c\2\2\u009e\u009f\7t\2\2\u009f"+
		" \3\2\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7f\2\2\u00a3"+
		"\"\3\2\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7o\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\u00a9\7x\2\2\u00a9\u00aa\7g\2\2\u00aa$\3\2\2\2\u00ab"+
		"\u00ad\t\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af&\3\2\2\2\u00b0\u00b2\7$\2\2\u00b1\u00b3"+
		"\13\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7(\3\2"+
		"\2\2\u00b8\u00c4\7\62\2\2\u00b9\u00bb\7/\2\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c0\t\3\2\2\u00bd\u00bf\t\4"+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00b8\3\2"+
		"\2\2\u00c3\u00ba\3\2\2\2\u00c4*\3\2\2\2\u00c5\u00c6\7<\2\2\u00c6,\3\2"+
		"\2\2\u00c7\u00c8\7=\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7\60\2\2\u00ca\60\3"+
		"\2\2\2\u00cb\u00cc\7.\2\2\u00cc\62\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce\64"+
		"\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0\66\3\2\2\2\u00d1\u00d2\7/\2\2\u00d2"+
		"8\3\2\2\2\u00d3\u00d4\7(\2\2\u00d4:\3\2\2\2\u00d5\u00d6\7`\2\2\u00d6<"+
		"\3\2\2\2\u00d7\u00d8\7?\2\2\u00d8\u00d9\7?\2\2\u00d9>\3\2\2\2\u00da\u00db"+
		"\7#\2\2\u00db\u00dc\7?\2\2\u00dc@\3\2\2\2\u00dd\u00de\7@\2\2\u00de\u00df"+
		"\7?\2\2\u00dfB\3\2\2\2\u00e0\u00e1\7>\2\2\u00e1\u00e2\7?\2\2\u00e2D\3"+
		"\2\2\2\u00e3\u00e4\7@\2\2\u00e4F\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6H\3\2"+
		"\2\2\u00e7\u00e8\7*\2\2\u00e8J\3\2\2\2\u00e9\u00ea\7+\2\2\u00eaL\3\2\2"+
		"\2\u00eb\u00ec\7}\2\2\u00ecN\3\2\2\2\u00ed\u00ee\7\177\2\2\u00eeP\3\2"+
		"\2\2\u00ef\u00f1\t\5\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b)"+
		"\2\2\u00f5R\3\2\2\2\t\2\u00ae\u00b4\u00ba\u00c0\u00c3\u00f2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}