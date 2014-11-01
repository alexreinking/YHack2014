package server.messages;

/**
 * Created by alexreinking on 11/1/14.
 */
public class UpdateMessage extends GameMessage {
    public UpdateMessage(String argument) {
        _argument = argument;
    }
}
