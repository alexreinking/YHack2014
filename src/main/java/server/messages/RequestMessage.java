package server.messages;

import java.util.List;

public class RequestMessage extends GameMessage {
    private List<String> options;
    private int selection;

    public RequestMessage(String argument, List<String> options, int selection) {
        this.options = options;
        this.selection = selection;
        _argument = argument;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }
}
