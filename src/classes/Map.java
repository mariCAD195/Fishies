package classes;

import java.util.HashMap;

/**
 * game map aka the entire aquarium building
 */
public class Map {
    private HashMap<String, Location> locations;
    private HashMap<String, NPC> npcs;

    public Map() {
        locations = new HashMap<>();
        npcs = new HashMap<>();
    }

    public HashMap<String, Location> getLocations() {
        return locations;
    }

    public HashMap<String, NPC> getNpcs() {
        return npcs;
    }

    @Override
    public String toString() {
        return "Map : " +
                "locations = " + locations + "\n";
    }

}
