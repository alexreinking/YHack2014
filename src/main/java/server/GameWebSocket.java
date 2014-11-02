package server;

import antlr.CommandLexer;
import antlr.CommandParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import server.messages.CommandMessage;
import server.messages.ErrorMessage;
import server.messages.GameMessage;
import server.messages.LoginMessage;
import state.CommandRunner;
import state.Game;
import state.Player;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@ServerEndpoint(value = "/game/{lobby}", decoders = GameDecoder.class, encoders = GameEncoder.class)
public class GameWebSocket {
    private static final Set<Session> EMPTY_LOBBY = Collections.emptySet();
    private static final ConcurrentMap<String, Game> lobbies = new ConcurrentHashMap<>();

    @OnOpen
    public void onOpen(final Session player, @PathParam("lobby") final String lobby) {
        lobbies.computeIfAbsent(lobby, s -> new Game());
    }

    @OnMessage
    public void onMessage(GameMessage message, Session playerSession, @PathParam("lobby") String lobby) {
        try {
            Game currentGame = lobbies.get(lobby);

            if (message instanceof LoginMessage) {
                if (isLoggedIn(playerSession)) {
                    playerSession.getBasicRemote().sendObject(new ErrorMessage("already logged in"));
                    return;
                }

                String possibleName = message.argument();
                boolean success = currentGame.addPlayer(possibleName, playerSession);

                if (!success)
                    playerSession.getBasicRemote().sendObject(new ErrorMessage(possibleName + " is already taken."));
            } else if (isLoggedIn(playerSession) && message instanceof CommandMessage) {
                Player player = (Player) playerSession.getUserProperties().get("player");

                CommandLexer lexer = new CommandLexer(new ANTLRInputStream(message.argument()));
                CommandParser parser = new CommandParser(new BufferedTokenStream(lexer));
                CommandParser.CommandContext parsedCommand = parser.command();

                if (parser.getNumberOfSyntaxErrors() != 0) {
                    String error = String.format("Unknown command '%s'", message.argument());
                    playerSession.getBasicRemote().sendObject(new ErrorMessage(error));
                    return;
                }

                CommandRunner.execute(currentGame, player, parsedCommand);
            } else {
                playerSession.getBasicRemote().sendObject(new ErrorMessage("[FATAL] Invalid message sent to server"));
            }
        } catch (EncodeException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean isLoggedIn(Session player) {
        return player.getUserProperties().containsKey("player");
    }

    @OnClose
    public void onClose(Session player, @PathParam("lobby") String lobby) {
        if (isLoggedIn(player))
            lobbies.get(lobby).killPlayer((Player) player.getUserProperties().get("player"));
    }
}
