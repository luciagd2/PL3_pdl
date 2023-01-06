// Generated from C:/Users/carre/Oxygen-ANTLR/PL3/src/gramaticas/GrammarpruebaParser.g4 by ANTLR 4.7

	package gramaticas;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarpruebaParser}.
 */
public interface GrammarpruebaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programa}
	 * labeled alternative in {@link GrammarpruebaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GrammarpruebaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programa}
	 * labeled alternative in {@link GrammarpruebaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GrammarpruebaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initVariable}
	 * labeled alternative in {@link GrammarpruebaParser#asign}.
	 * @param ctx the parse tree
	 */
	void enterInitVariable(GrammarpruebaParser.InitVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initVariable}
	 * labeled alternative in {@link GrammarpruebaParser#asign}.
	 * @param ctx the parse tree
	 */
	void exitInitVariable(GrammarpruebaParser.InitVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigVariable}
	 * labeled alternative in {@link GrammarpruebaParser#asign}.
	 * @param ctx the parse tree
	 */
	void enterAsigVariable(GrammarpruebaParser.AsigVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigVariable}
	 * labeled alternative in {@link GrammarpruebaParser#asign}.
	 * @param ctx the parse tree
	 */
	void exitAsigVariable(GrammarpruebaParser.AsigVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code texto}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTexto(GrammarpruebaParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code texto}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTexto(GrammarpruebaParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(GrammarpruebaParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(GrammarpruebaParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code llamadaFuncion}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(GrammarpruebaParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code llamadaFuncion}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(GrammarpruebaParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numero}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumero(GrammarpruebaParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumero(GrammarpruebaParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code polinomio}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPolinomio(GrammarpruebaParser.PolinomioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code polinomio}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPolinomio(GrammarpruebaParser.PolinomioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumRes}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumRes(GrammarpruebaParser.SumResContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumRes}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumRes(GrammarpruebaParser.SumResContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GrammarpruebaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GrammarpruebaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valor}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValor(GrammarpruebaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valor}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValor(GrammarpruebaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponente}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExponente(GrammarpruebaParser.ExponenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponente}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExponente(GrammarpruebaParser.ExponenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expEntreParentesis}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpEntreParentesis(GrammarpruebaParser.ExpEntreParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expEntreParentesis}
	 * labeled alternative in {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpEntreParentesis(GrammarpruebaParser.ExpEntreParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcion}
	 * labeled alternative in {@link GrammarpruebaParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(GrammarpruebaParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcion}
	 * labeled alternative in {@link GrammarpruebaParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(GrammarpruebaParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#bifur}.
	 * @param ctx the parse tree
	 */
	void enterBifur(GrammarpruebaParser.BifurContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#bifur}.
	 * @param ctx the parse tree
	 */
	void exitBifur(GrammarpruebaParser.BifurContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(GrammarpruebaParser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(GrammarpruebaParser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammarpruebaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammarpruebaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#llamFunc}.
	 * @param ctx the parse tree
	 */
	void enterLlamFunc(GrammarpruebaParser.LlamFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#llamFunc}.
	 * @param ctx the parse tree
	 */
	void exitLlamFunc(GrammarpruebaParser.LlamFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#logico}.
	 * @param ctx the parse tree
	 */
	void enterLogico(GrammarpruebaParser.LogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#logico}.
	 * @param ctx the parse tree
	 */
	void exitLogico(GrammarpruebaParser.LogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#declVFunc}.
	 * @param ctx the parse tree
	 */
	void enterDeclVFunc(GrammarpruebaParser.DeclVFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#declVFunc}.
	 * @param ctx the parse tree
	 */
	void exitDeclVFunc(GrammarpruebaParser.DeclVFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#vFunc}.
	 * @param ctx the parse tree
	 */
	void enterVFunc(GrammarpruebaParser.VFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#vFunc}.
	 * @param ctx the parse tree
	 */
	void exitVFunc(GrammarpruebaParser.VFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#bloq_cod}.
	 * @param ctx the parse tree
	 */
	void enterBloq_cod(GrammarpruebaParser.Bloq_codContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#bloq_cod}.
	 * @param ctx the parse tree
	 */
	void exitBloq_cod(GrammarpruebaParser.Bloq_codContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(GrammarpruebaParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(GrammarpruebaParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(GrammarpruebaParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(GrammarpruebaParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(GrammarpruebaParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(GrammarpruebaParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarpruebaParser#condicionCompuesta}.
	 * @param ctx the parse tree
	 */
	void enterCondicionCompuesta(GrammarpruebaParser.CondicionCompuestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarpruebaParser#condicionCompuesta}.
	 * @param ctx the parse tree
	 */
	void exitCondicionCompuesta(GrammarpruebaParser.CondicionCompuestaContext ctx);
}