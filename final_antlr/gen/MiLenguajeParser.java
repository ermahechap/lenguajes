// Generated from /home/c3po/Git/lenguajes/final_antlr/grammar/MiLenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, RESERVED_WORD_F=34, ID=35, IDENTIFIER=36, IDENTIFIER_PTR=37, 
		BOOLEAN=38, NUMBER=39, INT=40, REAL=41, STRING=42, ID_LETTER=43, DIGIT=44, 
		TK_SEPARA=45, TK_LEFT_BRACKET=46, TK_RIGHT_BRACKET=47, TK_LEFT_PARENTHESES=48, 
		TK_RIGHT_PARENTHESES=49, TK_LEFT_BRACE=50, TK_RIGHT_BRACE=51, TK_EXECUTE=52, 
		TK_DOT=53, TK_SEMI_COLON=54, TK_COLON=55, TK_COMMA=56, TK_INCREMENT=57, 
		TK_DECREMENT=58, TK_POINTER=59, TK_NOT=60, TK_PLUS=61, TK_MINUS=62, TK_ADDRESS=63, 
		TK_N_INVOCATIONS=64, TK_EXPONENTIATION=65, TK_MULTIPLICATION=66, TK_DIVISION=67, 
		TK_REMAINDER=68, TK_MODULUS=69, TK_CONTAT=70, TK_LEFT_SHIFT=71, TK_RIGHT_SHIFT=72, 
		TK_EQUAL=73, TK_NOT_EQUAL=74, TK_GREATER=75, TK_lESS=76, TK_GREATER_EQUAL=77, 
		TK_LESS_EQUAL=78, TK_AND=79, TK_OR=80, TK_XOR=81, TK_ASSIGN=82, TK_SWAP=83, 
		TK_INCREMENT_ASSIGN=84, TK_DECREMENT_ASSIGN=85, TK_MULTIPLICATION_ASSIGN=86, 
		TK_DIVISION_ASSIGN=87, TK_REMAINDER_ASSIGN=88, TK_EXPONENTIATION_ASSIGN=89, 
		TK_OR_ASSIGN=90, TK_AND_ASSIGN=91, TK_CONCAT_ASSIGN=92, TK_LEFT_SHIFT_ASSIGN=93, 
		TK_RIGHT_SHIFT_ASSIGN=94, SPACES=95, LINE_COMMENT=96;
	public static final int
		RULE_start = 0, RULE_entry = 1, RULE_global = 2, RULE_resource = 3, RULE_body = 4, 
		RULE_resource_body = 5, RULE_spec = 6, RULE_import_ = 7, RULE_const_ = 8, 
		RULE_type = 9, RULE_optype = 10, RULE_op_type_params = 11, RULE_var = 12, 
		RULE_operation = 13, RULE_operation_one = 14, RULE_proc = 15, RULE_block = 16, 
		RULE_declarations = 17, RULE_statements = 18, RULE_comma_params = 19, 
		RULE_comma_expressions_params = 20, RULE_params = 21, RULE_param = 22, 
		RULE_data_type = 23, RULE_equal_expression = 24, RULE_assign_expression = 25, 
		RULE_function_ = 26, RULE_resource_control = 27, RULE_create_cap_expression = 28, 
		RULE_destroy_cap_expression = 29, RULE_operation_invocation = 30, RULE_call_expression = 31, 
		RULE_send_expression = 32, RULE_concurrent_expression = 33, RULE_call_invocation = 34, 
		RULE_quantifier = 35, RULE_sequential = 36, RULE_operation_service = 37, 
		RULE_expression = 38, RULE_assign = 39, RULE_binary_expression = 40, RULE_or_expression = 41, 
		RULE_and_expression = 42, RULE_comp_expression = 43, RULE_shift_expression = 44, 
		RULE_simple_op_expression = 45, RULE_other_op_expression = 46, RULE_exponentiation_expression = 47, 
		RULE_unary_expression = 48, RULE_post_op = 49, RULE_pre_op = 50, RULE_single_expr = 51, 
		RULE_array = 52, RULE_subscript_slice = 53, RULE_slice = 54, RULE_subscript = 55, 
		RULE_grouping = 56, RULE_sign_change = 57, RULE_assigns = 58, RULE_comps = 59, 
		RULE_simple_op = 60, RULE_other_op = 61;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "entry", "global", "resource", "body", "resource_body", "spec", 
			"import_", "const_", "type", "optype", "op_type_params", "var", "operation", 
			"operation_one", "proc", "block", "declarations", "statements", "comma_params", 
			"comma_expressions_params", "params", "param", "data_type", "equal_expression", 
			"assign_expression", "function_", "resource_control", "create_cap_expression", 
			"destroy_cap_expression", "operation_invocation", "call_expression", 
			"send_expression", "concurrent_expression", "call_invocation", "quantifier", 
			"sequential", "operation_service", "expression", "assign", "binary_expression", 
			"or_expression", "and_expression", "comp_expression", "shift_expression", 
			"simple_op_expression", "other_op_expression", "exponentiation_expression", 
			"unary_expression", "post_op", "pre_op", "single_expr", "array", "subscript_slice", 
			"slice", "subscript", "grouping", "sign_change", "assigns", "comps", 
			"simple_op", "other_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'global'", "'end'", "'resource'", "'separate'", "'body'", "'initial'", 
			"'final'", "'spec'", "'import'", "'const'", "'type'", "'rec'", "'optype'", 
			"'returns'", "'res'", "'var'", "'cap'", "'op'", "'proc'", "'int'", "'char'", 
			"'string'", "'bool'", "'create'", "'on'", "'destroy'", "'call'", "'send'", 
			"'co'", "'to'", "'oc'", "'notyet'", "'NOTYET'", "'write'", null, null, 
			null, null, null, null, null, null, null, null, "'[]'", "'['", "']'", 
			"'('", "')'", "'{'", "'}'", "'->'", "'.'", "';'", "':'", "','", "'++'", 
			"'--'", "'^'", null, "'+'", "'-'", "'@'", "'?'", "'**'", "'*'", "'/'", 
			"'%'", "'mod'", "'||'", "'<<'", "'>>'", "'='", null, "'>'", "'<'", "'>='", 
			"'<='", null, null, "'xor'", "':='", "':=:'", "'+:='", "'-:='", "'*:='", 
			"'/:='", "'%:='", "'**:='", "'|:='", "'&:='", "'||:='", "'<<:='", "'>>:='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "RESERVED_WORD_F", 
			"ID", "IDENTIFIER", "IDENTIFIER_PTR", "BOOLEAN", "NUMBER", "INT", "REAL", 
			"STRING", "ID_LETTER", "DIGIT", "TK_SEPARA", "TK_LEFT_BRACKET", "TK_RIGHT_BRACKET", 
			"TK_LEFT_PARENTHESES", "TK_RIGHT_PARENTHESES", "TK_LEFT_BRACE", "TK_RIGHT_BRACE", 
			"TK_EXECUTE", "TK_DOT", "TK_SEMI_COLON", "TK_COLON", "TK_COMMA", "TK_INCREMENT", 
			"TK_DECREMENT", "TK_POINTER", "TK_NOT", "TK_PLUS", "TK_MINUS", "TK_ADDRESS", 
			"TK_N_INVOCATIONS", "TK_EXPONENTIATION", "TK_MULTIPLICATION", "TK_DIVISION", 
			"TK_REMAINDER", "TK_MODULUS", "TK_CONTAT", "TK_LEFT_SHIFT", "TK_RIGHT_SHIFT", 
			"TK_EQUAL", "TK_NOT_EQUAL", "TK_GREATER", "TK_lESS", "TK_GREATER_EQUAL", 
			"TK_LESS_EQUAL", "TK_AND", "TK_OR", "TK_XOR", "TK_ASSIGN", "TK_SWAP", 
			"TK_INCREMENT_ASSIGN", "TK_DECREMENT_ASSIGN", "TK_MULTIPLICATION_ASSIGN", 
			"TK_DIVISION_ASSIGN", "TK_REMAINDER_ASSIGN", "TK_EXPONENTIATION_ASSIGN", 
			"TK_OR_ASSIGN", "TK_AND_ASSIGN", "TK_CONCAT_ASSIGN", "TK_LEFT_SHIFT_ASSIGN", 
			"TK_RIGHT_SHIFT_ASSIGN", "SPACES", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__7))) != 0)) {
				{
				{
				setState(124);
				entry();
				}
				}
				setState(129);
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

	public static class EntryContext extends ParserRuleContext {
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entry);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				resource();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				global();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				body();
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

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public List<Const_Context> const_() {
			return getRuleContexts(Const_Context.class);
		}
		public Const_Context const_(int i) {
			return getRuleContext(Const_Context.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__0);
			setState(136);
			match(ID);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(137);
					const_();
					}
					break;
				case T__10:
					{
					setState(138);
					type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(T__1);
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

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public Resource_bodyContext resource_body() {
			return getRuleContext(Resource_bodyContext.class,0);
		}
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(146);
				spec();
				}
			}

			setState(149);
			match(T__2);
			setState(150);
			match(ID);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LEFT_PARENTHESES) {
				{
				setState(151);
				match(TK_LEFT_PARENTHESES);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(152);
					params();
					}
				}

				setState(155);
				match(TK_RIGHT_PARENTHESES);
				}
			}

			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(158);
				match(T__3);
				}
				break;
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__12:
			case T__15:
			case T__17:
			case T__18:
				{
				setState(159);
				resource_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public Resource_bodyContext resource_body() {
			return getRuleContext(Resource_bodyContext.class,0);
		}
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__4);
			setState(163);
			match(ID);
			{
			setState(164);
			match(TK_LEFT_PARENTHESES);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(165);
				params();
				}
			}

			setState(168);
			match(TK_RIGHT_PARENTHESES);
			}
			setState(170);
			resource_body();
			setState(171);
			match(T__1);
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

	public static class Resource_bodyContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public Resource_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterResource_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitResource_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitResource_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_bodyContext resource_body() throws RecognitionException {
		Resource_bodyContext _localctx = new Resource_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_resource_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(173);
				declarations();
				}
				break;
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(176);
				match(T__5);
				setState(177);
				block();
				setState(178);
				match(T__1);
				}
			}

			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(182);
				proc();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(188);
			match(T__6);
			setState(189);
			block();
			setState(190);
			match(T__1);
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

	public static class SpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public List<Import_Context> import_() {
			return getRuleContexts(Import_Context.class);
		}
		public Import_Context import_(int i) {
			return getRuleContext(Import_Context.class,i);
		}
		public List<Const_Context> const_() {
			return getRuleContexts(Const_Context.class);
		}
		public Const_Context const_(int i) {
			return getRuleContext(Const_Context.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__7);
			setState(193);
			match(ID);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__17))) != 0)) {
				{
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(194);
					import_();
					}
					break;
				case T__9:
					{
					setState(195);
					const_();
					}
					break;
				case T__10:
					{
					setState(196);
					type();
					}
					break;
				case T__17:
					{
					setState(197);
					operation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(202);
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

	public static class Import_Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(MiLenguajeParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(MiLenguajeParser.TK_COMMA, i);
		}
		public TerminalNode TK_SEMI_COLON() { return getToken(MiLenguajeParser.TK_SEMI_COLON, 0); }
		public Import_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterImport_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitImport_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitImport_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_Context import_() throws RecognitionException {
		Import_Context _localctx = new Import_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_import_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__8);
			setState(204);
			match(ID);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(205);
				match(TK_COMMA);
				setState(206);
				match(ID);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_SEMI_COLON) {
				{
				setState(212);
				match(TK_SEMI_COLON);
				}
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

	public static class Const_Context extends ParserRuleContext {
		public Equal_expressionContext equal_expression() {
			return getRuleContext(Equal_expressionContext.class,0);
		}
		public Const_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConst_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConst_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitConst_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_Context const_() throws RecognitionException {
		Const_Context _localctx = new Const_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_const_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__9);
			setState(216);
			equal_expression();
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
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_EQUAL() { return getToken(MiLenguajeParser.TK_EQUAL, 0); }
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__10);
			setState(219);
			match(ID);
			setState(220);
			match(TK_EQUAL);
			setState(221);
			match(T__11);
			setState(222);
			match(TK_LEFT_PARENTHESES);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(223);
				params();
				}
			}

			setState(226);
			match(TK_RIGHT_PARENTHESES);
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

	public static class OptypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_EQUAL() { return getToken(MiLenguajeParser.TK_EQUAL, 0); }
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public Op_type_paramsContext op_type_params() {
			return getRuleContext(Op_type_paramsContext.class,0);
		}
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public OptypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOptype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOptype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOptype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptypeContext optype() throws RecognitionException {
		OptypeContext _localctx = new OptypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_optype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__12);
			setState(229);
			match(ID);
			setState(230);
			match(TK_EQUAL);
			setState(231);
			match(TK_LEFT_PARENTHESES);
			setState(232);
			op_type_params();
			setState(233);
			match(TK_RIGHT_PARENTHESES);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(234);
				match(T__13);
				setState(235);
				param();
				}
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

	public static class Op_type_paramsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> TK_SEMI_COLON() { return getTokens(MiLenguajeParser.TK_SEMI_COLON); }
		public TerminalNode TK_SEMI_COLON(int i) {
			return getToken(MiLenguajeParser.TK_SEMI_COLON, i);
		}
		public Op_type_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_type_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOp_type_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOp_type_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOp_type_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_type_paramsContext op_type_params() throws RecognitionException {
		Op_type_paramsContext _localctx = new Op_type_paramsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op_type_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(238);
				match(T__14);
				}
			}

			setState(241);
			param();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEMI_COLON) {
				{
				{
				setState(242);
				match(TK_SEMI_COLON);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(243);
					match(T__14);
					}
				}

				setState(246);
				param();
				}
				}
				setState(251);
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

	public static class VarContext extends ParserRuleContext {
		public Comma_paramsContext comma_params() {
			return getRuleContext(Comma_paramsContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__15);
			setState(253);
			comma_params();
			setState(254);
			match(TK_COLON);
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case ID:
				{
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(255);
					match(T__16);
					}
				}

				setState(258);
				match(ID);
				}
				break;
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				{
				setState(259);
				data_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(262);
				assign_expression();
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

	public static class OperationContext extends ParserRuleContext {
		public Comma_paramsContext comma_params() {
			return getRuleContext(Comma_paramsContext.class,0);
		}
		public Operation_oneContext operation_one() {
			return getRuleContext(Operation_oneContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__17);
			setState(266);
			comma_params();
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LEFT_PARENTHESES:
				{
				setState(267);
				operation_one();
				}
				break;
			case TK_COLON:
				{
				setState(268);
				match(TK_COLON);
				setState(269);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Operation_oneContext extends ParserRuleContext {
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Operation_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOperation_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOperation_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOperation_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation_oneContext operation_one() throws RecognitionException {
		Operation_oneContext _localctx = new Operation_oneContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operation_one);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(TK_LEFT_PARENTHESES);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(273);
				params();
				}
			}

			setState(276);
			match(TK_RIGHT_PARENTHESES);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(277);
				match(T__13);
				setState(278);
				param();
				}
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

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Comma_paramsContext comma_params() {
			return getRuleContext(Comma_paramsContext.class,0);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__18);
			setState(282);
			match(ID);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LEFT_PARENTHESES) {
				{
				setState(283);
				match(TK_LEFT_PARENTHESES);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(284);
					comma_params();
					}
				}

				setState(287);
				match(TK_RIGHT_PARENTHESES);
				}
			}

			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(290);
				match(T__13);
				setState(291);
				param();
				}
			}

			setState(294);
			block();
			setState(295);
			match(T__1);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(297);
				declarations();
				}
				break;
			}
			setState(300);
			statements();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public List<Const_Context> const_() {
			return getRuleContexts(Const_Context.class);
		}
		public Const_Context const_(int i) {
			return getRuleContext(Const_Context.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<OptypeContext> optype() {
			return getRuleContexts(OptypeContext.class);
		}
		public OptypeContext optype(int i) {
			return getRuleContext(OptypeContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__15) | (1L << T__17))) != 0)) {
				{
				setState(307);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(302);
					const_();
					}
					break;
				case T__10:
					{
					setState(303);
					type();
					}
					break;
				case T__12:
					{
					setState(304);
					optype();
					}
					break;
				case T__15:
					{
					setState(305);
					var();
					}
					break;
				case T__17:
					{
					setState(306);
					operation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(311);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<SequentialContext> sequential() {
			return getRuleContexts(SequentialContext.class);
		}
		public SequentialContext sequential(int i) {
			return getRuleContext(SequentialContext.class,i);
		}
		public List<Operation_invocationContext> operation_invocation() {
			return getRuleContexts(Operation_invocationContext.class);
		}
		public Operation_invocationContext operation_invocation(int i) {
			return getRuleContext(Operation_invocationContext.class,i);
		}
		public List<Operation_serviceContext> operation_service() {
			return getRuleContexts(Operation_serviceContext.class);
		}
		public Operation_serviceContext operation_service(int i) {
			return getRuleContext(Operation_serviceContext.class,i);
		}
		public List<Resource_controlContext> resource_control() {
			return getRuleContexts(Resource_controlContext.class);
		}
		public Resource_controlContext resource_control(int i) {
			return getRuleContext(Resource_controlContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << ID))) != 0)) {
				{
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(312);
					sequential();
					}
					break;
				case 2:
					{
					setState(313);
					operation_invocation();
					}
					break;
				case 3:
					{
					setState(314);
					operation_service();
					}
					break;
				case 4:
					{
					setState(315);
					resource_control();
					}
					break;
				}
				}
				setState(320);
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

	public static class Comma_paramsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<Subscript_sliceContext> subscript_slice() {
			return getRuleContexts(Subscript_sliceContext.class);
		}
		public Subscript_sliceContext subscript_slice(int i) {
			return getRuleContext(Subscript_sliceContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(MiLenguajeParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(MiLenguajeParser.TK_COMMA, i);
		}
		public Comma_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterComma_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitComma_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitComma_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_paramsContext comma_params() throws RecognitionException {
		Comma_paramsContext _localctx = new Comma_paramsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comma_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ID);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_LEFT_BRACKET) {
				{
				{
				setState(322);
				subscript_slice();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(328);
				match(TK_COMMA);
				setState(329);
				match(ID);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_LEFT_BRACKET) {
					{
					{
					setState(330);
					subscript_slice();
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(340);
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

	public static class Comma_expressions_paramsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(MiLenguajeParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(MiLenguajeParser.TK_COMMA, i);
		}
		public List<Subscript_sliceContext> subscript_slice() {
			return getRuleContexts(Subscript_sliceContext.class);
		}
		public Subscript_sliceContext subscript_slice(int i) {
			return getRuleContext(Subscript_sliceContext.class,i);
		}
		public Comma_expressions_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_expressions_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterComma_expressions_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitComma_expressions_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitComma_expressions_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_expressions_paramsContext comma_expressions_params() throws RecognitionException {
		Comma_expressions_paramsContext _localctx = new Comma_expressions_paramsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comma_expressions_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(341);
				match(ID);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_LEFT_BRACKET) {
					{
					{
					setState(342);
					subscript_slice();
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(348);
				binary_expression();
				}
				break;
			}
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(351);
				match(TK_COMMA);
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(352);
					match(ID);
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_LEFT_BRACKET) {
						{
						{
						setState(353);
						subscript_slice();
						}
						}
						setState(358);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(359);
					binary_expression();
					}
					break;
				}
				}
				}
				setState(366);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> TK_SEMI_COLON() { return getTokens(MiLenguajeParser.TK_SEMI_COLON); }
		public TerminalNode TK_SEMI_COLON(int i) {
			return getToken(MiLenguajeParser.TK_SEMI_COLON, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			param();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEMI_COLON) {
				{
				{
				setState(368);
				match(TK_SEMI_COLON);
				setState(369);
				param();
				}
				}
				setState(374);
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

	public static class ParamContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(MiLenguajeParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(MiLenguajeParser.TK_COMMA, i);
		}
		public List<Subscript_sliceContext> subscript_slice() {
			return getRuleContexts(Subscript_sliceContext.class);
		}
		public Subscript_sliceContext subscript_slice(int i) {
			return getRuleContext(Subscript_sliceContext.class,i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(ID);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(376);
				match(TK_COMMA);
				setState(377);
				match(ID);
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_LEFT_BRACKET) {
				{
				{
				setState(383);
				subscript_slice();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(TK_COLON);
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				{
				setState(390);
				data_type();
				}
				break;
			case T__16:
				{
				setState(391);
				match(T__16);
				setState(392);
				match(ID);
				}
				break;
			case ID:
				{
				setState(393);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Data_typeContext extends ParserRuleContext {
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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

	public static class Equal_expressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public TerminalNode TK_EQUAL() { return getToken(MiLenguajeParser.TK_EQUAL, 0); }
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public TerminalNode TK_SEMI_COLON() { return getToken(MiLenguajeParser.TK_SEMI_COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Equal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEqual_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEqual_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitEqual_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal_expressionContext equal_expression() throws RecognitionException {
		Equal_expressionContext _localctx = new Equal_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_equal_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(ID);
			setState(399);
			match(TK_EQUAL);
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(400);
				binary_expression();
				}
				break;
			case 2:
				{
				setState(403);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(401);
					match(ID);
					}
					break;
				case TK_LEFT_BRACKET:
					{
					setState(402);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_SEMI_COLON) {
				{
				setState(407);
				match(TK_SEMI_COLON);
				}
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

	public static class Assign_expressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public TerminalNode TK_SEMI_COLON() { return getToken(MiLenguajeParser.TK_SEMI_COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Assign_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterAssign_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitAssign_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitAssign_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_expressionContext assign_expression() throws RecognitionException {
		Assign_expressionContext _localctx = new Assign_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assign_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(ID);
			setState(411);
			match(TK_ASSIGN);
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(412);
				binary_expression();
				}
				break;
			case 2:
				{
				setState(415);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(413);
					match(ID);
					}
					break;
				case TK_LEFT_BRACKET:
					{
					setState(414);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_SEMI_COLON) {
				{
				setState(419);
				match(TK_SEMI_COLON);
				}
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

	public static class Function_Context extends ParserRuleContext {
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public Comma_expressions_paramsContext comma_expressions_params() {
			return getRuleContext(Comma_expressions_paramsContext.class,0);
		}
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public TerminalNode RESERVED_WORD_F() { return getToken(MiLenguajeParser.RESERVED_WORD_F, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public Subscript_sliceContext subscript_slice() {
			return getRuleContext(Subscript_sliceContext.class,0);
		}
		public Function_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFunction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFunction_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFunction_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_Context function_() throws RecognitionException {
		Function_Context _localctx = new Function_Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_function_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESERVED_WORD_F:
				{
				setState(422);
				match(RESERVED_WORD_F);
				}
				break;
			case ID:
				{
				setState(423);
				match(ID);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_LEFT_BRACKET) {
					{
					setState(424);
					subscript_slice();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(429);
			match(TK_LEFT_PARENTHESES);
			setState(430);
			comma_expressions_params();
			setState(431);
			match(TK_RIGHT_PARENTHESES);
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

	public static class Resource_controlContext extends ParserRuleContext {
		public Create_cap_expressionContext create_cap_expression() {
			return getRuleContext(Create_cap_expressionContext.class,0);
		}
		public Destroy_cap_expressionContext destroy_cap_expression() {
			return getRuleContext(Destroy_cap_expressionContext.class,0);
		}
		public Resource_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterResource_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitResource_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitResource_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_controlContext resource_control() throws RecognitionException {
		Resource_controlContext _localctx = new Resource_controlContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_resource_control);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				create_cap_expression();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				destroy_cap_expression();
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

	public static class Create_cap_expressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public Comma_expressions_paramsContext comma_expressions_params() {
			return getRuleContext(Comma_expressions_paramsContext.class,0);
		}
		public Create_cap_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_cap_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCreate_cap_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCreate_cap_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCreate_cap_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_cap_expressionContext create_cap_expression() throws RecognitionException {
		Create_cap_expressionContext _localctx = new Create_cap_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_create_cap_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(ID);
			setState(438);
			match(TK_ASSIGN);
			setState(439);
			match(T__23);
			setState(440);
			match(ID);
			setState(441);
			match(TK_LEFT_PARENTHESES);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_WORD_F) | (1L << ID) | (1L << NUMBER) | (1L << REAL) | (1L << STRING) | (1L << TK_LEFT_BRACKET) | (1L << TK_LEFT_PARENTHESES) | (1L << TK_INCREMENT) | (1L << TK_DECREMENT) | (1L << TK_NOT) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_ADDRESS))) != 0)) {
				{
				setState(442);
				comma_expressions_params();
				}
			}

			setState(445);
			match(TK_RIGHT_PARENTHESES);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(446);
				match(T__24);
				setState(447);
				match(ID);
				}
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

	public static class Destroy_cap_expressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public Destroy_cap_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destroy_cap_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDestroy_cap_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDestroy_cap_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDestroy_cap_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Destroy_cap_expressionContext destroy_cap_expression() throws RecognitionException {
		Destroy_cap_expressionContext _localctx = new Destroy_cap_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_destroy_cap_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__25);
			setState(451);
			match(ID);
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

	public static class Operation_invocationContext extends ParserRuleContext {
		public Call_expressionContext call_expression() {
			return getRuleContext(Call_expressionContext.class,0);
		}
		public Send_expressionContext send_expression() {
			return getRuleContext(Send_expressionContext.class,0);
		}
		public Concurrent_expressionContext concurrent_expression() {
			return getRuleContext(Concurrent_expressionContext.class,0);
		}
		public Operation_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOperation_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOperation_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOperation_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation_invocationContext operation_invocation() throws RecognitionException {
		Operation_invocationContext _localctx = new Operation_invocationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operation_invocation);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				call_expression();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				send_expression();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				concurrent_expression();
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

	public static class Call_expressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public Comma_expressions_paramsContext comma_expressions_params() {
			return getRuleContext(Comma_expressions_paramsContext.class,0);
		}
		public Call_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCall_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCall_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCall_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_expressionContext call_expression() throws RecognitionException {
		Call_expressionContext _localctx = new Call_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_call_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(458);
				match(T__26);
				}
			}

			setState(461);
			match(ID);
			setState(462);
			match(TK_LEFT_PARENTHESES);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_WORD_F) | (1L << ID) | (1L << NUMBER) | (1L << REAL) | (1L << STRING) | (1L << TK_LEFT_BRACKET) | (1L << TK_LEFT_PARENTHESES) | (1L << TK_INCREMENT) | (1L << TK_DECREMENT) | (1L << TK_NOT) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_ADDRESS))) != 0)) {
				{
				setState(463);
				comma_expressions_params();
				}
			}

			setState(466);
			match(TK_RIGHT_PARENTHESES);
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

	public static class Send_expressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public Comma_expressions_paramsContext comma_expressions_params() {
			return getRuleContext(Comma_expressions_paramsContext.class,0);
		}
		public Send_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSend_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSend_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSend_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Send_expressionContext send_expression() throws RecognitionException {
		Send_expressionContext _localctx = new Send_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_send_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__27);
			setState(469);
			match(ID);
			setState(470);
			match(TK_LEFT_PARENTHESES);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESERVED_WORD_F) | (1L << ID) | (1L << NUMBER) | (1L << REAL) | (1L << STRING) | (1L << TK_LEFT_BRACKET) | (1L << TK_LEFT_PARENTHESES) | (1L << TK_INCREMENT) | (1L << TK_DECREMENT) | (1L << TK_NOT) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_ADDRESS))) != 0)) {
				{
				setState(471);
				comma_expressions_params();
				}
			}

			setState(474);
			match(TK_RIGHT_PARENTHESES);
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

	public static class Concurrent_expressionContext extends ParserRuleContext {
		public Call_invocationContext call_invocation() {
			return getRuleContext(Call_invocationContext.class,0);
		}
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public TerminalNode TK_EXECUTE() { return getToken(MiLenguajeParser.TK_EXECUTE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Concurrent_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConcurrent_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConcurrent_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitConcurrent_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_expressionContext concurrent_expression() throws RecognitionException {
		Concurrent_expressionContext _localctx = new Concurrent_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_concurrent_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__28);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LEFT_PARENTHESES) {
				{
				setState(477);
				match(TK_LEFT_PARENTHESES);
				setState(478);
				quantifier();
				setState(479);
				match(T__29);
				setState(480);
				match(ID);
				setState(481);
				match(TK_RIGHT_PARENTHESES);
				}
			}

			setState(485);
			call_invocation();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXECUTE) {
				{
				setState(486);
				match(TK_EXECUTE);
				setState(487);
				block();
				}
			}

			setState(490);
			match(T__30);
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

	public static class Call_invocationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public AssignsContext assigns() {
			return getRuleContext(AssignsContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Call_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCall_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCall_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCall_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_invocationContext call_invocation() throws RecognitionException {
		Call_invocationContext _localctx = new Call_invocationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_call_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(492);
				match(T__26);
				}
			}

			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(495);
				match(ID);
				setState(496);
				assigns();
				setState(502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(497);
					binary_expression();
					}
					break;
				case 2:
					{
					setState(500);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(498);
						match(ID);
						}
						break;
					case TK_LEFT_BRACKET:
						{
						setState(499);
						array();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(504);
				function_();
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

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(ID);
			setState(508);
			match(TK_COLON);
			setState(509);
			binary_expression();
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

	public static class SequentialContext extends ParserRuleContext {
		public SequentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequential; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSequential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSequential(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSequential(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequentialContext sequential() throws RecognitionException {
		SequentialContext _localctx = new SequentialContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sequential);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(T__31);
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

	public static class Operation_serviceContext extends ParserRuleContext {
		public Operation_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOperation_service(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOperation_service(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOperation_service(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation_serviceContext operation_service() throws RecognitionException {
		Operation_serviceContext _localctx = new Operation_serviceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operation_service);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(T__32);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode TK_SEMI_COLON() { return getToken(MiLenguajeParser.TK_SEMI_COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			assign();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_SEMI_COLON) {
				{
				setState(516);
				match(TK_SEMI_COLON);
				}
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

	public static class AssignContext extends ParserRuleContext {
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public TerminalNode TK_SWAP() { return getToken(MiLenguajeParser.TK_SWAP, 0); }
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public AssignsContext assigns() {
			return getRuleContext(AssignsContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_assign);
		try {
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LEFT_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				array();
				setState(520);
				match(TK_SWAP);
				setState(523);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(521);
					match(ID);
					}
					break;
				case TK_LEFT_BRACKET:
					{
					setState(522);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(ID);
				setState(526);
				assigns();
				setState(532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(527);
					binary_expression();
					}
					break;
				case 2:
					{
					setState(530);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(528);
						match(ID);
						}
						break;
					case TK_LEFT_BRACKET:
						{
						setState(529);
						array();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
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

	public static class Binary_expressionContext extends ParserRuleContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBinary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_binary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			or_expression();
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

	public static class Or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> TK_OR() { return getTokens(MiLenguajeParser.TK_OR); }
		public TerminalNode TK_OR(int i) {
			return getToken(MiLenguajeParser.TK_OR, i);
		}
		public List<TerminalNode> TK_XOR() { return getTokens(MiLenguajeParser.TK_XOR); }
		public TerminalNode TK_XOR(int i) {
			return getToken(MiLenguajeParser.TK_XOR, i);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			and_expression();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_OR || _la==TK_XOR) {
				{
				{
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==TK_OR || _la==TK_XOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				and_expression();
				}
				}
				setState(545);
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

	public static class And_expressionContext extends ParserRuleContext {
		public List<Comp_expressionContext> comp_expression() {
			return getRuleContexts(Comp_expressionContext.class);
		}
		public Comp_expressionContext comp_expression(int i) {
			return getRuleContext(Comp_expressionContext.class,i);
		}
		public List<TerminalNode> TK_AND() { return getTokens(MiLenguajeParser.TK_AND); }
		public TerminalNode TK_AND(int i) {
			return getToken(MiLenguajeParser.TK_AND, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			comp_expression();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_AND) {
				{
				{
				setState(547);
				match(TK_AND);
				setState(548);
				comp_expression();
				}
				}
				setState(553);
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

	public static class Comp_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<CompsContext> comps() {
			return getRuleContexts(CompsContext.class);
		}
		public CompsContext comps(int i) {
			return getRuleContext(CompsContext.class,i);
		}
		public Comp_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterComp_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitComp_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitComp_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_expressionContext comp_expression() throws RecognitionException {
		Comp_expressionContext _localctx = new Comp_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_comp_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			shift_expression();
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(555);
					comps();
					setState(556);
					shift_expression();
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Simple_op_expressionContext> simple_op_expression() {
			return getRuleContexts(Simple_op_expressionContext.class);
		}
		public Simple_op_expressionContext simple_op_expression(int i) {
			return getRuleContext(Simple_op_expressionContext.class,i);
		}
		public List<TerminalNode> TK_LEFT_SHIFT() { return getTokens(MiLenguajeParser.TK_LEFT_SHIFT); }
		public TerminalNode TK_LEFT_SHIFT(int i) {
			return getToken(MiLenguajeParser.TK_LEFT_SHIFT, i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			simple_op_expression();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_LEFT_SHIFT) {
				{
				{
				setState(564);
				_la = _input.LA(1);
				if ( !(_la==TK_LEFT_SHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(565);
				simple_op_expression();
				}
				}
				setState(570);
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

	public static class Simple_op_expressionContext extends ParserRuleContext {
		public List<Other_op_expressionContext> other_op_expression() {
			return getRuleContexts(Other_op_expressionContext.class);
		}
		public Other_op_expressionContext other_op_expression(int i) {
			return getRuleContext(Other_op_expressionContext.class,i);
		}
		public List<Simple_opContext> simple_op() {
			return getRuleContexts(Simple_opContext.class);
		}
		public Simple_opContext simple_op(int i) {
			return getRuleContext(Simple_opContext.class,i);
		}
		public Simple_op_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_op_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSimple_op_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSimple_op_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSimple_op_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_op_expressionContext simple_op_expression() throws RecognitionException {
		Simple_op_expressionContext _localctx = new Simple_op_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_simple_op_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			other_op_expression();
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(572);
					simple_op();
					setState(573);
					other_op_expression();
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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

	public static class Other_op_expressionContext extends ParserRuleContext {
		public List<Exponentiation_expressionContext> exponentiation_expression() {
			return getRuleContexts(Exponentiation_expressionContext.class);
		}
		public Exponentiation_expressionContext exponentiation_expression(int i) {
			return getRuleContext(Exponentiation_expressionContext.class,i);
		}
		public List<Other_opContext> other_op() {
			return getRuleContexts(Other_opContext.class);
		}
		public Other_opContext other_op(int i) {
			return getRuleContext(Other_opContext.class,i);
		}
		public Other_op_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_op_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOther_op_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOther_op_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOther_op_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_op_expressionContext other_op_expression() throws RecognitionException {
		Other_op_expressionContext _localctx = new Other_op_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_other_op_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			exponentiation_expression();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TK_MULTIPLICATION - 66)) | (1L << (TK_DIVISION - 66)) | (1L << (TK_REMAINDER - 66)) | (1L << (TK_MODULUS - 66)))) != 0)) {
				{
				{
				setState(581);
				other_op();
				setState(582);
				exponentiation_expression();
				}
				}
				setState(588);
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

	public static class Exponentiation_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<TerminalNode> TK_EXPONENTIATION() { return getTokens(MiLenguajeParser.TK_EXPONENTIATION); }
		public TerminalNode TK_EXPONENTIATION(int i) {
			return getToken(MiLenguajeParser.TK_EXPONENTIATION, i);
		}
		public Exponentiation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentiation_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExponentiation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExponentiation_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExponentiation_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exponentiation_expressionContext exponentiation_expression() throws RecognitionException {
		Exponentiation_expressionContext _localctx = new Exponentiation_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_exponentiation_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(589);
					unary_expression();
					setState(590);
					match(TK_EXPONENTIATION);
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(597);
			unary_expression();
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Post_opContext post_op() {
			return getRuleContext(Post_opContext.class,0);
		}
		public Pre_opContext pre_op() {
			return getRuleContext(Pre_opContext.class,0);
		}
		public Single_exprContext single_expr() {
			return getRuleContext(Single_exprContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unary_expression);
		try {
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				post_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				pre_op();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				single_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				function_();
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

	public static class Post_opContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode REAL() { return getToken(MiLenguajeParser.REAL, 0); }
		public TerminalNode TK_INCREMENT() { return getToken(MiLenguajeParser.TK_INCREMENT, 0); }
		public TerminalNode TK_DECREMENT() { return getToken(MiLenguajeParser.TK_DECREMENT, 0); }
		public TerminalNode TK_POINTER() { return getToken(MiLenguajeParser.TK_POINTER, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MiLenguajeParser.STRING, 0); }
		public List<Subscript_sliceContext> subscript_slice() {
			return getRuleContexts(Subscript_sliceContext.class);
		}
		public Subscript_sliceContext subscript_slice(int i) {
			return getRuleContext(Subscript_sliceContext.class,i);
		}
		public Post_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPost_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPost_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPost_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Post_opContext post_op() throws RecognitionException {
		Post_opContext _localctx = new Post_opContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_post_op);
		int _la;
		try {
			int _alt;
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==REAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(606);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENT || _la==TK_DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(607);
				match(ID);
				}
				setState(608);
				match(TK_POINTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_LEFT_BRACKET:
					{
					setState(609);
					array();
					}
					break;
				case STRING:
					{
					setState(610);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(613);
						subscript_slice();
						}
						} 
					}
					setState(618);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
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

	public static class Pre_opContext extends ParserRuleContext {
		public TerminalNode TK_NOT() { return getToken(MiLenguajeParser.TK_NOT, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiLenguajeParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(MiLenguajeParser.INT, 0); }
		public Sign_changeContext sign_change() {
			return getRuleContext(Sign_changeContext.class,0);
		}
		public TerminalNode REAL() { return getToken(MiLenguajeParser.REAL, 0); }
		public TerminalNode TK_INCREMENT() { return getToken(MiLenguajeParser.TK_INCREMENT, 0); }
		public TerminalNode TK_DECREMENT() { return getToken(MiLenguajeParser.TK_DECREMENT, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_ADDRESS() { return getToken(MiLenguajeParser.TK_ADDRESS, 0); }
		public Pre_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPre_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPre_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPre_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_opContext pre_op() throws RecognitionException {
		Pre_opContext _localctx = new Pre_opContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_pre_op);
		int _la;
		try {
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(TK_NOT);
				setState(622);
				_la = _input.LA(1);
				if ( !(_la==BOOLEAN || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TK_PLUS:
			case TK_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				sign_change();
				setState(624);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==REAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TK_INCREMENT:
			case TK_DECREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENT || _la==TK_DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(627);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << REAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TK_ADDRESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
				match(TK_ADDRESS);
				setState(629);
				match(ID);
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

	public static class Single_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(MiLenguajeParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(MiLenguajeParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public Single_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSingle_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSingle_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSingle_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_exprContext single_expr() throws RecognitionException {
		Single_exprContext _localctx = new Single_exprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_single_expr);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				match(STRING);
				}
				break;
			case TK_LEFT_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(635);
				array();
				}
				break;
			case TK_LEFT_PARENTHESES:
				enterOuterAlt(_localctx, 5);
				{
				setState(636);
				grouping();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode TK_LEFT_BRACKET() { return getToken(MiLenguajeParser.TK_LEFT_BRACKET, 0); }
		public TerminalNode TK_RIGHT_BRACKET() { return getToken(MiLenguajeParser.TK_RIGHT_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(MiLenguajeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MiLenguajeParser.NUMBER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(MiLenguajeParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MiLenguajeParser.STRING, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(MiLenguajeParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(MiLenguajeParser.BOOLEAN, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(MiLenguajeParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(MiLenguajeParser.TK_COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(TK_LEFT_BRACKET);
			setState(640);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(641);
				match(TK_COMMA);
				setState(642);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(648);
			match(TK_RIGHT_BRACKET);
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

	public static class Subscript_sliceContext extends ParserRuleContext {
		public TerminalNode TK_LEFT_BRACKET() { return getToken(MiLenguajeParser.TK_LEFT_BRACKET, 0); }
		public TerminalNode TK_RIGHT_BRACKET() { return getToken(MiLenguajeParser.TK_RIGHT_BRACKET, 0); }
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public List<SliceContext> slice() {
			return getRuleContexts(SliceContext.class);
		}
		public SliceContext slice(int i) {
			return getRuleContext(SliceContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(MiLenguajeParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(MiLenguajeParser.TK_COMMA, i);
		}
		public Subscript_sliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSubscript_slice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSubscript_slice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSubscript_slice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_sliceContext subscript_slice() throws RecognitionException {
		Subscript_sliceContext _localctx = new Subscript_sliceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_subscript_slice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(TK_LEFT_BRACKET);
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(651);
				subscript();
				}
				break;
			case 2:
				{
				setState(652);
				slice();
				}
				break;
			}
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(655);
				match(TK_COMMA);
				setState(658);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(656);
					subscript();
					}
					break;
				case 2:
					{
					setState(657);
					slice();
					}
					break;
				}
				}
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			match(TK_RIGHT_BRACKET);
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

	public static class SliceContext extends ParserRuleContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public TerminalNode TK_MULTIPLICATION() { return getToken(MiLenguajeParser.TK_MULTIPLICATION, 0); }
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSlice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_slice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			subscript();
			setState(668);
			match(TK_COLON);
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INT:
				{
				setState(669);
				subscript();
				}
				break;
			case TK_MULTIPLICATION:
				{
				setState(670);
				match(TK_MULTIPLICATION);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SubscriptContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode INT() { return getToken(MiLenguajeParser.INT, 0); }
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_subscript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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

	public static class GroupingContext extends ParserRuleContext {
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public GroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterGrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitGrouping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitGrouping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingContext grouping() throws RecognitionException {
		GroupingContext _localctx = new GroupingContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_grouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(TK_LEFT_PARENTHESES);
			setState(676);
			binary_expression();
			setState(677);
			match(TK_RIGHT_PARENTHESES);
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

	public static class Sign_changeContext extends ParserRuleContext {
		public TerminalNode TK_PLUS() { return getToken(MiLenguajeParser.TK_PLUS, 0); }
		public TerminalNode TK_MINUS() { return getToken(MiLenguajeParser.TK_MINUS, 0); }
		public Sign_changeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign_change; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSign_change(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSign_change(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSign_change(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sign_changeContext sign_change() throws RecognitionException {
		Sign_changeContext _localctx = new Sign_changeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_sign_change);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_la = _input.LA(1);
			if ( !(_la==TK_PLUS || _la==TK_MINUS) ) {
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

	public static class AssignsContext extends ParserRuleContext {
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public TerminalNode TK_INCREMENT_ASSIGN() { return getToken(MiLenguajeParser.TK_INCREMENT_ASSIGN, 0); }
		public TerminalNode TK_DECREMENT_ASSIGN() { return getToken(MiLenguajeParser.TK_DECREMENT_ASSIGN, 0); }
		public TerminalNode TK_MULTIPLICATION_ASSIGN() { return getToken(MiLenguajeParser.TK_MULTIPLICATION_ASSIGN, 0); }
		public TerminalNode TK_DIVISION_ASSIGN() { return getToken(MiLenguajeParser.TK_DIVISION_ASSIGN, 0); }
		public TerminalNode TK_REMAINDER_ASSIGN() { return getToken(MiLenguajeParser.TK_REMAINDER_ASSIGN, 0); }
		public TerminalNode TK_EXPONENTIATION_ASSIGN() { return getToken(MiLenguajeParser.TK_EXPONENTIATION_ASSIGN, 0); }
		public TerminalNode TK_OR_ASSIGN() { return getToken(MiLenguajeParser.TK_OR_ASSIGN, 0); }
		public TerminalNode TK_AND_ASSIGN() { return getToken(MiLenguajeParser.TK_AND_ASSIGN, 0); }
		public TerminalNode TK_CONCAT_ASSIGN() { return getToken(MiLenguajeParser.TK_CONCAT_ASSIGN, 0); }
		public TerminalNode TK_LEFT_SHIFT_ASSIGN() { return getToken(MiLenguajeParser.TK_LEFT_SHIFT_ASSIGN, 0); }
		public TerminalNode TK_RIGHT_SHIFT_ASSIGN() { return getToken(MiLenguajeParser.TK_RIGHT_SHIFT_ASSIGN, 0); }
		public AssignsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterAssigns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitAssigns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitAssigns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignsContext assigns() throws RecognitionException {
		AssignsContext _localctx = new AssignsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_assigns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (TK_ASSIGN - 82)) | (1L << (TK_INCREMENT_ASSIGN - 82)) | (1L << (TK_DECREMENT_ASSIGN - 82)) | (1L << (TK_MULTIPLICATION_ASSIGN - 82)) | (1L << (TK_DIVISION_ASSIGN - 82)) | (1L << (TK_REMAINDER_ASSIGN - 82)) | (1L << (TK_EXPONENTIATION_ASSIGN - 82)) | (1L << (TK_OR_ASSIGN - 82)) | (1L << (TK_AND_ASSIGN - 82)) | (1L << (TK_CONCAT_ASSIGN - 82)) | (1L << (TK_LEFT_SHIFT_ASSIGN - 82)) | (1L << (TK_RIGHT_SHIFT_ASSIGN - 82)))) != 0)) ) {
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

	public static class CompsContext extends ParserRuleContext {
		public TerminalNode TK_EQUAL() { return getToken(MiLenguajeParser.TK_EQUAL, 0); }
		public TerminalNode TK_NOT_EQUAL() { return getToken(MiLenguajeParser.TK_NOT_EQUAL, 0); }
		public TerminalNode TK_GREATER() { return getToken(MiLenguajeParser.TK_GREATER, 0); }
		public TerminalNode TK_GREATER_EQUAL() { return getToken(MiLenguajeParser.TK_GREATER_EQUAL, 0); }
		public TerminalNode TK_lESS() { return getToken(MiLenguajeParser.TK_lESS, 0); }
		public TerminalNode TK_LESS_EQUAL() { return getToken(MiLenguajeParser.TK_LESS_EQUAL, 0); }
		public CompsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterComps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitComps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitComps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompsContext comps() throws RecognitionException {
		CompsContext _localctx = new CompsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_comps);
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESERVED_WORD_F:
			case ID:
			case NUMBER:
			case REAL:
			case STRING:
			case TK_LEFT_BRACKET:
			case TK_LEFT_PARENTHESES:
			case TK_INCREMENT:
			case TK_DECREMENT:
			case TK_NOT:
			case TK_PLUS:
			case TK_MINUS:
			case TK_ADDRESS:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(TK_EQUAL);
				}
				break;
			case TK_NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(685);
				match(TK_NOT_EQUAL);
				}
				break;
			case TK_GREATER:
				enterOuterAlt(_localctx, 4);
				{
				setState(686);
				match(TK_GREATER);
				}
				break;
			case TK_GREATER_EQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(687);
				match(TK_GREATER_EQUAL);
				}
				break;
			case TK_lESS:
				enterOuterAlt(_localctx, 6);
				{
				setState(688);
				match(TK_lESS);
				}
				break;
			case TK_LESS_EQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(689);
				match(TK_LESS_EQUAL);
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

	public static class Simple_opContext extends ParserRuleContext {
		public TerminalNode TK_CONTAT() { return getToken(MiLenguajeParser.TK_CONTAT, 0); }
		public TerminalNode TK_PLUS() { return getToken(MiLenguajeParser.TK_PLUS, 0); }
		public TerminalNode TK_MINUS() { return getToken(MiLenguajeParser.TK_MINUS, 0); }
		public Simple_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSimple_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSimple_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSimple_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_opContext simple_op() throws RecognitionException {
		Simple_opContext _localctx = new Simple_opContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_simple_op);
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(TK_CONTAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(694);
				match(TK_PLUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(695);
				match(TK_MINUS);
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

	public static class Other_opContext extends ParserRuleContext {
		public TerminalNode TK_REMAINDER() { return getToken(MiLenguajeParser.TK_REMAINDER, 0); }
		public TerminalNode TK_MODULUS() { return getToken(MiLenguajeParser.TK_MODULUS, 0); }
		public TerminalNode TK_DIVISION() { return getToken(MiLenguajeParser.TK_DIVISION, 0); }
		public TerminalNode TK_MULTIPLICATION() { return getToken(MiLenguajeParser.TK_MULTIPLICATION, 0); }
		public Other_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOther_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOther_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOther_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_opContext other_op() throws RecognitionException {
		Other_opContext _localctx = new Other_opContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_other_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TK_MULTIPLICATION - 66)) | (1L << (TK_DIVISION - 66)) | (1L << (TK_REMAINDER - 66)) | (1L << (TK_MODULUS - 66)))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u02bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\3\3\3\3\3\5\3\u0088"+
		"\n\3\3\4\3\4\3\4\3\4\7\4\u008e\n\4\f\4\16\4\u0091\13\4\3\4\3\4\3\5\5\5"+
		"\u0096\n\5\3\5\3\5\3\5\3\5\5\5\u009c\n\5\3\5\5\5\u009f\n\5\3\5\3\5\5\5"+
		"\u00a3\n\5\3\6\3\6\3\6\3\6\5\6\u00a9\n\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7\u00b1"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u00b7\n\7\3\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c9\n\b\f\b\16\b\u00cc"+
		"\13\b\3\t\3\t\3\t\3\t\7\t\u00d2\n\t\f\t\16\t\u00d5\13\t\3\t\5\t\u00d8"+
		"\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e3\n\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ef\n\f\3\r\5\r\u00f2\n\r\3"+
		"\r\3\r\3\r\5\r\u00f7\n\r\3\r\7\r\u00fa\n\r\f\r\16\r\u00fd\13\r\3\16\3"+
		"\16\3\16\3\16\5\16\u0103\n\16\3\16\3\16\5\16\u0107\n\16\3\16\5\16\u010a"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0111\n\17\3\20\3\20\5\20\u0115\n"+
		"\20\3\20\3\20\3\20\5\20\u011a\n\20\3\21\3\21\3\21\3\21\5\21\u0120\n\21"+
		"\3\21\5\21\u0123\n\21\3\21\3\21\5\21\u0127\n\21\3\21\3\21\3\21\3\22\5"+
		"\22\u012d\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u0136\n\23\f\23"+
		"\16\23\u0139\13\23\3\24\3\24\3\24\3\24\7\24\u013f\n\24\f\24\16\24\u0142"+
		"\13\24\3\25\3\25\7\25\u0146\n\25\f\25\16\25\u0149\13\25\3\25\3\25\3\25"+
		"\7\25\u014e\n\25\f\25\16\25\u0151\13\25\7\25\u0153\n\25\f\25\16\25\u0156"+
		"\13\25\3\26\3\26\7\26\u015a\n\26\f\26\16\26\u015d\13\26\3\26\5\26\u0160"+
		"\n\26\3\26\3\26\3\26\7\26\u0165\n\26\f\26\16\26\u0168\13\26\3\26\5\26"+
		"\u016b\n\26\7\26\u016d\n\26\f\26\16\26\u0170\13\26\3\27\3\27\3\27\7\27"+
		"\u0175\n\27\f\27\16\27\u0178\13\27\3\30\3\30\3\30\7\30\u017d\n\30\f\30"+
		"\16\30\u0180\13\30\3\30\7\30\u0183\n\30\f\30\16\30\u0186\13\30\3\30\3"+
		"\30\3\30\3\30\3\30\5\30\u018d\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0196\n\32\5\32\u0198\n\32\3\32\5\32\u019b\n\32\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u01a2\n\33\5\33\u01a4\n\33\3\33\5\33\u01a7\n\33\3\34\3\34"+
		"\3\34\5\34\u01ac\n\34\5\34\u01ae\n\34\3\34\3\34\3\34\3\34\3\35\3\35\5"+
		"\35\u01b6\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01be\n\36\3\36\3\36"+
		"\3\36\5\36\u01c3\n\36\3\37\3\37\3\37\3 \3 \3 \5 \u01cb\n \3!\5!\u01ce"+
		"\n!\3!\3!\3!\5!\u01d3\n!\3!\3!\3\"\3\"\3\"\3\"\5\"\u01db\n\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\5#\u01e6\n#\3#\3#\3#\5#\u01eb\n#\3#\3#\3$\5$\u01f0"+
		"\n$\3$\3$\3$\3$\3$\5$\u01f7\n$\5$\u01f9\n$\3$\5$\u01fc\n$\3%\3%\3%\3%"+
		"\3&\3&\3\'\3\'\3(\3(\5(\u0208\n(\3)\3)\3)\3)\5)\u020e\n)\3)\3)\3)\3)\3"+
		")\5)\u0215\n)\5)\u0217\n)\5)\u0219\n)\3*\3*\3+\3+\3+\7+\u0220\n+\f+\16"+
		"+\u0223\13+\3,\3,\3,\7,\u0228\n,\f,\16,\u022b\13,\3-\3-\3-\3-\7-\u0231"+
		"\n-\f-\16-\u0234\13-\3.\3.\3.\7.\u0239\n.\f.\16.\u023c\13.\3/\3/\3/\3"+
		"/\7/\u0242\n/\f/\16/\u0245\13/\3\60\3\60\3\60\3\60\7\60\u024b\n\60\f\60"+
		"\16\60\u024e\13\60\3\61\3\61\3\61\7\61\u0253\n\61\f\61\16\61\u0256\13"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u025e\n\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\5\63\u0266\n\63\3\63\7\63\u0269\n\63\f\63\16\63\u026c\13\63"+
		"\5\63\u026e\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0279"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u0280\n\65\3\66\3\66\3\66\3\66\7\66"+
		"\u0286\n\66\f\66\16\66\u0289\13\66\3\66\3\66\3\67\3\67\3\67\5\67\u0290"+
		"\n\67\3\67\3\67\3\67\5\67\u0295\n\67\7\67\u0297\n\67\f\67\16\67\u029a"+
		"\13\67\3\67\3\67\38\38\38\38\58\u02a2\n8\39\39\3:\3:\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3=\3=\3=\3=\3=\5=\u02b5\n=\3>\3>\3>\3>\5>\u02bb\n>\3?\3?\3?\2"+
		"\2@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\17\3\2\26\31\3\2RS\3\2II\4\2%%++\3\2"+
		";<\4\2((**\3\2*+\4\2%%*+\5\2%%(),,\4\2%%**\3\2?@\4\2TTV`\3\2DG\2\u02f6"+
		"\2\u0081\3\2\2\2\4\u0087\3\2\2\2\6\u0089\3\2\2\2\b\u0095\3\2\2\2\n\u00a4"+
		"\3\2\2\2\f\u00b0\3\2\2\2\16\u00c2\3\2\2\2\20\u00cd\3\2\2\2\22\u00d9\3"+
		"\2\2\2\24\u00dc\3\2\2\2\26\u00e6\3\2\2\2\30\u00f1\3\2\2\2\32\u00fe\3\2"+
		"\2\2\34\u010b\3\2\2\2\36\u0112\3\2\2\2 \u011b\3\2\2\2\"\u012c\3\2\2\2"+
		"$\u0137\3\2\2\2&\u0140\3\2\2\2(\u0143\3\2\2\2*\u015f\3\2\2\2,\u0171\3"+
		"\2\2\2.\u0179\3\2\2\2\60\u018e\3\2\2\2\62\u0190\3\2\2\2\64\u019c\3\2\2"+
		"\2\66\u01ad\3\2\2\28\u01b5\3\2\2\2:\u01b7\3\2\2\2<\u01c4\3\2\2\2>\u01ca"+
		"\3\2\2\2@\u01cd\3\2\2\2B\u01d6\3\2\2\2D\u01de\3\2\2\2F\u01ef\3\2\2\2H"+
		"\u01fd\3\2\2\2J\u0201\3\2\2\2L\u0203\3\2\2\2N\u0205\3\2\2\2P\u0218\3\2"+
		"\2\2R\u021a\3\2\2\2T\u021c\3\2\2\2V\u0224\3\2\2\2X\u022c\3\2\2\2Z\u0235"+
		"\3\2\2\2\\\u023d\3\2\2\2^\u0246\3\2\2\2`\u0254\3\2\2\2b\u025d\3\2\2\2"+
		"d\u026d\3\2\2\2f\u0278\3\2\2\2h\u027f\3\2\2\2j\u0281\3\2\2\2l\u028c\3"+
		"\2\2\2n\u029d\3\2\2\2p\u02a3\3\2\2\2r\u02a5\3\2\2\2t\u02a9\3\2\2\2v\u02ab"+
		"\3\2\2\2x\u02b4\3\2\2\2z\u02ba\3\2\2\2|\u02bc\3\2\2\2~\u0080\5\4\3\2\177"+
		"~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\3\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0088\5\b\5\2\u0085\u0088\5\6\4\2"+
		"\u0086\u0088\5\n\6\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\5\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008f\7%\2\2\u008b"+
		"\u008e\5\22\n\2\u008c\u008e\5\24\13\2\u008d\u008b\3\2\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\4\2\2\u0093\7\3\2\2\2"+
		"\u0094\u0096\5\16\b\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\7\5\2\2\u0098\u009e\7%\2\2\u0099\u009b\7\62\2\2\u009a"+
		"\u009c\5,\27\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\7\63\2\2\u009e\u0099\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u00a3\7\6\2\2\u00a1\u00a3\5\f\7\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a1\3\2\2\2\u00a3\t\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6"+
		"\7%\2\2\u00a6\u00a8\7\62\2\2\u00a7\u00a9\5,\27\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\63\2\2\u00ab\u00ac\3"+
		"\2\2\2\u00ac\u00ad\5\f\7\2\u00ad\u00ae\7\4\2\2\u00ae\13\3\2\2\2\u00af"+
		"\u00b1\5$\23\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b6\3\2"+
		"\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00b5\7\4\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bb\3\2"+
		"\2\2\u00b8\u00ba\5 \21\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00bf\7\t\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\7\4\2\2\u00c1"+
		"\r\3\2\2\2\u00c2\u00c3\7\n\2\2\u00c3\u00ca\7%\2\2\u00c4\u00c9\5\20\t\2"+
		"\u00c5\u00c9\5\22\n\2\u00c6\u00c9\5\24\13\2\u00c7\u00c9\5\34\17\2\u00c8"+
		"\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\17\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\13\2\2\u00ce\u00d3\7%\2"+
		"\2\u00cf\u00d0\7:\2\2\u00d0\u00d2\7%\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d8\78\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\21\3\2\2\2\u00d9\u00da\7\f\2\2\u00da\u00db\5\62\32\2\u00db"+
		"\23\3\2\2\2\u00dc\u00dd\7\r\2\2\u00dd\u00de\7%\2\2\u00de\u00df\7K\2\2"+
		"\u00df\u00e0\7\16\2\2\u00e0\u00e2\7\62\2\2\u00e1\u00e3\5,\27\2\u00e2\u00e1"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\63\2\2"+
		"\u00e5\25\3\2\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00e8\7%\2\2\u00e8\u00e9"+
		"\7K\2\2\u00e9\u00ea\7\62\2\2\u00ea\u00eb\5\30\r\2\u00eb\u00ee\7\63\2\2"+
		"\u00ec\u00ed\7\20\2\2\u00ed\u00ef\5.\30\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\27\3\2\2\2\u00f0\u00f2\7\21\2\2\u00f1\u00f0\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00fb\5.\30\2\u00f4\u00f6\78"+
		"\2\2\u00f5\u00f7\7\21\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\5.\30\2\u00f9\u00f4\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\31\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u00ff\7\22\2\2\u00ff\u0100\5(\25\2\u0100\u0106\79\2\2\u0101"+
		"\u0103\7\23\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0104\u0107\7%\2\2\u0105\u0107\5\60\31\2\u0106\u0102\3\2\2\2\u0106"+
		"\u0105\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u010a\5\64\33\2\u0109\u0108\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a\33\3\2\2\2\u010b\u010c\7\24\2\2\u010c"+
		"\u0110\5(\25\2\u010d\u0111\5\36\20\2\u010e\u010f\79\2\2\u010f\u0111\7"+
		"%\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0111\35\3\2\2\2\u0112\u0114"+
		"\7\62\2\2\u0113\u0115\5,\27\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0119\7\63\2\2\u0117\u0118\7\20\2\2\u0118\u011a"+
		"\5.\30\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\37\3\2\2\2\u011b"+
		"\u011c\7\25\2\2\u011c\u0122\7%\2\2\u011d\u011f\7\62\2\2\u011e\u0120\5"+
		"(\25\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\7\63\2\2\u0122\u011d\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0126\3"+
		"\2\2\2\u0124\u0125\7\20\2\2\u0125\u0127\5.\30\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5\"\22\2\u0129\u012a\7"+
		"\4\2\2\u012a!\3\2\2\2\u012b\u012d\5$\23\2\u012c\u012b\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\5&\24\2\u012f#\3\2\2\2\u0130"+
		"\u0136\5\22\n\2\u0131\u0136\5\24\13\2\u0132\u0136\5\26\f\2\u0133\u0136"+
		"\5\32\16\2\u0134\u0136\5\34\17\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2\2"+
		"\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138%\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013f\5J&\2\u013b\u013f\5> \2\u013c\u013f\5L\'\2"+
		"\u013d\u013f\58\35\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\'\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0147\7%\2\2"+
		"\u0144\u0146\5l\67\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0154\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014b\7:\2\2\u014b\u014f\7%\2\2\u014c\u014e\5l\67\2\u014d\u014c\3\2\2"+
		"\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u014a\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155)\3\2\2\2\u0156\u0154\3\2\2\2"+
		"\u0157\u015b\7%\2\2\u0158\u015a\5l\67\2\u0159\u0158\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0160\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0160\5R*\2\u015f\u0157\3\2\2\2\u015f\u015e\3\2\2"+
		"\2\u0160\u016e\3\2\2\2\u0161\u016a\7:\2\2\u0162\u0166\7%\2\2\u0163\u0165"+
		"\5l\67\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u016b\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b\5R"+
		"*\2\u016a\u0162\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u0161\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f+\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0176\5.\30\2\u0172\u0173"+
		"\78\2\2\u0173\u0175\5.\30\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177-\3\2\2\2\u0178\u0176\3\2\2\2"+
		"\u0179\u017e\7%\2\2\u017a\u017b\7:\2\2\u017b\u017d\7%\2\2\u017c\u017a"+
		"\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0184\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\5l\67\2\u0182\u0181\3\2"+
		"\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018c\79\2\2\u0188\u018d\5\60"+
		"\31\2\u0189\u018a\7\23\2\2\u018a\u018d\7%\2\2\u018b\u018d\7%\2\2\u018c"+
		"\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018b\3\2\2\2\u018d/\3\2\2\2"+
		"\u018e\u018f\t\2\2\2\u018f\61\3\2\2\2\u0190\u0191\7%\2\2\u0191\u0197\7"+
		"K\2\2\u0192\u0198\5R*\2\u0193\u0196\7%\2\2\u0194\u0196\5j\66\2\u0195\u0193"+
		"\3\2\2\2\u0195\u0194\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0192\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u019b\78\2\2\u019a\u0199\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\63\3\2\2\2\u019c\u019d\7%\2\2\u019d\u01a3"+
		"\7T\2\2\u019e\u01a4\5R*\2\u019f\u01a2\7%\2\2\u01a0\u01a2\5j\66\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019e\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\78\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\65\3\2\2\2\u01a8\u01ae\7$\2\2"+
		"\u01a9\u01ab\7%\2\2\u01aa\u01ac\5l\67\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a8\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b0\7\62\2\2\u01b0\u01b1\5*\26\2\u01b1\u01b2\7"+
		"\63\2\2\u01b2\67\3\2\2\2\u01b3\u01b6\5:\36\2\u01b4\u01b6\5<\37\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b69\3\2\2\2\u01b7\u01b8\7%\2\2\u01b8"+
		"\u01b9\7T\2\2\u01b9\u01ba\7\32\2\2\u01ba\u01bb\7%\2\2\u01bb\u01bd\7\62"+
		"\2\2\u01bc\u01be\5*\26\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c2\7\63\2\2\u01c0\u01c1\7\33\2\2\u01c1\u01c3\7"+
		"%\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3;\3\2\2\2\u01c4\u01c5"+
		"\7\34\2\2\u01c5\u01c6\7%\2\2\u01c6=\3\2\2\2\u01c7\u01cb\5@!\2\u01c8\u01cb"+
		"\5B\"\2\u01c9\u01cb\5D#\2\u01ca\u01c7\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb?\3\2\2\2\u01cc\u01ce\7\35\2\2\u01cd\u01cc\3\2\2\2"+
		"\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\7%\2\2\u01d0\u01d2"+
		"\7\62\2\2\u01d1\u01d3\5*\26\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2"+
		"\u01d3\u01d4\3\2\2\2\u01d4\u01d5\7\63\2\2\u01d5A\3\2\2\2\u01d6\u01d7\7"+
		"\36\2\2\u01d7\u01d8\7%\2\2\u01d8\u01da\7\62\2\2\u01d9\u01db\5*\26\2\u01da"+
		"\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\7\63"+
		"\2\2\u01ddC\3\2\2\2\u01de\u01e5\7\37\2\2\u01df\u01e0\7\62\2\2\u01e0\u01e1"+
		"\5H%\2\u01e1\u01e2\7 \2\2\u01e2\u01e3\7%\2\2\u01e3\u01e4\7\63\2\2\u01e4"+
		"\u01e6\3\2\2\2\u01e5\u01df\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7\u01ea\5F$\2\u01e8\u01e9\7\66\2\2\u01e9\u01eb\5\"\22\2\u01ea"+
		"\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\7!"+
		"\2\2\u01edE\3\2\2\2\u01ee\u01f0\7\35\2\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01fb\3\2\2\2\u01f1\u01f2\7%\2\2\u01f2\u01f8\5v<\2\u01f3"+
		"\u01f9\5R*\2\u01f4\u01f7\7%\2\2\u01f5\u01f7\5j\66\2\u01f6\u01f4\3\2\2"+
		"\2\u01f6\u01f5\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f3\3\2\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01fc\5\66\34\2\u01fb\u01f1\3\2\2\2"+
		"\u01fb\u01fa\3\2\2\2\u01fcG\3\2\2\2\u01fd\u01fe\7%\2\2\u01fe\u01ff\79"+
		"\2\2\u01ff\u0200\5R*\2\u0200I\3\2\2\2\u0201\u0202\7\"\2\2\u0202K\3\2\2"+
		"\2\u0203\u0204\7#\2\2\u0204M\3\2\2\2\u0205\u0207\5P)\2\u0206\u0208\78"+
		"\2\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208O\3\2\2\2\u0209\u020a"+
		"\5j\66\2\u020a\u020d\7U\2\2\u020b\u020e\7%\2\2\u020c\u020e\5j\66\2\u020d"+
		"\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e\u0219\3\2\2\2\u020f\u0210\7%"+
		"\2\2\u0210\u0216\5v<\2\u0211\u0217\5R*\2\u0212\u0215\7%\2\2\u0213\u0215"+
		"\5j\66\2\u0214\u0212\3\2\2\2\u0214\u0213\3\2\2\2\u0215\u0217\3\2\2\2\u0216"+
		"\u0211\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0209\3\2"+
		"\2\2\u0218\u020f\3\2\2\2\u0219Q\3\2\2\2\u021a\u021b\5T+\2\u021bS\3\2\2"+
		"\2\u021c\u0221\5V,\2\u021d\u021e\t\3\2\2\u021e\u0220\5V,\2\u021f\u021d"+
		"\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"U\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0229\5X-\2\u0225\u0226\7Q\2\2\u0226"+
		"\u0228\5X-\2\u0227\u0225\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2"+
		"\2\u0229\u022a\3\2\2\2\u022aW\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u0232"+
		"\5Z.\2\u022d\u022e\5x=\2\u022e\u022f\5Z.\2\u022f\u0231\3\2\2\2\u0230\u022d"+
		"\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"Y\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u023a\5\\/\2\u0236\u0237\t\4\2\2\u0237"+
		"\u0239\5\\/\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2"+
		"\2\2\u023a\u023b\3\2\2\2\u023b[\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u0243"+
		"\5^\60\2\u023e\u023f\5z>\2\u023f\u0240\5^\60\2\u0240\u0242\3\2\2\2\u0241"+
		"\u023e\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244]\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u024c\5`\61\2\u0247\u0248"+
		"\5|?\2\u0248\u0249\5`\61\2\u0249\u024b\3\2\2\2\u024a\u0247\3\2\2\2\u024b"+
		"\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d_\3\2\2\2"+
		"\u024e\u024c\3\2\2\2\u024f\u0250\5b\62\2\u0250\u0251\7C\2\2\u0251\u0253"+
		"\3\2\2\2\u0252\u024f\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\5b"+
		"\62\2\u0258a\3\2\2\2\u0259\u025e\5d\63\2\u025a\u025e\5f\64\2\u025b\u025e"+
		"\5h\65\2\u025c\u025e\5\66\34\2\u025d\u0259\3\2\2\2\u025d\u025a\3\2\2\2"+
		"\u025d\u025b\3\2\2\2\u025d\u025c\3\2\2\2\u025ec\3\2\2\2\u025f\u0260\t"+
		"\5\2\2\u0260\u026e\t\6\2\2\u0261\u0262\7%\2\2\u0262\u026e\7=\2\2\u0263"+
		"\u0266\5j\66\2\u0264\u0266\7,\2\2\u0265\u0263\3\2\2\2\u0265\u0264\3\2"+
		"\2\2\u0266\u026a\3\2\2\2\u0267\u0269\5l\67\2\u0268\u0267\3\2\2\2\u0269"+
		"\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026e\3\2"+
		"\2\2\u026c\u026a\3\2\2\2\u026d\u025f\3\2\2\2\u026d\u0261\3\2\2\2\u026d"+
		"\u0265\3\2\2\2\u026ee\3\2\2\2\u026f\u0270\7>\2\2\u0270\u0279\t\7\2\2\u0271"+
		"\u0272\5t;\2\u0272\u0273\t\b\2\2\u0273\u0279\3\2\2\2\u0274\u0275\t\6\2"+
		"\2\u0275\u0279\t\t\2\2\u0276\u0277\7A\2\2\u0277\u0279\7%\2\2\u0278\u026f"+
		"\3\2\2\2\u0278\u0271\3\2\2\2\u0278\u0274\3\2\2\2\u0278\u0276\3\2\2\2\u0279"+
		"g\3\2\2\2\u027a\u0280\7%\2\2\u027b\u0280\7)\2\2\u027c\u0280\7,\2\2\u027d"+
		"\u0280\5j\66\2\u027e\u0280\5r:\2\u027f\u027a\3\2\2\2\u027f\u027b\3\2\2"+
		"\2\u027f\u027c\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u027e\3\2\2\2\u0280i"+
		"\3\2\2\2\u0281\u0282\7\60\2\2\u0282\u0287\t\n\2\2\u0283\u0284\7:\2\2\u0284"+
		"\u0286\t\n\2\2\u0285\u0283\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2"+
		"\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0287\3\2\2\2\u028a"+
		"\u028b\7\61\2\2\u028bk\3\2\2\2\u028c\u028f\7\60\2\2\u028d\u0290\5p9\2"+
		"\u028e\u0290\5n8\2\u028f\u028d\3\2\2\2\u028f\u028e\3\2\2\2\u0290\u0298"+
		"\3\2\2\2\u0291\u0294\7:\2\2\u0292\u0295\5p9\2\u0293\u0295\5n8\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0291\3\2"+
		"\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029c\7\61\2\2\u029cm\3\2\2\2"+
		"\u029d\u029e\5p9\2\u029e\u02a1\79\2\2\u029f\u02a2\5p9\2\u02a0\u02a2\7"+
		"D\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2o\3\2\2\2\u02a3\u02a4"+
		"\t\13\2\2\u02a4q\3\2\2\2\u02a5\u02a6\7\62\2\2\u02a6\u02a7\5R*\2\u02a7"+
		"\u02a8\7\63\2\2\u02a8s\3\2\2\2\u02a9\u02aa\t\f\2\2\u02aau\3\2\2\2\u02ab"+
		"\u02ac\t\r\2\2\u02acw\3\2\2\2\u02ad\u02b5\3\2\2\2\u02ae\u02b5\7K\2\2\u02af"+
		"\u02b5\7L\2\2\u02b0\u02b5\7M\2\2\u02b1\u02b5\7O\2\2\u02b2\u02b5\7N\2\2"+
		"\u02b3\u02b5\7P\2\2\u02b4\u02ad\3\2\2\2\u02b4\u02ae\3\2\2\2\u02b4\u02af"+
		"\3\2\2\2\u02b4\u02b0\3\2\2\2\u02b4\u02b1\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4"+
		"\u02b3\3\2\2\2\u02b5y\3\2\2\2\u02b6\u02bb\3\2\2\2\u02b7\u02bb\7H\2\2\u02b8"+
		"\u02bb\7?\2\2\u02b9\u02bb\7@\2\2\u02ba\u02b6\3\2\2\2\u02ba\u02b7\3\2\2"+
		"\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb{\3\2\2\2\u02bc\u02bd"+
		"\t\16\2\2\u02bd}\3\2\2\2_\u0081\u0087\u008d\u008f\u0095\u009b\u009e\u00a2"+
		"\u00a8\u00b0\u00b6\u00bb\u00c8\u00ca\u00d3\u00d7\u00e2\u00ee\u00f1\u00f6"+
		"\u00fb\u0102\u0106\u0109\u0110\u0114\u0119\u011f\u0122\u0126\u012c\u0135"+
		"\u0137\u013e\u0140\u0147\u014f\u0154\u015b\u015f\u0166\u016a\u016e\u0176"+
		"\u017e\u0184\u018c\u0195\u0197\u019a\u01a1\u01a3\u01a6\u01ab\u01ad\u01b5"+
		"\u01bd\u01c2\u01ca\u01cd\u01d2\u01da\u01e5\u01ea\u01ef\u01f6\u01f8\u01fb"+
		"\u0207\u020d\u0214\u0216\u0218\u0221\u0229\u0232\u023a\u0243\u024c\u0254"+
		"\u025d\u0265\u026a\u026d\u0278\u027f\u0287\u028f\u0294\u0298\u02a1\u02b4"+
		"\u02ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}