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
		PI=11, PD=12, CI=13, CD=14, IG=15, SUMRES=16, MULDIVMOD=17, EXP=18, COMA=19, 
		COMILLA=20, NUM=21, TXT=22, POL=23, FIN=24, NEWLINE=25, TAB=26, COMMENT=27, 
		COMENTARIOLINEA=28, COMENTARIOCOMPL=29, WS=30;
	public static final int
		RULE_prog = 0, RULE_asign = 1, RULE_expr = 2, RULE_func = 3, RULE_logico = 4, 
		RULE_declVFunc = 5, RULE_vFunc = 6, RULE_bloq_cod = 7, RULE_retorno = 8, 
		RULE_sent = 9;
	public static final String[] ruleNames = {
		"prog", "asign", "expr", "func", "logico", "declVFunc", "vFunc", "bloq_cod", 
		"retorno", "sent"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LET", "IF", "WHILE", "FUNCT", "RET", "VAL", "PRINT", "VAR", "COMP", 
		"LOG", "PI", "PD", "CI", "CD", "IG", "SUMRES", "MULDIVMOD", "EXP", "COMA", 
		"COMILLA", "NUM", "TXT", "POL", "FIN", "NEWLINE", "TAB", "COMMENT", "COMENTARIOLINEA", 
		"COMENTARIOCOMPL", "WS"
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
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << IF) | (1L << WHILE) | (1L << FUNCT) | (1L << VAL) | (1L << PRINT) | (1L << VAR) | (1L << PI) | (1L << NUM) | (1L << TXT) | (1L << POL))) != 0)) {
				{
				{
				setState(23);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20);
					expr(0);
					}
					break;
				case 2:
					{
					setState(21);
					asign();
					}
					break;
				case 3:
					{
					setState(22);
					func();
					}
					break;
				}
				setState(25);
				match(FIN);
				}
				}
				setState(31);
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
		public TerminalNode LET() { return getToken(GrammarpruebaParser.LET, 0); }
		public TerminalNode VAR() { return getToken(GrammarpruebaParser.VAR, 0); }
		public TerminalNode IG() { return getToken(GrammarpruebaParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterAsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitAsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitAsign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignContext asign() throws RecognitionException {
		AsignContext _localctx = new AsignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_asign);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(LET);
				setState(33);
				match(VAR);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IG) {
					{
					setState(34);
					match(IG);
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(35);
						expr(0);
						}
						break;
					case 2:
						{
						setState(36);
						func();
						}
						break;
					}
					}
				}

				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(VAR);
				setState(42);
				match(IG);
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(43);
					expr(0);
					}
					break;
				case 2:
					{
					setState(44);
					func();
					}
					break;
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
		public TerminalNode PI() { return getToken(GrammarpruebaParser.PI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PD() { return getToken(GrammarpruebaParser.PD, 0); }
		public List<TerminalNode> NUM() { return getTokens(GrammarpruebaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GrammarpruebaParser.NUM, i);
		}
		public TerminalNode TXT() { return getToken(GrammarpruebaParser.TXT, 0); }
		public List<TerminalNode> POL() { return getTokens(GrammarpruebaParser.POL); }
		public TerminalNode POL(int i) {
			return getToken(GrammarpruebaParser.POL, i);
		}
		public List<TerminalNode> VAR() { return getTokens(GrammarpruebaParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(GrammarpruebaParser.VAR, i);
		}
		public TerminalNode VAL() { return getToken(GrammarpruebaParser.VAL, 0); }
		public List<TerminalNode> COMA() { return getTokens(GrammarpruebaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GrammarpruebaParser.COMA, i);
		}
		public TerminalNode EXP() { return getToken(GrammarpruebaParser.EXP, 0); }
		public TerminalNode MULDIVMOD() { return getToken(GrammarpruebaParser.MULDIVMOD, 0); }
		public TerminalNode SUMRES() { return getToken(GrammarpruebaParser.SUMRES, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitExpr(this);
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
				{
				setState(50);
				match(PI);
				setState(51);
				expr(0);
				setState(52);
				match(PD);
				}
				break;
			case NUM:
				{
				setState(54);
				match(NUM);
				}
				break;
			case TXT:
				{
				setState(55);
				match(TXT);
				}
				break;
			case POL:
				{
				setState(56);
				match(POL);
				}
				break;
			case VAR:
				{
				setState(57);
				match(VAR);
				}
				break;
			case VAL:
				{
				setState(58);
				match(VAL);
				setState(59);
				match(PI);
				setState(60);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==POL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(61);
					match(COMA);
					setState(62);
					match(POL);
					setState(63);
					match(COMA);
					setState(64);
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
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(PD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(74);
						match(EXP);
						setState(75);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(77);
						match(MULDIVMOD);
						setState(78);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(80);
						match(SUMRES);
						setState(81);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(86);
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
		public TerminalNode PRINT() { return getToken(GrammarpruebaParser.PRINT, 0); }
		public TerminalNode PI() { return getToken(GrammarpruebaParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(GrammarpruebaParser.PD, 0); }
		public TerminalNode IF() { return getToken(GrammarpruebaParser.IF, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public Bloq_codContext bloq_cod() {
			return getRuleContext(Bloq_codContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(GrammarpruebaParser.WHILE, 0); }
		public TerminalNode FUNCT() { return getToken(GrammarpruebaParser.FUNCT, 0); }
		public TerminalNode VAR() { return getToken(GrammarpruebaParser.VAR, 0); }
		public DeclVFuncContext declVFunc() {
			return getRuleContext(DeclVFuncContext.class,0);
		}
		public VFuncContext vFunc() {
			return getRuleContext(VFuncContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarpruebaParserListener ) ((GrammarpruebaParserListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarpruebaParserVisitor ) return ((GrammarpruebaParserVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(PRINT);
				setState(88);
				match(PI);
				setState(89);
				expr(0);
				setState(90);
				match(PD);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(IF);
				setState(93);
				match(PI);
				setState(94);
				logico(0);
				setState(95);
				match(PD);
				setState(96);
				bloq_cod();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(WHILE);
				setState(99);
				match(PI);
				setState(100);
				logico(0);
				setState(101);
				match(PD);
				setState(102);
				bloq_cod();
				}
				break;
			case FUNCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(FUNCT);
				setState(105);
				match(VAR);
				setState(106);
				declVFunc();
				setState(107);
				bloq_cod();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(VAR);
				setState(110);
				vFunc();
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_logico, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114);
			expr(0);
			setState(115);
			match(COMP);
			setState(116);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
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
					setState(118);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(119);
					match(LOG);
					setState(120);
					logico(2);
					}
					} 
				}
				setState(125);
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
		enterRule(_localctx, 10, RULE_declVFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(PI);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(127);
				match(VAR);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(128);
					match(COMA);
					setState(129);
					match(VAR);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(137);
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
		enterRule(_localctx, 12, RULE_vFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(PI);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL) | (1L << VAR) | (1L << PI) | (1L << NUM) | (1L << TXT) | (1L << POL))) != 0)) {
				{
				setState(140);
				expr(0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(141);
					match(COMA);
					setState(142);
					expr(0);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(150);
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
		enterRule(_localctx, 14, RULE_bloq_cod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(CI);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << IF) | (1L << WHILE) | (1L << FUNCT) | (1L << VAL) | (1L << PRINT) | (1L << VAR) | (1L << PI) | (1L << NUM) | (1L << TXT) | (1L << POL))) != 0)) {
				{
				{
				setState(153);
				sent();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RET) {
				{
				setState(159);
				retorno();
				}
			}

			setState(162);
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
		enterRule(_localctx, 16, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(RET);
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(165);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(166);
				expr(0);
				}
				break;
			}
			setState(169);
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
		public AsignContext asign() {
			return getRuleContext(AsignContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
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
		enterRule(_localctx, 18, RULE_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(171);
				asign();
				}
				break;
			case 2:
				{
				setState(172);
				expr(0);
				}
				break;
			case 3:
				{
				setState(173);
				func();
				}
				break;
			}
			setState(176);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 4:
			return logico_sempred((LogicoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\5\2\32\n\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\5\3*\n\3\3\3\3\3\3\3\3\3\5\3\60\n\3\5\3\62\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4D\n\4"+
		"\f\4\16\4G\13\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4U"+
		"\n\4\f\4\16\4X\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6|\n\6\f\6\16\6\177\13\6\3\7\3\7\3\7\3\7\7\7\u0085"+
		"\n\7\f\7\16\7\u0088\13\7\5\7\u008a\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0092"+
		"\n\b\f\b\16\b\u0095\13\b\5\b\u0097\n\b\3\b\3\b\3\t\3\t\7\t\u009d\n\t\f"+
		"\t\16\t\u00a0\13\t\3\t\5\t\u00a3\n\t\3\t\3\t\3\n\3\n\3\n\5\n\u00aa\n\n"+
		"\3\n\3\n\3\13\3\13\3\13\5\13\u00b1\n\13\3\13\3\13\3\13\2\4\6\n\f\2\4\6"+
		"\b\n\f\16\20\22\24\2\4\4\2\n\n\31\31\4\2\n\n\27\27\2\u00c9\2\37\3\2\2"+
		"\2\4\61\3\2\2\2\6I\3\2\2\2\bq\3\2\2\2\ns\3\2\2\2\f\u0080\3\2\2\2\16\u008d"+
		"\3\2\2\2\20\u009a\3\2\2\2\22\u00a6\3\2\2\2\24\u00b0\3\2\2\2\26\32\5\6"+
		"\4\2\27\32\5\4\3\2\30\32\5\b\5\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2"+
		"\2\2\32\33\3\2\2\2\33\34\7\32\2\2\34\36\3\2\2\2\35\31\3\2\2\2\36!\3\2"+
		"\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37\3\2\2\2\"#\7\3\2\2#)\7\n"+
		"\2\2$\'\7\21\2\2%(\5\6\4\2&(\5\b\5\2\'%\3\2\2\2\'&\3\2\2\2(*\3\2\2\2)"+
		"$\3\2\2\2)*\3\2\2\2*\62\3\2\2\2+,\7\n\2\2,/\7\21\2\2-\60\5\6\4\2.\60\5"+
		"\b\5\2/-\3\2\2\2/.\3\2\2\2\60\62\3\2\2\2\61\"\3\2\2\2\61+\3\2\2\2\62\5"+
		"\3\2\2\2\63\64\b\4\1\2\64\65\7\r\2\2\65\66\5\6\4\2\66\67\7\16\2\2\67J"+
		"\3\2\2\28J\7\27\2\29J\7\30\2\2:J\7\31\2\2;J\7\n\2\2<=\7\b\2\2=>\7\r\2"+
		"\2>E\t\2\2\2?@\7\25\2\2@A\7\31\2\2AB\7\25\2\2BD\t\3\2\2C?\3\2\2\2DG\3"+
		"\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HJ\7\16\2\2I\63\3\2\2\2"+
		"I8\3\2\2\2I9\3\2\2\2I:\3\2\2\2I;\3\2\2\2I<\3\2\2\2JV\3\2\2\2KL\f\n\2\2"+
		"LM\7\24\2\2MU\5\6\4\13NO\f\t\2\2OP\7\23\2\2PU\5\6\4\nQR\f\b\2\2RS\7\22"+
		"\2\2SU\5\6\4\tTK\3\2\2\2TN\3\2\2\2TQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2W\7\3\2\2\2XV\3\2\2\2YZ\7\t\2\2Z[\7\r\2\2[\\\5\6\4\2\\]\7\16\2\2]"+
		"r\3\2\2\2^_\7\4\2\2_`\7\r\2\2`a\5\n\6\2ab\7\16\2\2bc\5\20\t\2cr\3\2\2"+
		"\2de\7\5\2\2ef\7\r\2\2fg\5\n\6\2gh\7\16\2\2hi\5\20\t\2ir\3\2\2\2jk\7\6"+
		"\2\2kl\7\n\2\2lm\5\f\7\2mn\5\20\t\2nr\3\2\2\2op\7\n\2\2pr\5\16\b\2qY\3"+
		"\2\2\2q^\3\2\2\2qd\3\2\2\2qj\3\2\2\2qo\3\2\2\2r\t\3\2\2\2st\b\6\1\2tu"+
		"\5\6\4\2uv\7\13\2\2vw\5\6\4\2w}\3\2\2\2xy\f\3\2\2yz\7\f\2\2z|\5\n\6\4"+
		"{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\13\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0089\7\r\2\2\u0081\u0086\7\n\2\2\u0082\u0083\7\25\2\2\u0083\u0085\7"+
		"\n\2\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u0081\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\16\2\2\u008c"+
		"\r\3\2\2\2\u008d\u0096\7\r\2\2\u008e\u0093\5\6\4\2\u008f\u0090\7\25\2"+
		"\2\u0090\u0092\5\6\4\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u008e\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\16"+
		"\2\2\u0099\17\3\2\2\2\u009a\u009e\7\17\2\2\u009b\u009d\5\24\13\2\u009c"+
		"\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\5\22\n\2\u00a2"+
		"\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\20"+
		"\2\2\u00a5\21\3\2\2\2\u00a6\u00a9\7\7\2\2\u00a7\u00aa\7\n\2\2\u00a8\u00aa"+
		"\5\6\4\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7\32\2\2\u00ac\23\3\2\2\2\u00ad\u00b1\5\4\3"+
		"\2\u00ae\u00b1\5\6\4\2\u00af\u00b1\5\b\5\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\32\2\2"+
		"\u00b3\25\3\2\2\2\26\31\37\')/\61EITVq}\u0086\u0089\u0093\u0096\u009e"+
		"\u00a2\u00a9\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}