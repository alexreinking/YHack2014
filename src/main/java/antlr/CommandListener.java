// Generated from /Users/alexreinking/YHack2014/src/main/java/Command.g4 by ANTLR 4.4.1-dev
package antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandParser}.
 */
public interface CommandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommandParser#gift}.
	 * @param ctx the parse tree
	 */
	void enterGift(@NotNull CommandParser.GiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#gift}.
	 * @param ctx the parse tree
	 */
	void exitGift(@NotNull CommandParser.GiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#specificCommand}.
	 * @param ctx the parse tree
	 */
	void enterSpecificCommand(@NotNull CommandParser.SpecificCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#specificCommand}.
	 * @param ctx the parse tree
	 */
	void exitSpecificCommand(@NotNull CommandParser.SpecificCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(@NotNull CommandParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(@NotNull CommandParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#checkHealth}.
	 * @param ctx the parse tree
	 */
	void enterCheckHealth(@NotNull CommandParser.CheckHealthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#checkHealth}.
	 * @param ctx the parse tree
	 */
	void exitCheckHealth(@NotNull CommandParser.CheckHealthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#inventory}.
	 * @param ctx the parse tree
	 */
	void enterInventory(@NotNull CommandParser.InventoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#inventory}.
	 * @param ctx the parse tree
	 */
	void exitInventory(@NotNull CommandParser.InventoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull CommandParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull CommandParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#specificMovement}.
	 * @param ctx the parse tree
	 */
	void enterSpecificMovement(@NotNull CommandParser.SpecificMovementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#specificMovement}.
	 * @param ctx the parse tree
	 */
	void exitSpecificMovement(@NotNull CommandParser.SpecificMovementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#checkStatus}.
	 * @param ctx the parse tree
	 */
	void enterCheckStatus(@NotNull CommandParser.CheckStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#checkStatus}.
	 * @param ctx the parse tree
	 */
	void exitCheckStatus(@NotNull CommandParser.CheckStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#relativeMovement}.
	 * @param ctx the parse tree
	 */
	void enterRelativeMovement(@NotNull CommandParser.RelativeMovementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#relativeMovement}.
	 * @param ctx the parse tree
	 */
	void exitRelativeMovement(@NotNull CommandParser.RelativeMovementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#attack}.
	 * @param ctx the parse tree
	 */
	void enterAttack(@NotNull CommandParser.AttackContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#attack}.
	 * @param ctx the parse tree
	 */
	void exitAttack(@NotNull CommandParser.AttackContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#interaction}.
	 * @param ctx the parse tree
	 */
	void enterInteraction(@NotNull CommandParser.InteractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#interaction}.
	 * @param ctx the parse tree
	 */
	void exitInteraction(@NotNull CommandParser.InteractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#movement}.
	 * @param ctx the parse tree
	 */
	void enterMovement(@NotNull CommandParser.MovementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#movement}.
	 * @param ctx the parse tree
	 */
	void exitMovement(@NotNull CommandParser.MovementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(@NotNull CommandParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(@NotNull CommandParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#inspection}.
	 * @param ctx the parse tree
	 */
	void enterInspection(@NotNull CommandParser.InspectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#inspection}.
	 * @param ctx the parse tree
	 */
	void exitInspection(@NotNull CommandParser.InspectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandParser#longName}.
	 * @param ctx the parse tree
	 */
	void enterLongName(@NotNull CommandParser.LongNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandParser#longName}.
	 * @param ctx the parse tree
	 */
	void exitLongName(@NotNull CommandParser.LongNameContext ctx);
}