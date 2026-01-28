package classes;

import java.util.HashMap;

/**
 * the player
 */
public class Larry {
    private Location currentLocation;
    private HashMap<String, Integer> time;
    private int currentTime;
    private int date;
    private Item[] inventory;

    public Larry(Location currentLocation, int currentTime, int date) {
        this.currentLocation = currentLocation;
        this.time = new HashMap<>();
        this.currentTime = currentTime;
        this.date = date;
        this.inventory = new Item[5];
    }

    /**
     * adds different time periods which serve as in-game time
     */
    public void createTime() {
        time.put("all", 0);
        time.put("morning", 1);
        time.put("noon", 2);
        time.put("afternoon", 3);
        time.put("evening", 4);
    }

    public String newDayScreen(){
        Toolbox.clearConsole();
        System.out.println(Toolbox.coloredText("yellow", "\n\n\n -- day " + date+" -- \n\n\n"));
        Toolbox.enter();
        return Toolbox.clearConsole();
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

    public int getCurrentTime() {
        return currentTime;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
}
