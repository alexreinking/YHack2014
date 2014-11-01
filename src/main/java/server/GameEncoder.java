package server;

import server.messages.CommandMessage;
import server.messages.GameMessage;
import server.messages.LoginMessage;
import server.messages.UpdateMessage;

import javax.json.Json;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/**
 * Created by alexreinking on 11/1/14.
 */
public class GameEncoder implements Encoder.Text<GameMessage> {
    @Override
    public String encode(GameMessage gameMessage) throws EncodeException {
        String message = gameMessage.argument();
        if (gameMessage instanceof CommandMessage) {
            return Json.createObjectBuilder().add("cmd", message).build().toString();
        } else if (gameMessage instanceof LoginMessage) {
            return Json.createObjectBuilder().add("login", message).build().toString();
        } else if (gameMessage instanceof UpdateMessage) {
            return Json.createObjectBuilder().add("update", message).build().toString();
        } else {
            return Json.createObjectBuilder().add("error", message).build().toString();
        }
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
