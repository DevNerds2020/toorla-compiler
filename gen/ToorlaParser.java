// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ToorlaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, CONST_NUM=50, CONST_STR=51, NL=52, 
		ID=53, COMMENT=54, MULTILINE_COMMENT=55, WS=56;
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_entryClassDeclaration = 2, 
		RULE_fieldDeclaration = 3, RULE_access_modifier = 4, RULE_methodDeclaration = 5, 
		RULE_otherParamas = 6, RULE_closedStatement = 7, RULE_closedConditional = 8, 
		RULE_openConditional = 9, RULE_openStatement = 10, RULE_statement = 11, 
		RULE_statementVarDef = 12, RULE_statementBlock = 13, RULE_statementContinue = 14, 
		RULE_statementBreak = 15, RULE_statementReturn = 16, RULE_statementClosedLoop = 17, 
		RULE_statementOpenLoop = 18, RULE_statementWrite = 19, RULE_statementAssignment = 20, 
		RULE_statementInc = 21, RULE_statementDec = 22, RULE_expression = 23, 
		RULE_expressionOr = 24, RULE_expressionOrTemp = 25, RULE_expressionAnd = 26, 
		RULE_expressionAndTemp = 27, RULE_expressionEq = 28, RULE_expressionEqTemp = 29, 
		RULE_expressionCmp = 30, RULE_expressionCmpTemp = 31, RULE_expressionAdd = 32, 
		RULE_expressionAddTemp = 33, RULE_expressionMultMod = 34, RULE_expressionMultModTemp = 35, 
		RULE_expressionUnary = 36, RULE_expressionMethods = 37, RULE_expressionMethodsTemp = 38, 
		RULE_expressionOther = 39, RULE_toorlaType = 40, RULE_singleType = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "entryClassDeclaration", "fieldDeclaration", 
			"access_modifier", "methodDeclaration", "otherParamas", "closedStatement", 
			"closedConditional", "openConditional", "openStatement", "statement", 
			"statementVarDef", "statementBlock", "statementContinue", "statementBreak", 
			"statementReturn", "statementClosedLoop", "statementOpenLoop", "statementWrite", 
			"statementAssignment", "statementInc", "statementDec", "expression", 
			"expressionOr", "expressionOrTemp", "expressionAnd", "expressionAndTemp", 
			"expressionEq", "expressionEqTemp", "expressionCmp", "expressionCmpTemp", 
			"expressionAdd", "expressionAddTemp", "expressionMultMod", "expressionMultModTemp", 
			"expressionUnary", "expressionMethods", "expressionMethodsTemp", "expressionOther", 
			"toorlaType", "singleType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'inherits'", "':'", "'end'", "'entry'", "'field'", 
			"','", "';'", "'public'", "'private'", "'function'", "'('", "')'", "'returns'", 
			"'if'", "'elif'", "'else'", "'var'", "'='", "'begin'", "'continue'", 
			"'break'", "'return'", "'while'", "'print'", "'++'", "'--'", "'||'", 
			"'&&'", "'=='", "'<>'", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'!'", "'.'", "'['", "']'", "'new'", "'self'", "'true'", "'false'", "'int'", 
			"'bool'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CONST_NUM", "CONST_STR", "NL", "ID", "COMMENT", "MULTILINE_COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ToorlaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ClassDeclarationContext c1;
		public EntryClassDeclarationContext mainclass;
		public ClassDeclarationContext c3;
		public TerminalNode EOF() { return getToken(ToorlaParser.EOF, 0); }
		public EntryClassDeclarationContext entryClassDeclaration() {
			return getRuleContext(EntryClassDeclarationContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(84);
				((ProgramContext)_localctx).c1 = classDeclaration();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			((ProgramContext)_localctx).mainclass = entryClassDeclaration();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(91);
				((ProgramContext)_localctx).c3 = classDeclaration();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public Token classParent;
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__0);
			setState(100);
			((ClassDeclarationContext)_localctx).className = match(ID);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(101);
				match(T__1);
				setState(102);
				((ClassDeclarationContext)_localctx).classParent = match(ID);
				}
			}

			setState(105);
			match(T__2);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3648L) != 0) {
				{
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(106);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(107);
					methodDeclaration();
					}
					break;
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EntryClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EntryClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterEntryClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitEntryClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitEntryClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryClassDeclarationContext entryClassDeclaration() throws RecognitionException {
		EntryClassDeclarationContext _localctx = new EntryClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entryClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			match(T__4);
			}
			setState(116);
			classDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public Token fieldName;
		public Token ii;
		public ToorlaTypeContext fieldType;
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public ToorlaTypeContext toorlaType() {
			return getRuleContext(ToorlaTypeContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(118);
				access_modifier();
				}
			}

			setState(121);
			match(T__5);
			setState(122);
			((FieldDeclarationContext)_localctx).fieldName = match(ID);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(123);
				match(T__6);
				setState(124);
				((FieldDeclarationContext)_localctx).ii = match(ID);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			((FieldDeclarationContext)_localctx).fieldType = toorlaType();
			setState(131);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Access_modifierContext extends ParserRuleContext {
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterAccess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitAccess_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public Access_modifierContext methodAccessModifier;
		public Token methodName;
		public Token param1;
		public ToorlaTypeContext typeP1;
		public OtherParamasContext otherp;
		public ToorlaTypeContext t;
		public StatementContext s;
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public List<ToorlaTypeContext> toorlaType() {
			return getRuleContexts(ToorlaTypeContext.class);
		}
		public ToorlaTypeContext toorlaType(int i) {
			return getRuleContext(ToorlaTypeContext.class,i);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public OtherParamasContext otherParamas() {
			return getRuleContext(OtherParamasContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(135);
				((MethodDeclarationContext)_localctx).methodAccessModifier = access_modifier();
				}
			}

			setState(138);
			match(T__10);
			setState(139);
			((MethodDeclarationContext)_localctx).methodName = match(ID);
			setState(140);
			match(T__11);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(141);
				((MethodDeclarationContext)_localctx).param1 = match(ID);
				setState(142);
				match(T__2);
				setState(143);
				((MethodDeclarationContext)_localctx).typeP1 = toorlaType();
				setState(144);
				((MethodDeclarationContext)_localctx).otherp = otherParamas();
				}
			}

			setState(148);
			match(T__12);
			setState(149);
			match(T__13);
			setState(150);
			((MethodDeclarationContext)_localctx).t = toorlaType();
			setState(151);
			match(T__2);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 12517424552513792L) != 0) {
				{
				{
				setState(152);
				((MethodDeclarationContext)_localctx).s = statement();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OtherParamasContext extends ParserRuleContext {
		public Token param2;
		public ToorlaTypeContext typeP2;
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public List<ToorlaTypeContext> toorlaType() {
			return getRuleContexts(ToorlaTypeContext.class);
		}
		public ToorlaTypeContext toorlaType(int i) {
			return getRuleContext(ToorlaTypeContext.class,i);
		}
		public OtherParamasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherParamas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterOtherParamas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitOtherParamas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitOtherParamas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherParamasContext otherParamas() throws RecognitionException {
		OtherParamasContext _localctx = new OtherParamasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_otherParamas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(160);
				match(T__6);
				setState(161);
				((OtherParamasContext)_localctx).param2 = match(ID);
				setState(162);
				match(T__2);
				setState(163);
				((OtherParamasContext)_localctx).typeP2 = toorlaType();
				}
				}
				setState(168);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClosedStatementContext extends ParserRuleContext {
		public StatementBlockContext s1;
		public ClosedConditionalContext conditionalStat;
		public StatementClosedLoopContext s3;
		public StatementWriteContext s4;
		public StatementAssignmentContext s5;
		public StatementReturnContext s6;
		public StatementVarDefContext s7;
		public StatementContinueContext s8;
		public StatementBreakContext s9;
		public StatementIncContext incStat;
		public StatementDecContext decStat;
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ClosedConditionalContext closedConditional() {
			return getRuleContext(ClosedConditionalContext.class,0);
		}
		public StatementClosedLoopContext statementClosedLoop() {
			return getRuleContext(StatementClosedLoopContext.class,0);
		}
		public StatementWriteContext statementWrite() {
			return getRuleContext(StatementWriteContext.class,0);
		}
		public StatementAssignmentContext statementAssignment() {
			return getRuleContext(StatementAssignmentContext.class,0);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public StatementVarDefContext statementVarDef() {
			return getRuleContext(StatementVarDefContext.class,0);
		}
		public StatementContinueContext statementContinue() {
			return getRuleContext(StatementContinueContext.class,0);
		}
		public StatementBreakContext statementBreak() {
			return getRuleContext(StatementBreakContext.class,0);
		}
		public StatementIncContext statementInc() {
			return getRuleContext(StatementIncContext.class,0);
		}
		public StatementDecContext statementDec() {
			return getRuleContext(StatementDecContext.class,0);
		}
		public ClosedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterClosedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitClosedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitClosedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosedStatementContext closedStatement() throws RecognitionException {
		ClosedStatementContext _localctx = new ClosedStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_closedStatement);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((ClosedStatementContext)_localctx).s1 = statementBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				((ClosedStatementContext)_localctx).conditionalStat = closedConditional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				((ClosedStatementContext)_localctx).s3 = statementClosedLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				((ClosedStatementContext)_localctx).s4 = statementWrite();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				((ClosedStatementContext)_localctx).s5 = statementAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				((ClosedStatementContext)_localctx).s6 = statementReturn();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				((ClosedStatementContext)_localctx).s7 = statementVarDef();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(176);
				((ClosedStatementContext)_localctx).s8 = statementContinue();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(177);
				((ClosedStatementContext)_localctx).s9 = statementBreak();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(178);
				((ClosedStatementContext)_localctx).incStat = statementInc();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(179);
				((ClosedStatementContext)_localctx).decStat = statementDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(180);
				match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClosedConditionalContext extends ParserRuleContext {
		public ExpressionContext ifExp;
		public ClosedStatementContext ifStat;
		public ExpressionContext elifExp;
		public ClosedStatementContext elifStat;
		public ClosedStatementContext elseStmt;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ClosedStatementContext> closedStatement() {
			return getRuleContexts(ClosedStatementContext.class);
		}
		public ClosedStatementContext closedStatement(int i) {
			return getRuleContext(ClosedStatementContext.class,i);
		}
		public ClosedConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterClosedConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitClosedConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitClosedConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosedConditionalContext closedConditional() throws RecognitionException {
		ClosedConditionalContext _localctx = new ClosedConditionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_closedConditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__14);
			setState(184);
			match(T__11);
			setState(185);
			((ClosedConditionalContext)_localctx).ifExp = expression();
			setState(186);
			match(T__12);
			setState(187);
			((ClosedConditionalContext)_localctx).ifStat = closedStatement();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(188);
				match(T__15);
				setState(189);
				match(T__11);
				setState(190);
				((ClosedConditionalContext)_localctx).elifExp = expression();
				setState(191);
				match(T__12);
				setState(192);
				((ClosedConditionalContext)_localctx).elifStat = closedStatement();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(T__16);
			setState(200);
			((ClosedConditionalContext)_localctx).elseStmt = closedStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenConditionalContext extends ParserRuleContext {
		public ExpressionContext ifExp;
		public StatementContext ifStat;
		public ClosedStatementContext secondIfStat;
		public ExpressionContext elifExp;
		public ClosedStatementContext elifStat;
		public ExpressionContext lastElifExp;
		public StatementContext lastElifStmt;
		public ClosedStatementContext thirdIfStat;
		public OpenStatementContext elseStmt;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ClosedStatementContext> closedStatement() {
			return getRuleContexts(ClosedStatementContext.class);
		}
		public ClosedStatementContext closedStatement(int i) {
			return getRuleContext(ClosedStatementContext.class,i);
		}
		public OpenStatementContext openStatement() {
			return getRuleContext(OpenStatementContext.class,0);
		}
		public OpenConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterOpenConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitOpenConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitOpenConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenConditionalContext openConditional() throws RecognitionException {
		OpenConditionalContext _localctx = new OpenConditionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_openConditional);
		int _la;
		try {
			int _alt;
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__14);
				setState(203);
				match(T__11);
				setState(204);
				((OpenConditionalContext)_localctx).ifExp = expression();
				setState(205);
				match(T__12);
				setState(206);
				((OpenConditionalContext)_localctx).ifStat = statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(208);
				match(T__14);
				setState(209);
				match(T__11);
				setState(210);
				((OpenConditionalContext)_localctx).ifExp = expression();
				setState(211);
				match(T__12);
				setState(212);
				((OpenConditionalContext)_localctx).secondIfStat = closedStatement();
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(213);
						match(T__15);
						setState(214);
						match(T__11);
						setState(215);
						((OpenConditionalContext)_localctx).elifExp = expression();
						setState(216);
						match(T__12);
						setState(217);
						((OpenConditionalContext)_localctx).elifStat = closedStatement();
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(224);
				match(T__15);
				setState(225);
				match(T__11);
				setState(226);
				((OpenConditionalContext)_localctx).lastElifExp = expression();
				setState(227);
				match(T__12);
				setState(228);
				((OpenConditionalContext)_localctx).lastElifStmt = statement();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(230);
				match(T__14);
				setState(231);
				match(T__11);
				setState(232);
				((OpenConditionalContext)_localctx).ifExp = expression();
				setState(233);
				match(T__12);
				setState(234);
				((OpenConditionalContext)_localctx).thirdIfStat = closedStatement();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(235);
					match(T__15);
					setState(236);
					match(T__11);
					setState(237);
					((OpenConditionalContext)_localctx).elifExp = expression();
					setState(238);
					match(T__12);
					setState(239);
					((OpenConditionalContext)_localctx).elifStat = closedStatement();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(T__16);
				setState(247);
				((OpenConditionalContext)_localctx).elseStmt = openStatement();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenStatementContext extends ParserRuleContext {
		public StatementOpenLoopContext s1;
		public OpenConditionalContext conditionalStat;
		public StatementOpenLoopContext statementOpenLoop() {
			return getRuleContext(StatementOpenLoopContext.class,0);
		}
		public OpenConditionalContext openConditional() {
			return getRuleContext(OpenConditionalContext.class,0);
		}
		public OpenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterOpenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitOpenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitOpenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenStatementContext openStatement() throws RecognitionException {
		OpenStatementContext _localctx = new OpenStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_openStatement);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				((OpenStatementContext)_localctx).s1 = statementOpenLoop();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				((OpenStatementContext)_localctx).conditionalStat = openConditional();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ClosedStatementContext s1;
		public OpenStatementContext s2;
		public ClosedStatementContext closedStatement() {
			return getRuleContext(ClosedStatementContext.class,0);
		}
		public OpenStatementContext openStatement() {
			return getRuleContext(OpenStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				((StatementContext)_localctx).s1 = closedStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((StatementContext)_localctx).s2 = openStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementVarDefContext extends ParserRuleContext {
		public Token i1;
		public ExpressionContext e1;
		public Token i2;
		public ExpressionContext e2;
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementVarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementVarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementVarDefContext statementVarDef() throws RecognitionException {
		StatementVarDefContext _localctx = new StatementVarDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statementVarDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__17);
			setState(260);
			((StatementVarDefContext)_localctx).i1 = match(ID);
			setState(261);
			match(T__18);
			setState(262);
			((StatementVarDefContext)_localctx).e1 = expression();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(263);
				match(T__6);
				setState(264);
				((StatementVarDefContext)_localctx).i2 = match(ID);
				setState(265);
				match(T__18);
				setState(266);
				((StatementVarDefContext)_localctx).e2 = expression();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBlockContext extends ParserRuleContext {
		public StatementContext s;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__19);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 12517424552513792L) != 0) {
				{
				{
				setState(275);
				((StatementBlockContext)_localctx).s = statement();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContinueContext extends ParserRuleContext {
		public Token myContinue;
		public StatementContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementContinue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContinueContext statementContinue() throws RecognitionException {
		StatementContinueContext _localctx = new StatementContinueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			((StatementContinueContext)_localctx).myContinue = match(T__20);
			setState(284);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBreakContext extends ParserRuleContext {
		public Token myBreak;
		public StatementBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBreakContext statementBreak() throws RecognitionException {
		StatementBreakContext _localctx = new StatementBreakContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			((StatementBreakContext)_localctx).myBreak = match(T__21);
			setState(287);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementReturnContext extends ParserRuleContext {
		public Token myReturn;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementReturnContext statementReturn() throws RecognitionException {
		StatementReturnContext _localctx = new StatementReturnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			((StatementReturnContext)_localctx).myReturn = match(T__22);
			setState(290);
			((StatementReturnContext)_localctx).e = expression();
			setState(291);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementClosedLoopContext extends ParserRuleContext {
		public ExpressionContext e;
		public ClosedStatementContext s;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClosedStatementContext closedStatement() {
			return getRuleContext(ClosedStatementContext.class,0);
		}
		public StatementClosedLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementClosedLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementClosedLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementClosedLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementClosedLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementClosedLoopContext statementClosedLoop() throws RecognitionException {
		StatementClosedLoopContext _localctx = new StatementClosedLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statementClosedLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__23);
			setState(294);
			match(T__11);
			setState(295);
			((StatementClosedLoopContext)_localctx).e = expression();
			setState(296);
			match(T__12);
			setState(297);
			((StatementClosedLoopContext)_localctx).s = closedStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementOpenLoopContext extends ParserRuleContext {
		public ExpressionContext e;
		public OpenStatementContext s;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OpenStatementContext openStatement() {
			return getRuleContext(OpenStatementContext.class,0);
		}
		public StatementOpenLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementOpenLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementOpenLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementOpenLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementOpenLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementOpenLoopContext statementOpenLoop() throws RecognitionException {
		StatementOpenLoopContext _localctx = new StatementOpenLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementOpenLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__23);
			setState(300);
			match(T__11);
			setState(301);
			((StatementOpenLoopContext)_localctx).e = expression();
			setState(302);
			match(T__12);
			setState(303);
			((StatementOpenLoopContext)_localctx).s = openStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementWriteContext extends ParserRuleContext {
		public Token printLine;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWriteContext statementWrite() throws RecognitionException {
		StatementWriteContext _localctx = new StatementWriteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statementWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			((StatementWriteContext)_localctx).printLine = match(T__24);
			setState(306);
			match(T__11);
			setState(307);
			((StatementWriteContext)_localctx).e = expression();
			setState(308);
			match(T__12);
			setState(309);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementAssignmentContext extends ParserRuleContext {
		public ExpressionContext left;
		public Token assignOp;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignmentContext statementAssignment() throws RecognitionException {
		StatementAssignmentContext _localctx = new StatementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			((StatementAssignmentContext)_localctx).left = expression();
			setState(312);
			((StatementAssignmentContext)_localctx).assignOp = match(T__18);
			setState(313);
			((StatementAssignmentContext)_localctx).right = expression();
			setState(314);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementIncContext extends ParserRuleContext {
		public ExpressionContext lvalExpr;
		public Token incOp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementIncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementInc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIncContext statementInc() throws RecognitionException {
		StatementIncContext _localctx = new StatementIncContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementInc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((StatementIncContext)_localctx).lvalExpr = expression();
			setState(317);
			((StatementIncContext)_localctx).incOp = match(T__25);
			setState(318);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementDecContext extends ParserRuleContext {
		public ExpressionContext lvalExpr;
		public Token decOp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementDecContext statementDec() throws RecognitionException {
		StatementDecContext _localctx = new StatementDecContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			((StatementDecContext)_localctx).lvalExpr = expression();
			setState(321);
			((StatementDecContext)_localctx).decOp = match(T__26);
			setState(322);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionOrContext e;
		public ExpressionOrContext expressionOr() {
			return getRuleContext(ExpressionOrContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			((ExpressionContext)_localctx).e = expressionOr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOrContext extends ParserRuleContext {
		public ExpressionAndContext a;
		public ExpressionOrTempContext ot;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOrContext expressionOr() throws RecognitionException {
		ExpressionOrContext _localctx = new ExpressionOrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			((ExpressionOrContext)_localctx).a = expressionAnd();
			setState(327);
			((ExpressionOrContext)_localctx).ot = expressionOrTemp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOrTempContext extends ParserRuleContext {
		public Token orOp;
		public ExpressionAndContext a;
		public ExpressionOrTempContext ot;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOrTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionOrTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionOrTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionOrTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOrTempContext expressionOrTemp() throws RecognitionException {
		ExpressionOrTempContext _localctx = new ExpressionOrTempContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionOrTemp);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				((ExpressionOrTempContext)_localctx).orOp = match(T__27);
				setState(330);
				((ExpressionOrTempContext)_localctx).a = expressionAnd();
				setState(331);
				((ExpressionOrTempContext)_localctx).ot = expressionOrTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAndContext extends ParserRuleContext {
		public ExpressionEqContext e;
		public ExpressionAndTempContext at;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAndContext expressionAnd() throws RecognitionException {
		ExpressionAndContext _localctx = new ExpressionAndContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			((ExpressionAndContext)_localctx).e = expressionEq();
			setState(337);
			((ExpressionAndContext)_localctx).at = expressionAndTemp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAndTempContext extends ParserRuleContext {
		public Token andOp;
		public ExpressionEqContext e;
		public ExpressionAndTempContext at;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAndTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionAndTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionAndTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionAndTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAndTempContext expressionAndTemp() throws RecognitionException {
		ExpressionAndTempContext _localctx = new ExpressionAndTempContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionAndTemp);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				((ExpressionAndTempContext)_localctx).andOp = match(T__28);
				setState(340);
				((ExpressionAndTempContext)_localctx).e = expressionEq();
				setState(341);
				((ExpressionAndTempContext)_localctx).at = expressionAndTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionEqContext extends ParserRuleContext {
		public ExpressionCmpContext c;
		public ExpressionEqTempContext et;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionEqContext expressionEq() throws RecognitionException {
		ExpressionEqContext _localctx = new ExpressionEqContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			((ExpressionEqContext)_localctx).c = expressionCmp();
			setState(347);
			((ExpressionEqContext)_localctx).et = expressionEqTemp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionEqTempContext extends ParserRuleContext {
		public Token eqOp;
		public Token neqOp;
		public ExpressionCmpContext c;
		public ExpressionEqTempContext et;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionEqTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionEqTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionEqTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionEqTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionEqTempContext expressionEqTemp() throws RecognitionException {
		ExpressionEqTempContext _localctx = new ExpressionEqTempContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionEqTemp);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(349);
					((ExpressionEqTempContext)_localctx).eqOp = match(T__29);
					}
					break;
				case T__30:
					{
					setState(350);
					((ExpressionEqTempContext)_localctx).neqOp = match(T__30);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(353);
				((ExpressionEqTempContext)_localctx).c = expressionCmp();
				setState(354);
				((ExpressionEqTempContext)_localctx).et = expressionEqTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionCmpContext extends ParserRuleContext {
		public ExpressionAddContext a;
		public ExpressionCmpTempContext ct;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionCmpContext expressionCmp() throws RecognitionException {
		ExpressionCmpContext _localctx = new ExpressionCmpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressionCmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((ExpressionCmpContext)_localctx).a = expressionAdd();
			setState(360);
			((ExpressionCmpContext)_localctx).ct = expressionCmpTemp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionCmpTempContext extends ParserRuleContext {
		public Token ltOp;
		public Token gtOp;
		public ExpressionAddContext a;
		public ExpressionCmpTempContext ct;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCmpTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionCmpTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionCmpTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionCmpTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionCmpTempContext expressionCmpTemp() throws RecognitionException {
		ExpressionCmpTempContext _localctx = new ExpressionCmpTempContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionCmpTemp);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__31:
					{
					setState(362);
					((ExpressionCmpTempContext)_localctx).ltOp = match(T__31);
					}
					break;
				case T__32:
					{
					setState(363);
					((ExpressionCmpTempContext)_localctx).gtOp = match(T__32);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(366);
				((ExpressionCmpTempContext)_localctx).a = expressionAdd();
				setState(367);
				((ExpressionCmpTempContext)_localctx).ct = expressionCmpTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAddContext extends ParserRuleContext {
		public ExpressionMultModContext m;
		public ExpressionAddTempContext at;
		public ExpressionMultModContext expressionMultMod() {
			return getRuleContext(ExpressionMultModContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAddContext expressionAdd() throws RecognitionException {
		ExpressionAddContext _localctx = new ExpressionAddContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressionAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			((ExpressionAddContext)_localctx).m = expressionMultMod();
			setState(373);
			((ExpressionAddContext)_localctx).at = expressionAddTemp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAddTempContext extends ParserRuleContext {
		public Token addOp;
		public Token subOp;
		public ExpressionMultModContext m;
		public ExpressionAddTempContext at;
		public ExpressionMultModContext expressionMultMod() {
			return getRuleContext(ExpressionMultModContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAddTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionAddTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionAddTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionAddTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAddTempContext expressionAddTemp() throws RecognitionException {
		ExpressionAddTempContext _localctx = new ExpressionAddTempContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionAddTemp);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__33:
					{
					setState(375);
					((ExpressionAddTempContext)_localctx).addOp = match(T__33);
					}
					break;
				case T__34:
					{
					setState(376);
					((ExpressionAddTempContext)_localctx).subOp = match(T__34);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(379);
				((ExpressionAddTempContext)_localctx).m = expressionMultMod();
				setState(380);
				((ExpressionAddTempContext)_localctx).at = expressionAddTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMultModContext extends ParserRuleContext {
		public ExpressionUnaryContext u;
		public ExpressionMultModTempContext mt;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultModTempContext expressionMultModTemp() {
			return getRuleContext(ExpressionMultModTempContext.class,0);
		}
		public ExpressionMultModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMultMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionMultMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionMultMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionMultMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMultModContext expressionMultMod() throws RecognitionException {
		ExpressionMultModContext _localctx = new ExpressionMultModContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionMultMod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			((ExpressionMultModContext)_localctx).u = expressionUnary();
			setState(386);
			((ExpressionMultModContext)_localctx).mt = expressionMultModTemp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMultModTempContext extends ParserRuleContext {
		public Token mulOp;
		public Token divOp;
		public Token modOp;
		public ExpressionUnaryContext u;
		public ExpressionMultModTempContext mt;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultModTempContext expressionMultModTemp() {
			return getRuleContext(ExpressionMultModTempContext.class,0);
		}
		public ExpressionMultModTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMultModTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionMultModTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionMultModTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionMultModTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMultModTempContext expressionMultModTemp() throws RecognitionException {
		ExpressionMultModTempContext _localctx = new ExpressionMultModTempContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressionMultModTemp);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(388);
					((ExpressionMultModTempContext)_localctx).mulOp = match(T__35);
					}
					break;
				case T__36:
					{
					setState(389);
					((ExpressionMultModTempContext)_localctx).divOp = match(T__36);
					}
					break;
				case T__37:
					{
					setState(390);
					((ExpressionMultModTempContext)_localctx).modOp = match(T__37);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(393);
				((ExpressionMultModTempContext)_localctx).u = expressionUnary();
				setState(394);
				((ExpressionMultModTempContext)_localctx).mt = expressionMultModTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionUnaryContext extends ParserRuleContext {
		public Token notOp;
		public Token negOp;
		public ExpressionUnaryContext u;
		public ExpressionMethodsContext m;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMethodsContext expressionMethods() {
			return getRuleContext(ExpressionMethodsContext.class,0);
		}
		public ExpressionUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionUnaryContext expressionUnary() throws RecognitionException {
		ExpressionUnaryContext _localctx = new ExpressionUnaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionUnary);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__38:
					{
					setState(399);
					((ExpressionUnaryContext)_localctx).notOp = match(T__38);
					}
					break;
				case T__34:
					{
					setState(400);
					((ExpressionUnaryContext)_localctx).negOp = match(T__34);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(403);
				((ExpressionUnaryContext)_localctx).u = expressionUnary();
				}
				break;
			case T__11:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case CONST_NUM:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				((ExpressionUnaryContext)_localctx).m = expressionMethods();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMethodsContext extends ParserRuleContext {
		public ExpressionOtherContext o;
		public ExpressionMethodsTempContext mt;
		public ExpressionOtherContext expressionOther() {
			return getRuleContext(ExpressionOtherContext.class,0);
		}
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public ExpressionMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMethodsContext expressionMethods() throws RecognitionException {
		ExpressionMethodsContext _localctx = new ExpressionMethodsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressionMethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			((ExpressionMethodsContext)_localctx).o = expressionOther();
			setState(408);
			((ExpressionMethodsContext)_localctx).mt = expressionMethodsTemp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMethodsTempContext extends ParserRuleContext {
		public Token dotOp;
		public Token i;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token ii;
		public Token leftBrace;
		public ExpressionContext e3;
		public ExpressionMethodsTempContext mt;
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionMethodsTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethodsTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionMethodsTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionMethodsTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionMethodsTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMethodsTempContext expressionMethodsTemp() throws RecognitionException {
		ExpressionMethodsTempContext _localctx = new ExpressionMethodsTempContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressionMethodsTemp);
		int _la;
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(410);
					((ExpressionMethodsTempContext)_localctx).dotOp = match(T__39);
					setState(411);
					((ExpressionMethodsTempContext)_localctx).i = match(ID);
					setState(412);
					match(T__11);
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((_la) & ~0x3f) == 0 && ((1L << _la) & 12517424486158336L) != 0) {
						{
						setState(413);
						((ExpressionMethodsTempContext)_localctx).e1 = expression();
						setState(418);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__6) {
							{
							{
							setState(414);
							match(T__6);
							setState(415);
							((ExpressionMethodsTempContext)_localctx).e2 = expression();
							}
							}
							setState(420);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(423);
					match(T__12);
					}
					break;
				case 2:
					{
					setState(424);
					((ExpressionMethodsTempContext)_localctx).dotOp = match(T__39);
					setState(425);
					((ExpressionMethodsTempContext)_localctx).ii = match(ID);
					}
					break;
				case 3:
					{
					setState(426);
					((ExpressionMethodsTempContext)_localctx).leftBrace = match(T__40);
					setState(427);
					((ExpressionMethodsTempContext)_localctx).e3 = expression();
					setState(428);
					match(T__41);
					}
					break;
				}
				setState(432);
				((ExpressionMethodsTempContext)_localctx).mt = expressionMethodsTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOtherContext extends ParserRuleContext {
		public Token n;
		public Token s;
		public Token newModifier;
		public SingleTypeContext st;
		public Token leftBrace;
		public ExpressionContext size;
		public Token i;
		public Token selfModifier;
		public Token trueModifier;
		public Token falseModifier;
		public Token i1;
		public Token i2;
		public ExpressionContext e;
		public Token leftPara;
		public ExpressionContext ee;
		public Token i3;
		public ExpressionContext e3;
		public ExpressionContext e4;
		public TerminalNode CONST_NUM() { return getToken(ToorlaParser.CONST_NUM, 0); }
		public TerminalNode CONST_STR() { return getToken(ToorlaParser.CONST_STR, 0); }
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public ExpressionOtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOther; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOtherContext expressionOther() throws RecognitionException {
		ExpressionOtherContext _localctx = new ExpressionOtherContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionOther);
		int _la;
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				((ExpressionOtherContext)_localctx).n = match(CONST_NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				((ExpressionOtherContext)_localctx).s = match(CONST_STR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				((ExpressionOtherContext)_localctx).newModifier = match(T__42);
				setState(439);
				((ExpressionOtherContext)_localctx).st = singleType();
				setState(440);
				((ExpressionOtherContext)_localctx).leftBrace = match(T__40);
				setState(441);
				((ExpressionOtherContext)_localctx).size = expression();
				setState(442);
				match(T__41);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				((ExpressionOtherContext)_localctx).newModifier = match(T__42);
				setState(445);
				((ExpressionOtherContext)_localctx).i = match(ID);
				setState(446);
				match(T__11);
				setState(447);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				((ExpressionOtherContext)_localctx).selfModifier = match(T__43);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(449);
				((ExpressionOtherContext)_localctx).trueModifier = match(T__44);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(450);
				((ExpressionOtherContext)_localctx).falseModifier = match(T__45);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(451);
				((ExpressionOtherContext)_localctx).i1 = match(ID);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(452);
				((ExpressionOtherContext)_localctx).i2 = match(ID);
				setState(453);
				((ExpressionOtherContext)_localctx).leftBrace = match(T__40);
				setState(454);
				((ExpressionOtherContext)_localctx).e = expression();
				setState(455);
				match(T__41);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(457);
				((ExpressionOtherContext)_localctx).leftPara = match(T__11);
				setState(458);
				((ExpressionOtherContext)_localctx).ee = expression();
				setState(459);
				match(T__12);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(461);
				((ExpressionOtherContext)_localctx).i3 = match(ID);
				setState(462);
				match(T__11);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 12517424486158336L) != 0) {
					{
					setState(463);
					((ExpressionOtherContext)_localctx).e3 = expression();
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(464);
						match(T__6);
						setState(465);
						((ExpressionOtherContext)_localctx).e4 = expression();
						}
						}
						setState(470);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(473);
				match(T__12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ToorlaTypeContext extends ParserRuleContext {
		public SingleTypeContext st;
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public ToorlaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toorlaType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterToorlaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitToorlaType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitToorlaType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToorlaTypeContext toorlaType() throws RecognitionException {
		ToorlaTypeContext _localctx = new ToorlaTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_toorlaType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			((ToorlaTypeContext)_localctx).st = singleType();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(477);
				match(T__40);
				setState(478);
				match(T__41);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTypeContext extends ParserRuleContext {
		public Token i;
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public SingleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterSingleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitSingleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitSingleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeContext singleType() throws RecognitionException {
		SingleTypeContext _localctx = new SingleTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_singleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				{
				setState(481);
				match(T__46);
				}
				break;
			case T__47:
				{
				setState(482);
				match(T__47);
				}
				break;
			case T__48:
				{
				setState(483);
				match(T__48);
				}
				break;
			case ID:
				{
				setState(484);
				((SingleTypeContext)_localctx).i = match(ID);
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

	public static final String _serializedATN =
		"\u0004\u00018\u01e8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0005\u0000V\b\u0000\n\u0000\f\u0000"+
		"Y\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000]\b\u0000\n\u0000\f\u0000"+
		"`\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001h\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001m\b\u0001\n\u0001\f\u0001p\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003x\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003~\b\u0003"+
		"\n\u0003\f\u0003\u0081\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0003\u0005\u0089\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0093\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u009a\b\u0005\n\u0005\f\u0005\u009d\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00a5\b\u0006\n\u0006\f\u0006\u00a8\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b6"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00c3\b\b\n\b\f\b\u00c6\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00dc\b\t\n\t\f\t\u00df\t\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00f2\b\t\n\t\f\t\u00f5"+
		"\t\t\u0001\t\u0001\t\u0001\t\u0003\t\u00fa\b\t\u0001\n\u0001\n\u0003\n"+
		"\u00fe\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u0102\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u010c\b\f\n"+
		"\f\f\f\u010f\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u0115\b\r\n\r"+
		"\f\r\u0118\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u014f\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0159\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u0160"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0166"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u016d\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0173\b\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0003!\u017a\b"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u0180\b!\u0001\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001#\u0003#\u0188\b#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u018e\b#\u0001$\u0001$\u0003$\u0192\b$\u0001$\u0001$\u0003$\u0196\b"+
		"$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005"+
		"&\u01a1\b&\n&\f&\u01a4\t&\u0003&\u01a6\b&\u0001&\u0001&\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0003&\u01af\b&\u0001&\u0001&\u0003&\u01b3\b&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u01d3\b\'\n\'\f\'\u01d6\t\'\u0003\'\u01d8\b"+
		"\'\u0001\'\u0003\'\u01db\b\'\u0001(\u0001(\u0001(\u0003(\u01e0\b(\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u01e6\b)\u0001)\u0000\u0000*\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPR\u0000\u0001\u0001\u0000\t\n\u01fe\u0000W\u0001"+
		"\u0000\u0000\u0000\u0002c\u0001\u0000\u0000\u0000\u0004s\u0001\u0000\u0000"+
		"\u0000\u0006w\u0001\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000\u0000"+
		"\n\u0088\u0001\u0000\u0000\u0000\f\u00a6\u0001\u0000\u0000\u0000\u000e"+
		"\u00b5\u0001\u0000\u0000\u0000\u0010\u00b7\u0001\u0000\u0000\u0000\u0012"+
		"\u00f9\u0001\u0000\u0000\u0000\u0014\u00fd\u0001\u0000\u0000\u0000\u0016"+
		"\u0101\u0001\u0000\u0000\u0000\u0018\u0103\u0001\u0000\u0000\u0000\u001a"+
		"\u0112\u0001\u0000\u0000\u0000\u001c\u011b\u0001\u0000\u0000\u0000\u001e"+
		"\u011e\u0001\u0000\u0000\u0000 \u0121\u0001\u0000\u0000\u0000\"\u0125"+
		"\u0001\u0000\u0000\u0000$\u012b\u0001\u0000\u0000\u0000&\u0131\u0001\u0000"+
		"\u0000\u0000(\u0137\u0001\u0000\u0000\u0000*\u013c\u0001\u0000\u0000\u0000"+
		",\u0140\u0001\u0000\u0000\u0000.\u0144\u0001\u0000\u0000\u00000\u0146"+
		"\u0001\u0000\u0000\u00002\u014e\u0001\u0000\u0000\u00004\u0150\u0001\u0000"+
		"\u0000\u00006\u0158\u0001\u0000\u0000\u00008\u015a\u0001\u0000\u0000\u0000"+
		":\u0165\u0001\u0000\u0000\u0000<\u0167\u0001\u0000\u0000\u0000>\u0172"+
		"\u0001\u0000\u0000\u0000@\u0174\u0001\u0000\u0000\u0000B\u017f\u0001\u0000"+
		"\u0000\u0000D\u0181\u0001\u0000\u0000\u0000F\u018d\u0001\u0000\u0000\u0000"+
		"H\u0195\u0001\u0000\u0000\u0000J\u0197\u0001\u0000\u0000\u0000L\u01b2"+
		"\u0001\u0000\u0000\u0000N\u01da\u0001\u0000\u0000\u0000P\u01dc\u0001\u0000"+
		"\u0000\u0000R\u01e5\u0001\u0000\u0000\u0000TV\u0003\u0002\u0001\u0000"+
		"UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000Z^\u0003\u0004\u0002\u0000[]\u0003\u0002\u0001\u0000\\[\u0001"+
		"\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0000\u0000\u0001b\u0001\u0001\u0000\u0000\u0000cd\u0005"+
		"\u0001\u0000\u0000dg\u00055\u0000\u0000ef\u0005\u0002\u0000\u0000fh\u0005"+
		"5\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000in\u0005\u0003\u0000\u0000jm\u0003\u0006\u0003\u0000"+
		"km\u0003\n\u0005\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000"+
		"mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\u0004"+
		"\u0000\u0000r\u0003\u0001\u0000\u0000\u0000st\u0005\u0005\u0000\u0000"+
		"tu\u0003\u0002\u0001\u0000u\u0005\u0001\u0000\u0000\u0000vx\u0003\b\u0004"+
		"\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0005\u0006\u0000\u0000z\u007f\u00055\u0000\u0000{|\u0005"+
		"\u0007\u0000\u0000|~\u00055\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0081"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0003P(\u0000\u0083\u0084\u0005\b\u0000"+
		"\u0000\u0084\u0007\u0001\u0000\u0000\u0000\u0085\u0086\u0007\u0000\u0000"+
		"\u0000\u0086\t\u0001\u0000\u0000\u0000\u0087\u0089\u0003\b\u0004\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u000b\u0000\u0000"+
		"\u008b\u008c\u00055\u0000\u0000\u008c\u0092\u0005\f\u0000\u0000\u008d"+
		"\u008e\u00055\u0000\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0090"+
		"\u0003P(\u0000\u0090\u0091\u0003\f\u0006\u0000\u0091\u0093\u0001\u0000"+
		"\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0005\r\u0000"+
		"\u0000\u0095\u0096\u0005\u000e\u0000\u0000\u0096\u0097\u0003P(\u0000\u0097"+
		"\u009b\u0005\u0003\u0000\u0000\u0098\u009a\u0003\u0016\u000b\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005\u0004\u0000\u0000\u009f\u000b\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0007\u0000\u0000\u00a1\u00a2\u00055\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0003\u0000\u0000\u00a3\u00a5\u0003P(\u0000\u00a4\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\r\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00b6\u0003\u001a\r\u0000"+
		"\u00aa\u00b6\u0003\u0010\b\u0000\u00ab\u00b6\u0003\"\u0011\u0000\u00ac"+
		"\u00b6\u0003&\u0013\u0000\u00ad\u00b6\u0003(\u0014\u0000\u00ae\u00b6\u0003"+
		" \u0010\u0000\u00af\u00b6\u0003\u0018\f\u0000\u00b0\u00b6\u0003\u001c"+
		"\u000e\u0000\u00b1\u00b6\u0003\u001e\u000f\u0000\u00b2\u00b6\u0003*\u0015"+
		"\u0000\u00b3\u00b6\u0003,\u0016\u0000\u00b4\u00b6\u0005\b\u0000\u0000"+
		"\u00b5\u00a9\u0001\u0000\u0000\u0000\u00b5\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b5\u00ab\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b5\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u000f\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u000f\u0000\u0000"+
		"\u00b8\u00b9\u0005\f\u0000\u0000\u00b9\u00ba\u0003.\u0017\u0000\u00ba"+
		"\u00bb\u0005\r\u0000\u0000\u00bb\u00c4\u0003\u000e\u0007\u0000\u00bc\u00bd"+
		"\u0005\u0010\u0000\u0000\u00bd\u00be\u0005\f\u0000\u0000\u00be\u00bf\u0003"+
		".\u0017\u0000\u00bf\u00c0\u0005\r\u0000\u0000\u00c0\u00c1\u0003\u000e"+
		"\u0007\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0011"+
		"\u0000\u0000\u00c8\u00c9\u0003\u000e\u0007\u0000\u00c9\u0011\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005\u000f\u0000\u0000\u00cb\u00cc\u0005\f\u0000"+
		"\u0000\u00cc\u00cd\u0003.\u0017\u0000\u00cd\u00ce\u0005\r\u0000\u0000"+
		"\u00ce\u00cf\u0003\u0016\u000b\u0000\u00cf\u00fa\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0005\u000f\u0000\u0000\u00d1\u00d2\u0005\f\u0000\u0000\u00d2"+
		"\u00d3\u0003.\u0017\u0000\u00d3\u00d4\u0005\r\u0000\u0000\u00d4\u00dd"+
		"\u0003\u000e\u0007\u0000\u00d5\u00d6\u0005\u0010\u0000\u0000\u00d6\u00d7"+
		"\u0005\f\u0000\u0000\u00d7\u00d8\u0003.\u0017\u0000\u00d8\u00d9\u0005"+
		"\r\u0000\u0000\u00d9\u00da\u0003\u000e\u0007\u0000\u00da\u00dc\u0001\u0000"+
		"\u0000\u0000\u00db\u00d5\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0005\u0010\u0000\u0000\u00e1\u00e2\u0005\f\u0000"+
		"\u0000\u00e2\u00e3\u0003.\u0017\u0000\u00e3\u00e4\u0005\r\u0000\u0000"+
		"\u00e4\u00e5\u0003\u0016\u000b\u0000\u00e5\u00fa\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005\u000f\u0000\u0000\u00e7\u00e8\u0005\f\u0000\u0000\u00e8"+
		"\u00e9\u0003.\u0017\u0000\u00e9\u00ea\u0005\r\u0000\u0000\u00ea\u00f3"+
		"\u0003\u000e\u0007\u0000\u00eb\u00ec\u0005\u0010\u0000\u0000\u00ec\u00ed"+
		"\u0005\f\u0000\u0000\u00ed\u00ee\u0003.\u0017\u0000\u00ee\u00ef\u0005"+
		"\r\u0000\u0000\u00ef\u00f0\u0003\u000e\u0007\u0000\u00f0\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f1\u00eb\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005\u0011\u0000\u0000\u00f7\u00f8\u0003\u0014"+
		"\n\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00f9\u00d0\u0001\u0000\u0000\u0000\u00f9\u00e6\u0001\u0000\u0000"+
		"\u0000\u00fa\u0013\u0001\u0000\u0000\u0000\u00fb\u00fe\u0003$\u0012\u0000"+
		"\u00fc\u00fe\u0003\u0012\t\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u0015\u0001\u0000\u0000\u0000\u00ff"+
		"\u0102\u0003\u000e\u0007\u0000\u0100\u0102\u0003\u0014\n\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0017"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0012\u0000\u0000\u0104\u0105"+
		"\u00055\u0000\u0000\u0105\u0106\u0005\u0013\u0000\u0000\u0106\u010d\u0003"+
		".\u0017\u0000\u0107\u0108\u0005\u0007\u0000\u0000\u0108\u0109\u00055\u0000"+
		"\u0000\u0109\u010a\u0005\u0013\u0000\u0000\u010a\u010c\u0003.\u0017\u0000"+
		"\u010b\u0107\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005\b\u0000\u0000\u0111\u0019\u0001\u0000\u0000\u0000\u0112"+
		"\u0116\u0005\u0014\u0000\u0000\u0113\u0115\u0003\u0016\u000b\u0000\u0114"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0119\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\u0004\u0000\u0000\u011a\u001b\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0005\u0015\u0000\u0000\u011c\u011d\u0005\b\u0000\u0000\u011d\u001d"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0016\u0000\u0000\u011f\u0120"+
		"\u0005\b\u0000\u0000\u0120\u001f\u0001\u0000\u0000\u0000\u0121\u0122\u0005"+
		"\u0017\u0000\u0000\u0122\u0123\u0003.\u0017\u0000\u0123\u0124\u0005\b"+
		"\u0000\u0000\u0124!\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0018\u0000"+
		"\u0000\u0126\u0127\u0005\f\u0000\u0000\u0127\u0128\u0003.\u0017\u0000"+
		"\u0128\u0129\u0005\r\u0000\u0000\u0129\u012a\u0003\u000e\u0007\u0000\u012a"+
		"#\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0018\u0000\u0000\u012c\u012d"+
		"\u0005\f\u0000\u0000\u012d\u012e\u0003.\u0017\u0000\u012e\u012f\u0005"+
		"\r\u0000\u0000\u012f\u0130\u0003\u0014\n\u0000\u0130%\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005\u0019\u0000\u0000\u0132\u0133\u0005\f\u0000\u0000"+
		"\u0133\u0134\u0003.\u0017\u0000\u0134\u0135\u0005\r\u0000\u0000\u0135"+
		"\u0136\u0005\b\u0000\u0000\u0136\'\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0003.\u0017\u0000\u0138\u0139\u0005\u0013\u0000\u0000\u0139\u013a\u0003"+
		".\u0017\u0000\u013a\u013b\u0005\b\u0000\u0000\u013b)\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0003.\u0017\u0000\u013d\u013e\u0005\u001a\u0000\u0000"+
		"\u013e\u013f\u0005\b\u0000\u0000\u013f+\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0003.\u0017\u0000\u0141\u0142\u0005\u001b\u0000\u0000\u0142\u0143"+
		"\u0005\b\u0000\u0000\u0143-\u0001\u0000\u0000\u0000\u0144\u0145\u0003"+
		"0\u0018\u0000\u0145/\u0001\u0000\u0000\u0000\u0146\u0147\u00034\u001a"+
		"\u0000\u0147\u0148\u00032\u0019\u0000\u01481\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0005\u001c\u0000\u0000\u014a\u014b\u00034\u001a\u0000\u014b\u014c"+
		"\u00032\u0019\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014f\u0001"+
		"\u0000\u0000\u0000\u014e\u0149\u0001\u0000\u0000\u0000\u014e\u014d\u0001"+
		"\u0000\u0000\u0000\u014f3\u0001\u0000\u0000\u0000\u0150\u0151\u00038\u001c"+
		"\u0000\u0151\u0152\u00036\u001b\u0000\u01525\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0005\u001d\u0000\u0000\u0154\u0155\u00038\u001c\u0000\u0155\u0156"+
		"\u00036\u001b\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0159\u0001"+
		"\u0000\u0000\u0000\u0158\u0153\u0001\u0000\u0000\u0000\u0158\u0157\u0001"+
		"\u0000\u0000\u0000\u01597\u0001\u0000\u0000\u0000\u015a\u015b\u0003<\u001e"+
		"\u0000\u015b\u015c\u0003:\u001d\u0000\u015c9\u0001\u0000\u0000\u0000\u015d"+
		"\u0160\u0005\u001e\u0000\u0000\u015e\u0160\u0005\u001f\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0003<\u001e\u0000\u0162\u0163"+
		"\u0003:\u001d\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0166\u0001"+
		"\u0000\u0000\u0000\u0165\u015f\u0001\u0000\u0000\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0166;\u0001\u0000\u0000\u0000\u0167\u0168\u0003@ "+
		"\u0000\u0168\u0169\u0003>\u001f\u0000\u0169=\u0001\u0000\u0000\u0000\u016a"+
		"\u016d\u0005 \u0000\u0000\u016b\u016d\u0005!\u0000\u0000\u016c\u016a\u0001"+
		"\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0003@ \u0000\u016f\u0170\u0003>\u001f"+
		"\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000\u0000"+
		"\u0000\u0172\u016c\u0001\u0000\u0000\u0000\u0172\u0171\u0001\u0000\u0000"+
		"\u0000\u0173?\u0001\u0000\u0000\u0000\u0174\u0175\u0003D\"\u0000\u0175"+
		"\u0176\u0003B!\u0000\u0176A\u0001\u0000\u0000\u0000\u0177\u017a\u0005"+
		"\"\u0000\u0000\u0178\u017a\u0005#\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0003D\"\u0000\u017c\u017d\u0003B!\u0000\u017d"+
		"\u0180\u0001\u0000\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f"+
		"\u0179\u0001\u0000\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180"+
		"C\u0001\u0000\u0000\u0000\u0181\u0182\u0003H$\u0000\u0182\u0183\u0003"+
		"F#\u0000\u0183E\u0001\u0000\u0000\u0000\u0184\u0188\u0005$\u0000\u0000"+
		"\u0185\u0188\u0005%\u0000\u0000\u0186\u0188\u0005&\u0000\u0000\u0187\u0184"+
		"\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0186"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0003H$\u0000\u018a\u018b\u0003F#\u0000\u018b\u018e\u0001\u0000\u0000"+
		"\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u0187\u0001\u0000\u0000"+
		"\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018eG\u0001\u0000\u0000\u0000"+
		"\u018f\u0192\u0005\'\u0000\u0000\u0190\u0192\u0005#\u0000\u0000\u0191"+
		"\u018f\u0001\u0000\u0000\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u0193\u0196\u0003H$\u0000\u0194\u0196\u0003"+
		"J%\u0000\u0195\u0191\u0001\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000"+
		"\u0000\u0196I\u0001\u0000\u0000\u0000\u0197\u0198\u0003N\'\u0000\u0198"+
		"\u0199\u0003L&\u0000\u0199K\u0001\u0000\u0000\u0000\u019a\u019b\u0005"+
		"(\u0000\u0000\u019b\u019c\u00055\u0000\u0000\u019c\u01a5\u0005\f\u0000"+
		"\u0000\u019d\u01a2\u0003.\u0017\u0000\u019e\u019f\u0005\u0007\u0000\u0000"+
		"\u019f\u01a1\u0003.\u0017\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a5\u019d\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		"\u01af\u0005\r\u0000\u0000\u01a8\u01a9\u0005(\u0000\u0000\u01a9\u01af"+
		"\u00055\u0000\u0000\u01aa\u01ab\u0005)\u0000\u0000\u01ab\u01ac\u0003."+
		"\u0017\u0000\u01ac\u01ad\u0005*\u0000\u0000\u01ad\u01af\u0001\u0000\u0000"+
		"\u0000\u01ae\u019a\u0001\u0000\u0000\u0000\u01ae\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ae\u01aa\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b3\u0003L&\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2"+
		"\u01ae\u0001\u0000\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3"+
		"M\u0001\u0000\u0000\u0000\u01b4\u01db\u00052\u0000\u0000\u01b5\u01db\u0005"+
		"3\u0000\u0000\u01b6\u01b7\u0005+\u0000\u0000\u01b7\u01b8\u0003R)\u0000"+
		"\u01b8\u01b9\u0005)\u0000\u0000\u01b9\u01ba\u0003.\u0017\u0000\u01ba\u01bb"+
		"\u0005*\u0000\u0000\u01bb\u01db\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005"+
		"+\u0000\u0000\u01bd\u01be\u00055\u0000\u0000\u01be\u01bf\u0005\f\u0000"+
		"\u0000\u01bf\u01db\u0005\r\u0000\u0000\u01c0\u01db\u0005,\u0000\u0000"+
		"\u01c1\u01db\u0005-\u0000\u0000\u01c2\u01db\u0005.\u0000\u0000\u01c3\u01db"+
		"\u00055\u0000\u0000\u01c4\u01c5\u00055\u0000\u0000\u01c5\u01c6\u0005)"+
		"\u0000\u0000\u01c6\u01c7\u0003.\u0017\u0000\u01c7\u01c8\u0005*\u0000\u0000"+
		"\u01c8\u01db\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\f\u0000\u0000\u01ca"+
		"\u01cb\u0003.\u0017\u0000\u01cb\u01cc\u0005\r\u0000\u0000\u01cc\u01db"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ce\u00055\u0000\u0000\u01ce\u01d7\u0005"+
		"\f\u0000\u0000\u01cf\u01d4\u0003.\u0017\u0000\u01d0\u01d1\u0005\u0007"+
		"\u0000\u0000\u01d1\u01d3\u0003.\u0017\u0000\u01d2\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000"+
		"\u0000\u01d9\u01db\u0005\r\u0000\u0000\u01da\u01b4\u0001\u0000\u0000\u0000"+
		"\u01da\u01b5\u0001\u0000\u0000\u0000\u01da\u01b6\u0001\u0000\u0000\u0000"+
		"\u01da\u01bc\u0001\u0000\u0000\u0000\u01da\u01c0\u0001\u0000\u0000\u0000"+
		"\u01da\u01c1\u0001\u0000\u0000\u0000\u01da\u01c2\u0001\u0000\u0000\u0000"+
		"\u01da\u01c3\u0001\u0000\u0000\u0000\u01da\u01c4\u0001\u0000\u0000\u0000"+
		"\u01da\u01c9\u0001\u0000\u0000\u0000\u01da\u01cd\u0001\u0000\u0000\u0000"+
		"\u01dbO\u0001\u0000\u0000\u0000\u01dc\u01df\u0003R)\u0000\u01dd\u01de"+
		"\u0005)\u0000\u0000\u01de\u01e0\u0005*\u0000\u0000\u01df\u01dd\u0001\u0000"+
		"\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0Q\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e6\u0005/\u0000\u0000\u01e2\u01e6\u00050\u0000\u0000\u01e3"+
		"\u01e6\u00051\u0000\u0000\u01e4\u01e6\u00055\u0000\u0000\u01e5\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6S\u0001\u0000"+
		"\u0000\u0000)W^glnw\u007f\u0088\u0092\u009b\u00a6\u00b5\u00c4\u00dd\u00f3"+
		"\u00f9\u00fd\u0101\u010d\u0116\u014e\u0158\u015f\u0165\u016c\u0172\u0179"+
		"\u017f\u0187\u018d\u0191\u0195\u01a2\u01a5\u01ae\u01b2\u01d4\u01d7\u01da"+
		"\u01df\u01e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}