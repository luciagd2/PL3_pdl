// Generated from C:/Users/carre/Oxygen-ANTLR/PL3/src/gramaticas/GrammarpruebaParser.g4 by ANTLR 4.7

	package gramaticas;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarpruebaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, IF=2, WHILE=3, FUNCT=4, RET=5, VAL=6, PRINT=7, VAR=8, COMP=9, LOG=10, 
		OPNEG=11, PI=12, PD=13, CI=14, CD=15, IG=16, BB=17, SUMRES=18, MULDIVMOD=19, 
		EXP=20, COMA=21, COMILLA=22, NUM=23, TXT=24, POL=25, FIN=26, NEWLINE=27, 
		TAB=28, COMMENT=29, COMENTARIOLINEA=30, COMENTARIOCOMPL=31, WS=32;
	public static final int
		RULE_prog = 0, RULE_asign = 1, RULE_expr = 2, RULE_func = 3, RULE_bifur = 4, 
		RULE_bucle = 5, RULE_print = 6, RULE_llamFunc = 7, RULE_logico = 8, RULE_declVFunc = 9, 
		RULE_vFunc = 10, RULE_bloq_cod = 11, RULE_retorno = 12, RULE_sent = 13, 
		RULE_condicion = 14, RULE_condicionCompuesta = 15;
	public static final String[] ruleNames = {
		"prog", "asign", "expr", "func", "bifur", "bucle", "print", "llamFunc", 
		"logico", "declVFunc", "vFunc", "bloq_cod", "retorno", "sent", "condicion", 
		"condicionCompuesta"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LET", "IF", "WHILE", "FUNCT", "RET", "VAL", "PRINT", "VAR", "COMP", 
		"LOG", "OPNEG", "PI", "PD", "CI", "CD", "IG", "BB", "SUMRES", "MULDIVMOD", 
		"EXP", "COMA", "COMILLA", "NUM", "TXT", "POL", "FIN", "NEWLINE", "TAB", 
		"COMMENT", "COMENTARIOLINEA", "COMENTARIOCOMPL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GrammarpruebaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarpruebaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramaContext extends ProgContext {
		public List<TerminalNode> FIN() { return getTokens(GrammarpruebaParser.FIN); }
		public TerminalNode FIN(int i) {
			return getToken(GrammarpruebaParser.FIN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<AsignContext> asign() {
			return getRuleContexts(AsignContext.class);
		}
		public AsignContext asign(int i) {
			return getRuleContext(AsignContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgramaContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FUNCT) | (1L << VAL) | (1L << VAR) | (1L << PI) | (1L << NUM) | (1L << TXT) | (1L << POL))) != 0)) {
				{
				{
				setState(35);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32);
					expr(0);
					}
					break;
				case 2:
					{
					setState(33);
					asign();
					}
					break;
				case 3:
					{
					setState(34);
					func();
					}
					break;
				}
				setState(37);
				match(FIN);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignContext extends ParserRuleContext {
		public AsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asign; }
	 
		public AsignContext() { }
		public void copyFrom(AsignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitVariableContext extends AsignContext {
		public TerminalNode LET() { return getToken(GrammarpruebaParser.LET, 0); }
		public TerminalNode VAR() { return getToken(GrammarpruebaParser.VAR, 0); }
		public TerminalNode IG() { return getToken(GrammarpruebaParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public InitVariableContext(AsignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterInitVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitInitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitInitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigVariableContext extends AsignContext {
		public TerminalNode VAR() { return getToken(GrammarpruebaParser.VAR, 0); }
		public TerminalNode IG() { return getToken(GrammarpruebaParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AsigVariableContext(AsignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterAsigVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitAsigVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitAsigVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignContext asign() throws RecognitionException {
		AsignContext _localctx = new AsignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_asign);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				_localctx = new InitVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(LET);
				setState(45);
				match(VAR);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IG) {
					{
					setState(46);
					match(IG);
					setState(49);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAL:
					case VAR:
					case PI:
					case NUM:
					case TXT:
					case POL:
						{
						setState(47);
						expr(0);
						}
						break;
					case FUNCT:
						{
						setState(48);
						func();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case VAR:
				_localctx = new AsigVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(VAR);
				setState(54);
				match(IG);
				setState(57);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAL:
				case VAR:
				case PI:
				case NUM:
				case TXT:
				case POL:
					{
					setState(55);
					expr(0);
					}
					break;
				case FUNCT:
					{
					setState(56);
					func();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TextoContext extends ExprContext {
		public TerminalNode TXT() { return getToken(GrammarpruebaParser.TXT, 0); }
		public TextoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULDIVMOD() { return getToken(GrammarpruebaParser.MULDIVMOD, 0); }
		public MulDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LlamadaFuncionContext extends ExprContext {
		public LlamFuncContext llamFunc() {
			return getRuleContext(LlamFuncContext.class,0);
		}
		public LlamadaFuncionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumeroContext extends ExprContext {
		public TerminalNode NUM() { return getToken(GrammarpruebaParser.NUM, 0); }
		public NumeroContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PolinomioContext extends ExprContext {
		public TerminalNode POL() { return getToken(GrammarpruebaParser.POL, 0); }
		public PolinomioContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterPolinomio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitPolinomio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitPolinomio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumResContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUMRES() { return getToken(GrammarpruebaParser.SUMRES, 0); }
		public SumResContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterSumRes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitSumRes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitSumRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public TerminalNode VAR() { return getToken(GrammarpruebaParser.VAR, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValorContext extends ExprContext {
		public TerminalNode VAL() { return getToken(GrammarpruebaParser.VAL, 0); }
		public TerminalNode PI() { return getToken(GrammarpruebaParser.PI, 0); }
		public TerminalNode PD() { return getToken(GrammarpruebaParser.PD, 0); }
		public List<TerminalNode> POL() { return getTokens(GrammarpruebaParser.POL); }
		public TerminalNode POL(int i) {
			return getToken(GrammarpruebaParser.POL, i);
		}
		public List<TerminalNode> VAR() { return getTokens(GrammarpruebaParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(GrammarpruebaParser.VAR, i);
		}
		public List<TerminalNode> COMA() { return getTokens(GrammarpruebaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GrammarpruebaParser.COMA, i);
		}
		public List<TerminalNode> NUM() { return getTokens(GrammarpruebaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GrammarpruebaParser.NUM, i);
		}
		public ValorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponenteContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXP() { return getToken(GrammarpruebaParser.EXP, 0); }
		public ExponenteContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterExponente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitExponente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitExponente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpEntreParentesisContext extends ExprContext {
		public TerminalNode PI() { return getToken(GrammarpruebaParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(GrammarpruebaParser.PD, 0); }
		public ExpEntreParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterExpEntreParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitExpEntreParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitExpEntreParentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new ExpEntreParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				match(PI);
				setState(63);
				expr(0);
				setState(64);
				match(PD);
				}
				break;
			case 2:
				{
				_localctx = new NumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(NUM);
				}
				break;
			case 3:
				{
				_localctx = new TextoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(TXT);
				}
				break;
			case 4:
				{
				_localctx = new PolinomioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(POL);
				}
				break;
			case 5:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(VAR);
				}
				break;
			case 6:
				{
				_localctx = new ValorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(VAL);
				setState(71);
				match(PI);
				setState(72);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==POL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(73);
					match(COMA);
					setState(74);
					match(POL);
					setState(75);
					match(COMA);
					setState(76);
					_la = _input.LA(1);
					if ( !(_la==VAR || _la==NUM) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(PD);
				}
				break;
			case 7:
				{
				_localctx = new LlamadaFuncionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				llamFunc();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExponenteContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(87);
						match(EXP);
						setState(88);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(90);
						match(SUMRES);
						setState(91);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new MulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(93);
						match(MULDIVMOD);
						setState(94);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	 
		public FuncContext() { }
		public void copyFrom(FuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncionContext extends FuncContext {
		public TerminalNode FUNCT() { return getToken(GrammarpruebaParser.FUNCT, 0); }
		public TerminalNode VAR() { return getToken(GrammarpruebaParser.VAR, 0); }
		public DeclVFuncContext declVFunc() {
			return getRuleContext(DeclVFuncContext.class,0);
		}
		public Bloq_codContext bloq_cod() {
			return getRuleContext(Bloq_codContext.class,0);
		}
		public FuncionContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		try {
			_localctx = new FuncionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(FUNCT);
			setState(101);
			match(VAR);
			setState(102);
			declVFunc();
			setState(103);
			bloq_cod();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BifurContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarpruebaParser.IF, 0); }
		public TerminalNode PI() { return getToken(GrammarpruebaParser.PI, 0); }
		public TerminalNode PD() { return getToken(GrammarpruebaParser.PD, 0); }
		public Bloq_codContext bloq_cod() {
			return getRuleContext(Bloq_codContext.class,0);
		}
		public CondicionCompuestaContext condicionCompuesta() {
			return getRuleContext(CondicionCompuestaContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public BifurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bifur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterBifur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitBifur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitBifur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BifurContext bifur() throws RecognitionException {
		BifurContext _localctx = new BifurContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bifur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IF);
			setState(106);
			match(PI);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(107);
				condicionCompuesta();
				}
				break;
			case 2:
				{
				setState(108);
				condicion();
				}
				break;
			}
			setState(111);
			match(PD);
			setState(112);
			bloq_cod();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarpruebaParser.WHILE, 0); }
		public TerminalNode PI() { return getToken(GrammarpruebaParser.PI, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public TerminalNode PD() { return getToken(GrammarpruebaParser.PD, 0); }
		public Bloq_codContext bloq_cod() {
			return getRuleContext(Bloq_codContext.class,0);
		}
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitBucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitBucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(WHILE);
			setState(115);
			match(PI);
			setState(116);
			logico(0);
			setState(117);
			match(PD);
			setState(118);
			bloq_cod();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarpruebaParser.PRINT, 0); }
		public TerminalNode PI() { return getToken(GrammarpruebaParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(GrammarpruebaParser.PD, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(PRINT);
			setState(121);
			match(PI);
			setState(122);
			expr(0);
			setState(123);
			match(PD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamFuncContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GrammarpruebaParser.VAR, 0); }
		public VFuncContext vFunc() {
			return getRuleContext(VFuncContext.class,0);
		}
		public LlamFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterLlamFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitLlamFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitLlamFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamFuncContext llamFunc() throws RecognitionException {
		LlamFuncContext _localctx = new LlamFuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_llamFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(VAR);
			setState(126);
			vFunc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMP() { return getToken(GrammarpruebaParser.COMP, 0); }
		public List<LogicoContext> logico() {
			return getRuleContexts(LogicoContext.class);
		}
		public LogicoContext logico(int i) {
			return getRuleContext(LogicoContext.class,i);
		}
		public TerminalNode LOG() { return getToken(GrammarpruebaParser.LOG, 0); }
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		return logico(0);
	}

	private LogicoContext logico(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicoContext _localctx = new LogicoContext(_ctx, _parentState);
		LogicoContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_logico, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(129);
			expr(0);
			setState(130);
			match(COMP);
			setState(131);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logico);
					setState(133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(134);
					match(LOG);
					setState(135);
					logico(2);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclVFuncContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(GrammarpruebaParser.PI, 0); }
		public TerminalNode PD() { return getToken(GrammarpruebaParser.PD, 0); }
		public List<TerminalNode> VAR() { return getTokens(GrammarpruebaParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(GrammarpruebaParser.VAR, i);
		}
		public List<TerminalNode> COMA() { return getTokens(GrammarpruebaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GrammarpruebaParser.COMA, i);
		}
		public DeclVFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterDeclVFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitDeclVFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitDeclVFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclVFuncContext declVFunc() throws RecognitionException {
		DeclVFuncContext _localctx = new DeclVFuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declVFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(PI);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(142);
				match(VAR);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(143);
					match(COMA);
					setState(144);
					match(VAR);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(152);
			match(PD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VFuncContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(GrammarpruebaParser.PI, 0); }
		public TerminalNode PD() { return getToken(GrammarpruebaParser.PD, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(GrammarpruebaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GrammarpruebaParser.COMA, i);
		}
		public VFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterVFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitVFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitVFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VFuncContext vFunc() throws RecognitionException {
		VFuncContext _localctx = new VFuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(PI);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL) | (1L << VAR) | (1L << PI) | (1L << NUM) | (1L << TXT) | (1L << POL))) != 0)) {
				{
				setState(155);
				expr(0);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(156);
					match(COMA);
					setState(157);
					expr(0);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(165);
			match(PD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bloq_codContext extends ParserRuleContext {
		public TerminalNode CI() { return getToken(GrammarpruebaParser.CI, 0); }
		public TerminalNode CD() { return getToken(GrammarpruebaParser.CD, 0); }
		public List<SentContext> sent() {
			return getRuleContexts(SentContext.class);
		}
		public SentContext sent(int i) {
			return getRuleContext(SentContext.class,i);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public Bloq_codContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloq_cod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterBloq_cod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitBloq_cod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitBloq_cod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloq_codContext bloq_cod() throws RecognitionException {
		Bloq_codContext _localctx = new Bloq_codContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloq_cod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(CI);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << IF) | (1L << WHILE) | (1L << FUNCT) | (1L << VAL) | (1L << PRINT) | (1L << VAR) | (1L << PI) | (1L << NUM) | (1L << TXT) | (1L << POL))) != 0)) {
				{
				{
				setState(168);
				sent();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RET) {
				{
				setState(174);
				retorno();
				}
			}

			setState(177);
			match(CD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(GrammarpruebaParser.RET, 0); }
		public TerminalNode FIN() { return getToken(GrammarpruebaParser.FIN, 0); }
		public TerminalNode VAR() { return getToken(GrammarpruebaParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(RET);
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(180);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(181);
				expr(0);
				}
				break;
			}
			setState(184);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentContext extends ParserRuleContext {
		public TerminalNode FIN() { return getToken(GrammarpruebaParser.FIN, 0); }
		public LlamFuncContext llamFunc() {
			return getRuleContext(LlamFuncContext.class,0);
		}
		public AsignContext asign() {
			return getRuleContext(AsignContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public BifurContext bifur() {
			return getRuleContext(BifurContext.class,0);
		}
		public BucleContext bucle() {
			return getRuleContext(BucleContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(186);
				llamFunc();
				}
				break;
			case 2:
				{
				setState(187);
				asign();
				}
				break;
			case 3:
				{
				setState(188);
				expr(0);
				}
				break;
			case 4:
				{
				setState(189);
				func();
				}
				break;
			case 5:
				{
				setState(190);
				bifur();
				}
				break;
			case 6:
				{
				setState(191);
				bucle();
				}
				break;
			case 7:
				{
				setState(192);
				print();
				}
				break;
			}
			setState(195);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode OPNEG() { return getToken(GrammarpruebaParser.OPNEG, 0); }
		public List<TerminalNode> PI() { return getTokens(GrammarpruebaParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(GrammarpruebaParser.PI, i);
		}
		public List<TerminalNode> PD() { return getTokens(GrammarpruebaParser.PD); }
		public TerminalNode PD(int i) {
			return getToken(GrammarpruebaParser.PD, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMP() { return getToken(GrammarpruebaParser.COMP, 0); }
		public TerminalNode LOG() { return getToken(GrammarpruebaParser.LOG, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPNEG) {
				{
				setState(197);
				match(OPNEG);
				}
			}

			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(200);
				match(PI);
				}
				break;
			}
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				{
				setState(203);
				expr(0);
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==COMP || _la==LOG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				expr(0);
				}
				}
				break;
			case 2:
				{
				{
				setState(207);
				match(PI);
				{
				setState(208);
				expr(0);
				setState(209);
				_la = _input.LA(1);
				if ( !(_la==COMP || _la==LOG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(210);
				expr(0);
				}
				setState(212);
				match(PD);
				}
				}
				break;
			}
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(216);
				match(PD);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionCompuestaContext extends ParserRuleContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode COMP() { return getToken(GrammarpruebaParser.COMP, 0); }
		public TerminalNode LOG() { return getToken(GrammarpruebaParser.LOG, 0); }
		public CondicionCompuestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionCompuesta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterCondicionCompuesta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitCondicionCompuesta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitCondicionCompuesta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionCompuestaContext condicionCompuesta() throws RecognitionException {
		CondicionCompuestaContext _localctx = new CondicionCompuestaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condicionCompuesta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			condicion();
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==COMP || _la==LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(221);
			condicion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 8:
			return logico_sempred((LogicoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean logico_sempred(LogicoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\5\2&\n\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\3\3\3\3\5\3\64"+
		"\n\3\5\3\66\n\3\3\3\3\3\3\3\3\3\5\3<\n\3\5\3>\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4P\n\4\f\4\16\4S\13\4\3"+
		"\4\3\4\5\4W\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4b\n\4\f\4\16\4"+
		"e\13\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6p\n\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13\n\3\13\3\13\3\13\3\13\7\13"+
		"\u0094\n\13\f\13\16\13\u0097\13\13\5\13\u0099\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\7\f\u00a1\n\f\f\f\16\f\u00a4\13\f\5\f\u00a6\n\f\3\f\3\f\3\r\3\r"+
		"\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\3\r\5\r\u00b2\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\5\16\u00b9\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00c4\n\17\3\17\3\17\3\20\5\20\u00c9\n\20\3\20\5\20\u00cc\n\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d9\n\20\3\20"+
		"\5\20\u00dc\n\20\3\21\3\21\3\21\3\21\3\21\2\4\6\22\22\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \2\5\4\2\n\n\33\33\4\2\n\n\31\31\3\2\13\f\2\u00f6"+
		"\2+\3\2\2\2\4=\3\2\2\2\6V\3\2\2\2\bf\3\2\2\2\nk\3\2\2\2\ft\3\2\2\2\16"+
		"z\3\2\2\2\20\177\3\2\2\2\22\u0082\3\2\2\2\24\u008f\3\2\2\2\26\u009c\3"+
		"\2\2\2\30\u00a9\3\2\2\2\32\u00b5\3\2\2\2\34\u00c3\3\2\2\2\36\u00c8\3\2"+
		"\2\2 \u00dd\3\2\2\2\"&\5\6\4\2#&\5\4\3\2$&\5\b\5\2%\"\3\2\2\2%#\3\2\2"+
		"\2%$\3\2\2\2&\'\3\2\2\2\'(\7\34\2\2(*\3\2\2\2)%\3\2\2\2*-\3\2\2\2+)\3"+
		"\2\2\2+,\3\2\2\2,\3\3\2\2\2-+\3\2\2\2./\7\3\2\2/\65\7\n\2\2\60\63\7\22"+
		"\2\2\61\64\5\6\4\2\62\64\5\b\5\2\63\61\3\2\2\2\63\62\3\2\2\2\64\66\3\2"+
		"\2\2\65\60\3\2\2\2\65\66\3\2\2\2\66>\3\2\2\2\678\7\n\2\28;\7\22\2\29<"+
		"\5\6\4\2:<\5\b\5\2;9\3\2\2\2;:\3\2\2\2<>\3\2\2\2=.\3\2\2\2=\67\3\2\2\2"+
		">\5\3\2\2\2?@\b\4\1\2@A\7\16\2\2AB\5\6\4\2BC\7\17\2\2CW\3\2\2\2DW\7\31"+
		"\2\2EW\7\32\2\2FW\7\33\2\2GW\7\n\2\2HI\7\b\2\2IJ\7\16\2\2JQ\t\2\2\2KL"+
		"\7\27\2\2LM\7\33\2\2MN\7\27\2\2NP\t\3\2\2OK\3\2\2\2PS\3\2\2\2QO\3\2\2"+
		"\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TW\7\17\2\2UW\5\20\t\2V?\3\2\2\2VD\3\2"+
		"\2\2VE\3\2\2\2VF\3\2\2\2VG\3\2\2\2VH\3\2\2\2VU\3\2\2\2Wc\3\2\2\2XY\f\13"+
		"\2\2YZ\7\26\2\2Zb\5\6\4\f[\\\f\n\2\2\\]\7\24\2\2]b\5\6\4\13^_\f\t\2\2"+
		"_`\7\25\2\2`b\5\6\4\naX\3\2\2\2a[\3\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2d\7\3\2\2\2ec\3\2\2\2fg\7\6\2\2gh\7\n\2\2hi\5\24\13\2ij\5"+
		"\30\r\2j\t\3\2\2\2kl\7\4\2\2lo\7\16\2\2mp\5 \21\2np\5\36\20\2om\3\2\2"+
		"\2on\3\2\2\2pq\3\2\2\2qr\7\17\2\2rs\5\30\r\2s\13\3\2\2\2tu\7\5\2\2uv\7"+
		"\16\2\2vw\5\22\n\2wx\7\17\2\2xy\5\30\r\2y\r\3\2\2\2z{\7\t\2\2{|\7\16\2"+
		"\2|}\5\6\4\2}~\7\17\2\2~\17\3\2\2\2\177\u0080\7\n\2\2\u0080\u0081\5\26"+
		"\f\2\u0081\21\3\2\2\2\u0082\u0083\b\n\1\2\u0083\u0084\5\6\4\2\u0084\u0085"+
		"\7\13\2\2\u0085\u0086\5\6\4\2\u0086\u008c\3\2\2\2\u0087\u0088\f\3\2\2"+
		"\u0088\u0089\7\f\2\2\u0089\u008b\5\22\n\4\u008a\u0087\3\2\2\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\23\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0098\7\16\2\2\u0090\u0095\7\n\2\2\u0091\u0092\7"+
		"\27\2\2\u0092\u0094\7\n\2\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u0090\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\7\17\2\2\u009b\25\3\2\2\2\u009c\u00a5\7\16\2\2\u009d\u00a2\5\6"+
		"\4\2\u009e\u009f\7\27\2\2\u009f\u00a1\5\6\4\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\7\17\2\2\u00a8\27\3\2\2\2\u00a9\u00ad\7\20"+
		"\2\2\u00aa\u00ac\5\34\17\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b2\5\32\16\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\7\21\2\2\u00b4\31\3\2\2\2\u00b5\u00b8\7\7\2"+
		"\2\u00b6\u00b9\7\n\2\2\u00b7\u00b9\5\6\4\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\34\2\2"+
		"\u00bb\33\3\2\2\2\u00bc\u00c4\5\20\t\2\u00bd\u00c4\5\4\3\2\u00be\u00c4"+
		"\5\6\4\2\u00bf\u00c4\5\b\5\2\u00c0\u00c4\5\n\6\2\u00c1\u00c4\5\f\7\2\u00c2"+
		"\u00c4\5\16\b\2\u00c3\u00bc\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3"+
		"\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\34\2\2\u00c6\35\3\2\2"+
		"\2\u00c7\u00c9\7\r\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb"+
		"\3\2\2\2\u00ca\u00cc\7\16\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cc\u00d8\3\2\2\2\u00cd\u00ce\5\6\4\2\u00ce\u00cf\t\4\2\2\u00cf\u00d0"+
		"\5\6\4\2\u00d0\u00d9\3\2\2\2\u00d1\u00d2\7\16\2\2\u00d2\u00d3\5\6\4\2"+
		"\u00d3\u00d4\t\4\2\2\u00d4\u00d5\5\6\4\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\7\17\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d8\u00d1\3\2\2\2"+
		"\u00d9\u00db\3\2\2\2\u00da\u00dc\7\17\2\2\u00db\u00da\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\37\3\2\2\2\u00dd\u00de\5\36\20\2\u00de\u00df\t\4\2\2\u00df"+
		"\u00e0\5\36\20\2\u00e0!\3\2\2\2\32%+\63\65;=QVaco\u008c\u0095\u0098\u00a2"+
		"\u00a5\u00ad\u00b1\u00b8\u00c3\u00c8\u00cb\u00d8\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}