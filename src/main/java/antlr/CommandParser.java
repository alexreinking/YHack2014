// Generated from /Users/alexreinking/YHack2014/src/main/java/Command.g4 by ANTLR 4.4.1-dev
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, Attack=5, Check=6, Down=7, Drop=8, East=9, 
		Eat=10, Enter=11, Examine=12, Exit=13, Give=14, Go=15, Health=16, Inspect=17, 
		Inventory=18, Leave=19, Look=20, North=21, Open=22, Pick=23, South=24, 
		Status=25, Take=26, Touch=27, Trade=28, Up=29, Walk=30, With=31, West=32, 
		Number=33, Identifier=34, WS=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'at'", "'a'", "'my'", "'the'", "'attack'", "'check'", "'down'", 
		"'drop'", "East", "'eat'", "'enter'", "'examine'", "'exit'", "'give'", 
		"'go'", "'health'", "'inspect'", "Inventory", "'leave'", "'look'", "North", 
		"'open'", "'pick'", "South", "'status'", "'take'", "'touch'", "'trade'", 
		"'up'", "'walk'", "'with'", "West", "Number", "Identifier", "WS"
	};
	public static final int
		RULE_command = 0, RULE_specificCommand = 1, RULE_movement = 2, RULE_relativeMovement = 3, 
		RULE_specificMovement = 4, RULE_direction = 5, RULE_inspection = 6, RULE_interaction = 7, 
		RULE_attack = 8, RULE_gift = 9, RULE_inventory = 10, RULE_check = 11, 
		RULE_checkHealth = 12, RULE_checkStatus = 13, RULE_longName = 14;
	public static final String[] ruleNames = {
		"command", "specificCommand", "movement", "relativeMovement", "specificMovement", 
		"direction", "inspection", "interaction", "attack", "gift", "inventory", 
		"check", "checkHealth", "checkStatus", "longName"
	};

	@Override
	public String getGrammarFileName() { return "Command.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandContext extends ParserRuleContext {
		public SpecificCommandContext specificCommand() {
			return getRuleContext(SpecificCommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CommandParser.EOF, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); specificCommand();
			setState(31); match(EOF);
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

	public static class SpecificCommandContext extends ParserRuleContext {
		public InventoryContext inventory() {
			return getRuleContext(InventoryContext.class,0);
		}
		public InspectionContext inspection() {
			return getRuleContext(InspectionContext.class,0);
		}
		public GiftContext gift() {
			return getRuleContext(GiftContext.class,0);
		}
		public MovementContext movement() {
			return getRuleContext(MovementContext.class,0);
		}
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public AttackContext attack() {
			return getRuleContext(AttackContext.class,0);
		}
		public InteractionContext interaction() {
			return getRuleContext(InteractionContext.class,0);
		}
		public SpecificCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specificCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterSpecificCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitSpecificCommand(this);
		}
	}

	public final SpecificCommandContext specificCommand() throws RecognitionException {
		SpecificCommandContext _localctx = new SpecificCommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_specificCommand);
		try {
			setState(40);
			switch (_input.LA(1)) {
			case Down:
			case East:
			case Enter:
			case Exit:
			case Go:
			case Leave:
			case North:
			case South:
			case Up:
			case Walk:
			case West:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); movement();
				}
				break;
			case Examine:
			case Inspect:
			case Look:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); inspection();
				}
				break;
			case Drop:
			case Eat:
			case Pick:
			case Take:
			case Touch:
				enterOuterAlt(_localctx, 3);
				{
				setState(35); interaction();
				}
				break;
			case Attack:
				enterOuterAlt(_localctx, 4);
				{
				setState(36); attack();
				}
				break;
			case Give:
				enterOuterAlt(_localctx, 5);
				{
				setState(37); gift();
				}
				break;
			case Inventory:
			case Open:
				enterOuterAlt(_localctx, 6);
				{
				setState(38); inventory();
				}
				break;
			case Check:
			case Health:
			case Status:
				enterOuterAlt(_localctx, 7);
				{
				setState(39); check();
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

	public static class MovementContext extends ParserRuleContext {
		public RelativeMovementContext relativeMovement() {
			return getRuleContext(RelativeMovementContext.class,0);
		}
		public SpecificMovementContext specificMovement() {
			return getRuleContext(SpecificMovementContext.class,0);
		}
		public MovementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterMovement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitMovement(this);
		}
	}

	public final MovementContext movement() throws RecognitionException {
		MovementContext _localctx = new MovementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_movement);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case Down:
			case East:
			case Go:
			case Leave:
			case North:
			case South:
			case Up:
			case Walk:
			case West:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); relativeMovement();
				}
				break;
			case Enter:
			case Exit:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); specificMovement();
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

	public static class RelativeMovementContext extends ParserRuleContext {
		public TerminalNode Walk() { return getToken(CommandParser.Walk, 0); }
		public TerminalNode Go() { return getToken(CommandParser.Go, 0); }
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public RelativeMovementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeMovement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterRelativeMovement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitRelativeMovement(this);
		}
	}

	public final RelativeMovementContext relativeMovement() throws RecognitionException {
		RelativeMovementContext _localctx = new RelativeMovementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relativeMovement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if (_la==Go || _la==Walk) {
				{
				setState(46);
				_la = _input.LA(1);
				if ( !(_la==Go || _la==Walk) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(49); direction();
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

	public static class SpecificMovementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CommandParser.Identifier, 0); }
		public TerminalNode Enter() { return getToken(CommandParser.Enter, 0); }
		public TerminalNode Exit() { return getToken(CommandParser.Exit, 0); }
		public SpecificMovementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specificMovement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterSpecificMovement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitSpecificMovement(this);
		}
	}

	public final SpecificMovementContext specificMovement() throws RecognitionException {
		SpecificMovementContext _localctx = new SpecificMovementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_specificMovement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !(_la==Enter || _la==Exit) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(52); match(Identifier);
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

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode East() { return getToken(CommandParser.East, 0); }
		public TerminalNode Up() { return getToken(CommandParser.Up, 0); }
		public TerminalNode North() { return getToken(CommandParser.North, 0); }
		public TerminalNode Leave() { return getToken(CommandParser.Leave, 0); }
		public TerminalNode South() { return getToken(CommandParser.South, 0); }
		public TerminalNode West() { return getToken(CommandParser.West, 0); }
		public TerminalNode Down() { return getToken(CommandParser.Down, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitDirection(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Down) | (1L << East) | (1L << Leave) | (1L << North) | (1L << South) | (1L << Up) | (1L << West))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class InspectionContext extends ParserRuleContext {
		public TerminalNode Inspect() { return getToken(CommandParser.Inspect, 0); }
		public TerminalNode Look() { return getToken(CommandParser.Look, 0); }
		public TerminalNode Examine() { return getToken(CommandParser.Examine, 0); }
		public LongNameContext longName() {
			return getRuleContext(LongNameContext.class,0);
		}
		public InspectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inspection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterInspection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitInspection(this);
		}
	}

	public final InspectionContext inspection() throws RecognitionException {
		InspectionContext _localctx = new InspectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inspection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			switch (_input.LA(1)) {
			case Look:
				{
				setState(56); match(Look);
				setState(57); match(T__3);
				}
				break;
			case Inspect:
				{
				setState(58); match(Inspect);
				}
				break;
			case Examine:
				{
				setState(59); match(Examine);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(62); longName();
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

	public static class InteractionContext extends ParserRuleContext {
		public TerminalNode Eat() { return getToken(CommandParser.Eat, 0); }
		public TerminalNode Touch() { return getToken(CommandParser.Touch, 0); }
		public LongNameContext longName() {
			return getRuleContext(LongNameContext.class,0);
		}
		public TerminalNode Number() { return getToken(CommandParser.Number, 0); }
		public TerminalNode Drop() { return getToken(CommandParser.Drop, 0); }
		public TerminalNode Take() { return getToken(CommandParser.Take, 0); }
		public TerminalNode Pick() { return getToken(CommandParser.Pick, 0); }
		public InteractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterInteraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitInteraction(this);
		}
	}

	public final InteractionContext interaction() throws RecognitionException {
		InteractionContext _localctx = new InteractionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interaction);
		int _la;
		try {
			setState(81);
			switch (_input.LA(1)) {
			case Touch:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(Touch);
				setState(65); longName();
				}
				break;
			case Pick:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); match(Pick);
				setState(67); match(Up);
				setState(68); longName();
				}
				break;
			case Take:
				enterOuterAlt(_localctx, 3);
				{
				setState(69); match(Take);
				setState(70); longName();
				}
				break;
			case Drop:
				enterOuterAlt(_localctx, 4);
				{
				setState(71); match(Drop);
				setState(73);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__1) | (1L << T__0))) != 0)) {
					{
					setState(72);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__1) | (1L << T__0))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(75); longName();
				setState(77);
				_la = _input.LA(1);
				if (_la==Number) {
					{
					setState(76); match(Number);
					}
				}

				}
				break;
			case Eat:
				enterOuterAlt(_localctx, 5);
				{
				setState(79); match(Eat);
				setState(80); longName();
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

	public static class AttackContext extends ParserRuleContext {
		public TerminalNode Attack() { return getToken(CommandParser.Attack, 0); }
		public LongNameContext longName(int i) {
			return getRuleContext(LongNameContext.class,i);
		}
		public List<LongNameContext> longName() {
			return getRuleContexts(LongNameContext.class);
		}
		public TerminalNode With() { return getToken(CommandParser.With, 0); }
		public AttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterAttack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitAttack(this);
		}
	}

	public final AttackContext attack() throws RecognitionException {
		AttackContext _localctx = new AttackContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(Attack);
			setState(84); longName();
			setState(87);
			_la = _input.LA(1);
			if (_la==With) {
				{
				setState(85); match(With);
				setState(86); longName();
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

	public static class GiftContext extends ParserRuleContext {
		public LongNameContext longName(int i) {
			return getRuleContext(LongNameContext.class,i);
		}
		public TerminalNode Give() { return getToken(CommandParser.Give, 0); }
		public List<LongNameContext> longName() {
			return getRuleContexts(LongNameContext.class);
		}
		public TerminalNode Number() { return getToken(CommandParser.Number, 0); }
		public GiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterGift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitGift(this);
		}
	}

	public final GiftContext gift() throws RecognitionException {
		GiftContext _localctx = new GiftContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_gift);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(Give);
			setState(90); longName();
			setState(92);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__1) | (1L << T__0))) != 0)) {
				{
				setState(91);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__1) | (1L << T__0))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(94); longName();
			setState(96);
			_la = _input.LA(1);
			if (_la==Number) {
				{
				setState(95); match(Number);
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

	public static class InventoryContext extends ParserRuleContext {
		public TerminalNode Open() { return getToken(CommandParser.Open, 0); }
		public TerminalNode Inventory() { return getToken(CommandParser.Inventory, 0); }
		public InventoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inventory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterInventory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitInventory(this);
		}
	}

	public final InventoryContext inventory() throws RecognitionException {
		InventoryContext _localctx = new InventoryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inventory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if (_la==Open) {
				{
				setState(98); match(Open);
				}
			}

			setState(101); match(Inventory);
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

	public static class CheckContext extends ParserRuleContext {
		public CheckHealthContext checkHealth() {
			return getRuleContext(CheckHealthContext.class,0);
		}
		public CheckStatusContext checkStatus() {
			return getRuleContext(CheckStatusContext.class,0);
		}
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitCheck(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_check);
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); checkHealth();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); checkStatus();
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

	public static class CheckHealthContext extends ParserRuleContext {
		public TerminalNode Health() { return getToken(CommandParser.Health, 0); }
		public TerminalNode Check() { return getToken(CommandParser.Check, 0); }
		public CheckHealthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkHealth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterCheckHealth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitCheckHealth(this);
		}
	}

	public final CheckHealthContext checkHealth() throws RecognitionException {
		CheckHealthContext _localctx = new CheckHealthContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_checkHealth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if (_la==Check) {
				{
				setState(107); match(Check);
				}
			}

			setState(110); match(Health);
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

	public static class CheckStatusContext extends ParserRuleContext {
		public TerminalNode Check() { return getToken(CommandParser.Check, 0); }
		public TerminalNode Status() { return getToken(CommandParser.Status, 0); }
		public CheckStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkStatus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterCheckStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitCheckStatus(this);
		}
	}

	public final CheckStatusContext checkStatus() throws RecognitionException {
		CheckStatusContext _localctx = new CheckStatusContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_checkStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if (_la==Check) {
				{
				setState(112); match(Check);
				}
			}

			setState(115); match(Status);
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

	public static class LongNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(CommandParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CommandParser.Identifier, i);
		}
		public LongNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterLongName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitLongName(this);
		}
	}

	public final LongNameContext longName() throws RecognitionException {
		LongNameContext _localctx = new LongNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_longName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(117); match(Identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%}\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\5\4/\n\4\3\5\5\5\62\n\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b?\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tL\n\t\3\t\3\t\5\tP\n\t\3\t\3\t\5\tT\n\t\3\n\3\n\3\n\3"+
		"\n\5\nZ\n\n\3\13\3\13\3\13\5\13_\n\13\3\13\3\13\5\13c\n\13\3\f\5\ff\n"+
		"\f\3\f\3\f\3\r\3\r\5\rl\n\r\3\16\5\16o\n\16\3\16\3\16\3\17\5\17t\n\17"+
		"\3\17\3\17\3\20\6\20y\n\20\r\20\16\20z\3\20\2\2\21\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36\2\6\4\2\21\21  \4\2\r\r\17\17\t\2\t\t\13\13\25\25\27"+
		"\27\32\32\37\37\"\"\3\2\4\6\u0085\2 \3\2\2\2\4*\3\2\2\2\6.\3\2\2\2\b\61"+
		"\3\2\2\2\n\65\3\2\2\2\f8\3\2\2\2\16>\3\2\2\2\20S\3\2\2\2\22U\3\2\2\2\24"+
		"[\3\2\2\2\26e\3\2\2\2\30k\3\2\2\2\32n\3\2\2\2\34s\3\2\2\2\36x\3\2\2\2"+
		" !\5\4\3\2!\"\7\2\2\3\"\3\3\2\2\2#+\5\6\4\2$+\5\16\b\2%+\5\20\t\2&+\5"+
		"\22\n\2\'+\5\24\13\2(+\5\26\f\2)+\5\30\r\2*#\3\2\2\2*$\3\2\2\2*%\3\2\2"+
		"\2*&\3\2\2\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,/\5\b\5\2-/\5\n"+
		"\6\2.,\3\2\2\2.-\3\2\2\2/\7\3\2\2\2\60\62\t\2\2\2\61\60\3\2\2\2\61\62"+
		"\3\2\2\2\62\63\3\2\2\2\63\64\5\f\7\2\64\t\3\2\2\2\65\66\t\3\2\2\66\67"+
		"\7$\2\2\67\13\3\2\2\289\t\4\2\29\r\3\2\2\2:;\7\26\2\2;?\7\3\2\2<?\7\23"+
		"\2\2=?\7\16\2\2>:\3\2\2\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@A\5\36\20\2A\17"+
		"\3\2\2\2BC\7\35\2\2CT\5\36\20\2DE\7\31\2\2EF\7\37\2\2FT\5\36\20\2GH\7"+
		"\34\2\2HT\5\36\20\2IK\7\n\2\2JL\t\5\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2"+
		"MO\5\36\20\2NP\7#\2\2ON\3\2\2\2OP\3\2\2\2PT\3\2\2\2QR\7\f\2\2RT\5\36\20"+
		"\2SB\3\2\2\2SD\3\2\2\2SG\3\2\2\2SI\3\2\2\2SQ\3\2\2\2T\21\3\2\2\2UV\7\7"+
		"\2\2VY\5\36\20\2WX\7!\2\2XZ\5\36\20\2YW\3\2\2\2YZ\3\2\2\2Z\23\3\2\2\2"+
		"[\\\7\20\2\2\\^\5\36\20\2]_\t\5\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`b\5"+
		"\36\20\2ac\7#\2\2ba\3\2\2\2bc\3\2\2\2c\25\3\2\2\2df\7\30\2\2ed\3\2\2\2"+
		"ef\3\2\2\2fg\3\2\2\2gh\7\24\2\2h\27\3\2\2\2il\5\32\16\2jl\5\34\17\2ki"+
		"\3\2\2\2kj\3\2\2\2l\31\3\2\2\2mo\7\b\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2"+
		"pq\7\22\2\2q\33\3\2\2\2rt\7\b\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\33"+
		"\2\2v\35\3\2\2\2wy\7$\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\37"+
		"\3\2\2\2\21*.\61>KOSY^beknsz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}