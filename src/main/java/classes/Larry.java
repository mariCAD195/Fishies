package classes;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * the player
 * @author mari
 */
public class Larry {
    private Location currentLocation;
    private HashMap<Integer, String> time;
    private int currentTime;
    private int date;
    private boolean hasBorrowedCard;
    private boolean hasCardPermanently;
    private ArrayList<Item> inventory;

    public Larry(Location currentLocation, int currentTime, int date) {
        this.currentLocation = currentLocation;
        this.time = new HashMap<>();
        this.currentTime = currentTime;
        this.date = date;
        this.inventory = new ArrayList<>();
    }

    public Larry() {
    }

    /**
     * adds different time periods which serve as in-game time
     */
    public void createTime() {
        time.put(0, "all");
        time.put(1,"morning");
        time.put(2, "noon");
        time.put(3, "afternoon");
        time.put(4, "evening");
    }

    public String newDayScreen(){
        Toolbox.clearConsole();
        System.out.println(Toolbox.coloredText("yellow", "\n\n\n -- day " + date+" -- \n\n\n"));
        Toolbox.enter();
        return Toolbox.clearConsole();
    }

    public String inventoryMenu(){
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(Toolbox.coloredText("blue", inventory.get(i).getName()));
        }
        return "";
    }

    public String whatsInMyBackpack(){
        if(inventory.size()==0){
            return "\nyou backpack seems quite empty :(\n";
        }else{
            System.out.println("here's everything you are currently carrying: \n");
            return inventoryMenu();
        }
    }

    //region getters setters
    public int getDate() {
        return date;
    }

    public boolean isHasBorrowedCard() {
        return hasBorrowedCard;
    }

    public void setHasBorrowedCard(boolean hasBorrowedCard) {
        this.hasBorrowedCard = hasBorrowedCard;
    }

    public boolean isHasCardPermanently() {
        return hasCardPermanently;
    }

    public void setHasCardPermanently(boolean hasCardPermanently) {
        this.hasCardPermanently = hasCardPermanently;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public HashMap<Integer, String> getTime() {
        return time;
    }

    public void setTime(HashMap<Integer, String> time) {
        this.time = time;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
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
    //endregion
}
