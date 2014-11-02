package state;

import antlr.CommandBaseVisitor;
import antlr.CommandParser;
import core.MessageType;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.StringJoiner;

public class CommandRunner extends CommandBaseVisitor<Void> {
    private final Game gameRoom;
    private final Player issuingPlayer;

    public CommandRunner(Game gameRoom, Player issuingPlayer) {
        this.gameRoom = gameRoom;
        this.issuingPlayer = issuingPlayer;
    }

    public static void execute(Game gameRoom, Player issuingPlayer, ParseTree tree) {
        new CommandRunner(gameRoom, issuingPlayer).visit(tree);
    }

    private String joinLongName(@NotNull CommandParser.LongNameContext ctx) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        ctx.Identifier().stream().forEach(i -> stringJoiner.add(i.getText()));
        return stringJoiner.toString();
    }

    @Override
    public Void visitInventory(@NotNull CommandParser.InventoryContext ctx) {
        return super.visitInventory(ctx);
    }

    @Override
    public Void visitRelativeMovement(@NotNull CommandParser.RelativeMovementContext ctx) {
        String direction = ctx.direction().getText();
        switch (direction) {
            case "n":
                direction = "north";
                break;
            case "s":
                direction = "south";
                break;
            case "e":
                direction = "east";
                break;
            case "w":
                direction = "west";
                break;
            default:
        }
        gameRoom.move(issuingPlayer, direction);
        return super.visitRelativeMovement(ctx);
    }

    @Override
    public Void visitCheckHealth(@NotNull CommandParser.CheckHealthContext ctx) {
        String message = String.format("You have %d hit points left.", issuingPlayer.health());
        issuingPlayer.notify(message, MessageType.Notification);
        return super.visitCheckHealth(ctx);
    }

    @Override
    public Void visitCheckStatus(@NotNull CommandParser.CheckStatusContext ctx) {
        String message = String.format("You have %d hit points left.", issuingPlayer.health());
        issuingPlayer.notify(message, MessageType.Notification);
        return super.visitCheckStatus(ctx);
    }

    @Override
    public Void visitSpecificMovement(@NotNull CommandParser.SpecificMovementContext ctx) {
        gameRoom.move(issuingPlayer, joinLongName(ctx.longName()));
        return super.visitSpecificMovement(ctx);
    }
}
