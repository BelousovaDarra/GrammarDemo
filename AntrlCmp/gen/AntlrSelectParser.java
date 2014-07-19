// Generated from C:/Users/Andrey/IdeaProjects/GrammarDemo/AntrlCmp\AntlrSelect.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrSelectParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__30=1, T__29=2, T__28=3, T__27=4, T__26=5, T__25=6, T__24=7, T__23=8, 
		T__22=9, T__21=10, T__20=11, T__19=12, T__18=13, T__17=14, T__16=15, T__15=16, 
		T__14=17, T__13=18, T__12=19, T__11=20, T__10=21, T__9=22, T__8=23, T__7=24, 
		T__6=25, T__5=26, T__4=27, T__3=28, T__2=29, T__1=30, T__0=31, IDENTIFIER=32, 
		NUMERIC_LITERAL=33, STRING_LITERAL=34, SPACES=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'from'", "'&'", "'select'", "','", "'-'", "'*'", "'or'", 
		"'('", "'<'", "'!='", "'<='", "'<<'", "'as'", "'and'", "'>>'", "'%'", 
		"'on'", "')'", "'.'", "'+'", "'inner'", "'<>'", "'='", "'||'", "'>'", 
		"'where'", "'/'", "'=='", "'>='", "'|'", "'join'", "IDENTIFIER", "NUMERIC_LITERAL", 
		"STRING_LITERAL", "SPACES"
	};
	public static final int
		RULE_select = 0, RULE_table_or_subquery = 1, RULE_from_clause = 2, RULE_expr = 3, 
		RULE_result_column = 4, RULE_table_name = 5, RULE_name = 6, RULE_literal_value = 7;
	public static final String[] ruleNames = {
		"select", "table_or_subquery", "from_clause", "expr", "result_column", 
		"table_name", "name", "literal_value"
	};

	@Override
	public String getGrammarFileName() { return "AntlrSelect.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AntlrSelectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AntlrSelectParser.EOF, 0); }
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrSelectVisitor ) return ((AntlrSelectVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); match(T__28);
			setState(17); result_column();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(18); match(T__27);
				setState(19); result_column();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25); match(T__30);
			setState(26); from_clause();
			setState(29);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(27); match(T__5);
				setState(28); expr(0);
				}
			}

			setState(31); match(EOF);
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrSelectVisitor ) return ((AntlrSelectVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_table_or_subquery);
		int _la;
		try {
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); table_name();
				setState(38);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__18) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(35);
					_la = _input.LA(1);
					if (_la==T__18) {
						{
						setState(34); match(T__18);
						}
					}

					setState(37); name();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); match(T__23);
				setState(41); select();
				setState(42); match(T__13);
				setState(47);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__18) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(44);
					_la = _input.LA(1);
					if (_la==T__18) {
						{
						setState(43); match(T__18);
						}
					}

					setState(46); name();
					}
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

	public static class From_clauseContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrSelectVisitor ) return ((AntlrSelectVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); table_or_subquery();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__0) {
				{
				{
				setState(53);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(52); match(T__10);
					}
				}

				setState(55); match(T__0);
				setState(56); table_or_subquery();
				setState(57); match(T__14);
				setState(58); expr(0);
				}
				}
				setState(64);
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(AntlrSelectParser.IDENTIFIER, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrSelectVisitor ) return ((AntlrSelectVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(66); literal_value();
				}
				break;
			case 2:
				{
				setState(70);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(67); table_name();
					setState(68); match(T__12);
					}
					break;
				}
				setState(72); match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(73); match(T__23);
				setState(74); expr(0);
				setState(75); match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(80); match(T__7);
						setState(81); expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(83);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__15) | (1L << T__4))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(84); expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(86);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(87); expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(89);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__19) | (1L << T__16) | (1L << T__1))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(90); expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(92);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__20) | (1L << T__6) | (1L << T__2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(93); expr(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(95);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__9) | (1L << T__8) | (1L << T__3))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(96); expr(5);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(98); match(T__17);
						setState(99); expr(4);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(101); match(T__24);
						setState(102); expr(3);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Result_columnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrSelectVisitor ) return ((AntlrSelectVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_result_column);
		int _la;
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108); match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); name();
				setState(116);
				switch (_input.LA(1)) {
				case T__12:
					{
					{
					setState(110); match(T__12);
					setState(111); match(T__25);
					}
					}
					break;
				case T__23:
				case T__18:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					{
					setState(113);
					_la = _input.LA(1);
					if (_la==T__18) {
						{
						setState(112); match(T__18);
						}
					}

					setState(115); name();
					}
					}
					break;
				case T__30:
				case T__27:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(T__23);
				setState(119); select();
				setState(120); match(T__13);
				setState(125);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__18) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(122);
					_la = _input.LA(1);
					if (_la==T__18) {
						{
						setState(121); match(T__18);
						}
					}

					setState(124); name();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127); match(T__23);
				setState(128); expr(0);
				setState(129); match(T__13);
				setState(134);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__18) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(131);
					_la = _input.LA(1);
					if (_la==T__18) {
						{
						setState(130); match(T__18);
						}
					}

					setState(133); name();
					}
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

	public static class Table_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrSelectVisitor ) return ((AntlrSelectVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); name();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AntlrSelectParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AntlrSelectParser.STRING_LITERAL, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrSelectVisitor ) return ((AntlrSelectVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_name);
		try {
			setState(146);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); match(STRING_LITERAL);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(142); match(T__23);
				setState(143); name();
				setState(144); match(T__13);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(AntlrSelectParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AntlrSelectParser.STRING_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrSelectVisitor ) return ((AntlrSelectVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==NUMERIC_LITERAL || _la==STRING_LITERAL) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 9);
		case 1: return precpred(_ctx, 8);
		case 2: return precpred(_ctx, 7);
		case 3: return precpred(_ctx, 6);
		case 4: return precpred(_ctx, 5);
		case 5: return precpred(_ctx, 4);
		case 6: return precpred(_ctx, 3);
		case 7: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0099\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\3\3\3\3"+
		"\5\3&\n\3\3\3\5\3)\n\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\5\3\62\n\3\5\3\64"+
		"\n\3\3\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\5"+
		"\3\5\3\5\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\3\6\5"+
		"\6w\n\6\3\6\3\6\3\6\3\6\5\6}\n\6\3\6\5\6\u0080\n\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0086\n\6\3\6\5\6\u0089\n\6\5\6\u008b\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0095\n\b\3\t\3\t\3\t\2\3\b\n\2\4\6\b\n\f\16\20\2\b\5\2\b\b\22"+
		"\22\35\35\4\2\7\7\26\26\6\2\4\4\16\16\21\21  \6\2\13\13\r\r\33\33\37\37"+
		"\5\2\f\f\30\31\36\36\3\2#$\u00b0\2\22\3\2\2\2\4\63\3\2\2\2\6\65\3\2\2"+
		"\2\bO\3\2\2\2\n\u008a\3\2\2\2\f\u008c\3\2\2\2\16\u0094\3\2\2\2\20\u0096"+
		"\3\2\2\2\22\23\7\5\2\2\23\30\5\n\6\2\24\25\7\6\2\2\25\27\5\n\6\2\26\24"+
		"\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30"+
		"\3\2\2\2\33\34\7\3\2\2\34\37\5\6\4\2\35\36\7\34\2\2\36 \5\b\5\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\2\2\3\"\3\3\2\2\2#(\5\f\7\2$&\7\17"+
		"\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\')\5\16\b\2(%\3\2\2\2()\3\2\2\2)\64"+
		"\3\2\2\2*+\7\n\2\2+,\5\2\2\2,\61\7\24\2\2-/\7\17\2\2.-\3\2\2\2./\3\2\2"+
		"\2/\60\3\2\2\2\60\62\5\16\b\2\61.\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2"+
		"\63#\3\2\2\2\63*\3\2\2\2\64\5\3\2\2\2\65@\5\4\3\2\668\7\27\2\2\67\66\3"+
		"\2\2\2\678\3\2\2\289\3\2\2\29:\7!\2\2:;\5\4\3\2;<\7\23\2\2<=\5\b\5\2="+
		"?\3\2\2\2>\67\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\7\3\2\2\2B@\3\2\2"+
		"\2CD\b\5\1\2DP\5\20\t\2EF\5\f\7\2FG\7\25\2\2GI\3\2\2\2HE\3\2\2\2HI\3\2"+
		"\2\2IJ\3\2\2\2JP\7\"\2\2KL\7\n\2\2LM\5\b\5\2MN\7\24\2\2NP\3\2\2\2OC\3"+
		"\2\2\2OH\3\2\2\2OK\3\2\2\2Pk\3\2\2\2QR\f\13\2\2RS\7\32\2\2Sj\5\b\5\fT"+
		"U\f\n\2\2UV\t\2\2\2Vj\5\b\5\13WX\f\t\2\2XY\t\3\2\2Yj\5\b\5\nZ[\f\b\2\2"+
		"[\\\t\4\2\2\\j\5\b\5\t]^\f\7\2\2^_\t\5\2\2_j\5\b\5\b`a\f\6\2\2ab\t\6\2"+
		"\2bj\5\b\5\7cd\f\5\2\2de\7\20\2\2ej\5\b\5\6fg\f\4\2\2gh\7\t\2\2hj\5\b"+
		"\5\5iQ\3\2\2\2iT\3\2\2\2iW\3\2\2\2iZ\3\2\2\2i]\3\2\2\2i`\3\2\2\2ic\3\2"+
		"\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\t\3\2\2\2mk\3\2\2\2n\u008b"+
		"\7\b\2\2ov\5\16\b\2pq\7\25\2\2qw\7\b\2\2rt\7\17\2\2sr\3\2\2\2st\3\2\2"+
		"\2tu\3\2\2\2uw\5\16\b\2vp\3\2\2\2vs\3\2\2\2vw\3\2\2\2w\u008b\3\2\2\2x"+
		"y\7\n\2\2yz\5\2\2\2z\177\7\24\2\2{}\7\17\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2"+
		"\2\2~\u0080\5\16\b\2\177|\3\2\2\2\177\u0080\3\2\2\2\u0080\u008b\3\2\2"+
		"\2\u0081\u0082\7\n\2\2\u0082\u0083\5\b\5\2\u0083\u0088\7\24\2\2\u0084"+
		"\u0086\7\17\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0089\5\16\b\2\u0088\u0085\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\3\2\2\2\u008an\3\2\2\2\u008ao\3\2\2\2\u008ax\3\2\2\2\u008a\u0081"+
		"\3\2\2\2\u008b\13\3\2\2\2\u008c\u008d\5\16\b\2\u008d\r\3\2\2\2\u008e\u0095"+
		"\7\"\2\2\u008f\u0095\7$\2\2\u0090\u0091\7\n\2\2\u0091\u0092\5\16\b\2\u0092"+
		"\u0093\7\24\2\2\u0093\u0095\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3"+
		"\2\2\2\u0094\u0090\3\2\2\2\u0095\17\3\2\2\2\u0096\u0097\t\7\2\2\u0097"+
		"\21\3\2\2\2\27\30\37%(.\61\63\67@HOiksv|\177\u0085\u0088\u008a\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}