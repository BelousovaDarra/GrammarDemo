// Generated from C:/Users/Andrey/IdeaProjects/GrammarDemo/AntrlCmp\AntlrSelect.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AntlrSelectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AntlrSelectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AntlrSelectParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(@NotNull AntlrSelectParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrSelectParser#constv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstv(@NotNull AntlrSelectParser.ConstvContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrSelectParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(@NotNull AntlrSelectParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrSelectParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull AntlrSelectParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrSelectParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull AntlrSelectParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrSelectParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull AntlrSelectParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrSelectParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(@NotNull AntlrSelectParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrSelectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull AntlrSelectParser.ExprContext ctx);
}