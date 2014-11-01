package core;

/**
 * Created by NickHath on 11/1/14.
 */

public class Item {
    private String name;
    private String description;
    private int value;

    public Item(String name, String description, int value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
}
