package server;

import server.messages.*;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import java.io.StringReader;
import java.util.Arrays;

public class GameDecoder implements Decoder.Text<GameMessage> {
    @Override
    public GameMessage decode(String s) throws DecodeException {
        JsonObject obj = Json.createReader(new StringReader(s)).readObject();
        for (String type : Arrays.asList("login", "update", "cmd", "error")) {
            try {
                switch (type) {
                    case "login":
                        return new LoginMessage(obj.getString(type));
                    case "update":
                        return new UpdateMessage(obj.getString(type));
                    case "cmd":
                        return new CommandMessage(obj.getString(type));
                    case "error":
                        return new ErrorMessage(obj.getString(type));
                }
            } catch (NullPointerException e) {
            }
        }
        return null;
    }

    @Override
    public boolean willDecode(String s) { // derp
        try {
            return decode(s) != null;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
