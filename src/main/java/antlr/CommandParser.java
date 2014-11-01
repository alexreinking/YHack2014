// Generated from /Users/dani/Documents/yale/yhack/YHack2014/src/main/java/Command.g4 by ANTLR 4.4.1-dev
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
		Identifier=33, WS=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'a'", "'at'", "'the'", "'my'", "'attack'", "'check'", "'down'", 
		"'drop'", "East", "'eat'", "'enter'", "'examine'", "'exit'", "'give'", 
		"'go'", "'health'", "'inspect'", "Inventory", "'leave'", "'look'", "North", 
		"'open'", "'pick'", "South", "'status'", "'take'", "'touch'", "'trade'", 
		"'up'", "'walk'", "'with'", "West", "Identifier", "WS"
	};
	public static final int
		RULE_command = 0, RULE_movement = 1, RULE_relativeMovement = 2, RULE_specificMovement = 3, 
		RULE_direction = 4, RULE_inspection = 5, RULE_interaction = 6, RULE_attack = 7, 
		RULE_gift = 8, RULE_inventory = 9, RULE_check = 10, RULE_checkHealth = 11, 
		RULE_checkStatus = 12;
	public static final String[] ruleNames = {
		"command", "movement", "relativeMovement", "specificMovement", "direction", 
		"inspection", "interaction", "attack", "gift", "inventory", "check", "checkHealth", 
		"checkStatus"
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
		public InteractionContext interaction() {
			return getRuleContext(InteractionContext.class,0);
		}
		public InventoryContext inventory() {
			return getRuleContext(InventoryContext.class,0);
		}
		public MovementContext movement() {
			return getRuleContext(MovementContext.class,0);
		}
		public GiftContext gift() {
			return getRuleContext(GiftContext.class,0);
		}
		public InspectionContext inspection() {
			return getRuleContext(InspectionContext.class,0);
		}
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public AttackContext attack() {
			return getRuleContext(AttackContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(33);
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
				setState(26); movement();
				}
				break;
			case Examine:
			case Inspect:
			case Look:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); inspection();
				}
				break;
			case Drop:
			case Eat:
			case Pick:
			case Take:
			case Touch:
				enterOuterAlt(_localctx, 3);
				{
				setState(28); interaction();
				}
				break;
			case Attack:
				enterOuterAlt(_localctx, 4);
				{
				setState(29); attack();
				}
				break;
			case Give:
				enterOuterAlt(_localctx, 5);
				{
				setState(30); gift();
				}
				break;
			case Inventory:
			case Open:
				enterOuterAlt(_localctx, 6);
				{
				setState(31); inventory();
				}
				break;
			case Check:
			case Health:
			case Status:
				enterOuterAlt(_localctx, 7);
				{
				setState(32); check();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitMovement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovementContext movement() throws RecognitionException {
		MovementContext _localctx = new MovementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_movement);
		try {
			setState(37);
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
				setState(35); relativeMovement();
				}
				break;
			case Enter:
			case Exit:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); specificMovement();
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
		public TerminalNode Go() { return getToken(CommandParser.Go, 0); }
		public TerminalNode Walk() { return getToken(CommandParser.Walk, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitRelativeMovement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeMovementContext relativeMovement() throws RecognitionException {
		RelativeMovementContext _localctx = new RelativeMovementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_relativeMovement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if (_la==Go || _la==Walk) {
				{
				setState(39);
				_la = _input.LA(1);
				if ( !(_la==Go || _la==Walk) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(42); direction();
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
		public TerminalNode Enter() { return getToken(CommandParser.Enter, 0); }
		public TerminalNode Identifier() { return getToken(CommandParser.Identifier, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitSpecificMovement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificMovementContext specificMovement() throws RecognitionException {
		SpecificMovementContext _localctx = new SpecificMovementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_specificMovement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==Enter || _la==Exit) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(45); match(Identifier);
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
		public TerminalNode South() { return getToken(CommandParser.South, 0); }
		public TerminalNode Down() { return getToken(CommandParser.Down, 0); }
		public TerminalNode Leave() { return getToken(CommandParser.Leave, 0); }
		public TerminalNode West() { return getToken(CommandParser.West, 0); }
		public TerminalNode North() { return getToken(CommandParser.North, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
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
		public TerminalNode Examine() { return getToken(CommandParser.Examine, 0); }
		public TerminalNode Identifier() { return getToken(CommandParser.Identifier, 0); }
		public TerminalNode Inspect() { return getToken(CommandParser.Inspect, 0); }
		public TerminalNode Look() { return getToken(CommandParser.Look, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitInspection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InspectionContext inspection() throws RecognitionException {
		InspectionContext _localctx = new InspectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inspection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			switch (_input.LA(1)) {
			case Look:
				{
				setState(49); match(Look);
				setState(50); match(T__2);
				}
				break;
			case Inspect:
				{
				setState(51); match(Inspect);
				}
				break;
			case Examine:
				{
				setState(52); match(Examine);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(55); match(Identifier);
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
		public TerminalNode Identifier() { return getToken(CommandParser.Identifier, 0); }
		public TerminalNode Eat() { return getToken(CommandParser.Eat, 0); }
		public TerminalNode Drop() { return getToken(CommandParser.Drop, 0); }
		public TerminalNode Pick() { return getToken(CommandParser.Pick, 0); }
		public TerminalNode Take() { return getToken(CommandParser.Take, 0); }
		public TerminalNode Touch() { return getToken(CommandParser.Touch, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitInteraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteractionContext interaction() throws RecognitionException {
		InteractionContext _localctx = new InteractionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interaction);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case Touch:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); match(Touch);
				setState(58); match(Identifier);
				}
				break;
			case Pick:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); match(Pick);
				setState(60); match(Up);
				setState(61); match(Identifier);
				}
				break;
			case Take:
				enterOuterAlt(_localctx, 3);
				{
				setState(62); match(Take);
				setState(63); match(Identifier);
				}
				break;
			case Drop:
				enterOuterAlt(_localctx, 4);
				{
				setState(64); match(Drop);
				setState(65); match(Identifier);
				}
				break;
			case Eat:
				enterOuterAlt(_localctx, 5);
				{
				setState(66); match(Eat);
				setState(67); match(Identifier);
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
		public TerminalNode With() { return getToken(CommandParser.With, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(CommandParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CommandParser.Identifier); }
		public TerminalNode Attack() { return getToken(CommandParser.Attack, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitAttack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttackContext attack() throws RecognitionException {
		AttackContext _localctx = new AttackContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(Attack);
			setState(71); match(Identifier);
			setState(74);
			_la = _input.LA(1);
			if (_la==With) {
				{
				setState(72); match(With);
				setState(73); match(Identifier);
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
		public TerminalNode Identifier(int i) {
			return getToken(CommandParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CommandParser.Identifier); }
		public TerminalNode Give() { return getToken(CommandParser.Give, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitGift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GiftContext gift() throws RecognitionException {
		GiftContext _localctx = new GiftContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_gift);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(Give);
			setState(77); match(Identifier);
			setState(79);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__1) | (1L << T__0))) != 0)) {
				{
				setState(78);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__1) | (1L << T__0))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(81); match(Identifier);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitInventory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InventoryContext inventory() throws RecognitionException {
		InventoryContext _localctx = new InventoryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inventory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if (_la==Open) {
				{
				setState(83); match(Open);
				}
			}

			setState(86); match(Inventory);
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
		public CheckStatusContext checkStatus() {
			return getRuleContext(CheckStatusContext.class,0);
		}
		public CheckHealthContext checkHealth() {
			return getRuleContext(CheckHealthContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_check);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); checkHealth();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); checkStatus();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitCheckHealth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckHealthContext checkHealth() throws RecognitionException {
		CheckHealthContext _localctx = new CheckHealthContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_checkHealth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if (_la==Check) {
				{
				setState(92); match(Check);
				}
			}

			setState(95); match(Health);
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
		public TerminalNode Status() { return getToken(CommandParser.Status, 0); }
		public TerminalNode Check() { return getToken(CommandParser.Check, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitCheckStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckStatusContext checkStatus() throws RecognitionException {
		CheckStatusContext _localctx = new CheckStatusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_checkStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if (_la==Check) {
				{
				setState(97); match(Check);
				}
			}

			setState(100); match(Status);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$i\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2$\n\2\3\3\3\3\5"+
		"\3(\n\3\3\4\5\4+\n\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\5\78"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bG\n\b\3\t"+
		"\3\t\3\t\3\t\5\tM\n\t\3\n\3\n\3\n\5\nR\n\n\3\n\3\n\3\13\5\13W\n\13\3\13"+
		"\3\13\3\f\3\f\5\f]\n\f\3\r\5\r`\n\r\3\r\3\r\3\16\5\16e\n\16\3\16\3\16"+
		"\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\6\4\2\21\21  \4\2\r\r"+
		"\17\17\t\2\t\t\13\13\25\25\27\27\32\32\37\37\"\"\4\2\3\3\5\6o\2#\3\2\2"+
		"\2\4\'\3\2\2\2\6*\3\2\2\2\b.\3\2\2\2\n\61\3\2\2\2\f\67\3\2\2\2\16F\3\2"+
		"\2\2\20H\3\2\2\2\22N\3\2\2\2\24V\3\2\2\2\26\\\3\2\2\2\30_\3\2\2\2\32d"+
		"\3\2\2\2\34$\5\4\3\2\35$\5\f\7\2\36$\5\16\b\2\37$\5\20\t\2 $\5\22\n\2"+
		"!$\5\24\13\2\"$\5\26\f\2#\34\3\2\2\2#\35\3\2\2\2#\36\3\2\2\2#\37\3\2\2"+
		"\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\3\3\2\2\2%(\5\6\4\2&(\5\b\5\2\'%\3"+
		"\2\2\2\'&\3\2\2\2(\5\3\2\2\2)+\t\2\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,"+
		"-\5\n\6\2-\7\3\2\2\2./\t\3\2\2/\60\7#\2\2\60\t\3\2\2\2\61\62\t\4\2\2\62"+
		"\13\3\2\2\2\63\64\7\26\2\2\648\7\4\2\2\658\7\23\2\2\668\7\16\2\2\67\63"+
		"\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\289\3\2\2\29:\7#\2\2:\r\3\2\2\2;<\7"+
		"\35\2\2<G\7#\2\2=>\7\31\2\2>?\7\37\2\2?G\7#\2\2@A\7\34\2\2AG\7#\2\2BC"+
		"\7\n\2\2CG\7#\2\2DE\7\f\2\2EG\7#\2\2F;\3\2\2\2F=\3\2\2\2F@\3\2\2\2FB\3"+
		"\2\2\2FD\3\2\2\2G\17\3\2\2\2HI\7\7\2\2IL\7#\2\2JK\7!\2\2KM\7#\2\2LJ\3"+
		"\2\2\2LM\3\2\2\2M\21\3\2\2\2NO\7\20\2\2OQ\7#\2\2PR\t\5\2\2QP\3\2\2\2Q"+
		"R\3\2\2\2RS\3\2\2\2ST\7#\2\2T\23\3\2\2\2UW\7\30\2\2VU\3\2\2\2VW\3\2\2"+
		"\2WX\3\2\2\2XY\7\24\2\2Y\25\3\2\2\2Z]\5\30\r\2[]\5\32\16\2\\Z\3\2\2\2"+
		"\\[\3\2\2\2]\27\3\2\2\2^`\7\b\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\22"+
		"\2\2b\31\3\2\2\2ce\7\b\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\33\2\2g\33"+
		"\3\2\2\2\r#\'*\67FLQV\\_d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}