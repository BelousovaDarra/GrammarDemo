// Generated from C:/Users/Andrey/IdeaProjects/GrammarDemo/AntrlCmp\AntlrSelect.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrSelectParser}.
 */
public interface AntlrSelectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrSelectParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(@NotNull AntlrSelectParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrSelectParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(@NotNull AntlrSelectParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrSelectParser#constv}.
	 * @param ctx the parse tree
	 */
	void enterConstv(@NotNull AntlrSelectParser.ConstvContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrSelectParser#constv}.
	 * @param ctx the parse tree
	 */
	void exitConstv(@NotNull AntlrSelectParser.ConstvContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrSelectParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(@NotNull AntlrSelectParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrSelectParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(@NotNull AntlrSelectParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrSelectParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull AntlrSelectParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrSelectParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull AntlrSelectParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrSelectParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull AntlrSelectParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrSelectParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull AntlrSelectParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrSelectParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull AntlrSelectParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrSelectParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull AntlrSelectParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrSelectParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(@NotNull AntlrSelectParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrSelectParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(@NotNull AntlrSelectParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrSelectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull AntlrSelectParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrSelectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull AntlrSelectParser.ExprContext ctx);
}