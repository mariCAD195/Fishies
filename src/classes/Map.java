package classes;

import java.util.HashMap;

public class Map {
    private HashMap<String,Location> locations;

    public Map() {
        locations = new HashMap<>();
    }

    public HashMap<String, Location> getLocations() {
        return locations;
    }

    public void setLocations(HashMap<String, Location> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map : " +
                "locations = " + locations +"\n";
    }

}
