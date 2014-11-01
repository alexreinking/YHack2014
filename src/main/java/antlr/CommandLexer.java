// Generated from /Users/dani/Documents/yale/yhack/YHack2014/src/main/java/Command.g4 by ANTLR 4.4.1-dev
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, Attack=5, Check=6, Down=7, Drop=8, East=9, 
		Eat=10, Enter=11, Examine=12, Exit=13, Give=14, Go=15, Health=16, Inspect=17, 
		Inventory=18, Leave=19, Look=20, North=21, Open=22, Pick=23, South=24, 
		Status=25, Take=26, Touch=27, Trade=28, Up=29, Walk=30, With=31, West=32, 
		Identifier=33, WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "Attack", "Check", "Down", "Drop", "East", 
		"Eat", "Enter", "Examine", "Exit", "Give", "Go", "Health", "Inspect", 
		"Inventory", "Leave", "Look", "North", "Open", "Pick", "South", "Status", 
		"Take", "Touch", "Trade", "Up", "Walk", "With", "West", "Identifier", 
		"WS"
	};


	public CommandLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Command.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u010a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00aa\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00bd\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u00cf\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\5!\u00fb\n!\3\"\3\"\7\"\u00ff\n\"\f\"\16\"\u0102\13\""+
		"\3#\6#\u0105\n#\r#\16#\u0106\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\5\4\2C\\c|\5\2"+
		"\62;C\\c|\5\2\13\f\17\17\"\"\u0110\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7L\3\2\2\2\tP\3\2\2\2\13"+
		"S\3\2\2\2\rZ\3\2\2\2\17`\3\2\2\2\21e\3\2\2\2\23o\3\2\2\2\25q\3\2\2\2\27"+
		"u\3\2\2\2\31{\3\2\2\2\33\u0083\3\2\2\2\35\u0088\3\2\2\2\37\u008d\3\2\2"+
		"\2!\u0090\3\2\2\2#\u0097\3\2\2\2%\u00a9\3\2\2\2\'\u00ab\3\2\2\2)\u00b1"+
		"\3\2\2\2+\u00bc\3\2\2\2-\u00be\3\2\2\2/\u00c3\3\2\2\2\61\u00ce\3\2\2\2"+
		"\63\u00d0\3\2\2\2\65\u00d7\3\2\2\2\67\u00dc\3\2\2\29\u00e2\3\2\2\2;\u00e8"+
		"\3\2\2\2=\u00eb\3\2\2\2?\u00f0\3\2\2\2A\u00fa\3\2\2\2C\u00fc\3\2\2\2E"+
		"\u0104\3\2\2\2GH\7c\2\2H\4\3\2\2\2IJ\7c\2\2JK\7v\2\2K\6\3\2\2\2LM\7v\2"+
		"\2MN\7j\2\2NO\7g\2\2O\b\3\2\2\2PQ\7o\2\2QR\7{\2\2R\n\3\2\2\2ST\7c\2\2"+
		"TU\7v\2\2UV\7v\2\2VW\7c\2\2WX\7e\2\2XY\7m\2\2Y\f\3\2\2\2Z[\7e\2\2[\\\7"+
		"j\2\2\\]\7g\2\2]^\7e\2\2^_\7m\2\2_\16\3\2\2\2`a\7f\2\2ab\7q\2\2bc\7y\2"+
		"\2cd\7p\2\2d\20\3\2\2\2ef\7f\2\2fg\7t\2\2gh\7q\2\2hi\7r\2\2i\22\3\2\2"+
		"\2jk\7g\2\2kl\7c\2\2lm\7u\2\2mp\7v\2\2np\7g\2\2oj\3\2\2\2on\3\2\2\2p\24"+
		"\3\2\2\2qr\7g\2\2rs\7c\2\2st\7v\2\2t\26\3\2\2\2uv\7g\2\2vw\7p\2\2wx\7"+
		"v\2\2xy\7g\2\2yz\7t\2\2z\30\3\2\2\2{|\7g\2\2|}\7z\2\2}~\7c\2\2~\177\7"+
		"o\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7g\2\2\u0082\32"+
		"\3\2\2\2\u0083\u0084\7g\2\2\u0084\u0085\7z\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7v\2\2\u0087\34\3\2\2\2\u0088\u0089\7i\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7x\2\2\u008b\u008c\7g\2\2\u008c\36\3\2\2\2\u008d\u008e\7i\2\2\u008e"+
		"\u008f\7q\2\2\u008f \3\2\2\2\u0090\u0091\7j\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7c\2\2\u0093\u0094\7n\2\2\u0094\u0095\7v\2\2\u0095\u0096\7j\2\2"+
		"\u0096\"\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7u"+
		"\2\2\u009a\u009b\7r\2\2\u009b\u009c\7g\2\2\u009c\u009d\7e\2\2\u009d\u009e"+
		"\7v\2\2\u009e$\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2"+
		"\7x\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\u00aa\7{\2\2\u00a8\u00aa\7k\2\2"+
		"\u00a9\u009f\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7"+
		"n\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7x\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4"+
		"\7q\2\2\u00b4\u00b5\7m\2\2\u00b5*\3\2\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bd\7j\2\2\u00bb"+
		"\u00bd\7p\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd,\3\2\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7p\2\2"+
		"\u00c2.\3\2\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7e\2"+
		"\2\u00c6\u00c7\7m\2\2\u00c7\60\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca"+
		"\7q\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cf\7j\2\2\u00cd"+
		"\u00cf\7u\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\62\3\2\2\2"+
		"\u00d0\u00d1\7u\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7u\2\2\u00d6\64\3\2\2\2\u00d7\u00d8"+
		"\7v\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7m\2\2\u00da\u00db\7g\2\2\u00db"+
		"\66\3\2\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7w\2\2\u00df"+
		"\u00e0\7e\2\2\u00e0\u00e1\7j\2\2\u00e18\3\2\2\2\u00e2\u00e3\7v\2\2\u00e3"+
		"\u00e4\7t\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7g\2\2"+
		"\u00e7:\3\2\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7r\2\2\u00ea<\3\2\2\2\u00eb"+
		"\u00ec\7y\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7m\2\2"+
		"\u00ef>\3\2\2\2\u00f0\u00f1\7y\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7v\2"+
		"\2\u00f3\u00f4\7j\2\2\u00f4@\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6\u00f7\7"+
		"g\2\2\u00f7\u00f8\7u\2\2\u00f8\u00fb\7v\2\2\u00f9\u00fb\7y\2\2\u00fa\u00f5"+
		"\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fbB\3\2\2\2\u00fc\u0100\t\2\2\2\u00fd"+
		"\u00ff\t\3\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101D\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105"+
		"\t\4\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\b#\2\2\u0109F\3\2\2\2\n"+
		"\2o\u00a9\u00bc\u00ce\u00fa\u0100\u0106\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}