package server.messages;

/**
 * Created by alexreinking on 11/1/14.
 */
public class CommandMessage extends GameMessage {
    public CommandMessage(String argument) {
        _argument = argument;
    }
}
