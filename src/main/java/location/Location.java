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

    public boolean canGoTo(String direction) {
        return goTo(direction) != null;
    }

    public Location goTo(String direction){
        if (direction.toLowerCase().contains("north")) {
            return neighbors.get("north");
        } else if (direction.toLowerCase().contains("south")){
            return neighbors.get("south");
        } else if (direction.toLowerCase().contains("east")) {
            return neighbors.get("east");
        } else if (direction.toLowerCase().contains("west")) {
            return neighbors.get("west");
        } else {
            return neighbors.get(direction.toLowerCase());
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
