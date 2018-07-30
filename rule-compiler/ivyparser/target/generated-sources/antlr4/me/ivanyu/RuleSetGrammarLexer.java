// Generated from me\ivanyu\RuleSetGrammar.g4 by ANTLR 4.3
package me.ivanyu;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleSetGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, AND=3, OR=4, TRUE=5, FALSE=6, MULT=7, DIV=8, PLUS=9, MINUS=10, 
		GT=11, GE=12, LT=13, LE=14, EQ=15, LPAREN=16, RPAREN=17, DECIMAL=18, IDENTIFIER=19, 
		SEMI=20, COMMENT=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"IF", "THEN", "AND", "OR", "TRUE", "FALSE", "MULT", "DIV", "PLUS", "MINUS", 
		"GT", "GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", 
		"SEMI", "COMMENT", "WS"
	};


	public RuleSetGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RuleSetGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\5\23"+
		"c\n\23\3\23\6\23f\n\23\r\23\16\23g\3\23\3\23\6\23l\n\23\r\23\16\23m\5"+
		"\23p\n\23\3\24\3\24\7\24t\n\24\f\24\16\24w\13\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\6\26\177\n\26\r\26\16\26\u0080\3\26\5\26\u0084\n\26\3\26\3\26"+
		"\3\27\6\27\u0089\n\27\r\27\16\27\u008a\3\27\3\27\3\u0080\2\30\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\3"+
		"\f\f\5\2\13\f\16\17\"\"\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\62\3\2\2\2\7\67\3\2\2\2\t;\3\2\2\2\13"+
		">\3\2\2\2\rC\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27"+
		"Q\3\2\2\2\31S\3\2\2\2\33V\3\2\2\2\35X\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#_"+
		"\3\2\2\2%b\3\2\2\2\'q\3\2\2\2)x\3\2\2\2+z\3\2\2\2-\u0088\3\2\2\2/\60\7"+
		"k\2\2\60\61\7h\2\2\61\4\3\2\2\2\62\63\7v\2\2\63\64\7j\2\2\64\65\7g\2\2"+
		"\65\66\7p\2\2\66\6\3\2\2\2\678\7c\2\289\7p\2\29:\7f\2\2:\b\3\2\2\2;<\7"+
		"q\2\2<=\7t\2\2=\n\3\2\2\2>?\7v\2\2?@\7t\2\2@A\7w\2\2AB\7g\2\2B\f\3\2\2"+
		"\2CD\7h\2\2DE\7c\2\2EF\7n\2\2FG\7u\2\2GH\7g\2\2H\16\3\2\2\2IJ\7,\2\2J"+
		"\20\3\2\2\2KL\7\61\2\2L\22\3\2\2\2MN\7-\2\2N\24\3\2\2\2OP\7/\2\2P\26\3"+
		"\2\2\2QR\7@\2\2R\30\3\2\2\2ST\7@\2\2TU\7?\2\2U\32\3\2\2\2VW\7>\2\2W\34"+
		"\3\2\2\2XY\7>\2\2YZ\7?\2\2Z\36\3\2\2\2[\\\7?\2\2\\ \3\2\2\2]^\7*\2\2^"+
		"\"\3\2\2\2_`\7+\2\2`$\3\2\2\2ac\7/\2\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2d"+
		"f\t\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2ho\3\2\2\2ik\7\60\2\2"+
		"jl\t\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2oi\3\2\2\2"+
		"op\3\2\2\2p&\3\2\2\2qu\t\3\2\2rt\t\4\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2"+
		"uv\3\2\2\2v(\3\2\2\2wu\3\2\2\2xy\7=\2\2y*\3\2\2\2z{\7\61\2\2{|\7\61\2"+
		"\2|~\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\t\5\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\26\2\2\u0086,\3\2\2\2\u0087"+
		"\u0089\t\6\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\27\2\2\u008d"+
		".\3\2\2\2\13\2bgmou\u0080\u0083\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}