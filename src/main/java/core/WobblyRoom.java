package core;

/**
 * Created by NickHath on 11/1/14.
 */
public class WobblyRoom extends Room {

    public WobblyRoom (String startType){
        super(startType);
    }

    @Override
    private Room goTo(String instruction){
        if (instruction.toLowerCase().contains("north")) {
            return neighbors.get("south");
        }
        else if (instruction.toLowerCase().contains("south")){
            return neighbors.get("north");
        }
        else if (instruction.toLowerCase().contains("east")) {
            return neighbors.get("west");
        }
        else if (instruction.toLowerCase().contains("west")) {
            return neighbors.get("east");
        }

    }
}
