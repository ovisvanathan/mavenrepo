// Generated from me\ivanyu\java\JavaIvyGrammar.g4 by ANTLR 4.3
package me.ivanyu.java;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaIvyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, WS=4, Backslash=5, Colon=6, Equals=7, Quote=8, 
		Stop=9, Dash=10, Underscore=11, At=12, Percent=13, Hash=14, Sdash=15, 
		Hat=16, Exclaim=17, Comment=18, LineBreak=19, Space=20, AlphaNum=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "WS", "Backslash", "Colon", "Equals", "Quote", 
		"Stop", "Dash", "Underscore", "At", "Percent", "Hash", "Sdash", "Hat", 
		"Exclaim", "Comment", "LineBreak", "Space", "AlphaNum"
	};


	public JavaIvyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaIvyGrammar.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\6\5?\n\5\r\5\16\5@\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\7\23a\n\23\f\23"+
		"\16\23d\13\23\3\24\5\24g\n\24\3\24\3\24\5\24k\n\24\3\25\3\25\3\26\3\26"+
		"\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\7\5\2\13\f\16\17\"\"\4\2##%"+
		"%\4\2\f\f\17\17\5\2\13\13\16\16\"\"\5\2\62;C\\c|s\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\58\3\2\2\2\7;\3\2\2\2\t>\3\2\2"+
		"\2\13D\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25N\3\2"+
		"\2\2\27P\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37X\3\2\2\2!Z\3\2"+
		"\2\2#\\\3\2\2\2%^\3\2\2\2\'j\3\2\2\2)l\3\2\2\2+n\3\2\2\2-.\7f\2\2./\7"+
		"g\2\2/\60\7r\2\2\60\61\7g\2\2\61\62\7p\2\2\62\63\7f\2\2\63\64\7g\2\2\64"+
		"\65\7p\2\2\65\66\7e\2\2\66\67\7{\2\2\67\4\3\2\2\289\7\61\2\29:\7@\2\2"+
		":\6\3\2\2\2;<\7>\2\2<\b\3\2\2\2=?\t\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2"+
		"\2@A\3\2\2\2AB\3\2\2\2BC\b\5\2\2C\n\3\2\2\2DE\7^\2\2E\f\3\2\2\2FG\7<\2"+
		"\2G\16\3\2\2\2HI\7?\2\2I\20\3\2\2\2JK\7$\2\2K\22\3\2\2\2LM\7\60\2\2M\24"+
		"\3\2\2\2NO\7/\2\2O\26\3\2\2\2PQ\7a\2\2Q\30\3\2\2\2RS\7B\2\2S\32\3\2\2"+
		"\2TU\7\'\2\2U\34\3\2\2\2VW\7%\2\2W\36\3\2\2\2XY\7&\2\2Y \3\2\2\2Z[\7`"+
		"\2\2[\"\3\2\2\2\\]\7#\2\2]$\3\2\2\2^b\t\3\2\2_a\n\4\2\2`_\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2c&\3\2\2\2db\3\2\2\2eg\7\17\2\2fe\3\2\2\2fg"+
		"\3\2\2\2gh\3\2\2\2hk\7\f\2\2ik\7\17\2\2jf\3\2\2\2ji\3\2\2\2k(\3\2\2\2"+
		"lm\t\5\2\2m*\3\2\2\2no\t\6\2\2o,\3\2\2\2\7\2@bfj\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}