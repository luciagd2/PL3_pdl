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
	 * Visit a parse tree produced by {@link GrammarpruebaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammarpruebaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsign(GrammarpruebaParser.AsignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammarpruebaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarpruebaParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(GrammarpruebaParser.FuncContext ctx);
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
}