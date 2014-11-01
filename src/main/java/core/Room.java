package core;

/**
 * Created by NickHath on 10/31/14.
 */
import java.util.HashMap;
import java.util.Map;


public class Room {


    private String type;
    private int numrooms;
    private Map <String, Room> neighbors = new HashMap<>();


    public Room(String startType){
        this.type = startType;
        this.numrooms = 0;
    }

    private String getDescription() {
        return getTypeDescription(type) + "There are " + numrooms + "rooms to the "
                + neighbors.keySet().toString() + ". " + "What will you do?";
                     // fix commas and spacing in keySet()
    }

    private int getNumRooms() {
        return numrooms;
    }

    private String getTypeDescription (String type) {
        switch (type) {
            case "treasureroom":
                return "You have...";
                break;
            case "market":
                return "mistyroom";
                break;
            case "etc."
                return "...";
                break;
        }
    }

    private void addRoom (String direction, Room newroom) {
        neighbors.put(direction.toLowerCase(), newroom);
        numrooms++;
    }

    private Room goTo(String instruction){
        if (instruction.toLowerCase().contains("north")) {
            return neighbors.get("north");
        }
        else if (instruction.toLowerCase().contains("south")){
            return neighbors.get("south");
        }
        else if (instruction.toLowerCase().contains("east")) {
            return neighbors.get("east");
        }
        else if (instruction.toLowerCase().contains("west")) {
            return neighbors.get("west");
        }

    }



}
