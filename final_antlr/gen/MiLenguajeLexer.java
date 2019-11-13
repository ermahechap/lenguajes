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
		TK_RIGHT_SHIFT_ASSIGN=121, ID_LETTER=122, DIGIT=123, SPACES=124, LINE_COMMENT=125;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "RESERVED_WORD_F", "BOOLEAN", 
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
			"TK_RIGHT_SHIFT_ASSIGN", "ID_LETTER", "DIGIT", "SPACES", "LINE_COMMENT"
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
			"TK_RIGHT_SHIFT_ASSIGN", "ID_LETTER", "DIGIT", "SPACES", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\177\u0337\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u011c\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0127\n\t\3\n\3\n\5\n\u012b\n\n\3\13\6\13\u012e\n\13\r\13"+
		"\16\13\u012f\3\f\6\f\u0133\n\f\r\f\16\f\u0134\3\f\3\f\6\f\u0139\n\f\r"+
		"\f\16\f\u013a\3\f\3\f\6\f\u013f\n\f\r\f\16\f\u0140\5\f\u0143\n\f\3\r\3"+
		"\r\3\r\3\r\7\r\u0149\n\r\f\r\16\r\u014c\13\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3"+
		":\3;\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3"+
		"?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3"+
		"D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\5F\u0274\nF\3G\3G\3G\7G\u0279\nG\f"+
		"G\16G\u027c\13G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N"+
		"\3N\3O\3O\3P\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3X"+
		"\3X\3X\3X\5X\u02aa\nX\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3]\3^\3^\3_\3_\3"+
		"`\3`\3a\3a\3a\3a\3b\3b\3b\3c\3c\3c\3d\3d\3d\3e\3e\3f\3f\3f\3f\5f\u02d0"+
		"\nf\3g\3g\3h\3h\3i\3i\3i\3j\3j\3j\3k\3k\3k\3k\5k\u02e0\nk\3l\3l\3l\5l"+
		"\u02e5\nl\3m\3m\3m\3m\3n\3n\3n\3o\3o\3o\3o\3p\3p\3p\3p\3q\3q\3q\3q\3r"+
		"\3r\3r\3r\3s\3s\3s\3s\3t\3t\3t\3t\3u\3u\3u\3u\3u\3v\3v\3v\3v\3w\3w\3w"+
		"\3w\3x\3x\3x\3x\3x\3y\3y\3y\3y\3y\3z\3z\3z\3z\3z\3{\3{\3|\3|\3}\6}\u0327"+
		"\n}\r}\16}\u0328\3}\3}\3~\3~\7~\u032f\n~\f~\16~\u0332\13~\3~\3~\3~\3~"+
		"\4\u014a\u0330\2\177\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5"+
		"d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9"+
		"n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3s\u00e5t\u00e7u\u00e9v\u00ebw\u00ed"+
		"x\u00efy\u00f1z\u00f3{\u00f5|\u00f7}\u00f9~\u00fb\177\3\2\4\5\2C\\aac"+
		"|\5\2\13\f\17\17\"\"\2\u034a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2"+
		"\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9"+
		"\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2"+
		"\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db"+
		"\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2"+
		"\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed"+
		"\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2"+
		"\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\3\u00fd\3\2\2\2\5\u0100"+
		"\3\2\2\2\7\u0103\3\2\2\2\t\u0108\3\2\2\2\13\u010d\3\2\2\2\r\u0114\3\2"+
		"\2\2\17\u011b\3\2\2\2\21\u0126\3\2\2\2\23\u012a\3\2\2\2\25\u012d\3\2\2"+
		"\2\27\u0142\3\2\2\2\31\u0144\3\2\2\2\33\u014f\3\2\2\2\35\u0154\3\2\2\2"+
		"\37\u015b\3\2\2\2!\u015f\3\2\2\2#\u0162\3\2\2\2%\u0167\3\2\2\2\'\u016a"+
		"\3\2\2\2)\u016d\3\2\2\2+\u0170\3\2\2\2-\u0173\3\2\2\2/\u017c\3\2\2\2\61"+
		"\u0186\3\2\2\2\63\u018b\3\2\2\2\65\u0192\3\2\2\2\67\u0196\3\2\2\29\u019a"+
		"\3\2\2\2;\u01a1\3\2\2\2=\u01a5\3\2\2\2?\u01ac\3\2\2\2A\u01af\3\2\2\2C"+
		"\u01b6\3\2\2\2E\u01ba\3\2\2\2G\u01bf\3\2\2\2I\u01c5\3\2\2\2K\u01ca\3\2"+
		"\2\2M\u01cd\3\2\2\2O\u01d2\3\2\2\2Q\u01d5\3\2\2\2S\u01d9\3\2\2\2U\u01dd"+
		"\3\2\2\2W\u01e0\3\2\2\2Y\u01e5\3\2\2\2[\u01eb\3\2\2\2]\u01f3\3\2\2\2_"+
		"\u01fa\3\2\2\2a\u01fe\3\2\2\2c\u0201\3\2\2\2e\u0209\3\2\2\2g\u0211\3\2"+
		"\2\2i\u0217\3\2\2\2k\u021f\3\2\2\2m\u0224\3\2\2\2o\u022a\3\2\2\2q\u022f"+
		"\3\2\2\2s\u0234\3\2\2\2u\u023a\3\2\2\2w\u023f\3\2\2\2y\u0242\3\2\2\2{"+
		"\u0245\3\2\2\2}\u024a\3\2\2\2\177\u0251\3\2\2\2\u0081\u0257\3\2\2\2\u0083"+
		"\u025b\3\2\2\2\u0085\u0260\3\2\2\2\u0087\u0265\3\2\2\2\u0089\u0268\3\2"+
		"\2\2\u008b\u0273\3\2\2\2\u008d\u0275\3\2\2\2\u008f\u027f\3\2\2\2\u0091"+
		"\u0283\3\2\2\2\u0093\u0286\3\2\2\2\u0095\u0288\3\2\2\2\u0097\u028a\3\2"+
		"\2\2\u0099\u028c\3\2\2\2\u009b\u028e\3\2\2\2\u009d\u0290\3\2\2\2\u009f"+
		"\u0292\3\2\2\2\u00a1\u0295\3\2\2\2\u00a3\u0297\3\2\2\2\u00a5\u0299\3\2"+
		"\2\2\u00a7\u029b\3\2\2\2\u00a9\u029d\3\2\2\2\u00ab\u02a0\3\2\2\2\u00ad"+
		"\u02a3\3\2\2\2\u00af\u02a9\3\2\2\2\u00b1\u02ab\3\2\2\2\u00b3\u02ad\3\2"+
		"\2\2\u00b5\u02af\3\2\2\2\u00b7\u02b1\3\2\2\2\u00b9\u02b3\3\2\2\2\u00bb"+
		"\u02b6\3\2\2\2\u00bd\u02b8\3\2\2\2\u00bf\u02ba\3\2\2\2\u00c1\u02bc\3\2"+
		"\2\2\u00c3\u02c0\3\2\2\2\u00c5\u02c3\3\2\2\2\u00c7\u02c6\3\2\2\2\u00c9"+
		"\u02c9\3\2\2\2\u00cb\u02cf\3\2\2\2\u00cd\u02d1\3\2\2\2\u00cf\u02d3\3\2"+
		"\2\2\u00d1\u02d5\3\2\2\2\u00d3\u02d8\3\2\2\2\u00d5\u02df\3\2\2\2\u00d7"+
		"\u02e4\3\2\2\2\u00d9\u02e6\3\2\2\2\u00db\u02ea\3\2\2\2\u00dd\u02ed\3\2"+
		"\2\2\u00df\u02f1\3\2\2\2\u00e1\u02f5\3\2\2\2\u00e3\u02f9\3\2\2\2\u00e5"+
		"\u02fd\3\2\2\2\u00e7\u0301\3\2\2\2\u00e9\u0305\3\2\2\2\u00eb\u030a\3\2"+
		"\2\2\u00ed\u030e\3\2\2\2\u00ef\u0312\3\2\2\2\u00f1\u0317\3\2\2\2\u00f3"+
		"\u031c\3\2\2\2\u00f5\u0321\3\2\2\2\u00f7\u0323\3\2\2\2\u00f9\u0326\3\2"+
		"\2\2\u00fb\u032c\3\2\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7p\2\2\u00ff\4"+
		"\3\2\2\2\u0100\u0101\7q\2\2\u0101\u0102\7e\2\2\u0102\6\3\2\2\2\u0103\u0104"+
		"\7u\2\2\u0104\u0105\7m\2\2\u0105\u0106\7k\2\2\u0106\u0107\7r\2\2\u0107"+
		"\b\3\2\2\2\u0108\u0109\7g\2\2\u0109\u010a\7z\2\2\u010a\u010b\7k\2\2\u010b"+
		"\u010c\7v\2\2\u010c\n\3\2\2\2\u010d\u010e\7P\2\2\u010e\u010f\7Q\2\2\u010f"+
		"\u0110\7V\2\2\u0110\u0111\7[\2\2\u0111\u0112\7G\2\2\u0112\u0113\7V\2\2"+
		"\u0113\f\3\2\2\2\u0114\u0115\7G\2\2\u0115\u0116\7Q\2\2\u0116\u0117\7H"+
		"\2\2\u0117\16\3\2\2\2\u0118\u011c\5G$\2\u0119\u011c\5]/\2\u011a\u011c"+
		"\5#\22\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\20\3\2\2\2\u011d\u011e\7v\2\2\u011e\u011f\7t\2\2\u011f\u0120\7w\2\2\u0120"+
		"\u0127\7g\2\2\u0121\u0122\7h\2\2\u0122\u0123\7c\2\2\u0123\u0124\7n\2\2"+
		"\u0124\u0125\7u\2\2\u0125\u0127\7g\2\2\u0126\u011d\3\2\2\2\u0126\u0121"+
		"\3\2\2\2\u0127\22\3\2\2\2\u0128\u012b\5\25\13\2\u0129\u012b\5\27\f\2\u012a"+
		"\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\24\3\2\2\2\u012c\u012e\5\u00f7"+
		"|\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\26\3\2\2\2\u0131\u0133\5\u00f7|\2\u0132\u0131\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0138\7\60\2\2\u0137\u0139\5\u00f7|\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u0143\3\2\2\2\u013c\u013e\7\60\2\2\u013d\u013f\5\u00f7|\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0132\3\2\2\2\u0142\u013c\3\2\2\2\u0143\30\3\2\2"+
		"\2\u0144\u014a\7$\2\2\u0145\u0146\7^\2\2\u0146\u0149\7$\2\2\u0147\u0149"+
		"\13\2\2\2\u0148\u0145\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2"+
		"\u014a\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014d\u014e\7$\2\2\u014e\32\3\2\2\2\u014f\u0150\7u\2\2\u0150"+
		"\u0151\7r\2\2\u0151\u0152\7g\2\2\u0152\u0153\7e\2\2\u0153\34\3\2\2\2\u0154"+
		"\u0155\7i\2\2\u0155\u0156\7n\2\2\u0156\u0157\7q\2\2\u0157\u0158\7d\2\2"+
		"\u0158\u0159\7c\2\2\u0159\u015a\7n\2\2\u015a\36\3\2\2\2\u015b\u015c\7"+
		"t\2\2\u015c\u015d\7g\2\2\u015d\u015e\7u\2\2\u015e \3\2\2\2\u015f\u0160"+
		"\7c\2\2\u0160\u0161\7h\2\2\u0161\"\3\2\2\2\u0162\u0163\7t\2\2\u0163\u0164"+
		"\7g\2\2\u0164\u0165\7c\2\2\u0165\u0166\7f\2\2\u0166$\3\2\2\2\u0167\u0168"+
		"\7k\2\2\u0168\u0169\7h\2\2\u0169&\3\2\2\2\u016a\u016b\7h\2\2\u016b\u016c"+
		"\7k\2\2\u016c(\3\2\2\2\u016d\u016e\7f\2\2\u016e\u016f\7q\2\2\u016f*\3"+
		"\2\2\2\u0170\u0171\7q\2\2\u0171\u0172\7f\2\2\u0172,\3\2\2\2\u0173\u0174"+
		"\7t\2\2\u0174\u0175\7g\2\2\u0175\u0176\7u\2\2\u0176\u0177\7q\2\2\u0177"+
		"\u0178\7w\2\2\u0178\u0179\7t\2\2\u0179\u017a\7e\2\2\u017a\u017b\7g\2\2"+
		"\u017b.\3\2\2\2\u017c\u017d\7r\2\2\u017d\u017e\7t\2\2\u017e\u017f\7q\2"+
		"\2\u017f\u0180\7e\2\2\u0180\u0181\7g\2\2\u0181\u0182\7f\2\2\u0182\u0183"+
		"\7w\2\2\u0183\u0184\7t\2\2\u0184\u0185\7g\2\2\u0185\60\3\2\2\2\u0186\u0187"+
		"\7v\2\2\u0187\u0188\7{\2\2\u0188\u0189\7r\2\2\u0189\u018a\7g\2\2\u018a"+
		"\62\3\2\2\2\u018b\u018c\7q\2\2\u018c\u018d\7r\2\2\u018d\u018e\7v\2\2\u018e"+
		"\u018f\7{\2\2\u018f\u0190\7r\2\2\u0190\u0191\7g\2\2\u0191\64\3\2\2\2\u0192"+
		"\u0193\7t\2\2\u0193\u0194\7g\2\2\u0194\u0195\7e\2\2\u0195\66\3\2\2\2\u0196"+
		"\u0197\7k\2\2\u0197\u0198\7p\2\2\u0198\u0199\7v\2\2\u01998\3\2\2\2\u019a"+
		"\u019b\7i\2\2\u019b\u019c\7g\2\2\u019c\u019d\7v\2\2\u019d\u019e\7c\2\2"+
		"\u019e\u019f\7t\2\2\u019f\u01a0\7i\2\2\u01a0:\3\2\2\2\u01a1\u01a2\7e\2"+
		"\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7r\2\2\u01a4<\3\2\2\2\u01a5\u01a6\7"+
		"k\2\2\u01a6\u01a7\7o\2\2\u01a7\u01a8\7r\2\2\u01a8\u01a9\7q\2\2\u01a9\u01aa"+
		"\7t\2\2\u01aa\u01ab\7v\2\2\u01ab>\3\2\2\2\u01ac\u01ad\7k\2\2\u01ad\u01ae"+
		"\7f\2\2\u01ae@\3\2\2\2\u01af\u01b0\7e\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2"+
		"\7g\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5\7g\2\2\u01b5"+
		"B\3\2\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7p\2\2\u01b8\u01b9\7f\2\2\u01b9"+
		"D\3\2\2\2\u01ba\u01bb\7u\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7q\2\2\u01bd"+
		"\u01be\7r\2\2\u01beF\3\2\2\2\u01bf\u01c0\7y\2\2\u01c0\u01c1\7t\2\2\u01c1"+
		"\u01c2\7k\2\2\u01c2\u01c3\7v\2\2\u01c3\u01c4\7g\2\2\u01c4H\3\2\2\2\u01c5"+
		"\u01c6\7u\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8\7p\2\2\u01c8\u01c9\7f\2\2"+
		"\u01c9J\3\2\2\2\u01ca\u01cb\7q\2\2\u01cb\u01cc\7t\2\2\u01ccL\3\2\2\2\u01cd"+
		"\u01ce\7d\2\2\u01ce\u01cf\7q\2\2\u01cf\u01d0\7f\2\2\u01d0\u01d1\7{\2\2"+
		"\u01d1N\3\2\2\2\u01d2\u01d3\7h\2\2\u01d3\u01d4\7c\2\2\u01d4P\3\2\2\2\u01d5"+
		"\u01d6\7o\2\2\u01d6\u01d7\7q\2\2\u01d7\u01d8\7f\2\2\u01d8R\3\2\2\2\u01d9"+
		"\u01da\7x\2\2\u01da\u01db\7c\2\2\u01db\u01dc\7t\2\2\u01dcT\3\2\2\2\u01dd"+
		"\u01de\7v\2\2\u01de\u01df\7q\2\2\u01dfV\3\2\2\2\u01e0\u01e1\7v\2\2\u01e1"+
		"\u01e2\7t\2\2\u01e2\u01e3\7w\2\2\u01e3\u01e4\7g\2\2\u01e4X\3\2\2\2\u01e5"+
		"\u01e6\7h\2\2\u01e6\u01e7\7c\2\2\u01e7\u01e8\7n\2\2\u01e8\u01e9\7u\2\2"+
		"\u01e9\u01ea\7g\2\2\u01eaZ\3\2\2\2\u01eb\u01ec\7t\2\2\u01ec\u01ed\7g\2"+
		"\2\u01ed\u01ee\7v\2\2\u01ee\u01ef\7w\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1"+
		"\7p\2\2\u01f1\u01f2\7u\2\2\u01f2\\\3\2\2\2\u01f3\u01f4\7y\2\2\u01f4\u01f5"+
		"\7t\2\2\u01f5\u01f6\7k\2\2\u01f6\u01f7\7v\2\2\u01f7\u01f8\7g\2\2\u01f8"+
		"\u01f9\7u\2\2\u01f9^\3\2\2\2\u01fa\u01fb\7r\2\2\u01fb\u01fc\7w\2\2\u01fc"+
		"\u01fd\7v\2\2\u01fd`\3\2\2\2\u01fe\u01ff\7q\2\2\u01ff\u0200\7r\2\2\u0200"+
		"b\3\2\2\2\u0201\u0202\7t\2\2\u0202\u0203\7g\2\2\u0203\u0204\7e\2\2\u0204"+
		"\u0205\7g\2\2\u0205\u0206\7k\2\2\u0206\u0207\7x\2\2\u0207\u0208\7g\2\2"+
		"\u0208d\3\2\2\2\u0209\u020a\7f\2\2\u020a\u020b\7g\2\2\u020b\u020c\7u\2"+
		"\2\u020c\u020d\7v\2\2\u020d\u020e\7t\2\2\u020e\u020f\7q\2\2\u020f\u0210"+
		"\7{\2\2\u0210f\3\2\2\2\u0211\u0212\7h\2\2\u0212\u0213\7k\2\2\u0213\u0214"+
		"\7p\2\2\u0214\u0215\7c\2\2\u0215\u0216\7n\2\2\u0216h\3\2\2\2\u0217\u0218"+
		"\7r\2\2\u0218\u0219\7t\2\2\u0219\u021a\7q\2\2\u021a\u021b\7e\2\2\u021b"+
		"\u021c\7g\2\2\u021c\u021d\7u\2\2\u021d\u021e\7u\2\2\u021ej\3\2\2\2\u021f"+
		"\u0220\7e\2\2\u0220\u0221\7j\2\2\u0221\u0222\7c\2\2\u0222\u0223\7t\2\2"+
		"\u0223l\3\2\2\2\u0224\u0225\7e\2\2\u0225\u0226\7j\2\2\u0226\u0227\7c\2"+
		"\2\u0227\u0228\7t\2\2\u0228\u0229\7u\2\2\u0229n\3\2\2\2\u022a\u022b\7"+
		"d\2\2\u022b\u022c\7q\2\2\u022c\u022d\7q\2\2\u022d\u022e\7n\2\2\u022ep"+
		"\3\2\2\2\u022f\u0230\7t\2\2\u0230\u0231\7g\2\2\u0231\u0232\7c\2\2\u0232"+
		"\u0233\7n\2\2\u0233r\3\2\2\2\u0234\u0235\7t\2\2\u0235\u0236\7g\2\2\u0236"+
		"\u0237\7r\2\2\u0237\u0238\7n\2\2\u0238\u0239\7{\2\2\u0239t\3\2\2\2\u023a"+
		"\u023b\7p\2\2\u023b\u023c\7g\2\2\u023c\u023d\7z\2\2\u023d\u023e\7v\2\2"+
		"\u023ev\3\2\2\2\u023f\u0240\7p\2\2\u0240\u0241\7k\2\2\u0241x\3\2\2\2\u0242"+
		"\u0243\7e\2\2\u0243\u0244\7q\2\2\u0244z\3\2\2\2\u0245\u0246\7r\2\2\u0246"+
		"\u0247\7t\2\2\u0247\u0248\7q\2\2\u0248\u0249\7e\2\2\u0249|\3\2\2\2\u024a"+
		"\u024b\7u\2\2\u024b\u024c\7v\2\2\u024c\u024d\7t\2\2\u024d\u024e\7k\2\2"+
		"\u024e\u024f\7p\2\2\u024f\u0250\7i\2\2\u0250~\3\2\2\2\u0251\u0252\7e\2"+
		"\2\u0252\u0253\7q\2\2\u0253\u0254\7p\2\2\u0254\u0255\7u\2\2\u0255\u0256"+
		"\7v\2\2\u0256\u0080\3\2\2\2\u0257\u0258\7n\2\2\u0258\u0259\7q\2\2\u0259"+
		"\u025a\7y\2\2\u025a\u0082\3\2\2\2\u025b\u025c\7j\2\2\u025c\u025d\7k\2"+
		"\2\u025d\u025e\7i\2\2\u025e\u025f\7j\2\2\u025f\u0084\3\2\2\2\u0260\u0261"+
		"\7e\2\2\u0261\u0262\7c\2\2\u0262\u0263\7n\2\2\u0263\u0264\7n\2\2\u0264"+
		"\u0086\3\2\2\2\u0265\u0266\7k\2\2\u0266\u0267\7p\2\2\u0267\u0088\3\2\2"+
		"\2\u0268\u0269\7u\2\2\u0269\u026a\7g\2\2\u026a\u026b\7r\2\2\u026b\u026c"+
		"\7c\2\2\u026c\u026d\7t\2\2\u026d\u026e\7c\2\2\u026e\u026f\7v\2\2\u026f"+
		"\u0270\7g\2\2\u0270\u008a\3\2\2\2\u0271\u0274\5\u008dG\2\u0272\u0274\5"+
		"\u008fH\2\u0273\u0271\3\2\2\2\u0273\u0272\3\2\2\2\u0274\u008c\3\2\2\2"+
		"\u0275\u027a\5\u00f5{\2\u0276\u0279\5\u00f5{\2\u0277\u0279\5\u00f7|\2"+
		"\u0278\u0276\3\2\2\2\u0278\u0277\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278"+
		"\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c\u027a\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u008e\3\2\2\2\u027f\u0280\5\u008dG\2\u0280\u0281"+
		"\7\60\2\2\u0281\u0282\5\u008dG\2\u0282\u0090\3\2\2\2\u0283\u0284\7]\2"+
		"\2\u0284\u0285\7_\2\2\u0285\u0092\3\2\2\2\u0286\u0287\7]\2\2\u0287\u0094"+
		"\3\2\2\2\u0288\u0289\7_\2\2\u0289\u0096\3\2\2\2\u028a\u028b\7*\2\2\u028b"+
		"\u0098\3\2\2\2\u028c\u028d\7+\2\2\u028d\u009a\3\2\2\2\u028e\u028f\7}\2"+
		"\2\u028f\u009c\3\2\2\2\u0290\u0291\7\177\2\2\u0291\u009e\3\2\2\2\u0292"+
		"\u0293\7/\2\2\u0293\u0294\7@\2\2\u0294\u00a0\3\2\2\2\u0295\u0296\7\60"+
		"\2\2\u0296\u00a2\3\2\2\2\u0297\u0298\7=\2\2\u0298\u00a4\3\2\2\2\u0299"+
		"\u029a\7<\2\2\u029a\u00a6\3\2\2\2\u029b\u029c\7.\2\2\u029c\u00a8\3\2\2"+
		"\2\u029d\u029e\7-\2\2\u029e\u029f\7-\2\2\u029f\u00aa\3\2\2\2\u02a0\u02a1"+
		"\7/\2\2\u02a1\u02a2\7/\2\2\u02a2\u00ac\3\2\2\2\u02a3\u02a4\7`\2\2\u02a4"+
		"\u00ae\3\2\2\2\u02a5\u02a6\7p\2\2\u02a6\u02a7\7q\2\2\u02a7\u02aa\7v\2"+
		"\2\u02a8\u02aa\7\u0080\2\2\u02a9\u02a5\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa"+
		"\u00b0\3\2\2\2\u02ab\u02ac\7-\2\2\u02ac\u00b2\3\2\2\2\u02ad\u02ae\7/\2"+
		"\2\u02ae\u00b4\3\2\2\2\u02af\u02b0\7B\2\2\u02b0\u00b6\3\2\2\2\u02b1\u02b2"+
		"\7A\2\2\u02b2\u00b8\3\2\2\2\u02b3\u02b4\7,\2\2\u02b4\u02b5\7,\2\2\u02b5"+
		"\u00ba\3\2\2\2\u02b6\u02b7\7,\2\2\u02b7\u00bc\3\2\2\2\u02b8\u02b9\7\61"+
		"\2\2\u02b9\u00be\3\2\2\2\u02ba\u02bb\7\'\2\2\u02bb\u00c0\3\2\2\2\u02bc"+
		"\u02bd\7o\2\2\u02bd\u02be\7q\2\2\u02be\u02bf\7f\2\2\u02bf\u00c2\3\2\2"+
		"\2\u02c0\u02c1\7~\2\2\u02c1\u02c2\7~\2\2\u02c2\u00c4\3\2\2\2\u02c3\u02c4"+
		"\7>\2\2\u02c4\u02c5\7>\2\2\u02c5\u00c6\3\2\2\2\u02c6\u02c7\7@\2\2\u02c7"+
		"\u02c8\7@\2\2\u02c8\u00c8\3\2\2\2\u02c9\u02ca\7?\2\2\u02ca\u00ca\3\2\2"+
		"\2\u02cb\u02cc\7#\2\2\u02cc\u02d0\7?\2\2\u02cd\u02ce\7\u0080\2\2\u02ce"+
		"\u02d0\7?\2\2\u02cf\u02cb\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u00cc\3\2"+
		"\2\2\u02d1\u02d2\7@\2\2\u02d2\u00ce\3\2\2\2\u02d3\u02d4\7>\2\2\u02d4\u00d0"+
		"\3\2\2\2\u02d5\u02d6\7@\2\2\u02d6\u02d7\7?\2\2\u02d7\u00d2\3\2\2\2\u02d8"+
		"\u02d9\7>\2\2\u02d9\u02da\7?\2\2\u02da\u00d4\3\2\2\2\u02db\u02e0\7(\2"+
		"\2\u02dc\u02dd\7c\2\2\u02dd\u02de\7p\2\2\u02de\u02e0\7f\2\2\u02df\u02db"+
		"\3\2\2\2\u02df\u02dc\3\2\2\2\u02e0\u00d6\3\2\2\2\u02e1\u02e2\7q\2\2\u02e2"+
		"\u02e5\7t\2\2\u02e3\u02e5\7~\2\2\u02e4\u02e1\3\2\2\2\u02e4\u02e3\3\2\2"+
		"\2\u02e5\u00d8\3\2\2\2\u02e6\u02e7\7z\2\2\u02e7\u02e8\7q\2\2\u02e8\u02e9"+
		"\7t\2\2\u02e9\u00da\3\2\2\2\u02ea\u02eb\7<\2\2\u02eb\u02ec\7?\2\2\u02ec"+
		"\u00dc\3\2\2\2\u02ed\u02ee\7<\2\2\u02ee\u02ef\7?\2\2\u02ef\u02f0\7<\2"+
		"\2\u02f0\u00de\3\2\2\2\u02f1\u02f2\7-\2\2\u02f2\u02f3\7<\2\2\u02f3\u02f4"+
		"\7?\2\2\u02f4\u00e0\3\2\2\2\u02f5\u02f6\7/\2\2\u02f6\u02f7\7<\2\2\u02f7"+
		"\u02f8\7?\2\2\u02f8\u00e2\3\2\2\2\u02f9\u02fa\7,\2\2\u02fa\u02fb\7<\2"+
		"\2\u02fb\u02fc\7?\2\2\u02fc\u00e4\3\2\2\2\u02fd\u02fe\7\61\2\2\u02fe\u02ff"+
		"\7<\2\2\u02ff\u0300\7?\2\2\u0300\u00e6\3\2\2\2\u0301\u0302\7\'\2\2\u0302"+
		"\u0303\7<\2\2\u0303\u0304\7?\2\2\u0304\u00e8\3\2\2\2\u0305\u0306\7,\2"+
		"\2\u0306\u0307\7,\2\2\u0307\u0308\7<\2\2\u0308\u0309\7?\2\2\u0309\u00ea"+
		"\3\2\2\2\u030a\u030b\7~\2\2\u030b\u030c\7<\2\2\u030c\u030d\7?\2\2\u030d"+
		"\u00ec\3\2\2\2\u030e\u030f\7(\2\2\u030f\u0310\7<\2\2\u0310\u0311\7?\2"+
		"\2\u0311\u00ee\3\2\2\2\u0312\u0313\7~\2\2\u0313\u0314\7~\2\2\u0314\u0315"+
		"\7<\2\2\u0315\u0316\7?\2\2\u0316\u00f0\3\2\2\2\u0317\u0318\7>\2\2\u0318"+
		"\u0319\7>\2\2\u0319\u031a\7<\2\2\u031a\u031b\7?\2\2\u031b\u00f2\3\2\2"+
		"\2\u031c\u031d\7@\2\2\u031d\u031e\7@\2\2\u031e\u031f\7<\2\2\u031f\u0320"+
		"\7?\2\2\u0320\u00f4\3\2\2\2\u0321\u0322\t\2\2\2\u0322\u00f6\3\2\2\2\u0323"+
		"\u0324\4\62;\2\u0324\u00f8\3\2\2\2\u0325\u0327\t\3\2\2\u0326\u0325\3\2"+
		"\2\2\u0327\u0328\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u032b\b}\2\2\u032b\u00fa\3\2\2\2\u032c\u0330\7%\2"+
		"\2\u032d\u032f\13\2\2\2\u032e\u032d\3\2\2\2\u032f\u0332\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u0330\3\2"+
		"\2\2\u0333\u0334\7\f\2\2\u0334\u0335\3\2\2\2\u0335\u0336\b~\2\2\u0336"+
		"\u00fc\3\2\2\2\26\2\u011b\u0126\u012a\u012f\u0134\u013a\u0140\u0142\u0148"+
		"\u014a\u0273\u0278\u027a\u02a9\u02cf\u02df\u02e4\u0328\u0330\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}