// Generated from me\ivanyu\IvyGrammar.g4 by ANTLR 4.3
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
public class IvyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, LVAL=8, RVAL=9, 
		QUOT=10, WS=11, STRING_LITERAL=12, IDENTIFIER=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "LVAL", "RVAL", 
		"QUOT", "WS", "STRING_LITERAL", "IDENTIFIER"
	};


	public IvyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IvyGrammar.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17m\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"J\n\t\3\n\3\n\3\n\3\n\3\n\5\nQ\n\n\3\13\3\13\3\f\6\fV\n\f\r\f\16\fW\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\7\r`\n\r\f\r\16\rc\13\r\3\r\3\r\3\16\3\16\7\16"+
		"i\n\16\f\16\16\16l\13\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\3\2\7\5\2\13\f\16\17\"\"\4\2$$^^\6\2\f\f\"\""+
		"$$^^\5\2C\\aac|\7\2\f\f\62;C\\aac|s\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2"+
		"\2\2\5(\3\2\2\2\7-\3\2\2\2\t\62\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\17"+
		"9\3\2\2\2\21I\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27U\3\2\2\2\31[\3\2\2\2"+
		"\33f\3\2\2\2\35\36\7f\2\2\36\37\7g\2\2\37 \7r\2\2 !\7g\2\2!\"\7p\2\2\""+
		"#\7f\2\2#$\7g\2\2$%\7p\2\2%&\7e\2\2&\'\7{\2\2\'\4\3\2\2\2()\7p\2\2)*\7"+
		"w\2\2*+\7n\2\2+,\7n\2\2,\6\3\2\2\2-.\7v\2\2./\7t\2\2/\60\7w\2\2\60\61"+
		"\7g\2\2\61\b\3\2\2\2\62\63\7\61\2\2\63\64\7@\2\2\64\n\3\2\2\2\65\66\7"+
		">\2\2\66\f\3\2\2\2\678\7?\2\28\16\3\2\2\29:\7h\2\2:;\7c\2\2;<\7n\2\2<"+
		"=\7u\2\2=>\7g\2\2>\20\3\2\2\2?@\7q\2\2@A\7t\2\2AJ\7i\2\2BC\7p\2\2CD\7"+
		"c\2\2DE\7o\2\2EJ\7g\2\2FG\7t\2\2GH\7g\2\2HJ\7x\2\2I?\3\2\2\2IB\3\2\2\2"+
		"IF\3\2\2\2J\22\3\2\2\2KL\5\25\13\2LM\5\31\r\2MN\5\25\13\2NQ\3\2\2\2OQ"+
		"\5\31\r\2PK\3\2\2\2PO\3\2\2\2Q\24\3\2\2\2RS\7$\2\2S\26\3\2\2\2TV\t\2\2"+
		"\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\b\f\2\2Z\30\3\2"+
		"\2\2[a\7$\2\2\\`\n\3\2\2]^\7^\2\2^`\t\4\2\2_\\\3\2\2\2_]\3\2\2\2`c\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7$\2\2e\32\3\2\2\2fj\t"+
		"\5\2\2gi\t\6\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\34\3\2\2\2l"+
		"j\3\2\2\2\t\2IPW_aj\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}