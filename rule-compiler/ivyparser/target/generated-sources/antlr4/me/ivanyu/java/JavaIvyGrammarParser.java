// Generated from me\ivanyu\java\JavaIvyGrammar.g4 by ANTLR 4.3
package me.ivanyu.java;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaIvyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, WS=4, Backslash=5, Colon=6, Equals=7, Quote=8, 
		Stop=9, Dash=10, Underscore=11, At=12, Percent=13, Hash=14, Sdash=15, 
		Hat=16, Exclaim=17, Comment=18, LineBreak=19, Space=20, AlphaNum=21, AT=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'dependency'", "'/>'", "'<'", "WS", "'\\'", "':'", "'='", 
		"'\"'", "'.'", "'-'", "'_'", "'@'", "'%'", "'#'", "'$'", "'^'", "'!'", 
		"Comment", "LineBreak", "Space", "AlphaNum", "AT"
	};
	public static final int
		RULE_parse = 0, RULE_line = 1, RULE_dep = 2, RULE_keyValue = 3, RULE_key = 4, 
		RULE_keyChar = 5, RULE_separatorAndValue = 6, RULE_valueChar = 7, RULE_eol = 8;
	public static final String[] ruleNames = {
		"parse", "line", "dep", "keyValue", "key", "keyChar", "separatorAndValue", 
		"valueChar", "eol"
	};

	@Override
	public String getGrammarFileName() { return "JavaIvyGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaIvyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); line();
			setState(19); eol();
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

	public static class LineContext extends ParserRuleContext {
		public TerminalNode Space(int i) {
			return getToken(JavaIvyGrammarParser.Space, i);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(JavaIvyGrammarParser.Space); }
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public DepContext dep() {
			return getRuleContext(DepContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); match(T__0);
			setState(22); dep();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(23); match(Space);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29); keyValue();
			setState(30); keyValue();
			setState(31); keyValue();
			setState(32); match(T__1);
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

	public static class DepContext extends ParserRuleContext {
		public DepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).enterDep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).exitDep(this);
		}
	}

	public final DepContext dep() throws RecognitionException {
		DepContext _localctx = new DepContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(T__2);
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

	public static class KeyValueContext extends ParserRuleContext {
		public KeyContext key;
		public SeparatorAndValueContext separatorAndValue;
		public SeparatorAndValueContext separatorAndValue() {
			return getRuleContext(SeparatorAndValueContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).exitKeyValue(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); ((KeyValueContext)_localctx).key = key();
			setState(37); ((KeyValueContext)_localctx).separatorAndValue = separatorAndValue();

			       // Replace all escaped `=` and `:`
			       String k = (((KeyValueContext)_localctx).key!=null?_input.getText(((KeyValueContext)_localctx).key.start,((KeyValueContext)_localctx).key.stop):null).replace("\\:", ":").replace("\\=", "=");

			       // Remove the  separator, if it exists
			       String v = (((KeyValueContext)_localctx).separatorAndValue!=null?_input.getText(((KeyValueContext)_localctx).separatorAndValue.start,((KeyValueContext)_localctx).separatorAndValue.stop):null).replaceAll("^\\s*[:=]\\s*", "");

			       // Remove all escaped line breaks with trailing spaces
			       v = v.replaceAll("\\\\(\r?\n|\r)[ \t\f]*", "").trim();

			       System.out.println("\nkey   : `" + k + "`");
			       System.out.println("value : `" + v + "`");
			     
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

	public static class KeyContext extends ParserRuleContext {
		public KeyCharContext keyChar(int i) {
			return getRuleContext(KeyCharContext.class,i);
		}
		public List<KeyCharContext> keyChar() {
			return getRuleContexts(KeyCharContext.class);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40); keyChar();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Backslash || _la==AlphaNum );
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

	public static class KeyCharContext extends ParserRuleContext {
		public TerminalNode Backslash() { return getToken(JavaIvyGrammarParser.Backslash, 0); }
		public TerminalNode Colon() { return getToken(JavaIvyGrammarParser.Colon, 0); }
		public TerminalNode AlphaNum() { return getToken(JavaIvyGrammarParser.AlphaNum, 0); }
		public TerminalNode Equals() { return getToken(JavaIvyGrammarParser.Equals, 0); }
		public KeyCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).enterKeyChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).exitKeyChar(this);
		}
	}

	public final KeyCharContext keyChar() throws RecognitionException {
		KeyCharContext _localctx = new KeyCharContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_keyChar);
		int _la;
		try {
			setState(48);
			switch (_input.LA(1)) {
			case AlphaNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); match(AlphaNum);
				}
				break;
			case Backslash:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); match(Backslash);
				setState(47);
				_la = _input.LA(1);
				if ( !(_la==Colon || _la==Equals) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class SeparatorAndValueContext extends ParserRuleContext {
		public TerminalNode Quote(int i) {
			return getToken(JavaIvyGrammarParser.Quote, i);
		}
		public List<ValueCharContext> valueChar() {
			return getRuleContexts(ValueCharContext.class);
		}
		public ValueCharContext valueChar(int i) {
			return getRuleContext(ValueCharContext.class,i);
		}
		public List<TerminalNode> Quote() { return getTokens(JavaIvyGrammarParser.Quote); }
		public TerminalNode Space() { return getToken(JavaIvyGrammarParser.Space, 0); }
		public TerminalNode Colon() { return getToken(JavaIvyGrammarParser.Colon, 0); }
		public TerminalNode Equals() { return getToken(JavaIvyGrammarParser.Equals, 0); }
		public SeparatorAndValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separatorAndValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).enterSeparatorAndValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).exitSeparatorAndValue(this);
		}
	}

	public final SeparatorAndValueContext separatorAndValue() throws RecognitionException {
		SeparatorAndValueContext _localctx = new SeparatorAndValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_separatorAndValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Colon) | (1L << Equals) | (1L << Space))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(51); match(Quote);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52); valueChar();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Backslash) | (1L << Colon) | (1L << Equals) | (1L << Stop) | (1L << Dash) | (1L << Underscore) | (1L << Percent) | (1L << Hash) | (1L << Sdash) | (1L << Hat) | (1L << Exclaim) | (1L << Space) | (1L << AlphaNum) | (1L << AT))) != 0) );
			setState(57); match(Quote);
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

	public static class ValueCharContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaIvyGrammarParser.AT, 0); }
		public TerminalNode Backslash() { return getToken(JavaIvyGrammarParser.Backslash, 0); }
		public TerminalNode Stop() { return getToken(JavaIvyGrammarParser.Stop, 0); }
		public TerminalNode Hat() { return getToken(JavaIvyGrammarParser.Hat, 0); }
		public TerminalNode Dash() { return getToken(JavaIvyGrammarParser.Dash, 0); }
		public TerminalNode Hash() { return getToken(JavaIvyGrammarParser.Hash, 0); }
		public TerminalNode Exclaim() { return getToken(JavaIvyGrammarParser.Exclaim, 0); }
		public TerminalNode Colon() { return getToken(JavaIvyGrammarParser.Colon, 0); }
		public TerminalNode AlphaNum() { return getToken(JavaIvyGrammarParser.AlphaNum, 0); }
		public TerminalNode Sdash() { return getToken(JavaIvyGrammarParser.Sdash, 0); }
		public TerminalNode Underscore() { return getToken(JavaIvyGrammarParser.Underscore, 0); }
		public TerminalNode LineBreak() { return getToken(JavaIvyGrammarParser.LineBreak, 0); }
		public TerminalNode Space() { return getToken(JavaIvyGrammarParser.Space, 0); }
		public TerminalNode Percent() { return getToken(JavaIvyGrammarParser.Percent, 0); }
		public TerminalNode Equals() { return getToken(JavaIvyGrammarParser.Equals, 0); }
		public ValueCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).enterValueChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).exitValueChar(this);
		}
	}

	public final ValueCharContext valueChar() throws RecognitionException {
		ValueCharContext _localctx = new ValueCharContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valueChar);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case AlphaNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); match(AlphaNum);
				}
				break;
			case Space:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); match(Space);
				}
				break;
			case Backslash:
				enterOuterAlt(_localctx, 3);
				{
				setState(61); match(Backslash);
				setState(62); match(LineBreak);
				}
				break;
			case Equals:
				enterOuterAlt(_localctx, 4);
				{
				setState(63); match(Equals);
				}
				break;
			case Colon:
				enterOuterAlt(_localctx, 5);
				{
				setState(64); match(Colon);
				}
				break;
			case Dash:
				enterOuterAlt(_localctx, 6);
				{
				setState(65); match(Dash);
				}
				break;
			case Stop:
				enterOuterAlt(_localctx, 7);
				{
				setState(66); match(Stop);
				}
				break;
			case Underscore:
				enterOuterAlt(_localctx, 8);
				{
				setState(67); match(Underscore);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 9);
				{
				setState(68); match(AT);
				}
				break;
			case Percent:
				enterOuterAlt(_localctx, 10);
				{
				setState(69); match(Percent);
				}
				break;
			case Hash:
				enterOuterAlt(_localctx, 11);
				{
				setState(70); match(Hash);
				}
				break;
			case Sdash:
				enterOuterAlt(_localctx, 12);
				{
				setState(71); match(Sdash);
				}
				break;
			case Hat:
				enterOuterAlt(_localctx, 13);
				{
				setState(72); match(Hat);
				}
				break;
			case Exclaim:
				enterOuterAlt(_localctx, 14);
				{
				setState(73); match(Exclaim);
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

	public static class EolContext extends ParserRuleContext {
		public TerminalNode LineBreak() { return getToken(JavaIvyGrammarParser.LineBreak, 0); }
		public TerminalNode EOF() { return getToken(JavaIvyGrammarParser.EOF, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaIvyGrammarListener ) ((JavaIvyGrammarListener)listener).exitEol(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==LineBreak) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\6\6,\n\6\r\6\16\6-\3\7\3\7\3\7\5\7\63\n\7\3\b\3\b\3"+
		"\b\6\b8\n\b\r\b\16\b9\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\tM\n\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22"+
		"\2\5\3\2\b\t\4\2\b\t\26\26\3\3\25\25X\2\24\3\2\2\2\4\27\3\2\2\2\6$\3\2"+
		"\2\2\b&\3\2\2\2\n+\3\2\2\2\f\62\3\2\2\2\16\64\3\2\2\2\20L\3\2\2\2\22N"+
		"\3\2\2\2\24\25\5\4\3\2\25\26\5\22\n\2\26\3\3\2\2\2\27\30\7\5\2\2\30\34"+
		"\5\6\4\2\31\33\7\26\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35"+
		"\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \5\b\5\2 !\5\b\5\2!\"\5\b\5\2"+
		"\"#\7\4\2\2#\5\3\2\2\2$%\7\3\2\2%\7\3\2\2\2&\'\5\n\6\2\'(\5\16\b\2()\b"+
		"\5\1\2)\t\3\2\2\2*,\5\f\7\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\13"+
		"\3\2\2\2/\63\7\27\2\2\60\61\7\7\2\2\61\63\t\2\2\2\62/\3\2\2\2\62\60\3"+
		"\2\2\2\63\r\3\2\2\2\64\65\t\3\2\2\65\67\7\n\2\2\668\5\20\t\2\67\66\3\2"+
		"\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\n\2\2<\17\3\2\2\2="+
		"M\7\27\2\2>M\7\26\2\2?@\7\7\2\2@M\7\25\2\2AM\7\t\2\2BM\7\b\2\2CM\7\f\2"+
		"\2DM\7\13\2\2EM\7\r\2\2FM\7\30\2\2GM\7\17\2\2HM\7\20\2\2IM\7\21\2\2JM"+
		"\7\22\2\2KM\7\23\2\2L=\3\2\2\2L>\3\2\2\2L?\3\2\2\2LA\3\2\2\2LB\3\2\2\2"+
		"LC\3\2\2\2LD\3\2\2\2LE\3\2\2\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2"+
		"LJ\3\2\2\2LK\3\2\2\2M\21\3\2\2\2NO\t\4\2\2O\23\3\2\2\2\7\34-\629L";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}