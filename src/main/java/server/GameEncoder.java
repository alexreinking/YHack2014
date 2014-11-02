package server;

import server.messages.*;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class GameEncoder implements Encoder.Text<GameMessage> {
    @Override
    public String encode(GameMessage gameMessage) throws EncodeException {
        String message = gameMessage.argument();
        if (gameMessage instanceof CommandMessage) {
            return Json.createObjectBuilder().add("cmd", message).build().toString();
        } else if (gameMessage instanceof LoginMessage) {
            return Json.createObjectBuilder().add("login", message).build().toString();
        } else if (gameMessage instanceof UpdateMessage) {
            return Json.createObjectBuilder()
                    .add("update", message)
                    .add("type", ((UpdateMessage) gameMessage)
                            .getMessageType().toString()).build().toString();
        } else if (gameMessage instanceof RequestMessage) {
            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            ((RequestMessage) gameMessage).getOptions().forEach(arrayBuilder::add);

            return Json.createObjectBuilder()
                    .add("request", message)
                    .add("selection", ((RequestMessage) gameMessage).getSelection())
                    .add("options", arrayBuilder.build())
                    .build().toString();
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
