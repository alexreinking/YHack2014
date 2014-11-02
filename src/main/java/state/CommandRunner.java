package state;

import antlr.CommandBaseVisitor;
import antlr.CommandParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class CommandRunner extends CommandBaseVisitor<Void> {
    private final Game gameRoom;
    private final Player issuingPlayer;

    public CommandRunner(Game gameRoom, Player issuingPlayer) {
        this.gameRoom = gameRoom;
        this.issuingPlayer = issuingPlayer;
    }

    private String joinLongName(@NotNull CommandParser.LongNameContext ctx) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        ctx.Identifier().stream().forEach(i -> stringJoiner.add(i.getText()));
        return stringJoiner.toString();
    }

    @Override
    public Void visitRelativeMovement(@NotNull CommandParser.RelativeMovementContext ctx) {
        String direction = ctx.direction().getText();
        switch (direction) {
            case "n": direction = "north"; break;
            case "s": direction = "south"; break;
            case "e": direction = "east"; break;
            case "w": direction = "west"; break;
            default:
        }
        gameRoom.move(issuingPlayer, direction);
        System.out.println("going to the " + direction);
        return super.visitRelativeMovement(ctx);
    }

    public static void execute(Game gameRoom, Player issuingPlayer, ParseTree tree) {
        new CommandRunner(gameRoom, issuingPlayer).visit(tree);
    }
}
