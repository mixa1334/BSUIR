// Generated from C:/Users/миша/IdeaProjectsM/YapisParser/src/main/resources\PollaM.g4 by ANTLR 4.9.2
package com.misha.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PollaMParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_typeIdPart = 2, RULE_typeVarPart = 3, 
		RULE_mainDef = 4, RULE_functionDefReturn = 5, RULE_functionDefNonReturn = 6, 
		RULE_functionBodyWithoutReturn = 7, RULE_emptRet = 8, RULE_functionBodyWithReturn = 9, 
		RULE_functionDefParameters = 10, RULE_contentLine = 11, RULE_operators = 12, 
		RULE_variableDeclaration = 13, RULE_variableDeclarationWithAssignment = 14, 
		RULE_valueAssignment = 15, RULE_typeConvertion = 16, RULE_functionCall = 17, 
		RULE_operationsWithSets = 18, RULE_changeSetOperation = 19, RULE_unionOperation = 20, 
		RULE_differenceOperation = 21, RULE_intersectionOperation = 22, RULE_symmetricDifferenceOperation = 23, 
		RULE_booleanOperations = 24, RULE_ifBlock = 25, RULE_forBlock = 26, RULE_whileBlock = 27, 
		RULE_operatorBody = 28, RULE_printCall = 29, RULE_sizeCall = 30, RULE_clearCall = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "typeIdPart", "typeVarPart", "mainDef", "functionDefReturn", 
			"functionDefNonReturn", "functionBodyWithoutReturn", "emptRet", "functionBodyWithReturn", 
			"functionDefParameters", "contentLine", "operators", "variableDeclaration", 
			"variableDeclarationWithAssignment", "valueAssignment", "typeConvertion", 
			"functionCall", "operationsWithSets", "changeSetOperation", "unionOperation", 
			"differenceOperation", "intersectionOperation", "symmetricDifferenceOperation", 
			"booleanOperations", "ifBlock", "forBlock", "whileBlock", "operatorBody", 
			"printCall", "sizeCall", "clearCall"
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

	@Override
	public String getGrammarFileName() { return "PollaM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PollaMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainDefContext mainDef() {
			return getRuleContext(MainDefContext.class,0);
		}
		public List<FunctionDefReturnContext> functionDefReturn() {
			return getRuleContexts(FunctionDefReturnContext.class);
		}
		public FunctionDefReturnContext functionDefReturn(int i) {
			return getRuleContext(FunctionDefReturnContext.class,i);
		}
		public List<FunctionDefNonReturnContext> functionDefNonReturn() {
			return getRuleContexts(FunctionDefNonReturnContext.class);
		}
		public FunctionDefNonReturnContext functionDefNonReturn(int i) {
			return getRuleContext(FunctionDefNonReturnContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(66);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(64);
						functionDefReturn();
						}
						break;
					case 2:
						{
						setState(65);
						functionDefNonReturn();
						}
						break;
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(71);
			mainDef();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PollaMParser.SET, 0); }
		public TerminalNode ELEMENT() { return getToken(PollaMParser.ELEMENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==SET || _la==ELEMENT) ) {
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

	public static class TypeIdPartContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PollaMParser.ID, 0); }
		public TypeIdPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterTypeIdPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitTypeIdPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitTypeIdPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdPartContext typeIdPart() throws RecognitionException {
		TypeIdPartContext _localctx = new TypeIdPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeIdPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			type();
			setState(76);
			match(ID);
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

	public static class TypeVarPartContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(PollaMParser.VAR, 0); }
		public TypeVarPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVarPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterTypeVarPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitTypeVarPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitTypeVarPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVarPartContext typeVarPart() throws RecognitionException {
		TypeVarPartContext _localctx = new TypeVarPartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeVarPart);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				type();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(VAR);
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

	public static class MainDefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PollaMParser.DEF, 0); }
		public TerminalNode VOID() { return getToken(PollaMParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(PollaMParser.MAIN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public FunctionBodyWithoutReturnContext functionBodyWithoutReturn() {
			return getRuleContext(FunctionBodyWithoutReturnContext.class,0);
		}
		public MainDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterMainDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitMainDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitMainDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDefContext mainDef() throws RecognitionException {
		MainDefContext _localctx = new MainDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(DEF);
			setState(83);
			match(VOID);
			setState(84);
			match(MAIN);
			setState(85);
			match(OPEN_BRACKET);
			setState(86);
			match(CLOSE_BRACKET);
			setState(87);
			functionBodyWithoutReturn();
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

	public static class FunctionDefReturnContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PollaMParser.DEF, 0); }
		public TypeIdPartContext typeIdPart() {
			return getRuleContext(TypeIdPartContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public FunctionBodyWithReturnContext functionBodyWithReturn() {
			return getRuleContext(FunctionBodyWithReturnContext.class,0);
		}
		public FunctionDefParametersContext functionDefParameters() {
			return getRuleContext(FunctionDefParametersContext.class,0);
		}
		public FunctionDefReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterFunctionDefReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitFunctionDefReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitFunctionDefReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefReturnContext functionDefReturn() throws RecognitionException {
		FunctionDefReturnContext _localctx = new FunctionDefReturnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDefReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(DEF);
			setState(90);
			typeIdPart();
			setState(91);
			match(OPEN_BRACKET);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET || _la==ELEMENT) {
				{
				setState(92);
				functionDefParameters();
				}
			}

			setState(95);
			match(CLOSE_BRACKET);
			setState(96);
			functionBodyWithReturn();
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

	public static class FunctionDefNonReturnContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PollaMParser.DEF, 0); }
		public TerminalNode VOID() { return getToken(PollaMParser.VOID, 0); }
		public TerminalNode ID() { return getToken(PollaMParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public FunctionBodyWithoutReturnContext functionBodyWithoutReturn() {
			return getRuleContext(FunctionBodyWithoutReturnContext.class,0);
		}
		public FunctionDefParametersContext functionDefParameters() {
			return getRuleContext(FunctionDefParametersContext.class,0);
		}
		public FunctionDefNonReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefNonReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterFunctionDefNonReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitFunctionDefNonReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitFunctionDefNonReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefNonReturnContext functionDefNonReturn() throws RecognitionException {
		FunctionDefNonReturnContext _localctx = new FunctionDefNonReturnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDefNonReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DEF);
			setState(99);
			match(VOID);
			setState(100);
			match(ID);
			setState(101);
			match(OPEN_BRACKET);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET || _la==ELEMENT) {
				{
				setState(102);
				functionDefParameters();
				}
			}

			setState(105);
			match(CLOSE_BRACKET);
			setState(106);
			functionBodyWithoutReturn();
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

	public static class FunctionBodyWithoutReturnContext extends ParserRuleContext {
		public EmptRetContext emptRet() {
			return getRuleContext(EmptRetContext.class,0);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public List<ContentLineContext> contentLine() {
			return getRuleContexts(ContentLineContext.class);
		}
		public ContentLineContext contentLine(int i) {
			return getRuleContext(ContentLineContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PollaMParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PollaMParser.SEMICOLON, i);
		}
		public FunctionBodyWithoutReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBodyWithoutReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterFunctionBodyWithoutReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitFunctionBodyWithoutReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitFunctionBodyWithoutReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyWithoutReturnContext functionBodyWithoutReturn() throws RecognitionException {
		FunctionBodyWithoutReturnContext _localctx = new FunctionBodyWithoutReturnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionBodyWithoutReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SET) | (1L << ELEMENT) | (1L << VAR) | (1L << PRINT) | (1L << SIZE) | (1L << CLEAR) | (1L << ID) | (1L << NUMBER) | (1L << OPEN_BRACKET))) != 0)) {
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SET:
				case ELEMENT:
				case VAR:
				case PRINT:
				case SIZE:
				case CLEAR:
				case ID:
				case NUMBER:
				case OPEN_BRACKET:
					{
					{
					setState(108);
					contentLine();
					setState(109);
					match(SEMICOLON);
					}
					}
					break;
				case IF:
				case WHILE:
				case FOR:
					{
					setState(111);
					operators();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			emptRet();
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

	public static class EmptRetContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PollaMParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PollaMParser.SEMICOLON, 0); }
		public EmptRetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptRet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterEmptRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitEmptRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitEmptRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptRetContext emptRet() throws RecognitionException {
		EmptRetContext _localctx = new EmptRetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_emptRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(RETURN);
			setState(120);
			match(SEMICOLON);
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

	public static class FunctionBodyWithReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PollaMParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(PollaMParser.ID, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(PollaMParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PollaMParser.SEMICOLON, i);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public List<ContentLineContext> contentLine() {
			return getRuleContexts(ContentLineContext.class);
		}
		public ContentLineContext contentLine(int i) {
			return getRuleContext(ContentLineContext.class,i);
		}
		public FunctionBodyWithReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBodyWithReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterFunctionBodyWithReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitFunctionBodyWithReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitFunctionBodyWithReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyWithReturnContext functionBodyWithReturn() throws RecognitionException {
		FunctionBodyWithReturnContext _localctx = new FunctionBodyWithReturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionBodyWithReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SET) | (1L << ELEMENT) | (1L << VAR) | (1L << PRINT) | (1L << SIZE) | (1L << CLEAR) | (1L << ID) | (1L << NUMBER) | (1L << OPEN_BRACKET))) != 0)) {
				{
				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SET:
				case ELEMENT:
				case VAR:
				case PRINT:
				case SIZE:
				case CLEAR:
				case ID:
				case NUMBER:
				case OPEN_BRACKET:
					{
					{
					setState(122);
					contentLine();
					setState(123);
					match(SEMICOLON);
					}
					}
					break;
				case IF:
				case WHILE:
				case FOR:
					{
					setState(125);
					operators();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(RETURN);
			setState(132);
			match(ID);
			setState(133);
			match(SEMICOLON);
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

	public static class FunctionDefParametersContext extends ParserRuleContext {
		public List<TypeIdPartContext> typeIdPart() {
			return getRuleContexts(TypeIdPartContext.class);
		}
		public TypeIdPartContext typeIdPart(int i) {
			return getRuleContext(TypeIdPartContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PollaMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PollaMParser.COMMA, i);
		}
		public FunctionDefParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterFunctionDefParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitFunctionDefParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitFunctionDefParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefParametersContext functionDefParameters() throws RecognitionException {
		FunctionDefParametersContext _localctx = new FunctionDefParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDefParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					typeIdPart();
					setState(136);
					match(COMMA);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(143);
			typeIdPart();
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

	public static class ContentLineContext extends ParserRuleContext {
		public OperationsWithSetsContext operationsWithSets() {
			return getRuleContext(OperationsWithSetsContext.class,0);
		}
		public BooleanOperationsContext booleanOperations() {
			return getRuleContext(BooleanOperationsContext.class,0);
		}
		public ChangeSetOperationContext changeSetOperation() {
			return getRuleContext(ChangeSetOperationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ValueAssignmentContext valueAssignment() {
			return getRuleContext(ValueAssignmentContext.class,0);
		}
		public VariableDeclarationWithAssignmentContext variableDeclarationWithAssignment() {
			return getRuleContext(VariableDeclarationWithAssignmentContext.class,0);
		}
		public TypeConvertionContext typeConvertion() {
			return getRuleContext(TypeConvertionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrintCallContext printCall() {
			return getRuleContext(PrintCallContext.class,0);
		}
		public SizeCallContext sizeCall() {
			return getRuleContext(SizeCallContext.class,0);
		}
		public ClearCallContext clearCall() {
			return getRuleContext(ClearCallContext.class,0);
		}
		public ContentLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterContentLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitContentLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitContentLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentLineContext contentLine() throws RecognitionException {
		ContentLineContext _localctx = new ContentLineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contentLine);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				operationsWithSets();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				booleanOperations();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				changeSetOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				valueAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				variableDeclarationWithAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				typeConvertion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(152);
				functionCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(153);
				printCall();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				sizeCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(155);
				clearCall();
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

	public static class OperatorsContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operators);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				ifBlock();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				forBlock();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				whileBlock();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeVarPartContext typeVarPart() {
			return getRuleContext(TypeVarPartContext.class,0);
		}
		public TerminalNode ID() { return getToken(PollaMParser.ID, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			typeVarPart();
			setState(164);
			match(ID);
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

	public static class VariableDeclarationWithAssignmentContext extends ParserRuleContext {
		public TypeVarPartContext typeVarPart() {
			return getRuleContext(TypeVarPartContext.class,0);
		}
		public ValueAssignmentContext valueAssignment() {
			return getRuleContext(ValueAssignmentContext.class,0);
		}
		public VariableDeclarationWithAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationWithAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterVariableDeclarationWithAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitVariableDeclarationWithAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitVariableDeclarationWithAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationWithAssignmentContext variableDeclarationWithAssignment() throws RecognitionException {
		VariableDeclarationWithAssignmentContext _localctx = new VariableDeclarationWithAssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarationWithAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			typeVarPart();
			setState(167);
			valueAssignment();
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

	public static class ValueAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PollaMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PollaMParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(PollaMParser.ASSIGN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PollaMParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PollaMParser.NUMBER, i);
		}
		public TypeConvertionContext typeConvertion() {
			return getRuleContext(TypeConvertionContext.class,0);
		}
		public SizeCallContext sizeCall() {
			return getRuleContext(SizeCallContext.class,0);
		}
		public OperationsWithSetsContext operationsWithSets() {
			return getRuleContext(OperationsWithSetsContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(PollaMParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(PollaMParser.CLOSE_CURLY_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PollaMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PollaMParser.COMMA, i);
		}
		public ValueAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterValueAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitValueAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitValueAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueAssignmentContext valueAssignment() throws RecognitionException {
		ValueAssignmentContext _localctx = new ValueAssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_valueAssignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
			setState(170);
			match(ASSIGN);
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(171);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(172);
				typeConvertion();
				}
				break;
			case 3:
				{
				setState(173);
				match(ID);
				}
				break;
			case 4:
				{
				setState(174);
				sizeCall();
				}
				break;
			case 5:
				{
				setState(175);
				operationsWithSets();
				}
				break;
			case 6:
				{
				setState(176);
				functionCall();
				}
				break;
			case 7:
				{
				{
				setState(177);
				match(OPEN_CURLY_BRACKET);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID || _la==NUMBER) {
					{
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(178);
							_la = _input.LA(1);
							if ( !(_la==ID || _la==NUMBER) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(179);
							match(COMMA);
							}
							} 
						}
						setState(184);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(185);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(188);
				match(CLOSE_CURLY_BRACKET);
				}
				}
				break;
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

	public static class TypeConvertionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public TerminalNode ID() { return getToken(PollaMParser.ID, 0); }
		public TypeConvertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConvertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterTypeConvertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitTypeConvertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitTypeConvertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeConvertionContext typeConvertion() throws RecognitionException {
		TypeConvertionContext _localctx = new TypeConvertionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeConvertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(OPEN_BRACKET);
			setState(192);
			type();
			setState(193);
			match(CLOSE_BRACKET);
			setState(194);
			match(ID);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PollaMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PollaMParser.ID, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PollaMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PollaMParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(197);
			match(OPEN_BRACKET);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198);
						match(ID);
						setState(199);
						match(COMMA);
						}
						} 
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(205);
				match(ID);
				}
			}

			setState(208);
			match(CLOSE_BRACKET);
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

	public static class OperationsWithSetsContext extends ParserRuleContext {
		public UnionOperationContext unionOperation() {
			return getRuleContext(UnionOperationContext.class,0);
		}
		public DifferenceOperationContext differenceOperation() {
			return getRuleContext(DifferenceOperationContext.class,0);
		}
		public IntersectionOperationContext intersectionOperation() {
			return getRuleContext(IntersectionOperationContext.class,0);
		}
		public SymmetricDifferenceOperationContext symmetricDifferenceOperation() {
			return getRuleContext(SymmetricDifferenceOperationContext.class,0);
		}
		public OperationsWithSetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationsWithSets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterOperationsWithSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitOperationsWithSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitOperationsWithSets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsWithSetsContext operationsWithSets() throws RecognitionException {
		OperationsWithSetsContext _localctx = new OperationsWithSetsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operationsWithSets);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				unionOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				differenceOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				intersectionOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				symmetricDifferenceOperation();
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

	public static class ChangeSetOperationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PollaMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PollaMParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(PollaMParser.DOT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public TerminalNode ADD() { return getToken(PollaMParser.ADD, 0); }
		public TerminalNode REMOVE() { return getToken(PollaMParser.REMOVE, 0); }
		public TerminalNode NUMBER() { return getToken(PollaMParser.NUMBER, 0); }
		public ChangeSetOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeSetOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterChangeSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitChangeSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitChangeSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChangeSetOperationContext changeSetOperation() throws RecognitionException {
		ChangeSetOperationContext _localctx = new ChangeSetOperationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_changeSetOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ID);
			setState(217);
			match(DOT);
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==REMOVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(219);
			match(OPEN_BRACKET);
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(221);
			match(CLOSE_BRACKET);
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

	public static class UnionOperationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PollaMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PollaMParser.ID, i);
		}
		public TerminalNode UNION() { return getToken(PollaMParser.UNION, 0); }
		public UnionOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterUnionOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitUnionOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitUnionOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionOperationContext unionOperation() throws RecognitionException {
		UnionOperationContext _localctx = new UnionOperationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unionOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ID);
			setState(224);
			match(UNION);
			setState(225);
			match(ID);
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

	public static class DifferenceOperationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PollaMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PollaMParser.ID, i);
		}
		public TerminalNode DIFERENCE() { return getToken(PollaMParser.DIFERENCE, 0); }
		public DifferenceOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differenceOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterDifferenceOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitDifferenceOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitDifferenceOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DifferenceOperationContext differenceOperation() throws RecognitionException {
		DifferenceOperationContext _localctx = new DifferenceOperationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_differenceOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			setState(228);
			match(DIFERENCE);
			setState(229);
			match(ID);
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

	public static class IntersectionOperationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PollaMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PollaMParser.ID, i);
		}
		public TerminalNode INTERSECTION() { return getToken(PollaMParser.INTERSECTION, 0); }
		public IntersectionOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterIntersectionOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitIntersectionOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitIntersectionOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntersectionOperationContext intersectionOperation() throws RecognitionException {
		IntersectionOperationContext _localctx = new IntersectionOperationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_intersectionOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ID);
			setState(232);
			match(INTERSECTION);
			setState(233);
			match(ID);
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

	public static class SymmetricDifferenceOperationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PollaMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PollaMParser.ID, i);
		}
		public TerminalNode SYMMETRIC_DIFFERENCE() { return getToken(PollaMParser.SYMMETRIC_DIFFERENCE, 0); }
		public SymmetricDifferenceOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symmetricDifferenceOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterSymmetricDifferenceOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitSymmetricDifferenceOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitSymmetricDifferenceOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymmetricDifferenceOperationContext symmetricDifferenceOperation() throws RecognitionException {
		SymmetricDifferenceOperationContext _localctx = new SymmetricDifferenceOperationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_symmetricDifferenceOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ID);
			setState(236);
			match(SYMMETRIC_DIFFERENCE);
			setState(237);
			match(ID);
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

	public static class BooleanOperationsContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(PollaMParser.EQUALS, 0); }
		public List<TerminalNode> ID() { return getTokens(PollaMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PollaMParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PollaMParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PollaMParser.NUMBER, i);
		}
		public TerminalNode GT_EQ() { return getToken(PollaMParser.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(PollaMParser.LT_EQ, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(PollaMParser.NOT_EQUALS, 0); }
		public TerminalNode GT() { return getToken(PollaMParser.GT, 0); }
		public TerminalNode LT() { return getToken(PollaMParser.LT, 0); }
		public BooleanOperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterBooleanOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitBooleanOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitBooleanOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOperationsContext booleanOperations() throws RecognitionException {
		BooleanOperationsContext _localctx = new BooleanOperationsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_booleanOperations);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				match(EQUALS);
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(243);
				match(GT_EQ);
				setState(244);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				match(LT_EQ);
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				match(NOT_EQUALS);
				setState(250);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(252);
				match(GT);
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				match(LT);
				setState(256);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				match(ID);
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PollaMParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public BooleanOperationsContext booleanOperations() {
			return getRuleContext(BooleanOperationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public List<OperatorBodyContext> operatorBody() {
			return getRuleContexts(OperatorBodyContext.class);
		}
		public OperatorBodyContext operatorBody(int i) {
			return getRuleContext(OperatorBodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PollaMParser.ELSE, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(IF);
			setState(261);
			match(OPEN_BRACKET);
			setState(262);
			booleanOperations();
			setState(263);
			match(CLOSE_BRACKET);
			setState(264);
			operatorBody();
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(265);
				match(ELSE);
				setState(266);
				operatorBody();
				}
				break;
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

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PollaMParser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(PollaMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PollaMParser.ID, i);
		}
		public TerminalNode FROM() { return getToken(PollaMParser.FROM, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public OperatorBodyContext operatorBody() {
			return getRuleContext(OperatorBodyContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(FOR);
			setState(270);
			match(OPEN_BRACKET);
			setState(271);
			match(ID);
			setState(272);
			match(FROM);
			setState(273);
			match(ID);
			setState(274);
			match(CLOSE_BRACKET);
			setState(275);
			operatorBody();
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PollaMParser.WHILE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public BooleanOperationsContext booleanOperations() {
			return getRuleContext(BooleanOperationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public OperatorBodyContext operatorBody() {
			return getRuleContext(OperatorBodyContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(WHILE);
			setState(278);
			match(OPEN_BRACKET);
			setState(279);
			booleanOperations();
			setState(280);
			match(CLOSE_BRACKET);
			setState(281);
			operatorBody();
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

	public static class OperatorBodyContext extends ParserRuleContext {
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public List<ContentLineContext> contentLine() {
			return getRuleContexts(ContentLineContext.class);
		}
		public ContentLineContext contentLine(int i) {
			return getRuleContext(ContentLineContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PollaMParser.COLON, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(PollaMParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PollaMParser.SEMICOLON, i);
		}
		public OperatorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterOperatorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitOperatorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitOperatorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorBodyContext operatorBody() throws RecognitionException {
		OperatorBodyContext _localctx = new OperatorBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operatorBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(287);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SET:
					case ELEMENT:
					case VAR:
					case PRINT:
					case SIZE:
					case CLEAR:
					case ID:
					case NUMBER:
					case OPEN_BRACKET:
						{
						{
						setState(283);
						contentLine();
						setState(284);
						match(SEMICOLON);
						}
						}
						break;
					case IF:
					case WHILE:
					case FOR:
						{
						setState(286);
						operators();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case ELEMENT:
			case VAR:
			case PRINT:
			case SIZE:
			case CLEAR:
			case ID:
			case NUMBER:
			case OPEN_BRACKET:
				{
				{
				setState(292);
				contentLine();
				setState(293);
				match(COLON);
				}
				}
				break;
			case IF:
			case WHILE:
			case FOR:
				{
				setState(295);
				operators();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrintCallContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PollaMParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public TerminalNode ID() { return getToken(PollaMParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PollaMParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(PollaMParser.NUMBER, 0); }
		public PrintCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterPrintCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitPrintCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitPrintCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintCallContext printCall() throws RecognitionException {
		PrintCallContext _localctx = new PrintCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_printCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(PRINT);
			setState(299);
			match(OPEN_BRACKET);
			setState(300);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(301);
			match(CLOSE_BRACKET);
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

	public static class SizeCallContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(PollaMParser.SIZE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public TerminalNode ID() { return getToken(PollaMParser.ID, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public SizeCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterSizeCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitSizeCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitSizeCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeCallContext sizeCall() throws RecognitionException {
		SizeCallContext _localctx = new SizeCallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sizeCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(SIZE);
			setState(304);
			match(OPEN_BRACKET);
			setState(305);
			match(ID);
			setState(306);
			match(CLOSE_BRACKET);
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

	public static class ClearCallContext extends ParserRuleContext {
		public TerminalNode CLEAR() { return getToken(PollaMParser.CLEAR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PollaMParser.OPEN_BRACKET, 0); }
		public TerminalNode ID() { return getToken(PollaMParser.ID, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PollaMParser.CLOSE_BRACKET, 0); }
		public ClearCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).enterClearCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PollaMListener ) ((PollaMListener)listener).exitClearCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PollaMVisitor ) return ((PollaMVisitor<? extends T>)visitor).visitClearCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearCallContext clearCall() throws RecognitionException {
		ClearCallContext _localctx = new ClearCallContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_clearCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(CLEAR);
			setState(309);
			match(OPEN_BRACKET);
			setState(310);
			match(ID);
			setState(311);
			match(CLOSE_BRACKET);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u013c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\5\5S\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7`\n\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bj\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\ts\n"+
		"\t\f\t\16\tv\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0081\n"+
		"\13\f\13\16\13\u0084\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u008d\n"+
		"\f\f\f\16\f\u0090\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u009f\n\r\3\16\3\16\3\16\5\16\u00a4\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00b7\n\21\f\21\16\21\u00ba\13\21\3\21\5\21\u00bd\n\21\3\21\5\21\u00c0"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00cb\n\23\f\23"+
		"\16\23\u00ce\13\23\3\23\5\23\u00d1\n\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\5\24\u00d9\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0105\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u010e\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u0122\n\36\f\36\16\36\u0125\13\36"+
		"\3\36\3\36\3\36\3\36\5\36\u012b\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@\2\6\3\2\f\r\4\2\24\24\26\26\3\2\22\23\3\2\24"+
		"\26\2\u0148\2F\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\f["+
		"\3\2\2\2\16d\3\2\2\2\20t\3\2\2\2\22y\3\2\2\2\24\u0082\3\2\2\2\26\u008e"+
		"\3\2\2\2\30\u009e\3\2\2\2\32\u00a3\3\2\2\2\34\u00a5\3\2\2\2\36\u00a8\3"+
		"\2\2\2 \u00ab\3\2\2\2\"\u00c1\3\2\2\2$\u00c6\3\2\2\2&\u00d8\3\2\2\2(\u00da"+
		"\3\2\2\2*\u00e1\3\2\2\2,\u00e5\3\2\2\2.\u00e9\3\2\2\2\60\u00ed\3\2\2\2"+
		"\62\u0104\3\2\2\2\64\u0106\3\2\2\2\66\u010f\3\2\2\28\u0117\3\2\2\2:\u0123"+
		"\3\2\2\2<\u012c\3\2\2\2>\u0131\3\2\2\2@\u0136\3\2\2\2BE\5\f\7\2CE\5\16"+
		"\b\2DB\3\2\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2"+
		"\2\2IJ\5\n\6\2J\3\3\2\2\2KL\t\2\2\2L\5\3\2\2\2MN\5\4\3\2NO\7\24\2\2O\7"+
		"\3\2\2\2PS\5\4\3\2QS\7\16\2\2RP\3\2\2\2RQ\3\2\2\2S\t\3\2\2\2TU\7\4\2\2"+
		"UV\7\5\2\2VW\7\3\2\2WX\7&\2\2XY\7\'\2\2YZ\5\20\t\2Z\13\3\2\2\2[\\\7\4"+
		"\2\2\\]\5\6\4\2]_\7&\2\2^`\5\26\f\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7"+
		"\'\2\2bc\5\24\13\2c\r\3\2\2\2de\7\4\2\2ef\7\5\2\2fg\7\24\2\2gi\7&\2\2"+
		"hj\5\26\f\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\'\2\2lm\5\20\t\2m\17\3\2"+
		"\2\2no\5\30\r\2op\7\30\2\2ps\3\2\2\2qs\5\32\16\2rn\3\2\2\2rq\3\2\2\2s"+
		"v\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\5\22\n\2x\21\3\2\2"+
		"\2yz\7\n\2\2z{\7\30\2\2{\23\3\2\2\2|}\5\30\r\2}~\7\30\2\2~\u0081\3\2\2"+
		"\2\177\u0081\5\32\16\2\u0080|\3\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7\n\2\2\u0086\u0087\7\24\2\2\u0087\u0088\7"+
		"\30\2\2\u0088\25\3\2\2\2\u0089\u008a\5\6\4\2\u008a\u008b\7\32\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\5\6\4\2\u0092\27\3\2\2\2\u0093\u009f\5&\24\2\u0094\u009f\5\62\32"+
		"\2\u0095\u009f\5(\25\2\u0096\u009f\5\34\17\2\u0097\u009f\5 \21\2\u0098"+
		"\u009f\5\36\20\2\u0099\u009f\5\"\22\2\u009a\u009f\5$\23\2\u009b\u009f"+
		"\5<\37\2\u009c\u009f\5> \2\u009d\u009f\5@!\2\u009e\u0093\3\2\2\2\u009e"+
		"\u0094\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u0097\3\2"+
		"\2\2\u009e\u0098\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e"+
		"\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\31\3\2\2"+
		"\2\u00a0\u00a4\5\64\33\2\u00a1\u00a4\5\66\34\2\u00a2\u00a4\58\35\2\u00a3"+
		"\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\33\3\2\2"+
		"\2\u00a5\u00a6\5\b\5\2\u00a6\u00a7\7\24\2\2\u00a7\35\3\2\2\2\u00a8\u00a9"+
		"\5\b\5\2\u00a9\u00aa\5 \21\2\u00aa\37\3\2\2\2\u00ab\u00ac\7\24\2\2\u00ac"+
		"\u00bf\7\33\2\2\u00ad\u00c0\7\26\2\2\u00ae\u00c0\5\"\22\2\u00af\u00c0"+
		"\7\24\2\2\u00b0\u00c0\5> \2\u00b1\u00c0\5&\24\2\u00b2\u00c0\5$\23\2\u00b3"+
		"\u00bc\7(\2\2\u00b4\u00b5\t\3\2\2\u00b5\u00b7\7\32\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\t\3\2\2\u00bc\u00b8\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\7)\2\2\u00bf"+
		"\u00ad\3\2\2\2\u00bf\u00ae\3\2\2\2\u00bf\u00af\3\2\2\2\u00bf\u00b0\3\2"+
		"\2\2\u00bf\u00b1\3\2\2\2\u00bf\u00b2\3\2\2\2\u00bf\u00b3\3\2\2\2\u00c0"+
		"!\3\2\2\2\u00c1\u00c2\7&\2\2\u00c2\u00c3\5\4\3\2\u00c3\u00c4\7\'\2\2\u00c4"+
		"\u00c5\7\24\2\2\u00c5#\3\2\2\2\u00c6\u00c7\7\24\2\2\u00c7\u00d0\7&\2\2"+
		"\u00c8\u00c9\7\24\2\2\u00c9\u00cb\7\32\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d1\7\24\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\'\2\2\u00d3%\3\2\2\2\u00d4\u00d9"+
		"\5*\26\2\u00d5\u00d9\5,\27\2\u00d6\u00d9\5.\30\2\u00d7\u00d9\5\60\31\2"+
		"\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9\'\3\2\2\2\u00da\u00db\7\24\2\2\u00db\u00dc\7\31\2\2\u00dc"+
		"\u00dd\t\4\2\2\u00dd\u00de\7&\2\2\u00de\u00df\t\3\2\2\u00df\u00e0\7\'"+
		"\2\2\u00e0)\3\2\2\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3\7\34\2\2\u00e3\u00e4"+
		"\7\24\2\2\u00e4+\3\2\2\2\u00e5\u00e6\7\24\2\2\u00e6\u00e7\7\35\2\2\u00e7"+
		"\u00e8\7\24\2\2\u00e8-\3\2\2\2\u00e9\u00ea\7\24\2\2\u00ea\u00eb\7\36\2"+
		"\2\u00eb\u00ec\7\24\2\2\u00ec/\3\2\2\2\u00ed\u00ee\7\24\2\2\u00ee\u00ef"+
		"\7\37\2\2\u00ef\u00f0\7\24\2\2\u00f0\61\3\2\2\2\u00f1\u00f2\t\3\2\2\u00f2"+
		"\u00f3\7 \2\2\u00f3\u0105\t\3\2\2\u00f4\u00f5\t\3\2\2\u00f5\u00f6\7\""+
		"\2\2\u00f6\u0105\t\3\2\2\u00f7\u00f8\t\3\2\2\u00f8\u00f9\7#\2\2\u00f9"+
		"\u0105\t\3\2\2\u00fa\u00fb\t\3\2\2\u00fb\u00fc\7!\2\2\u00fc\u0105\t\3"+
		"\2\2\u00fd\u00fe\t\3\2\2\u00fe\u00ff\7$\2\2\u00ff\u0105\t\3\2\2\u0100"+
		"\u0101\t\3\2\2\u0101\u0102\7%\2\2\u0102\u0105\t\3\2\2\u0103\u0105\7\24"+
		"\2\2\u0104\u00f1\3\2\2\2\u0104\u00f4\3\2\2\2\u0104\u00f7\3\2\2\2\u0104"+
		"\u00fa\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0103\3\2"+
		"\2\2\u0105\63\3\2\2\2\u0106\u0107\7\6\2\2\u0107\u0108\7&\2\2\u0108\u0109"+
		"\5\62\32\2\u0109\u010a\7\'\2\2\u010a\u010d\5:\36\2\u010b\u010c\7\7\2\2"+
		"\u010c\u010e\5:\36\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\65"+
		"\3\2\2\2\u010f\u0110\7\t\2\2\u0110\u0111\7&\2\2\u0111\u0112\7\24\2\2\u0112"+
		"\u0113\7\13\2\2\u0113\u0114\7\24\2\2\u0114\u0115\7\'\2\2\u0115\u0116\5"+
		":\36\2\u0116\67\3\2\2\2\u0117\u0118\7\b\2\2\u0118\u0119\7&\2\2\u0119\u011a"+
		"\5\62\32\2\u011a\u011b\7\'\2\2\u011b\u011c\5:\36\2\u011c9\3\2\2\2\u011d"+
		"\u011e\5\30\r\2\u011e\u011f\7\30\2\2\u011f\u0122\3\2\2\2\u0120\u0122\5"+
		"\32\16\2\u0121\u011d\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012a\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0127\5\30\r\2\u0127\u0128\7\27\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u012b\5\32\16\2\u012a\u0126\3\2\2\2\u012a\u0129\3\2\2\2\u012b;\3\2\2"+
		"\2\u012c\u012d\7\17\2\2\u012d\u012e\7&\2\2\u012e\u012f\t\5\2\2\u012f\u0130"+
		"\7\'\2\2\u0130=\3\2\2\2\u0131\u0132\7\20\2\2\u0132\u0133\7&\2\2\u0133"+
		"\u0134\7\24\2\2\u0134\u0135\7\'\2\2\u0135?\3\2\2\2\u0136\u0137\7\21\2"+
		"\2\u0137\u0138\7&\2\2\u0138\u0139\7\24\2\2\u0139\u013a\7\'\2\2\u013aA"+
		"\3\2\2\2\31DFR_irt\u0080\u0082\u008e\u009e\u00a3\u00b8\u00bc\u00bf\u00cc"+
		"\u00d0\u00d8\u0104\u010d\u0121\u0123\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}