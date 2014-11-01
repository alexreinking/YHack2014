package location;

public class Terrain extends Location {
    private TerrainType type;

    public Terrain(TerrainType type) {
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
}
