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
		T__33=1, T__32=2, T__31=3, T__30=4, T__29=5, T__28=6, T__27=7, T__26=8, 
		T__25=9, T__24=10, T__23=11, T__22=12, T__21=13, T__20=14, T__19=15, T__18=16, 
		T__17=17, T__16=18, T__15=19, T__14=20, T__13=21, T__12=22, T__11=23, 
		T__10=24, T__9=25, T__8=26, T__7=27, T__6=28, T__5=29, T__4=30, T__3=31, 
		T__2=32, T__1=33, T__0=34, IDENTIFIER=35, NUMERIC_LITERAL=36, STRING_LITERAL=37, 
		SPACES=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'from'", "'&'", "'select'", "','", "'-'", "'*'", "'or'", 
		"'('", "'<'", "'!='", "'<='", "'<<'", "'as'", "'by'", "'and'", "'order'", 
		"'>>'", "'%'", "'limit'", "'on'", "'.'", "')'", "'+'", "'inner'", "'<>'", 
		"'='", "'||'", "'>'", "'where'", "'/'", "'=='", "'>='", "'|'", "'join'", 
		"IDENTIFIER", "NUMERIC_LITERAL", "STRING_LITERAL", "SPACES"
	};
	public static final int
		RULE_select = 0, RULE_table_or_subquery = 1, RULE_from_clause = 2, RULE_expr = 3, 
		RULE_column = 4, RULE_table_name = 5, RULE_name = 6, RULE_constv = 7;
	public static final String[] ruleNames = {
		"select", "table_or_subquery", "from_clause", "expr", "column", "table_name", 
		"name", "constv"
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
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(AntlrSelectParser.NUMERIC_LITERAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AntlrSelectParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AntlrSelectParser.IDENTIFIER); }
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
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
			setState(16); match(T__31);
			setState(17); column();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(18); match(T__30);
				setState(19); column();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(25); match(T__33);
				setState(26); from_clause();
				setState(29);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(27); match(T__5);
					setState(28); expr(0);
					}
				}

				setState(41);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(31); match(T__18);
					setState(32); match(T__20);
					setState(33); match(IDENTIFIER);
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__30) {
						{
						{
						setState(34); match(T__30);
						setState(35); match(IDENTIFIER);
						}
						}
						setState(40);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(45);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(43); match(T__15);
					setState(44); match(NUMERIC_LITERAL);
					}
				}

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
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); table_name();
				setState(54);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__21) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(51);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(50); match(T__21);
						}
					}

					setState(53); name();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(T__26);
				setState(57); select();
				setState(58); match(T__12);
				setState(63);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__21) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(60);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(59); match(T__21);
						}
					}

					setState(62); name();
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
			setState(67); table_or_subquery();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__0) {
				{
				{
				setState(69);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(68); match(T__10);
					}
				}

				setState(71); match(T__0);
				setState(72); table_or_subquery();
				setState(73); match(T__14);
				setState(74); expr(0);
				}
				}
				setState(80);
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
		public ConstvContext constv() {
			return getRuleContext(ConstvContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
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
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(82); constv();
				}
				break;
			case 2:
				{
				setState(86);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(83); table_name();
					setState(84); match(T__13);
					}
					break;
				}
				setState(88); match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(89); match(T__26);
				setState(90); expr(0);
				setState(91); match(T__12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(119);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(96); match(T__7);
						setState(97); expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(99);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__16) | (1L << T__4))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(100); expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(102);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(103); expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(105);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__22) | (1L << T__17) | (1L << T__1))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(106); expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(108);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__23) | (1L << T__6) | (1L << T__2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(109); expr(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__9) | (1L << T__8) | (1L << T__3))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(112); expr(5);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(114); match(T__19);
						setState(115); expr(4);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(117); match(T__27);
						setState(118); expr(3);
						}
						break;
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ColumnContext extends ParserRuleContext {
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
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrSelectVisitor ) return ((AntlrSelectVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_column);
		int _la;
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); name();
				setState(132);
				switch (_input.LA(1)) {
				case T__13:
					{
					{
					setState(126); match(T__13);
					setState(127); match(T__28);
					}
					}
					break;
				case T__26:
				case T__21:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					{
					setState(129);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(128); match(T__21);
						}
					}

					setState(131); name();
					}
					}
					break;
				case T__33:
				case T__30:
				case T__12:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); match(T__26);
				setState(135); select();
				setState(136); match(T__12);
				setState(141);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__21) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(138);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(137); match(T__21);
						}
					}

					setState(140); name();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143); expr(0);
				setState(148);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__21) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(145);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(144); match(T__21);
						}
					}

					setState(147); name();
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
			setState(152); name();
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
			setState(160);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(STRING_LITERAL);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); match(T__26);
				setState(157); name();
				setState(158); match(T__12);
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

	public static class ConstvContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(AntlrSelectParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AntlrSelectParser.STRING_LITERAL, 0); }
		public ConstvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).enterConstv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrSelectListener ) ((AntlrSelectListener)listener).exitConstv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrSelectVisitor ) return ((AntlrSelectVisitor<? extends T>)visitor).visitConstv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstvContext constv() throws RecognitionException {
		ConstvContext _localctx = new ConstvContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2\'\n\2\f\2\16\2*\13\2\5\2,\n\2\3\2\3\2\5\2\60\n\2\5\2\62\n\2\3"+
		"\3\3\3\5\3\66\n\3\3\3\5\39\n\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\5\3B\n\3\5"+
		"\3D\n\3\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16\4R\13\4\3"+
		"\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5z\n\5\f\5\16\5}\13\5\3\6\3\6\3\6\3\6\3\6\5\6\u0084\n\6"+
		"\3\6\5\6\u0087\n\6\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\6\5\6\u0090\n\6\3\6"+
		"\3\6\5\6\u0094\n\6\3\6\5\6\u0097\n\6\5\6\u0099\n\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00a3\n\b\3\t\3\t\3\t\2\3\b\n\2\4\6\b\n\f\16\20\2\b\5"+
		"\2\b\b\24\24  \4\2\7\7\31\31\6\2\4\4\16\16\23\23##\6\2\13\13\r\r\36\36"+
		"\"\"\5\2\f\f\33\34!!\3\2&\'\u00c2\2\22\3\2\2\2\4C\3\2\2\2\6E\3\2\2\2\b"+
		"_\3\2\2\2\n\u0098\3\2\2\2\f\u009a\3\2\2\2\16\u00a2\3\2\2\2\20\u00a4\3"+
		"\2\2\2\22\23\7\5\2\2\23\30\5\n\6\2\24\25\7\6\2\2\25\27\5\n\6\2\26\24\3"+
		"\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\61\3\2\2\2\32\30\3"+
		"\2\2\2\33\34\7\3\2\2\34\37\5\6\4\2\35\36\7\37\2\2\36 \5\b\5\2\37\35\3"+
		"\2\2\2\37 \3\2\2\2 +\3\2\2\2!\"\7\22\2\2\"#\7\20\2\2#(\7%\2\2$%\7\6\2"+
		"\2%\'\7%\2\2&$\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3\2"+
		"\2\2+!\3\2\2\2+,\3\2\2\2,/\3\2\2\2-.\7\25\2\2.\60\7&\2\2/-\3\2\2\2/\60"+
		"\3\2\2\2\60\62\3\2\2\2\61\33\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\638\5"+
		"\f\7\2\64\66\7\17\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\679\5"+
		"\16\b\28\65\3\2\2\289\3\2\2\29D\3\2\2\2:;\7\n\2\2;<\5\2\2\2<A\7\30\2\2"+
		"=?\7\17\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@B\5\16\b\2A>\3\2\2\2AB\3\2\2"+
		"\2BD\3\2\2\2C\63\3\2\2\2C:\3\2\2\2D\5\3\2\2\2EP\5\4\3\2FH\7\32\2\2GF\3"+
		"\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7$\2\2JK\5\4\3\2KL\7\26\2\2LM\5\b\5\2MO\3"+
		"\2\2\2NG\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\7\3\2\2\2RP\3\2\2\2ST"+
		"\b\5\1\2T`\5\20\t\2UV\5\f\7\2VW\7\27\2\2WY\3\2\2\2XU\3\2\2\2XY\3\2\2\2"+
		"YZ\3\2\2\2Z`\7%\2\2[\\\7\n\2\2\\]\5\b\5\2]^\7\30\2\2^`\3\2\2\2_S\3\2\2"+
		"\2_X\3\2\2\2_[\3\2\2\2`{\3\2\2\2ab\f\13\2\2bc\7\35\2\2cz\5\b\5\fde\f\n"+
		"\2\2ef\t\2\2\2fz\5\b\5\13gh\f\t\2\2hi\t\3\2\2iz\5\b\5\njk\f\b\2\2kl\t"+
		"\4\2\2lz\5\b\5\tmn\f\7\2\2no\t\5\2\2oz\5\b\5\bpq\f\6\2\2qr\t\6\2\2rz\5"+
		"\b\5\7st\f\5\2\2tu\7\21\2\2uz\5\b\5\6vw\f\4\2\2wx\7\t\2\2xz\5\b\5\5ya"+
		"\3\2\2\2yd\3\2\2\2yg\3\2\2\2yj\3\2\2\2ym\3\2\2\2yp\3\2\2\2ys\3\2\2\2y"+
		"v\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\t\3\2\2\2}{\3\2\2\2~\u0099\7"+
		"\b\2\2\177\u0086\5\16\b\2\u0080\u0081\7\27\2\2\u0081\u0087\7\b\2\2\u0082"+
		"\u0084\7\17\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0087\5\16\b\2\u0086\u0080\3\2\2\2\u0086\u0083\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0099\3\2\2\2\u0088\u0089\7\n\2\2\u0089\u008a\5\2"+
		"\2\2\u008a\u008f\7\30\2\2\u008b\u008d\7\17\2\2\u008c\u008b\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\5\16\b\2\u008f\u008c\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0099\3\2\2\2\u0091\u0096\5\b\5\2\u0092"+
		"\u0094\7\17\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0097\5\16\b\2\u0096\u0093\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098~\3\2\2\2\u0098\177\3\2\2\2\u0098\u0088\3\2\2\2\u0098"+
		"\u0091\3\2\2\2\u0099\13\3\2\2\2\u009a\u009b\5\16\b\2\u009b\r\3\2\2\2\u009c"+
		"\u00a3\7%\2\2\u009d\u00a3\7\'\2\2\u009e\u009f\7\n\2\2\u009f\u00a0\5\16"+
		"\b\2\u00a0\u00a1\7\30\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2"+
		"\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\t\7\2"+
		"\2\u00a5\21\3\2\2\2\33\30\37(+/\61\658>ACGPX_y{\u0083\u0086\u008c\u008f"+
		"\u0093\u0096\u0098\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}