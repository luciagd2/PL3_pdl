// Generated from C:/Users/carre/Oxygen-ANTLR/PL3/src/gramaticas/GrammarpruebaLexer.g4 by ANTLR 4.7

	package gramaticas;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarpruebaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, IF=2, WHILE=3, FUNCT=4, RET=5, VAL=6, PRINT=7, VAR=8, COMP=9, LOG=10, 
		OPNEG=11, PI=12, PD=13, CI=14, CD=15, IG=16, BB=17, SUMRES=18, MULDIVMOD=19, 
		EXP=20, COMA=21, COMILLA=22, NUM=23, TXT=24, POL=25, FIN=26, NEWLINE=27, 
		TAB=28, COMMENT=29, COMENTARIOLINEA=30, COMENTARIOCOMPL=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LET", "IF", "WHILE", "FUNCT", "RET", "VAL", "PRINT", "VAR", "COMP", "LOG", 
		"OPNEG", "PI", "PD", "CI", "CD", "IG", "BB", "SUMRES", "MULDIVMOD", "EXP", 
		"COMA", "COMILLA", "NUM", "INT", "FLOAT", "TXT", "POL", "MON", "CHR", 
		"FIN", "NEWLINE", "TAB", "COMMENT", "COMENTARIOLINEA", "COMENTARIOCOMPL", 
		"WS"
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


	public GrammarpruebaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarpruebaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u010f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\tv\n\t\f"+
		"\t\16\ty\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0084\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\5\30\u00a8\n\30\3\31\6\31\u00ab\n\31\r\31\16"+
		"\31\u00ac\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u00b6\n\33\f\33\16\33"+
		"\u00b9\13\33\3\33\3\33\3\34\3\34\5\34\u00bf\n\34\3\34\3\34\5\34\u00c3"+
		"\n\34\3\34\7\34\u00c6\n\34\f\34\16\34\u00c9\13\34\3\34\3\34\3\35\3\35"+
		"\3\35\5\35\u00d0\n\35\3\35\5\35\u00d3\n\35\3\36\3\36\3\37\3\37\3 \6 \u00da"+
		"\n \r \16 \u00db\3 \3 \3!\6!\u00e1\n!\r!\16!\u00e2\3!\3!\3\"\3\"\5\"\u00e9"+
		"\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\7#\u00f3\n#\f#\16#\u00f6\13#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\7$\u0100\n$\f$\16$\u0103\13$\3$\3$\3$\3$\3%\6%\u010a\n%"+
		"\r%\16%\u010b\3%\3%\5\u00b7\u00f4\u0101\2&\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\2\63\2\65\32\67\339\2;\2=\34?\35A\36C\37E G!I\"\3\2\n\3"+
		"\2c|\6\2\62;C\\aac|\4\2>>@@\4\2--//\5\2\'\',,\61\61\3\2\62;\4\2\f\f\17"+
		"\17\3\2\13\13\2\u011f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5"+
		"O\3\2\2\2\7R\3\2\2\2\tX\3\2\2\2\13b\3\2\2\2\ri\3\2\2\2\17m\3\2\2\2\21"+
		"s\3\2\2\2\23\u0083\3\2\2\2\25\u008b\3\2\2\2\27\u008d\3\2\2\2\31\u008f"+
		"\3\2\2\2\33\u0091\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2!\u0097\3\2"+
		"\2\2#\u0099\3\2\2\2%\u009b\3\2\2\2\'\u009d\3\2\2\2)\u009f\3\2\2\2+\u00a1"+
		"\3\2\2\2-\u00a3\3\2\2\2/\u00a7\3\2\2\2\61\u00aa\3\2\2\2\63\u00ae\3\2\2"+
		"\2\65\u00b2\3\2\2\2\67\u00bc\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d6"+
		"\3\2\2\2?\u00d9\3\2\2\2A\u00e0\3\2\2\2C\u00e8\3\2\2\2E\u00ec\3\2\2\2G"+
		"\u00f9\3\2\2\2I\u0109\3\2\2\2KL\7n\2\2LM\7g\2\2MN\7v\2\2N\4\3\2\2\2OP"+
		"\7k\2\2PQ\7h\2\2Q\6\3\2\2\2RS\7y\2\2ST\7j\2\2TU\7k\2\2UV\7n\2\2VW\7g\2"+
		"\2W\b\3\2\2\2XY\7h\2\2YZ\7w\2\2Z[\7p\2\2[\\\7e\2\2\\]\7v\2\2]^\7k\2\2"+
		"^_\7q\2\2_`\7p\2\2`a\7\"\2\2a\n\3\2\2\2bc\7t\2\2cd\7g\2\2de\7v\2\2ef\7"+
		"w\2\2fg\7t\2\2gh\7p\2\2h\f\3\2\2\2ij\7x\2\2jk\7c\2\2kl\7n\2\2l\16\3\2"+
		"\2\2mn\7r\2\2no\7t\2\2op\7k\2\2pq\7p\2\2qr\7v\2\2r\20\3\2\2\2sw\t\2\2"+
		"\2tv\t\3\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\22\3\2\2\2yw\3\2"+
		"\2\2z\u0084\t\4\2\2{|\7?\2\2|\u0084\7?\2\2}~\7#\2\2~\u0084\7?\2\2\177"+
		"\u0080\7>\2\2\u0080\u0084\7?\2\2\u0081\u0082\7@\2\2\u0082\u0084\7?\2\2"+
		"\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083}\3\2\2\2\u0083\177\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\24\3\2\2\2\u0085\u0086\7(\2\2\u0086\u008c\7(\2\2"+
		"\u0087\u0088\7~\2\2\u0088\u008c\7~\2\2\u0089\u008a\7%\2\2\u008a\u008c"+
		"\7%\2\2\u008b\u0085\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\26\3\2\2\2\u008d\u008e\7#\2\2\u008e\30\3\2\2\2\u008f\u0090\7*\2\2\u0090"+
		"\32\3\2\2\2\u0091\u0092\7+\2\2\u0092\34\3\2\2\2\u0093\u0094\7}\2\2\u0094"+
		"\36\3\2\2\2\u0095\u0096\7\177\2\2\u0096 \3\2\2\2\u0097\u0098\7?\2\2\u0098"+
		"\"\3\2\2\2\u0099\u009a\7a\2\2\u009a$\3\2\2\2\u009b\u009c\t\5\2\2\u009c"+
		"&\3\2\2\2\u009d\u009e\t\6\2\2\u009e(\3\2\2\2\u009f\u00a0\7`\2\2\u00a0"+
		"*\3\2\2\2\u00a1\u00a2\7.\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7)\2\2\u00a4."+
		"\3\2\2\2\u00a5\u00a8\5\61\31\2\u00a6\u00a8\5\63\32\2\u00a7\u00a5\3\2\2"+
		"\2\u00a7\u00a6\3\2\2\2\u00a8\60\3\2\2\2\u00a9\u00ab\t\7\2\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\62\3\2\2\2\u00ae\u00af\5\61\31\2\u00af\u00b0\7\60\2\2\u00b0\u00b1\5\61"+
		"\31\2\u00b1\64\3\2\2\2\u00b2\u00b3\7$\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b6"+
		"\13\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb"+
		"\7$\2\2\u00bb\66\3\2\2\2\u00bc\u00be\7)\2\2\u00bd\u00bf\5%\23\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c7\59"+
		"\35\2\u00c1\u00c3\5%\23\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\59\35\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7)\2\2\u00cb8\3\2\2\2\u00cc\u00cf\5;\36\2\u00cd"+
		"\u00ce\7`\2\2\u00ce\u00d0\5\61\31\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3\5\61\31\2\u00d2\u00cc\3\2\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3:\3\2\2\2\u00d4\u00d5\t\2\2\2\u00d5<\3\2\2\2\u00d6"+
		"\u00d7\7=\2\2\u00d7>\3\2\2\2\u00d8\u00da\t\b\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\b \2\2\u00de@\3\2\2\2\u00df\u00e1\t\t\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\b!\2\2\u00e5B\3\2\2\2\u00e6\u00e9\5G$\2\u00e7"+
		"\u00e9\5E#\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2"+
		"\2\u00ea\u00eb\b\"\2\2\u00ebD\3\2\2\2\u00ec\u00ed\7\'\2\2\u00ed\u00ee"+
		"\7\'\2\2\u00ee\u00ef\7\'\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f4\3\2\2\2\u00f1"+
		"\u00f3\13\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\5? \2\u00f8F\3\2\2\2\u00f9\u00fa\7,\2\2\u00fa\u00fb\7,\2\2\u00fb"+
		"\u00fc\7,\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\3\2\2\2\u00fe\u0100\13\2"+
		"\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u0102\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7,"+
		"\2\2\u0105\u0106\7,\2\2\u0106\u0107\7,\2\2\u0107H\3\2\2\2\u0108\u010a"+
		"\7\"\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b%\2\2\u010eJ\3\2\2\2\24"+
		"\2w\u0083\u008b\u00a7\u00ac\u00b7\u00be\u00c2\u00c7\u00cf\u00d2\u00db"+
		"\u00e2\u00e8\u00f4\u0101\u010b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}