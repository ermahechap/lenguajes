// Generated from /home/c3po/Git/lenguajes/final_antlr/grammar/MiLenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MiLenguajeParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(MiLenguajeParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(MiLenguajeParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#resource_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_body(MiLenguajeParser.Resource_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec(MiLenguajeParser.SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#import_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_(MiLenguajeParser.Import_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(MiLenguajeParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiLenguajeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#optype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptype(MiLenguajeParser.OptypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(MiLenguajeParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(MiLenguajeParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#operation_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_one(MiLenguajeParser.Operation_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(MiLenguajeParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiLenguajeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(MiLenguajeParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(MiLenguajeParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(MiLenguajeParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MiLenguajeParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(MiLenguajeParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#assign_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expression(MiLenguajeParser.Assign_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiLenguajeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MiLenguajeParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(MiLenguajeParser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(MiLenguajeParser.Or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(MiLenguajeParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#comp_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_expression(MiLenguajeParser.Comp_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(MiLenguajeParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#simple_op_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_op_expression(MiLenguajeParser.Simple_op_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#other_op_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_op_expression(MiLenguajeParser.Other_op_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#exponentiation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiation_expression(MiLenguajeParser.Exponentiation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(MiLenguajeParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#post_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_op(MiLenguajeParser.Post_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#pre_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_op(MiLenguajeParser.Pre_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#single_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_expr(MiLenguajeParser.Single_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MiLenguajeParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#subscript_slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_slice(MiLenguajeParser.Subscript_sliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(MiLenguajeParser.SliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(MiLenguajeParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#grouping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping(MiLenguajeParser.GroupingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sign_change}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_change(MiLenguajeParser.Sign_changeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#assigns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigns(MiLenguajeParser.AssignsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#comps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComps(MiLenguajeParser.CompsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#simple_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_op(MiLenguajeParser.Simple_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#other_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_op(MiLenguajeParser.Other_opContext ctx);
}