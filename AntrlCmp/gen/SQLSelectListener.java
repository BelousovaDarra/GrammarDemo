// Generated from C:/Users/Andrey/IdeaProjects/GrammarDemo/AntrlCmp\SQLSelect.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLSelectParser}.
 */
public interface SQLSelectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(@NotNull SQLSelectParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(@NotNull SQLSelectParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(@NotNull SQLSelectParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(@NotNull SQLSelectParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(@NotNull SQLSelectParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(@NotNull SQLSelectParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(@NotNull SQLSelectParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(@NotNull SQLSelectParser.Compound_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(@NotNull SQLSelectParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(@NotNull SQLSelectParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(@NotNull SQLSelectParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(@NotNull SQLSelectParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(@NotNull SQLSelectParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(@NotNull SQLSelectParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull SQLSelectParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull SQLSelectParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(@NotNull SQLSelectParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(@NotNull SQLSelectParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(@NotNull SQLSelectParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(@NotNull SQLSelectParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(@NotNull SQLSelectParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(@NotNull SQLSelectParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(@NotNull SQLSelectParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(@NotNull SQLSelectParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(@NotNull SQLSelectParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(@NotNull SQLSelectParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(@NotNull SQLSelectParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(@NotNull SQLSelectParser.Create_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull SQLSelectParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull SQLSelectParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(@NotNull SQLSelectParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(@NotNull SQLSelectParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(@NotNull SQLSelectParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(@NotNull SQLSelectParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull SQLSelectParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull SQLSelectParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(@NotNull SQLSelectParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(@NotNull SQLSelectParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(@NotNull SQLSelectParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(@NotNull SQLSelectParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(@NotNull SQLSelectParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(@NotNull SQLSelectParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(@NotNull SQLSelectParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(@NotNull SQLSelectParser.Vacuum_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(@NotNull SQLSelectParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(@NotNull SQLSelectParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(@NotNull SQLSelectParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(@NotNull SQLSelectParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(@NotNull SQLSelectParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(@NotNull SQLSelectParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull SQLSelectParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull SQLSelectParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(@NotNull SQLSelectParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(@NotNull SQLSelectParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(@NotNull SQLSelectParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(@NotNull SQLSelectParser.Drop_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(@NotNull SQLSelectParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(@NotNull SQLSelectParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull SQLSelectParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull SQLSelectParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(@NotNull SQLSelectParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(@NotNull SQLSelectParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(@NotNull SQLSelectParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(@NotNull SQLSelectParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(@NotNull SQLSelectParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(@NotNull SQLSelectParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(@NotNull SQLSelectParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(@NotNull SQLSelectParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(@NotNull SQLSelectParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(@NotNull SQLSelectParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(@NotNull SQLSelectParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(@NotNull SQLSelectParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(@NotNull SQLSelectParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(@NotNull SQLSelectParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(@NotNull SQLSelectParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(@NotNull SQLSelectParser.Savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(@NotNull SQLSelectParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(@NotNull SQLSelectParser.Detach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(@NotNull SQLSelectParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(@NotNull SQLSelectParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(@NotNull SQLSelectParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(@NotNull SQLSelectParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(@NotNull SQLSelectParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(@NotNull SQLSelectParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(@NotNull SQLSelectParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(@NotNull SQLSelectParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(@NotNull SQLSelectParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(@NotNull SQLSelectParser.Release_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(@NotNull SQLSelectParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(@NotNull SQLSelectParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(@NotNull SQLSelectParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(@NotNull SQLSelectParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SQLSelectParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SQLSelectParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(@NotNull SQLSelectParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(@NotNull SQLSelectParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(@NotNull SQLSelectParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(@NotNull SQLSelectParser.Delete_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull SQLSelectParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull SQLSelectParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull SQLSelectParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull SQLSelectParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(@NotNull SQLSelectParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(@NotNull SQLSelectParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(@NotNull SQLSelectParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(@NotNull SQLSelectParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(@NotNull SQLSelectParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(@NotNull SQLSelectParser.Attach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(@NotNull SQLSelectParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(@NotNull SQLSelectParser.Pragma_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull SQLSelectParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull SQLSelectParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull SQLSelectParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull SQLSelectParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(@NotNull SQLSelectParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(@NotNull SQLSelectParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(@NotNull SQLSelectParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(@NotNull SQLSelectParser.Reindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull SQLSelectParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull SQLSelectParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(@NotNull SQLSelectParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(@NotNull SQLSelectParser.Begin_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(@NotNull SQLSelectParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(@NotNull SQLSelectParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(@NotNull SQLSelectParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(@NotNull SQLSelectParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(@NotNull SQLSelectParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(@NotNull SQLSelectParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull SQLSelectParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull SQLSelectParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull SQLSelectParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull SQLSelectParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(@NotNull SQLSelectParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(@NotNull SQLSelectParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(@NotNull SQLSelectParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(@NotNull SQLSelectParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(@NotNull SQLSelectParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(@NotNull SQLSelectParser.Simple_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(@NotNull SQLSelectParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(@NotNull SQLSelectParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(@NotNull SQLSelectParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(@NotNull SQLSelectParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(@NotNull SQLSelectParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(@NotNull SQLSelectParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(@NotNull SQLSelectParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(@NotNull SQLSelectParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(@NotNull SQLSelectParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(@NotNull SQLSelectParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(@NotNull SQLSelectParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(@NotNull SQLSelectParser.Compound_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(@NotNull SQLSelectParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(@NotNull SQLSelectParser.Update_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(@NotNull SQLSelectParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(@NotNull SQLSelectParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(@NotNull SQLSelectParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(@NotNull SQLSelectParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(@NotNull SQLSelectParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(@NotNull SQLSelectParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(@NotNull SQLSelectParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(@NotNull SQLSelectParser.Raise_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(@NotNull SQLSelectParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(@NotNull SQLSelectParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLSelectParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(@NotNull SQLSelectParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLSelectParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(@NotNull SQLSelectParser.Analyze_stmtContext ctx);
}