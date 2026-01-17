package classes;

import java.util.ArrayList;

public class Map {
    private ArrayList<Location> locations;

    public Map() {
        locations = new ArrayList<>();
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map : " +
                "locations = " + locations +"\n";
    }

}
