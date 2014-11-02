package server;

import core.MessageType;
import server.messages.*;

import javax.json.*;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GameDecoder implements Decoder.Text<GameMessage> {
    @Override
    public GameMessage decode(String s) throws DecodeException {
        JsonObject obj = Json.createReader(new StringReader(s)).readObject();
        for (String type : Arrays.asList("login", "update", "cmd", "error", "request")) {
            try {
                switch (type) {
                    case "login":
                        return new LoginMessage(obj.getString(type));
                    case "update":
                        return new UpdateMessage(obj.getString(type), decodeMessageType(obj.getString("type")));
                    case "cmd":
                        return new CommandMessage(obj.getString(type));
                    case "error":
                        return new ErrorMessage(obj.getString(type));
                    case "request":
                        JsonArray jsonOptions = obj.getJsonArray("options");
                        List<JsonString> optionValues = jsonOptions.getValuesAs(JsonString.class);
                        List<String> options = optionValues.stream().map(JsonString::getString).collect(Collectors.toList());
                        int selection = obj.getJsonNumber("selection").intValue();
                        return new RequestMessage(obj.getString(type), options, selection);
                }
            } catch (NullPointerException e) {
            }
        }
        throw new DecodeException(s, "JSON object was none of login, update, cmd, or error.");
    }

    private MessageType decodeMessageType(String type) throws DecodeException {
        switch (type) {
            case "Notification":
                return MessageType.Notification;
            case "Success":
                return MessageType.Success;
            case "Failure":
                return MessageType.Failure;
            case "Warning":
                return MessageType.Warning;
            case "Alert":
                return MessageType.Alert;
        }
        throw new DecodeException(type, "type not in ['Notification', 'Success', 'Failure', 'Warning', 'Alert']");
    }

    @Override
    public boolean willDecode(String s) {
        try {
            decode(s);
            return true;
        } catch (DecodeException e) {
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
