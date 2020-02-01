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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, RESERVED_WORD_F=7, BOOLEAN=8, 
		NUMBER=9, INT=10, REAL=11, STRING=12, Spec=13, Global=14, Res=15, Af=16, 
		Read=17, If=18, Fi=19, Do=20, Od=21, Resource=22, Procedure=23, Type=24, 
		Optype=25, Rec=26, Int=27, Getarg=28, Cap=29, Import=30, Id=31, Create=32, 
		End=33, Stop=34, Write=35, Send=36, Or=37, Body=38, Fa=39, Mod=40, Var=41, 
		To=42, True=43, False=44, Returns=45, Writes=46, Put=47, Op=48, Receive=49, 
		Destroy=50, Final=51, Process=52, Char=53, Chars=54, Bool=55, Real=56, 
		Reply=57, Next=58, Ni=59, Co=60, Proc=61, String=62, Const=63, Low=64, 
		High=65, Call=66, In=67, Separate=68, ID=69, IDENTIFIER=70, IDENTIFIER_PTR=71, 
		TK_SEPARA=72, TK_LEFT_BRACKET=73, TK_RIGHT_BRACKET=74, TK_LEFT_PARENTHESES=75, 
		TK_RIGHT_PARENTHESES=76, TK_LEFT_BRACE=77, TK_RIGHT_BRACE=78, TK_EXECUTE=79, 
		TK_DOT=80, TK_SEMI_COLON=81, TK_COLON=82, TK_COMMA=83, TK_INCREMENT=84, 
		TK_DECREMENT=85, TK_POINTER=86, TK_NOT=87, TK_PLUS=88, TK_MINUS=89, TK_ADDRESS=90, 
		TK_N_INVOCATIONS=91, TK_EXPONENTIATION=92, TK_MULTIPLICATION=93, TK_DIVISION=94, 
		TK_REMAINDER=95, TK_MODULUS=96, TK_CONTAT=97, TK_LEFT_SHIFT=98, TK_RIGHT_SHIFT=99, 
		TK_EQUAL=100, TK_NOT_EQUAL=101, TK_GREATER=102, TK_lESS=103, TK_GREATER_EQUAL=104, 
		TK_LESS_EQUAL=105, TK_AND=106, TK_OR=107, TK_XOR=108, TK_ASSIGN=109, TK_SWAP=110, 
		TK_INCREMENT_ASSIGN=111, TK_DECREMENT_ASSIGN=112, TK_MULTIPLICATION_ASSIGN=113, 
		TK_DIVISION_ASSIGN=114, TK_REMAINDER_ASSIGN=115, TK_EXPONENTIATION_ASSIGN=116, 
		TK_OR_ASSIGN=117, TK_AND_ASSIGN=118, TK_CONCAT_ASSIGN=119, TK_LEFT_SHIFT_ASSIGN=120, 
		TK_RIGHT_SHIFT_ASSIGN=121, ID_LETTER=122, DIGIT=123, SPACES=124, LINE_COMMENT=125, 
		Initial=126, Tk_increment=127, Tk_decrement=128;
	public static final int
		RULE_start = 0, RULE_entry = 1, RULE_global = 2, RULE_resource = 3, RULE_body = 4, 
		RULE_resource_specification = 5, RULE_resource_body = 6, RULE_spec = 7, 
		RULE_import_ = 8, RULE_const_ = 9, RULE_type = 10, RULE_optype = 11, RULE_op_type_params = 12, 
		RULE_var = 13, RULE_var_create = 14, RULE_operation = 15, RULE_operation_one = 16, 
		RULE_proc = 17, RULE_block = 18, RULE_declarations = 19, RULE_statements = 20, 
		RULE_comma_params = 21, RULE_comma_expressions_params = 22, RULE_params = 23, 
		RULE_param = 24, RULE_data_type = 25, RULE_equal_expression = 26, RULE_assign_expression = 27, 
		RULE_function_ = 28, RULE_function_end = 29, RULE_resource_control = 30, 
		RULE_create_cap_expression = 31, RULE_destroy_cap_expression = 32, RULE_operation_invocation = 33, 
		RULE_call_expression = 34, RULE_send_expression = 35, RULE_concurrent_expression = 36, 
		RULE_call_invocation = 37, RULE_quantifier = 38, RULE_sequential = 39, 
		RULE_if_inner = 40, RULE_boolean_expression = 41, RULE_for_expr = 42, 
		RULE_for_expr_Ls = 43, RULE_block_cycle = 44, RULE_operation_service = 45, 
		RULE_expression = 46, RULE_assign = 47, RULE_assign_slice = 48, RULE_binary_expression = 49, 
		RULE_or_expression = 50, RULE_and_expression = 51, RULE_comp_expression = 52, 
		RULE_shift_expression = 53, RULE_simple_op_expression = 54, RULE_other_op_expression = 55, 
		RULE_exponentiation_expression = 56, RULE_unary_expression = 57, RULE_post_op = 58, 
		RULE_pre_op = 59, RULE_single_expr = 60, RULE_array = 61, RULE_subscript_slice = 62, 
		RULE_slice = 63, RULE_subscript = 64, RULE_grouping = 65, RULE_sign_change = 66, 
		RULE_assigns = 67, RULE_comps = 68, RULE_simple_op = 69, RULE_other_op = 70;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "entry", "global", "resource", "body", "resource_specification", 
			"resource_body", "spec", "import_", "const_", "type", "optype", "op_type_params", 
			"var", "var_create", "operation", "operation_one", "proc", "block", "declarations", 
			"statements", "comma_params", "comma_expressions_params", "params", "param", 
			"data_type", "equal_expression", "assign_expression", "function_", "function_end", 
			"resource_control", "create_cap_expression", "destroy_cap_expression", 
			"operation_invocation", "call_expression", "send_expression", "concurrent_expression", 
			"call_invocation", "quantifier", "sequential", "if_inner", "boolean_expression", 
			"for_expr", "for_expr_Ls", "block_cycle", "operation_service", "expression", 
			"assign", "assign_slice", "binary_expression", "or_expression", "and_expression", 
			"comp_expression", "shift_expression", "simple_op_expression", "other_op_expression", 
			"exponentiation_expression", "unary_expression", "post_op", "pre_op", 
			"single_expr", "array", "subscript_slice", "slice", "subscript", "grouping", 
			"sign_change", "assigns", "comps", "simple_op", "other_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'on'", "'oc'", "'skip'", "'exit'", "'NOTYET'", "'EOF'", null, 
			null, null, null, null, null, "'spec'", "'global'", "'res'", "'af'", 
			"'read'", "'if'", "'fi'", "'do'", "'od'", "'resource'", "'procedure'", 
			"'type'", "'optype'", "'rec'", "'int'", "'getarg'", "'cap'", "'import'", 
			"'id'", "'create'", "'end'", "'stop'", "'write'", "'send'", "'or'", "'body'", 
			"'fa'", null, "'var'", "'to'", "'true'", "'false'", "'returns'", "'writes'", 
			"'put'", "'op'", "'receive'", "'destroy'", "'final'", "'process'", "'char'", 
			"'chars'", "'bool'", "'real'", "'reply'", "'next'", "'ni'", "'co'", "'proc'", 
			"'string'", "'const'", "'low'", "'high'", "'call'", "'in'", "'separate'", 
			null, null, null, "'[]'", "'['", "']'", "'('", "')'", "'{'", "'}'", "'->'", 
			"'.'", "';'", "':'", "','", "'++'", "'--'", "'^'", null, "'+'", "'-'", 
			"'@'", "'?'", "'**'", "'*'", "'/'", "'%'", null, "'||'", "'<<'", "'>>'", 
			"'='", null, "'>'", "'<'", "'>='", "'<='", null, null, "'xor'", "':='", 
			"':=:'", "'+:='", "'-:='", "'*:='", "'/:='", "'%:='", "'**:='", "'|:='", 
			"'&:='", "'||:='", "'<<:='", "'>>:='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "RESERVED_WORD_F", "BOOLEAN", 
			"NUMBER", "INT", "REAL", "STRING", "Spec", "Global", "Res", "Af", "Read", 
			"If", "Fi", "Do", "Od", "Resource", "Procedure", "Type", "Optype", "Rec", 
			"Int", "Getarg", "Cap", "Import", "Id", "Create", "End", "Stop", "Write", 
			"Send", "Or", "Body", "Fa", "Mod", "Var", "To", "True", "False", "Returns", 
			"Writes", "Put", "Op", "Receive", "Destroy", "Final", "Process", "Char", 
			"Chars", "Bool", "Real", "Reply", "Next", "Ni", "Co", "Proc", "String", 
			"Const", "Low", "High", "Call", "In", "Separate", "ID", "IDENTIFIER", 
			"IDENTIFIER_PTR", "TK_SEPARA", "TK_LEFT_BRACKET", "TK_RIGHT_BRACKET", 
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
			"TK_RIGHT_SHIFT_ASSIGN", "ID_LETTER", "DIGIT", "SPACES", "LINE_COMMENT", 
			"Initial", "Tk_increment", "Tk_decrement"
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
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				entry();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Spec) | (1L << Global) | (1L << Resource) | (1L << Body))) != 0) );
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
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Spec:
			case Resource:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				resource();
				}
				break;
			case Global:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				global();
				}
				break;
			case Body:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
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
		public TerminalNode Global() { return getToken(MiLenguajeParser.Global, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode End() { return getToken(MiLenguajeParser.End, 0); }
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
			setState(152);
			match(Global);
			setState(153);
			match(ID);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Type || _la==Const) {
				{
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Const:
					{
					setState(154);
					const_();
					}
					break;
				case Type:
					{
					setState(155);
					type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(End);
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
		public TerminalNode Resource() { return getToken(MiLenguajeParser.Resource, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode Separate() { return getToken(MiLenguajeParser.Separate, 0); }
		public Resource_specificationContext resource_specification() {
			return getRuleContext(Resource_specificationContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Spec) {
				{
				setState(163);
				spec();
				}
			}

			setState(166);
			match(Resource);
			setState(167);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
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
				break;
			}
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(175);
				match(Separate);
				}
				break;
			case 2:
				{
				setState(176);
				resource_specification();
				}
				break;
			case 3:
				{
				setState(177);
				body();
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode Body() { return getToken(MiLenguajeParser.Body, 0); }
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
			setState(180);
			match(Body);
			setState(181);
			match(ID);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(182);
				match(TK_LEFT_PARENTHESES);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(183);
					params();
					}
				}

				setState(186);
				match(TK_RIGHT_PARENTHESES);
				}
				break;
			}
			setState(189);
			resource_body();
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

	public static class Resource_specificationContext extends ParserRuleContext {
		public Resource_bodyContext resource_body() {
			return getRuleContext(Resource_bodyContext.class,0);
		}
		public Resource_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterResource_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitResource_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitResource_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_specificationContext resource_specification() throws RecognitionException {
		Resource_specificationContext _localctx = new Resource_specificationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_resource_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			resource_body();
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
		public List<TerminalNode> End() { return getTokens(MiLenguajeParser.End); }
		public TerminalNode End(int i) {
			return getToken(MiLenguajeParser.End, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public TerminalNode Initial() { return getToken(MiLenguajeParser.Initial, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode Final() { return getToken(MiLenguajeParser.Final, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
		enterRule(_localctx, 12, RULE_resource_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(193);
				declarations();
				}
				break;
			}
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Initial) {
				{
				setState(196);
				match(Initial);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << RESERVED_WORD_F) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << REAL) | (1L << STRING) | (1L << If) | (1L << Do) | (1L << Type) | (1L << Optype) | (1L << Import) | (1L << Send) | (1L << Fa) | (1L << Var) | (1L << Op) | (1L << Destroy) | (1L << Next) | (1L << Co) | (1L << Const))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Call - 66)) | (1L << (ID - 66)) | (1L << (TK_LEFT_BRACKET - 66)) | (1L << (TK_LEFT_PARENTHESES - 66)) | (1L << (TK_INCREMENT - 66)) | (1L << (TK_DECREMENT - 66)) | (1L << (TK_NOT - 66)) | (1L << (TK_PLUS - 66)) | (1L << (TK_MINUS - 66)) | (1L << (TK_ADDRESS - 66)))) != 0)) {
					{
					setState(197);
					block();
					}
				}

				setState(200);
				match(End);
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << RESERVED_WORD_F) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << REAL) | (1L << STRING) | (1L << If) | (1L << Do) | (1L << Procedure) | (1L << Type) | (1L << Optype) | (1L << Import) | (1L << Send) | (1L << Fa) | (1L << Var) | (1L << Op) | (1L << Destroy) | (1L << Process) | (1L << Next) | (1L << Co) | (1L << Proc) | (1L << Const))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Call - 66)) | (1L << (ID - 66)) | (1L << (TK_LEFT_BRACKET - 66)) | (1L << (TK_LEFT_PARENTHESES - 66)) | (1L << (TK_INCREMENT - 66)) | (1L << (TK_DECREMENT - 66)) | (1L << (TK_NOT - 66)) | (1L << (TK_PLUS - 66)) | (1L << (TK_MINUS - 66)) | (1L << (TK_ADDRESS - 66)))) != 0)) {
				{
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(203);
					proc();
					}
					break;
				case 2:
					{
					setState(204);
					declarations();
					}
					break;
				case 3:
					{
					setState(205);
					statements();
					}
					break;
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final) {
				{
				setState(211);
				match(Final);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << RESERVED_WORD_F) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << REAL) | (1L << STRING) | (1L << If) | (1L << Do) | (1L << Type) | (1L << Optype) | (1L << Import) | (1L << Send) | (1L << Fa) | (1L << Var) | (1L << Op) | (1L << Destroy) | (1L << Next) | (1L << Co) | (1L << Const))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Call - 66)) | (1L << (ID - 66)) | (1L << (TK_LEFT_BRACKET - 66)) | (1L << (TK_LEFT_PARENTHESES - 66)) | (1L << (TK_INCREMENT - 66)) | (1L << (TK_DECREMENT - 66)) | (1L << (TK_NOT - 66)) | (1L << (TK_PLUS - 66)) | (1L << (TK_MINUS - 66)) | (1L << (TK_ADDRESS - 66)))) != 0)) {
					{
					setState(212);
					block();
					}
				}

				setState(215);
				match(End);
				}
			}

			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case End:
				{
				setState(218);
				match(End);
				}
				break;
			case Body:
				{
				setState(219);
				body();
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

	public static class SpecContext extends ParserRuleContext {
		public TerminalNode Spec() { return getToken(MiLenguajeParser.Spec, 0); }
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
		enterRule(_localctx, 14, RULE_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(Spec);
			setState(223);
			match(ID);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Type) | (1L << Import) | (1L << Op) | (1L << Const))) != 0)) {
				{
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Import:
					{
					setState(224);
					import_();
					}
					break;
				case Const:
					{
					setState(225);
					const_();
					}
					break;
				case Type:
					{
					setState(226);
					type();
					}
					break;
				case Op:
					{
					setState(227);
					operation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(232);
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
		public TerminalNode Import() { return getToken(MiLenguajeParser.Import, 0); }
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
		enterRule(_localctx, 16, RULE_import_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(Import);
			setState(234);
			match(ID);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(235);
				match(TK_COMMA);
				setState(236);
				match(ID);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(242);
				match(TK_SEMI_COLON);
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

	public static class Const_Context extends ParserRuleContext {
		public TerminalNode Const() { return getToken(MiLenguajeParser.Const, 0); }
		public Equal_expressionContext equal_expression() {
			return getRuleContext(Equal_expressionContext.class,0);
		}
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
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
		enterRule(_localctx, 18, RULE_const_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(Const);
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(246);
				equal_expression();
				}
				break;
			case 2:
				{
				setState(247);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(MiLenguajeParser.Type, 0); }
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
		public TerminalNode Cap() { return getToken(MiLenguajeParser.Cap, 0); }
		public Equal_expressionContext equal_expression() {
			return getRuleContext(Equal_expressionContext.class,0);
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
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(Type);
				setState(251);
				comma_params();
				setState(252);
				match(TK_COLON);
				setState(258);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Cap:
				case ID:
					{
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Cap) {
						{
						setState(253);
						match(Cap);
						}
					}

					setState(256);
					match(ID);
					}
					break;
				case Int:
				case Char:
				case Chars:
				case Bool:
				case Real:
				case String:
					{
					setState(257);
					data_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(260);
					assign_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(Type);
				setState(264);
				assign_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(Type);
				setState(266);
				equal_expression();
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

	public static class OptypeContext extends ParserRuleContext {
		public TerminalNode Optype() { return getToken(MiLenguajeParser.Optype, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_EQUAL() { return getToken(MiLenguajeParser.TK_EQUAL, 0); }
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public Op_type_paramsContext op_type_params() {
			return getRuleContext(Op_type_paramsContext.class,0);
		}
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public TerminalNode Returns() { return getToken(MiLenguajeParser.Returns, 0); }
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
		enterRule(_localctx, 22, RULE_optype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(Optype);
			setState(270);
			match(ID);
			setState(271);
			match(TK_EQUAL);
			setState(272);
			match(TK_LEFT_PARENTHESES);
			setState(273);
			op_type_params();
			setState(274);
			match(TK_RIGHT_PARENTHESES);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Returns) {
				{
				setState(275);
				match(Returns);
				setState(276);
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
		public List<TerminalNode> Res() { return getTokens(MiLenguajeParser.Res); }
		public TerminalNode Res(int i) {
			return getToken(MiLenguajeParser.Res, i);
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
		enterRule(_localctx, 24, RULE_op_type_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Res) {
				{
				setState(279);
				match(Res);
				}
			}

			setState(282);
			param();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEMI_COLON) {
				{
				{
				setState(283);
				match(TK_SEMI_COLON);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Res) {
					{
					setState(284);
					match(Res);
					}
				}

				setState(287);
				param();
				}
				}
				setState(292);
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
		public TerminalNode Var() { return getToken(MiLenguajeParser.Var, 0); }
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
		public TerminalNode Cap() { return getToken(MiLenguajeParser.Cap, 0); }
		public Var_createContext var_create() {
			return getRuleContext(Var_createContext.class,0);
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
		enterRule(_localctx, 26, RULE_var);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(Var);
				setState(294);
				comma_params();
				setState(295);
				match(TK_COLON);
				setState(301);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Cap:
				case ID:
					{
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Cap) {
						{
						setState(296);
						match(Cap);
						}
					}

					setState(299);
					match(ID);
					}
					break;
				case Int:
				case Char:
				case Chars:
				case Bool:
				case Real:
				case String:
					{
					setState(300);
					data_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(303);
					assign_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(Var);
				setState(307);
				assign_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				var_create();
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

	public static class Var_createContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(MiLenguajeParser.Var, 0); }
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public TerminalNode Create() { return getToken(MiLenguajeParser.Create, 0); }
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public Comma_expressions_paramsContext comma_expressions_params() {
			return getRuleContext(Comma_expressions_paramsContext.class,0);
		}
		public Var_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVar_create(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVar_create(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar_create(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_createContext var_create() throws RecognitionException {
		Var_createContext _localctx = new Var_createContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(Var);
			setState(312);
			match(ID);
			setState(313);
			match(TK_ASSIGN);
			setState(314);
			match(Create);
			setState(315);
			match(ID);
			setState(316);
			match(TK_LEFT_PARENTHESES);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << RESERVED_WORD_F) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << REAL) | (1L << STRING))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ID - 69)) | (1L << (TK_LEFT_BRACKET - 69)) | (1L << (TK_LEFT_PARENTHESES - 69)) | (1L << (TK_INCREMENT - 69)) | (1L << (TK_DECREMENT - 69)) | (1L << (TK_NOT - 69)) | (1L << (TK_PLUS - 69)) | (1L << (TK_MINUS - 69)) | (1L << (TK_ADDRESS - 69)))) != 0)) {
				{
				setState(317);
				comma_expressions_params();
				}
			}

			setState(320);
			match(TK_RIGHT_PARENTHESES);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(321);
				match(T__0);
				setState(322);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode Op() { return getToken(MiLenguajeParser.Op, 0); }
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
		enterRule(_localctx, 30, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(Op);
			setState(326);
			comma_params();
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LEFT_PARENTHESES:
				{
				setState(327);
				operation_one();
				}
				break;
			case TK_COLON:
				{
				setState(328);
				match(TK_COLON);
				setState(329);
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
		public Op_type_paramsContext op_type_params() {
			return getRuleContext(Op_type_paramsContext.class,0);
		}
		public TerminalNode Returns() { return getToken(MiLenguajeParser.Returns, 0); }
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
		enterRule(_localctx, 32, RULE_operation_one);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(TK_LEFT_PARENTHESES);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(333);
				params();
				}
				break;
			case 2:
				{
				setState(334);
				op_type_params();
				}
				break;
			}
			setState(337);
			match(TK_RIGHT_PARENTHESES);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Returns) {
				{
				setState(338);
				match(Returns);
				setState(339);
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
		public TerminalNode End() { return getToken(MiLenguajeParser.End, 0); }
		public TerminalNode Proc() { return getToken(MiLenguajeParser.Proc, 0); }
		public TerminalNode Procedure() { return getToken(MiLenguajeParser.Procedure, 0); }
		public TerminalNode Process() { return getToken(MiLenguajeParser.Process, 0); }
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public TerminalNode Returns() { return getToken(MiLenguajeParser.Returns, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Comma_expressions_paramsContext comma_expressions_params() {
			return getRuleContext(Comma_expressions_paramsContext.class,0);
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
		enterRule(_localctx, 34, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Procedure) | (1L << Process) | (1L << Proc))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(343);
			match(ID);
			{
			setState(344);
			match(TK_LEFT_PARENTHESES);
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(345);
				comma_expressions_params();
				}
				break;
			case 2:
				{
				setState(346);
				param();
				}
				break;
			}
			setState(349);
			match(TK_RIGHT_PARENTHESES);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Returns) {
				{
				setState(351);
				match(Returns);
				setState(352);
				param();
				}
			}

			setState(355);
			block();
			setState(356);
			match(End);
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
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
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
		enterRule(_localctx, 36, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					declarations();
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(365); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(364);
					statements();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(367); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public Const_Context const_() {
			return getRuleContext(Const_Context.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OptypeContext optype() {
			return getRuleContext(OptypeContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public TerminalNode TK_SEMI_COLON() { return getToken(MiLenguajeParser.TK_SEMI_COLON, 0); }
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
		enterRule(_localctx, 38, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(369);
				const_();
				}
				break;
			case 2:
				{
				setState(370);
				type();
				}
				break;
			case 3:
				{
				setState(371);
				optype();
				}
				break;
			case 4:
				{
				setState(372);
				var();
				}
				break;
			case 5:
				{
				setState(373);
				operation();
				}
				break;
			case 6:
				{
				setState(374);
				function_();
				}
				break;
			case 7:
				{
				setState(375);
				expression();
				}
				break;
			case 8:
				{
				setState(376);
				import_();
				}
				break;
			}
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_SEMI_COLON) {
				{
				setState(379);
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

	public static class StatementsContext extends ParserRuleContext {
		public SequentialContext sequential() {
			return getRuleContext(SequentialContext.class,0);
		}
		public Operation_invocationContext operation_invocation() {
			return getRuleContext(Operation_invocationContext.class,0);
		}
		public Operation_serviceContext operation_service() {
			return getRuleContext(Operation_serviceContext.class,0);
		}
		public Resource_controlContext resource_control() {
			return getRuleContext(Resource_controlContext.class,0);
		}
		public TerminalNode TK_SEMI_COLON() { return getToken(MiLenguajeParser.TK_SEMI_COLON, 0); }
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
		enterRule(_localctx, 40, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(382);
				sequential();
				}
				break;
			case 2:
				{
				setState(383);
				operation_invocation();
				}
				break;
			case 3:
				{
				setState(384);
				operation_service();
				}
				break;
			case 4:
				{
				setState(385);
				resource_control();
				}
				break;
			}
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_SEMI_COLON) {
				{
				setState(388);
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
		enterRule(_localctx, 42, RULE_comma_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(ID);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_LEFT_BRACKET) {
				{
				{
				setState(392);
				subscript_slice();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(398);
				match(TK_COMMA);
				setState(399);
				match(ID);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_LEFT_BRACKET) {
					{
					{
					setState(400);
					subscript_slice();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(410);
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
		enterRule(_localctx, 44, RULE_comma_expressions_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(411);
				match(ID);
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(412);
						subscript_slice();
						}
						} 
					}
					setState(417);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(418);
				binary_expression();
				}
				break;
			}
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(421);
				match(TK_COMMA);
				setState(430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(422);
					match(ID);
					setState(426);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(423);
							subscript_slice();
							}
							} 
						}
						setState(428);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(429);
					binary_expression();
					}
					break;
				}
				}
				}
				setState(436);
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
		enterRule(_localctx, 46, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			param();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEMI_COLON) {
				{
				{
				setState(438);
				match(TK_SEMI_COLON);
				setState(439);
				param();
				}
				}
				setState(444);
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
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode Cap() { return getToken(MiLenguajeParser.Cap, 0); }
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
		enterRule(_localctx, 48, RULE_param);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(ID);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(446);
				match(TK_COMMA);
				setState(447);
				match(ID);
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(453);
					subscript_slice();
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(459);
				match(TK_COLON);
				setState(464);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
				case Char:
				case Chars:
				case Bool:
				case Real:
				case String:
					{
					setState(460);
					data_type();
					}
					break;
				case Cap:
					{
					setState(461);
					match(Cap);
					setState(462);
					match(ID);
					}
					break;
				case ID:
					{
					setState(463);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		public TerminalNode Int() { return getToken(MiLenguajeParser.Int, 0); }
		public TerminalNode Char() { return getToken(MiLenguajeParser.Char, 0); }
		public TerminalNode String() { return getToken(MiLenguajeParser.String, 0); }
		public TerminalNode Bool() { return getToken(MiLenguajeParser.Bool, 0); }
		public TerminalNode Chars() { return getToken(MiLenguajeParser.Chars, 0); }
		public TerminalNode Real() { return getToken(MiLenguajeParser.Real, 0); }
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
		enterRule(_localctx, 50, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Chars) | (1L << Bool) | (1L << Real) | (1L << String))) != 0)) ) {
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
		enterRule(_localctx, 52, RULE_equal_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(ID);
			setState(471);
			match(TK_EQUAL);
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(472);
				binary_expression();
				}
				break;
			case 2:
				{
				setState(475);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(473);
					match(ID);
					}
					break;
				case TK_LEFT_BRACKET:
					{
					setState(474);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(479);
				match(TK_SEMI_COLON);
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

	public static class Assign_expressionContext extends ParserRuleContext {
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public TerminalNode TK_SEMI_COLON() { return getToken(MiLenguajeParser.TK_SEMI_COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public TerminalNode STRING() { return getToken(MiLenguajeParser.STRING, 0); }
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
		enterRule(_localctx, 54, RULE_assign_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(482);
				match(ID);
				}
			}

			setState(485);
			match(TK_ASSIGN);
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(486);
				binary_expression();
				}
				break;
			case 2:
				{
				setState(489);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(487);
					match(ID);
					}
					break;
				case TK_LEFT_BRACKET:
					{
					setState(488);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				setState(491);
				data_type();
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(492);
					match(TK_LEFT_PARENTHESES);
					setState(496);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TK_LEFT_BRACKET:
						{
						setState(493);
						array();
						}
						break;
					case ID:
						{
						setState(494);
						match(ID);
						}
						break;
					case STRING:
						{
						setState(495);
						match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(498);
					match(TK_RIGHT_PARENTHESES);
					}
					break;
				}
				}
				break;
			}
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(503);
				match(TK_SEMI_COLON);
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

	public static class Function_Context extends ParserRuleContext {
		public Function_endContext function_end() {
			return getRuleContext(Function_endContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_function_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESERVED_WORD_F:
				{
				setState(506);
				match(RESERVED_WORD_F);
				}
				break;
			case ID:
				{
				setState(507);
				match(ID);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_LEFT_BRACKET) {
					{
					setState(508);
					subscript_slice();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(513);
			function_end();
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

	public static class Function_endContext extends ParserRuleContext {
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public Comma_expressions_paramsContext comma_expressions_params() {
			return getRuleContext(Comma_expressions_paramsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFunction_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFunction_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFunction_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_endContext function_end() throws RecognitionException {
		Function_endContext _localctx = new Function_endContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(TK_LEFT_PARENTHESES);
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(516);
				comma_expressions_params();
				}
				break;
			case 2:
				{
				setState(517);
				expression();
				}
				break;
			}
			setState(520);
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
		enterRule(_localctx, 60, RULE_resource_control);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				create_cap_expression();
				}
				break;
			case Destroy:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
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
		public TerminalNode Create() { return getToken(MiLenguajeParser.Create, 0); }
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
		enterRule(_localctx, 62, RULE_create_cap_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(ID);
			setState(527);
			match(TK_ASSIGN);
			setState(528);
			match(Create);
			setState(529);
			match(ID);
			setState(530);
			match(TK_LEFT_PARENTHESES);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << RESERVED_WORD_F) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << REAL) | (1L << STRING))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ID - 69)) | (1L << (TK_LEFT_BRACKET - 69)) | (1L << (TK_LEFT_PARENTHESES - 69)) | (1L << (TK_INCREMENT - 69)) | (1L << (TK_DECREMENT - 69)) | (1L << (TK_NOT - 69)) | (1L << (TK_PLUS - 69)) | (1L << (TK_MINUS - 69)) | (1L << (TK_ADDRESS - 69)))) != 0)) {
				{
				setState(531);
				comma_expressions_params();
				}
			}

			setState(534);
			match(TK_RIGHT_PARENTHESES);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(535);
				match(T__0);
				setState(536);
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
		public TerminalNode Destroy() { return getToken(MiLenguajeParser.Destroy, 0); }
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
		enterRule(_localctx, 64, RULE_destroy_cap_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(Destroy);
			setState(540);
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
		enterRule(_localctx, 66, RULE_operation_invocation);
		try {
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Call:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				call_expression();
				}
				break;
			case Send:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				send_expression();
				}
				break;
			case Co:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
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
		public TerminalNode Call() { return getToken(MiLenguajeParser.Call, 0); }
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
		enterRule(_localctx, 68, RULE_call_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Call) {
				{
				setState(547);
				match(Call);
				}
			}

			setState(550);
			match(ID);
			setState(551);
			match(TK_LEFT_PARENTHESES);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << RESERVED_WORD_F) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << REAL) | (1L << STRING))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ID - 69)) | (1L << (TK_LEFT_BRACKET - 69)) | (1L << (TK_LEFT_PARENTHESES - 69)) | (1L << (TK_INCREMENT - 69)) | (1L << (TK_DECREMENT - 69)) | (1L << (TK_NOT - 69)) | (1L << (TK_PLUS - 69)) | (1L << (TK_MINUS - 69)) | (1L << (TK_ADDRESS - 69)))) != 0)) {
				{
				setState(552);
				comma_expressions_params();
				}
			}

			setState(555);
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
		public TerminalNode Send() { return getToken(MiLenguajeParser.Send, 0); }
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
		enterRule(_localctx, 70, RULE_send_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(Send);
			setState(558);
			match(ID);
			setState(559);
			match(TK_LEFT_PARENTHESES);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << RESERVED_WORD_F) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << REAL) | (1L << STRING))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ID - 69)) | (1L << (TK_LEFT_BRACKET - 69)) | (1L << (TK_LEFT_PARENTHESES - 69)) | (1L << (TK_INCREMENT - 69)) | (1L << (TK_DECREMENT - 69)) | (1L << (TK_NOT - 69)) | (1L << (TK_PLUS - 69)) | (1L << (TK_MINUS - 69)) | (1L << (TK_ADDRESS - 69)))) != 0)) {
				{
				setState(560);
				comma_expressions_params();
				}
			}

			setState(563);
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
		public TerminalNode Co() { return getToken(MiLenguajeParser.Co, 0); }
		public Call_invocationContext call_invocation() {
			return getRuleContext(Call_invocationContext.class,0);
		}
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public TerminalNode To() { return getToken(MiLenguajeParser.To, 0); }
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
		enterRule(_localctx, 72, RULE_concurrent_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(Co);
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LEFT_PARENTHESES) {
				{
				setState(566);
				match(TK_LEFT_PARENTHESES);
				setState(567);
				quantifier();
				setState(568);
				match(To);
				setState(569);
				match(ID);
				setState(570);
				match(TK_RIGHT_PARENTHESES);
				}
			}

			setState(574);
			call_invocation();
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EXECUTE) {
				{
				setState(575);
				match(TK_EXECUTE);
				setState(576);
				block();
				}
			}

			setState(579);
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
		public TerminalNode Call() { return getToken(MiLenguajeParser.Call, 0); }
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
		enterRule(_localctx, 74, RULE_call_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Call) {
				{
				setState(581);
				match(Call);
				}
			}

			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(584);
				match(ID);
				setState(585);
				assigns();
				setState(591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(586);
					binary_expression();
					}
					break;
				case 2:
					{
					setState(589);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(587);
						match(ID);
						}
						break;
					case TK_LEFT_BRACKET:
						{
						setState(588);
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
				setState(593);
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
		enterRule(_localctx, 76, RULE_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(ID);
			setState(597);
			match(TK_COLON);
			setState(598);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Comma_expressions_paramsContext comma_expressions_params() {
			return getRuleContext(Comma_expressions_paramsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Tk_increment() { return getToken(MiLenguajeParser.Tk_increment, 0); }
		public TerminalNode Tk_decrement() { return getToken(MiLenguajeParser.Tk_decrement, 0); }
		public TerminalNode If() { return getToken(MiLenguajeParser.If, 0); }
		public TerminalNode TK_EXECUTE() { return getToken(MiLenguajeParser.TK_EXECUTE, 0); }
		public TerminalNode Fi() { return getToken(MiLenguajeParser.Fi, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<If_innerContext> if_inner() {
			return getRuleContexts(If_innerContext.class);
		}
		public If_innerContext if_inner(int i) {
			return getRuleContext(If_innerContext.class,i);
		}
		public TerminalNode Do() { return getToken(MiLenguajeParser.Do, 0); }
		public TerminalNode Od() { return getToken(MiLenguajeParser.Od, 0); }
		public TerminalNode Fa() { return getToken(MiLenguajeParser.Fa, 0); }
		public For_exprContext for_expr() {
			return getRuleContext(For_exprContext.class,0);
		}
		public TerminalNode Af() { return getToken(MiLenguajeParser.Af, 0); }
		public TerminalNode Next() { return getToken(MiLenguajeParser.Next, 0); }
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
		enterRule(_localctx, 78, RULE_sequential);
		int _la;
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(602);
					comma_expressions_params();
					}
					break;
				case 2:
					{
					setState(603);
					expression();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				var();
				setState(607);
				match(Tk_increment);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(609);
				var();
				setState(610);
				match(Tk_decrement);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(612);
				match(If);
				setState(615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(613);
					boolean_expression();
					}
					break;
				case 2:
					{
					setState(614);
					binary_expression();
					}
					break;
				}
				setState(617);
				match(TK_EXECUTE);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << RESERVED_WORD_F) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << REAL) | (1L << STRING) | (1L << If) | (1L << Do) | (1L << Type) | (1L << Optype) | (1L << Import) | (1L << Send) | (1L << Fa) | (1L << Var) | (1L << Op) | (1L << Destroy) | (1L << Next) | (1L << Co) | (1L << Const))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Call - 66)) | (1L << (ID - 66)) | (1L << (TK_LEFT_BRACKET - 66)) | (1L << (TK_LEFT_PARENTHESES - 66)) | (1L << (TK_INCREMENT - 66)) | (1L << (TK_DECREMENT - 66)) | (1L << (TK_NOT - 66)) | (1L << (TK_PLUS - 66)) | (1L << (TK_MINUS - 66)) | (1L << (TK_ADDRESS - 66)))) != 0)) {
					{
					{
					setState(618);
					block();
					}
					}
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEPARA) {
					{
					{
					setState(624);
					if_inner();
					}
					}
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(630);
				match(Fi);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(632);
				match(Do);
				setState(635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(633);
					boolean_expression();
					}
					break;
				case 2:
					{
					setState(634);
					binary_expression();
					}
					break;
				}
				setState(637);
				match(TK_EXECUTE);
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << RESERVED_WORD_F) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << REAL) | (1L << STRING) | (1L << If) | (1L << Do) | (1L << Type) | (1L << Optype) | (1L << Import) | (1L << Send) | (1L << Fa) | (1L << Var) | (1L << Op) | (1L << Destroy) | (1L << Next) | (1L << Co) | (1L << Const))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Call - 66)) | (1L << (ID - 66)) | (1L << (TK_LEFT_BRACKET - 66)) | (1L << (TK_LEFT_PARENTHESES - 66)) | (1L << (TK_INCREMENT - 66)) | (1L << (TK_DECREMENT - 66)) | (1L << (TK_NOT - 66)) | (1L << (TK_PLUS - 66)) | (1L << (TK_MINUS - 66)) | (1L << (TK_ADDRESS - 66)))) != 0)) {
					{
					{
					setState(638);
					block();
					}
					}
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(644);
				match(Od);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(646);
				match(Fa);
				setState(647);
				for_expr();
				setState(648);
				block();
				setState(649);
				match(Af);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(651);
				match(T__3);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(652);
				match(Next);
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

	public static class If_innerContext extends ParserRuleContext {
		public TerminalNode TK_SEPARA() { return getToken(MiLenguajeParser.TK_SEPARA, 0); }
		public TerminalNode TK_EXECUTE() { return getToken(MiLenguajeParser.TK_EXECUTE, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public If_innerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_inner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIf_inner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIf_inner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIf_inner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_innerContext if_inner() throws RecognitionException {
		If_innerContext _localctx = new If_innerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_if_inner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(655);
			match(TK_SEPARA);
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(656);
				boolean_expression();
				}
				break;
			case 2:
				{
				setState(657);
				binary_expression();
				}
				break;
			}
			setState(660);
			match(TK_EXECUTE);
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << RESERVED_WORD_F) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << REAL) | (1L << STRING) | (1L << If) | (1L << Do) | (1L << Type) | (1L << Optype) | (1L << Import) | (1L << Send) | (1L << Fa) | (1L << Var) | (1L << Op) | (1L << Destroy) | (1L << Next) | (1L << Co) | (1L << Const))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Call - 66)) | (1L << (ID - 66)) | (1L << (TK_LEFT_BRACKET - 66)) | (1L << (TK_LEFT_PARENTHESES - 66)) | (1L << (TK_INCREMENT - 66)) | (1L << (TK_DECREMENT - 66)) | (1L << (TK_NOT - 66)) | (1L << (TK_PLUS - 66)) | (1L << (TK_MINUS - 66)) | (1L << (TK_ADDRESS - 66)))) != 0)) {
				{
				{
				setState(661);
				block();
				}
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Boolean_expressionContext extends ParserRuleContext {
		public TerminalNode TK_LEFT_PARENTHESES() { return getToken(MiLenguajeParser.TK_LEFT_PARENTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_RIGHT_PARENTHESES() { return getToken(MiLenguajeParser.TK_RIGHT_PARENTHESES, 0); }
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(MiLenguajeParser.BOOLEAN, 0); }
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBoolean_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_boolean_expression);
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(TK_LEFT_PARENTHESES);
				setState(668);
				expression();
				setState(669);
				match(TK_RIGHT_PARENTHESES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				binary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
				match(BOOLEAN);
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

	public static class For_exprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode To() { return getToken(MiLenguajeParser.To, 0); }
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public TerminalNode TK_EXECUTE() { return getToken(MiLenguajeParser.TK_EXECUTE, 0); }
		public List<For_expr_LsContext> for_expr_Ls() {
			return getRuleContexts(For_expr_LsContext.class);
		}
		public For_expr_LsContext for_expr_Ls(int i) {
			return getRuleContext(For_expr_LsContext.class,i);
		}
		public For_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_exprContext for_expr() throws RecognitionException {
		For_exprContext _localctx = new For_exprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_for_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			expression();
			setState(677);
			match(To);
			setState(678);
			binary_expression();
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(679);
				for_expr_Ls();
				}
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685);
			match(TK_EXECUTE);
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

	public static class For_expr_LsContext extends ParserRuleContext {
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode To() { return getToken(MiLenguajeParser.To, 0); }
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public For_expr_LsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expr_Ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFor_expr_Ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFor_expr_Ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFor_expr_Ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_expr_LsContext for_expr_Ls() throws RecognitionException {
		For_expr_LsContext _localctx = new For_expr_LsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_for_expr_Ls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(TK_COMMA);
			setState(688);
			expression();
			setState(689);
			match(To);
			setState(690);
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

	public static class Block_cycleContext extends ParserRuleContext {
		public Comma_expressions_paramsContext comma_expressions_params() {
			return getRuleContext(Comma_expressions_paramsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Block_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBlock_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBlock_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBlock_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_cycleContext block_cycle() throws RecognitionException {
		Block_cycleContext _localctx = new Block_cycleContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_block_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(692);
				comma_expressions_params();
				}
				break;
			case 2:
				{
				setState(693);
				expression();
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
		enterRule(_localctx, 90, RULE_operation_service);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(T__4);
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
		enterRule(_localctx, 92, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			assign();
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
		public TerminalNode TK_SWAP() { return getToken(MiLenguajeParser.TK_SWAP, 0); }
		public List<Assign_sliceContext> assign_slice() {
			return getRuleContexts(Assign_sliceContext.class);
		}
		public Assign_sliceContext assign_slice(int i) {
			return getRuleContext(Assign_sliceContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
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
		enterRule(_localctx, 94, RULE_assign);
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(700);
					assign_slice();
					}
					break;
				case TK_LEFT_BRACKET:
					{
					setState(701);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(704);
				match(TK_SWAP);
				setState(707);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(705);
					assign_slice();
					}
					break;
				case TK_LEFT_BRACKET:
					{
					setState(706);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				assign_slice();
				setState(710);
				assigns();
				setState(716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(711);
					binary_expression();
					}
					break;
				case 2:
					{
					setState(714);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(712);
						assign_slice();
						}
						break;
					case TK_LEFT_BRACKET:
						{
						setState(713);
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

	public static class Assign_sliceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public Subscript_sliceContext subscript_slice() {
			return getRuleContext(Subscript_sliceContext.class,0);
		}
		public Assign_sliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterAssign_slice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitAssign_slice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitAssign_slice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_sliceContext assign_slice() throws RecognitionException {
		Assign_sliceContext _localctx = new Assign_sliceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_assign_slice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(ID);
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(721);
				subscript_slice();
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
		enterRule(_localctx, 98, RULE_binary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
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
		enterRule(_localctx, 100, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			and_expression();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_OR || _la==TK_XOR) {
				{
				{
				setState(727);
				_la = _input.LA(1);
				if ( !(_la==TK_OR || _la==TK_XOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(728);
				and_expression();
				}
				}
				setState(733);
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
		enterRule(_localctx, 102, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			comp_expression();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_AND) {
				{
				{
				setState(735);
				match(TK_AND);
				setState(736);
				comp_expression();
				}
				}
				setState(741);
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
		enterRule(_localctx, 104, RULE_comp_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			shift_expression();
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					comps();
					setState(744);
					shift_expression();
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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
		enterRule(_localctx, 106, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			simple_op_expression();
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_LEFT_SHIFT) {
				{
				{
				setState(752);
				_la = _input.LA(1);
				if ( !(_la==TK_LEFT_SHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(753);
				simple_op_expression();
				}
				}
				setState(758);
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
		enterRule(_localctx, 108, RULE_simple_op_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			other_op_expression();
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(760);
					simple_op();
					setState(761);
					other_op_expression();
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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
		enterRule(_localctx, 110, RULE_other_op_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			exponentiation_expression();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (TK_MULTIPLICATION - 93)) | (1L << (TK_DIVISION - 93)) | (1L << (TK_REMAINDER - 93)) | (1L << (TK_MODULUS - 93)))) != 0)) {
				{
				{
				setState(769);
				other_op();
				setState(770);
				exponentiation_expression();
				}
				}
				setState(776);
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
		enterRule(_localctx, 112, RULE_exponentiation_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(777);
					unary_expression();
					setState(778);
					match(TK_EXPONENTIATION);
					}
					} 
				}
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			setState(785);
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
		enterRule(_localctx, 114, RULE_unary_expression);
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				post_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				pre_op();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(789);
				single_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(790);
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
		enterRule(_localctx, 116, RULE_post_op);
		int _la;
		try {
			int _alt;
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				_la = _input.LA(1);
				if ( !(_la==REAL || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(794);
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
				setState(795);
				match(ID);
				}
				setState(796);
				match(TK_POINTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_LEFT_BRACKET:
					{
					setState(797);
					array();
					}
					break;
				case STRING:
					{
					setState(798);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(801);
						subscript_slice();
						}
						} 
					}
					setState(806);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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
		enterRule(_localctx, 118, RULE_pre_op);
		int _la;
		try {
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				match(TK_NOT);
				setState(810);
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
				setState(811);
				sign_change();
				setState(812);
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
				setState(814);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENT || _la==TK_DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(815);
				_la = _input.LA(1);
				if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (INT - 10)) | (1L << (REAL - 10)) | (1L << (ID - 10)))) != 0)) ) {
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
				setState(816);
				match(TK_ADDRESS);
				setState(817);
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
		public TerminalNode BOOLEAN() { return getToken(MiLenguajeParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 120, RULE_single_expr);
		try {
			setState(827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(822);
				match(STRING);
				}
				break;
			case TK_LEFT_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(823);
				array();
				}
				break;
			case TK_LEFT_PARENTHESES:
				enterOuterAlt(_localctx, 5);
				{
				setState(824);
				grouping();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(825);
				match(BOOLEAN);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(826);
				match(T__5);
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
		enterRule(_localctx, 122, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(TK_LEFT_BRACKET);
			setState(830);
			_la = _input.LA(1);
			if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (BOOLEAN - 8)) | (1L << (NUMBER - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(831);
				match(TK_COMMA);
				setState(832);
				_la = _input.LA(1);
				if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (BOOLEAN - 8)) | (1L << (NUMBER - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(838);
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
		public List<TerminalNode> TK_MULTIPLICATION() { return getTokens(MiLenguajeParser.TK_MULTIPLICATION); }
		public TerminalNode TK_MULTIPLICATION(int i) {
			return getToken(MiLenguajeParser.TK_MULTIPLICATION, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(MiLenguajeParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(MiLenguajeParser.TK_COMMA, i);
		}
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
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
		enterRule(_localctx, 124, RULE_subscript_slice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(TK_LEFT_BRACKET);
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(841);
				subscript();
				}
				break;
			case 2:
				{
				setState(842);
				slice();
				}
				break;
			case 3:
				{
				setState(843);
				match(TK_MULTIPLICATION);
				}
				break;
			}
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(846);
				match(TK_COMMA);
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(847);
					subscript();
					}
					break;
				case 2:
					{
					setState(848);
					slice();
					}
					break;
				case 3:
					{
					setState(849);
					match(TK_MULTIPLICATION);
					}
					break;
				}
				}
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(857);
			match(TK_RIGHT_BRACKET);
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(858);
				match(TK_COLON);
				setState(861);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(859);
					match(ID);
					}
					break;
				case Int:
				case Char:
				case Chars:
				case Bool:
				case Real:
				case String:
					{
					setState(860);
					data_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		enterRule(_localctx, 126, RULE_slice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			subscript();
			setState(866);
			match(TK_COLON);
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case RESERVED_WORD_F:
			case BOOLEAN:
			case NUMBER:
			case REAL:
			case STRING:
			case ID:
			case TK_LEFT_BRACKET:
			case TK_LEFT_PARENTHESES:
			case TK_INCREMENT:
			case TK_DECREMENT:
			case TK_NOT:
			case TK_PLUS:
			case TK_MINUS:
			case TK_ADDRESS:
				{
				setState(867);
				subscript();
				}
				break;
			case TK_MULTIPLICATION:
				{
				setState(868);
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
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
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
		enterRule(_localctx, 128, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(871);
				match(ID);
				}
				break;
			case 2:
				{
				setState(872);
				binary_expression();
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
		enterRule(_localctx, 130, RULE_grouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(TK_LEFT_PARENTHESES);
			setState(876);
			binary_expression();
			setState(877);
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
		enterRule(_localctx, 132, RULE_sign_change);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
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
		enterRule(_localctx, 134, RULE_assigns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (TK_ASSIGN - 109)) | (1L << (TK_INCREMENT_ASSIGN - 109)) | (1L << (TK_DECREMENT_ASSIGN - 109)) | (1L << (TK_MULTIPLICATION_ASSIGN - 109)) | (1L << (TK_DIVISION_ASSIGN - 109)) | (1L << (TK_REMAINDER_ASSIGN - 109)) | (1L << (TK_EXPONENTIATION_ASSIGN - 109)) | (1L << (TK_OR_ASSIGN - 109)) | (1L << (TK_AND_ASSIGN - 109)) | (1L << (TK_CONCAT_ASSIGN - 109)) | (1L << (TK_LEFT_SHIFT_ASSIGN - 109)) | (1L << (TK_RIGHT_SHIFT_ASSIGN - 109)))) != 0)) ) {
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
		enterRule(_localctx, 136, RULE_comps);
		try {
			setState(890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case RESERVED_WORD_F:
			case BOOLEAN:
			case NUMBER:
			case REAL:
			case STRING:
			case ID:
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
				setState(884);
				match(TK_EQUAL);
				}
				break;
			case TK_NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(885);
				match(TK_NOT_EQUAL);
				}
				break;
			case TK_GREATER:
				enterOuterAlt(_localctx, 4);
				{
				setState(886);
				match(TK_GREATER);
				}
				break;
			case TK_GREATER_EQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(887);
				match(TK_GREATER_EQUAL);
				}
				break;
			case TK_lESS:
				enterOuterAlt(_localctx, 6);
				{
				setState(888);
				match(TK_lESS);
				}
				break;
			case TK_LESS_EQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(889);
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
		enterRule(_localctx, 138, RULE_simple_op);
		try {
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(TK_CONTAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(894);
				match(TK_PLUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(895);
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
		enterRule(_localctx, 140, RULE_other_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (TK_MULTIPLICATION - 93)) | (1L << (TK_DIVISION - 93)) | (1L << (TK_REMAINDER - 93)) | (1L << (TK_MODULUS - 93)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0082\u0387\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\6\2\u0092\n\2\r\2\16\2\u0093\3\3\3\3\3\3\5\3\u0099\n\3\3\4\3\4\3\4\3"+
		"\4\7\4\u009f\n\4\f\4\16\4\u00a2\13\4\3\4\3\4\3\5\5\5\u00a7\n\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00ad\n\5\3\5\5\5\u00b0\n\5\3\5\3\5\3\5\5\5\u00b5\n\5\3\6"+
		"\3\6\3\6\3\6\5\6\u00bb\n\6\3\6\5\6\u00be\n\6\3\6\3\6\3\7\3\7\3\b\5\b\u00c5"+
		"\n\b\3\b\3\b\5\b\u00c9\n\b\3\b\5\b\u00cc\n\b\3\b\3\b\3\b\7\b\u00d1\n\b"+
		"\f\b\16\b\u00d4\13\b\3\b\3\b\5\b\u00d8\n\b\3\b\5\b\u00db\n\b\3\b\3\b\5"+
		"\b\u00df\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00e7\n\t\f\t\16\t\u00ea\13\t"+
		"\3\n\3\n\3\n\3\n\7\n\u00f0\n\n\f\n\16\n\u00f3\13\n\3\n\5\n\u00f6\n\n\3"+
		"\13\3\13\3\13\5\13\u00fb\n\13\3\f\3\f\3\f\3\f\5\f\u0101\n\f\3\f\3\f\5"+
		"\f\u0105\n\f\3\f\5\f\u0108\n\f\3\f\3\f\3\f\3\f\5\f\u010e\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0118\n\r\3\16\5\16\u011b\n\16\3\16\3\16\3"+
		"\16\5\16\u0120\n\16\3\16\7\16\u0123\n\16\f\16\16\16\u0126\13\16\3\17\3"+
		"\17\3\17\3\17\5\17\u012c\n\17\3\17\3\17\5\17\u0130\n\17\3\17\5\17\u0133"+
		"\n\17\3\17\3\17\3\17\5\17\u0138\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0141\n\20\3\20\3\20\3\20\5\20\u0146\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u014d\n\21\3\22\3\22\3\22\5\22\u0152\n\22\3\22\3\22\3\22\5\22"+
		"\u0157\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u015e\n\23\3\23\3\23\3\23\3"+
		"\23\5\23\u0164\n\23\3\23\3\23\3\23\3\24\7\24\u016a\n\24\f\24\16\24\u016d"+
		"\13\24\3\24\6\24\u0170\n\24\r\24\16\24\u0171\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u017c\n\25\3\25\5\25\u017f\n\25\3\26\3\26\3\26\3"+
		"\26\5\26\u0185\n\26\3\26\5\26\u0188\n\26\3\27\3\27\7\27\u018c\n\27\f\27"+
		"\16\27\u018f\13\27\3\27\3\27\3\27\7\27\u0194\n\27\f\27\16\27\u0197\13"+
		"\27\7\27\u0199\n\27\f\27\16\27\u019c\13\27\3\30\3\30\7\30\u01a0\n\30\f"+
		"\30\16\30\u01a3\13\30\3\30\5\30\u01a6\n\30\3\30\3\30\3\30\7\30\u01ab\n"+
		"\30\f\30\16\30\u01ae\13\30\3\30\5\30\u01b1\n\30\7\30\u01b3\n\30\f\30\16"+
		"\30\u01b6\13\30\3\31\3\31\3\31\7\31\u01bb\n\31\f\31\16\31\u01be\13\31"+
		"\3\32\3\32\3\32\7\32\u01c3\n\32\f\32\16\32\u01c6\13\32\3\32\7\32\u01c9"+
		"\n\32\f\32\16\32\u01cc\13\32\3\32\3\32\3\32\3\32\3\32\5\32\u01d3\n\32"+
		"\5\32\u01d5\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u01de\n\34\5"+
		"\34\u01e0\n\34\3\34\5\34\u01e3\n\34\3\35\5\35\u01e6\n\35\3\35\3\35\3\35"+
		"\3\35\5\35\u01ec\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u01f3\n\35\3\35\5"+
		"\35\u01f6\n\35\5\35\u01f8\n\35\3\35\5\35\u01fb\n\35\3\36\3\36\3\36\5\36"+
		"\u0200\n\36\5\36\u0202\n\36\3\36\3\36\3\37\3\37\3\37\5\37\u0209\n\37\3"+
		"\37\3\37\3 \3 \5 \u020f\n \3!\3!\3!\3!\3!\3!\5!\u0217\n!\3!\3!\3!\5!\u021c"+
		"\n!\3\"\3\"\3\"\3#\3#\3#\5#\u0224\n#\3$\5$\u0227\n$\3$\3$\3$\5$\u022c"+
		"\n$\3$\3$\3%\3%\3%\3%\5%\u0234\n%\3%\3%\3&\3&\3&\3&\3&\3&\3&\5&\u023f"+
		"\n&\3&\3&\3&\5&\u0244\n&\3&\3&\3\'\5\'\u0249\n\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u0250\n\'\5\'\u0252\n\'\3\'\5\'\u0255\n\'\3(\3(\3(\3(\3)\3)\3)\3)\5"+
		")\u025f\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u026a\n)\3)\3)\7)\u026e\n)\f"+
		")\16)\u0271\13)\3)\7)\u0274\n)\f)\16)\u0277\13)\3)\3)\3)\3)\3)\5)\u027e"+
		"\n)\3)\3)\7)\u0282\n)\f)\16)\u0285\13)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0290"+
		"\n)\3*\3*\3*\5*\u0295\n*\3*\3*\7*\u0299\n*\f*\16*\u029c\13*\3+\3+\3+\3"+
		"+\3+\3+\3+\5+\u02a5\n+\3,\3,\3,\3,\7,\u02ab\n,\f,\16,\u02ae\13,\3,\3,"+
		"\3-\3-\3-\3-\3-\3.\3.\5.\u02b9\n.\3/\3/\3\60\3\60\3\61\3\61\5\61\u02c1"+
		"\n\61\3\61\3\61\3\61\5\61\u02c6\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u02cd"+
		"\n\61\5\61\u02cf\n\61\5\61\u02d1\n\61\3\62\3\62\5\62\u02d5\n\62\3\63\3"+
		"\63\3\64\3\64\3\64\7\64\u02dc\n\64\f\64\16\64\u02df\13\64\3\65\3\65\3"+
		"\65\7\65\u02e4\n\65\f\65\16\65\u02e7\13\65\3\66\3\66\3\66\3\66\7\66\u02ed"+
		"\n\66\f\66\16\66\u02f0\13\66\3\67\3\67\3\67\7\67\u02f5\n\67\f\67\16\67"+
		"\u02f8\13\67\38\38\38\38\78\u02fe\n8\f8\168\u0301\138\39\39\39\39\79\u0307"+
		"\n9\f9\169\u030a\139\3:\3:\3:\7:\u030f\n:\f:\16:\u0312\13:\3:\3:\3;\3"+
		";\3;\3;\5;\u031a\n;\3<\3<\3<\3<\3<\3<\5<\u0322\n<\3<\7<\u0325\n<\f<\16"+
		"<\u0328\13<\5<\u032a\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0335\n=\3>\3>\3"+
		">\3>\3>\3>\3>\5>\u033e\n>\3?\3?\3?\3?\7?\u0344\n?\f?\16?\u0347\13?\3?"+
		"\3?\3@\3@\3@\3@\5@\u034f\n@\3@\3@\3@\3@\5@\u0355\n@\7@\u0357\n@\f@\16"+
		"@\u035a\13@\3@\3@\3@\3@\5@\u0360\n@\5@\u0362\n@\3A\3A\3A\3A\5A\u0368\n"+
		"A\3B\3B\5B\u036c\nB\3C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3F\3F\3F\3F\3F\5F\u037d"+
		"\nF\3G\3G\3G\3G\5G\u0383\nG\3H\3H\3H\2\2I\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\2\17\5\2\31\31\66\66??\5\2"+
		"\35\35\67:@@\3\2mn\3\2dd\4\2\r\rGG\3\2VW\4\2\n\n\f\f\3\2\f\r\4\2\f\rG"+
		"G\5\2\n\13\16\16GG\3\2Z[\4\2ooq{\3\2_b\2\u03f1\2\u0091\3\2\2\2\4\u0098"+
		"\3\2\2\2\6\u009a\3\2\2\2\b\u00a6\3\2\2\2\n\u00b6\3\2\2\2\f\u00c1\3\2\2"+
		"\2\16\u00c4\3\2\2\2\20\u00e0\3\2\2\2\22\u00eb\3\2\2\2\24\u00f7\3\2\2\2"+
		"\26\u010d\3\2\2\2\30\u010f\3\2\2\2\32\u011a\3\2\2\2\34\u0137\3\2\2\2\36"+
		"\u0139\3\2\2\2 \u0147\3\2\2\2\"\u014e\3\2\2\2$\u0158\3\2\2\2&\u016b\3"+
		"\2\2\2(\u017b\3\2\2\2*\u0184\3\2\2\2,\u0189\3\2\2\2.\u01a5\3\2\2\2\60"+
		"\u01b7\3\2\2\2\62\u01bf\3\2\2\2\64\u01d6\3\2\2\2\66\u01d8\3\2\2\28\u01e5"+
		"\3\2\2\2:\u0201\3\2\2\2<\u0205\3\2\2\2>\u020e\3\2\2\2@\u0210\3\2\2\2B"+
		"\u021d\3\2\2\2D\u0223\3\2\2\2F\u0226\3\2\2\2H\u022f\3\2\2\2J\u0237\3\2"+
		"\2\2L\u0248\3\2\2\2N\u0256\3\2\2\2P\u028f\3\2\2\2R\u0291\3\2\2\2T\u02a4"+
		"\3\2\2\2V\u02a6\3\2\2\2X\u02b1\3\2\2\2Z\u02b8\3\2\2\2\\\u02ba\3\2\2\2"+
		"^\u02bc\3\2\2\2`\u02d0\3\2\2\2b\u02d2\3\2\2\2d\u02d6\3\2\2\2f\u02d8\3"+
		"\2\2\2h\u02e0\3\2\2\2j\u02e8\3\2\2\2l\u02f1\3\2\2\2n\u02f9\3\2\2\2p\u0302"+
		"\3\2\2\2r\u0310\3\2\2\2t\u0319\3\2\2\2v\u0329\3\2\2\2x\u0334\3\2\2\2z"+
		"\u033d\3\2\2\2|\u033f\3\2\2\2~\u034a\3\2\2\2\u0080\u0363\3\2\2\2\u0082"+
		"\u036b\3\2\2\2\u0084\u036d\3\2\2\2\u0086\u0371\3\2\2\2\u0088\u0373\3\2"+
		"\2\2\u008a\u037c\3\2\2\2\u008c\u0382\3\2\2\2\u008e\u0384\3\2\2\2\u0090"+
		"\u0092\5\4\3\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\3\3\2\2\2\u0095\u0099\5\b\5\2\u0096\u0099"+
		"\5\6\4\2\u0097\u0099\5\n\6\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\5\3\2\2\2\u009a\u009b\7\20\2\2\u009b\u00a0\7G\2\2"+
		"\u009c\u009f\5\24\13\2\u009d\u009f\5\26\f\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4"+
		"\7\3\2\2\2\u00a5\u00a7\5\20\t\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2"+
		"\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00af\7G\2\2\u00aa\u00ac"+
		"\7M\2\2\u00ab\u00ad\5\60\31\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae\u00b0\7N\2\2\u00af\u00aa\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b5\7F\2\2\u00b2\u00b5\5\f\7\2\u00b3"+
		"\u00b5\5\n\6\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2"+
		"\2\2\u00b5\t\3\2\2\2\u00b6\u00b7\7(\2\2\u00b7\u00bd\7G\2\2\u00b8\u00ba"+
		"\7M\2\2\u00b9\u00bb\5\60\31\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bc\u00be\7N\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\5\16\b\2\u00c0\13\3\2\2\2\u00c1"+
		"\u00c2\5\16\b\2\u00c2\r\3\2\2\2\u00c3\u00c5\5(\25\2\u00c4\u00c3\3\2\2"+
		"\2\u00c4\u00c5\3\2\2\2\u00c5\u00cb\3\2\2\2\u00c6\u00c8\7\u0080\2\2\u00c7"+
		"\u00c9\5&\24\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\7#\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00d2\3\2\2\2\u00cd\u00d1\5$\23\2\u00ce\u00d1\5(\25\2\u00cf\u00d1\5*"+
		"\26\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00da\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\7\65\2\2\u00d6\u00d8\5&\24\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\7#"+
		"\2\2\u00da\u00d5\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00df\7#\2\2\u00dd\u00df\5\n\6\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2"+
		"\2\2\u00df\17\3\2\2\2\u00e0\u00e1\7\17\2\2\u00e1\u00e8\7G\2\2\u00e2\u00e7"+
		"\5\22\n\2\u00e3\u00e7\5\24\13\2\u00e4\u00e7\5\26\f\2\u00e5\u00e7\5 \21"+
		"\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\21\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7 \2\2\u00ec\u00f1\7G\2\2"+
		"\u00ed\u00ee\7U\2\2\u00ee\u00f0\7G\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f6\7S\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\23\3\2\2\2\u00f7\u00fa\7A\2\2\u00f8\u00fb\5\66\34\2\u00f9\u00fb"+
		"\58\35\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\25\3\2\2\2\u00fc"+
		"\u00fd\7\32\2\2\u00fd\u00fe\5,\27\2\u00fe\u0104\7T\2\2\u00ff\u0101\7\37"+
		"\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0105\7G\2\2\u0103\u0105\5\64\33\2\u0104\u0100\3\2\2\2\u0104\u0103\3"+
		"\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\58\35\2\u0107\u0106\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010e\3\2\2\2\u0109\u010a\7\32\2\2\u010a\u010e\5"+
		"8\35\2\u010b\u010c\7\32\2\2\u010c\u010e\5\66\34\2\u010d\u00fc\3\2\2\2"+
		"\u010d\u0109\3\2\2\2\u010d\u010b\3\2\2\2\u010e\27\3\2\2\2\u010f\u0110"+
		"\7\33\2\2\u0110\u0111\7G\2\2\u0111\u0112\7f\2\2\u0112\u0113\7M\2\2\u0113"+
		"\u0114\5\32\16\2\u0114\u0117\7N\2\2\u0115\u0116\7/\2\2\u0116\u0118\5\62"+
		"\32\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\31\3\2\2\2\u0119\u011b"+
		"\7\21\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u0124\5\62\32\2\u011d\u011f\7S\2\2\u011e\u0120\7\21\2\2\u011f\u011e"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\5\62\32\2"+
		"\u0122\u011d\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\33\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7+\2\2\u0128"+
		"\u0129\5,\27\2\u0129\u012f\7T\2\2\u012a\u012c\7\37\2\2\u012b\u012a\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\7G\2\2\u012e"+
		"\u0130\5\64\33\2\u012f\u012b\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0132\3"+
		"\2\2\2\u0131\u0133\58\35\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0138\3\2\2\2\u0134\u0135\7+\2\2\u0135\u0138\58\35\2\u0136\u0138\5\36"+
		"\20\2\u0137\u0127\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\35\3\2\2\2\u0139\u013a\7+\2\2\u013a\u013b\7G\2\2\u013b\u013c\7o\2\2\u013c"+
		"\u013d\7\"\2\2\u013d\u013e\7G\2\2\u013e\u0140\7M\2\2\u013f\u0141\5.\30"+
		"\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145"+
		"\7N\2\2\u0143\u0144\7\3\2\2\u0144\u0146\7G\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\37\3\2\2\2\u0147\u0148\7\62\2\2\u0148\u014c\5,\27"+
		"\2\u0149\u014d\5\"\22\2\u014a\u014b\7T\2\2\u014b\u014d\7G\2\2\u014c\u0149"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014d!\3\2\2\2\u014e\u0151\7M\2\2\u014f\u0152"+
		"\5\60\31\2\u0150\u0152\5\32\16\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2"+
		"\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\7N\2\2\u0154\u0155"+
		"\7/\2\2\u0155\u0157\5\62\32\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2"+
		"\u0157#\3\2\2\2\u0158\u0159\t\2\2\2\u0159\u015a\7G\2\2\u015a\u015d\7M"+
		"\2\2\u015b\u015e\5.\30\2\u015c\u015e\5\62\32\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7N"+
		"\2\2\u0160\u0163\3\2\2\2\u0161\u0162\7/\2\2\u0162\u0164\5\62\32\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\5&"+
		"\24\2\u0166\u0167\7#\2\2\u0167%\3\2\2\2\u0168\u016a\5(\25\2\u0169\u0168"+
		"\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\5*\26\2\u016f\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\'\3\2\2\2\u0173\u017c\5\24\13\2\u0174\u017c\5\26\f\2\u0175\u017c\5\30"+
		"\r\2\u0176\u017c\5\34\17\2\u0177\u017c\5 \21\2\u0178\u017c\5:\36\2\u0179"+
		"\u017c\5^\60\2\u017a\u017c\5\22\n\2\u017b\u0173\3\2\2\2\u017b\u0174\3"+
		"\2\2\2\u017b\u0175\3\2\2\2\u017b\u0176\3\2\2\2\u017b\u0177\3\2\2\2\u017b"+
		"\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c\u017e\3\2"+
		"\2\2\u017d\u017f\7S\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		")\3\2\2\2\u0180\u0185\5P)\2\u0181\u0185\5D#\2\u0182\u0185\5\\/\2\u0183"+
		"\u0185\5> \2\u0184\u0180\3\2\2\2\u0184\u0181\3\2\2\2\u0184\u0182\3\2\2"+
		"\2\u0184\u0183\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0188\7S\2\2\u0187\u0186"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188+\3\2\2\2\u0189\u018d\7G\2\2\u018a\u018c"+
		"\5~@\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u019a\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7U"+
		"\2\2\u0191\u0195\7G\2\2\u0192\u0194\5~@\2\u0193\u0192\3\2\2\2\u0194\u0197"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u0190\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b-\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u01a1"+
		"\7G\2\2\u019e\u01a0\5~@\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a6\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u01a6\5d\63\2\u01a5\u019d\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6"+
		"\u01b4\3\2\2\2\u01a7\u01b0\7U\2\2\u01a8\u01ac\7G\2\2\u01a9\u01ab\5~@\2"+
		"\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad"+
		"\3\2\2\2\u01ad\u01b1\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b1\5d\63\2\u01b0"+
		"\u01a8\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01a7\3\2"+
		"\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"/\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01bc\5\62\32\2\u01b8\u01b9\7S\2\2"+
		"\u01b9\u01bb\5\62\32\2\u01ba\u01b8\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\61\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"+
		"\u01c4\7G\2\2\u01c0\u01c1\7U\2\2\u01c1\u01c3\7G\2\2\u01c2\u01c0\3\2\2"+
		"\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01ca"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c9\5~@\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01d4\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d2\7T\2\2\u01ce\u01d3\5\64\33\2\u01cf"+
		"\u01d0\7\37\2\2\u01d0\u01d3\7G\2\2\u01d1\u01d3\7G\2\2\u01d2\u01ce\3\2"+
		"\2\2\u01d2\u01cf\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01cd\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\63\3\2\2\2\u01d6\u01d7\t\3\2"+
		"\2\u01d7\65\3\2\2\2\u01d8\u01d9\7G\2\2\u01d9\u01df\7f\2\2\u01da\u01e0"+
		"\5d\63\2\u01db\u01de\7G\2\2\u01dc\u01de\5|?\2\u01dd\u01db\3\2\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01da\3\2\2\2\u01df\u01dd\3\2"+
		"\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\7S\2\2\u01e2\u01e1\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\67\3\2\2\2\u01e4\u01e6\7G\2\2\u01e5\u01e4\3\2\2\2"+
		"\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01f7\7o\2\2\u01e8\u01f8"+
		"\5d\63\2\u01e9\u01ec\7G\2\2\u01ea\u01ec\5|?\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01ec\u01f8\3\2\2\2\u01ed\u01f5\5\64\33\2\u01ee\u01f2\7"+
		"M\2\2\u01ef\u01f3\5|?\2\u01f0\u01f3\7G\2\2\u01f1\u01f3\7\16\2\2\u01f2"+
		"\u01ef\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f6\7N\2\2\u01f5\u01ee\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f8\3\2\2\2\u01f7\u01e8\3\2\2\2\u01f7\u01eb\3\2\2\2\u01f7\u01ed\3\2"+
		"\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01fb\7S\2\2\u01fa\u01f9\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb9\3\2\2\2\u01fc\u0202\7\t\2\2\u01fd\u01ff\7G\2\2\u01fe"+
		"\u0200\5~@\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2"+
		"\2\u0201\u01fc\3\2\2\2\u0201\u01fd\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204"+
		"\5<\37\2\u0204;\3\2\2\2\u0205\u0208\7M\2\2\u0206\u0209\5.\30\2\u0207\u0209"+
		"\5^\60\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\7N\2\2\u020b=\3\2\2\2\u020c\u020f\5@!\2\u020d"+
		"\u020f\5B\"\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f?\3\2\2\2\u0210"+
		"\u0211\7G\2\2\u0211\u0212\7o\2\2\u0212\u0213\7\"\2\2\u0213\u0214\7G\2"+
		"\2\u0214\u0216\7M\2\2\u0215\u0217\5.\30\2\u0216\u0215\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021b\7N\2\2\u0219\u021a\7\3\2\2\u021a"+
		"\u021c\7G\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021cA\3\2\2\2\u021d"+
		"\u021e\7\64\2\2\u021e\u021f\7G\2\2\u021fC\3\2\2\2\u0220\u0224\5F$\2\u0221"+
		"\u0224\5H%\2\u0222\u0224\5J&\2\u0223\u0220\3\2\2\2\u0223\u0221\3\2\2\2"+
		"\u0223\u0222\3\2\2\2\u0224E\3\2\2\2\u0225\u0227\7D\2\2\u0226\u0225\3\2"+
		"\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\7G\2\2\u0229"+
		"\u022b\7M\2\2\u022a\u022c\5.\30\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u022e\7N\2\2\u022eG\3\2\2\2\u022f\u0230"+
		"\7&\2\2\u0230\u0231\7G\2\2\u0231\u0233\7M\2\2\u0232\u0234\5.\30\2\u0233"+
		"\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\7N"+
		"\2\2\u0236I\3\2\2\2\u0237\u023e\7>\2\2\u0238\u0239\7M\2\2\u0239\u023a"+
		"\5N(\2\u023a\u023b\7,\2\2\u023b\u023c\7G\2\2\u023c\u023d\7N\2\2\u023d"+
		"\u023f\3\2\2\2\u023e\u0238\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0243\5L\'\2\u0241\u0242\7Q\2\2\u0242\u0244\5&\24\2\u0243\u0241"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\7\4\2\2\u0246"+
		"K\3\2\2\2\u0247\u0249\7D\2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u0254\3\2\2\2\u024a\u024b\7G\2\2\u024b\u0251\5\u0088E\2\u024c\u0252\5"+
		"d\63\2\u024d\u0250\7G\2\2\u024e\u0250\5|?\2\u024f\u024d\3\2\2\2\u024f"+
		"\u024e\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u024c\3\2\2\2\u0251\u024f\3\2"+
		"\2\2\u0252\u0255\3\2\2\2\u0253\u0255\5:\36\2\u0254\u024a\3\2\2\2\u0254"+
		"\u0253\3\2\2\2\u0255M\3\2\2\2\u0256\u0257\7G\2\2\u0257\u0258\7T\2\2\u0258"+
		"\u0259\5d\63\2\u0259O\3\2\2\2\u025a\u0290\7\5\2\2\u025b\u0290\5\34\17"+
		"\2\u025c\u025f\5.\30\2\u025d\u025f\5^\60\2\u025e\u025c\3\2\2\2\u025e\u025d"+
		"\3\2\2\2\u025f\u0290\3\2\2\2\u0260\u0261\5\34\17\2\u0261\u0262\7\u0081"+
		"\2\2\u0262\u0290\3\2\2\2\u0263\u0264\5\34\17\2\u0264\u0265\7\u0082\2\2"+
		"\u0265\u0290\3\2\2\2\u0266\u0269\7\24\2\2\u0267\u026a\5T+\2\u0268\u026a"+
		"\5d\63\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026f\7Q\2\2\u026c\u026e\5&\24\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2"+
		"\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0275\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0272\u0274\5R*\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2"+
		"\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0275"+
		"\3\2\2\2\u0278\u0279\7\25\2\2\u0279\u0290\3\2\2\2\u027a\u027d\7\26\2\2"+
		"\u027b\u027e\5T+\2\u027c\u027e\5d\63\2\u027d\u027b\3\2\2\2\u027d\u027c"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0283\7Q\2\2\u0280\u0282\5&\24\2\u0281"+
		"\u0280\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2"+
		"\2\2\u0284\u0286\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0287\7\27\2\2\u0287"+
		"\u0290\3\2\2\2\u0288\u0289\7)\2\2\u0289\u028a\5V,\2\u028a\u028b\5&\24"+
		"\2\u028b\u028c\7\22\2\2\u028c\u0290\3\2\2\2\u028d\u0290\7\6\2\2\u028e"+
		"\u0290\7<\2\2\u028f\u025a\3\2\2\2\u028f\u025b\3\2\2\2\u028f\u025e\3\2"+
		"\2\2\u028f\u0260\3\2\2\2\u028f\u0263\3\2\2\2\u028f\u0266\3\2\2\2\u028f"+
		"\u027a\3\2\2\2\u028f\u0288\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u028e\3\2"+
		"\2\2\u0290Q\3\2\2\2\u0291\u0294\7J\2\2\u0292\u0295\5T+\2\u0293\u0295\5"+
		"d\63\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u029a\7Q\2\2\u0297\u0299\5&\24\2\u0298\u0297\3\2\2\2\u0299\u029c\3\2"+
		"\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029bS\3\2\2\2\u029c\u029a"+
		"\3\2\2\2\u029d\u029e\7M\2\2\u029e\u029f\5^\60\2\u029f\u02a0\7N\2\2\u02a0"+
		"\u02a5\3\2\2\2\u02a1\u02a5\5^\60\2\u02a2\u02a5\5d\63\2\u02a3\u02a5\7\n"+
		"\2\2\u02a4\u029d\3\2\2\2\u02a4\u02a1\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4"+
		"\u02a3\3\2\2\2\u02a5U\3\2\2\2\u02a6\u02a7\5^\60\2\u02a7\u02a8\7,\2\2\u02a8"+
		"\u02ac\5d\63\2\u02a9\u02ab\5X-\2\u02aa\u02a9\3\2\2\2\u02ab\u02ae\3\2\2"+
		"\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae\u02ac"+
		"\3\2\2\2\u02af\u02b0\7Q\2\2\u02b0W\3\2\2\2\u02b1\u02b2\7U\2\2\u02b2\u02b3"+
		"\5^\60\2\u02b3\u02b4\7,\2\2\u02b4\u02b5\5d\63\2\u02b5Y\3\2\2\2\u02b6\u02b9"+
		"\5.\30\2\u02b7\u02b9\5^\60\2\u02b8\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9"+
		"[\3\2\2\2\u02ba\u02bb\7\7\2\2\u02bb]\3\2\2\2\u02bc\u02bd\5`\61\2\u02bd"+
		"_\3\2\2\2\u02be\u02c1\5b\62\2\u02bf\u02c1\5|?\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c5\7p\2\2\u02c3\u02c6\5b\62"+
		"\2\u02c4\u02c6\5|?\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6\u02d1"+
		"\3\2\2\2\u02c7\u02c8\5b\62\2\u02c8\u02ce\5\u0088E\2\u02c9\u02cf\5d\63"+
		"\2\u02ca\u02cd\5b\62\2\u02cb\u02cd\5|?\2\u02cc\u02ca\3\2\2\2\u02cc\u02cb"+
		"\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02c9\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf"+
		"\u02d1\3\2\2\2\u02d0\u02c0\3\2\2\2\u02d0\u02c7\3\2\2\2\u02d1a\3\2\2\2"+
		"\u02d2\u02d4\7G\2\2\u02d3\u02d5\5~@\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5"+
		"\3\2\2\2\u02d5c\3\2\2\2\u02d6\u02d7\5f\64\2\u02d7e\3\2\2\2\u02d8\u02dd"+
		"\5h\65\2\u02d9\u02da\t\4\2\2\u02da\u02dc\5h\65\2\u02db\u02d9\3\2\2\2\u02dc"+
		"\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02deg\3\2\2\2"+
		"\u02df\u02dd\3\2\2\2\u02e0\u02e5\5j\66\2\u02e1\u02e2\7l\2\2\u02e2\u02e4"+
		"\5j\66\2\u02e3\u02e1\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6i\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02ee\5l\67\2"+
		"\u02e9\u02ea\5\u008aF\2\u02ea\u02eb\5l\67\2\u02eb\u02ed\3\2\2\2\u02ec"+
		"\u02e9\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02efk\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f6\5n8\2\u02f2\u02f3"+
		"\t\5\2\2\u02f3\u02f5\5n8\2\u02f4\u02f2\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6"+
		"\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7m\3\2\2\2\u02f8\u02f6\3\2\2\2"+
		"\u02f9\u02ff\5p9\2\u02fa\u02fb\5\u008cG\2\u02fb\u02fc\5p9\2\u02fc\u02fe"+
		"\3\2\2\2\u02fd\u02fa\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300o\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u0308\5r:\2\u0303"+
		"\u0304\5\u008eH\2\u0304\u0305\5r:\2\u0305\u0307\3\2\2\2\u0306\u0303\3"+
		"\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"q\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c\5t;\2\u030c\u030d\7^\2\2\u030d"+
		"\u030f\3\2\2\2\u030e\u030b\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2"+
		"\2\2\u0310\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u0310\3\2\2\2\u0313"+
		"\u0314\5t;\2\u0314s\3\2\2\2\u0315\u031a\5v<\2\u0316\u031a\5x=\2\u0317"+
		"\u031a\5z>\2\u0318\u031a\5:\36\2\u0319\u0315\3\2\2\2\u0319\u0316\3\2\2"+
		"\2\u0319\u0317\3\2\2\2\u0319\u0318\3\2\2\2\u031au\3\2\2\2\u031b\u031c"+
		"\t\6\2\2\u031c\u032a\t\7\2\2\u031d\u031e\7G\2\2\u031e\u032a\7X\2\2\u031f"+
		"\u0322\5|?\2\u0320\u0322\7\16\2\2\u0321\u031f\3\2\2\2\u0321\u0320\3\2"+
		"\2\2\u0322\u0326\3\2\2\2\u0323\u0325\5~@\2\u0324\u0323\3\2\2\2\u0325\u0328"+
		"\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u032a\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0329\u031b\3\2\2\2\u0329\u031d\3\2\2\2\u0329\u0321\3\2"+
		"\2\2\u032aw\3\2\2\2\u032b\u032c\7Y\2\2\u032c\u0335\t\b\2\2\u032d\u032e"+
		"\5\u0086D\2\u032e\u032f\t\t\2\2\u032f\u0335\3\2\2\2\u0330\u0331\t\7\2"+
		"\2\u0331\u0335\t\n\2\2\u0332\u0333\7\\\2\2\u0333\u0335\7G\2\2\u0334\u032b"+
		"\3\2\2\2\u0334\u032d\3\2\2\2\u0334\u0330\3\2\2\2\u0334\u0332\3\2\2\2\u0335"+
		"y\3\2\2\2\u0336\u033e\7G\2\2\u0337\u033e\7\13\2\2\u0338\u033e\7\16\2\2"+
		"\u0339\u033e\5|?\2\u033a\u033e\5\u0084C\2\u033b\u033e\7\n\2\2\u033c\u033e"+
		"\7\b\2\2\u033d\u0336\3\2\2\2\u033d\u0337\3\2\2\2\u033d\u0338\3\2\2\2\u033d"+
		"\u0339\3\2\2\2\u033d\u033a\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033c\3\2"+
		"\2\2\u033e{\3\2\2\2\u033f\u0340\7K\2\2\u0340\u0345\t\13\2\2\u0341\u0342"+
		"\7U\2\2\u0342\u0344\t\13\2\2\u0343\u0341\3\2\2\2\u0344\u0347\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0345\3\2"+
		"\2\2\u0348\u0349\7L\2\2\u0349}\3\2\2\2\u034a\u034e\7K\2\2\u034b\u034f"+
		"\5\u0082B\2\u034c\u034f\5\u0080A\2\u034d\u034f\7_\2\2\u034e\u034b\3\2"+
		"\2\2\u034e\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034f\u0358\3\2\2\2\u0350"+
		"\u0354\7U\2\2\u0351\u0355\5\u0082B\2\u0352\u0355\5\u0080A\2\u0353\u0355"+
		"\7_\2\2\u0354\u0351\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0353\3\2\2\2\u0355"+
		"\u0357\3\2\2\2\u0356\u0350\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2"+
		"\2\2\u0358\u0359\3\2\2\2\u0359\u035b\3\2\2\2\u035a\u0358\3\2\2\2\u035b"+
		"\u0361\7L\2\2\u035c\u035f\7T\2\2\u035d\u0360\7G\2\2\u035e\u0360\5\64\33"+
		"\2\u035f\u035d\3\2\2\2\u035f\u035e\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u035c"+
		"\3\2\2\2\u0361\u0362\3\2\2\2\u0362\177\3\2\2\2\u0363\u0364\5\u0082B\2"+
		"\u0364\u0367\7T\2\2\u0365\u0368\5\u0082B\2\u0366\u0368\7_\2\2\u0367\u0365"+
		"\3\2\2\2\u0367\u0366\3\2\2\2\u0368\u0081\3\2\2\2\u0369\u036c\7G\2\2\u036a"+
		"\u036c\5d\63\2\u036b\u0369\3\2\2\2\u036b\u036a\3\2\2\2\u036c\u0083\3\2"+
		"\2\2\u036d\u036e\7M\2\2\u036e\u036f\5d\63\2\u036f\u0370\7N\2\2\u0370\u0085"+
		"\3\2\2\2\u0371\u0372\t\f\2\2\u0372\u0087\3\2\2\2\u0373\u0374\t\r\2\2\u0374"+
		"\u0089\3\2\2\2\u0375\u037d\3\2\2\2\u0376\u037d\7f\2\2\u0377\u037d\7g\2"+
		"\2\u0378\u037d\7h\2\2\u0379\u037d\7j\2\2\u037a\u037d\7i\2\2\u037b\u037d"+
		"\7k\2\2\u037c\u0375\3\2\2\2\u037c\u0376\3\2\2\2\u037c\u0377\3\2\2\2\u037c"+
		"\u0378\3\2\2\2\u037c\u0379\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037b\3\2"+
		"\2\2\u037d\u008b\3\2\2\2\u037e\u0383\3\2\2\2\u037f\u0383\7c\2\2\u0380"+
		"\u0383\7Z\2\2\u0381\u0383\7[\2\2\u0382\u037e\3\2\2\2\u0382\u037f\3\2\2"+
		"\2\u0382\u0380\3\2\2\2\u0382\u0381\3\2\2\2\u0383\u008d\3\2\2\2\u0384\u0385"+
		"\t\16\2\2\u0385\u008f\3\2\2\2\u0081\u0093\u0098\u009e\u00a0\u00a6\u00ac"+
		"\u00af\u00b4\u00ba\u00bd\u00c4\u00c8\u00cb\u00d0\u00d2\u00d7\u00da\u00de"+
		"\u00e6\u00e8\u00f1\u00f5\u00fa\u0100\u0104\u0107\u010d\u0117\u011a\u011f"+
		"\u0124\u012b\u012f\u0132\u0137\u0140\u0145\u014c\u0151\u0156\u015d\u0163"+
		"\u016b\u0171\u017b\u017e\u0184\u0187\u018d\u0195\u019a\u01a1\u01a5\u01ac"+
		"\u01b0\u01b4\u01bc\u01c4\u01ca\u01d2\u01d4\u01dd\u01df\u01e2\u01e5\u01eb"+
		"\u01f2\u01f5\u01f7\u01fa\u01ff\u0201\u0208\u020e\u0216\u021b\u0223\u0226"+
		"\u022b\u0233\u023e\u0243\u0248\u024f\u0251\u0254\u025e\u0269\u026f\u0275"+
		"\u027d\u0283\u028f\u0294\u029a\u02a4\u02ac\u02b8\u02c0\u02c5\u02cc\u02ce"+
		"\u02d0\u02d4\u02dd\u02e5\u02ee\u02f6\u02ff\u0308\u0310\u0319\u0321\u0326"+
		"\u0329\u0334\u033d\u0345\u034e\u0354\u0358\u035f\u0361\u0367\u036b\u037c"+
		"\u0382";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}