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
		T__17=18, T__18=19, RESERVED_WORDS=20, ID=21, IDENTIFIER=22, IDENTIFIER_PTR=23, 
		BOOLEAN=24, NUMBER=25, INT=26, REAL=27, STRING=28, ID_LETTER=29, DIGIT=30, 
		TK_SEPARA=31, TK_LEFT_BRACKET=32, TK_RIGHT_BRACKET=33, TK_LEFT_PARENTHESES=34, 
		TK_RIGHT_PARENTHESES=35, TK_LEFT_BRACE=36, TK_RIGHT_BRACE=37, TK_EXECUTE=38, 
		TK_DOT=39, TK_SEMI_COLON=40, TK_COLON=41, TK_INCREMENT=42, TK_DECREMENT=43, 
		TK_POINTER=44, TK_NOT=45, TK_PLUS=46, TK_MINUS=47, TK_ADDRESS=48, TK_N_INVOCATIONS=49, 
		TK_EXPONENTIATION=50, TK_MULTIPLICATION=51, TK_DIVISION=52, TK_REMAINDER=53, 
		TK_MODULUS=54, TK_CONTAT=55, TK_LEFT_SHIFT=56, TK_RIGHT_SHIFT=57, TK_EQUAL=58, 
		TK_NOT_EQUAL=59, TK_GREATER=60, TK_lESS=61, TK_GREATER_EQUAL=62, TK_LESS_EQUAL=63, 
		TK_AND=64, TK_OR=65, TK_XOR=66, TK_ASSIGN=67, TK_SWAP=68, TK_INCREMENT_ASSIGN=69, 
		TK_DECREMENT_ASSIGN=70, TK_MULTIPLICATION_ASSIGN=71, TK_DIVISION_ASSIGN=72, 
		TK_REMAINDER_ASSIGN=73, TK_EXPONENTIATION_ASSIGN=74, TK_OR_ASSIGN=75, 
		TK_AND_ASSIGN=76, TK_CONCAT_ASSIGN=77, TK_LEFT_SHIFT_ASSIGN=78, TK_RIGHT_SHIFT_ASSIGN=79, 
		SPACES=80, LINE_COMMENT=81;
	public static final int
		RULE_start = 0, RULE_global = 1, RULE_resource = 2, RULE_resource_body = 3, 
		RULE_spec = 4, RULE_import_ = 5, RULE_const = 6, RULE_type = 7, RULE_optype = 8, 
		RULE_var = 9, RULE_operation = 10, RULE_operation_one = 11, RULE_proc = 12, 
		RULE_block = 13, RULE_statements = 14, RULE_declarations = 15, RULE_params = 16, 
		RULE_param = 17, RULE_data_type = 18, RULE_assign_expression = 19, RULE_expression = 20, 
		RULE_assign = 21, RULE_binary_expression = 22, RULE_or_expression = 23, 
		RULE_and_expression = 24, RULE_comp_expression = 25, RULE_shift_expression = 26, 
		RULE_simple_op_expression = 27, RULE_other_op_expression = 28, RULE_exponentiation_expression = 29, 
		RULE_unary_expression = 30, RULE_post_op = 31, RULE_pre_op = 32, RULE_single_expr = 33, 
		RULE_array = 34, RULE_subscript_slice = 35, RULE_slice = 36, RULE_subscript = 37, 
		RULE_grouping = 38, RULE_sign_change = 39, RULE_assigns = 40, RULE_comps = 41, 
		RULE_simple_op = 42, RULE_other_op = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "global", "resource", "resource_body", "spec", "import_", "const", 
			"type", "optype", "var", "operation", "operation_one", "proc", "block", 
			"statements", "declarations", "params", "param", "data_type", "assign_expression", 
			"expression", "assign", "binary_expression", "or_expression", "and_expression", 
			"comp_expression", "shift_expression", "simple_op_expression", "other_op_expression", 
			"exponentiation_expression", "unary_expression", "post_op", "pre_op", 
			"single_expr", "array", "subscript_slice", "slice", "subscript", "grouping", 
			"sign_change", "assigns", "comps", "simple_op", "other_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'global'", "'end'", "'resource'", "'separate'", "'body'", "'spec'", 
			"'import'", "','", "'const'", "'type'", "'rec'", "'optype'", "'res'", 
			"'returns'", "'var'", "'op'", "'proc'", "'JA'", "'cap'", null, null, 
			null, null, null, null, null, null, null, null, null, "'[]'", "'['", 
			"']'", "'('", "')'", "'{'", "'}'", "'->'", "'.'", "';'", "':'", "'++'", 
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
			null, null, null, null, null, null, null, null, "RESERVED_WORDS", "ID", 
			"IDENTIFIER", "IDENTIFIER_PTR", "BOOLEAN", "NUMBER", "INT", "REAL", "STRING", 
			"ID_LETTER", "DIGIT", "TK_SEPARA", "TK_LEFT_BRACKET", "TK_RIGHT_BRACKET", 
			"TK_LEFT_PARENTHESES", "TK_RIGHT_PARENTHESES", "TK_LEFT_BRACE", "TK_RIGHT_BRACE", 
			"TK_EXECUTE", "TK_DOT", "TK_SEMI_COLON", "TK_COLON", "TK_INCREMENT", 
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
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
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
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__5:
					{
					setState(88);
					resource();
					}
					break;
				case T__0:
					{
					setState(89);
					global();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5))) != 0) );
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
		public List<ConstContext> const() {
			return getRuleContexts(ConstContext.class);
		}
		public ConstContext const(int i) {
			return getRuleContext(ConstContext.class,i);
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
		enterRule(_localctx, 2, RULE_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__0);
			setState(95);
			match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(96);
					const();
					}
					break;
				case T__9:
					{
					setState(97);
					type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
		public List<TerminalNode> TK_LEFT_PARENTHESES() { return getTokens(MiLenguajeParser.TK_LEFT_PARENTHESES); }
		public TerminalNode TK_LEFT_PARENTHESES(int i) {
			return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, i);
		}
		public List<TerminalNode> TK_RIGHT_PARENTHESES() { return getTokens(MiLenguajeParser.TK_RIGHT_PARENTHESES); }
		public TerminalNode TK_RIGHT_PARENTHESES(int i) {
			return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, i);
		}
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
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
		enterRule(_localctx, 4, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(105);
				spec();
				}
			}

			setState(108);
			match(T__2);
			setState(109);
			match(ID);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LEFT_PARENTHESES) {
				{
				setState(110);
				match(TK_LEFT_PARENTHESES);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(111);
					params();
					}
				}

				setState(114);
				match(TK_RIGHT_PARENTHESES);
				}
			}

			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(117);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(118);
				match(T__4);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_LEFT_PARENTHESES) {
					{
					setState(119);
					match(TK_LEFT_PARENTHESES);
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(120);
						params();
						}
					}

					setState(123);
					match(TK_RIGHT_PARENTHESES);
					}
				}

				setState(126);
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

	public static class Resource_bodyContext extends ParserRuleContext {
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
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
		enterRule(_localctx, 6, RULE_resource_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(129);
					type();
					}
					break;
				case T__11:
					{
					setState(130);
					optype();
					}
					break;
				case T__15:
					{
					setState(131);
					operation();
					}
					break;
				case T__14:
					{
					setState(132);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(137);
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

	public static class SpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public List<Import_Context> import_() {
			return getRuleContexts(Import_Context.class);
		}
		public Import_Context import_(int i) {
			return getRuleContext(Import_Context.class,i);
		}
		public List<ConstContext> const() {
			return getRuleContexts(ConstContext.class);
		}
		public ConstContext const(int i) {
			return getRuleContext(ConstContext.class,i);
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
		enterRule(_localctx, 8, RULE_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__5);
			setState(139);
			match(ID);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__15))) != 0)) {
				{
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(140);
					import_();
					}
					break;
				case T__8:
					{
					setState(141);
					const();
					}
					break;
				case T__9:
					{
					setState(142);
					type();
					}
					break;
				case T__15:
					{
					setState(143);
					operation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(148);
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
		enterRule(_localctx, 10, RULE_import_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__6);
			setState(150);
			match(ID);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(151);
				match(T__7);
				setState(152);
				match(ID);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_SEMI_COLON) {
				{
				setState(158);
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

	public static class ConstContext extends ParserRuleContext {
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__8);
			setState(162);
			assign_expression();
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
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
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
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__9);
			setState(165);
			match(ID);
			setState(166);
			match(TK_ASSIGN);
			setState(167);
			match(T__10);
			setState(168);
			match(TK_LEFT_PARENTHESES);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(169);
				params();
				}
			}

			setState(172);
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
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
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
		enterRule(_localctx, 16, RULE_optype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__11);
			setState(175);
			match(ID);
			setState(176);
			match(TK_ASSIGN);
			setState(177);
			match(TK_LEFT_PARENTHESES);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(178);
				params();
				}
				break;
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(181);
				match(T__12);
				setState(182);
				param();
				}
			}

			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(185);
				params();
				}
			}

			setState(188);
			match(TK_RIGHT_PARENTHESES);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(189);
				match(T__13);
				setState(190);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public List<Subscript_sliceContext> subscript_slice() {
			return getRuleContexts(Subscript_sliceContext.class);
		}
		public Subscript_sliceContext subscript_slice(int i) {
			return getRuleContext(Subscript_sliceContext.class,i);
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
		enterRule(_localctx, 18, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__14);
			setState(194);
			match(ID);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_LEFT_BRACKET) {
				{
				{
				setState(195);
				subscript_slice();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(TK_COLON);
			setState(202);
			type();
			setState(203);
			assign_expression();
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
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public Operation_oneContext operation_one() {
			return getRuleContext(Operation_oneContext.class,0);
		}
		public List<Subscript_sliceContext> subscript_slice() {
			return getRuleContexts(Subscript_sliceContext.class);
		}
		public Subscript_sliceContext subscript_slice(int i) {
			return getRuleContext(Subscript_sliceContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__15);
			setState(206);
			match(ID);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_LEFT_BRACKET) {
				{
				{
				setState(207);
				subscript_slice();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LEFT_PARENTHESES:
				{
				setState(213);
				operation_one();
				}
				break;
			case ID:
				{
				setState(214);
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
		enterRule(_localctx, 22, RULE_operation_one);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(TK_LEFT_PARENTHESES);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(218);
				params();
				}
			}

			setState(221);
			match(TK_RIGHT_PARENTHESES);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(222);
				match(T__13);
				setState(223);
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
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		enterRule(_localctx, 24, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__16);
			setState(227);
			match(ID);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LEFT_PARENTHESES) {
				{
				setState(228);
				match(TK_LEFT_PARENTHESES);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(229);
					params();
					}
				}

				setState(232);
				match(TK_RIGHT_PARENTHESES);
				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(235);
				match(T__13);
				setState(236);
				param();
				}
			}

			setState(239);
			block();
			setState(240);
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
		enterRule(_localctx, 26, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(242);
				declarations();
				}
				break;
			}
			setState(245);
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

	public static class StatementsContext extends ParserRuleContext {
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
		enterRule(_localctx, 28, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__17);
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
		enterRule(_localctx, 30, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__17);
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
		enterRule(_localctx, 32, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			param();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEMI_COLON) {
				{
				{
				setState(252);
				match(TK_SEMI_COLON);
				setState(253);
				param();
				}
				}
				setState(258);
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
		enterRule(_localctx, 34, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ID);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_LEFT_BRACKET) {
				{
				{
				setState(260);
				subscript_slice();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(TK_COLON);
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(267);
				data_type();
				}
				break;
			case T__18:
				{
				setState(268);
				match(T__18);
				setState(269);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 36, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__17);
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
		enterRule(_localctx, 38, RULE_assign_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(ID);
			setState(275);
			match(TK_ASSIGN);
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(276);
				binary_expression();
				}
				break;
			case 2:
				{
				setState(279);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(277);
					match(ID);
					}
					break;
				case TK_LEFT_BRACKET:
					{
					setState(278);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_SEMI_COLON) {
				{
				setState(283);
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
		enterRule(_localctx, 40, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			assign();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_SEMI_COLON) {
				{
				setState(287);
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
		enterRule(_localctx, 42, RULE_assign);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LEFT_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				array();
				setState(291);
				match(TK_SWAP);
				setState(294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(292);
					match(ID);
					}
					break;
				case TK_LEFT_BRACKET:
					{
					setState(293);
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
				setState(296);
				match(ID);
				setState(297);
				assigns();
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(298);
					binary_expression();
					}
					break;
				case 2:
					{
					setState(301);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(299);
						match(ID);
						}
						break;
					case TK_LEFT_BRACKET:
						{
						setState(300);
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
		enterRule(_localctx, 44, RULE_binary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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
		enterRule(_localctx, 46, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			and_expression();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_OR || _la==TK_XOR) {
				{
				{
				setState(310);
				_la = _input.LA(1);
				if ( !(_la==TK_OR || _la==TK_XOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(311);
				and_expression();
				}
				}
				setState(316);
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
		enterRule(_localctx, 48, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			comp_expression();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_AND) {
				{
				{
				setState(318);
				match(TK_AND);
				setState(319);
				comp_expression();
				}
				}
				setState(324);
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
		enterRule(_localctx, 50, RULE_comp_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			shift_expression();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << REAL) | (1L << STRING) | (1L << TK_LEFT_BRACKET) | (1L << TK_LEFT_PARENTHESES) | (1L << TK_INCREMENT) | (1L << TK_DECREMENT) | (1L << TK_NOT) | (1L << TK_PLUS) | (1L << TK_MINUS) | (1L << TK_ADDRESS) | (1L << TK_EQUAL) | (1L << TK_NOT_EQUAL) | (1L << TK_GREATER) | (1L << TK_lESS) | (1L << TK_GREATER_EQUAL) | (1L << TK_LESS_EQUAL))) != 0)) {
				{
				{
				setState(326);
				comps();
				setState(327);
				shift_expression();
				}
				}
				setState(333);
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
		enterRule(_localctx, 52, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			simple_op_expression();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_LEFT_SHIFT) {
				{
				{
				setState(335);
				_la = _input.LA(1);
				if ( !(_la==TK_LEFT_SHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(336);
				simple_op_expression();
				}
				}
				setState(341);
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
		enterRule(_localctx, 54, RULE_simple_op_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			other_op_expression();
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343);
					simple_op();
					setState(344);
					other_op_expression();
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 56, RULE_other_op_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			exponentiation_expression();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MULTIPLICATION) | (1L << TK_DIVISION) | (1L << TK_REMAINDER) | (1L << TK_MODULUS))) != 0)) {
				{
				{
				setState(352);
				other_op();
				setState(353);
				exponentiation_expression();
				}
				}
				setState(359);
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
		enterRule(_localctx, 58, RULE_exponentiation_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					unary_expression();
					setState(361);
					match(TK_EXPONENTIATION);
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(368);
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
		enterRule(_localctx, 60, RULE_unary_expression);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				post_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				pre_op();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				single_expr();
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
		enterRule(_localctx, 62, RULE_post_op);
		int _la;
		try {
			int _alt;
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==REAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(376);
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
				setState(377);
				match(ID);
				}
				setState(378);
				match(TK_POINTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_LEFT_BRACKET:
					{
					setState(379);
					array();
					}
					break;
				case STRING:
					{
					setState(380);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(383);
						subscript_slice();
						}
						} 
					}
					setState(388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		enterRule(_localctx, 64, RULE_pre_op);
		int _la;
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(TK_NOT);
				setState(392);
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
				setState(393);
				sign_change();
				setState(394);
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
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENT || _la==TK_DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(397);
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
				setState(398);
				match(TK_ADDRESS);
				setState(399);
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
		enterRule(_localctx, 66, RULE_single_expr);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				match(STRING);
				}
				break;
			case TK_LEFT_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				array();
				}
				break;
			case TK_LEFT_PARENTHESES:
				enterOuterAlt(_localctx, 5);
				{
				setState(406);
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
		enterRule(_localctx, 68, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(TK_LEFT_BRACKET);
			setState(410);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(411);
				match(T__7);
				setState(412);
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
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
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
		enterRule(_localctx, 70, RULE_subscript_slice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(TK_LEFT_BRACKET);
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(421);
				subscript();
				}
				break;
			case 2:
				{
				setState(422);
				slice();
				}
				break;
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(425);
				match(T__7);
				setState(428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(426);
					subscript();
					}
					break;
				case 2:
					{
					setState(427);
					slice();
					}
					break;
				}
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
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
		enterRule(_localctx, 72, RULE_slice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			subscript();
			setState(438);
			match(TK_COLON);
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INT:
				{
				setState(439);
				subscript();
				}
				break;
			case TK_MULTIPLICATION:
				{
				setState(440);
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
		enterRule(_localctx, 74, RULE_subscript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
		enterRule(_localctx, 76, RULE_grouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(TK_LEFT_PARENTHESES);
			setState(446);
			binary_expression();
			setState(447);
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
		enterRule(_localctx, 78, RULE_sign_change);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
		enterRule(_localctx, 80, RULE_assigns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (TK_ASSIGN - 67)) | (1L << (TK_INCREMENT_ASSIGN - 67)) | (1L << (TK_DECREMENT_ASSIGN - 67)) | (1L << (TK_MULTIPLICATION_ASSIGN - 67)) | (1L << (TK_DIVISION_ASSIGN - 67)) | (1L << (TK_REMAINDER_ASSIGN - 67)) | (1L << (TK_EXPONENTIATION_ASSIGN - 67)) | (1L << (TK_OR_ASSIGN - 67)) | (1L << (TK_AND_ASSIGN - 67)) | (1L << (TK_CONCAT_ASSIGN - 67)) | (1L << (TK_LEFT_SHIFT_ASSIGN - 67)) | (1L << (TK_RIGHT_SHIFT_ASSIGN - 67)))) != 0)) ) {
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
		enterRule(_localctx, 82, RULE_comps);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				setState(454);
				match(TK_EQUAL);
				}
				break;
			case TK_NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				match(TK_NOT_EQUAL);
				}
				break;
			case TK_GREATER:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				match(TK_GREATER);
				}
				break;
			case TK_GREATER_EQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(457);
				match(TK_GREATER_EQUAL);
				}
				break;
			case TK_lESS:
				enterOuterAlt(_localctx, 6);
				{
				setState(458);
				match(TK_lESS);
				}
				break;
			case TK_LESS_EQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(459);
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
		enterRule(_localctx, 84, RULE_simple_op);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(TK_CONTAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				match(TK_PLUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
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
		enterRule(_localctx, 86, RULE_other_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MULTIPLICATION) | (1L << TK_DIVISION) | (1L << TK_REMAINDER) | (1L << TK_MODULUS))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u01d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\6\2]\n\2\r\2\16\2^\3\3\3\3\3\3\3\3\7\3e\n\3\f\3\16"+
		"\3h\13\3\3\3\3\3\3\4\5\4m\n\4\3\4\3\4\3\4\3\4\5\4s\n\4\3\4\5\4v\n\4\3"+
		"\4\3\4\3\4\3\4\5\4|\n\4\3\4\5\4\177\n\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5"+
		"\3\5\7\5\u0088\n\5\f\5\16\5\u008b\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0093"+
		"\n\6\f\6\16\6\u0096\13\6\3\7\3\7\3\7\3\7\7\7\u009c\n\7\f\7\16\7\u009f"+
		"\13\7\3\7\5\7\u00a2\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ad"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00b6\n\n\3\n\3\n\5\n\u00ba\n\n\3"+
		"\n\5\n\u00bd\n\n\3\n\3\n\3\n\5\n\u00c2\n\n\3\13\3\13\3\13\7\13\u00c7\n"+
		"\13\f\13\16\13\u00ca\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00d3\n"+
		"\f\f\f\16\f\u00d6\13\f\3\f\3\f\5\f\u00da\n\f\3\r\3\r\5\r\u00de\n\r\3\r"+
		"\3\r\3\r\5\r\u00e3\n\r\3\16\3\16\3\16\3\16\5\16\u00e9\n\16\3\16\5\16\u00ec"+
		"\n\16\3\16\3\16\5\16\u00f0\n\16\3\16\3\16\3\16\3\17\5\17\u00f6\n\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\7\22\u0101\n\22\f\22\16\22"+
		"\u0104\13\22\3\23\3\23\7\23\u0108\n\23\f\23\16\23\u010b\13\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0111\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u011a"+
		"\n\25\5\25\u011c\n\25\3\25\5\25\u011f\n\25\3\26\3\26\5\26\u0123\n\26\3"+
		"\27\3\27\3\27\3\27\5\27\u0129\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0130"+
		"\n\27\5\27\u0132\n\27\5\27\u0134\n\27\3\30\3\30\3\31\3\31\3\31\7\31\u013b"+
		"\n\31\f\31\16\31\u013e\13\31\3\32\3\32\3\32\7\32\u0143\n\32\f\32\16\32"+
		"\u0146\13\32\3\33\3\33\3\33\3\33\7\33\u014c\n\33\f\33\16\33\u014f\13\33"+
		"\3\34\3\34\3\34\7\34\u0154\n\34\f\34\16\34\u0157\13\34\3\35\3\35\3\35"+
		"\3\35\7\35\u015d\n\35\f\35\16\35\u0160\13\35\3\36\3\36\3\36\3\36\7\36"+
		"\u0166\n\36\f\36\16\36\u0169\13\36\3\37\3\37\3\37\7\37\u016e\n\37\f\37"+
		"\16\37\u0171\13\37\3\37\3\37\3 \3 \3 \5 \u0178\n \3!\3!\3!\3!\3!\3!\5"+
		"!\u0180\n!\3!\7!\u0183\n!\f!\16!\u0186\13!\5!\u0188\n!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u0193\n\"\3#\3#\3#\3#\3#\5#\u019a\n#\3$\3$\3"+
		"$\3$\7$\u01a0\n$\f$\16$\u01a3\13$\3$\3$\3%\3%\3%\5%\u01aa\n%\3%\3%\3%"+
		"\5%\u01af\n%\7%\u01b1\n%\f%\16%\u01b4\13%\3%\3%\3&\3&\3&\3&\5&\u01bc\n"+
		"&\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u01cf\n+\3,"+
		"\3,\3,\3,\5,\u01d5\n,\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\16\3\2CD\3\2::\4\2\27\27\35"+
		"\35\3\2,-\4\2\32\32\34\34\3\2\34\35\4\2\27\27\34\35\5\2\27\27\32\33\36"+
		"\36\4\2\27\27\34\34\3\2\60\61\4\2EEGQ\3\2\658\2\u01fb\2\\\3\2\2\2\4`\3"+
		"\2\2\2\6l\3\2\2\2\b\u0089\3\2\2\2\n\u008c\3\2\2\2\f\u0097\3\2\2\2\16\u00a3"+
		"\3\2\2\2\20\u00a6\3\2\2\2\22\u00b0\3\2\2\2\24\u00c3\3\2\2\2\26\u00cf\3"+
		"\2\2\2\30\u00db\3\2\2\2\32\u00e4\3\2\2\2\34\u00f5\3\2\2\2\36\u00f9\3\2"+
		"\2\2 \u00fb\3\2\2\2\"\u00fd\3\2\2\2$\u0105\3\2\2\2&\u0112\3\2\2\2(\u0114"+
		"\3\2\2\2*\u0120\3\2\2\2,\u0133\3\2\2\2.\u0135\3\2\2\2\60\u0137\3\2\2\2"+
		"\62\u013f\3\2\2\2\64\u0147\3\2\2\2\66\u0150\3\2\2\28\u0158\3\2\2\2:\u0161"+
		"\3\2\2\2<\u016f\3\2\2\2>\u0177\3\2\2\2@\u0187\3\2\2\2B\u0192\3\2\2\2D"+
		"\u0199\3\2\2\2F\u019b\3\2\2\2H\u01a6\3\2\2\2J\u01b7\3\2\2\2L\u01bd\3\2"+
		"\2\2N\u01bf\3\2\2\2P\u01c3\3\2\2\2R\u01c5\3\2\2\2T\u01ce\3\2\2\2V\u01d4"+
		"\3\2\2\2X\u01d6\3\2\2\2Z]\5\6\4\2[]\5\4\3\2\\Z\3\2\2\2\\[\3\2\2\2]^\3"+
		"\2\2\2^\\\3\2\2\2^_\3\2\2\2_\3\3\2\2\2`a\7\3\2\2af\7\27\2\2be\5\16\b\2"+
		"ce\5\20\t\2db\3\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2"+
		"\2hf\3\2\2\2ij\7\4\2\2j\5\3\2\2\2km\5\n\6\2lk\3\2\2\2lm\3\2\2\2mn\3\2"+
		"\2\2no\7\5\2\2ou\7\27\2\2pr\7$\2\2qs\5\"\22\2rq\3\2\2\2rs\3\2\2\2st\3"+
		"\2\2\2tv\7%\2\2up\3\2\2\2uv\3\2\2\2v\u0081\3\2\2\2w\u0082\7\6\2\2x~\7"+
		"\7\2\2y{\7$\2\2z|\5\"\22\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\7%\2\2~"+
		"y\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\5\b\5\2\u0081w\3"+
		"\2\2\2\u0081x\3\2\2\2\u0082\7\3\2\2\2\u0083\u0088\5\20\t\2\u0084\u0088"+
		"\5\22\n\2\u0085\u0088\5\26\f\2\u0086\u0088\5\24\13\2\u0087\u0083\3\2\2"+
		"\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\t\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\7\b\2\2\u008d\u0094\7\27\2\2\u008e\u0093\5"+
		"\f\7\2\u008f\u0093\5\16\b\2\u0090\u0093\5\20\t\2\u0091\u0093\5\26\f\2"+
		"\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\13\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\t\2\2\u0098\u009d\7\27\2"+
		"\2\u0099\u009a\7\n\2\2\u009a\u009c\7\27\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7*\2\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\r\3\2\2\2\u00a3\u00a4\7\13\2\2\u00a4\u00a5\5(\25"+
		"\2\u00a5\17\3\2\2\2\u00a6\u00a7\7\f\2\2\u00a7\u00a8\7\27\2\2\u00a8\u00a9"+
		"\7E\2\2\u00a9\u00aa\7\r\2\2\u00aa\u00ac\7$\2\2\u00ab\u00ad\5\"\22\2\u00ac"+
		"\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7%"+
		"\2\2\u00af\21\3\2\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\7\27\2\2\u00b2"+
		"\u00b3\7E\2\2\u00b3\u00b5\7$\2\2\u00b4\u00b6\5\"\22\2\u00b5\u00b4\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8"+
		"\u00ba\5$\23\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00bd\5\"\22\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c1\7%\2\2\u00bf\u00c0\7\20\2\2\u00c0\u00c2\5$"+
		"\23\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\23\3\2\2\2\u00c3\u00c4"+
		"\7\21\2\2\u00c4\u00c8\7\27\2\2\u00c5\u00c7\5H%\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7+\2\2\u00cc\u00cd\5\20\t\2\u00cd"+
		"\u00ce\5(\25\2\u00ce\25\3\2\2\2\u00cf\u00d0\7\22\2\2\u00d0\u00d4\7\27"+
		"\2\2\u00d1\u00d3\5H%\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00da\5\30\r\2\u00d8\u00da\7\27\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3"+
		"\2\2\2\u00da\27\3\2\2\2\u00db\u00dd\7$\2\2\u00dc\u00de\5\"\22\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\7%"+
		"\2\2\u00e0\u00e1\7\20\2\2\u00e1\u00e3\5$\23\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\31\3\2\2\2\u00e4\u00e5\7\23\2\2\u00e5\u00eb\7\27"+
		"\2\2\u00e6\u00e8\7$\2\2\u00e7\u00e9\5\"\22\2\u00e8\u00e7\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\7%\2\2\u00eb\u00e6\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00ee\7\20\2\2\u00ee"+
		"\u00f0\5$\23\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\7\4\2\2\u00f3\33\3\2\2\2\u00f4"+
		"\u00f6\5 \21\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\5\36\20\2\u00f8\35\3\2\2\2\u00f9\u00fa\7\24\2\2\u00fa"+
		"\37\3\2\2\2\u00fb\u00fc\7\24\2\2\u00fc!\3\2\2\2\u00fd\u0102\5$\23\2\u00fe"+
		"\u00ff\7*\2\2\u00ff\u0101\5$\23\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103#\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0105\u0109\7\27\2\2\u0106\u0108\5H%\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010c\u0110\7+\2\2\u010d\u0111\5&\24\2\u010e"+
		"\u010f\7\25\2\2\u010f\u0111\7\27\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3"+
		"\2\2\2\u0111%\3\2\2\2\u0112\u0113\7\24\2\2\u0113\'\3\2\2\2\u0114\u0115"+
		"\7\27\2\2\u0115\u011b\7E\2\2\u0116\u011c\5.\30\2\u0117\u011a\7\27\2\2"+
		"\u0118\u011a\5F$\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011c"+
		"\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011f\7*\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f)\3\2\2\2\u0120"+
		"\u0122\5,\27\2\u0121\u0123\7*\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123+\3\2\2\2\u0124\u0125\5F$\2\u0125\u0128\7F\2\2\u0126\u0129\7"+
		"\27\2\2\u0127\u0129\5F$\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129"+
		"\u0134\3\2\2\2\u012a\u012b\7\27\2\2\u012b\u0131\5R*\2\u012c\u0132\5.\30"+
		"\2\u012d\u0130\7\27\2\2\u012e\u0130\5F$\2\u012f\u012d\3\2\2\2\u012f\u012e"+
		"\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012c\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0124\3\2\2\2\u0133\u012a\3\2\2\2\u0134-\3\2\2\2"+
		"\u0135\u0136\5\60\31\2\u0136/\3\2\2\2\u0137\u013c\5\62\32\2\u0138\u0139"+
		"\t\2\2\2\u0139\u013b\5\62\32\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\61\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013f\u0144\5\64\33\2\u0140\u0141\7B\2\2\u0141\u0143\5\64\33"+
		"\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\63\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014d\5\66\34\2\u0148"+
		"\u0149\5T+\2\u0149\u014a\5\66\34\2\u014a\u014c\3\2\2\2\u014b\u0148\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\65\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0155\58\35\2\u0151\u0152\t\3\2"+
		"\2\u0152\u0154\58\35\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\67\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u015e\5:\36\2\u0159\u015a\5V,\2\u015a\u015b\5:\36\2\u015b\u015d\3\2\2"+
		"\2\u015c\u0159\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f9\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0167\5<\37\2\u0162"+
		"\u0163\5X-\2\u0163\u0164\5<\37\2\u0164\u0166\3\2\2\2\u0165\u0162\3\2\2"+
		"\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168;"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\5> \2\u016b\u016c\7\64\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u016a\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0173\5> \2\u0173=\3\2\2\2\u0174\u0178\5@!\2\u0175\u0178\5B\"\2\u0176"+
		"\u0178\5D#\2\u0177\u0174\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2"+
		"\2\u0178?\3\2\2\2\u0179\u017a\t\4\2\2\u017a\u0188\t\5\2\2\u017b\u017c"+
		"\7\27\2\2\u017c\u0188\7.\2\2\u017d\u0180\5F$\2\u017e\u0180\7\36\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0184\3\2\2\2\u0181\u0183\5H"+
		"%\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0179\3\2"+
		"\2\2\u0187\u017b\3\2\2\2\u0187\u017f\3\2\2\2\u0188A\3\2\2\2\u0189\u018a"+
		"\7/\2\2\u018a\u0193\t\6\2\2\u018b\u018c\5P)\2\u018c\u018d\t\7\2\2\u018d"+
		"\u0193\3\2\2\2\u018e\u018f\t\5\2\2\u018f\u0193\t\b\2\2\u0190\u0191\7\62"+
		"\2\2\u0191\u0193\7\27\2\2\u0192\u0189\3\2\2\2\u0192\u018b\3\2\2\2\u0192"+
		"\u018e\3\2\2\2\u0192\u0190\3\2\2\2\u0193C\3\2\2\2\u0194\u019a\7\27\2\2"+
		"\u0195\u019a\7\33\2\2\u0196\u019a\7\36\2\2\u0197\u019a\5F$\2\u0198\u019a"+
		"\5N(\2\u0199\u0194\3\2\2\2\u0199\u0195\3\2\2\2\u0199\u0196\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019aE\3\2\2\2\u019b\u019c\7\"\2\2"+
		"\u019c\u01a1\t\t\2\2\u019d\u019e\7\n\2\2\u019e\u01a0\t\t\2\2\u019f\u019d"+
		"\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7#\2\2\u01a5G\3\2\2\2\u01a6"+
		"\u01a9\7\"\2\2\u01a7\u01aa\5L\'\2\u01a8\u01aa\5J&\2\u01a9\u01a7\3\2\2"+
		"\2\u01a9\u01a8\3\2\2\2\u01aa\u01b2\3\2\2\2\u01ab\u01ae\7\n\2\2\u01ac\u01af"+
		"\5L\'\2\u01ad\u01af\5J&\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5"+
		"\u01b6\7#\2\2\u01b6I\3\2\2\2\u01b7\u01b8\5L\'\2\u01b8\u01bb\7+\2\2\u01b9"+
		"\u01bc\5L\'\2\u01ba\u01bc\7\65\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2"+
		"\2\2\u01bcK\3\2\2\2\u01bd\u01be\t\n\2\2\u01beM\3\2\2\2\u01bf\u01c0\7$"+
		"\2\2\u01c0\u01c1\5.\30\2\u01c1\u01c2\7%\2\2\u01c2O\3\2\2\2\u01c3\u01c4"+
		"\t\13\2\2\u01c4Q\3\2\2\2\u01c5\u01c6\t\f\2\2\u01c6S\3\2\2\2\u01c7\u01cf"+
		"\3\2\2\2\u01c8\u01cf\7<\2\2\u01c9\u01cf\7=\2\2\u01ca\u01cf\7>\2\2\u01cb"+
		"\u01cf\7@\2\2\u01cc\u01cf\7?\2\2\u01cd\u01cf\7A\2\2\u01ce\u01c7\3\2\2"+
		"\2\u01ce\u01c8\3\2\2\2\u01ce\u01c9\3\2\2\2\u01ce\u01ca\3\2\2\2\u01ce\u01cb"+
		"\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cfU\3\2\2\2\u01d0"+
		"\u01d5\3\2\2\2\u01d1\u01d5\79\2\2\u01d2\u01d5\7\60\2\2\u01d3\u01d5\7\61"+
		"\2\2\u01d4\u01d0\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5W\3\2\2\2\u01d6\u01d7\t\r\2\2\u01d7Y\3\2\2\2?\\^d"+
		"flru{~\u0081\u0087\u0089\u0092\u0094\u009d\u00a1\u00ac\u00b5\u00b9\u00bc"+
		"\u00c1\u00c8\u00d4\u00d9\u00dd\u00e2\u00e8\u00eb\u00ef\u00f5\u0102\u0109"+
		"\u0110\u0119\u011b\u011e\u0122\u0128\u012f\u0131\u0133\u013c\u0144\u014d"+
		"\u0155\u015e\u0167\u016f\u0177\u017f\u0184\u0187\u0192\u0199\u01a1\u01a9"+
		"\u01ae\u01b2\u01bb\u01ce\u01d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}