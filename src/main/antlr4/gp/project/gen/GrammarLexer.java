// Generated from C:/Users/Pawel/IdeaProjects/GPProject/src/main/antlr4/gp/project\Grammar.g4 by ANTLR 4.9.2
package gp.project.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, IN=4, OUT=5, PROGRAM=6, SEMI=7, LEFT_PAREN=8, RIGHT_PAREN=9, 
		LEFT_BRACE=10, RIGHT_BRACE=11, PLUS=12, MINUS=13, TIMES=14, DIV=15, ASSIGN=16, 
		GREATER_THEN=17, LESS_THEN=18, AND=19, OR=20, NOT=21, EQUAL=22, NOT_EQUAL=23, 
		ID=24, INT=25, WHITESPACE=26, NEWLINE=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "LETTER", "IF", "ELSE", "WHILE", "IN", "OUT", "PROGRAM", "SEMI", 
			"LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "PLUS", "MINUS", 
			"TIMES", "DIV", "ASSIGN", "GREATER_THEN", "LESS_THEN", "AND", "OR", "NOT", 
			"EQUAL", "NOT_EQUAL", "ID", "INT", "WHITESPACE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'in'", "'out'", "'program'", "';'", 
			"'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'='", "'>'", 
			"'<'", "'&&'", "'||'", "'!'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "IN", "OUT", "PROGRAM", "SEMI", "LEFT_PAREN", 
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u0088\n\33\f\33\16\33\u008b"+
		"\13\33\3\34\6\34\u008e\n\34\r\34\16\34\u008f\3\35\3\35\3\35\3\35\3\36"+
		"\5\36\u0097\n\36\3\36\3\36\6\36\u009b\n\36\r\36\16\36\u009c\3\36\3\36"+
		"\2\2\37\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35"+
		"\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34"+
		";\35\3\2\5\3\2\62;\4\2C\\c|\4\2\13\13\"\"\2\u00a3\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tD\3\2"+
		"\2\2\13I\3\2\2\2\rO\3\2\2\2\17R\3\2\2\2\21V\3\2\2\2\23^\3\2\2\2\25`\3"+
		"\2\2\2\27b\3\2\2\2\31d\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!l\3"+
		"\2\2\2#n\3\2\2\2%p\3\2\2\2\'r\3\2\2\2)t\3\2\2\2+v\3\2\2\2-y\3\2\2\2/|"+
		"\3\2\2\2\61~\3\2\2\2\63\u0081\3\2\2\2\65\u0084\3\2\2\2\67\u008d\3\2\2"+
		"\29\u0091\3\2\2\2;\u009a\3\2\2\2=>\t\2\2\2>\4\3\2\2\2?@\t\3\2\2@\6\3\2"+
		"\2\2AB\7k\2\2BC\7h\2\2C\b\3\2\2\2DE\7g\2\2EF\7n\2\2FG\7u\2\2GH\7g\2\2"+
		"H\n\3\2\2\2IJ\7y\2\2JK\7j\2\2KL\7k\2\2LM\7n\2\2MN\7g\2\2N\f\3\2\2\2OP"+
		"\7k\2\2PQ\7p\2\2Q\16\3\2\2\2RS\7q\2\2ST\7w\2\2TU\7v\2\2U\20\3\2\2\2VW"+
		"\7r\2\2WX\7t\2\2XY\7q\2\2YZ\7i\2\2Z[\7t\2\2[\\\7c\2\2\\]\7o\2\2]\22\3"+
		"\2\2\2^_\7=\2\2_\24\3\2\2\2`a\7*\2\2a\26\3\2\2\2bc\7+\2\2c\30\3\2\2\2"+
		"de\7}\2\2e\32\3\2\2\2fg\7\177\2\2g\34\3\2\2\2hi\7-\2\2i\36\3\2\2\2jk\7"+
		"/\2\2k \3\2\2\2lm\7,\2\2m\"\3\2\2\2no\7\61\2\2o$\3\2\2\2pq\7?\2\2q&\3"+
		"\2\2\2rs\7@\2\2s(\3\2\2\2tu\7>\2\2u*\3\2\2\2vw\7(\2\2wx\7(\2\2x,\3\2\2"+
		"\2yz\7~\2\2z{\7~\2\2{.\3\2\2\2|}\7#\2\2}\60\3\2\2\2~\177\7?\2\2\177\u0080"+
		"\7?\2\2\u0080\62\3\2\2\2\u0081\u0082\7#\2\2\u0082\u0083\7?\2\2\u0083\64"+
		"\3\2\2\2\u0084\u0089\5\5\3\2\u0085\u0088\5\5\3\2\u0086\u0088\5\3\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\66\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e"+
		"\5\3\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u00908\3\2\2\2\u0091\u0092\t\4\2\2\u0092\u0093\3\2\2\2"+
		"\u0093\u0094\b\35\2\2\u0094:\3\2\2\2\u0095\u0097\7\17\2\2\u0096\u0095"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\7\f\2\2\u0099"+
		"\u009b\7\17\2\2\u009a\u0096\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\b\36\2\2\u009f<\3\2\2\2\t\2\u0087\u0089\u008f\u0096\u009a\u009c"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}