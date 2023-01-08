// Generated from C:/Users/carre/Oxygen-ANTLR/PL3/src/gramaticas/GrammarpruebaParser.g4 by ANTLR 4.7

	package gramaticas;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarpruebaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarpruebaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programa}
	 * labeled alternative in {@link GrammarpruebaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GrammarpruebaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initVariable}
	 * labeled alternative in {@link GrammarpruebaParser#asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVariable(GrammarpruebaParser.InitVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigVariable}
	 * labeled alternative in {@link GrammarpruebaParser#asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigVariable(GrammarpruebaParser.AsigVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texto}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(GrammarpruebaParser.TextoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(GrammarpruebaParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code llamadaFuncion}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(GrammarpruebaParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(GrammarpruebaParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code polinomio}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolinomio(GrammarpruebaParser.PolinomioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumRes}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(GrammarpruebaParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GrammarpruebaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valor}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(GrammarpruebaParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exponente}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponente(GrammarpruebaParser.ExponenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expEntreParentesis}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpEntreParentesis(GrammarpruebaParser.ExpEntreParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcion}
	 * labeled alternative in {@link GrammarpruebaParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(GrammarpruebaParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#bifur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBifur(GrammarpruebaParser.BifurContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle(GrammarpruebaParser.BucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GrammarpruebaParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#llamFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamFunc(GrammarpruebaParser.LlamFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico(GrammarpruebaParser.LogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#declVFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVFunc(GrammarpruebaParser.DeclVFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#vFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVFunc(GrammarpruebaParser.VFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#bloq_cod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloq_cod(GrammarpruebaParser.Bloq_codContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(GrammarpruebaParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(GrammarpruebaParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(GrammarpruebaParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#condicionCompuesta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionCompuesta(GrammarpruebaParser.CondicionCompuestaContext ctx);
}