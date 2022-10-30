// Generated from gp\project\Grammar.g4 by ANTLR 4.9.3
package gp.project;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IF=2, ELSE=3, WHILE=4, IN=5, OUT=6, PROGRAM=7, SEMI=8, LEFT_PAREN=9, 
		RIGHT_PAREN=10, LEFT_BRACE=11, RIGHT_BRACE=12, PLUS=13, MINUS=14, TIMES=15, 
		DIV=16, ASSIGN=17, GREATER_THEN=18, LESS_THEN=19, AND=20, OR=21, NOT=22, 
		EQUAL=23, NOT_EQUAL=24, ID=25, INT=26, WHITESPACE=27, NEWLINE=28;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simple_statement = 2, RULE_variable_declaration = 3, 
		RULE_io_functions = 4, RULE_block_statement = 5, RULE_conditional_statement = 6, 
		RULE_iteration_statement = 7, RULE_expression = 8, RULE_equation = 9, 
		RULE_factor = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simple_statement", "variable_declaration", "io_functions", 
			"block_statement", "conditional_statement", "iteration_statement", "expression", 
			"equation", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'()'", "'if'", "'else'", "'while'", "'in'", "'out'", "'program'", 
			"';'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'='", 
			"'>'", "'<'", "'&&'", "'||'", "'!'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "IF", "ELSE", "WHILE", "IN", "OUT", "PROGRAM", "SEMI", "LEFT_PAREN", 
			"RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "PLUS", "MINUS", "TIMES", 
			"DIV", "ASSIGN", "GREATER_THEN", "LESS_THEN", "AND", "OR", "NOT", "EQUAL", 
			"NOT_EQUAL", "ID", "INT", "WHITESPACE", "NEWLINE"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(GrammarParser.PROGRAM, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GrammarParser.LEFT_BRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GrammarParser.RIGHT_BRACE, 0); }
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(PROGRAM);
			setState(23);
			match(LEFT_BRACE);
			setState(24);
			statement(0);
			setState(25);
			match(RIGHT_BRACE);
			setState(26);
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

	public static class StatementContext extends ParserRuleContext {
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(29);
			simple_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(31);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(32);
					simple_statement();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Simple_statementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(GrammarParser.SEMI, 0); }
		public Io_functionsContext io_functions() {
			return getRuleContext(Io_functionsContext.class,0);
		}
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSimple_statement(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_statement);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(38);
				variable_declaration();
				setState(39);
				match(SEMI);
				}
				}
				break;
			case IN:
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(41);
				io_functions();
				setState(42);
				match(SEMI);
				}
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				block_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				conditional_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				iteration_statement();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
			setState(50);
			match(ASSIGN);
			setState(51);
			equation(0);
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

	public static class Io_functionsContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(GrammarParser.IN, 0); }
		public TerminalNode OUT() { return getToken(GrammarParser.OUT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GrammarParser.LEFT_PAREN, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GrammarParser.RIGHT_PAREN, 0); }
		public Io_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIo_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIo_functions(this);
		}
	}

	public final Io_functionsContext io_functions() throws RecognitionException {
		Io_functionsContext _localctx = new Io_functionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_io_functions);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(IN);
				setState(54);
				match(T__0);
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(OUT);
				setState(56);
				match(LEFT_PAREN);
				setState(57);
				factor();
				setState(58);
				match(RIGHT_PAREN);
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

	public static class Block_statementContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GrammarParser.LEFT_BRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GrammarParser.RIGHT_BRACE, 0); }
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock_statement(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LEFT_BRACE);
			setState(63);
			statement(0);
			setState(64);
			match(RIGHT_BRACE);
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GrammarParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GrammarParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> LEFT_BRACE() { return getTokens(GrammarParser.LEFT_BRACE); }
		public TerminalNode LEFT_BRACE(int i) {
			return getToken(GrammarParser.LEFT_BRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RIGHT_BRACE() { return getTokens(GrammarParser.RIGHT_BRACE); }
		public TerminalNode RIGHT_BRACE(int i) {
			return getToken(GrammarParser.RIGHT_BRACE, i);
		}
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConditional_statement(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IF);
			setState(67);
			match(LEFT_PAREN);
			setState(68);
			expression(0);
			setState(69);
			match(RIGHT_PAREN);
			setState(70);
			match(LEFT_BRACE);
			setState(71);
			statement(0);
			setState(72);
			match(RIGHT_BRACE);
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(73);
				match(ELSE);
				setState(79);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_BRACE:
					{
					setState(74);
					match(LEFT_BRACE);
					setState(75);
					statement(0);
					setState(76);
					match(RIGHT_BRACE);
					}
					break;
				case IF:
					{
					setState(78);
					conditional_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Iteration_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GrammarParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GrammarParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GrammarParser.LEFT_BRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GrammarParser.RIGHT_BRACE, 0); }
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_iteration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WHILE);
			setState(84);
			match(LEFT_PAREN);
			setState(85);
			expression(0);
			setState(86);
			match(RIGHT_PAREN);
			setState(87);
			match(LEFT_BRACE);
			setState(88);
			statement(0);
			setState(89);
			match(RIGHT_BRACE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GrammarParser.LEFT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GrammarParser.RIGHT_PAREN, 0); }
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public TerminalNode GREATER_THEN() { return getToken(GrammarParser.GREATER_THEN, 0); }
		public TerminalNode LESS_THEN() { return getToken(GrammarParser.LESS_THEN, 0); }
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(GrammarParser.NOT_EQUAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(92);
				match(LEFT_PAREN);
				setState(93);
				expression(0);
				setState(94);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(96);
				match(NOT);
				setState(97);
				expression(2);
				}
				break;
			case 3:
				{
				setState(98);
				equation(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(102);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(105);
						_la = _input.LA(1);
						if ( !(_la==GREATER_THEN || _la==LESS_THEN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(108);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(GrammarParser.LEFT_PAREN, 0); }
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GrammarParser.RIGHT_PAREN, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(GrammarParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(GrammarParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(GrammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(GrammarParser.MINUS, i);
		}
		public TerminalNode TIMES() { return getToken(GrammarParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		return equation(0);
	}

	private EquationContext equation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EquationContext _localctx = new EquationContext(_ctx, _parentState);
		EquationContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_equation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(116);
				match(LEFT_PAREN);
				setState(117);
				equation(0);
				setState(118);
				match(RIGHT_PAREN);
				}
				break;
			case PLUS:
			case MINUS:
			case ID:
			case INT:
				{
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(120);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new EquationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equation);
						setState(129);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(130);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						equation(5);
						}
						break;
					case 2:
						{
						_localctx = new EquationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equation);
						setState(132);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(133);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						equation(4);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 9:
			return equation_sempred((EquationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean equation_sempred(EquationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3$\n\3\f\3"+
		"\16\3\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\5\bT\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nf\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nq\n\n\f\n\16\nt\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13|\n\13\f\13\16\13\177\13\13\3\13\5\13\u0082\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d\13\13\3"+
		"\f\3\f\3\f\2\5\4\22\24\r\2\4\6\b\n\f\16\20\22\24\26\2\b\3\2\26\27\3\2"+
		"\24\25\3\2\31\32\3\2\17\20\3\2\21\22\3\2\33\34\2\u0096\2\30\3\2\2\2\4"+
		"\36\3\2\2\2\6\61\3\2\2\2\b\63\3\2\2\2\n>\3\2\2\2\f@\3\2\2\2\16D\3\2\2"+
		"\2\20U\3\2\2\2\22e\3\2\2\2\24\u0081\3\2\2\2\26\u008e\3\2\2\2\30\31\7\t"+
		"\2\2\31\32\7\r\2\2\32\33\5\4\3\2\33\34\7\16\2\2\34\35\7\2\2\3\35\3\3\2"+
		"\2\2\36\37\b\3\1\2\37 \5\6\4\2 %\3\2\2\2!\"\f\4\2\2\"$\5\6\4\2#!\3\2\2"+
		"\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2\2()\5\b\5\2)*\7"+
		"\n\2\2*\62\3\2\2\2+,\5\n\6\2,-\7\n\2\2-\62\3\2\2\2.\62\5\f\7\2/\62\5\16"+
		"\b\2\60\62\5\20\t\2\61(\3\2\2\2\61+\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61"+
		"\60\3\2\2\2\62\7\3\2\2\2\63\64\7\33\2\2\64\65\7\23\2\2\65\66\5\24\13\2"+
		"\66\t\3\2\2\2\678\7\7\2\28?\7\3\2\29:\7\b\2\2:;\7\13\2\2;<\5\26\f\2<="+
		"\7\f\2\2=?\3\2\2\2>\67\3\2\2\2>9\3\2\2\2?\13\3\2\2\2@A\7\r\2\2AB\5\4\3"+
		"\2BC\7\16\2\2C\r\3\2\2\2DE\7\4\2\2EF\7\13\2\2FG\5\22\n\2GH\7\f\2\2HI\7"+
		"\r\2\2IJ\5\4\3\2JS\7\16\2\2KQ\7\5\2\2LM\7\r\2\2MN\5\4\3\2NO\7\16\2\2O"+
		"R\3\2\2\2PR\5\16\b\2QL\3\2\2\2QP\3\2\2\2RT\3\2\2\2SK\3\2\2\2ST\3\2\2\2"+
		"T\17\3\2\2\2UV\7\6\2\2VW\7\13\2\2WX\5\22\n\2XY\7\f\2\2YZ\7\r\2\2Z[\5\4"+
		"\3\2[\\\7\16\2\2\\\21\3\2\2\2]^\b\n\1\2^_\7\13\2\2_`\5\22\n\2`a\7\f\2"+
		"\2af\3\2\2\2bc\7\30\2\2cf\5\22\n\4df\5\24\13\2e]\3\2\2\2eb\3\2\2\2ed\3"+
		"\2\2\2fr\3\2\2\2gh\f\b\2\2hi\t\2\2\2iq\5\22\n\tjk\f\7\2\2kl\t\3\2\2lq"+
		"\5\22\n\bmn\f\6\2\2no\t\4\2\2oq\5\22\n\7pg\3\2\2\2pj\3\2\2\2pm\3\2\2\2"+
		"qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\23\3\2\2\2tr\3\2\2\2uv\b\13\1\2vw\7\13"+
		"\2\2wx\5\24\13\2xy\7\f\2\2y\u0082\3\2\2\2z|\t\5\2\2{z\3\2\2\2|\177\3\2"+
		"\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\5\26"+
		"\f\2\u0081u\3\2\2\2\u0081}\3\2\2\2\u0082\u008b\3\2\2\2\u0083\u0084\f\6"+
		"\2\2\u0084\u0085\t\6\2\2\u0085\u008a\5\24\13\7\u0086\u0087\f\5\2\2\u0087"+
		"\u0088\t\5\2\2\u0088\u008a\5\24\13\6\u0089\u0083\3\2\2\2\u0089\u0086\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\25\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\t\7\2\2\u008f\27\3\2\2\2\16"+
		"%\61>QSepr}\u0081\u0089\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}