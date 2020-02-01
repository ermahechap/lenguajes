// Generated from /home/c3po/Git/lenguajes/final_antlr/grammar/MiLenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MiLenguajeParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MiLenguajeParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(MiLenguajeParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(MiLenguajeParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(MiLenguajeParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(MiLenguajeParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(MiLenguajeParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(MiLenguajeParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MiLenguajeParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MiLenguajeParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#resource_specification}.
	 * @param ctx the parse tree
	 */
	void enterResource_specification(MiLenguajeParser.Resource_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#resource_specification}.
	 * @param ctx the parse tree
	 */
	void exitResource_specification(MiLenguajeParser.Resource_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#resource_body}.
	 * @param ctx the parse tree
	 */
	void enterResource_body(MiLenguajeParser.Resource_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#resource_body}.
	 * @param ctx the parse tree
	 */
	void exitResource_body(MiLenguajeParser.Resource_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(MiLenguajeParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(MiLenguajeParser.SpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#import_}.
	 * @param ctx the parse tree
	 */
	void enterImport_(MiLenguajeParser.Import_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#import_}.
	 * @param ctx the parse tree
	 */
	void exitImport_(MiLenguajeParser.Import_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#const_}.
	 * @param ctx the parse tree
	 */
	void enterConst_(MiLenguajeParser.Const_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#const_}.
	 * @param ctx the parse tree
	 */
	void exitConst_(MiLenguajeParser.Const_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiLenguajeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiLenguajeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#optype}.
	 * @param ctx the parse tree
	 */
	void enterOptype(MiLenguajeParser.OptypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#optype}.
	 * @param ctx the parse tree
	 */
	void exitOptype(MiLenguajeParser.OptypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#op_type_params}.
	 * @param ctx the parse tree
	 */
	void enterOp_type_params(MiLenguajeParser.Op_type_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#op_type_params}.
	 * @param ctx the parse tree
	 */
	void exitOp_type_params(MiLenguajeParser.Op_type_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(MiLenguajeParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(MiLenguajeParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#var_create}.
	 * @param ctx the parse tree
	 */
	void enterVar_create(MiLenguajeParser.Var_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#var_create}.
	 * @param ctx the parse tree
	 */
	void exitVar_create(MiLenguajeParser.Var_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(MiLenguajeParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(MiLenguajeParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operation_one}.
	 * @param ctx the parse tree
	 */
	void enterOperation_one(MiLenguajeParser.Operation_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operation_one}.
	 * @param ctx the parse tree
	 */
	void exitOperation_one(MiLenguajeParser.Operation_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(MiLenguajeParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(MiLenguajeParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiLenguajeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiLenguajeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(MiLenguajeParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(MiLenguajeParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MiLenguajeParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MiLenguajeParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#comma_params}.
	 * @param ctx the parse tree
	 */
	void enterComma_params(MiLenguajeParser.Comma_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#comma_params}.
	 * @param ctx the parse tree
	 */
	void exitComma_params(MiLenguajeParser.Comma_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#comma_expressions_params}.
	 * @param ctx the parse tree
	 */
	void enterComma_expressions_params(MiLenguajeParser.Comma_expressions_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#comma_expressions_params}.
	 * @param ctx the parse tree
	 */
	void exitComma_expressions_params(MiLenguajeParser.Comma_expressions_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MiLenguajeParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MiLenguajeParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MiLenguajeParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MiLenguajeParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(MiLenguajeParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(MiLenguajeParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#equal_expression}.
	 * @param ctx the parse tree
	 */
	void enterEqual_expression(MiLenguajeParser.Equal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#equal_expression}.
	 * @param ctx the parse tree
	 */
	void exitEqual_expression(MiLenguajeParser.Equal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expression(MiLenguajeParser.Assign_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expression(MiLenguajeParser.Assign_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#function_}.
	 * @param ctx the parse tree
	 */
	void enterFunction_(MiLenguajeParser.Function_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#function_}.
	 * @param ctx the parse tree
	 */
	void exitFunction_(MiLenguajeParser.Function_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#function_end}.
	 * @param ctx the parse tree
	 */
	void enterFunction_end(MiLenguajeParser.Function_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#function_end}.
	 * @param ctx the parse tree
	 */
	void exitFunction_end(MiLenguajeParser.Function_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#resource_control}.
	 * @param ctx the parse tree
	 */
	void enterResource_control(MiLenguajeParser.Resource_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#resource_control}.
	 * @param ctx the parse tree
	 */
	void exitResource_control(MiLenguajeParser.Resource_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#create_cap_expression}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cap_expression(MiLenguajeParser.Create_cap_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#create_cap_expression}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cap_expression(MiLenguajeParser.Create_cap_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#destroy_cap_expression}.
	 * @param ctx the parse tree
	 */
	void enterDestroy_cap_expression(MiLenguajeParser.Destroy_cap_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#destroy_cap_expression}.
	 * @param ctx the parse tree
	 */
	void exitDestroy_cap_expression(MiLenguajeParser.Destroy_cap_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operation_invocation}.
	 * @param ctx the parse tree
	 */
	void enterOperation_invocation(MiLenguajeParser.Operation_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operation_invocation}.
	 * @param ctx the parse tree
	 */
	void exitOperation_invocation(MiLenguajeParser.Operation_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#call_expression}.
	 * @param ctx the parse tree
	 */
	void enterCall_expression(MiLenguajeParser.Call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#call_expression}.
	 * @param ctx the parse tree
	 */
	void exitCall_expression(MiLenguajeParser.Call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#send_expression}.
	 * @param ctx the parse tree
	 */
	void enterSend_expression(MiLenguajeParser.Send_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#send_expression}.
	 * @param ctx the parse tree
	 */
	void exitSend_expression(MiLenguajeParser.Send_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#concurrent_expression}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_expression(MiLenguajeParser.Concurrent_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#concurrent_expression}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_expression(MiLenguajeParser.Concurrent_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#call_invocation}.
	 * @param ctx the parse tree
	 */
	void enterCall_invocation(MiLenguajeParser.Call_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#call_invocation}.
	 * @param ctx the parse tree
	 */
	void exitCall_invocation(MiLenguajeParser.Call_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(MiLenguajeParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(MiLenguajeParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sequential}.
	 * @param ctx the parse tree
	 */
	void enterSequential(MiLenguajeParser.SequentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sequential}.
	 * @param ctx the parse tree
	 */
	void exitSequential(MiLenguajeParser.SequentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#if_inner}.
	 * @param ctx the parse tree
	 */
	void enterIf_inner(MiLenguajeParser.If_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#if_inner}.
	 * @param ctx the parse tree
	 */
	void exitIf_inner(MiLenguajeParser.If_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(MiLenguajeParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(MiLenguajeParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void enterFor_expr(MiLenguajeParser.For_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void exitFor_expr(MiLenguajeParser.For_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#for_expr_Ls}.
	 * @param ctx the parse tree
	 */
	void enterFor_expr_Ls(MiLenguajeParser.For_expr_LsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#for_expr_Ls}.
	 * @param ctx the parse tree
	 */
	void exitFor_expr_Ls(MiLenguajeParser.For_expr_LsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#block_cycle}.
	 * @param ctx the parse tree
	 */
	void enterBlock_cycle(MiLenguajeParser.Block_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#block_cycle}.
	 * @param ctx the parse tree
	 */
	void exitBlock_cycle(MiLenguajeParser.Block_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operation_service}.
	 * @param ctx the parse tree
	 */
	void enterOperation_service(MiLenguajeParser.Operation_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operation_service}.
	 * @param ctx the parse tree
	 */
	void exitOperation_service(MiLenguajeParser.Operation_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiLenguajeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiLenguajeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MiLenguajeParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MiLenguajeParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#assign_slice}.
	 * @param ctx the parse tree
	 */
	void enterAssign_slice(MiLenguajeParser.Assign_sliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#assign_slice}.
	 * @param ctx the parse tree
	 */
	void exitAssign_slice(MiLenguajeParser.Assign_sliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(MiLenguajeParser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(MiLenguajeParser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(MiLenguajeParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(MiLenguajeParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(MiLenguajeParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(MiLenguajeParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#comp_expression}.
	 * @param ctx the parse tree
	 */
	void enterComp_expression(MiLenguajeParser.Comp_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#comp_expression}.
	 * @param ctx the parse tree
	 */
	void exitComp_expression(MiLenguajeParser.Comp_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(MiLenguajeParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(MiLenguajeParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#simple_op_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_op_expression(MiLenguajeParser.Simple_op_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#simple_op_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_op_expression(MiLenguajeParser.Simple_op_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#other_op_expression}.
	 * @param ctx the parse tree
	 */
	void enterOther_op_expression(MiLenguajeParser.Other_op_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#other_op_expression}.
	 * @param ctx the parse tree
	 */
	void exitOther_op_expression(MiLenguajeParser.Other_op_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#exponentiation_expression}.
	 * @param ctx the parse tree
	 */
	void enterExponentiation_expression(MiLenguajeParser.Exponentiation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#exponentiation_expression}.
	 * @param ctx the parse tree
	 */
	void exitExponentiation_expression(MiLenguajeParser.Exponentiation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(MiLenguajeParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(MiLenguajeParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#post_op}.
	 * @param ctx the parse tree
	 */
	void enterPost_op(MiLenguajeParser.Post_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#post_op}.
	 * @param ctx the parse tree
	 */
	void exitPost_op(MiLenguajeParser.Post_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#pre_op}.
	 * @param ctx the parse tree
	 */
	void enterPre_op(MiLenguajeParser.Pre_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#pre_op}.
	 * @param ctx the parse tree
	 */
	void exitPre_op(MiLenguajeParser.Pre_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#single_expr}.
	 * @param ctx the parse tree
	 */
	void enterSingle_expr(MiLenguajeParser.Single_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#single_expr}.
	 * @param ctx the parse tree
	 */
	void exitSingle_expr(MiLenguajeParser.Single_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MiLenguajeParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MiLenguajeParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#subscript_slice}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_slice(MiLenguajeParser.Subscript_sliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#subscript_slice}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_slice(MiLenguajeParser.Subscript_sliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(MiLenguajeParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(MiLenguajeParser.SliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(MiLenguajeParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(MiLenguajeParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#grouping}.
	 * @param ctx the parse tree
	 */
	void enterGrouping(MiLenguajeParser.GroupingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#grouping}.
	 * @param ctx the parse tree
	 */
	void exitGrouping(MiLenguajeParser.GroupingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sign_change}.
	 * @param ctx the parse tree
	 */
	void enterSign_change(MiLenguajeParser.Sign_changeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sign_change}.
	 * @param ctx the parse tree
	 */
	void exitSign_change(MiLenguajeParser.Sign_changeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#assigns}.
	 * @param ctx the parse tree
	 */
	void enterAssigns(MiLenguajeParser.AssignsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#assigns}.
	 * @param ctx the parse tree
	 */
	void exitAssigns(MiLenguajeParser.AssignsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#comps}.
	 * @param ctx the parse tree
	 */
	void enterComps(MiLenguajeParser.CompsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#comps}.
	 * @param ctx the parse tree
	 */
	void exitComps(MiLenguajeParser.CompsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#simple_op}.
	 * @param ctx the parse tree
	 */
	void enterSimple_op(MiLenguajeParser.Simple_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#simple_op}.
	 * @param ctx the parse tree
	 */
	void exitSimple_op(MiLenguajeParser.Simple_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#other_op}.
	 * @param ctx the parse tree
	 */
	void enterOther_op(MiLenguajeParser.Other_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#other_op}.
	 * @param ctx the parse tree
	 */
	void exitOther_op(MiLenguajeParser.Other_opContext ctx);
}