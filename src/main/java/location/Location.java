package location;

import java.util.HashMap;
import java.util.Map;

public abstract class Location {
    protected Map <String, Location> neighbors;
    
    public Location() {
        this.neighbors = new HashMap<>();
    }

    public void addNeighbor(String direction, Location neighbor) {
        neighbors.put(direction.toLowerCase(), neighbor);
    }

    public Location goTo(String locationName){
        if (locationName.toLowerCase().contains("north")) {
            return neighbors.get("north");
        }
        else if (locationName.toLowerCase().contains("south")){
            return neighbors.get("south");
        }
        else if (locationName.toLowerCase().contains("east")) {
            return neighbors.get("east");
        }
        else if (locationName.toLowerCase().contains("west")) {
            return neighbors.get("west");
        }
        else {
            return this;
        }
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
