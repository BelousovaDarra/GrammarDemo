// Generated from C:/Users/Andrey/IdeaProjects/GrammarDemo/AntrlCmp\SQLSelect.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLSelectParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_ANALYZE=31, 
		K_AND=32, K_AS=33, K_ASC=34, K_ATTACH=35, K_AUTOINCREMENT=36, K_BEFORE=37, 
		K_BEGIN=38, K_BETWEEN=39, K_BY=40, K_CASCADE=41, K_CASE=42, K_CAST=43, 
		K_CHECK=44, K_COLLATE=45, K_COLUMN=46, K_COMMIT=47, K_CONFLICT=48, K_CONSTRAINT=49, 
		K_CREATE=50, K_CROSS=51, K_CURRENT_DATE=52, K_CURRENT_TIME=53, K_CURRENT_TIMESTAMP=54, 
		K_DATABASE=55, K_DEFAULT=56, K_DEFERRABLE=57, K_DEFERRED=58, K_DELETE=59, 
		K_DESC=60, K_DETACH=61, K_DISTINCT=62, K_DROP=63, K_EACH=64, K_ELSE=65, 
		K_END=66, K_ESCAPE=67, K_EXCEPT=68, K_EXCLUSIVE=69, K_EXISTS=70, K_EXPLAIN=71, 
		K_FAIL=72, K_FOR=73, K_FOREIGN=74, K_FROM=75, K_FULL=76, K_GLOB=77, K_GROUP=78, 
		K_HAVING=79, K_IF=80, K_IGNORE=81, K_IMMEDIATE=82, K_IN=83, K_INDEX=84, 
		K_INDEXED=85, K_INITIALLY=86, K_INNER=87, K_INSERT=88, K_INSTEAD=89, K_INTERSECT=90, 
		K_INTO=91, K_IS=92, K_ISNULL=93, K_JOIN=94, K_KEY=95, K_LEFT=96, K_LIKE=97, 
		K_LIMIT=98, K_MATCH=99, K_NATURAL=100, K_NO=101, K_NOT=102, K_NOTNULL=103, 
		K_NULL=104, K_OF=105, K_OFFSET=106, K_ON=107, K_OR=108, K_ORDER=109, K_OUTER=110, 
		K_PLAN=111, K_PRAGMA=112, K_PRIMARY=113, K_QUERY=114, K_RAISE=115, K_RECURSIVE=116, 
		K_REFERENCES=117, K_REGEXP=118, K_REINDEX=119, K_RELEASE=120, K_RENAME=121, 
		K_REPLACE=122, K_RESTRICT=123, K_RIGHT=124, K_ROLLBACK=125, K_ROW=126, 
		K_SAVEPOINT=127, K_SELECT=128, K_SET=129, K_TABLE=130, K_TEMP=131, K_TEMPORARY=132, 
		K_THEN=133, K_TO=134, K_TRANSACTION=135, K_TRIGGER=136, K_UNION=137, K_UNIQUE=138, 
		K_UPDATE=139, K_USING=140, K_VACUUM=141, K_VALUES=142, K_VIEW=143, K_VIRTUAL=144, 
		K_WHEN=145, K_WHERE=146, K_WITH=147, K_WITHOUT=148, IDENTIFIER=149, NUMERIC_LITERAL=150, 
		BIND_PARAMETER=151, STRING_LITERAL=152, BLOB_LITERAL=153, SINGLE_LINE_COMMENT=154, 
		MULTILINE_COMMENT=155, SPACES=156, UNEXPECTED_CHAR=157;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
		"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
		"'>'", "'>='", "'=='", "'!='", "'<>'", "K_ABORT", "K_ACTION", "K_ADD", 
		"K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", 
		"K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", 
		"K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", 
		"K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", "K_CURRENT_DATE", 
		"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", 
		"K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", 
		"K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", 
		"K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", 
		"K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", 
		"K_INDEXED", "K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", 
		"K_INTO", "K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
		"K_MATCH", "K_NATURAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
		"K_OFFSET", "K_ON", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", 
		"K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", "K_REGEXP", 
		"K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", 
		"K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", 
		"K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", 
		"K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", 
		"K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "IDENTIFIER", 
		"NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", 
		"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
	};
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5, RULE_attach_stmt = 6, 
		RULE_begin_stmt = 7, RULE_commit_stmt = 8, RULE_compound_select_stmt = 9, 
		RULE_create_index_stmt = 10, RULE_create_table_stmt = 11, RULE_create_trigger_stmt = 12, 
		RULE_create_view_stmt = 13, RULE_create_virtual_table_stmt = 14, RULE_delete_stmt = 15, 
		RULE_delete_stmt_limited = 16, RULE_detach_stmt = 17, RULE_drop_index_stmt = 18, 
		RULE_drop_table_stmt = 19, RULE_drop_trigger_stmt = 20, RULE_drop_view_stmt = 21, 
		RULE_factored_select_stmt = 22, RULE_insert_stmt = 23, RULE_pragma_stmt = 24, 
		RULE_reindex_stmt = 25, RULE_release_stmt = 26, RULE_rollback_stmt = 27, 
		RULE_savepoint_stmt = 28, RULE_simple_select_stmt = 29, RULE_select_stmt = 30, 
		RULE_select_or_values = 31, RULE_update_stmt = 32, RULE_update_stmt_limited = 33, 
		RULE_vacuum_stmt = 34, RULE_column_def = 35, RULE_type_name = 36, RULE_column_constraint = 37, 
		RULE_conflict_clause = 38, RULE_expr = 39, RULE_foreign_key_clause = 40, 
		RULE_raise_function = 41, RULE_indexed_column = 42, RULE_table_constraint = 43, 
		RULE_with_clause = 44, RULE_qualified_table_name = 45, RULE_ordering_term = 46, 
		RULE_pragma_value = 47, RULE_common_table_expression = 48, RULE_result_column = 49, 
		RULE_table_or_subquery = 50, RULE_join_clause = 51, RULE_join_operator = 52, 
		RULE_join_constraint = 53, RULE_select_core = 54, RULE_compound_operator = 55, 
		RULE_cte_table_name = 56, RULE_signed_number = 57, RULE_literal_value = 58, 
		RULE_unary_operator = 59, RULE_error_message = 60, RULE_module_argument = 61, 
		RULE_column_alias = 62, RULE_keyword = 63, RULE_name = 64, RULE_function_name = 65, 
		RULE_database_name = 66, RULE_table_name = 67, RULE_table_or_index_name = 68, 
		RULE_new_table_name = 69, RULE_column_name = 70, RULE_collation_name = 71, 
		RULE_foreign_table = 72, RULE_index_name = 73, RULE_trigger_name = 74, 
		RULE_view_name = 75, RULE_module_name = 76, RULE_pragma_name = 77, RULE_savepoint_name = 78, 
		RULE_table_alias = 79, RULE_transaction_name = 80, RULE_any_name = 81;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
		"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
		"create_table_stmt", "create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
		"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
		"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", "factored_select_stmt", 
		"insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", 
		"savepoint_stmt", "simple_select_stmt", "select_stmt", "select_or_values", 
		"update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", "type_name", 
		"column_constraint", "conflict_clause", "expr", "foreign_key_clause", 
		"raise_function", "indexed_column", "table_constraint", "with_clause", 
		"qualified_table_name", "ordering_term", "pragma_value", "common_table_expression", 
		"result_column", "table_or_subquery", "join_clause", "join_operator", 
		"join_constraint", "select_core", "compound_operator", "cte_table_name", 
		"signed_number", "literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "name", "function_name", "database_name", "table_name", 
		"table_or_index_name", "new_table_name", "column_name", "collation_name", 
		"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
		"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name"
	};

	@Override
	public String getGrammarFileName() { return "SQLSelect.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLSelectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public TerminalNode EOF() { return getToken(SQLSelectParser.EOF, 0); }
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SELECT - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_WITH - 128)) | (1L << (UNEXPECTED_CHAR - 128)))) != 0)) {
				{
				setState(166);
				switch (_input.LA(1)) {
				case SCOL:
				case K_SELECT:
				case K_VALUES:
				case K_WITH:
					{
					setState(164); sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(165); error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171); match(EOF);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLSelectParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); ((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(176); match(SCOL);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182); sql_stmt();
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(183); match(SCOL);
						}
						}
						setState(186); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(188); sql_stmt();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194); match(SCOL);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(200); simple_select_stmt();
				}
				break;
			case 2:
				{
				setState(201); select_stmt();
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLSelectParser.K_ADD, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLSelectParser.K_ALTER, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLSelectParser.K_RENAME, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TABLE() { return getToken(SQLSelectParser.K_TABLE, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(SQLSelectParser.K_COLUMN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_TO() { return getToken(SQLSelectParser.K_TO, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(K_ALTER);
			setState(205); match(K_TABLE);
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(206); database_name();
				setState(207); match(DOT);
				}
				break;
			}
			setState(211); table_name();
			setState(220);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(212); match(K_RENAME);
				setState(213); match(K_TO);
				setState(214); new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(215); match(K_ADD);
				setState(217);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(216); match(K_COLUMN);
					}
					break;
				}
				setState(219); column_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Analyze_stmtContext extends ParserRuleContext {
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_ANALYZE() { return getToken(SQLSelectParser.K_ANALYZE, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(K_ANALYZE);
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(223); database_name();
				}
				break;
			case 2:
				{
				setState(224); table_or_index_name();
				}
				break;
			case 3:
				{
				setState(225); database_name();
				setState(226); match(DOT);
				setState(227); table_or_index_name();
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

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DATABASE() { return getToken(SQLSelectParser.K_DATABASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLSelectParser.K_AS, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLSelectParser.K_ATTACH, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(K_ATTACH);
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(232); match(K_DATABASE);
				}
				break;
			}
			setState(235); expr(0);
			setState(236); match(K_AS);
			setState(237); database_name();
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

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLSelectParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLSelectParser.K_IMMEDIATE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLSelectParser.K_DEFERRED, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLSelectParser.K_BEGIN, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_TRANSACTION() { return getToken(SQLSelectParser.K_TRANSACTION, 0); }
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(K_BEGIN);
			setState(241);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) {
				{
				setState(240);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(247);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(243); match(K_TRANSACTION);
				setState(245);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH) | (1L << K_DISTINCT) | (1L << K_DROP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_ROW - 64)) | (1L << (K_SAVEPOINT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(244); transaction_name();
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

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SQLSelectParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SQLSelectParser.K_END, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_TRANSACTION() { return getToken(SQLSelectParser.K_TRANSACTION, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(254);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(250); match(K_TRANSACTION);
				setState(252);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH) | (1L << K_DISTINCT) | (1L << K_DROP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_ROW - 64)) | (1L << (K_SAVEPOINT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(251); transaction_name();
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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(SQLSelectParser.K_ORDER, 0); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SQLSelectParser.K_INTERSECT, i);
		}
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SQLSelectParser.K_EXCEPT, i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLSelectParser.K_LIMIT, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SQLSelectParser.K_ALL); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLSelectParser.K_RECURSIVE, 0); }
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SQLSelectParser.K_INTERSECT); }
		public TerminalNode K_UNION(int i) {
			return getToken(SQLSelectParser.K_UNION, i);
		}
		public TerminalNode K_BY() { return getToken(SQLSelectParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SQLSelectParser.K_EXCEPT); }
		public List<TerminalNode> K_UNION() { return getTokens(SQLSelectParser.K_UNION); }
		public TerminalNode K_WITH() { return getToken(SQLSelectParser.K_WITH, 0); }
		public TerminalNode K_ALL(int i) {
			return getToken(SQLSelectParser.K_ALL, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLSelectParser.K_OFFSET, 0); }
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(256); match(K_WITH);
				setState(258);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(257); match(K_RECURSIVE);
					}
					break;
				}
				setState(260); common_table_expression();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(261); match(COMMA);
					setState(262); common_table_expression();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(270); select_core();
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(271); match(K_UNION);
					setState(273);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(272); match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(275); match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(276); match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(279); select_core();
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(294);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(284); match(K_ORDER);
				setState(285); match(K_BY);
				setState(286); ordering_term();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(287); match(COMMA);
					setState(288); ordering_term();
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(302);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(296); match(K_LIMIT);
				setState(297); expr(0);
				setState(300);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(298);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(299); expr(0);
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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_INDEX() { return getToken(SQLSelectParser.K_INDEX, 0); }
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode K_ON() { return getToken(SQLSelectParser.K_ON, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLSelectParser.K_CREATE, 0); }
		public TerminalNode K_IF() { return getToken(SQLSelectParser.K_IF, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLSelectParser.K_WHERE, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLSelectParser.K_UNIQUE, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLSelectParser.K_EXISTS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); match(K_CREATE);
			setState(306);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(305); match(K_UNIQUE);
				}
			}

			setState(308); match(K_INDEX);
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(309); match(K_IF);
				setState(310); match(K_NOT);
				setState(311); match(K_EXISTS);
				}
				break;
			}
			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(314); database_name();
				setState(315); match(DOT);
				}
				break;
			}
			setState(319); index_name();
			setState(320); match(K_ON);
			setState(321); table_name();
			setState(322); match(OPEN_PAR);
			setState(323); indexed_column();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(324); match(COMMA);
				setState(325); indexed_column();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331); match(CLOSE_PAR);
			setState(334);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(332); match(K_WHERE);
				setState(333); expr(0);
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(SQLSelectParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public TerminalNode K_TABLE() { return getToken(SQLSelectParser.K_TABLE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLSelectParser.K_CREATE, 0); }
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode K_IF() { return getToken(SQLSelectParser.K_IF, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLSelectParser.K_TEMPORARY, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLSelectParser.K_WITHOUT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLSelectParser.K_EXISTS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLSelectParser.IDENTIFIER, 0); }
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_TEMP() { return getToken(SQLSelectParser.K_TEMP, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(K_CREATE);
			setState(338);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(340); match(K_TABLE);
			setState(344);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(341); match(K_IF);
				setState(342); match(K_NOT);
				setState(343); match(K_EXISTS);
				}
				break;
			}
			setState(349);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(346); database_name();
				setState(347); match(DOT);
				}
				break;
			}
			setState(351); table_name();
			setState(375);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(352); match(OPEN_PAR);
				setState(353); column_def();
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(354); match(COMMA);
						setState(355); column_def();
						}
						} 
					}
					setState(360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(361); match(COMMA);
					setState(362); table_constraint();
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(368); match(CLOSE_PAR);
				setState(371);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(369); match(K_WITHOUT);
					setState(370); match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(373); match(K_AS);
				setState(374); select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public TerminalNode K_TRIGGER() { return getToken(SQLSelectParser.K_TRIGGER, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_FOR() { return getToken(SQLSelectParser.K_FOR, 0); }
		public TerminalNode K_ON() { return getToken(SQLSelectParser.K_ON, 0); }
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public TerminalNode K_END() { return getToken(SQLSelectParser.K_END, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLSelectParser.K_AFTER, 0); }
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public TerminalNode K_IF() { return getToken(SQLSelectParser.K_IF, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLSelectParser.K_CREATE, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLSelectParser.K_EXISTS, 0); }
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public TerminalNode K_WHEN() { return getToken(SQLSelectParser.K_WHEN, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLSelectParser.K_TEMP, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLSelectParser.K_INSTEAD, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public TerminalNode K_INSERT() { return getToken(SQLSelectParser.K_INSERT, 0); }
		public TerminalNode K_EACH() { return getToken(SQLSelectParser.K_EACH, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public TerminalNode K_OF(int i) {
			return getToken(SQLSelectParser.K_OF, i);
		}
		public TerminalNode K_DELETE() { return getToken(SQLSelectParser.K_DELETE, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLSelectParser.K_TEMPORARY, 0); }
		public TerminalNode K_ROW() { return getToken(SQLSelectParser.K_ROW, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLSelectParser.K_BEGIN, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLSelectParser.K_BEFORE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLSelectParser.K_UPDATE, 0); }
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public List<TerminalNode> K_OF() { return getTokens(SQLSelectParser.K_OF); }
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); match(K_CREATE);
			setState(379);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(378);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(381); match(K_TRIGGER);
			setState(385);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(382); match(K_IF);
				setState(383); match(K_NOT);
				setState(384); match(K_EXISTS);
				}
				break;
			}
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(387); database_name();
				setState(388); match(DOT);
				}
				break;
			}
			setState(392); trigger_name();
			setState(397);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(393); match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(394); match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(395); match(K_INSTEAD);
				setState(396); match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(413);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(399); match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(400); match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(401); match(K_UPDATE);
				setState(411);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(402); match(K_OF);
					setState(403); column_name();
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(404); match(COMMA);
						setState(405); column_name();
						}
						}
						setState(410);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(415); match(K_ON);
			setState(419);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(416); database_name();
				setState(417); match(DOT);
				}
				break;
			}
			setState(421); table_name();
			setState(425);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(422); match(K_FOR);
				setState(423); match(K_EACH);
				setState(424); match(K_ROW);
				}
			}

			setState(429);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(427); match(K_WHEN);
				setState(428); expr(0);
				}
			}

			setState(431); match(K_BEGIN);
			setState(440); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(436);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(432); update_stmt();
					}
					break;
				case 2:
					{
					setState(433); insert_stmt();
					}
					break;
				case 3:
					{
					setState(434); delete_stmt();
					}
					break;
				case 4:
					{
					setState(435); select_stmt();
					}
					break;
				}
				setState(438); match(SCOL);
				}
				}
				setState(442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INSERT - 88)) | (1L << (K_REPLACE - 88)) | (1L << (K_SELECT - 88)) | (1L << (K_UPDATE - 88)) | (1L << (K_VALUES - 88)) | (1L << (K_WITH - 88)))) != 0) );
			setState(444); match(K_END);
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

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_EXISTS() { return getToken(SQLSelectParser.K_EXISTS, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLSelectParser.K_AS, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLSelectParser.K_TEMP, 0); }
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLSelectParser.K_VIEW, 0); }
		public TerminalNode K_IF() { return getToken(SQLSelectParser.K_IF, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_CREATE() { return getToken(SQLSelectParser.K_CREATE, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLSelectParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); match(K_CREATE);
			setState(448);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(447);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(450); match(K_VIEW);
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(451); match(K_IF);
				setState(452); match(K_NOT);
				setState(453); match(K_EXISTS);
				}
				break;
			}
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(456); database_name();
				setState(457); match(DOT);
				}
				break;
			}
			setState(461); view_name();
			setState(462); match(K_AS);
			setState(463); select_stmt();
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

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLSelectParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_VIRTUAL() { return getToken(SQLSelectParser.K_VIRTUAL, 0); }
		public TerminalNode K_USING() { return getToken(SQLSelectParser.K_USING, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLSelectParser.K_TABLE, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLSelectParser.K_IF, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLSelectParser.K_CREATE, 0); }
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); match(K_CREATE);
			setState(466); match(K_VIRTUAL);
			setState(467); match(K_TABLE);
			setState(471);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(468); match(K_IF);
				setState(469); match(K_NOT);
				setState(470); match(K_EXISTS);
				}
				break;
			}
			setState(476);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(473); database_name();
				setState(474); match(DOT);
				}
				break;
			}
			setState(478); table_name();
			setState(479); match(K_USING);
			setState(480); module_name();
			setState(492);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(481); match(OPEN_PAR);
				setState(482); module_argument();
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(483); match(COMMA);
					setState(484); module_argument();
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(490); match(CLOSE_PAR);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(SQLSelectParser.K_WHERE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FROM() { return getToken(SQLSelectParser.K_FROM, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLSelectParser.K_DELETE, 0); }
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(494); with_clause();
				}
			}

			setState(497); match(K_DELETE);
			setState(498); match(K_FROM);
			setState(499); qualified_table_name();
			setState(502);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(500); match(K_WHERE);
				setState(501); expr(0);
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

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(SQLSelectParser.K_ORDER, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLSelectParser.K_WHERE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(SQLSelectParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLSelectParser.K_LIMIT, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(SQLSelectParser.K_FROM, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLSelectParser.K_DELETE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLSelectParser.K_OFFSET, 0); }
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(504); with_clause();
				}
			}

			setState(507); match(K_DELETE);
			setState(508); match(K_FROM);
			setState(509); qualified_table_name();
			setState(512);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(510); match(K_WHERE);
				setState(511); expr(0);
				}
			}

			setState(532);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(524);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(514); match(K_ORDER);
					setState(515); match(K_BY);
					setState(516); ordering_term();
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(517); match(COMMA);
						setState(518); ordering_term();
						}
						}
						setState(523);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(526); match(K_LIMIT);
				setState(527); expr(0);
				setState(530);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(528);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(529); expr(0);
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

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DATABASE() { return getToken(SQLSelectParser.K_DATABASE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DETACH() { return getToken(SQLSelectParser.K_DETACH, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534); match(K_DETACH);
			setState(536);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(535); match(K_DATABASE);
				}
				break;
			}
			setState(538); database_name();
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

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_INDEX() { return getToken(SQLSelectParser.K_INDEX, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLSelectParser.K_EXISTS, 0); }
		public TerminalNode K_DROP() { return getToken(SQLSelectParser.K_DROP, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLSelectParser.K_IF, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); match(K_DROP);
			setState(541); match(K_INDEX);
			setState(544);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(542); match(K_IF);
				setState(543); match(K_EXISTS);
				}
				break;
			}
			setState(549);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(546); database_name();
				setState(547); match(DOT);
				}
				break;
			}
			setState(551); index_name();
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_EXISTS() { return getToken(SQLSelectParser.K_EXISTS, 0); }
		public TerminalNode K_DROP() { return getToken(SQLSelectParser.K_DROP, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TABLE() { return getToken(SQLSelectParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLSelectParser.K_IF, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553); match(K_DROP);
			setState(554); match(K_TABLE);
			setState(557);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(555); match(K_IF);
				setState(556); match(K_EXISTS);
				}
				break;
			}
			setState(562);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(559); database_name();
				setState(560); match(DOT);
				}
				break;
			}
			setState(564); table_name();
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

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_TRIGGER() { return getToken(SQLSelectParser.K_TRIGGER, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLSelectParser.K_EXISTS, 0); }
		public TerminalNode K_DROP() { return getToken(SQLSelectParser.K_DROP, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLSelectParser.K_IF, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566); match(K_DROP);
			setState(567); match(K_TRIGGER);
			setState(570);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(568); match(K_IF);
				setState(569); match(K_EXISTS);
				}
				break;
			}
			setState(575);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(572); database_name();
				setState(573); match(DOT);
				}
				break;
			}
			setState(577); trigger_name();
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

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_EXISTS() { return getToken(SQLSelectParser.K_EXISTS, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_DROP() { return getToken(SQLSelectParser.K_DROP, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_VIEW() { return getToken(SQLSelectParser.K_VIEW, 0); }
		public TerminalNode K_IF() { return getToken(SQLSelectParser.K_IF, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); match(K_DROP);
			setState(580); match(K_VIEW);
			setState(583);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(581); match(K_IF);
				setState(582); match(K_EXISTS);
				}
				break;
			}
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(585); database_name();
				setState(586); match(DOT);
				}
				break;
			}
			setState(590); view_name();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(SQLSelectParser.K_ORDER, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLSelectParser.K_LIMIT, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLSelectParser.K_RECURSIVE, 0); }
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_BY() { return getToken(SQLSelectParser.K_BY, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLSelectParser.K_WITH, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLSelectParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(592); match(K_WITH);
				setState(594);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(593); match(K_RECURSIVE);
					}
					break;
				}
				setState(596); common_table_expression();
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(597); match(COMMA);
					setState(598); common_table_expression();
					}
					}
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(606); select_core();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(607); compound_operator();
				setState(608); select_core();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(615); match(K_ORDER);
				setState(616); match(K_BY);
				setState(617); ordering_term();
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(618); match(COMMA);
					setState(619); ordering_term();
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(633);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(627); match(K_LIMIT);
				setState(628); expr(0);
				setState(631);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(629);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(630); expr(0);
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLSelectParser.K_DEFAULT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_INSERT() { return getToken(SQLSelectParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLSelectParser.K_REPLACE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SQLSelectParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLSelectParser.K_ABORT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLSelectParser.K_INTO, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLSelectParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLSelectParser.K_IGNORE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLSelectParser.K_VALUES, 0); }
		public TerminalNode K_OR() { return getToken(SQLSelectParser.K_OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(635); with_clause();
				}
			}

			setState(655);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(638); match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(639); match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(640); match(K_INSERT);
				setState(641); match(K_OR);
				setState(642); match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(643); match(K_INSERT);
				setState(644); match(K_OR);
				setState(645); match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(646); match(K_INSERT);
				setState(647); match(K_OR);
				setState(648); match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(649); match(K_INSERT);
				setState(650); match(K_OR);
				setState(651); match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(652); match(K_INSERT);
				setState(653); match(K_OR);
				setState(654); match(K_IGNORE);
				}
				break;
			}
			setState(657); match(K_INTO);
			setState(661);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(658); database_name();
				setState(659); match(DOT);
				}
				break;
			}
			setState(663); table_name();
			setState(675);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(664); match(OPEN_PAR);
				setState(665); column_name();
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(666); match(COMMA);
					setState(667); column_name();
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(673); match(CLOSE_PAR);
				}
			}

			setState(708);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(677); match(K_VALUES);
				setState(678); match(OPEN_PAR);
				setState(679); expr(0);
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(680); match(COMMA);
					setState(681); expr(0);
					}
					}
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(687); match(CLOSE_PAR);
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(688); match(COMMA);
					setState(689); match(OPEN_PAR);
					setState(690); expr(0);
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(691); match(COMMA);
						setState(692); expr(0);
						}
						}
						setState(697);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(698); match(CLOSE_PAR);
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(705); select_stmt();
				}
				break;
			case 3:
				{
				setState(706); match(K_DEFAULT);
				setState(707); match(K_VALUES);
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

	public static class Pragma_stmtContext extends ParserRuleContext {
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_PRAGMA() { return getToken(SQLSelectParser.K_PRAGMA, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710); match(K_PRAGMA);
			setState(714);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(711); database_name();
				setState(712); match(DOT);
				}
				break;
			}
			setState(716); pragma_name();
			setState(723);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(717); match(ASSIGN);
				setState(718); pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(719); match(OPEN_PAR);
				setState(720); pragma_value();
				setState(721); match(CLOSE_PAR);
				}
				break;
			case EOF:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_REINDEX() { return getToken(SQLSelectParser.K_REINDEX, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725); match(K_REINDEX);
			setState(736);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(726); collation_name();
				}
				break;
			case 2:
				{
				setState(730);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(727); database_name();
					setState(728); match(DOT);
					}
					break;
				}
				setState(734);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(732); table_name();
					}
					break;
				case 2:
					{
					setState(733); index_name();
					}
					break;
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

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SQLSelectParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLSelectParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738); match(K_RELEASE);
			setState(740);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(739); match(K_SAVEPOINT);
				}
				break;
			}
			setState(742); savepoint_name();
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

	public static class Rollback_stmtContext extends ParserRuleContext {
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLSelectParser.K_SAVEPOINT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLSelectParser.K_ROLLBACK, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_TRANSACTION() { return getToken(SQLSelectParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SQLSelectParser.K_TO, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); match(K_ROLLBACK);
			setState(749);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(745); match(K_TRANSACTION);
				setState(747);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(746); transaction_name();
					}
					break;
				}
				}
			}

			setState(756);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(751); match(K_TO);
				setState(753);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(752); match(K_SAVEPOINT);
					}
					break;
				}
				setState(755); savepoint_name();
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

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLSelectParser.K_SAVEPOINT, 0); }
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758); match(K_SAVEPOINT);
			setState(759); savepoint_name();
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

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(SQLSelectParser.K_ORDER, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_BY() { return getToken(SQLSelectParser.K_BY, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLSelectParser.K_LIMIT, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLSelectParser.K_RECURSIVE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLSelectParser.K_WITH, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLSelectParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(761); match(K_WITH);
				setState(763);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(762); match(K_RECURSIVE);
					}
					break;
				}
				setState(765); common_table_expression();
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(766); match(COMMA);
					setState(767); common_table_expression();
					}
					}
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(775); select_core();
			setState(786);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(776); match(K_ORDER);
				setState(777); match(K_BY);
				setState(778); ordering_term();
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(779); match(COMMA);
					setState(780); ordering_term();
					}
					}
					setState(785);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(794);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(788); match(K_LIMIT);
				setState(789); expr(0);
				setState(792);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(790);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(791); expr(0);
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

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(SQLSelectParser.K_ORDER, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLSelectParser.K_LIMIT, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLSelectParser.K_RECURSIVE, 0); }
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_BY() { return getToken(SQLSelectParser.K_BY, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLSelectParser.K_WITH, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLSelectParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(796); match(K_WITH);
				setState(798);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(797); match(K_RECURSIVE);
					}
					break;
				}
				setState(800); common_table_expression();
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(801); match(COMMA);
					setState(802); common_table_expression();
					}
					}
					setState(807);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(810); select_or_values();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(811); compound_operator();
				setState(812); select_or_values();
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(829);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(819); match(K_ORDER);
				setState(820); match(K_BY);
				setState(821); ordering_term();
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(822); match(COMMA);
					setState(823); ordering_term();
					}
					}
					setState(828);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(837);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(831); match(K_LIMIT);
				setState(832); expr(0);
				setState(835);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(833);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(834); expr(0);
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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public TerminalNode K_GROUP() { return getToken(SQLSelectParser.K_GROUP, 0); }
		public TerminalNode K_ALL() { return getToken(SQLSelectParser.K_ALL, 0); }
		public TerminalNode K_FROM() { return getToken(SQLSelectParser.K_FROM, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public TerminalNode K_SELECT() { return getToken(SQLSelectParser.K_SELECT, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLSelectParser.K_WHERE, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLSelectParser.K_VALUES, 0); }
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_BY() { return getToken(SQLSelectParser.K_BY, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLSelectParser.K_DISTINCT, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLSelectParser.K_HAVING, 0); }
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_select_or_values);
		int _la;
		try {
			setState(913);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(839); match(K_SELECT);
				setState(841);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(840);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(843); result_column();
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(844); match(COMMA);
					setState(845); result_column();
					}
					}
					setState(850);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(863);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(851); match(K_FROM);
					setState(861);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(852); table_or_subquery();
						setState(857);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(853); match(COMMA);
							setState(854); table_or_subquery();
							}
							}
							setState(859);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(860); join_clause();
						}
						break;
					}
					}
				}

				setState(867);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(865); match(K_WHERE);
					setState(866); expr(0);
					}
				}

				setState(883);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(869); match(K_GROUP);
					setState(870); match(K_BY);
					setState(871); expr(0);
					setState(876);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(872); match(COMMA);
						setState(873); expr(0);
						}
						}
						setState(878);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(881);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(879); match(K_HAVING);
						setState(880); expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(885); match(K_VALUES);
				setState(886); match(OPEN_PAR);
				setState(887); expr(0);
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(888); match(COMMA);
					setState(889); expr(0);
					}
					}
					setState(894);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(895); match(CLOSE_PAR);
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(896); match(COMMA);
					setState(897); match(OPEN_PAR);
					setState(898); expr(0);
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(899); match(COMMA);
						setState(900); expr(0);
						}
						}
						setState(905);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(906); match(CLOSE_PAR);
					}
					}
					setState(912);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Update_stmtContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_REPLACE() { return getToken(SQLSelectParser.K_REPLACE, 0); }
		public TerminalNode K_SET() { return getToken(SQLSelectParser.K_SET, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SQLSelectParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLSelectParser.K_ABORT, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLSelectParser.K_IGNORE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLSelectParser.K_FAIL, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLSelectParser.K_WHERE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_OR() { return getToken(SQLSelectParser.K_OR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_UPDATE() { return getToken(SQLSelectParser.K_UPDATE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(915); with_clause();
				}
			}

			setState(918); match(K_UPDATE);
			setState(929);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(919); match(K_OR);
				setState(920); match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(921); match(K_OR);
				setState(922); match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(923); match(K_OR);
				setState(924); match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(925); match(K_OR);
				setState(926); match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(927); match(K_OR);
				setState(928); match(K_IGNORE);
				}
				break;
			}
			setState(931); qualified_table_name();
			setState(932); match(K_SET);
			setState(933); column_name();
			setState(934); match(ASSIGN);
			setState(935); expr(0);
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(936); match(COMMA);
				setState(937); column_name();
				setState(938); match(ASSIGN);
				setState(939); expr(0);
				}
				}
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(946); match(K_WHERE);
				setState(947); expr(0);
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

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(SQLSelectParser.K_ORDER, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_REPLACE() { return getToken(SQLSelectParser.K_REPLACE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLSelectParser.K_LIMIT, 0); }
		public TerminalNode K_SET() { return getToken(SQLSelectParser.K_SET, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SQLSelectParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLSelectParser.K_ABORT, 0); }
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_IGNORE() { return getToken(SQLSelectParser.K_IGNORE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLSelectParser.K_FAIL, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLSelectParser.K_WHERE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(SQLSelectParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_OR() { return getToken(SQLSelectParser.K_OR, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_UPDATE() { return getToken(SQLSelectParser.K_UPDATE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLSelectParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(950); with_clause();
				}
			}

			setState(953); match(K_UPDATE);
			setState(964);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(954); match(K_OR);
				setState(955); match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(956); match(K_OR);
				setState(957); match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(958); match(K_OR);
				setState(959); match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(960); match(K_OR);
				setState(961); match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(962); match(K_OR);
				setState(963); match(K_IGNORE);
				}
				break;
			}
			setState(966); qualified_table_name();
			setState(967); match(K_SET);
			setState(968); column_name();
			setState(969); match(ASSIGN);
			setState(970); expr(0);
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(971); match(COMMA);
				setState(972); column_name();
				setState(973); match(ASSIGN);
				setState(974); expr(0);
				}
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(983);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(981); match(K_WHERE);
				setState(982); expr(0);
				}
			}

			setState(1003);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(995);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(985); match(K_ORDER);
					setState(986); match(K_BY);
					setState(987); ordering_term();
					setState(992);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(988); match(COMMA);
						setState(989); ordering_term();
						}
						}
						setState(994);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(997); match(K_LIMIT);
				setState(998); expr(0);
				setState(1001);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(999);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(1000); expr(0);
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

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SQLSelectParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005); match(K_VACUUM);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007); column_name();
			setState(1009);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1008); type_name();
				}
				break;
			}
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (K_NOT - 102)) | (1L << (K_NULL - 102)) | (1L << (K_PRIMARY - 102)) | (1L << (K_REFERENCES - 102)) | (1L << (K_UNIQUE - 102)))) != 0)) {
				{
				{
				setState(1011); column_constraint();
				}
				}
				setState(1016);
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

	public static class Type_nameContext extends ParserRuleContext {
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1018); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1017); name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1020); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(1032);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1022); match(OPEN_PAR);
				setState(1023); signed_number();
				setState(1024); match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1026); match(OPEN_PAR);
				setState(1027); signed_number();
				setState(1028); match(COMMA);
				setState(1029); signed_number();
				setState(1030); match(CLOSE_PAR);
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLSelectParser.K_DEFAULT, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLSelectParser.K_NULL, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_KEY() { return getToken(SQLSelectParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SQLSelectParser.K_UNIQUE, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLSelectParser.K_PRIMARY, 0); }
		public TerminalNode K_ASC() { return getToken(SQLSelectParser.K_ASC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLSelectParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLSelectParser.K_COLLATE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLSelectParser.K_DESC, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLSelectParser.K_CHECK, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLSelectParser.K_CONSTRAINT, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1034); match(K_CONSTRAINT);
				setState(1035); name();
				}
			}

			setState(1071);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1038); match(K_PRIMARY);
				setState(1039); match(K_KEY);
				setState(1041);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1040);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1043); conflict_clause();
				setState(1045);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1044); match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1048);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1047); match(K_NOT);
					}
				}

				setState(1050); match(K_NULL);
				setState(1051); conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1052); match(K_UNIQUE);
				setState(1053); conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1054); match(K_CHECK);
				setState(1055); match(OPEN_PAR);
				setState(1056); expr(0);
				setState(1057); match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1059); match(K_DEFAULT);
				setState(1066);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1060); signed_number();
					}
					break;
				case 2:
					{
					setState(1061); literal_value();
					}
					break;
				case 3:
					{
					setState(1062); match(OPEN_PAR);
					setState(1063); expr(0);
					setState(1064); match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1068); match(K_COLLATE);
				setState(1069); collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1070); foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_CONFLICT() { return getToken(SQLSelectParser.K_CONFLICT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLSelectParser.K_REPLACE, 0); }
		public TerminalNode K_ON() { return getToken(SQLSelectParser.K_ON, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLSelectParser.K_ABORT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLSelectParser.K_ROLLBACK, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLSelectParser.K_IGNORE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLSelectParser.K_FAIL, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1073); match(K_ON);
				setState(1074); match(K_CONFLICT);
				setState(1075);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (K_FAIL - 72)) | (1L << (K_IGNORE - 72)) | (1L << (K_REPLACE - 72)) | (1L << (K_ROLLBACK - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class ExprContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode K_END() { return getToken(SQLSelectParser.K_END, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLSelectParser.K_ELSE, 0); }
		public TerminalNode K_NULL() { return getToken(SQLSelectParser.K_NULL, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLSelectParser.K_ISNULL, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode K_CAST() { return getToken(SQLSelectParser.K_CAST, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLSelectParser.K_GLOB, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLSelectParser.K_OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLSelectParser.K_EXISTS, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SQLSelectParser.K_WHEN); }
		public TerminalNode K_ESCAPE() { return getToken(SQLSelectParser.K_ESCAPE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLSelectParser.K_DISTINCT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLSelectParser.K_LIKE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_MATCH() { return getToken(SQLSelectParser.K_MATCH, 0); }
		public TerminalNode K_IN() { return getToken(SQLSelectParser.K_IN, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_BETWEEN() { return getToken(SQLSelectParser.K_BETWEEN, 0); }
		public TerminalNode K_AS() { return getToken(SQLSelectParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_NOTNULL() { return getToken(SQLSelectParser.K_NOTNULL, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SQLSelectParser.K_THEN); }
		public TerminalNode K_CASE() { return getToken(SQLSelectParser.K_CASE, 0); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SQLSelectParser.K_WHEN, i);
		}
		public TerminalNode K_IS() { return getToken(SQLSelectParser.K_IS, 0); }
		public TerminalNode BIND_PARAMETER() { return getToken(SQLSelectParser.BIND_PARAMETER, 0); }
		public TerminalNode K_THEN(int i) {
			return getToken(SQLSelectParser.K_THEN, i);
		}
		public TerminalNode K_AND() { return getToken(SQLSelectParser.K_AND, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLSelectParser.K_REGEXP, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLSelectParser.K_COLLATE, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1079); unary_operator();
				setState(1080); expr(21);
				}
				break;
			case 2:
				{
				setState(1082); literal_value();
				}
				break;
			case 3:
				{
				setState(1083); match(BIND_PARAMETER);
				}
				break;
			case 4:
				{
				setState(1092);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1087);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						setState(1084); database_name();
						setState(1085); match(DOT);
						}
						break;
					}
					setState(1089); table_name();
					setState(1090); match(DOT);
					}
					break;
				}
				setState(1094); column_name();
				}
				break;
			case 5:
				{
				setState(1095); function_name();
				setState(1096); match(OPEN_PAR);
				setState(1109);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1098);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						setState(1097); match(K_DISTINCT);
						}
						break;
					}
					setState(1100); expr(0);
					setState(1105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1101); match(COMMA);
						setState(1102); expr(0);
						}
						}
						setState(1107);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1108); match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1111); match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1113); match(OPEN_PAR);
				setState(1114); expr(0);
				setState(1115); match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1117); match(K_CAST);
				setState(1118); match(OPEN_PAR);
				setState(1119); expr(0);
				setState(1120); match(K_AS);
				setState(1121); type_name();
				setState(1122); match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1128);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1125);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1124); match(K_NOT);
						}
					}

					setState(1127); match(K_EXISTS);
					}
				}

				setState(1130); match(OPEN_PAR);
				setState(1131); select_stmt();
				setState(1132); match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1134); match(K_CASE);
				setState(1136);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1135); expr(0);
					}
					break;
				}
				setState(1143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1138); match(K_WHEN);
					setState(1139); expr(0);
					setState(1140); match(K_THEN);
					setState(1141); expr(0);
					}
					}
					setState(1145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1149);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1147); match(K_ELSE);
					setState(1148); expr(0);
					}
				}

				setState(1151); match(K_END);
				}
				break;
			case 10:
				{
				setState(1153); raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1254);
					switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1156);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1157); match(PIPE2);
						setState(1158); expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1159);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1160);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1161); expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1162);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1163);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1164); expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1165);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1166);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1167); expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1168);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1169);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1170); expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1171);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1184);
						switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
						case 1:
							{
							setState(1172); match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1173); match(EQ);
							}
							break;
						case 3:
							{
							setState(1174); match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1175); match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1176); match(K_IS);
							}
							break;
						case 6:
							{
							setState(1177); match(K_IS);
							setState(1178); match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1179); match(K_IN);
							}
							break;
						case 8:
							{
							setState(1180); match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1181); match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1182); match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1183); match(K_REGEXP);
							}
							break;
						}
						setState(1186); expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1187);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1188); match(K_AND);
						setState(1189); expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1190);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1191); match(K_OR);
						setState(1192); expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1193);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1194); match(K_IS);
						setState(1196);
						switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
						case 1:
							{
							setState(1195); match(K_NOT);
							}
							break;
						}
						setState(1198); expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1201);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1200); match(K_NOT);
							}
						}

						setState(1203); match(K_BETWEEN);
						setState(1204); expr(0);
						setState(1205); match(K_AND);
						setState(1206); expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1208);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1209); match(K_COLLATE);
						setState(1210); collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1211);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1213);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1212); match(K_NOT);
							}
						}

						setState(1215);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_GLOB - 77)) | (1L << (K_LIKE - 77)) | (1L << (K_MATCH - 77)) | (1L << (K_REGEXP - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1216); expr(0);
						setState(1219);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
						case 1:
							{
							setState(1217); match(K_ESCAPE);
							setState(1218); expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1221);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1226);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1222); match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1223); match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1224); match(K_NOT);
							setState(1225); match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1228);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1230);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1229); match(K_NOT);
							}
						}

						setState(1232); match(K_IN);
						setState(1252);
						switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
						case 1:
							{
							setState(1233); match(OPEN_PAR);
							setState(1243);
							switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
							case 1:
								{
								setState(1234); select_stmt();
								}
								break;
							case 2:
								{
								setState(1235); expr(0);
								setState(1240);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1236); match(COMMA);
									setState(1237); expr(0);
									}
									}
									setState(1242);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1245); match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1249);
							switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
							case 1:
								{
								setState(1246); database_name();
								setState(1247); match(DOT);
								}
								break;
							}
							setState(1251); table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_IMMEDIATE() { return getToken(SQLSelectParser.K_IMMEDIATE, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public List<TerminalNode> K_ON() { return getTokens(SQLSelectParser.K_ON); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLSelectParser.K_MATCH, i);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> K_SET() { return getTokens(SQLSelectParser.K_SET); }
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLSelectParser.K_NULL); }
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLSelectParser.K_UPDATE, i);
		}
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLSelectParser.K_DELETE, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLSelectParser.K_NO); }
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLSelectParser.K_RESTRICT); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLSelectParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_MATCH() { return getTokens(SQLSelectParser.K_MATCH); }
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLSelectParser.K_DEFAULT); }
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLSelectParser.K_CASCADE); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLSelectParser.K_ON, i);
		}
		public TerminalNode K_INITIALLY() { return getToken(SQLSelectParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLSelectParser.K_DEFERRED, 0); }
		public List<TerminalNode> K_DELETE() { return getTokens(SQLSelectParser.K_DELETE); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLSelectParser.K_ACTION); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLSelectParser.K_RESTRICT, i);
		}
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLSelectParser.K_CASCADE, i);
		}
		public TerminalNode K_REFERENCES() { return getToken(SQLSelectParser.K_REFERENCES, 0); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLSelectParser.K_NULL, i);
		}
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLSelectParser.K_ACTION, i);
		}
		public TerminalNode K_SET(int i) {
			return getToken(SQLSelectParser.K_SET, i);
		}
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLSelectParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLSelectParser.K_UPDATE); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLSelectParser.K_NO, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259); match(K_REFERENCES);
			setState(1260); foreign_table();
			setState(1272);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1261); match(OPEN_PAR);
				setState(1262); column_name();
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1263); match(COMMA);
					setState(1264); column_name();
					}
					}
					setState(1269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1270); match(CLOSE_PAR);
				}
			}

			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1288);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1274); match(K_ON);
					setState(1275);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(1284);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						setState(1276); match(K_SET);
						setState(1277); match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1278); match(K_SET);
						setState(1279); match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1280); match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1281); match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1282); match(K_NO);
						setState(1283); match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1286); match(K_MATCH);
					setState(1287); name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1305);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1296);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1295); match(K_NOT);
					}
				}

				setState(1298); match(K_DEFERRABLE);
				setState(1303);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1299); match(K_INITIALLY);
					setState(1300); match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1301); match(K_INITIALLY);
					setState(1302); match(K_IMMEDIATE);
					}
					break;
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

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLSelectParser.K_ABORT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLSelectParser.K_ROLLBACK, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLSelectParser.K_RAISE, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_FAIL() { return getToken(SQLSelectParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLSelectParser.K_IGNORE, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307); match(K_RAISE);
			setState(1308); match(OPEN_PAR);
			setState(1313);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1309); match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1310);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1311); match(COMMA);
				setState(1312); error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1315); match(CLOSE_PAR);
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLSelectParser.K_ASC, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLSelectParser.K_COLLATE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLSelectParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317); column_name();
			setState(1320);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1318); match(K_COLLATE);
				setState(1319); collation_name();
				}
			}

			setState(1323);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1322);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class Table_constraintContext extends ParserRuleContext {
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode K_FOREIGN() { return getToken(SQLSelectParser.K_FOREIGN, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_KEY() { return getToken(SQLSelectParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SQLSelectParser.K_UNIQUE, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLSelectParser.K_PRIMARY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLSelectParser.K_CHECK, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLSelectParser.K_CONSTRAINT, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1325); match(K_CONSTRAINT);
				setState(1326); name();
				}
			}

			setState(1365);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1332);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1329); match(K_PRIMARY);
					setState(1330); match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1331); match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1334); match(OPEN_PAR);
				setState(1335); indexed_column();
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1336); match(COMMA);
					setState(1337); indexed_column();
					}
					}
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1343); match(CLOSE_PAR);
				setState(1344); conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1346); match(K_CHECK);
				setState(1347); match(OPEN_PAR);
				setState(1348); expr(0);
				setState(1349); match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1351); match(K_FOREIGN);
				setState(1352); match(K_KEY);
				setState(1353); match(OPEN_PAR);
				setState(1354); column_name();
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1355); match(COMMA);
					setState(1356); column_name();
					}
					}
					setState(1361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1362); match(CLOSE_PAR);
				setState(1363); foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class With_clauseContext extends ParserRuleContext {
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public TerminalNode K_AS(int i) {
			return getToken(SQLSelectParser.K_AS, i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SQLSelectParser.K_AS); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLSelectParser.K_RECURSIVE, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public TerminalNode K_WITH() { return getToken(SQLSelectParser.K_WITH, 0); }
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367); match(K_WITH);
			setState(1369);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1368); match(K_RECURSIVE);
				}
				break;
			}
			setState(1371); cte_table_name();
			setState(1372); match(K_AS);
			setState(1373); match(OPEN_PAR);
			setState(1374); select_stmt();
			setState(1375); match(CLOSE_PAR);
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1376); match(COMMA);
				setState(1377); cte_table_name();
				setState(1378); match(K_AS);
				setState(1379); match(OPEN_PAR);
				setState(1380); select_stmt();
				setState(1381); match(CLOSE_PAR);
				}
				}
				setState(1387);
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public TerminalNode K_BY() { return getToken(SQLSelectParser.K_BY, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLSelectParser.K_INDEXED, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1388); database_name();
				setState(1389); match(DOT);
				}
				break;
			}
			setState(1393); table_name();
			setState(1399);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1394); match(K_INDEXED);
				setState(1395); match(K_BY);
				setState(1396); index_name();
				}
				break;
			case K_NOT:
				{
				setState(1397); match(K_NOT);
				setState(1398); match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_LIMIT:
			case K_ORDER:
			case K_SET:
			case K_WHERE:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Ordering_termContext extends ParserRuleContext {
		public TerminalNode K_ASC() { return getToken(SQLSelectParser.K_ASC, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLSelectParser.K_COLLATE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLSelectParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401); expr(0);
			setState(1404);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1402); match(K_COLLATE);
				setState(1403); collation_name();
				}
			}

			setState(1407);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1406);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLSelectParser.STRING_LITERAL, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pragma_value);
		try {
			setState(1412);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409); signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410); name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1411); match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_AS() { return getToken(SQLSelectParser.K_AS, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414); table_name();
			setState(1426);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1415); match(OPEN_PAR);
				setState(1416); column_name();
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1417); match(COMMA);
					setState(1418); column_name();
					}
					}
					setState(1423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1424); match(CLOSE_PAR);
				}
			}

			setState(1428); match(K_AS);
			setState(1429); match(OPEN_PAR);
			setState(1430); select_stmt();
			setState(1431); match(CLOSE_PAR);
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

	public static class Result_columnContext extends ParserRuleContext {
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLSelectParser.K_AS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_result_column);
		int _la;
		try {
			setState(1445);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1433); match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1434); table_name();
				setState(1435); match(DOT);
				setState(1436); match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1438); expr(0);
				setState(1443);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1440);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1439); match(K_AS);
						}
					}

					setState(1442); column_alias();
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(SQLSelectParser.K_BY, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLSelectParser.K_INDEXED, 0); }
		public TerminalNode K_AS() { return getToken(SQLSelectParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_table_or_subquery);
		int _la;
		try {
			setState(1494);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1450);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1447); database_name();
					setState(1448); match(DOT);
					}
					break;
				}
				setState(1452); table_name();
				setState(1457);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1454);
					switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
					case 1:
						{
						setState(1453); match(K_AS);
						}
						break;
					}
					setState(1456); table_alias();
					}
					break;
				}
				setState(1464);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1459); match(K_INDEXED);
					setState(1460); match(K_BY);
					setState(1461); index_name();
					}
					break;
				case K_NOT:
					{
					setState(1462); match(K_NOT);
					setState(1463); match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_CROSS:
				case K_EXCEPT:
				case K_GROUP:
				case K_INNER:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_SELECT:
				case K_UNION:
				case K_USING:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466); match(OPEN_PAR);
				setState(1476);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1467); table_or_subquery();
					setState(1472);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1468); match(COMMA);
						setState(1469); table_or_subquery();
						}
						}
						setState(1474);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1475); join_clause();
					}
					break;
				}
				setState(1478); match(CLOSE_PAR);
				setState(1483);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1480);
					switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
					case 1:
						{
						setState(1479); match(K_AS);
						}
						break;
					}
					setState(1482); table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485); match(OPEN_PAR);
				setState(1486); select_stmt();
				setState(1487); match(CLOSE_PAR);
				setState(1492);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1489);
					switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
					case 1:
						{
						setState(1488); match(K_AS);
						}
						break;
					}
					setState(1491); table_alias();
					}
					break;
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496); table_or_subquery();
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_INNER - 87)) | (1L << (K_JOIN - 87)) | (1L << (K_LEFT - 87)) | (1L << (K_NATURAL - 87)))) != 0)) {
				{
				{
				setState(1497); join_operator();
				setState(1498); table_or_subquery();
				setState(1499); join_constraint();
				}
				}
				setState(1505);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_OUTER() { return getToken(SQLSelectParser.K_OUTER, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLSelectParser.K_NATURAL, 0); }
		public TerminalNode K_INNER() { return getToken(SQLSelectParser.K_INNER, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLSelectParser.K_LEFT, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLSelectParser.K_CROSS, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLSelectParser.K_JOIN, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_join_operator);
		int _la;
		try {
			setState(1519);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506); match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1507); match(K_NATURAL);
					}
				}

				setState(1516);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1510); match(K_LEFT);
					setState(1512);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1511); match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1514); match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1515); match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1518); match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_ON() { return getToken(SQLSelectParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_USING() { return getToken(SQLSelectParser.K_USING, 0); }
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1521); match(K_ON);
				setState(1522); expr(0);
				}
				break;
			case K_USING:
				{
				setState(1523); match(K_USING);
				setState(1524); match(OPEN_PAR);
				setState(1525); column_name();
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1526); match(COMMA);
					setState(1527); column_name();
					}
					}
					setState(1532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1533); match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_CROSS:
			case K_EXCEPT:
			case K_GROUP:
			case K_INNER:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_SELECT:
			case K_UNION:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Select_coreContext extends ParserRuleContext {
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public TerminalNode K_GROUP() { return getToken(SQLSelectParser.K_GROUP, 0); }
		public TerminalNode K_ALL() { return getToken(SQLSelectParser.K_ALL, 0); }
		public TerminalNode K_FROM() { return getToken(SQLSelectParser.K_FROM, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public TerminalNode K_SELECT() { return getToken(SQLSelectParser.K_SELECT, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLSelectParser.K_WHERE, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLSelectParser.K_VALUES, 0); }
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_BY() { return getToken(SQLSelectParser.K_BY, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLSelectParser.K_DISTINCT, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLSelectParser.K_HAVING, 0); }
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_select_core);
		int _la;
		try {
			setState(1611);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1537); match(K_SELECT);
				setState(1539);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1538);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(1541); result_column();
				setState(1546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1542); match(COMMA);
					setState(1543); result_column();
					}
					}
					setState(1548);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1561);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1549); match(K_FROM);
					setState(1559);
					switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
					case 1:
						{
						setState(1550); table_or_subquery();
						setState(1555);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1551); match(COMMA);
							setState(1552); table_or_subquery();
							}
							}
							setState(1557);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1558); join_clause();
						}
						break;
					}
					}
				}

				setState(1565);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1563); match(K_WHERE);
					setState(1564); expr(0);
					}
				}

				setState(1581);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1567); match(K_GROUP);
					setState(1568); match(K_BY);
					setState(1569); expr(0);
					setState(1574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1570); match(COMMA);
						setState(1571); expr(0);
						}
						}
						setState(1576);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1579);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1577); match(K_HAVING);
						setState(1578); expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1583); match(K_VALUES);
				setState(1584); match(OPEN_PAR);
				setState(1585); expr(0);
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1586); match(COMMA);
					setState(1587); expr(0);
					}
					}
					setState(1592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1593); match(CLOSE_PAR);
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1594); match(COMMA);
					setState(1595); match(OPEN_PAR);
					setState(1596); expr(0);
					setState(1601);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1597); match(COMMA);
						setState(1598); expr(0);
						}
						}
						setState(1603);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1604); match(CLOSE_PAR);
					}
					}
					setState(1610);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_INTERSECT() { return getToken(SQLSelectParser.K_INTERSECT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLSelectParser.K_ALL, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLSelectParser.K_EXCEPT, 0); }
		public TerminalNode K_UNION() { return getToken(SQLSelectParser.K_UNION, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_compound_operator);
		try {
			setState(1618);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1613); match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1614); match(K_UNION);
				setState(1615); match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1616); match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1617); match(K_EXCEPT);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620); table_name();
			setState(1632);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1621); match(OPEN_PAR);
				setState(1622); column_name();
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1623); match(COMMA);
					setState(1624); column_name();
					}
					}
					setState(1629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1630); match(CLOSE_PAR);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLSelectParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1634);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1637); match(NUMERIC_LITERAL);
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
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLSelectParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLSelectParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLSelectParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLSelectParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLSelectParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLSelectParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLSelectParser.K_CURRENT_TIME, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_NULL - 104)) | (1L << (NUMERIC_LITERAL - 104)) | (1L << (STRING_LITERAL - 104)) | (1L << (BLOB_LITERAL - 104)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLSelectParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643); match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_module_argument);
		try {
			setState(1647);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1645); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1646); column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLSelectParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLSelectParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_RENAME() { return getToken(SQLSelectParser.K_RENAME, 0); }
		public TerminalNode K_SET() { return getToken(SQLSelectParser.K_SET, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLSelectParser.K_ROLLBACK, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLSelectParser.K_ELSE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLSelectParser.K_TABLE, 0); }
		public TerminalNode K_INNER() { return getToken(SQLSelectParser.K_INNER, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLSelectParser.K_RAISE, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLSelectParser.K_AFTER, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLSelectParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLSelectParser.K_VIEW, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLSelectParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLSelectParser.K_IGNORE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLSelectParser.K_CAST, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLSelectParser.K_RELEASE, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLSelectParser.K_INSTEAD, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLSelectParser.K_RESTRICT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLSelectParser.K_DEFERRABLE, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLSelectParser.K_RIGHT, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLSelectParser.K_CHECK, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLSelectParser.K_GROUP, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLSelectParser.K_DEFERRED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLSelectParser.K_INITIALLY, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLSelectParser.K_EXPLAIN, 0); }
		public TerminalNode K_AS() { return getToken(SQLSelectParser.K_AS, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLSelectParser.K_QUERY, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLSelectParser.K_RECURSIVE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLSelectParser.K_CASE, 0); }
		public TerminalNode K_FULL() { return getToken(SQLSelectParser.K_FULL, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLSelectParser.K_DELETE, 0); }
		public TerminalNode K_IS() { return getToken(SQLSelectParser.K_IS, 0); }
		public TerminalNode K_ADD() { return getToken(SQLSelectParser.K_ADD, 0); }
		public TerminalNode K_ROW() { return getToken(SQLSelectParser.K_ROW, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLSelectParser.K_PRIMARY, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLSelectParser.K_REFERENCES, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLSelectParser.K_HAVING, 0); }
		public TerminalNode K_UNION() { return getToken(SQLSelectParser.K_UNION, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLSelectParser.K_COLLATE, 0); }
		public TerminalNode K_FOR() { return getToken(SQLSelectParser.K_FOR, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLSelectParser.K_VIRTUAL, 0); }
		public TerminalNode K_END() { return getToken(SQLSelectParser.K_END, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLSelectParser.K_OUTER, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLSelectParser.K_ISNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLSelectParser.K_NULL, 0); }
		public TerminalNode K_INTO() { return getToken(SQLSelectParser.K_INTO, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLSelectParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLSelectParser.K_KEY, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLSelectParser.K_CREATE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLSelectParser.K_GLOB, 0); }
		public TerminalNode K_ASC() { return getToken(SQLSelectParser.K_ASC, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLSelectParser.K_WHEN, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLSelectParser.K_DISTINCT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLSelectParser.K_LIKE, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLSelectParser.K_TRANSACTION, 0); }
		public TerminalNode K_IN() { return getToken(SQLSelectParser.K_IN, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLSelectParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLSelectParser.K_INDEX, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLSelectParser.K_ORDER, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLSelectParser.K_DATABASE, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLSelectParser.K_CASCADE, 0); }
		public TerminalNode K_DROP() { return getToken(SQLSelectParser.K_DROP, 0); }
		public TerminalNode K_ALL() { return getToken(SQLSelectParser.K_ALL, 0); }
		public TerminalNode K_USING() { return getToken(SQLSelectParser.K_USING, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLSelectParser.K_NATURAL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLSelectParser.K_NOTNULL, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLSelectParser.K_PRAGMA, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLSelectParser.K_WHERE, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLSelectParser.K_ALTER, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLSelectParser.K_VALUES, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLSelectParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLSelectParser.K_BEGIN, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLSelectParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLSelectParser.K_UPDATE, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLSelectParser.K_REGEXP, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLSelectParser.K_CONSTRAINT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLSelectParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLSelectParser.K_REPLACE, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLSelectParser.K_ANALYZE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLSelectParser.K_LIMIT, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLSelectParser.K_COMMIT, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLSelectParser.K_CROSS, 0); }
		public TerminalNode K_IF() { return getToken(SQLSelectParser.K_IF, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLSelectParser.K_PLAN, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLSelectParser.K_SELECT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLSelectParser.K_EXISTS, 0); }
		public TerminalNode K_OR() { return getToken(SQLSelectParser.K_OR, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLSelectParser.K_TEMP, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLSelectParser.K_EXCEPT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLSelectParser.K_MATCH, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLSelectParser.K_REINDEX, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLSelectParser.K_INSERT, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLSelectParser.K_BETWEEN, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLSelectParser.K_ATTACH, 0); }
		public TerminalNode K_THEN() { return getToken(SQLSelectParser.K_THEN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLSelectParser.K_FROM, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLSelectParser.K_UNIQUE, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLSelectParser.K_WITHOUT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLSelectParser.K_ACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLSelectParser.K_TRIGGER, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLSelectParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ON() { return getToken(SQLSelectParser.K_ON, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLSelectParser.K_DETACH, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLSelectParser.K_LEFT, 0); }
		public TerminalNode K_NOT() { return getToken(SQLSelectParser.K_NOT, 0); }
		public TerminalNode K_TO() { return getToken(SQLSelectParser.K_TO, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLSelectParser.K_CONFLICT, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLSelectParser.K_INTERSECT, 0); }
		public TerminalNode K_BY() { return getToken(SQLSelectParser.K_BY, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLSelectParser.K_SAVEPOINT, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLSelectParser.K_ESCAPE, 0); }
		public TerminalNode K_NO() { return getToken(SQLSelectParser.K_NO, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLSelectParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLSelectParser.K_COLUMN, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLSelectParser.K_OFFSET, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLSelectParser.K_DEFAULT, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLSelectParser.K_FOREIGN, 0); }
		public TerminalNode K_EACH() { return getToken(SQLSelectParser.K_EACH, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLSelectParser.K_INDEXED, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLSelectParser.K_ABORT, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLSelectParser.K_TEMPORARY, 0); }
		public TerminalNode K_AND() { return getToken(SQLSelectParser.K_AND, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLSelectParser.K_VACUUM, 0); }
		public TerminalNode K_WITH() { return getToken(SQLSelectParser.K_WITH, 0); }
		public TerminalNode K_OF() { return getToken(SQLSelectParser.K_OF, 0); }
		public TerminalNode K_DESC() { return getToken(SQLSelectParser.K_DESC, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (K_ABORT - 25)) | (1L << (K_ACTION - 25)) | (1L << (K_ADD - 25)) | (1L << (K_AFTER - 25)) | (1L << (K_ALL - 25)) | (1L << (K_ALTER - 25)) | (1L << (K_ANALYZE - 25)) | (1L << (K_AND - 25)) | (1L << (K_AS - 25)) | (1L << (K_ASC - 25)) | (1L << (K_ATTACH - 25)) | (1L << (K_AUTOINCREMENT - 25)) | (1L << (K_BEFORE - 25)) | (1L << (K_BEGIN - 25)) | (1L << (K_BETWEEN - 25)) | (1L << (K_BY - 25)) | (1L << (K_CASCADE - 25)) | (1L << (K_CASE - 25)) | (1L << (K_CAST - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_COLUMN - 25)) | (1L << (K_COMMIT - 25)) | (1L << (K_CONFLICT - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_CREATE - 25)) | (1L << (K_CROSS - 25)) | (1L << (K_CURRENT_DATE - 25)) | (1L << (K_CURRENT_TIME - 25)) | (1L << (K_CURRENT_TIMESTAMP - 25)) | (1L << (K_DATABASE - 25)) | (1L << (K_DEFAULT - 25)) | (1L << (K_DEFERRABLE - 25)) | (1L << (K_DEFERRED - 25)) | (1L << (K_DELETE - 25)) | (1L << (K_DESC - 25)) | (1L << (K_DETACH - 25)) | (1L << (K_DISTINCT - 25)) | (1L << (K_DROP - 25)) | (1L << (K_EACH - 25)) | (1L << (K_ELSE - 25)) | (1L << (K_END - 25)) | (1L << (K_ESCAPE - 25)) | (1L << (K_EXCEPT - 25)) | (1L << (K_EXCLUSIVE - 25)) | (1L << (K_EXISTS - 25)) | (1L << (K_EXPLAIN - 25)) | (1L << (K_FAIL - 25)) | (1L << (K_FOR - 25)) | (1L << (K_FOREIGN - 25)) | (1L << (K_FROM - 25)) | (1L << (K_FULL - 25)) | (1L << (K_GLOB - 25)) | (1L << (K_GROUP - 25)) | (1L << (K_HAVING - 25)) | (1L << (K_IF - 25)) | (1L << (K_IGNORE - 25)) | (1L << (K_IMMEDIATE - 25)) | (1L << (K_IN - 25)) | (1L << (K_INDEX - 25)) | (1L << (K_INDEXED - 25)) | (1L << (K_INITIALLY - 25)) | (1L << (K_INNER - 25)) | (1L << (K_INSERT - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSTEAD - 89)) | (1L << (K_INTERSECT - 89)) | (1L << (K_INTO - 89)) | (1L << (K_IS - 89)) | (1L << (K_ISNULL - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_KEY - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_LIKE - 89)) | (1L << (K_LIMIT - 89)) | (1L << (K_MATCH - 89)) | (1L << (K_NATURAL - 89)) | (1L << (K_NO - 89)) | (1L << (K_NOT - 89)) | (1L << (K_NOTNULL - 89)) | (1L << (K_NULL - 89)) | (1L << (K_OF - 89)) | (1L << (K_OFFSET - 89)) | (1L << (K_ON - 89)) | (1L << (K_OR - 89)) | (1L << (K_ORDER - 89)) | (1L << (K_OUTER - 89)) | (1L << (K_PLAN - 89)) | (1L << (K_PRAGMA - 89)) | (1L << (K_PRIMARY - 89)) | (1L << (K_QUERY - 89)) | (1L << (K_RAISE - 89)) | (1L << (K_RECURSIVE - 89)) | (1L << (K_REFERENCES - 89)) | (1L << (K_REGEXP - 89)) | (1L << (K_REINDEX - 89)) | (1L << (K_RELEASE - 89)) | (1L << (K_RENAME - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_RESTRICT - 89)) | (1L << (K_RIGHT - 89)) | (1L << (K_ROLLBACK - 89)) | (1L << (K_ROW - 89)) | (1L << (K_SAVEPOINT - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_SET - 89)) | (1L << (K_TABLE - 89)) | (1L << (K_TEMP - 89)) | (1L << (K_TEMPORARY - 89)) | (1L << (K_THEN - 89)) | (1L << (K_TO - 89)) | (1L << (K_TRANSACTION - 89)) | (1L << (K_TRIGGER - 89)) | (1L << (K_UNION - 89)) | (1L << (K_UNIQUE - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_USING - 89)) | (1L << (K_VACUUM - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_VIEW - 89)) | (1L << (K_VIRTUAL - 89)) | (1L << (K_WHEN - 89)) | (1L << (K_WHERE - 89)) | (1L << (K_WITH - 89)) | (1L << (K_WITHOUT - 89)))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653); any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655); any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657); any_name();
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659); any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661); any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663); any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665); any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667); any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669); any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671); any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673); any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675); any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677); any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679); any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681); any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683); any_name();
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685); any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLSelectParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLSelectParser.STRING_LITERAL, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLSelectListener ) ((SQLSelectListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSelectVisitor ) return ((SQLSelectVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_any_name);
		try {
			setState(1694);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1687); match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1688); keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1689); match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1690); match(OPEN_PAR);
				setState(1691); any_name();
				setState(1692); match(CLOSE_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 20);
		case 1: return precpred(_ctx, 19);
		case 2: return precpred(_ctx, 18);
		case 3: return precpred(_ctx, 17);
		case 4: return precpred(_ctx, 16);
		case 5: return precpred(_ctx, 15);
		case 6: return precpred(_ctx, 14);
		case 7: return precpred(_ctx, 13);
		case 8: return precpred(_ctx, 6);
		case 9: return precpred(_ctx, 5);
		case 10: return precpred(_ctx, 9);
		case 11: return precpred(_ctx, 8);
		case 12: return precpred(_ctx, 7);
		case 13: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009f\u06a3\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\7\2\u00a9\n\2\f\2\16\2\u00ac\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u00b4"+
		"\n\4\f\4\16\4\u00b7\13\4\3\4\3\4\6\4\u00bb\n\4\r\4\16\4\u00bc\3\4\7\4"+
		"\u00c0\n\4\f\4\16\4\u00c3\13\4\3\4\7\4\u00c6\n\4\f\4\16\4\u00c9\13\4\3"+
		"\5\3\5\5\5\u00cd\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00d4\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00dc\n\6\3\6\5\6\u00df\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u00e8\n\7\3\b\3\b\5\b\u00ec\n\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00f4\n"+
		"\t\3\t\3\t\5\t\u00f8\n\t\5\t\u00fa\n\t\3\n\3\n\3\n\5\n\u00ff\n\n\5\n\u0101"+
		"\n\n\3\13\3\13\5\13\u0105\n\13\3\13\3\13\3\13\7\13\u010a\n\13\f\13\16"+
		"\13\u010d\13\13\5\13\u010f\n\13\3\13\3\13\3\13\5\13\u0114\n\13\3\13\3"+
		"\13\5\13\u0118\n\13\3\13\6\13\u011b\n\13\r\13\16\13\u011c\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u0124\n\13\f\13\16\13\u0127\13\13\5\13\u0129\n\13\3"+
		"\13\3\13\3\13\3\13\5\13\u012f\n\13\5\13\u0131\n\13\3\f\3\f\5\f\u0135\n"+
		"\f\3\f\3\f\3\f\3\f\5\f\u013b\n\f\3\f\3\f\3\f\5\f\u0140\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u0149\n\f\f\f\16\f\u014c\13\f\3\f\3\f\3\f\5\f\u0151"+
		"\n\f\3\r\3\r\5\r\u0155\n\r\3\r\3\r\3\r\3\r\5\r\u015b\n\r\3\r\3\r\3\r\5"+
		"\r\u0160\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0167\n\r\f\r\16\r\u016a\13\r\3\r"+
		"\3\r\7\r\u016e\n\r\f\r\16\r\u0171\13\r\3\r\3\r\3\r\5\r\u0176\n\r\3\r\3"+
		"\r\5\r\u017a\n\r\3\16\3\16\5\16\u017e\n\16\3\16\3\16\3\16\3\16\5\16\u0184"+
		"\n\16\3\16\3\16\3\16\5\16\u0189\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u0190"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0199\n\16\f\16\16\16\u019c"+
		"\13\16\5\16\u019e\n\16\5\16\u01a0\n\16\3\16\3\16\3\16\3\16\5\16\u01a6"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u01ac\n\16\3\16\3\16\5\16\u01b0\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u01b7\n\16\3\16\3\16\6\16\u01bb\n\16\r\16"+
		"\16\16\u01bc\3\16\3\16\3\17\3\17\5\17\u01c3\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u01c9\n\17\3\17\3\17\3\17\5\17\u01ce\n\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u01da\n\20\3\20\3\20\3\20\5\20\u01df\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01e8\n\20\f\20\16\20\u01eb"+
		"\13\20\3\20\3\20\5\20\u01ef\n\20\3\21\5\21\u01f2\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u01f9\n\21\3\22\5\22\u01fc\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0203\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u020a\n\22\f\22\16\22\u020d"+
		"\13\22\5\22\u020f\n\22\3\22\3\22\3\22\3\22\5\22\u0215\n\22\5\22\u0217"+
		"\n\22\3\23\3\23\5\23\u021b\n\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0223"+
		"\n\24\3\24\3\24\3\24\5\24\u0228\n\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"\u0230\n\25\3\25\3\25\3\25\5\25\u0235\n\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\5\26\u023d\n\26\3\26\3\26\3\26\5\26\u0242\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u024a\n\27\3\27\3\27\3\27\5\27\u024f\n\27\3\27\3\27\3"+
		"\30\3\30\5\30\u0255\n\30\3\30\3\30\3\30\7\30\u025a\n\30\f\30\16\30\u025d"+
		"\13\30\5\30\u025f\n\30\3\30\3\30\3\30\3\30\7\30\u0265\n\30\f\30\16\30"+
		"\u0268\13\30\3\30\3\30\3\30\3\30\3\30\7\30\u026f\n\30\f\30\16\30\u0272"+
		"\13\30\5\30\u0274\n\30\3\30\3\30\3\30\3\30\5\30\u027a\n\30\5\30\u027c"+
		"\n\30\3\31\5\31\u027f\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0292\n\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0298\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u029f\n\31\f\31\16"+
		"\31\u02a2\13\31\3\31\3\31\5\31\u02a6\n\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u02ad\n\31\f\31\16\31\u02b0\13\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u02b8\n\31\f\31\16\31\u02bb\13\31\3\31\3\31\7\31\u02bf\n\31\f\31\16\31"+
		"\u02c2\13\31\3\31\3\31\3\31\5\31\u02c7\n\31\3\32\3\32\3\32\3\32\5\32\u02cd"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02d6\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u02dd\n\33\3\33\3\33\5\33\u02e1\n\33\5\33\u02e3\n\33\3"+
		"\34\3\34\5\34\u02e7\n\34\3\34\3\34\3\35\3\35\3\35\5\35\u02ee\n\35\5\35"+
		"\u02f0\n\35\3\35\3\35\5\35\u02f4\n\35\3\35\5\35\u02f7\n\35\3\36\3\36\3"+
		"\36\3\37\3\37\5\37\u02fe\n\37\3\37\3\37\3\37\7\37\u0303\n\37\f\37\16\37"+
		"\u0306\13\37\5\37\u0308\n\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0310"+
		"\n\37\f\37\16\37\u0313\13\37\5\37\u0315\n\37\3\37\3\37\3\37\3\37\5\37"+
		"\u031b\n\37\5\37\u031d\n\37\3 \3 \5 \u0321\n \3 \3 \3 \7 \u0326\n \f "+
		"\16 \u0329\13 \5 \u032b\n \3 \3 \3 \3 \7 \u0331\n \f \16 \u0334\13 \3"+
		" \3 \3 \3 \3 \7 \u033b\n \f \16 \u033e\13 \5 \u0340\n \3 \3 \3 \3 \5 "+
		"\u0346\n \5 \u0348\n \3!\3!\5!\u034c\n!\3!\3!\3!\7!\u0351\n!\f!\16!\u0354"+
		"\13!\3!\3!\3!\3!\7!\u035a\n!\f!\16!\u035d\13!\3!\5!\u0360\n!\5!\u0362"+
		"\n!\3!\3!\5!\u0366\n!\3!\3!\3!\3!\3!\7!\u036d\n!\f!\16!\u0370\13!\3!\3"+
		"!\5!\u0374\n!\5!\u0376\n!\3!\3!\3!\3!\3!\7!\u037d\n!\f!\16!\u0380\13!"+
		"\3!\3!\3!\3!\3!\3!\7!\u0388\n!\f!\16!\u038b\13!\3!\3!\7!\u038f\n!\f!\16"+
		"!\u0392\13!\5!\u0394\n!\3\"\5\"\u0397\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u03a4\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u03b0\n\"\f\"\16\"\u03b3\13\"\3\"\3\"\5\"\u03b7\n\"\3#\5#\u03ba\n"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u03c7\n#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\7#\u03d3\n#\f#\16#\u03d6\13#\3#\3#\5#\u03da\n#\3#\3#\3#\3#\3#"+
		"\7#\u03e1\n#\f#\16#\u03e4\13#\5#\u03e6\n#\3#\3#\3#\3#\5#\u03ec\n#\5#\u03ee"+
		"\n#\3$\3$\3%\3%\5%\u03f4\n%\3%\7%\u03f7\n%\f%\16%\u03fa\13%\3&\6&\u03fd"+
		"\n&\r&\16&\u03fe\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u040b\n&\3\'\3\'\5\'"+
		"\u040f\n\'\3\'\3\'\3\'\5\'\u0414\n\'\3\'\3\'\5\'\u0418\n\'\3\'\5\'\u041b"+
		"\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u042d\n\'\3\'\3\'\3\'\5\'\u0432\n\'\3(\3(\3(\5(\u0437\n(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u0442\n)\3)\3)\3)\5)\u0447\n)\3)\3)\3)\3)\5)\u044d"+
		"\n)\3)\3)\3)\7)\u0452\n)\f)\16)\u0455\13)\3)\5)\u0458\n)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0468\n)\3)\5)\u046b\n)\3)\3)\3)\3)\3"+
		")\3)\5)\u0473\n)\3)\3)\3)\3)\3)\6)\u047a\n)\r)\16)\u047b\3)\3)\5)\u0480"+
		"\n)\3)\3)\3)\5)\u0485\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u04a3\n)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\5)\u04af\n)\3)\3)\3)\5)\u04b4\n)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\5)\u04c0\n)\3)\3)\3)\3)\5)\u04c6\n)\3)\3)\3)\3)\3)\5)\u04cd\n)"+
		"\3)\3)\5)\u04d1\n)\3)\3)\3)\3)\3)\3)\7)\u04d9\n)\f)\16)\u04dc\13)\5)\u04de"+
		"\n)\3)\3)\3)\3)\5)\u04e4\n)\3)\5)\u04e7\n)\7)\u04e9\n)\f)\16)\u04ec\13"+
		")\3*\3*\3*\3*\3*\3*\7*\u04f4\n*\f*\16*\u04f7\13*\3*\3*\5*\u04fb\n*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0507\n*\3*\3*\5*\u050b\n*\7*\u050d\n*"+
		"\f*\16*\u0510\13*\3*\5*\u0513\n*\3*\3*\3*\3*\3*\5*\u051a\n*\5*\u051c\n"+
		"*\3+\3+\3+\3+\3+\3+\5+\u0524\n+\3+\3+\3,\3,\3,\5,\u052b\n,\3,\5,\u052e"+
		"\n,\3-\3-\5-\u0532\n-\3-\3-\3-\5-\u0537\n-\3-\3-\3-\3-\7-\u053d\n-\f-"+
		"\16-\u0540\13-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0550\n-\f"+
		"-\16-\u0553\13-\3-\3-\3-\5-\u0558\n-\3.\3.\5.\u055c\n.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\7.\u056a\n.\f.\16.\u056d\13.\3/\3/\3/\5/\u0572\n"+
		"/\3/\3/\3/\3/\3/\3/\5/\u057a\n/\3\60\3\60\3\60\5\60\u057f\n\60\3\60\5"+
		"\60\u0582\n\60\3\61\3\61\3\61\5\61\u0587\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\7\62\u058e\n\62\f\62\16\62\u0591\13\62\3\62\3\62\5\62\u0595\n\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u05a3\n\63"+
		"\3\63\5\63\u05a6\n\63\5\63\u05a8\n\63\3\64\3\64\3\64\5\64\u05ad\n\64\3"+
		"\64\3\64\5\64\u05b1\n\64\3\64\5\64\u05b4\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u05bb\n\64\3\64\3\64\3\64\3\64\7\64\u05c1\n\64\f\64\16\64\u05c4"+
		"\13\64\3\64\5\64\u05c7\n\64\3\64\3\64\5\64\u05cb\n\64\3\64\5\64\u05ce"+
		"\n\64\3\64\3\64\3\64\3\64\5\64\u05d4\n\64\3\64\5\64\u05d7\n\64\5\64\u05d9"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u05e0\n\65\f\65\16\65\u05e3\13\65"+
		"\3\66\3\66\5\66\u05e7\n\66\3\66\3\66\5\66\u05eb\n\66\3\66\3\66\5\66\u05ef"+
		"\n\66\3\66\5\66\u05f2\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u05fb"+
		"\n\67\f\67\16\67\u05fe\13\67\3\67\3\67\5\67\u0602\n\67\38\38\58\u0606"+
		"\n8\38\38\38\78\u060b\n8\f8\168\u060e\138\38\38\38\38\78\u0614\n8\f8\16"+
		"8\u0617\138\38\58\u061a\n8\58\u061c\n8\38\38\58\u0620\n8\38\38\38\38\3"+
		"8\78\u0627\n8\f8\168\u062a\138\38\38\58\u062e\n8\58\u0630\n8\38\38\38"+
		"\38\38\78\u0637\n8\f8\168\u063a\138\38\38\38\38\38\38\78\u0642\n8\f8\16"+
		"8\u0645\138\38\38\78\u0649\n8\f8\168\u064c\138\58\u064e\n8\39\39\39\3"+
		"9\39\59\u0655\n9\3:\3:\3:\3:\3:\7:\u065c\n:\f:\16:\u065f\13:\3:\3:\5:"+
		"\u0663\n:\3;\5;\u0666\n;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\5?\u0672\n?\3@"+
		"\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K"+
		"\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\3S\3S\3S\3S\5S\u06a1"+
		"\nS\3S\2\3PT\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\2\24\5\2<<GGTT\4\2\61\61DD\4\2\7\7ll\3\2\u0085\u0086\4\2"+
		"\37\37@@\4\2$$>>\7\2\33\33JJSS||\177\177\4\2\t\t\16\17\3\2\n\13\3\2\20"+
		"\23\3\2\24\27\6\2OOcceexx\4\2==\u008d\u008d\5\2\33\33JJ\177\177\6\2\66"+
		"8jj\u0098\u0098\u009a\u009b\4\2\n\fhh\4\2\u0097\u0097\u009a\u009a\3\2"+
		"\33\u0096\u0792\2\u00aa\3\2\2\2\4\u00af\3\2\2\2\6\u00b5\3\2\2\2\b\u00cc"+
		"\3\2\2\2\n\u00ce\3\2\2\2\f\u00e0\3\2\2\2\16\u00e9\3\2\2\2\20\u00f1\3\2"+
		"\2\2\22\u00fb\3\2\2\2\24\u010e\3\2\2\2\26\u0132\3\2\2\2\30\u0152\3\2\2"+
		"\2\32\u017b\3\2\2\2\34\u01c0\3\2\2\2\36\u01d3\3\2\2\2 \u01f1\3\2\2\2\""+
		"\u01fb\3\2\2\2$\u0218\3\2\2\2&\u021e\3\2\2\2(\u022b\3\2\2\2*\u0238\3\2"+
		"\2\2,\u0245\3\2\2\2.\u025e\3\2\2\2\60\u027e\3\2\2\2\62\u02c8\3\2\2\2\64"+
		"\u02d7\3\2\2\2\66\u02e4\3\2\2\28\u02ea\3\2\2\2:\u02f8\3\2\2\2<\u0307\3"+
		"\2\2\2>\u032a\3\2\2\2@\u0393\3\2\2\2B\u0396\3\2\2\2D\u03b9\3\2\2\2F\u03ef"+
		"\3\2\2\2H\u03f1\3\2\2\2J\u03fc\3\2\2\2L\u040e\3\2\2\2N\u0436\3\2\2\2P"+
		"\u0484\3\2\2\2R\u04ed\3\2\2\2T\u051d\3\2\2\2V\u0527\3\2\2\2X\u0531\3\2"+
		"\2\2Z\u0559\3\2\2\2\\\u0571\3\2\2\2^\u057b\3\2\2\2`\u0586\3\2\2\2b\u0588"+
		"\3\2\2\2d\u05a7\3\2\2\2f\u05d8\3\2\2\2h\u05da\3\2\2\2j\u05f1\3\2\2\2l"+
		"\u0601\3\2\2\2n\u064d\3\2\2\2p\u0654\3\2\2\2r\u0656\3\2\2\2t\u0665\3\2"+
		"\2\2v\u0669\3\2\2\2x\u066b\3\2\2\2z\u066d\3\2\2\2|\u0671\3\2\2\2~\u0673"+
		"\3\2\2\2\u0080\u0675\3\2\2\2\u0082\u0677\3\2\2\2\u0084\u0679\3\2\2\2\u0086"+
		"\u067b\3\2\2\2\u0088\u067d\3\2\2\2\u008a\u067f\3\2\2\2\u008c\u0681\3\2"+
		"\2\2\u008e\u0683\3\2\2\2\u0090\u0685\3\2\2\2\u0092\u0687\3\2\2\2\u0094"+
		"\u0689\3\2\2\2\u0096\u068b\3\2\2\2\u0098\u068d\3\2\2\2\u009a\u068f\3\2"+
		"\2\2\u009c\u0691\3\2\2\2\u009e\u0693\3\2\2\2\u00a0\u0695\3\2\2\2\u00a2"+
		"\u0697\3\2\2\2\u00a4\u06a0\3\2\2\2\u00a6\u00a9\5\6\4\2\u00a7\u00a9\5\4"+
		"\3\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7\2\2\3\u00ae\3\3\2\2\2\u00af\u00b0\7\u009f\2\2\u00b0"+
		"\u00b1\b\3\1\2\u00b1\5\3\2\2\2\u00b2\u00b4\7\3\2\2\u00b3\u00b2\3\2\2\2"+
		"\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00c1\5\b\5\2\u00b9\u00bb\7\3\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\5\b\5\2\u00bf\u00ba\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c7\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\3\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\7\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\u00cd\5<\37\2\u00cb\u00cd\5> \2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\t\3\2\2\2\u00ce\u00cf\7 \2\2\u00cf"+
		"\u00d3\7\u0084\2\2\u00d0\u00d1\5\u0086D\2\u00d1\u00d2\7\4\2\2\u00d2\u00d4"+
		"\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00de\5\u0088E\2\u00d6\u00d7\7{\2\2\u00d7\u00d8\7\u0088\2\2\u00d8\u00df"+
		"\5\u008cG\2\u00d9\u00db\7\35\2\2\u00da\u00dc\7\60\2\2\u00db\u00da\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\5H%\2\u00de\u00d6"+
		"\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\13\3\2\2\2\u00e0\u00e7\7!\2\2\u00e1"+
		"\u00e8\5\u0086D\2\u00e2\u00e8\5\u008aF\2\u00e3\u00e4\5\u0086D\2\u00e4"+
		"\u00e5\7\4\2\2\u00e5\u00e6\5\u008aF\2\u00e6\u00e8\3\2\2\2\u00e7\u00e1"+
		"\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\r\3\2\2\2\u00e9\u00eb\7%\2\2\u00ea\u00ec\79\2\2\u00eb\u00ea\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5P)\2\u00ee\u00ef\7#\2"+
		"\2\u00ef\u00f0\5\u0086D\2\u00f0\17\3\2\2\2\u00f1\u00f3\7(\2\2\u00f2\u00f4"+
		"\t\2\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f9\3\2\2\2\u00f5"+
		"\u00f7\7\u0089\2\2\u00f6\u00f8\5\u00a2R\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\21\3\2\2\2\u00fb\u0100\t\3\2\2\u00fc\u00fe\7\u0089\2\2\u00fd\u00ff\5"+
		"\u00a2R\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2"+
		"\u0100\u00fc\3\2\2\2\u0100\u0101\3\2\2\2\u0101\23\3\2\2\2\u0102\u0104"+
		"\7\u0095\2\2\u0103\u0105\7v\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2"+
		"\2\u0105\u0106\3\2\2\2\u0106\u010b\5b\62\2\u0107\u0108\7\7\2\2\u0108\u010a"+
		"\5b\62\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0102\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u011a\5n8\2\u0111\u0113"+
		"\7\u008b\2\2\u0112\u0114\7\37\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0118\3\2\2\2\u0115\u0118\7\\\2\2\u0116\u0118\7F\2\2\u0117"+
		"\u0111\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011b\5n8\2\u011a\u0117\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0128\3\2\2\2\u011e\u011f\7o\2\2\u011f"+
		"\u0120\7*\2\2\u0120\u0125\5^\60\2\u0121\u0122\7\7\2\2\u0122\u0124\5^\60"+
		"\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u011e\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0130\3\2\2\2\u012a\u012b\7d\2\2\u012b\u012e\5P)"+
		"\2\u012c\u012d\t\4\2\2\u012d\u012f\5P)\2\u012e\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012a\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\25\3\2\2\2\u0132\u0134\7\64\2\2\u0133\u0135\7\u008c\2\2\u0134\u0133\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013a\7V\2\2\u0137"+
		"\u0138\7R\2\2\u0138\u0139\7h\2\2\u0139\u013b\7H\2\2\u013a\u0137\3\2\2"+
		"\2\u013a\u013b\3\2\2\2\u013b\u013f\3\2\2\2\u013c\u013d\5\u0086D\2\u013d"+
		"\u013e\7\4\2\2\u013e\u0140\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\5\u0094K\2\u0142\u0143\7m\2\2\u0143"+
		"\u0144\5\u0088E\2\u0144\u0145\7\5\2\2\u0145\u014a\5V,\2\u0146\u0147\7"+
		"\7\2\2\u0147\u0149\5V,\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014d\u0150\7\6\2\2\u014e\u014f\7\u0094\2\2\u014f\u0151\5P)\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\27\3\2\2\2\u0152\u0154\7\64\2"+
		"\2\u0153\u0155\t\5\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u015a\7\u0084\2\2\u0157\u0158\7R\2\2\u0158\u0159\7h\2\2"+
		"\u0159\u015b\7H\2\2\u015a\u0157\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015f"+
		"\3\2\2\2\u015c\u015d\5\u0086D\2\u015d\u015e\7\4\2\2\u015e\u0160\3\2\2"+
		"\2\u015f\u015c\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0179"+
		"\5\u0088E\2\u0162\u0163\7\5\2\2\u0163\u0168\5H%\2\u0164\u0165\7\7\2\2"+
		"\u0165\u0167\5H%\2\u0166\u0164\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016f\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016c\7\7\2\2\u016c\u016e\5X-\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2\2"+
		"\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0172\u0175\7\6\2\2\u0173\u0174\7\u0096\2\2\u0174\u0176\7\u0097"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017a\3\2\2\2\u0177"+
		"\u0178\7#\2\2\u0178\u017a\5> \2\u0179\u0162\3\2\2\2\u0179\u0177\3\2\2"+
		"\2\u017a\31\3\2\2\2\u017b\u017d\7\64\2\2\u017c\u017e\t\5\2\2\u017d\u017c"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0183\7\u008a\2"+
		"\2\u0180\u0181\7R\2\2\u0181\u0182\7h\2\2\u0182\u0184\7H\2\2\u0183\u0180"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0188\3\2\2\2\u0185\u0186\5\u0086D"+
		"\2\u0186\u0187\7\4\2\2\u0187\u0189\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018f\5\u0096L\2\u018b\u0190\7\'\2"+
		"\2\u018c\u0190\7\36\2\2\u018d\u018e\7[\2\2\u018e\u0190\7k\2\2\u018f\u018b"+
		"\3\2\2\2\u018f\u018c\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u019f\3\2\2\2\u0191\u01a0\7=\2\2\u0192\u01a0\7Z\2\2\u0193\u019d\7\u008d"+
		"\2\2\u0194\u0195\7k\2\2\u0195\u019a\5\u008eH\2\u0196\u0197\7\7\2\2\u0197"+
		"\u0199\5\u008eH\2\u0198\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u0194\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u0191\3\2"+
		"\2\2\u019f\u0192\3\2\2\2\u019f\u0193\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a5\7m\2\2\u01a2\u01a3\5\u0086D\2\u01a3\u01a4\7\4\2\2\u01a4\u01a6\3"+
		"\2\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01ab\5\u0088E\2\u01a8\u01a9\7K\2\2\u01a9\u01aa\7B\2\2\u01aa\u01ac\7"+
		"\u0080\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\3\2\2\2"+
		"\u01ad\u01ae\7\u0093\2\2\u01ae\u01b0\5P)\2\u01af\u01ad\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01ba\7(\2\2\u01b2\u01b7\5B\"\2\u01b3"+
		"\u01b7\5\60\31\2\u01b4\u01b7\5 \21\2\u01b5\u01b7\5> \2\u01b6\u01b2\3\2"+
		"\2\2\u01b6\u01b3\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b9\7\3\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b6\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\7D\2\2\u01bf\33\3\2\2\2\u01c0\u01c2\7\64\2"+
		"\2\u01c1\u01c3\t\5\2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\u01c8\7\u0091\2\2\u01c5\u01c6\7R\2\2\u01c6\u01c7\7h\2\2"+
		"\u01c7\u01c9\7H\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cd"+
		"\3\2\2\2\u01ca\u01cb\5\u0086D\2\u01cb\u01cc\7\4\2\2\u01cc\u01ce\3\2\2"+
		"\2\u01cd\u01ca\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0"+
		"\5\u0098M\2\u01d0\u01d1\7#\2\2\u01d1\u01d2\5> \2\u01d2\35\3\2\2\2\u01d3"+
		"\u01d4\7\64\2\2\u01d4\u01d5\7\u0092\2\2\u01d5\u01d9\7\u0084\2\2\u01d6"+
		"\u01d7\7R\2\2\u01d7\u01d8\7h\2\2\u01d8\u01da\7H\2\2\u01d9\u01d6\3\2\2"+
		"\2\u01d9\u01da\3\2\2\2\u01da\u01de\3\2\2\2\u01db\u01dc\5\u0086D\2\u01dc"+
		"\u01dd\7\4\2\2\u01dd\u01df\3\2\2\2\u01de\u01db\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\5\u0088E\2\u01e1\u01e2\7\u008e\2"+
		"\2\u01e2\u01ee\5\u009aN\2\u01e3\u01e4\7\5\2\2\u01e4\u01e9\5|?\2\u01e5"+
		"\u01e6\7\7\2\2\u01e6\u01e8\5|?\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2"+
		"\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9"+
		"\3\2\2\2\u01ec\u01ed\7\6\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01e3\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\37\3\2\2\2\u01f0\u01f2\5Z.\2\u01f1\u01f0\3\2\2\2"+
		"\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7=\2\2\u01f4\u01f5"+
		"\7M\2\2\u01f5\u01f8\5\\/\2\u01f6\u01f7\7\u0094\2\2\u01f7\u01f9\5P)\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9!\3\2\2\2\u01fa\u01fc\5Z.\2\u01fb"+
		"\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7="+
		"\2\2\u01fe\u01ff\7M\2\2\u01ff\u0202\5\\/\2\u0200\u0201\7\u0094\2\2\u0201"+
		"\u0203\5P)\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0216\3\2\2"+
		"\2\u0204\u0205\7o\2\2\u0205\u0206\7*\2\2\u0206\u020b\5^\60\2\u0207\u0208"+
		"\7\7\2\2\u0208\u020a\5^\60\2\u0209\u0207\3\2\2\2\u020a\u020d\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020e\u0204\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0211\7d\2\2\u0211\u0214\5P)\2\u0212\u0213\t\4\2\2\u0213\u0215\5P)\2"+
		"\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u020e"+
		"\3\2\2\2\u0216\u0217\3\2\2\2\u0217#\3\2\2\2\u0218\u021a\7?\2\2\u0219\u021b"+
		"\79\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021d\5\u0086D\2\u021d%\3\2\2\2\u021e\u021f\7A\2\2\u021f\u0222\7V\2\2"+
		"\u0220\u0221\7R\2\2\u0221\u0223\7H\2\2\u0222\u0220\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223\u0227\3\2\2\2\u0224\u0225\5\u0086D\2\u0225\u0226\7\4\2"+
		"\2\u0226\u0228\3\2\2\2\u0227\u0224\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u022a\5\u0094K\2\u022a\'\3\2\2\2\u022b\u022c\7A\2\2\u022c"+
		"\u022f\7\u0084\2\2\u022d\u022e\7R\2\2\u022e\u0230\7H\2\2\u022f\u022d\3"+
		"\2\2\2\u022f\u0230\3\2\2\2\u0230\u0234\3\2\2\2\u0231\u0232\5\u0086D\2"+
		"\u0232\u0233\7\4\2\2\u0233\u0235\3\2\2\2\u0234\u0231\3\2\2\2\u0234\u0235"+
		"\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\5\u0088E\2\u0237)\3\2\2\2\u0238"+
		"\u0239\7A\2\2\u0239\u023c\7\u008a\2\2\u023a\u023b\7R\2\2\u023b\u023d\7"+
		"H\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0241\3\2\2\2\u023e"+
		"\u023f\5\u0086D\2\u023f\u0240\7\4\2\2\u0240\u0242\3\2\2\2\u0241\u023e"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\5\u0096L"+
		"\2\u0244+\3\2\2\2\u0245\u0246\7A\2\2\u0246\u0249\7\u0091\2\2\u0247\u0248"+
		"\7R\2\2\u0248\u024a\7H\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024e\3\2\2\2\u024b\u024c\5\u0086D\2\u024c\u024d\7\4\2\2\u024d\u024f"+
		"\3\2\2\2\u024e\u024b\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\5\u0098M\2\u0251-\3\2\2\2\u0252\u0254\7\u0095\2\2\u0253\u0255\7"+
		"v\2\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u025b\5b\62\2\u0257\u0258\7\7\2\2\u0258\u025a\5b\62\2\u0259\u0257\3\2"+
		"\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0252\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f\u0260\3\2\2\2\u0260\u0266\5n8\2\u0261\u0262\5p9\2\u0262\u0263"+
		"\5n8\2\u0263\u0265\3\2\2\2\u0264\u0261\3\2\2\2\u0265\u0268\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0273\3\2\2\2\u0268\u0266\3\2"+
		"\2\2\u0269\u026a\7o\2\2\u026a\u026b\7*\2\2\u026b\u0270\5^\60\2\u026c\u026d"+
		"\7\7\2\2\u026d\u026f\5^\60\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2\2\2\u0270"+
		"\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2"+
		"\2\2\u0273\u0269\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u027b\3\2\2\2\u0275"+
		"\u0276\7d\2\2\u0276\u0279\5P)\2\u0277\u0278\t\4\2\2\u0278\u027a\5P)\2"+
		"\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u0275"+
		"\3\2\2\2\u027b\u027c\3\2\2\2\u027c/\3\2\2\2\u027d\u027f\5Z.\2\u027e\u027d"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0291\3\2\2\2\u0280\u0292\7Z\2\2\u0281"+
		"\u0292\7|\2\2\u0282\u0283\7Z\2\2\u0283\u0284\7n\2\2\u0284\u0292\7|\2\2"+
		"\u0285\u0286\7Z\2\2\u0286\u0287\7n\2\2\u0287\u0292\7\177\2\2\u0288\u0289"+
		"\7Z\2\2\u0289\u028a\7n\2\2\u028a\u0292\7\33\2\2\u028b\u028c\7Z\2\2\u028c"+
		"\u028d\7n\2\2\u028d\u0292\7J\2\2\u028e\u028f\7Z\2\2\u028f\u0290\7n\2\2"+
		"\u0290\u0292\7S\2\2\u0291\u0280\3\2\2\2\u0291\u0281\3\2\2\2\u0291\u0282"+
		"\3\2\2\2\u0291\u0285\3\2\2\2\u0291\u0288\3\2\2\2\u0291\u028b\3\2\2\2\u0291"+
		"\u028e\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0297\7]\2\2\u0294\u0295\5\u0086"+
		"D\2\u0295\u0296\7\4\2\2\u0296\u0298\3\2\2\2\u0297\u0294\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u02a5\5\u0088E\2\u029a\u029b"+
		"\7\5\2\2\u029b\u02a0\5\u008eH\2\u029c\u029d\7\7\2\2\u029d\u029f\5\u008e"+
		"H\2\u029e\u029c\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\7\6"+
		"\2\2\u02a4\u02a6\3\2\2\2\u02a5\u029a\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02c6\3\2\2\2\u02a7\u02a8\7\u0090\2\2\u02a8\u02a9\7\5\2\2\u02a9\u02ae"+
		"\5P)\2\u02aa\u02ab\7\7\2\2\u02ab\u02ad\5P)\2\u02ac\u02aa\3\2\2\2\u02ad"+
		"\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\3\2"+
		"\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02c0\7\6\2\2\u02b2\u02b3\7\7\2\2\u02b3"+
		"\u02b4\7\5\2\2\u02b4\u02b9\5P)\2\u02b5\u02b6\7\7\2\2\u02b6\u02b8\5P)\2"+
		"\u02b7\u02b5\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba"+
		"\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\7\6\2\2\u02bd"+
		"\u02bf\3\2\2\2\u02be\u02b2\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2"+
		"\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c7\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3"+
		"\u02c7\5> \2\u02c4\u02c5\7:\2\2\u02c5\u02c7\7\u0090\2\2\u02c6\u02a7\3"+
		"\2\2\2\u02c6\u02c3\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\61\3\2\2\2\u02c8"+
		"\u02cc\7r\2\2\u02c9\u02ca\5\u0086D\2\u02ca\u02cb\7\4\2\2\u02cb\u02cd\3"+
		"\2\2\2\u02cc\u02c9\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02d5\5\u009cO\2\u02cf\u02d0\7\b\2\2\u02d0\u02d6\5`\61\2\u02d1\u02d2"+
		"\7\5\2\2\u02d2\u02d3\5`\61\2\u02d3\u02d4\7\6\2\2\u02d4\u02d6\3\2\2\2\u02d5"+
		"\u02cf\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\63\3\2\2"+
		"\2\u02d7\u02e2\7y\2\2\u02d8\u02e3\5\u0090I\2\u02d9\u02da\5\u0086D\2\u02da"+
		"\u02db\7\4\2\2\u02db\u02dd\3\2\2\2\u02dc\u02d9\3\2\2\2\u02dc\u02dd\3\2"+
		"\2\2\u02dd\u02e0\3\2\2\2\u02de\u02e1\5\u0088E\2\u02df\u02e1\5\u0094K\2"+
		"\u02e0\u02de\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02d8"+
		"\3\2\2\2\u02e2\u02dc\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\65\3\2\2\2\u02e4"+
		"\u02e6\7z\2\2\u02e5\u02e7\7\u0081\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\5\u009eP\2\u02e9\67\3\2\2\2\u02ea"+
		"\u02ef\7\177\2\2\u02eb\u02ed\7\u0089\2\2\u02ec\u02ee\5\u00a2R\2\u02ed"+
		"\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02eb\3\2"+
		"\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f6\3\2\2\2\u02f1\u02f3\7\u0088\2\2\u02f2"+
		"\u02f4\7\u0081\2\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5"+
		"\3\2\2\2\u02f5\u02f7\5\u009eP\2\u02f6\u02f1\3\2\2\2\u02f6\u02f7\3\2\2"+
		"\2\u02f79\3\2\2\2\u02f8\u02f9\7\u0081\2\2\u02f9\u02fa\5\u009eP\2\u02fa"+
		";\3\2\2\2\u02fb\u02fd\7\u0095\2\2\u02fc\u02fe\7v\2\2\u02fd\u02fc\3\2\2"+
		"\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0304\5b\62\2\u0300\u0301"+
		"\7\7\2\2\u0301\u0303\5b\62\2\u0302\u0300\3\2\2\2\u0303\u0306\3\2\2\2\u0304"+
		"\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2"+
		"\2\2\u0307\u02fb\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u0314\5n8\2\u030a\u030b\7o\2\2\u030b\u030c\7*\2\2\u030c\u0311\5^\60\2"+
		"\u030d\u030e\7\7\2\2\u030e\u0310\5^\60\2\u030f\u030d\3\2\2\2\u0310\u0313"+
		"\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0315\3\2\2\2\u0313"+
		"\u0311\3\2\2\2\u0314\u030a\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u031c\3\2"+
		"\2\2\u0316\u0317\7d\2\2\u0317\u031a\5P)\2\u0318\u0319\t\4\2\2\u0319\u031b"+
		"\5P)\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c"+
		"\u0316\3\2\2\2\u031c\u031d\3\2\2\2\u031d=\3\2\2\2\u031e\u0320\7\u0095"+
		"\2\2\u031f\u0321\7v\2\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0327\5b\62\2\u0323\u0324\7\7\2\2\u0324\u0326\5b"+
		"\62\2\u0325\u0323\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u031e\3\2"+
		"\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0332\5@!\2\u032d\u032e"+
		"\5p9\2\u032e\u032f\5@!\2\u032f\u0331\3\2\2\2\u0330\u032d\3\2\2\2\u0331"+
		"\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u033f\3\2"+
		"\2\2\u0334\u0332\3\2\2\2\u0335\u0336\7o\2\2\u0336\u0337\7*\2\2\u0337\u033c"+
		"\5^\60\2\u0338\u0339\7\7\2\2\u0339\u033b\5^\60\2\u033a\u0338\3\2\2\2\u033b"+
		"\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0340\3\2"+
		"\2\2\u033e\u033c\3\2\2\2\u033f\u0335\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0347\3\2\2\2\u0341\u0342\7d\2\2\u0342\u0345\5P)\2\u0343\u0344\t\4\2"+
		"\2\u0344\u0346\5P)\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348"+
		"\3\2\2\2\u0347\u0341\3\2\2\2\u0347\u0348\3\2\2\2\u0348?\3\2\2\2\u0349"+
		"\u034b\7\u0082\2\2\u034a\u034c\t\6\2\2\u034b\u034a\3\2\2\2\u034b\u034c"+
		"\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u0352\5d\63\2\u034e\u034f\7\7\2\2\u034f"+
		"\u0351\5d\63\2\u0350\u034e\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2"+
		"\2\2\u0352\u0353\3\2\2\2\u0353\u0361\3\2\2\2\u0354\u0352\3\2\2\2\u0355"+
		"\u035f\7M\2\2\u0356\u035b\5f\64\2\u0357\u0358\7\7\2\2\u0358\u035a\5f\64"+
		"\2\u0359\u0357\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c"+
		"\3\2\2\2\u035c\u0360\3\2\2\2\u035d\u035b\3\2\2\2\u035e\u0360\5h\65\2\u035f"+
		"\u0356\3\2\2\2\u035f\u035e\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u0355\3\2"+
		"\2\2\u0361\u0362\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0364\7\u0094\2\2\u0364"+
		"\u0366\5P)\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0375\3\2\2"+
		"\2\u0367\u0368\7P\2\2\u0368\u0369\7*\2\2\u0369\u036e\5P)\2\u036a\u036b"+
		"\7\7\2\2\u036b\u036d\5P)\2\u036c\u036a\3\2\2\2\u036d\u0370\3\2\2\2\u036e"+
		"\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0373\3\2\2\2\u0370\u036e\3\2"+
		"\2\2\u0371\u0372\7Q\2\2\u0372\u0374\5P)\2\u0373\u0371\3\2\2\2\u0373\u0374"+
		"\3\2\2\2\u0374\u0376\3\2\2\2\u0375\u0367\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0394\3\2\2\2\u0377\u0378\7\u0090\2\2\u0378\u0379\7\5\2\2\u0379\u037e"+
		"\5P)\2\u037a\u037b\7\7\2\2\u037b\u037d\5P)\2\u037c\u037a\3\2\2\2\u037d"+
		"\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2"+
		"\2\2\u0380\u037e\3\2\2\2\u0381\u0390\7\6\2\2\u0382\u0383\7\7\2\2\u0383"+
		"\u0384\7\5\2\2\u0384\u0389\5P)\2\u0385\u0386\7\7\2\2\u0386\u0388\5P)\2"+
		"\u0387\u0385\3\2\2\2\u0388\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a"+
		"\3\2\2\2\u038a\u038c\3\2\2\2\u038b\u0389\3\2\2\2\u038c\u038d\7\6\2\2\u038d"+
		"\u038f\3\2\2\2\u038e\u0382\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2"+
		"\2\2\u0390\u0391\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0393"+
		"\u0349\3\2\2\2\u0393\u0377\3\2\2\2\u0394A\3\2\2\2\u0395\u0397\5Z.\2\u0396"+
		"\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u03a3\7\u008d"+
		"\2\2\u0399\u039a\7n\2\2\u039a\u03a4\7\177\2\2\u039b\u039c\7n\2\2\u039c"+
		"\u03a4\7\33\2\2\u039d\u039e\7n\2\2\u039e\u03a4\7|\2\2\u039f\u03a0\7n\2"+
		"\2\u03a0\u03a4\7J\2\2\u03a1\u03a2\7n\2\2\u03a2\u03a4\7S\2\2\u03a3\u0399"+
		"\3\2\2\2\u03a3\u039b\3\2\2\2\u03a3\u039d\3\2\2\2\u03a3\u039f\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\5\\"+
		"/\2\u03a6\u03a7\7\u0083\2\2\u03a7\u03a8\5\u008eH\2\u03a8\u03a9\7\b\2\2"+
		"\u03a9\u03b1\5P)\2\u03aa\u03ab\7\7\2\2\u03ab\u03ac\5\u008eH\2\u03ac\u03ad"+
		"\7\b\2\2\u03ad\u03ae\5P)\2\u03ae\u03b0\3\2\2\2\u03af\u03aa\3\2\2\2\u03b0"+
		"\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b6\3\2"+
		"\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b5\7\u0094\2\2\u03b5\u03b7\5P)\2\u03b6"+
		"\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7C\3\2\2\2\u03b8\u03ba\5Z.\2\u03b9"+
		"\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03c6\7\u008d"+
		"\2\2\u03bc\u03bd\7n\2\2\u03bd\u03c7\7\177\2\2\u03be\u03bf\7n\2\2\u03bf"+
		"\u03c7\7\33\2\2\u03c0\u03c1\7n\2\2\u03c1\u03c7\7|\2\2\u03c2\u03c3\7n\2"+
		"\2\u03c3\u03c7\7J\2\2\u03c4\u03c5\7n\2\2\u03c5\u03c7\7S\2\2\u03c6\u03bc"+
		"\3\2\2\2\u03c6\u03be\3\2\2\2\u03c6\u03c0\3\2\2\2\u03c6\u03c2\3\2\2\2\u03c6"+
		"\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\5\\"+
		"/\2\u03c9\u03ca\7\u0083\2\2\u03ca\u03cb\5\u008eH\2\u03cb\u03cc\7\b\2\2"+
		"\u03cc\u03d4\5P)\2\u03cd\u03ce\7\7\2\2\u03ce\u03cf\5\u008eH\2\u03cf\u03d0"+
		"\7\b\2\2\u03d0\u03d1\5P)\2\u03d1\u03d3\3\2\2\2\u03d2\u03cd\3\2\2\2\u03d3"+
		"\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d9\3\2"+
		"\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03d8\7\u0094\2\2\u03d8\u03da\5P)\2\u03d9"+
		"\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03ed\3\2\2\2\u03db\u03dc\7o"+
		"\2\2\u03dc\u03dd\7*\2\2\u03dd\u03e2\5^\60\2\u03de\u03df\7\7\2\2\u03df"+
		"\u03e1\5^\60\2\u03e0\u03de\3\2\2\2\u03e1\u03e4\3\2\2\2\u03e2\u03e0\3\2"+
		"\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e5"+
		"\u03db\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\7d"+
		"\2\2\u03e8\u03eb\5P)\2\u03e9\u03ea\t\4\2\2\u03ea\u03ec\5P)\2\u03eb\u03e9"+
		"\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03e5\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03eeE\3\2\2\2\u03ef\u03f0\7\u008f\2\2\u03f0G\3\2\2\2\u03f1"+
		"\u03f3\5\u008eH\2\u03f2\u03f4\5J&\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3"+
		"\2\2\2\u03f4\u03f8\3\2\2\2\u03f5\u03f7\5L\'\2\u03f6\u03f5\3\2\2\2\u03f7"+
		"\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9I\3\2\2\2"+
		"\u03fa\u03f8\3\2\2\2\u03fb\u03fd\5\u0082B\2\u03fc\u03fb\3\2\2\2\u03fd"+
		"\u03fe\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u040a\3\2"+
		"\2\2\u0400\u0401\7\5\2\2\u0401\u0402\5t;\2\u0402\u0403\7\6\2\2\u0403\u040b"+
		"\3\2\2\2\u0404\u0405\7\5\2\2\u0405\u0406\5t;\2\u0406\u0407\7\7\2\2\u0407"+
		"\u0408\5t;\2\u0408\u0409\7\6\2\2\u0409\u040b\3\2\2\2\u040a\u0400\3\2\2"+
		"\2\u040a\u0404\3\2\2\2\u040a\u040b\3\2\2\2\u040bK\3\2\2\2\u040c\u040d"+
		"\7\63\2\2\u040d\u040f\5\u0082B\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2"+
		"\2\u040f\u0431\3\2\2\2\u0410\u0411\7s\2\2\u0411\u0413\7a\2\2\u0412\u0414"+
		"\t\7\2\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u0417\5N(\2\u0416\u0418\7&\2\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2"+
		"\2\u0418\u0432\3\2\2\2\u0419\u041b\7h\2\2\u041a\u0419\3\2\2\2\u041a\u041b"+
		"\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\7j\2\2\u041d\u0432\5N(\2\u041e"+
		"\u041f\7\u008c\2\2\u041f\u0432\5N(\2\u0420\u0421\7.\2\2\u0421\u0422\7"+
		"\5\2\2\u0422\u0423\5P)\2\u0423\u0424\7\6\2\2\u0424\u0432\3\2\2\2\u0425"+
		"\u042c\7:\2\2\u0426\u042d\5t;\2\u0427\u042d\5v<\2\u0428\u0429\7\5\2\2"+
		"\u0429\u042a\5P)\2\u042a\u042b\7\6\2\2\u042b\u042d\3\2\2\2\u042c\u0426"+
		"\3\2\2\2\u042c\u0427\3\2\2\2\u042c\u0428\3\2\2\2\u042d\u0432\3\2\2\2\u042e"+
		"\u042f\7/\2\2\u042f\u0432\5\u0090I\2\u0430\u0432\5R*\2\u0431\u0410\3\2"+
		"\2\2\u0431\u041a\3\2\2\2\u0431\u041e\3\2\2\2\u0431\u0420\3\2\2\2\u0431"+
		"\u0425\3\2\2\2\u0431\u042e\3\2\2\2\u0431\u0430\3\2\2\2\u0432M\3\2\2\2"+
		"\u0433\u0434\7m\2\2\u0434\u0435\7\62\2\2\u0435\u0437\t\b\2\2\u0436\u0433"+
		"\3\2\2\2\u0436\u0437\3\2\2\2\u0437O\3\2\2\2\u0438\u0439\b)\1\2\u0439\u043a"+
		"\5x=\2\u043a\u043b\5P)\27\u043b\u0485\3\2\2\2\u043c\u0485\5v<\2\u043d"+
		"\u0485\7\u0099\2\2\u043e\u043f\5\u0086D\2\u043f\u0440\7\4\2\2\u0440\u0442"+
		"\3\2\2\2\u0441\u043e\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2\2\u0443"+
		"\u0444\5\u0088E\2\u0444\u0445\7\4\2\2\u0445\u0447\3\2\2\2\u0446\u0441"+
		"\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0485\5\u008eH"+
		"\2\u0449\u044a\5\u0084C\2\u044a\u0457\7\5\2\2\u044b\u044d\7@\2\2\u044c"+
		"\u044b\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0453\5P"+
		")\2\u044f\u0450\7\7\2\2\u0450\u0452\5P)\2\u0451\u044f\3\2\2\2\u0452\u0455"+
		"\3\2\2\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0458\3\2\2\2\u0455"+
		"\u0453\3\2\2\2\u0456\u0458\7\t\2\2\u0457\u044c\3\2\2\2\u0457\u0456\3\2"+
		"\2\2\u0457\u0458\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\7\6\2\2\u045a"+
		"\u0485\3\2\2\2\u045b\u045c\7\5\2\2\u045c\u045d\5P)\2\u045d\u045e\7\6\2"+
		"\2\u045e\u0485\3\2\2\2\u045f\u0460\7-\2\2\u0460\u0461\7\5\2\2\u0461\u0462"+
		"\5P)\2\u0462\u0463\7#\2\2\u0463\u0464\5J&\2\u0464\u0465\7\6\2\2\u0465"+
		"\u0485\3\2\2\2\u0466\u0468\7h\2\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2"+
		"\2\2\u0468\u0469\3\2\2\2\u0469\u046b\7H\2\2\u046a\u0467\3\2\2\2\u046a"+
		"\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\7\5\2\2\u046d\u046e\5>"+
		" \2\u046e\u046f\7\6\2\2\u046f\u0485\3\2\2\2\u0470\u0472\7,\2\2\u0471\u0473"+
		"\5P)\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0479\3\2\2\2\u0474"+
		"\u0475\7\u0093\2\2\u0475\u0476\5P)\2\u0476\u0477\7\u0087\2\2\u0477\u0478"+
		"\5P)\2\u0478\u047a\3\2\2\2\u0479\u0474\3\2\2\2\u047a\u047b\3\2\2\2\u047b"+
		"\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047f\3\2\2\2\u047d\u047e\7C"+
		"\2\2\u047e\u0480\5P)\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481"+
		"\3\2\2\2\u0481\u0482\7D\2\2\u0482\u0485\3\2\2\2\u0483\u0485\5T+\2\u0484"+
		"\u0438\3\2\2\2\u0484\u043c\3\2\2\2\u0484\u043d\3\2\2\2\u0484\u0446\3\2"+
		"\2\2\u0484\u0449\3\2\2\2\u0484\u045b\3\2\2\2\u0484\u045f\3\2\2\2\u0484"+
		"\u046a\3\2\2\2\u0484\u0470\3\2\2\2\u0484\u0483\3\2\2\2\u0485\u04ea\3\2"+
		"\2\2\u0486\u0487\f\26\2\2\u0487\u0488\7\r\2\2\u0488\u04e9\5P)\27\u0489"+
		"\u048a\f\25\2\2\u048a\u048b\t\t\2\2\u048b\u04e9\5P)\26\u048c\u048d\f\24"+
		"\2\2\u048d\u048e\t\n\2\2\u048e\u04e9\5P)\25\u048f\u0490\f\23\2\2\u0490"+
		"\u0491\t\13\2\2\u0491\u04e9\5P)\24\u0492\u0493\f\22\2\2\u0493\u0494\t"+
		"\f\2\2\u0494\u04e9\5P)\23\u0495\u04a2\f\21\2\2\u0496\u04a3\7\b\2\2\u0497"+
		"\u04a3\7\30\2\2\u0498\u04a3\7\31\2\2\u0499\u04a3\7\32\2\2\u049a\u04a3"+
		"\7^\2\2\u049b\u049c\7^\2\2\u049c\u04a3\7h\2\2\u049d\u04a3\7U\2\2\u049e"+
		"\u04a3\7c\2\2\u049f\u04a3\7O\2\2\u04a0\u04a3\7e\2\2\u04a1\u04a3\7x\2\2"+
		"\u04a2\u0496\3\2\2\2\u04a2\u0497\3\2\2\2\u04a2\u0498\3\2\2\2\u04a2\u0499"+
		"\3\2\2\2\u04a2\u049a\3\2\2\2\u04a2\u049b\3\2\2\2\u04a2\u049d\3\2\2\2\u04a2"+
		"\u049e\3\2\2\2\u04a2\u049f\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a1\3\2"+
		"\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04e9\5P)\22\u04a5\u04a6\f\20\2\2\u04a6"+
		"\u04a7\7\"\2\2\u04a7\u04e9\5P)\21\u04a8\u04a9\f\17\2\2\u04a9\u04aa\7n"+
		"\2\2\u04aa\u04e9\5P)\20\u04ab\u04ac\f\b\2\2\u04ac\u04ae\7^\2\2\u04ad\u04af"+
		"\7h\2\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u04e9\5P)\t\u04b1\u04b3\f\7\2\2\u04b2\u04b4\7h\2\2\u04b3\u04b2\3\2\2"+
		"\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\7)\2\2\u04b6\u04b7"+
		"\5P)\2\u04b7\u04b8\7\"\2\2\u04b8\u04b9\5P)\b\u04b9\u04e9\3\2\2\2\u04ba"+
		"\u04bb\f\13\2\2\u04bb\u04bc\7/\2\2\u04bc\u04e9\5\u0090I\2\u04bd\u04bf"+
		"\f\n\2\2\u04be\u04c0\7h\2\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u04c2\t\r\2\2\u04c2\u04c5\5P)\2\u04c3\u04c4\7E\2"+
		"\2\u04c4\u04c6\5P)\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04e9"+
		"\3\2\2\2\u04c7\u04cc\f\t\2\2\u04c8\u04cd\7_\2\2\u04c9\u04cd\7i\2\2\u04ca"+
		"\u04cb\7h\2\2\u04cb\u04cd\7j\2\2\u04cc\u04c8\3\2\2\2\u04cc\u04c9\3\2\2"+
		"\2\u04cc\u04ca\3\2\2\2\u04cd\u04e9\3\2\2\2\u04ce\u04d0\f\6\2\2\u04cf\u04d1"+
		"\7h\2\2\u04d0\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u04e6\7U\2\2\u04d3\u04dd\7\5\2\2\u04d4\u04de\5> \2\u04d5\u04da\5P)\2"+
		"\u04d6\u04d7\7\7\2\2\u04d7\u04d9\5P)\2\u04d8\u04d6\3\2\2\2\u04d9\u04dc"+
		"\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04de\3\2\2\2\u04dc"+
		"\u04da\3\2\2\2\u04dd\u04d4\3\2\2\2\u04dd\u04d5\3\2\2\2\u04dd\u04de\3\2"+
		"\2\2\u04de\u04df\3\2\2\2\u04df\u04e7\7\6\2\2\u04e0\u04e1\5\u0086D\2\u04e1"+
		"\u04e2\7\4\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04e0\3\2\2\2\u04e3\u04e4\3\2"+
		"\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e7\5\u0088E\2\u04e6\u04d3\3\2\2\2\u04e6"+
		"\u04e3\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u0486\3\2\2\2\u04e8\u0489\3\2"+
		"\2\2\u04e8\u048c\3\2\2\2\u04e8\u048f\3\2\2\2\u04e8\u0492\3\2\2\2\u04e8"+
		"\u0495\3\2\2\2\u04e8\u04a5\3\2\2\2\u04e8\u04a8\3\2\2\2\u04e8\u04ab\3\2"+
		"\2\2\u04e8\u04b1\3\2\2\2\u04e8\u04ba\3\2\2\2\u04e8\u04bd\3\2\2\2\u04e8"+
		"\u04c7\3\2\2\2\u04e8\u04ce\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04e8\3\2"+
		"\2\2\u04ea\u04eb\3\2\2\2\u04ebQ\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ed\u04ee"+
		"\7w\2\2\u04ee\u04fa\5\u0092J\2\u04ef\u04f0\7\5\2\2\u04f0\u04f5\5\u008e"+
		"H\2\u04f1\u04f2\7\7\2\2\u04f2\u04f4\5\u008eH\2\u04f3\u04f1\3\2\2\2\u04f4"+
		"\u04f7\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f8\3\2"+
		"\2\2\u04f7\u04f5\3\2\2\2\u04f8\u04f9\7\6\2\2\u04f9\u04fb\3\2\2\2\u04fa"+
		"\u04ef\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u050e\3\2\2\2\u04fc\u04fd\7m"+
		"\2\2\u04fd\u0506\t\16\2\2\u04fe\u04ff\7\u0083\2\2\u04ff\u0507\7j\2\2\u0500"+
		"\u0501\7\u0083\2\2\u0501\u0507\7:\2\2\u0502\u0507\7+\2\2\u0503\u0507\7"+
		"}\2\2\u0504\u0505\7g\2\2\u0505\u0507\7\34\2\2\u0506\u04fe\3\2\2\2\u0506"+
		"\u0500\3\2\2\2\u0506\u0502\3\2\2\2\u0506\u0503\3\2\2\2\u0506\u0504\3\2"+
		"\2\2\u0507\u050b\3\2\2\2\u0508\u0509\7e\2\2\u0509\u050b\5\u0082B\2\u050a"+
		"\u04fc\3\2\2\2\u050a\u0508\3\2\2\2\u050b\u050d\3\2\2\2\u050c\u050a\3\2"+
		"\2\2\u050d\u0510\3\2\2\2\u050e\u050c\3\2\2\2\u050e\u050f\3\2\2\2\u050f"+
		"\u051b\3\2\2\2\u0510\u050e\3\2\2\2\u0511\u0513\7h\2\2\u0512\u0511\3\2"+
		"\2\2\u0512\u0513\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0519\7;\2\2\u0515"+
		"\u0516\7X\2\2\u0516\u051a\7<\2\2\u0517\u0518\7X\2\2\u0518\u051a\7T\2\2"+
		"\u0519\u0515\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051c"+
		"\3\2\2\2\u051b\u0512\3\2\2\2\u051b\u051c\3\2\2\2\u051cS\3\2\2\2\u051d"+
		"\u051e\7u\2\2\u051e\u0523\7\5\2\2\u051f\u0524\7S\2\2\u0520\u0521\t\17"+
		"\2\2\u0521\u0522\7\7\2\2\u0522\u0524\5z>\2\u0523\u051f\3\2\2\2\u0523\u0520"+
		"\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\7\6\2\2\u0526U\3\2\2\2\u0527"+
		"\u052a\5\u008eH\2\u0528\u0529\7/\2\2\u0529\u052b\5\u0090I\2\u052a\u0528"+
		"\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052d\3\2\2\2\u052c\u052e\t\7\2\2\u052d"+
		"\u052c\3\2\2\2\u052d\u052e\3\2\2\2\u052eW\3\2\2\2\u052f\u0530\7\63\2\2"+
		"\u0530\u0532\5\u0082B\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532"+
		"\u0557\3\2\2\2\u0533\u0534\7s\2\2\u0534\u0537\7a\2\2\u0535\u0537\7\u008c"+
		"\2\2\u0536\u0533\3\2\2\2\u0536\u0535\3\2\2\2\u0537\u0538\3\2\2\2\u0538"+
		"\u0539\7\5\2\2\u0539\u053e\5V,\2\u053a\u053b\7\7\2\2\u053b\u053d\5V,\2"+
		"\u053c\u053a\3\2\2\2\u053d\u0540\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f"+
		"\3\2\2\2\u053f\u0541\3\2\2\2\u0540\u053e\3\2\2\2\u0541\u0542\7\6\2\2\u0542"+
		"\u0543\5N(\2\u0543\u0558\3\2\2\2\u0544\u0545\7.\2\2\u0545\u0546\7\5\2"+
		"\2\u0546\u0547\5P)\2\u0547\u0548\7\6\2\2\u0548\u0558\3\2\2\2\u0549\u054a"+
		"\7L\2\2\u054a\u054b\7a\2\2\u054b\u054c\7\5\2\2\u054c\u0551\5\u008eH\2"+
		"\u054d\u054e\7\7\2\2\u054e\u0550\5\u008eH\2\u054f\u054d\3\2\2\2\u0550"+
		"\u0553\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0554\3\2"+
		"\2\2\u0553\u0551\3\2\2\2\u0554\u0555\7\6\2\2\u0555\u0556\5R*\2\u0556\u0558"+
		"\3\2\2\2\u0557\u0536\3\2\2\2\u0557\u0544\3\2\2\2\u0557\u0549\3\2\2\2\u0558"+
		"Y\3\2\2\2\u0559\u055b\7\u0095\2\2\u055a\u055c\7v\2\2\u055b\u055a\3\2\2"+
		"\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\5r:\2\u055e\u055f"+
		"\7#\2\2\u055f\u0560\7\5\2\2\u0560\u0561\5> \2\u0561\u056b\7\6\2\2\u0562"+
		"\u0563\7\7\2\2\u0563\u0564\5r:\2\u0564\u0565\7#\2\2\u0565\u0566\7\5\2"+
		"\2\u0566\u0567\5> \2\u0567\u0568\7\6\2\2\u0568\u056a\3\2\2\2\u0569\u0562"+
		"\3\2\2\2\u056a\u056d\3\2\2\2\u056b\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c"+
		"[\3\2\2\2\u056d\u056b\3\2\2\2\u056e\u056f\5\u0086D\2\u056f\u0570\7\4\2"+
		"\2\u0570\u0572\3\2\2\2\u0571\u056e\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0573"+
		"\3\2\2\2\u0573\u0579\5\u0088E\2\u0574\u0575\7W\2\2\u0575\u0576\7*\2\2"+
		"\u0576\u057a\5\u0094K\2\u0577\u0578\7h\2\2\u0578\u057a\7W\2\2\u0579\u0574"+
		"\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a]\3\2\2\2\u057b"+
		"\u057e\5P)\2\u057c\u057d\7/\2\2\u057d\u057f\5\u0090I\2\u057e\u057c\3\2"+
		"\2\2\u057e\u057f\3\2\2\2\u057f\u0581\3\2\2\2\u0580\u0582\t\7\2\2\u0581"+
		"\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582_\3\2\2\2\u0583\u0587\5t;\2\u0584"+
		"\u0587\5\u0082B\2\u0585\u0587\7\u009a\2\2\u0586\u0583\3\2\2\2\u0586\u0584"+
		"\3\2\2\2\u0586\u0585\3\2\2\2\u0587a\3\2\2\2\u0588\u0594\5\u0088E\2\u0589"+
		"\u058a\7\5\2\2\u058a\u058f\5\u008eH\2\u058b\u058c\7\7\2\2\u058c\u058e"+
		"\5\u008eH\2\u058d\u058b\3\2\2\2\u058e\u0591\3\2\2\2\u058f\u058d\3\2\2"+
		"\2\u058f\u0590\3\2\2\2\u0590\u0592\3\2\2\2\u0591\u058f\3\2\2\2\u0592\u0593"+
		"\7\6\2\2\u0593\u0595\3\2\2\2\u0594\u0589\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
		"\u0596\3\2\2\2\u0596\u0597\7#\2\2\u0597\u0598\7\5\2\2\u0598\u0599\5> "+
		"\2\u0599\u059a\7\6\2\2\u059ac\3\2\2\2\u059b\u05a8\7\t\2\2\u059c\u059d"+
		"\5\u0088E\2\u059d\u059e\7\4\2\2\u059e\u059f\7\t\2\2\u059f\u05a8\3\2\2"+
		"\2\u05a0\u05a5\5P)\2\u05a1\u05a3\7#\2\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3"+
		"\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a6\5~@\2\u05a5\u05a2\3\2\2\2\u05a5"+
		"\u05a6\3\2\2\2\u05a6\u05a8\3\2\2\2\u05a7\u059b\3\2\2\2\u05a7\u059c\3\2"+
		"\2\2\u05a7\u05a0\3\2\2\2\u05a8e\3\2\2\2\u05a9\u05aa\5\u0086D\2\u05aa\u05ab"+
		"\7\4\2\2\u05ab\u05ad\3\2\2\2\u05ac\u05a9\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u05ae\3\2\2\2\u05ae\u05b3\5\u0088E\2\u05af\u05b1\7#\2\2\u05b0\u05af\3"+
		"\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\5\u00a0Q\2"+
		"\u05b3\u05b0\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05ba\3\2\2\2\u05b5\u05b6"+
		"\7W\2\2\u05b6\u05b7\7*\2\2\u05b7\u05bb\5\u0094K\2\u05b8\u05b9\7h\2\2\u05b9"+
		"\u05bb\7W\2\2\u05ba\u05b5\3\2\2\2\u05ba\u05b8\3\2\2\2\u05ba\u05bb\3\2"+
		"\2\2\u05bb\u05d9\3\2\2\2\u05bc\u05c6\7\5\2\2\u05bd\u05c2\5f\64\2\u05be"+
		"\u05bf\7\7\2\2\u05bf\u05c1\5f\64\2\u05c0\u05be\3\2\2\2\u05c1\u05c4\3\2"+
		"\2\2\u05c2\u05c0\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c7\3\2\2\2\u05c4"+
		"\u05c2\3\2\2\2\u05c5\u05c7\5h\65\2\u05c6\u05bd\3\2\2\2\u05c6\u05c5\3\2"+
		"\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05cd\7\6\2\2\u05c9\u05cb\7#\2\2\u05ca"+
		"\u05c9\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05ce\5\u00a0"+
		"Q\2\u05cd\u05ca\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d9\3\2\2\2\u05cf"+
		"\u05d0\7\5\2\2\u05d0\u05d1\5> \2\u05d1\u05d6\7\6\2\2\u05d2\u05d4\7#\2"+
		"\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7"+
		"\5\u00a0Q\2\u05d6\u05d3\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9\3\2\2"+
		"\2\u05d8\u05ac\3\2\2\2\u05d8\u05bc\3\2\2\2\u05d8\u05cf\3\2\2\2\u05d9g"+
		"\3\2\2\2\u05da\u05e1\5f\64\2\u05db\u05dc\5j\66\2\u05dc\u05dd\5f\64\2\u05dd"+
		"\u05de\5l\67\2\u05de\u05e0\3\2\2\2\u05df\u05db\3\2\2\2\u05e0\u05e3\3\2"+
		"\2\2\u05e1\u05df\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2i\3\2\2\2\u05e3\u05e1"+
		"\3\2\2\2\u05e4\u05f2\7\7\2\2\u05e5\u05e7\7f\2\2\u05e6\u05e5\3\2\2\2\u05e6"+
		"\u05e7\3\2\2\2\u05e7\u05ee\3\2\2\2\u05e8\u05ea\7b\2\2\u05e9\u05eb\7p\2"+
		"\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ef\3\2\2\2\u05ec\u05ef"+
		"\7Y\2\2\u05ed\u05ef\7\65\2\2\u05ee\u05e8\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee"+
		"\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f2\7`"+
		"\2\2\u05f1\u05e4\3\2\2\2\u05f1\u05e6\3\2\2\2\u05f2k\3\2\2\2\u05f3\u05f4"+
		"\7m\2\2\u05f4\u0602\5P)\2\u05f5\u05f6\7\u008e\2\2\u05f6\u05f7\7\5\2\2"+
		"\u05f7\u05fc\5\u008eH\2\u05f8\u05f9\7\7\2\2\u05f9\u05fb\5\u008eH\2\u05fa"+
		"\u05f8\3\2\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd\3\2"+
		"\2\2\u05fd\u05ff\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0600\7\6\2\2\u0600"+
		"\u0602\3\2\2\2\u0601\u05f3\3\2\2\2\u0601\u05f5\3\2\2\2\u0601\u0602\3\2"+
		"\2\2\u0602m\3\2\2\2\u0603\u0605\7\u0082\2\2\u0604\u0606\t\6\2\2\u0605"+
		"\u0604\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u060c\5d"+
		"\63\2\u0608\u0609\7\7\2\2\u0609\u060b\5d\63\2\u060a\u0608\3\2\2\2\u060b"+
		"\u060e\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u061b\3\2"+
		"\2\2\u060e\u060c\3\2\2\2\u060f\u0619\7M\2\2\u0610\u0615\5f\64\2\u0611"+
		"\u0612\7\7\2\2\u0612\u0614\5f\64\2\u0613\u0611\3\2\2\2\u0614\u0617\3\2"+
		"\2\2\u0615\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u061a\3\2\2\2\u0617"+
		"\u0615\3\2\2\2\u0618\u061a\5h\65\2\u0619\u0610\3\2\2\2\u0619\u0618\3\2"+
		"\2\2\u061a\u061c\3\2\2\2\u061b\u060f\3\2\2\2\u061b\u061c\3\2\2\2\u061c"+
		"\u061f\3\2\2\2\u061d\u061e\7\u0094\2\2\u061e\u0620\5P)\2\u061f\u061d\3"+
		"\2\2\2\u061f\u0620\3\2\2\2\u0620\u062f\3\2\2\2\u0621\u0622\7P\2\2\u0622"+
		"\u0623\7*\2\2\u0623\u0628\5P)\2\u0624\u0625\7\7\2\2\u0625\u0627\5P)\2"+
		"\u0626\u0624\3\2\2\2\u0627\u062a\3\2\2\2\u0628\u0626\3\2\2\2\u0628\u0629"+
		"\3\2\2\2\u0629\u062d\3\2\2\2\u062a\u0628\3\2\2\2\u062b\u062c\7Q\2\2\u062c"+
		"\u062e\5P)\2\u062d\u062b\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u0630\3\2\2"+
		"\2\u062f\u0621\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u064e\3\2\2\2\u0631\u0632"+
		"\7\u0090\2\2\u0632\u0633\7\5\2\2\u0633\u0638\5P)\2\u0634\u0635\7\7\2\2"+
		"\u0635\u0637\5P)\2\u0636\u0634\3\2\2\2\u0637\u063a\3\2\2\2\u0638\u0636"+
		"\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\3\2\2\2\u063a\u0638\3\2\2\2\u063b"+
		"\u064a\7\6\2\2\u063c\u063d\7\7\2\2\u063d\u063e\7\5\2\2\u063e\u0643\5P"+
		")\2\u063f\u0640\7\7\2\2\u0640\u0642\5P)\2\u0641\u063f\3\2\2\2\u0642\u0645"+
		"\3\2\2\2\u0643\u0641\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0646\3\2\2\2\u0645"+
		"\u0643\3\2\2\2\u0646\u0647\7\6\2\2\u0647\u0649\3\2\2\2\u0648\u063c\3\2"+
		"\2\2\u0649\u064c\3\2\2\2\u064a\u0648\3\2\2\2\u064a\u064b\3\2\2\2\u064b"+
		"\u064e\3\2\2\2\u064c\u064a\3\2\2\2\u064d\u0603\3\2\2\2\u064d\u0631\3\2"+
		"\2\2\u064eo\3\2\2\2\u064f\u0655\7\u008b\2\2\u0650\u0651\7\u008b\2\2\u0651"+
		"\u0655\7\37\2\2\u0652\u0655\7\\\2\2\u0653\u0655\7F\2\2\u0654\u064f\3\2"+
		"\2\2\u0654\u0650\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0653\3\2\2\2\u0655"+
		"q\3\2\2\2\u0656\u0662\5\u0088E\2\u0657\u0658\7\5\2\2\u0658\u065d\5\u008e"+
		"H\2\u0659\u065a\7\7\2\2\u065a\u065c\5\u008eH\2\u065b\u0659\3\2\2\2\u065c"+
		"\u065f\3\2\2\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0660\3\2"+
		"\2\2\u065f\u065d\3\2\2\2\u0660\u0661\7\6\2\2\u0661\u0663\3\2\2\2\u0662"+
		"\u0657\3\2\2\2\u0662\u0663\3\2\2\2\u0663s\3\2\2\2\u0664\u0666\t\n\2\2"+
		"\u0665\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0668"+
		"\7\u0098\2\2\u0668u\3\2\2\2\u0669\u066a\t\20\2\2\u066aw\3\2\2\2\u066b"+
		"\u066c\t\21\2\2\u066cy\3\2\2\2\u066d\u066e\7\u009a\2\2\u066e{\3\2\2\2"+
		"\u066f\u0672\5P)\2\u0670\u0672\5H%\2\u0671\u066f\3\2\2\2\u0671\u0670\3"+
		"\2\2\2\u0672}\3\2\2\2\u0673\u0674\t\22\2\2\u0674\177\3\2\2\2\u0675\u0676"+
		"\t\23\2\2\u0676\u0081\3\2\2\2\u0677\u0678\5\u00a4S\2\u0678\u0083\3\2\2"+
		"\2\u0679\u067a\5\u00a4S\2\u067a\u0085\3\2\2\2\u067b\u067c\5\u00a4S\2\u067c"+
		"\u0087\3\2\2\2\u067d\u067e\5\u00a4S\2\u067e\u0089\3\2\2\2\u067f\u0680"+
		"\5\u00a4S\2\u0680\u008b\3\2\2\2\u0681\u0682\5\u00a4S\2\u0682\u008d\3\2"+
		"\2\2\u0683\u0684\5\u00a4S\2\u0684\u008f\3\2\2\2\u0685\u0686\5\u00a4S\2"+
		"\u0686\u0091\3\2\2\2\u0687\u0688\5\u00a4S\2\u0688\u0093\3\2\2\2\u0689"+
		"\u068a\5\u00a4S\2\u068a\u0095\3\2\2\2\u068b\u068c\5\u00a4S\2\u068c\u0097"+
		"\3\2\2\2\u068d\u068e\5\u00a4S\2\u068e\u0099\3\2\2\2\u068f\u0690\5\u00a4"+
		"S\2\u0690\u009b\3\2\2\2\u0691\u0692\5\u00a4S\2\u0692\u009d\3\2\2\2\u0693"+
		"\u0694\5\u00a4S\2\u0694\u009f\3\2\2\2\u0695\u0696\5\u00a4S\2\u0696\u00a1"+
		"\3\2\2\2\u0697\u0698\5\u00a4S\2\u0698\u00a3\3\2\2\2\u0699\u06a1\7\u0097"+
		"\2\2\u069a\u06a1\5\u0080A\2\u069b\u06a1\7\u009a\2\2\u069c\u069d\7\5\2"+
		"\2\u069d\u069e\5\u00a4S\2\u069e\u069f\7\6\2\2\u069f\u06a1\3\2\2\2\u06a0"+
		"\u0699\3\2\2\2\u06a0\u069a\3\2\2\2\u06a0\u069b\3\2\2\2\u06a0\u069c\3\2"+
		"\2\2\u06a1\u00a5\3\2\2\2\u00f4\u00a8\u00aa\u00b5\u00bc\u00c1\u00c7\u00cc"+
		"\u00d3\u00db\u00de\u00e7\u00eb\u00f3\u00f7\u00f9\u00fe\u0100\u0104\u010b"+
		"\u010e\u0113\u0117\u011c\u0125\u0128\u012e\u0130\u0134\u013a\u013f\u014a"+
		"\u0150\u0154\u015a\u015f\u0168\u016f\u0175\u0179\u017d\u0183\u0188\u018f"+
		"\u019a\u019d\u019f\u01a5\u01ab\u01af\u01b6\u01bc\u01c2\u01c8\u01cd\u01d9"+
		"\u01de\u01e9\u01ee\u01f1\u01f8\u01fb\u0202\u020b\u020e\u0214\u0216\u021a"+
		"\u0222\u0227\u022f\u0234\u023c\u0241\u0249\u024e\u0254\u025b\u025e\u0266"+
		"\u0270\u0273\u0279\u027b\u027e\u0291\u0297\u02a0\u02a5\u02ae\u02b9\u02c0"+
		"\u02c6\u02cc\u02d5\u02dc\u02e0\u02e2\u02e6\u02ed\u02ef\u02f3\u02f6\u02fd"+
		"\u0304\u0307\u0311\u0314\u031a\u031c\u0320\u0327\u032a\u0332\u033c\u033f"+
		"\u0345\u0347\u034b\u0352\u035b\u035f\u0361\u0365\u036e\u0373\u0375\u037e"+
		"\u0389\u0390\u0393\u0396\u03a3\u03b1\u03b6\u03b9\u03c6\u03d4\u03d9\u03e2"+
		"\u03e5\u03eb\u03ed\u03f3\u03f8\u03fe\u040a\u040e\u0413\u0417\u041a\u042c"+
		"\u0431\u0436\u0441\u0446\u044c\u0453\u0457\u0467\u046a\u0472\u047b\u047f"+
		"\u0484\u04a2\u04ae\u04b3\u04bf\u04c5\u04cc\u04d0\u04da\u04dd\u04e3\u04e6"+
		"\u04e8\u04ea\u04f5\u04fa\u0506\u050a\u050e\u0512\u0519\u051b\u0523\u052a"+
		"\u052d\u0531\u0536\u053e\u0551\u0557\u055b\u056b\u0571\u0579\u057e\u0581"+
		"\u0586\u058f\u0594\u05a2\u05a5\u05a7\u05ac\u05b0\u05b3\u05ba\u05c2\u05c6"+
		"\u05ca\u05cd\u05d3\u05d6\u05d8\u05e1\u05e6\u05ea\u05ee\u05f1\u05fc\u0601"+
		"\u0605\u060c\u0615\u0619\u061b\u061f\u0628\u062d\u062f\u0638\u0643\u064a"+
		"\u064d\u0654\u065d\u0662\u0665\u0671\u06a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}