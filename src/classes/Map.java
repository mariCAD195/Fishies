package classes;

import java.util.HashMap;

/**
 * game map aka the entire aquarium building
 */
public class Map {
    private HashMap<String, Location> locations;

    public Map() {
        locations = new HashMap<>();
    }

    public HashMap<String, Location> getLocations() {
        return locations;
    }

    @Override
    public String toString() {
        return "Map : " +
                "locations = " + locations + "\n";
    }

}
