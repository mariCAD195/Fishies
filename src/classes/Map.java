package classes;

import java.util.HashMap;

public class Map {
    private HashMap<Integer,Location> locations;

    public Map() {
        locations = new HashMap<>();
    }

    public HashMap<Integer, Location> getLocations() {
        return locations;
    }

    public void setLocations(HashMap<Integer, Location> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map : " +
                "locations = " + locations +"\n";
    }

}
