package classes;

import java.util.HashMap;

public class Larry {
    private Location currentLocation;
    private HashMap<String, Integer> time;
    private int currentTime;
    private int date;

    public Larry(Location currentLocation, int currentTime, int date) {
        this.currentLocation = currentLocation;
        this.time = new HashMap<>();
        this.currentTime = currentTime;
        this.date = date;
    }

    public void createTime() {
        time.put("morning", 0);
        time.put("noon", 1);
        time.put("afternoon", 2);
        time.put("evening", 3);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public HashMap<String, Integer> getTime() {
        return time;
    }

    public void setTime(HashMap<String, Integer> time) {
        this.time = time;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
}
