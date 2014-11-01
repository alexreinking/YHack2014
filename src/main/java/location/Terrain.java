package location;

public class Terrain extends Location {
    private TerrainType type;
    private boolean containsDungeonEntrance;

    public Terrain(TerrainType type) {
        containsDungeonEntrance = false;
        this.type = type;
    }

    @Override
    public String getDescription() {
        switch (type) {
            case Forest: return "You have found yourself in a forest";
            case Desert: return "You have found yourself in a desert";
            case Highlands: return "You have found yourself in the highlands";
            case Swamp: return "You have found yourself in a swamp";
            default: return "I have misplaced you.";
        }
    }

    public void placeDungeonEntrance() {
        containsDungeonEntrance = true;
    }

    public boolean containsDungeon() {
        return containsDungeonEntrance;
    }

}
