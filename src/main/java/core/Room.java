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
    private final int MAX_ITEMS = 10;


    public Room(String startType){
        this.type = startType;
        this.numrooms = 0;
    }

    private String getDescription() {
        return getTypeDescription(type) + "There are " + numrooms + "rooms to the "
                + neighbors.keySet().toString() + ". " + "What will you do?";
    }

    private int getNumRooms() {
        return numrooms;
    }

    private String getTypeDescription (String type) {
        switch (type){
            case "treasureroom":
                return "You have...";
            case "market":
                return "...";
            case "etc."


        }
    }

    private void addRoom (String direction, Room newroom) {
        switch (direction.toLowerCase()){
            case "north":
                neighbors.put("north", newroom);
                break;
            case "south":
                neighbors.put("south", newroom);
                break;
            case "east":
                neighbors.put("east", newroom);
                break;
            case "west":
                neighbors.put("west", newroom);
                break;

        }
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
