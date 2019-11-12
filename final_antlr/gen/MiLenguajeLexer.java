// Generated from /home/c3po/Git/lenguajes/final_antlr/grammar/MiLenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, RESERVED_WORD_F=5, ID=6, IDENTIFIER=7, 
		IDENTIFIER_PTR=8, BOOLEAN=9, NUMBER=10, INT=11, REAL=12, STRING=13, ID_LETTER=14, 
		DIGIT=15, Spec=16, Global=17, Res=18, Af=19, Read=20, If=21, Fi=22, Do=23, 
		Od=24, Resource=25, Procedure=26, Type=27, Optype=28, Rec=29, Int=30, 
		Getarg=31, Cap=32, Import=33, Id=34, Create=35, End=36, Stop=37, Write=38, 
		Send=39, Or=40, Body=41, Fa=42, Mod=43, Var=44, To=45, True=46, False=47, 
		Returns=48, Writes=49, Put=50, Op=51, Receive=52, Destroy=53, Final=54, 
		Process=55, Char=56, Bool=57, Real=58, Reply=59, Next=60, Ni=61, Co=62, 
		Proc=63, String=64, Const=65, Low=66, High=67, Call=68, In=69, Separate=70, 
		TK_SEPARA=71, TK_LEFT_BRACKET=72, TK_RIGHT_BRACKET=73, TK_LEFT_PARENTHESES=74, 
		TK_RIGHT_PARENTHESES=75, TK_LEFT_BRACE=76, TK_RIGHT_BRACE=77, TK_EXECUTE=78, 
		TK_DOT=79, TK_SEMI_COLON=80, TK_COLON=81, TK_COMMA=82, TK_INCREMENT=83, 
		TK_DECREMENT=84, TK_POINTER=85, TK_NOT=86, TK_PLUS=87, TK_MINUS=88, TK_ADDRESS=89, 
		TK_N_INVOCATIONS=90, TK_EXPONENTIATION=91, TK_MULTIPLICATION=92, TK_DIVISION=93, 
		TK_REMAINDER=94, TK_MODULUS=95, TK_CONTAT=96, TK_LEFT_SHIFT=97, TK_RIGHT_SHIFT=98, 
		TK_EQUAL=99, TK_NOT_EQUAL=100, TK_GREATER=101, TK_lESS=102, TK_GREATER_EQUAL=103, 
		TK_LESS_EQUAL=104, TK_AND=105, TK_OR=106, TK_XOR=107, TK_ASSIGN=108, TK_SWAP=109, 
		TK_INCREMENT_ASSIGN=110, TK_DECREMENT_ASSIGN=111, TK_MULTIPLICATION_ASSIGN=112, 
		TK_DIVISION_ASSIGN=113, TK_REMAINDER_ASSIGN=114, TK_EXPONENTIATION_ASSIGN=115, 
		TK_OR_ASSIGN=116, TK_AND_ASSIGN=117, TK_CONCAT_ASSIGN=118, TK_LEFT_SHIFT_ASSIGN=119, 
		TK_RIGHT_SHIFT_ASSIGN=120, SPACES=121, LINE_COMMENT=122;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "RESERVED_WORD_F", "ID", "IDENTIFIER", 
			"IDENTIFIER_PTR", "BOOLEAN", "NUMBER", "INT", "REAL", "STRING", "ID_LETTER", 
			"DIGIT", "Spec", "Global", "Res", "Af", "Read", "If", "Fi", "Do", "Od", 
			"Resource", "Procedure", "Type", "Optype", "Rec", "Int", "Getarg", "Cap", 
			"Import", "Id", "Create", "End", "Stop", "Write", "Send", "Or", "Body", 
			"Fa", "Mod", "Var", "To", "True", "False", "Returns", "Writes", "Put", 
			"Op", "Receive", "Destroy", "Final", "Process", "Char", "Bool", "Real", 
			"Reply", "Next", "Ni", "Co", "Proc", "String", "Const", "Low", "High", 
			"Call", "In", "Separate", "TK_SEPARA", "TK_LEFT_BRACKET", "TK_RIGHT_BRACKET", 
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
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'on'", "'oc'", "'notyet'", "'NOTYET'", null, null, null, null, 
			null, null, null, null, null, null, null, "'spec'", "'global'", "'res'", 
			"'af'", "'read'", "'if'", "'fi'", "'do'", "'od'", "'resource'", "'procedure'", 
			"'type'", "'optype'", "'rec'", "'int'", "'getarg'", "'cap'", "'import'", 
			"'id'", "'create'", "'end'", "'stop'", null, "'send'", "'or'", "'body'", 
			"'fa'", null, "'var'", "'to'", "'true'", "'false'", "'returns'", "'writes'", 
			"'put'", "'op'", "'receive'", "'destroy'", "'final'", "'process'", "'char'", 
			"'bool'", "'real'", "'reply'", "'next'", "'ni'", "'co'", "'proc'", "'string'", 
			"'const'", "'low'", "'high'", "'call'", "'in'", "'separate'", "'[]'", 
			"'['", "']'", "'('", "')'", "'{'", "'}'", "'->'", "'.'", "';'", "':'", 
			"','", "'++'", "'--'", "'^'", null, "'+'", "'-'", "'@'", "'?'", "'**'", 
			"'*'", "'/'", "'%'", null, "'||'", "'<<'", "'>>'", "'='", null, "'>'", 
			"'<'", "'>='", "'<='", null, null, "'xor'", "':='", "':=:'", "'+:='", 
			"'-:='", "'*:='", "'/:='", "'%:='", "'**:='", "'|:='", "'&:='", "'||:='", 
			"'<<:='", "'>>:='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "RESERVED_WORD_F", "ID", "IDENTIFIER", 
			"IDENTIFIER_PTR", "BOOLEAN", "NUMBER", "INT", "REAL", "STRING", "ID_LETTER", 
			"DIGIT", "Spec", "Global", "Res", "Af", "Read", "If", "Fi", "Do", "Od", 
			"Resource", "Procedure", "Type", "Optype", "Rec", "Int", "Getarg", "Cap", 
			"Import", "Id", "Create", "End", "Stop", "Write", "Send", "Or", "Body", 
			"Fa", "Mod", "Var", "To", "True", "False", "Returns", "Writes", "Put", 
			"Op", "Receive", "Destroy", "Final", "Process", "Char", "Bool", "Real", 
			"Reply", "Next", "Ni", "Co", "Proc", "String", "Const", "Low", "High", 
			"Call", "In", "Separate", "TK_SEPARA", "TK_LEFT_BRACKET", "TK_RIGHT_BRACKET", 
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


	public MiLenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2|\u0325\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\5\7\u0114\n\7\3\b\3\b\3\b\7\b\u0119\n\b\f\b\16\b\u011c\13\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u012d\n\n\3\13"+
		"\3\13\5\13\u0131\n\13\3\f\6\f\u0134\n\f\r\f\16\f\u0135\3\r\6\r\u0139\n"+
		"\r\r\r\16\r\u013a\3\r\3\r\6\r\u013f\n\r\r\r\16\r\u0140\3\r\3\r\6\r\u0145"+
		"\n\r\r\r\16\r\u0146\5\r\u0149\n\r\3\16\3\16\3\16\3\16\7\16\u014f\n\16"+
		"\f\16\16\16\u0152\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,"+
		"\3,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3"+
		";\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3"+
		"@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3"+
		"D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3I\3"+
		"I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3"+
		"T\3T\3U\3U\3U\3V\3V\3W\3W\3W\3W\5W\u029c\nW\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3"+
		"\\\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3`\3`\3a\3a\3a\3b\3b\3b\3c\3c\3c\3"+
		"d\3d\3e\3e\3e\3e\5e\u02c2\ne\3f\3f\3g\3g\3h\3h\3h\3i\3i\3i\3j\3j\3j\3"+
		"j\5j\u02d2\nj\3k\3k\3k\5k\u02d7\nk\3l\3l\3l\3l\3m\3m\3m\3n\3n\3n\3n\3"+
		"o\3o\3o\3o\3p\3p\3p\3p\3q\3q\3q\3q\3r\3r\3r\3r\3s\3s\3s\3s\3t\3t\3t\3"+
		"t\3t\3u\3u\3u\3u\3v\3v\3v\3v\3w\3w\3w\3w\3w\3x\3x\3x\3x\3x\3y\3y\3y\3"+
		"y\3y\3z\6z\u0315\nz\rz\16z\u0316\3z\3z\3{\3{\7{\u031d\n{\f{\16{\u0320"+
		"\13{\3{\3{\3{\3{\4\u0150\u031e\2|\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099"+
		"N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad"+
		"X\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1"+
		"b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5"+
		"l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3s\u00e5t\u00e7u\u00e9"+
		"v\u00ebw\u00edx\u00efy\u00f1z\u00f3{\u00f5|\3\2\4\5\2C\\aac|\5\2\13\f"+
		"\17\17\"\"\2\u0336\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2"+
		"\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1"+
		"\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2"+
		"\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3"+
		"\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2"+
		"\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5"+
		"\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2"+
		"\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\3\u00f7"+
		"\3\2\2\2\5\u00fa\3\2\2\2\7\u00fd\3\2\2\2\t\u0104\3\2\2\2\13\u010b\3\2"+
		"\2\2\r\u0113\3\2\2\2\17\u0115\3\2\2\2\21\u011f\3\2\2\2\23\u012c\3\2\2"+
		"\2\25\u0130\3\2\2\2\27\u0133\3\2\2\2\31\u0148\3\2\2\2\33\u014a\3\2\2\2"+
		"\35\u0155\3\2\2\2\37\u0157\3\2\2\2!\u0159\3\2\2\2#\u015e\3\2\2\2%\u0165"+
		"\3\2\2\2\'\u0169\3\2\2\2)\u016c\3\2\2\2+\u0171\3\2\2\2-\u0174\3\2\2\2"+
		"/\u0177\3\2\2\2\61\u017a\3\2\2\2\63\u017d\3\2\2\2\65\u0186\3\2\2\2\67"+
		"\u0190\3\2\2\29\u0195\3\2\2\2;\u019c\3\2\2\2=\u01a0\3\2\2\2?\u01a4\3\2"+
		"\2\2A\u01ab\3\2\2\2C\u01af\3\2\2\2E\u01b6\3\2\2\2G\u01b9\3\2\2\2I\u01c0"+
		"\3\2\2\2K\u01c4\3\2\2\2M\u01c9\3\2\2\2O\u01cf\3\2\2\2Q\u01d4\3\2\2\2S"+
		"\u01d7\3\2\2\2U\u01dc\3\2\2\2W\u01df\3\2\2\2Y\u01e3\3\2\2\2[\u01e7\3\2"+
		"\2\2]\u01ea\3\2\2\2_\u01ef\3\2\2\2a\u01f5\3\2\2\2c\u01fd\3\2\2\2e\u0204"+
		"\3\2\2\2g\u0208\3\2\2\2i\u020b\3\2\2\2k\u0213\3\2\2\2m\u021b\3\2\2\2o"+
		"\u0221\3\2\2\2q\u0229\3\2\2\2s\u022e\3\2\2\2u\u0233\3\2\2\2w\u0238\3\2"+
		"\2\2y\u023e\3\2\2\2{\u0243\3\2\2\2}\u0246\3\2\2\2\177\u0249\3\2\2\2\u0081"+
		"\u024e\3\2\2\2\u0083\u0255\3\2\2\2\u0085\u025b\3\2\2\2\u0087\u025f\3\2"+
		"\2\2\u0089\u0264\3\2\2\2\u008b\u0269\3\2\2\2\u008d\u026c\3\2\2\2\u008f"+
		"\u0275\3\2\2\2\u0091\u0278\3\2\2\2\u0093\u027a\3\2\2\2\u0095\u027c\3\2"+
		"\2\2\u0097\u027e\3\2\2\2\u0099\u0280\3\2\2\2\u009b\u0282\3\2\2\2\u009d"+
		"\u0284\3\2\2\2\u009f\u0287\3\2\2\2\u00a1\u0289\3\2\2\2\u00a3\u028b\3\2"+
		"\2\2\u00a5\u028d\3\2\2\2\u00a7\u028f\3\2\2\2\u00a9\u0292\3\2\2\2\u00ab"+
		"\u0295\3\2\2\2\u00ad\u029b\3\2\2\2\u00af\u029d\3\2\2\2\u00b1\u029f\3\2"+
		"\2\2\u00b3\u02a1\3\2\2\2\u00b5\u02a3\3\2\2\2\u00b7\u02a5\3\2\2\2\u00b9"+
		"\u02a8\3\2\2\2\u00bb\u02aa\3\2\2\2\u00bd\u02ac\3\2\2\2\u00bf\u02ae\3\2"+
		"\2\2\u00c1\u02b2\3\2\2\2\u00c3\u02b5\3\2\2\2\u00c5\u02b8\3\2\2\2\u00c7"+
		"\u02bb\3\2\2\2\u00c9\u02c1\3\2\2\2\u00cb\u02c3\3\2\2\2\u00cd\u02c5\3\2"+
		"\2\2\u00cf\u02c7\3\2\2\2\u00d1\u02ca\3\2\2\2\u00d3\u02d1\3\2\2\2\u00d5"+
		"\u02d6\3\2\2\2\u00d7\u02d8\3\2\2\2\u00d9\u02dc\3\2\2\2\u00db\u02df\3\2"+
		"\2\2\u00dd\u02e3\3\2\2\2\u00df\u02e7\3\2\2\2\u00e1\u02eb\3\2\2\2\u00e3"+
		"\u02ef\3\2\2\2\u00e5\u02f3\3\2\2\2\u00e7\u02f7\3\2\2\2\u00e9\u02fc\3\2"+
		"\2\2\u00eb\u0300\3\2\2\2\u00ed\u0304\3\2\2\2\u00ef\u0309\3\2\2\2\u00f1"+
		"\u030e\3\2\2\2\u00f3\u0314\3\2\2\2\u00f5\u031a\3\2\2\2\u00f7\u00f8\7q"+
		"\2\2\u00f8\u00f9\7p\2\2\u00f9\4\3\2\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc"+
		"\7e\2\2\u00fc\6\3\2\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100"+
		"\7v\2\2\u0100\u0101\7{\2\2\u0101\u0102\7g\2\2\u0102\u0103\7v\2\2\u0103"+
		"\b\3\2\2\2\u0104\u0105\7P\2\2\u0105\u0106\7Q\2\2\u0106\u0107\7V\2\2\u0107"+
		"\u0108\7[\2\2\u0108\u0109\7G\2\2\u0109\u010a\7V\2\2\u010a\n\3\2\2\2\u010b"+
		"\u010c\7y\2\2\u010c\u010d\7t\2\2\u010d\u010e\7k\2\2\u010e\u010f\7v\2\2"+
		"\u010f\u0110\7g\2\2\u0110\f\3\2\2\2\u0111\u0114\5\17\b\2\u0112\u0114\5"+
		"\21\t\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\16\3\2\2\2\u0115"+
		"\u011a\5\35\17\2\u0116\u0119\5\35\17\2\u0117\u0119\5\37\20\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\20\3\2\2\2\u011f\u0120\5\17\b\2\u0120\u0121\7\60\2\2\u0121"+
		"\u0122\5\17\b\2\u0122\22\3\2\2\2\u0123\u0124\7v\2\2\u0124\u0125\7t\2\2"+
		"\u0125\u0126\7w\2\2\u0126\u012d\7g\2\2\u0127\u0128\7h\2\2\u0128\u0129"+
		"\7c\2\2\u0129\u012a\7n\2\2\u012a\u012b\7u\2\2\u012b\u012d\7g\2\2\u012c"+
		"\u0123\3\2\2\2\u012c\u0127\3\2\2\2\u012d\24\3\2\2\2\u012e\u0131\5\27\f"+
		"\2\u012f\u0131\5\31\r\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"\26\3\2\2\2\u0132\u0134\5\37\20\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\30\3\2\2\2\u0137\u0139"+
		"\5\37\20\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2"+
		"\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\7\60\2\2\u013d\u013f"+
		"\5\37\20\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2"+
		"\u0140\u0141\3\2\2\2\u0141\u0149\3\2\2\2\u0142\u0144\7\60\2\2\u0143\u0145"+
		"\5\37\20\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0138\3\2\2\2\u0148\u0142"+
		"\3\2\2\2\u0149\32\3\2\2\2\u014a\u0150\7$\2\2\u014b\u014c\7^\2\2\u014c"+
		"\u014f\7$\2\2\u014d\u014f\13\2\2\2\u014e\u014b\3\2\2\2\u014e\u014d\3\2"+
		"\2\2\u014f\u0152\3\2\2\2\u0150\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7$\2\2\u0154\34\3\2\2\2"+
		"\u0155\u0156\t\2\2\2\u0156\36\3\2\2\2\u0157\u0158\4\62;\2\u0158 \3\2\2"+
		"\2\u0159\u015a\7u\2\2\u015a\u015b\7r\2\2\u015b\u015c\7g\2\2\u015c\u015d"+
		"\7e\2\2\u015d\"\3\2\2\2\u015e\u015f\7i\2\2\u015f\u0160\7n\2\2\u0160\u0161"+
		"\7q\2\2\u0161\u0162\7d\2\2\u0162\u0163\7c\2\2\u0163\u0164\7n\2\2\u0164"+
		"$\3\2\2\2\u0165\u0166\7t\2\2\u0166\u0167\7g\2\2\u0167\u0168\7u\2\2\u0168"+
		"&\3\2\2\2\u0169\u016a\7c\2\2\u016a\u016b\7h\2\2\u016b(\3\2\2\2\u016c\u016d"+
		"\7t\2\2\u016d\u016e\7g\2\2\u016e\u016f\7c\2\2\u016f\u0170\7f\2\2\u0170"+
		"*\3\2\2\2\u0171\u0172\7k\2\2\u0172\u0173\7h\2\2\u0173,\3\2\2\2\u0174\u0175"+
		"\7h\2\2\u0175\u0176\7k\2\2\u0176.\3\2\2\2\u0177\u0178\7f\2\2\u0178\u0179"+
		"\7q\2\2\u0179\60\3\2\2\2\u017a\u017b\7q\2\2\u017b\u017c\7f\2\2\u017c\62"+
		"\3\2\2\2\u017d\u017e\7t\2\2\u017e\u017f\7g\2\2\u017f\u0180\7u\2\2\u0180"+
		"\u0181\7q\2\2\u0181\u0182\7w\2\2\u0182\u0183\7t\2\2\u0183\u0184\7e\2\2"+
		"\u0184\u0185\7g\2\2\u0185\64\3\2\2\2\u0186\u0187\7r\2\2\u0187\u0188\7"+
		"t\2\2\u0188\u0189\7q\2\2\u0189\u018a\7e\2\2\u018a\u018b\7g\2\2\u018b\u018c"+
		"\7f\2\2\u018c\u018d\7w\2\2\u018d\u018e\7t\2\2\u018e\u018f\7g\2\2\u018f"+
		"\66\3\2\2\2\u0190\u0191\7v\2\2\u0191\u0192\7{\2\2\u0192\u0193\7r\2\2\u0193"+
		"\u0194\7g\2\2\u01948\3\2\2\2\u0195\u0196\7q\2\2\u0196\u0197\7r\2\2\u0197"+
		"\u0198\7v\2\2\u0198\u0199\7{\2\2\u0199\u019a\7r\2\2\u019a\u019b\7g\2\2"+
		"\u019b:\3\2\2\2\u019c\u019d\7t\2\2\u019d\u019e\7g\2\2\u019e\u019f\7e\2"+
		"\2\u019f<\3\2\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a3\7"+
		"v\2\2\u01a3>\3\2\2\2\u01a4\u01a5\7i\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7"+
		"\7v\2\2\u01a7\u01a8\7c\2\2\u01a8\u01a9\7t\2\2\u01a9\u01aa\7i\2\2\u01aa"+
		"@\3\2\2\2\u01ab\u01ac\7e\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7r\2\2\u01ae"+
		"B\3\2\2\2\u01af\u01b0\7k\2\2\u01b0\u01b1\7o\2\2\u01b1\u01b2\7r\2\2\u01b2"+
		"\u01b3\7q\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7v\2\2\u01b5D\3\2\2\2\u01b6"+
		"\u01b7\7k\2\2\u01b7\u01b8\7f\2\2\u01b8F\3\2\2\2\u01b9\u01ba\7e\2\2\u01ba"+
		"\u01bb\7t\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7c\2\2\u01bd\u01be\7v\2\2"+
		"\u01be\u01bf\7g\2\2\u01bfH\3\2\2\2\u01c0\u01c1\7g\2\2\u01c1\u01c2\7p\2"+
		"\2\u01c2\u01c3\7f\2\2\u01c3J\3\2\2\2\u01c4\u01c5\7u\2\2\u01c5\u01c6\7"+
		"v\2\2\u01c6\u01c7\7q\2\2\u01c7\u01c8\7r\2\2\u01c8L\3\2\2\2\u01c9\u01ca"+
		"\7y\2\2\u01ca\u01cb\7t\2\2\u01cb\u01cc\7k\2\2\u01cc\u01cd\7v\2\2\u01cd"+
		"\u01ce\7g\2\2\u01ceN\3\2\2\2\u01cf\u01d0\7u\2\2\u01d0\u01d1\7g\2\2\u01d1"+
		"\u01d2\7p\2\2\u01d2\u01d3\7f\2\2\u01d3P\3\2\2\2\u01d4\u01d5\7q\2\2\u01d5"+
		"\u01d6\7t\2\2\u01d6R\3\2\2\2\u01d7\u01d8\7d\2\2\u01d8\u01d9\7q\2\2\u01d9"+
		"\u01da\7f\2\2\u01da\u01db\7{\2\2\u01dbT\3\2\2\2\u01dc\u01dd\7h\2\2\u01dd"+
		"\u01de\7c\2\2\u01deV\3\2\2\2\u01df\u01e0\7o\2\2\u01e0\u01e1\7q\2\2\u01e1"+
		"\u01e2\7f\2\2\u01e2X\3\2\2\2\u01e3\u01e4\7x\2\2\u01e4\u01e5\7c\2\2\u01e5"+
		"\u01e6\7t\2\2\u01e6Z\3\2\2\2\u01e7\u01e8\7v\2\2\u01e8\u01e9\7q\2\2\u01e9"+
		"\\\3\2\2\2\u01ea\u01eb\7v\2\2\u01eb\u01ec\7t\2\2\u01ec\u01ed\7w\2\2\u01ed"+
		"\u01ee\7g\2\2\u01ee^\3\2\2\2\u01ef\u01f0\7h\2\2\u01f0\u01f1\7c\2\2\u01f1"+
		"\u01f2\7n\2\2\u01f2\u01f3\7u\2\2\u01f3\u01f4\7g\2\2\u01f4`\3\2\2\2\u01f5"+
		"\u01f6\7t\2\2\u01f6\u01f7\7g\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7w\2\2"+
		"\u01f9\u01fa\7t\2\2\u01fa\u01fb\7p\2\2\u01fb\u01fc\7u\2\2\u01fcb\3\2\2"+
		"\2\u01fd\u01fe\7y\2\2\u01fe\u01ff\7t\2\2\u01ff\u0200\7k\2\2\u0200\u0201"+
		"\7v\2\2\u0201\u0202\7g\2\2\u0202\u0203\7u\2\2\u0203d\3\2\2\2\u0204\u0205"+
		"\7r\2\2\u0205\u0206\7w\2\2\u0206\u0207\7v\2\2\u0207f\3\2\2\2\u0208\u0209"+
		"\7q\2\2\u0209\u020a\7r\2\2\u020ah\3\2\2\2\u020b\u020c\7t\2\2\u020c\u020d"+
		"\7g\2\2\u020d\u020e\7e\2\2\u020e\u020f\7g\2\2\u020f\u0210\7k\2\2\u0210"+
		"\u0211\7x\2\2\u0211\u0212\7g\2\2\u0212j\3\2\2\2\u0213\u0214\7f\2\2\u0214"+
		"\u0215\7g\2\2\u0215\u0216\7u\2\2\u0216\u0217\7v\2\2\u0217\u0218\7t\2\2"+
		"\u0218\u0219\7q\2\2\u0219\u021a\7{\2\2\u021al\3\2\2\2\u021b\u021c\7h\2"+
		"\2\u021c\u021d\7k\2\2\u021d\u021e\7p\2\2\u021e\u021f\7c\2\2\u021f\u0220"+
		"\7n\2\2\u0220n\3\2\2\2\u0221\u0222\7r\2\2\u0222\u0223\7t\2\2\u0223\u0224"+
		"\7q\2\2\u0224\u0225\7e\2\2\u0225\u0226\7g\2\2\u0226\u0227\7u\2\2\u0227"+
		"\u0228\7u\2\2\u0228p\3\2\2\2\u0229\u022a\7e\2\2\u022a\u022b\7j\2\2\u022b"+
		"\u022c\7c\2\2\u022c\u022d\7t\2\2\u022dr\3\2\2\2\u022e\u022f\7d\2\2\u022f"+
		"\u0230\7q\2\2\u0230\u0231\7q\2\2\u0231\u0232\7n\2\2\u0232t\3\2\2\2\u0233"+
		"\u0234\7t\2\2\u0234\u0235\7g\2\2\u0235\u0236\7c\2\2\u0236\u0237\7n\2\2"+
		"\u0237v\3\2\2\2\u0238\u0239\7t\2\2\u0239\u023a\7g\2\2\u023a\u023b\7r\2"+
		"\2\u023b\u023c\7n\2\2\u023c\u023d\7{\2\2\u023dx\3\2\2\2\u023e\u023f\7"+
		"p\2\2\u023f\u0240\7g\2\2\u0240\u0241\7z\2\2\u0241\u0242\7v\2\2\u0242z"+
		"\3\2\2\2\u0243\u0244\7p\2\2\u0244\u0245\7k\2\2\u0245|\3\2\2\2\u0246\u0247"+
		"\7e\2\2\u0247\u0248\7q\2\2\u0248~\3\2\2\2\u0249\u024a\7r\2\2\u024a\u024b"+
		"\7t\2\2\u024b\u024c\7q\2\2\u024c\u024d\7e\2\2\u024d\u0080\3\2\2\2\u024e"+
		"\u024f\7u\2\2\u024f\u0250\7v\2\2\u0250\u0251\7t\2\2\u0251\u0252\7k\2\2"+
		"\u0252\u0253\7p\2\2\u0253\u0254\7i\2\2\u0254\u0082\3\2\2\2\u0255\u0256"+
		"\7e\2\2\u0256\u0257\7q\2\2\u0257\u0258\7p\2\2\u0258\u0259\7u\2\2\u0259"+
		"\u025a\7v\2\2\u025a\u0084\3\2\2\2\u025b\u025c\7n\2\2\u025c\u025d\7q\2"+
		"\2\u025d\u025e\7y\2\2\u025e\u0086\3\2\2\2\u025f\u0260\7j\2\2\u0260\u0261"+
		"\7k\2\2\u0261\u0262\7i\2\2\u0262\u0263\7j\2\2\u0263\u0088\3\2\2\2\u0264"+
		"\u0265\7e\2\2\u0265\u0266\7c\2\2\u0266\u0267\7n\2\2\u0267\u0268\7n\2\2"+
		"\u0268\u008a\3\2\2\2\u0269\u026a\7k\2\2\u026a\u026b\7p\2\2\u026b\u008c"+
		"\3\2\2\2\u026c\u026d\7u\2\2\u026d\u026e\7g\2\2\u026e\u026f\7r\2\2\u026f"+
		"\u0270\7c\2\2\u0270\u0271\7t\2\2\u0271\u0272\7c\2\2\u0272\u0273\7v\2\2"+
		"\u0273\u0274\7g\2\2\u0274\u008e\3\2\2\2\u0275\u0276\7]\2\2\u0276\u0277"+
		"\7_\2\2\u0277\u0090\3\2\2\2\u0278\u0279\7]\2\2\u0279\u0092\3\2\2\2\u027a"+
		"\u027b\7_\2\2\u027b\u0094\3\2\2\2\u027c\u027d\7*\2\2\u027d\u0096\3\2\2"+
		"\2\u027e\u027f\7+\2\2\u027f\u0098\3\2\2\2\u0280\u0281\7}\2\2\u0281\u009a"+
		"\3\2\2\2\u0282\u0283\7\177\2\2\u0283\u009c\3\2\2\2\u0284\u0285\7/\2\2"+
		"\u0285\u0286\7@\2\2\u0286\u009e\3\2\2\2\u0287\u0288\7\60\2\2\u0288\u00a0"+
		"\3\2\2\2\u0289\u028a\7=\2\2\u028a\u00a2\3\2\2\2\u028b\u028c\7<\2\2\u028c"+
		"\u00a4\3\2\2\2\u028d\u028e\7.\2\2\u028e\u00a6\3\2\2\2\u028f\u0290\7-\2"+
		"\2\u0290\u0291\7-\2\2\u0291\u00a8\3\2\2\2\u0292\u0293\7/\2\2\u0293\u0294"+
		"\7/\2\2\u0294\u00aa\3\2\2\2\u0295\u0296\7`\2\2\u0296\u00ac\3\2\2\2\u0297"+
		"\u0298\7p\2\2\u0298\u0299\7q\2\2\u0299\u029c\7v\2\2\u029a\u029c\7\u0080"+
		"\2\2\u029b\u0297\3\2\2\2\u029b\u029a\3\2\2\2\u029c\u00ae\3\2\2\2\u029d"+
		"\u029e\7-\2\2\u029e\u00b0\3\2\2\2\u029f\u02a0\7/\2\2\u02a0\u00b2\3\2\2"+
		"\2\u02a1\u02a2\7B\2\2\u02a2\u00b4\3\2\2\2\u02a3\u02a4\7A\2\2\u02a4\u00b6"+
		"\3\2\2\2\u02a5\u02a6\7,\2\2\u02a6\u02a7\7,\2\2\u02a7\u00b8\3\2\2\2\u02a8"+
		"\u02a9\7,\2\2\u02a9\u00ba\3\2\2\2\u02aa\u02ab\7\61\2\2\u02ab\u00bc\3\2"+
		"\2\2\u02ac\u02ad\7\'\2\2\u02ad\u00be\3\2\2\2\u02ae\u02af\7o\2\2\u02af"+
		"\u02b0\7q\2\2\u02b0\u02b1\7f\2\2\u02b1\u00c0\3\2\2\2\u02b2\u02b3\7~\2"+
		"\2\u02b3\u02b4\7~\2\2\u02b4\u00c2\3\2\2\2\u02b5\u02b6\7>\2\2\u02b6\u02b7"+
		"\7>\2\2\u02b7\u00c4\3\2\2\2\u02b8\u02b9\7@\2\2\u02b9\u02ba\7@\2\2\u02ba"+
		"\u00c6\3\2\2\2\u02bb\u02bc\7?\2\2\u02bc\u00c8\3\2\2\2\u02bd\u02be\7#\2"+
		"\2\u02be\u02c2\7?\2\2\u02bf\u02c0\7\u0080\2\2\u02c0\u02c2\7?\2\2\u02c1"+
		"\u02bd\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u00ca\3\2\2\2\u02c3\u02c4\7@"+
		"\2\2\u02c4\u00cc\3\2\2\2\u02c5\u02c6\7>\2\2\u02c6\u00ce\3\2\2\2\u02c7"+
		"\u02c8\7@\2\2\u02c8\u02c9\7?\2\2\u02c9\u00d0\3\2\2\2\u02ca\u02cb\7>\2"+
		"\2\u02cb\u02cc\7?\2\2\u02cc\u00d2\3\2\2\2\u02cd\u02d2\7(\2\2\u02ce\u02cf"+
		"\7c\2\2\u02cf\u02d0\7p\2\2\u02d0\u02d2\7f\2\2\u02d1\u02cd\3\2\2\2\u02d1"+
		"\u02ce\3\2\2\2\u02d2\u00d4\3\2\2\2\u02d3\u02d4\7q\2\2\u02d4\u02d7\7t\2"+
		"\2\u02d5\u02d7\7~\2\2\u02d6\u02d3\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7\u00d6"+
		"\3\2\2\2\u02d8\u02d9\7z\2\2\u02d9\u02da\7q\2\2\u02da\u02db\7t\2\2\u02db"+
		"\u00d8\3\2\2\2\u02dc\u02dd\7<\2\2\u02dd\u02de\7?\2\2\u02de\u00da\3\2\2"+
		"\2\u02df\u02e0\7<\2\2\u02e0\u02e1\7?\2\2\u02e1\u02e2\7<\2\2\u02e2\u00dc"+
		"\3\2\2\2\u02e3\u02e4\7-\2\2\u02e4\u02e5\7<\2\2\u02e5\u02e6\7?\2\2\u02e6"+
		"\u00de\3\2\2\2\u02e7\u02e8\7/\2\2\u02e8\u02e9\7<\2\2\u02e9\u02ea\7?\2"+
		"\2\u02ea\u00e0\3\2\2\2\u02eb\u02ec\7,\2\2\u02ec\u02ed\7<\2\2\u02ed\u02ee"+
		"\7?\2\2\u02ee\u00e2\3\2\2\2\u02ef\u02f0\7\61\2\2\u02f0\u02f1\7<\2\2\u02f1"+
		"\u02f2\7?\2\2\u02f2\u00e4\3\2\2\2\u02f3\u02f4\7\'\2\2\u02f4\u02f5\7<\2"+
		"\2\u02f5\u02f6\7?\2\2\u02f6\u00e6\3\2\2\2\u02f7\u02f8\7,\2\2\u02f8\u02f9"+
		"\7,\2\2\u02f9\u02fa\7<\2\2\u02fa\u02fb\7?\2\2\u02fb\u00e8\3\2\2\2\u02fc"+
		"\u02fd\7~\2\2\u02fd\u02fe\7<\2\2\u02fe\u02ff\7?\2\2\u02ff\u00ea\3\2\2"+
		"\2\u0300\u0301\7(\2\2\u0301\u0302\7<\2\2\u0302\u0303\7?\2\2\u0303\u00ec"+
		"\3\2\2\2\u0304\u0305\7~\2\2\u0305\u0306\7~\2\2\u0306\u0307\7<\2\2\u0307"+
		"\u0308\7?\2\2\u0308\u00ee\3\2\2\2\u0309\u030a\7>\2\2\u030a\u030b\7>\2"+
		"\2\u030b\u030c\7<\2\2\u030c\u030d\7?\2\2\u030d\u00f0\3\2\2\2\u030e\u030f"+
		"\7@\2\2\u030f\u0310\7@\2\2\u0310\u0311\7<\2\2\u0311\u0312\7?\2\2\u0312"+
		"\u00f2\3\2\2\2\u0313\u0315\t\3\2\2\u0314\u0313\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u0319\bz\2\2\u0319\u00f4\3\2\2\2\u031a\u031e\7%\2\2\u031b\u031d\13\2"+
		"\2\2\u031c\u031b\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031f\3\2\2\2\u031e"+
		"\u031c\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0322\7\f"+
		"\2\2\u0322\u0323\3\2\2\2\u0323\u0324\b{\2\2\u0324\u00f6\3\2\2\2\25\2\u0113"+
		"\u0118\u011a\u012c\u0130\u0135\u013a\u0140\u0146\u0148\u014e\u0150\u029b"+
		"\u02c1\u02d1\u02d6\u0316\u031e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}