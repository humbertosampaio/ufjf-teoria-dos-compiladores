// Generated from c:\Users\Luis\Documents\GitHub\u005Cufjf-teoria-dos-compiladores\AnalisadorSintatico\lang\parser\lang.g4 by ANTLR 4.8

    package lang.parser;
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_prog = 0, RULE_data = 1, RULE_decl = 2, RULE_func = 3, RULE_params = 4, 
		RULE_type = 5, RULE_btype = 6, RULE_cmd = 7, RULE_exp = 8, RULE_rexp = 9, 
		RULE_aexp = 10, RULE_mexp = 11, RULE_sexp = 12, RULE_pexp = 13, RULE_lvalue = 14, 
		RULE_exps = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "data", "decl", "func", "params", "type", "btype", "cmd", "exp", 
			"rexp", "aexp", "mexp", "sexp", "pexp", "lvalue", "exps"
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

	@Override
	public String getGrammarFileName() { return "lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public langParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO_DATA) {
				{
				{
				setState(32);
				data();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(38);
				func();
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode TIPO_DATA() { return getToken(langParser.TIPO_DATA, 0); }
		public TerminalNode ID_TIPO_DATA() { return getToken(langParser.ID_TIPO_DATA, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(langParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(langParser.FECHA_CHAVES, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(TIPO_DATA);
			setState(45);
			match(ID_TIPO_DATA);
			setState(46);
			match(ABRE_CHAVES);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(47);
				decl();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(FECHA_CHAVES);
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

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode DOIS_PONTOS_DUPLO() { return getToken(langParser.DOIS_PONTOS_DUPLO, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(langParser.PONTO_VIRGULA, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ID);
			setState(56);
			match(DOIS_PONTOS_DUPLO);
			setState(57);
			type(0);
			setState(58);
			match(PONTO_VIRGULA);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(langParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(langParser.FECHA_PARENTESES, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(langParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(langParser.FECHA_CHAVES, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(langParser.DOIS_PONTOS, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(langParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(langParser.VIRGULA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
			setState(61);
			match(ABRE_PARENTESES);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(62);
				params();
				}
			}

			setState(65);
			match(FECHA_PARENTESES);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOIS_PONTOS) {
				{
				setState(66);
				match(DOIS_PONTOS);
				setState(67);
				type(0);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(68);
					match(VIRGULA);
					setState(69);
					type(0);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(77);
			match(ABRE_CHAVES);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ITERATE) | (1L << READ) | (1L << PRINT) | (1L << RETURN) | (1L << ABRE_CHAVES) | (1L << ID))) != 0)) {
				{
				{
				setState(78);
				cmd();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(FECHA_CHAVES);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(langParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langParser.ID, i);
		}
		public List<TerminalNode> DOIS_PONTOS_DUPLO() { return getTokens(langParser.DOIS_PONTOS_DUPLO); }
		public TerminalNode DOIS_PONTOS_DUPLO(int i) {
			return getToken(langParser.DOIS_PONTOS_DUPLO, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(langParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(langParser.VIRGULA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			match(DOIS_PONTOS_DUPLO);
			setState(88);
			type(0);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(89);
				match(VIRGULA);
				setState(90);
				match(ID);
				setState(91);
				match(DOIS_PONTOS_DUPLO);
				setState(92);
				type(0);
				}
				}
				setState(97);
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

	public static class TypeContext extends ParserRuleContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ABRE_COLCHETES() { return getToken(langParser.ABRE_COLCHETES, 0); }
		public TerminalNode FECHA_COLCHETES() { return getToken(langParser.FECHA_COLCHETES, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			btype();
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(101);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(102);
					match(ABRE_COLCHETES);
					setState(103);
					match(FECHA_COLCHETES);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class BtypeContext extends ParserRuleContext {
		public TerminalNode TIPO_INT() { return getToken(langParser.TIPO_INT, 0); }
		public TerminalNode TIPO_CHAR() { return getToken(langParser.TIPO_CHAR, 0); }
		public TerminalNode TIPO_BOOL() { return getToken(langParser.TIPO_BOOL, 0); }
		public TerminalNode TIPO_FLOAT() { return getToken(langParser.TIPO_FLOAT, 0); }
		public TerminalNode ID_TIPO_DATA() { return getToken(langParser.ID_TIPO_DATA, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public BtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btype; }
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_btype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO_INT) | (1L << TIPO_CHAR) | (1L << TIPO_FLOAT) | (1L << TIPO_BOOL) | (1L << ID_TIPO_DATA) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CmdContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVES() { return getToken(langParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(langParser.FECHA_CHAVES, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode IF() { return getToken(langParser.IF, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(langParser.ABRE_PARENTESES, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(langParser.FECHA_PARENTESES, 0); }
		public TerminalNode ELSE() { return getToken(langParser.ELSE, 0); }
		public TerminalNode ITERATE() { return getToken(langParser.ITERATE, 0); }
		public TerminalNode READ() { return getToken(langParser.READ, 0); }
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(langParser.PONTO_VIRGULA, 0); }
		public TerminalNode PRINT() { return getToken(langParser.PRINT, 0); }
		public TerminalNode RETURN() { return getToken(langParser.RETURN, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(langParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(langParser.VIRGULA, i);
		}
		public TerminalNode ATRIBUICAO() { return getToken(langParser.ATRIBUICAO, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode MENOR_QUE() { return getToken(langParser.MENOR_QUE, 0); }
		public TerminalNode MAIOR_QUE() { return getToken(langParser.MAIOR_QUE, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ABRE_CHAVES);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ITERATE) | (1L << READ) | (1L << PRINT) | (1L << RETURN) | (1L << ABRE_CHAVES) | (1L << ID))) != 0)) {
					{
					{
					setState(112);
					cmd();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(FECHA_CHAVES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(IF);
				setState(120);
				match(ABRE_PARENTESES);
				setState(121);
				exp(0);
				setState(122);
				match(FECHA_PARENTESES);
				setState(123);
				cmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(IF);
				setState(126);
				match(ABRE_PARENTESES);
				setState(127);
				exp(0);
				setState(128);
				match(FECHA_PARENTESES);
				setState(129);
				cmd();
				setState(130);
				match(ELSE);
				setState(131);
				cmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(ITERATE);
				setState(134);
				match(ABRE_PARENTESES);
				setState(135);
				exp(0);
				setState(136);
				match(FECHA_PARENTESES);
				setState(137);
				cmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(READ);
				setState(140);
				lvalue(0);
				setState(141);
				match(PONTO_VIRGULA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				match(PRINT);
				setState(144);
				exp(0);
				setState(145);
				match(PONTO_VIRGULA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				match(RETURN);
				setState(148);
				exp(0);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(149);
					match(VIRGULA);
					setState(150);
					exp(0);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(PONTO_VIRGULA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				lvalue(0);
				setState(159);
				match(ATRIBUICAO);
				setState(160);
				exp(0);
				setState(161);
				match(PONTO_VIRGULA);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(163);
				match(ID);
				setState(164);
				match(ABRE_PARENTESES);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << NEW) | (1L << SUBTRACAO) | (1L << NEGACAO) | (1L << ABRE_PARENTESES) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR))) != 0)) {
					{
					setState(165);
					exps();
					}
				}

				setState(168);
				match(FECHA_PARENTESES);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MENOR_QUE) {
					{
					setState(169);
					match(MENOR_QUE);
					setState(170);
					lvalue(0);
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(171);
						match(VIRGULA);
						setState(172);
						lvalue(0);
						}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(178);
					match(MAIOR_QUE);
					}
				}

				setState(182);
				match(PONTO_VIRGULA);
				}
				break;
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

	public static class ExpContext extends ParserRuleContext {
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DISJUNCAO() { return getToken(langParser.DISJUNCAO, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(186);
			rexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(188);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(189);
					match(DISJUNCAO);
					setState(190);
					exp(3);
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class RexpContext extends ParserRuleContext {
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public TerminalNode MENOR_QUE() { return getToken(langParser.MENOR_QUE, 0); }
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public TerminalNode IGUALDADE() { return getToken(langParser.IGUALDADE, 0); }
		public TerminalNode DIFERENCA() { return getToken(langParser.DIFERENCA, 0); }
		public RexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexp; }
	}

	public final RexpContext rexp() throws RecognitionException {
		return rexp(0);
	}

	private RexpContext rexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RexpContext _localctx = new RexpContext(_ctx, _parentState);
		RexpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_rexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(197);
				aexp(0);
				setState(198);
				match(MENOR_QUE);
				setState(199);
				aexp(0);
				}
				break;
			case 2:
				{
				setState(201);
				aexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(204);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(205);
						match(IGUALDADE);
						setState(206);
						aexp(0);
						}
						break;
					case 2:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(207);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(208);
						match(DIFERENCA);
						setState(209);
						aexp(0);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class AexpContext extends ParserRuleContext {
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public TerminalNode SOMA() { return getToken(langParser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(langParser.SUBTRACAO, 0); }
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
	}

	public final AexpContext aexp() throws RecognitionException {
		return aexp(0);
	}

	private AexpContext aexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexpContext _localctx = new AexpContext(_ctx, _parentState);
		AexpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_aexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(216);
			mexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(218);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(219);
						match(SOMA);
						setState(220);
						mexp(0);
						}
						break;
					case 2:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(221);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(222);
						match(SUBTRACAO);
						setState(223);
						mexp(0);
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class MexpContext extends ParserRuleContext {
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public TerminalNode MULTIPLICACAO() { return getToken(langParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(langParser.DIVISAO, 0); }
		public TerminalNode RESTO() { return getToken(langParser.RESTO, 0); }
		public MexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mexp; }
	}

	public final MexpContext mexp() throws RecognitionException {
		return mexp(0);
	}

	private MexpContext mexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MexpContext _localctx = new MexpContext(_ctx, _parentState);
		MexpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_mexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(230);
			sexp();
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(241);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(232);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(233);
						match(MULTIPLICACAO);
						setState(234);
						sexp();
						}
						break;
					case 2:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(235);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(236);
						match(DIVISAO);
						setState(237);
						sexp();
						}
						break;
					case 3:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(238);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(239);
						match(RESTO);
						setState(240);
						sexp();
						}
						break;
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class SexpContext extends ParserRuleContext {
		public TerminalNode NEGACAO() { return getToken(langParser.NEGACAO, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public TerminalNode SUBTRACAO() { return getToken(langParser.SUBTRACAO, 0); }
		public TerminalNode TRUE() { return getToken(langParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(langParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(langParser.NULL, 0); }
		public TerminalNode INT() { return getToken(langParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(langParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(langParser.CHAR, 0); }
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
		}
		public SexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexp; }
	}

	public final SexpContext sexp() throws RecognitionException {
		SexpContext _localctx = new SexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sexp);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(NEGACAO);
				setState(247);
				sexp();
				}
				break;
			case SUBTRACAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(SUBTRACAO);
				setState(249);
				sexp();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				match(NULL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				match(FLOAT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(255);
				match(CHAR);
				}
				break;
			case NEW:
			case ABRE_PARENTESES:
			case ID:
				enterOuterAlt(_localctx, 9);
				{
				setState(256);
				pexp();
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

	public static class PexpContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ABRE_PARENTESES() { return getToken(langParser.ABRE_PARENTESES, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(langParser.FECHA_PARENTESES, 0); }
		public TerminalNode NEW() { return getToken(langParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ABRE_COLCHETES() { return getToken(langParser.ABRE_COLCHETES, 0); }
		public TerminalNode FECHA_COLCHETES() { return getToken(langParser.FECHA_COLCHETES, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public PexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pexp; }
	}

	public final PexpContext pexp() throws RecognitionException {
		PexpContext _localctx = new PexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pexp);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				lvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(ABRE_PARENTESES);
				setState(261);
				exp(0);
				setState(262);
				match(FECHA_PARENTESES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(NEW);
				setState(265);
				type(0);
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(266);
					match(ABRE_COLCHETES);
					setState(267);
					exp(0);
					setState(268);
					match(FECHA_COLCHETES);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(ID);
				setState(273);
				match(ABRE_PARENTESES);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << NEW) | (1L << SUBTRACAO) | (1L << NEGACAO) | (1L << ABRE_PARENTESES) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR))) != 0)) {
					{
					setState(274);
					exps();
					}
				}

				setState(277);
				match(FECHA_PARENTESES);
				setState(278);
				match(ABRE_COLCHETES);
				setState(279);
				exp(0);
				setState(280);
				match(FECHA_COLCHETES);
				}
				break;
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ABRE_COLCHETES() { return getToken(langParser.ABRE_COLCHETES, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode FECHA_COLCHETES() { return getToken(langParser.FECHA_COLCHETES, 0); }
		public TerminalNode PONTO() { return getToken(langParser.PONTO, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(287);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(288);
						match(ABRE_COLCHETES);
						setState(289);
						exp(0);
						setState(290);
						match(FECHA_COLCHETES);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(292);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(293);
						match(PONTO);
						setState(294);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class ExpsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(langParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(langParser.VIRGULA, i);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			exp(0);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(301);
				match(VIRGULA);
				setState(302);
				exp(0);
				}
				}
				setState(307);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 8:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 9:
			return rexp_sempred((RexpContext)_localctx, predIndex);
		case 10:
			return aexp_sempred((AexpContext)_localctx, predIndex);
		case 11:
			return mexp_sempred((MexpContext)_localctx, predIndex);
		case 14:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rexp_sempred(RexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean aexp_sempred(AexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mexp_sempred(MexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0137\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\3\3\7\3"+
		"\63\n\3\f\3\16\3\66\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5B"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\5\5N\n\5\3\5\3\5\7\5"+
		"R\n\5\f\5\16\5U\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6`\n\6\f\6"+
		"\16\6c\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\b\3\b\3"+
		"\t\3\t\7\tt\n\t\f\t\16\tw\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a9\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b0"+
		"\n\t\f\t\16\t\u00b3\13\t\3\t\3\t\5\t\u00b7\n\t\3\t\5\t\u00ba\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00c2\n\n\f\n\16\n\u00c5\13\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00cd\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d5"+
		"\n\13\f\13\16\13\u00d8\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e3"+
		"\n\f\f\f\16\f\u00e6\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00f4\n\r\f\r\16\r\u00f7\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0104\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0111\n\17\3\17\3\17\3\17\5\17\u0116\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u011d\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u012a\n\20\f\20\16\20\u012d\13\20\3\21"+
		"\3\21\3\21\7\21\u0132\n\21\f\21\16\21\u0135\13\21\3\21\2\b\f\22\24\26"+
		"\30\36\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\',\2\u0155\2"+
		"%\3\2\2\2\4.\3\2\2\2\69\3\2\2\2\b>\3\2\2\2\nX\3\2\2\2\fd\3\2\2\2\16o\3"+
		"\2\2\2\20\u00b9\3\2\2\2\22\u00bb\3\2\2\2\24\u00cc\3\2\2\2\26\u00d9\3\2"+
		"\2\2\30\u00e7\3\2\2\2\32\u0103\3\2\2\2\34\u011c\3\2\2\2\36\u011e\3\2\2"+
		"\2 \u012e\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2"+
		"&+\3\2\2\2\'%\3\2\2\2(*\5\b\5\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2"+
		"\2,\3\3\2\2\2-+\3\2\2\2./\7&\2\2/\60\7+\2\2\60\64\7 \2\2\61\63\5\6\4\2"+
		"\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2"+
		"\66\64\3\2\2\2\678\7!\2\28\5\3\2\2\29:\7,\2\2:;\7\37\2\2;<\5\f\7\2<=\7"+
		"\34\2\2=\7\3\2\2\2>?\7,\2\2?A\7\"\2\2@B\5\n\6\2A@\3\2\2\2AB\3\2\2\2BC"+
		"\3\2\2\2CM\7#\2\2DE\7\36\2\2EJ\5\f\7\2FG\7\33\2\2GI\5\f\7\2HF\3\2\2\2"+
		"IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MD\3\2\2\2MN\3\2\2\2"+
		"NO\3\2\2\2OS\7 \2\2PR\5\20\t\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VW\7!\2\2W\t\3\2\2\2XY\7,\2\2YZ\7\37\2\2Za\5\f\7\2"+
		"[\\\7\33\2\2\\]\7,\2\2]^\7\37\2\2^`\5\f\7\2_[\3\2\2\2`c\3\2\2\2a_\3\2"+
		"\2\2ab\3\2\2\2b\13\3\2\2\2ca\3\2\2\2de\b\7\1\2ef\5\16\b\2fl\3\2\2\2gh"+
		"\f\4\2\2hi\7$\2\2ik\7%\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\r"+
		"\3\2\2\2nl\3\2\2\2op\t\2\2\2p\17\3\2\2\2qu\7 \2\2rt\5\20\t\2sr\3\2\2\2"+
		"tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2x\u00ba\7!\2\2yz\7\3"+
		"\2\2z{\7\"\2\2{|\5\22\n\2|}\7#\2\2}~\5\20\t\2~\u00ba\3\2\2\2\177\u0080"+
		"\7\3\2\2\u0080\u0081\7\"\2\2\u0081\u0082\5\22\n\2\u0082\u0083\7#\2\2\u0083"+
		"\u0084\5\20\t\2\u0084\u0085\7\4\2\2\u0085\u0086\5\20\t\2\u0086\u00ba\3"+
		"\2\2\2\u0087\u0088\7\5\2\2\u0088\u0089\7\"\2\2\u0089\u008a\5\22\n\2\u008a"+
		"\u008b\7#\2\2\u008b\u008c\5\20\t\2\u008c\u00ba\3\2\2\2\u008d\u008e\7\6"+
		"\2\2\u008e\u008f\5\36\20\2\u008f\u0090\7\34\2\2\u0090\u00ba\3\2\2\2\u0091"+
		"\u0092\7\7\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7\34\2\2\u0094\u00ba\3"+
		"\2\2\2\u0095\u0096\7\b\2\2\u0096\u009b\5\22\n\2\u0097\u0098\7\33\2\2\u0098"+
		"\u009a\5\22\n\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\7\34\2\2\u009f\u00ba\3\2\2\2\u00a0\u00a1\5\36\20\2\u00a1\u00a2"+
		"\7\32\2\2\u00a2\u00a3\5\22\n\2\u00a3\u00a4\7\34\2\2\u00a4\u00ba\3\2\2"+
		"\2\u00a5\u00a6\7,\2\2\u00a6\u00a8\7\"\2\2\u00a7\u00a9\5 \21\2\u00a8\u00a7"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b6\7#\2\2\u00ab"+
		"\u00ac\7\27\2\2\u00ac\u00b1\5\36\20\2\u00ad\u00ae\7\33\2\2\u00ae\u00b0"+
		"\5\36\20\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5"+
		"\7\26\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00ab\3\2\2\2\u00b6\u00b7\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00ba\7\34\2\2\u00b9q\3\2\2\2\u00b9y\3\2\2"+
		"\2\u00b9\177\3\2\2\2\u00b9\u0087\3\2\2\2\u00b9\u008d\3\2\2\2\u00b9\u0091"+
		"\3\2\2\2\u00b9\u0095\3\2\2\2\u00b9\u00a0\3\2\2\2\u00b9\u00a5\3\2\2\2\u00ba"+
		"\21\3\2\2\2\u00bb\u00bc\b\n\1\2\u00bc\u00bd\5\24\13\2\u00bd\u00c3\3\2"+
		"\2\2\u00be\u00bf\f\4\2\2\u00bf\u00c0\7\23\2\2\u00c0\u00c2\5\22\n\5\u00c1"+
		"\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\23\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\b\13\1\2\u00c7\u00c8"+
		"\5\26\f\2\u00c8\u00c9\7\27\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cd\3\2\2"+
		"\2\u00cb\u00cd\5\26\f\2\u00cc\u00c6\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00d6\3\2\2\2\u00ce\u00cf\f\5\2\2\u00cf\u00d0\7\25\2\2\u00d0\u00d5\5"+
		"\26\f\2\u00d1\u00d2\f\4\2\2\u00d2\u00d3\7\24\2\2\u00d3\u00d5\5\26\f\2"+
		"\u00d4\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\25\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00da\b\f\1\2\u00da\u00db\5\30\r\2\u00db\u00e4\3\2\2\2\u00dc\u00dd\f"+
		"\5\2\2\u00dd\u00de\7\r\2\2\u00de\u00e3\5\30\r\2\u00df\u00e0\f\4\2\2\u00e0"+
		"\u00e1\7\17\2\2\u00e1\u00e3\5\30\r\2\u00e2\u00dc\3\2\2\2\u00e2\u00df\3"+
		"\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\27\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\b\r\1\2\u00e8\u00e9\5\32\16"+
		"\2\u00e9\u00f5\3\2\2\2\u00ea\u00eb\f\6\2\2\u00eb\u00ec\7\16\2\2\u00ec"+
		"\u00f4\5\32\16\2\u00ed\u00ee\f\5\2\2\u00ee\u00ef\7\20\2\2\u00ef\u00f4"+
		"\5\32\16\2\u00f0\u00f1\f\4\2\2\u00f1\u00f2\7\21\2\2\u00f2\u00f4\5\32\16"+
		"\2\u00f3\u00ea\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\31\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\7\22\2\2\u00f9\u0104\5\32\16\2\u00fa\u00fb"+
		"\7\17\2\2\u00fb\u0104\5\32\16\2\u00fc\u0104\7\t\2\2\u00fd\u0104\7\n\2"+
		"\2\u00fe\u0104\7\13\2\2\u00ff\u0104\7-\2\2\u0100\u0104\7.\2\2\u0101\u0104"+
		"\7/\2\2\u0102\u0104\5\34\17\2\u0103\u00f8\3\2\2\2\u0103\u00fa\3\2\2\2"+
		"\u0103\u00fc\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff"+
		"\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\33\3\2\2\2\u0105\u011d\5\36\20\2\u0106\u0107\7\"\2\2\u0107\u0108\5\22"+
		"\n\2\u0108\u0109\7#\2\2\u0109\u011d\3\2\2\2\u010a\u010b\7\f\2\2\u010b"+
		"\u0110\5\f\7\2\u010c\u010d\7$\2\2\u010d\u010e\5\22\n\2\u010e\u010f\7%"+
		"\2\2\u010f\u0111\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u011d\3\2\2\2\u0112\u0113\7,\2\2\u0113\u0115\7\"\2\2\u0114\u0116\5 \21"+
		"\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\7#\2\2\u0118\u0119\7$\2\2\u0119\u011a\5\22\n\2\u011a\u011b\7%\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u0105\3\2\2\2\u011c\u0106\3\2\2\2\u011c\u010a\3\2"+
		"\2\2\u011c\u0112\3\2\2\2\u011d\35\3\2\2\2\u011e\u011f\b\20\1\2\u011f\u0120"+
		"\7,\2\2\u0120\u012b\3\2\2\2\u0121\u0122\f\4\2\2\u0122\u0123\7$\2\2\u0123"+
		"\u0124\5\22\n\2\u0124\u0125\7%\2\2\u0125\u012a\3\2\2\2\u0126\u0127\f\3"+
		"\2\2\u0127\u0128\7\35\2\2\u0128\u012a\7,\2\2\u0129\u0121\3\2\2\2\u0129"+
		"\u0126\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\37\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0133\5\22\n\2\u012f\u0130"+
		"\7\33\2\2\u0130\u0132\5\22\n\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2"+
		"\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134!\3\2\2\2\u0135\u0133\3"+
		"\2\2\2 %+\64AJMSalu\u009b\u00a8\u00b1\u00b6\u00b9\u00c3\u00cc\u00d4\u00d6"+
		"\u00e2\u00e4\u00f3\u00f5\u0103\u0110\u0115\u011c\u0129\u012b\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}