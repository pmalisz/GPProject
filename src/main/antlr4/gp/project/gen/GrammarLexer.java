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
		T__0=1, IF=2, ELSE=3, WHILE=4, IN=5, OUT=6, PROGRAM=7, SEMI=8, LEFT_PAREN=9, 
		RIGHT_PAREN=10, LEFT_BRACE=11, RIGHT_BRACE=12, PLUS=13, MINUS=14, TIMES=15, 
		DIV=16, ASSIGN=17, GREATER_THEN=18, LESS_THEN=19, AND=20, OR=21, NOT=22, 
		EQUAL=23, NOT_EQUAL=24, ID=25, INT=26, WHITESPACE=27, NEWLINE=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DIGIT", "LETTER", "IF", "ELSE", "WHILE", "IN", "OUT", "PROGRAM", 
			"SEMI", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "PLUS", 
			"MINUS", "TIMES", "DIV", "ASSIGN", "GREATER_THEN", "LESS_THEN", "AND", 
			"OR", "NOT", "EQUAL", "NOT_EQUAL", "ID", "INT", "WHITESPACE", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u008d"+
		"\n\34\f\34\16\34\u0090\13\34\3\35\6\35\u0093\n\35\r\35\16\35\u0094\3\36"+
		"\3\36\3\36\3\36\3\37\5\37\u009c\n\37\3\37\3\37\6\37\u00a0\n\37\r\37\16"+
		"\37\u00a1\3\37\3\37\2\2 \3\3\5\2\7\2\t\4\13\5\r\6\17\7\21\b\23\t\25\n"+
		"\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63"+
		"\31\65\32\67\339\34;\35=\36\3\2\5\3\2\62;\4\2C\\c|\4\2\13\13\"\"\2\u00a8"+
		"\2\3\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2"+
		"\2\2\5B\3\2\2\2\7D\3\2\2\2\tF\3\2\2\2\13I\3\2\2\2\rN\3\2\2\2\17T\3\2\2"+
		"\2\21W\3\2\2\2\23[\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2"+
		"\2\2\35k\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#q\3\2\2\2%s\3\2\2\2\'u\3\2\2\2"+
		")w\3\2\2\2+y\3\2\2\2-{\3\2\2\2/~\3\2\2\2\61\u0081\3\2\2\2\63\u0083\3\2"+
		"\2\2\65\u0086\3\2\2\2\67\u0089\3\2\2\29\u0092\3\2\2\2;\u0096\3\2\2\2="+
		"\u009f\3\2\2\2?@\7*\2\2@A\7+\2\2A\4\3\2\2\2BC\t\2\2\2C\6\3\2\2\2DE\t\3"+
		"\2\2E\b\3\2\2\2FG\7k\2\2GH\7h\2\2H\n\3\2\2\2IJ\7g\2\2JK\7n\2\2KL\7u\2"+
		"\2LM\7g\2\2M\f\3\2\2\2NO\7y\2\2OP\7j\2\2PQ\7k\2\2QR\7n\2\2RS\7g\2\2S\16"+
		"\3\2\2\2TU\7k\2\2UV\7p\2\2V\20\3\2\2\2WX\7q\2\2XY\7w\2\2YZ\7v\2\2Z\22"+
		"\3\2\2\2[\\\7r\2\2\\]\7t\2\2]^\7q\2\2^_\7i\2\2_`\7t\2\2`a\7c\2\2ab\7o"+
		"\2\2b\24\3\2\2\2cd\7=\2\2d\26\3\2\2\2ef\7*\2\2f\30\3\2\2\2gh\7+\2\2h\32"+
		"\3\2\2\2ij\7}\2\2j\34\3\2\2\2kl\7\177\2\2l\36\3\2\2\2mn\7-\2\2n \3\2\2"+
		"\2op\7/\2\2p\"\3\2\2\2qr\7,\2\2r$\3\2\2\2st\7\61\2\2t&\3\2\2\2uv\7?\2"+
		"\2v(\3\2\2\2wx\7@\2\2x*\3\2\2\2yz\7>\2\2z,\3\2\2\2{|\7(\2\2|}\7(\2\2}"+
		".\3\2\2\2~\177\7~\2\2\177\u0080\7~\2\2\u0080\60\3\2\2\2\u0081\u0082\7"+
		"#\2\2\u0082\62\3\2\2\2\u0083\u0084\7?\2\2\u0084\u0085\7?\2\2\u0085\64"+
		"\3\2\2\2\u0086\u0087\7#\2\2\u0087\u0088\7?\2\2\u0088\66\3\2\2\2\u0089"+
		"\u008e\5\7\4\2\u008a\u008d\5\7\4\2\u008b\u008d\5\5\3\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f8\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\5\5\3\2"+
		"\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095:\3\2\2\2\u0096\u0097\t\4\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\b\36\2\2\u0099<\3\2\2\2\u009a\u009c\7\17\2\2\u009b\u009a\3\2\2"+
		"\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\7\f\2\2\u009e\u00a0"+
		"\7\17\2\2\u009f\u009b\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\b\37\2\2\u00a4>\3\2\2\2\t\2\u008c\u008e\u0094\u009b\u009f\u00a1\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}