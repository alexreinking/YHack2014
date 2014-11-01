package location;

/**
 * Created by NickHath on 10/31/14.
 */

public class Room extends Location {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
