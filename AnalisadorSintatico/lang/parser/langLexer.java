// Generated from ./lang/parser/lang.g4 by ANTLR 4.9.2

    package lang.parser;
 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, ITERATE=3, READ=4, PRINT=5, RETURN=6, TRUE=7, FALSE=8, NULL=9, 
		NEW=10, SOMA=11, MULTIPLICACAO=12, SUBTRACAO=13, DIVISAO=14, RESTO=15, 
		NEGACAO=16, DISJUNCAO=17, DIFERENCA=18, IGUALDADE=19, MAIOR_QUE=20, MENOR_QUE=21, 
		ASPA_SIMPLES=22, CONTRA_BARRA=23, ATRIBUICAO=24, VIRGULA=25, PONTO_VIRGULA=26, 
		PONTO=27, DOIS_PONTOS=28, DOIS_PONTOS_DUPLO=29, ABRE_CHAVES=30, FECHA_CHAVES=31, 
		ABRE_PARENTESES=32, FECHA_PARENTESES=33, ABRE_COLCHETES=34, FECHA_COLCHETES=35, 
		TIPO_DATA=36, TIPO_INT=37, TIPO_CHAR=38, TIPO_FLOAT=39, TIPO_BOOL=40, 
		ID_TIPO_DATA=41, ID=42, INT=43, FLOAT=44, CHAR=45, COMENTARIO_UMA_LINHA=46, 
		COMENTARIO_MULTIPLAS_LINHAS=47, WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "ITERATE", "READ", "PRINT", "RETURN", "TRUE", "FALSE", 
			"NULL", "NEW", "SOMA", "MULTIPLICACAO", "SUBTRACAO", "DIVISAO", "RESTO", 
			"NEGACAO", "DISJUNCAO", "DIFERENCA", "IGUALDADE", "MAIOR_QUE", "MENOR_QUE", 
			"ASPA_SIMPLES", "CONTRA_BARRA", "ATRIBUICAO", "VIRGULA", "PONTO_VIRGULA", 
			"PONTO", "DOIS_PONTOS", "DOIS_PONTOS_DUPLO", "ABRE_CHAVES", "FECHA_CHAVES", 
			"ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_COLCHETES", "FECHA_COLCHETES", 
			"TIPO_DATA", "TIPO_INT", "TIPO_CHAR", "TIPO_FLOAT", "TIPO_BOOL", "ID_TIPO_DATA", 
			"ID", "INT", "FLOAT", "CHAR", "COMENTARIO_UMA_LINHA", "COMENTARIO_MULTIPLAS_LINHAS", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'iterate'", "'read'", "'print'", "'return'", 
			"'true'", "'false'", "'null'", "'new'", "'+'", "'*'", "'-'", "'/'", "'%'", 
			"'!'", "'&&'", "'!='", "'=='", "'>'", "'<'", "'''", "'\\'", "'='", "','", 
			"';'", "'.'", "':'", "'::'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"'data'", "'Int'", "'Char'", "'Float'", "'Bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "ITERATE", "READ", "PRINT", "RETURN", "TRUE", "FALSE", 
			"NULL", "NEW", "SOMA", "MULTIPLICACAO", "SUBTRACAO", "DIVISAO", "RESTO", 
			"NEGACAO", "DISJUNCAO", "DIFERENCA", "IGUALDADE", "MAIOR_QUE", "MENOR_QUE", 
			"ASPA_SIMPLES", "CONTRA_BARRA", "ATRIBUICAO", "VIRGULA", "PONTO_VIRGULA", 
			"PONTO", "DOIS_PONTOS", "DOIS_PONTOS_DUPLO", "ABRE_CHAVES", "FECHA_CHAVES", 
			"ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_COLCHETES", "FECHA_COLCHETES", 
			"TIPO_DATA", "TIPO_INT", "TIPO_CHAR", "TIPO_FLOAT", "TIPO_BOOL", "ID_TIPO_DATA", 
			"ID", "INT", "FLOAT", "CHAR", "COMENTARIO_UMA_LINHA", "COMENTARIO_MULTIPLAS_LINHAS", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public langLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0148\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\7*\u00eb\n*\f*\16*\u00ee\13"+
		"*\3+\3+\7+\u00f2\n+\f+\16+\u00f5\13+\3,\3,\5,\u00f9\n,\3,\3,\7,\u00fd"+
		"\n,\f,\16,\u0100\13,\5,\u0102\n,\3-\5-\u0105\n-\3-\3-\6-\u0109\n-\r-\16"+
		"-\u010a\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\5.\u0127\n.\3/\3/\3/\3/\7/\u012d\n/\f/\16/\u0130\13/"+
		"\3/\3/\3\60\3\60\3\60\3\60\7\60\u0138\n\60\f\60\16\60\u013b\13\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\6\61\u0143\n\61\r\61\16\61\u0144\3\61\3\61\2"+
		"\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\n\3\2C\\\6\2\62"+
		";C\\aac|\4\2C\\c|\3\2\63;\3\2\62;\3\2\2\u0101\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\2\u0157\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5f\3\2\2\2\7k\3\2\2\2\ts\3\2\2\2\13x\3"+
		"\2\2\2\r~\3\2\2\2\17\u0085\3\2\2\2\21\u008a\3\2\2\2\23\u0090\3\2\2\2\25"+
		"\u0095\3\2\2\2\27\u0099\3\2\2\2\31\u009b\3\2\2\2\33\u009d\3\2\2\2\35\u009f"+
		"\3\2\2\2\37\u00a1\3\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a8\3\2\2\2"+
		"\'\u00ab\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3\2\2\2/\u00b4\3"+
		"\2\2\2\61\u00b6\3\2\2\2\63\u00b8\3\2\2\2\65\u00ba\3\2\2\2\67\u00bc\3\2"+
		"\2\29\u00be\3\2\2\2;\u00c0\3\2\2\2=\u00c3\3\2\2\2?\u00c5\3\2\2\2A\u00c7"+
		"\3\2\2\2C\u00c9\3\2\2\2E\u00cb\3\2\2\2G\u00cd\3\2\2\2I\u00cf\3\2\2\2K"+
		"\u00d4\3\2\2\2M\u00d8\3\2\2\2O\u00dd\3\2\2\2Q\u00e3\3\2\2\2S\u00e8\3\2"+
		"\2\2U\u00ef\3\2\2\2W\u0101\3\2\2\2Y\u0104\3\2\2\2[\u0126\3\2\2\2]\u0128"+
		"\3\2\2\2_\u0133\3\2\2\2a\u0142\3\2\2\2cd\7k\2\2de\7h\2\2e\4\3\2\2\2fg"+
		"\7g\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\6\3\2\2\2kl\7k\2\2lm\7v\2\2mn\7g\2"+
		"\2no\7t\2\2op\7c\2\2pq\7v\2\2qr\7g\2\2r\b\3\2\2\2st\7t\2\2tu\7g\2\2uv"+
		"\7c\2\2vw\7f\2\2w\n\3\2\2\2xy\7r\2\2yz\7t\2\2z{\7k\2\2{|\7p\2\2|}\7v\2"+
		"\2}\f\3\2\2\2~\177\7t\2\2\177\u0080\7g\2\2\u0080\u0081\7v\2\2\u0081\u0082"+
		"\7w\2\2\u0082\u0083\7t\2\2\u0083\u0084\7p\2\2\u0084\16\3\2\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7w\2\2\u0088\u0089\7g\2\2\u0089"+
		"\20\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c\7c\2\2\u008c\u008d\7n\2\2\u008d"+
		"\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f\22\3\2\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7w\2\2\u0092\u0093\7n\2\2\u0093\u0094\7n\2\2\u0094\24\3\2\2\2\u0095"+
		"\u0096\7p\2\2\u0096\u0097\7g\2\2\u0097\u0098\7y\2\2\u0098\26\3\2\2\2\u0099"+
		"\u009a\7-\2\2\u009a\30\3\2\2\2\u009b\u009c\7,\2\2\u009c\32\3\2\2\2\u009d"+
		"\u009e\7/\2\2\u009e\34\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\36\3\2\2\2\u00a1"+
		"\u00a2\7\'\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7#\2\2\u00a4\"\3\2\2\2\u00a5"+
		"\u00a6\7(\2\2\u00a6\u00a7\7(\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7#\2\2\u00a9"+
		"\u00aa\7?\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ad\7?\2\2\u00ad"+
		"(\3\2\2\2\u00ae\u00af\7@\2\2\u00af*\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1,"+
		"\3\2\2\2\u00b2\u00b3\7)\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7^\2\2\u00b5\60"+
		"\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7.\2\2\u00b9"+
		"\64\3\2\2\2\u00ba\u00bb\7=\2\2\u00bb\66\3\2\2\2\u00bc\u00bd\7\60\2\2\u00bd"+
		"8\3\2\2\2\u00be\u00bf\7<\2\2\u00bf:\3\2\2\2\u00c0\u00c1\7<\2\2\u00c1\u00c2"+
		"\7<\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7}\2\2\u00c4>\3\2\2\2\u00c5\u00c6\7"+
		"\177\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8B\3\2\2\2\u00c9\u00ca"+
		"\7+\2\2\u00caD\3\2\2\2\u00cb\u00cc\7]\2\2\u00ccF\3\2\2\2\u00cd\u00ce\7"+
		"_\2\2\u00ceH\3\2\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2"+
		"\7v\2\2\u00d2\u00d3\7c\2\2\u00d3J\3\2\2\2\u00d4\u00d5\7K\2\2\u00d5\u00d6"+
		"\7p\2\2\u00d6\u00d7\7v\2\2\u00d7L\3\2\2\2\u00d8\u00d9\7E\2\2\u00d9\u00da"+
		"\7j\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7t\2\2\u00dcN\3\2\2\2\u00dd\u00de"+
		"\7H\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7c\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2P\3\2\2\2\u00e3\u00e4\7D\2\2\u00e4\u00e5\7q\2\2\u00e5"+
		"\u00e6\7q\2\2\u00e6\u00e7\7n\2\2\u00e7R\3\2\2\2\u00e8\u00ec\t\2\2\2\u00e9"+
		"\u00eb\t\3\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00edT\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f3"+
		"\t\4\2\2\u00f0\u00f2\t\3\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4V\3\2\2\2\u00f5\u00f3\3\2\2\2"+
		"\u00f6\u0102\7\62\2\2\u00f7\u00f9\7/\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fe\t\5\2\2\u00fb\u00fd\t\6\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u00f6\3\2\2\2\u0101"+
		"\u00f8\3\2\2\2\u0102X\3\2\2\2\u0103\u0105\5W,\2\u0104\u0103\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\5\67\34\2\u0107\u0109\t"+
		"\6\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010bZ\3\2\2\2\u010c\u010d\7)\2\2\u010d\u010e\t\7\2\2\u010e"+
		"\u0127\7)\2\2\u010f\u0110\7)\2\2\u0110\u0111\7^\2\2\u0111\u0112\7v\2\2"+
		"\u0112\u0127\7)\2\2\u0113\u0114\7)\2\2\u0114\u0115\7^\2\2\u0115\u0116"+
		"\7t\2\2\u0116\u0127\7)\2\2\u0117\u0118\7)\2\2\u0118\u0119\7^\2\2\u0119"+
		"\u011a\7d\2\2\u011a\u0127\7)\2\2\u011b\u011c\7)\2\2\u011c\u011d\7^\2\2"+
		"\u011d\u011e\7^\2\2\u011e\u0127\7)\2\2\u011f\u0120\7)\2\2\u0120\u0121"+
		"\7)\2\2\u0121\u0127\7)\2\2\u0122\u0123\7)\2\2\u0123\u0124\7^\2\2\u0124"+
		"\u0125\7p\2\2\u0125\u0127\7)\2\2\u0126\u010c\3\2\2\2\u0126\u010f\3\2\2"+
		"\2\u0126\u0113\3\2\2\2\u0126\u0117\3\2\2\2\u0126\u011b\3\2\2\2\u0126\u011f"+
		"\3\2\2\2\u0126\u0122\3\2\2\2\u0127\\\3\2\2\2\u0128\u0129\7/\2\2\u0129"+
		"\u012a\7/\2\2\u012a\u012e\3\2\2\2\u012b\u012d\n\b\2\2\u012c\u012b\3\2"+
		"\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\b/\2\2\u0132^\3\2\2\2\u0133"+
		"\u0134\7}\2\2\u0134\u0135\7/\2\2\u0135\u0139\3\2\2\2\u0136\u0138\n\b\2"+
		"\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7/\2\2\u013d"+
		"\u013e\7\177\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b\60\2\2\u0140`\3\2\2"+
		"\2\u0141\u0143\t\t\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b\61\2\2"+
		"\u0147b\3\2\2\2\16\2\u00ec\u00f3\u00f8\u00fe\u0101\u0104\u010a\u0126\u012e"+
		"\u0139\u0144\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}