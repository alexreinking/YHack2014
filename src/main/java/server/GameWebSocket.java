package server;

import antlr.CommandLexer;
import antlr.CommandParser;
import core.MessageType;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import server.messages.*;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint(value = "/game/{lobby}", decoders = GameDecoder.class, encoders = GameEncoder.class)
public class GameWebSocket {
    private static final Set<Session> EMPTY_LOBBY = Collections.emptySet();
    private static final ConcurrentMap<String, Set<Session>> lobbies = new ConcurrentHashMap<>();

    @OnOpen
    public void onOpen(final Session player, @PathParam("lobby") final String lobby) {
        lobbies.computeIfAbsent(lobby, s -> new CopyOnWriteArraySet<>()).add(player);
    }

    @OnMessage
    public void onMessage(GameMessage message, Session player, @PathParam("lobby") String lobby) {
        try {
            if (message instanceof LoginMessage) {
                if(isLoggedIn(player)) {
                    player.getBasicRemote().sendObject(new ErrorMessage("already logged in"));
                    return;
                }

                String possibleName = message.argument();
                for (Session peer : lobbies.getOrDefault(lobby, EMPTY_LOBBY))
                    if (possibleName.equals(peer.getUserProperties().getOrDefault("name", ""))) {
                        player.getBasicRemote().sendObject(new ErrorMessage(possibleName + " is already taken."));
                        return;
                    }

                player.getUserProperties().put("name", possibleName);
                player.getBasicRemote().sendObject(new UpdateMessage("You have logged in as " + possibleName + "!", MessageType.Notification));

                // Should add the player to the right game
                // and update him about his location
            } else if (isLoggedIn(player) && message instanceof CommandMessage) {
                CommandLexer lexer = new CommandLexer(new ANTLRInputStream(message.argument()));
                CommandParser parser = new CommandParser(new BufferedTokenStream(lexer));
                CommandParser.CommandContext parsedCommand = parser.command();

                if (parser.getNumberOfSyntaxErrors() != 0) {
                    player.getBasicRemote().sendObject(new ErrorMessage("Malformed command"));
                    return;
                }

                player.getBasicRemote().sendObject(new UpdateMessage("Parsed successfully!", MessageType.Notification));
            } else {
                player.getBasicRemote().sendObject(new ErrorMessage("Bad message"));
            }
        } catch (EncodeException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean isLoggedIn(Session player) {
        return player.getUserProperties().containsKey("name");
    }

    @OnClose
    public void onClose(Session player, @PathParam("lobby") String lobby) {
        lobbies.getOrDefault(lobby, EMPTY_LOBBY).remove(player);
    }
}
