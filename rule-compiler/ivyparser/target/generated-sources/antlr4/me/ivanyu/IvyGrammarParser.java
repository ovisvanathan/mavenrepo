// Generated from me\ivanyu\IvyGrammar.g4 by ANTLR 4.3
package me.ivanyu;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IvyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, LVAL=8, RVAL=9, 
		QUOT=10, WS=11, STRING_LITERAL=12, IDENTIFIER=13, STRING=14, NUMBER=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'dependency'", "'null'", "'true'", "'/>'", "'<'", "'='", 
		"'false'", "LVAL", "RVAL", "'\"'", "WS", "STRING_LITERAL", "IDENTIFIER", 
		"STRING", "NUMBER"
	};
	public static final int
		RULE_ivy = 0, RULE_obj = 1, RULE_expr = 2, RULE_logical_expr = 3, RULE_value = 4;
	public static final String[] ruleNames = {
		"ivy", "obj", "expr", "logical_expr", "value"
	};

	@Override
	public String getGrammarFileName() { return "IvyGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IvyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IvyContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IvyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ivy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IvyGrammarListener ) ((IvyGrammarListener)listener).enterIvy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IvyGrammarListener ) ((IvyGrammarListener)listener).exitIvy(this);
		}
	}

	public final IvyContext ivy() throws RecognitionException {
		IvyContext _localctx = new IvyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ivy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); value();
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

	public static class ObjContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IvyGrammarListener ) ((IvyGrammarListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IvyGrammarListener ) ((IvyGrammarListener)listener).exitObj(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(T__2);
			setState(13); expr();
			setState(14); match(T__3);
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

	public static class ExprContext extends ParserRuleContext {
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IvyGrammarListener ) ((IvyGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IvyGrammarListener ) ((IvyGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); match(T__6);
			setState(17); logical_expr();
			setState(18); logical_expr();
			setState(19); logical_expr();
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

	public static class Logical_exprContext extends ParserRuleContext {
		public TerminalNode RVAL() { return getToken(IvyGrammarParser.RVAL, 0); }
		public TerminalNode LVAL() { return getToken(IvyGrammarParser.LVAL, 0); }
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IvyGrammarListener ) ((IvyGrammarListener)listener).enterLogical_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IvyGrammarListener ) ((IvyGrammarListener)listener).exitLogical_expr(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logical_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(21); match(LVAL);
			setState(22); match(T__1);
			setState(23); match(RVAL);
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

	public static class ValueContext extends ParserRuleContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode STRING() { return getToken(IvyGrammarParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(IvyGrammarParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IvyGrammarListener ) ((IvyGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IvyGrammarListener ) ((IvyGrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(31);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(25); match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(26); match(NUMBER);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(27); obj();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(28); match(T__4);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(29); match(T__0);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(30); match(T__5);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\"\n\6\3\6\2\2\7\2\4\6\b\n"+
		"\2\2#\2\f\3\2\2\2\4\16\3\2\2\2\6\22\3\2\2\2\b\27\3\2\2\2\n!\3\2\2\2\f"+
		"\r\5\n\6\2\r\3\3\2\2\2\16\17\7\7\2\2\17\20\5\6\4\2\20\21\7\6\2\2\21\5"+
		"\3\2\2\2\22\23\7\3\2\2\23\24\5\b\5\2\24\25\5\b\5\2\25\26\5\b\5\2\26\7"+
		"\3\2\2\2\27\30\7\n\2\2\30\31\7\b\2\2\31\32\7\13\2\2\32\t\3\2\2\2\33\""+
		"\7\20\2\2\34\"\7\21\2\2\35\"\5\4\3\2\36\"\7\5\2\2\37\"\7\t\2\2 \"\7\4"+
		"\2\2!\33\3\2\2\2!\34\3\2\2\2!\35\3\2\2\2!\36\3\2\2\2!\37\3\2\2\2! \3\2"+
		"\2\2\"\13\3\2\2\2\3!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}