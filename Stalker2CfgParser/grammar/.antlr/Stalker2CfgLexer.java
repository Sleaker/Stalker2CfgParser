// Generated from f:/Apps/Stalker2Modding/Stalker2PakCfgMergeTool/Stalker2PakCfgMergeTool/grammar/Stalker2Cfg.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Stalker2CfgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SINGLE_LINE_COMMENT=4, LITERAL=5, STRING=6, PATH=7, 
		NUMBER=8, SYMBOL=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "SINGLE_LINE_COMMENT", "LITERAL", "STRING", "PATH", 
			"SINGLE_QUOTE_CHAR", "NUMBER", "SYMBOL", "INT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "': struct.begin'", "'struct.end'", "'='", null, null, null, null, 
			null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "SINGLE_LINE_COMMENT", "LITERAL", "STRING", "PATH", 
			"NUMBER", "SYMBOL", "WS"
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


	public Stalker2CfgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Stalker2Cfg.g4"; }

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
		"\u0004\u0000\n\u008d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003<\b"+
		"\u0003\n\u0003\f\u0003?\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004P\b\u0004\u0001\u0005\u0004\u0005S\b\u0005\u000b\u0005\f\u0005T"+
		"\u0001\u0006\u0001\u0006\u0005\u0006Y\b\u0006\n\u0006\f\u0006\\\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\be\b\b\n\b\f\bh\t\b\u0001\b\u0003\bk\b\b\u0001\b\u0001\b\u0004"+
		"\bo\b\b\u000b\b\f\bp\u0001\b\u0003\bt\b\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n{\b\n\n\n\f\n~\t\n\u0003\n\u0080\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0085\b\u000b\u0001\f\u0004\f\u0088\b\f"+
		"\u000b\f\f\f\u0089\u0001\f\u0001\f\u0001=\u0000\r\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011"+
		"\b\u0013\t\u0015\u0000\u0017\u0000\u0019\n\u0001\u0000\u0007\u0004\u0000"+
		"0:AZ__az\u0004\u0000\n\n\r\r\'\'\\\\\u0001\u000009\u0001\u0000ff\u0001"+
		"\u000019\u0003\u0000\n\n\r\r\u2028\u2029\u0006\u0000\t\n\r\r  \u00a0\u00a0"+
		"\u2003\u2003\u8000\ufeff\u8000\ufeff\u0096\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003"+
		"*\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u00077\u0001"+
		"\u0000\u0000\u0000\tO\u0001\u0000\u0000\u0000\u000bR\u0001\u0000\u0000"+
		"\u0000\rV\u0001\u0000\u0000\u0000\u000f_\u0001\u0000\u0000\u0000\u0011"+
		"s\u0001\u0000\u0000\u0000\u0013u\u0001\u0000\u0000\u0000\u0015\u007f\u0001"+
		"\u0000\u0000\u0000\u0017\u0084\u0001\u0000\u0000\u0000\u0019\u0087\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005:\u0000\u0000\u001c\u001d\u0005 \u0000"+
		"\u0000\u001d\u001e\u0005s\u0000\u0000\u001e\u001f\u0005t\u0000\u0000\u001f"+
		" \u0005r\u0000\u0000 !\u0005u\u0000\u0000!\"\u0005c\u0000\u0000\"#\u0005"+
		"t\u0000\u0000#$\u0005.\u0000\u0000$%\u0005b\u0000\u0000%&\u0005e\u0000"+
		"\u0000&\'\u0005g\u0000\u0000\'(\u0005i\u0000\u0000()\u0005n\u0000\u0000"+
		")\u0002\u0001\u0000\u0000\u0000*+\u0005s\u0000\u0000+,\u0005t\u0000\u0000"+
		",-\u0005r\u0000\u0000-.\u0005u\u0000\u0000./\u0005c\u0000\u0000/0\u0005"+
		"t\u0000\u000001\u0005.\u0000\u000012\u0005e\u0000\u000023\u0005n\u0000"+
		"\u000034\u0005d\u0000\u00004\u0004\u0001\u0000\u0000\u000056\u0005=\u0000"+
		"\u00006\u0006\u0001\u0000\u0000\u000078\u0005/\u0000\u000089\u0005/\u0000"+
		"\u00009=\u0001\u0000\u0000\u0000:<\t\u0000\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000<?\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000>B\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@C\u0003"+
		"\u0017\u000b\u0000AC\u0005\u0000\u0000\u0001B@\u0001\u0000\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0006\u0003\u0000"+
		"\u0000E\b\u0001\u0000\u0000\u0000FG\u0005t\u0000\u0000GH\u0005r\u0000"+
		"\u0000HI\u0005u\u0000\u0000IP\u0005e\u0000\u0000JK\u0005f\u0000\u0000"+
		"KL\u0005a\u0000\u0000LM\u0005l\u0000\u0000MN\u0005s\u0000\u0000NP\u0005"+
		"e\u0000\u0000OF\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000P\n\u0001"+
		"\u0000\u0000\u0000QS\u0007\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000U\f\u0001\u0000\u0000\u0000VZ\u0005\'\u0000\u0000WY\u0003\u000f"+
		"\u0007\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]^\u0005\'\u0000\u0000^\u000e\u0001\u0000\u0000"+
		"\u0000_`\b\u0001\u0000\u0000`\u0010\u0001\u0000\u0000\u0000aj\u0003\u0015"+
		"\n\u0000bf\u0005.\u0000\u0000ce\u0007\u0002\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"ik\u0007\u0003\u0000\u0000jb\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000kt\u0001\u0000\u0000\u0000ln\u0005.\u0000\u0000mo\u0007\u0002\u0000"+
		"\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0007"+
		"\u0003\u0000\u0000sa\u0001\u0000\u0000\u0000sl\u0001\u0000\u0000\u0000"+
		"t\u0012\u0001\u0000\u0000\u0000uv\u0005-\u0000\u0000v\u0014\u0001\u0000"+
		"\u0000\u0000w\u0080\u00050\u0000\u0000x|\u0007\u0004\u0000\u0000y{\u0007"+
		"\u0002\u0000\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0080\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000\u007fw\u0001\u0000\u0000\u0000"+
		"\u007fx\u0001\u0000\u0000\u0000\u0080\u0016\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005\r\u0000\u0000\u0082\u0085\u0005\n\u0000\u0000\u0083\u0085"+
		"\u0007\u0005\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0018\u0001\u0000\u0000\u0000\u0086\u0088"+
		"\u0007\u0006\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0006\f\u0000\u0000\u008c\u001a\u0001\u0000\u0000\u0000\u000e\u0000="+
		"BOTZfjps|\u007f\u0084\u0089\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}