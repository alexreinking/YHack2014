package server.messages;

/**
 * Created by alexreinking on 11/1/14.
 */
public class ErrorMessage extends GameMessage {
    public ErrorMessage(String argument) {
        _argument = argument;
    }
}
