// Generated from C:/Users/Andrey/IdeaProjects/AntrlCmp\SQLSelect.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLSelectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLSelectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(@NotNull SQLSelectParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(@NotNull SQLSelectParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(@NotNull SQLSelectParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(@NotNull SQLSelectParser.Compound_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(@NotNull SQLSelectParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(@NotNull SQLSelectParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(@NotNull SQLSelectParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(@NotNull SQLSelectParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(@NotNull SQLSelectParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(@NotNull SQLSelectParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(@NotNull SQLSelectParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(@NotNull SQLSelectParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(@NotNull SQLSelectParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_stmt(@NotNull SQLSelectParser.Create_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(@NotNull SQLSelectParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(@NotNull SQLSelectParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(@NotNull SQLSelectParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(@NotNull SQLSelectParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(@NotNull SQLSelectParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(@NotNull SQLSelectParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(@NotNull SQLSelectParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(@NotNull SQLSelectParser.Vacuum_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(@NotNull SQLSelectParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(@NotNull SQLSelectParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(@NotNull SQLSelectParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull SQLSelectParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(@NotNull SQLSelectParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_stmt(@NotNull SQLSelectParser.Drop_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(@NotNull SQLSelectParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull SQLSelectParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(@NotNull SQLSelectParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(@NotNull SQLSelectParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(@NotNull SQLSelectParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(@NotNull SQLSelectParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(@NotNull SQLSelectParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(@NotNull SQLSelectParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(@NotNull SQLSelectParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_stmt(@NotNull SQLSelectParser.Savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#detach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetach_stmt(@NotNull SQLSelectParser.Detach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(@NotNull SQLSelectParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(@NotNull SQLSelectParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(@NotNull SQLSelectParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(@NotNull SQLSelectParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#release_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_stmt(@NotNull SQLSelectParser.Release_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(@NotNull SQLSelectParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(@NotNull SQLSelectParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull SQLSelectParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(@NotNull SQLSelectParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_limited(@NotNull SQLSelectParser.Delete_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(@NotNull SQLSelectParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(@NotNull SQLSelectParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_virtual_table_stmt(@NotNull SQLSelectParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(@NotNull SQLSelectParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#attach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_stmt(@NotNull SQLSelectParser.Attach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#pragma_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_stmt(@NotNull SQLSelectParser.Pragma_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull SQLSelectParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull SQLSelectParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(@NotNull SQLSelectParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#reindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_stmt(@NotNull SQLSelectParser.Reindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull SQLSelectParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#begin_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_stmt(@NotNull SQLSelectParser.Begin_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(@NotNull SQLSelectParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(@NotNull SQLSelectParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(@NotNull SQLSelectParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull SQLSelectParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(@NotNull SQLSelectParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(@NotNull SQLSelectParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(@NotNull SQLSelectParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(@NotNull SQLSelectParser.Simple_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(@NotNull SQLSelectParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(@NotNull SQLSelectParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(@NotNull SQLSelectParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(@NotNull SQLSelectParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(@NotNull SQLSelectParser.Drop_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(@NotNull SQLSelectParser.Compound_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_limited(@NotNull SQLSelectParser.Update_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(@NotNull SQLSelectParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(@NotNull SQLSelectParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(@NotNull SQLSelectParser.Drop_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#raise_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_function(@NotNull SQLSelectParser.Raise_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(@NotNull SQLSelectParser.Conflict_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSelectParser#analyze_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_stmt(@NotNull SQLSelectParser.Analyze_stmtContext ctx);
}