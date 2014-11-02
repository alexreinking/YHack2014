package location;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class Location {
    protected Map <String, Location> neighbors;
    
    public Location() {
        this.neighbors = new HashMap<>();
    }

    public void addNeighbor(String direction, Location neighbor) {
        neighbors.put(direction.toLowerCase(), neighbor);
    }

    public Optional<Location> getNeighbor(String direction){
        String directionToCheck = null;
        if (direction.toLowerCase().contains("north")) {
            directionToCheck = "north";
        } else if (direction.toLowerCase().contains("south")){
            directionToCheck = "south";
        } else if (direction.toLowerCase().contains("east")) {
            directionToCheck = "east";
        } else if (direction.toLowerCase().contains("west")) {
            directionToCheck = "west";
        } else {
            directionToCheck = direction.toLowerCase();
        }
        return Optional.ofNullable(neighbors.get(directionToCheck));
    }

    public abstract String getDescription();

    public void setEast(Location neighbor) {
        addNeighbor("east", neighbor);
        neighbor.addNeighbor("west", this);
    }
    
    public void setWest(Location neighbor) {
        addNeighbor("west", neighbor);
        neighbor.addNeighbor("east", this);
    }
    
    public void setNorth(Location neighbor) {
        addNeighbor("north", neighbor);
        neighbor.addNeighbor("south", this);
    }

    public void setSouth(Location neighbor) {
        addNeighbor("south", neighbor);
        neighbor.addNeighbor("north", this);
    }
}
