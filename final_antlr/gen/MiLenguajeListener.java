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
	 * Enter a parse tree produced by {@link MiLenguajeParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(MiLenguajeParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(MiLenguajeParser.ConstContext ctx);
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