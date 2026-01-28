package classes;

import java.util.HashMap;

/**
 * game map aka the entire aquarium building
 */
public class Map {
    private HashMap<String, Location> locations;
    private HashMap<String, NPC> npcs;
    private HashMap<String, InteractableObject> interactableObjects;
    private HashMap<String, Aquarium> aquariums;

    public Map() {
        locations = new HashMap<>();
        npcs = new HashMap<>();
        interactableObjects = new HashMap<>();
        aquariums = new HashMap<>();
    }

    public HashMap<String, Location> getLocations() {
        return locations;
    }

    public HashMap<String, NPC> getNpcs() {
        return npcs;
    }

    public HashMap<String, InteractableObject> getInteractableObjects() {
        return interactableObjects;
    }

    public HashMap<String, Aquarium> getAquariums() {
        return aquariums;
    }

    @Override
    public String toString() {
        return "Map : " +
                "locations = " + locations + "\n";
    }

}
