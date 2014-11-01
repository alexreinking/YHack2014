// Generated from /Users/dani/Documents/yale/yhack/YHack2014/src/main/java/Command.g4 by ANTLR 4.4.1-dev
package antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommandVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommandParser#gift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGift(@NotNull CommandParser.GiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck(@NotNull CommandParser.CheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(@NotNull CommandParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#checkHealth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckHealth(@NotNull CommandParser.CheckHealthContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#interaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteraction(@NotNull CommandParser.InteractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#inspection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspection(@NotNull CommandParser.InspectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#relativeMovement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeMovement(@NotNull CommandParser.RelativeMovementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#checkStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckStatus(@NotNull CommandParser.CheckStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#inventory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInventory(@NotNull CommandParser.InventoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#movement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovement(@NotNull CommandParser.MovementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(@NotNull CommandParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#specificMovement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificMovement(@NotNull CommandParser.SpecificMovementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandParser#attack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttack(@NotNull CommandParser.AttackContext ctx);
}