package server.messages;

import core.MessageType;

/**
 * Created by alexreinking on 11/1/14.
 */
public class UpdateMessage extends GameMessage {
    private MessageType messageType;
    public UpdateMessage(String argument, MessageType messageType) {
        this.messageType = messageType;
        _argument = argument;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
