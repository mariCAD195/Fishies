package classes;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * stores your progress and fish
 */
public class Journal {
    private HashMap<String, Fish> fishDone;
    private HashMap<String, Fish> fishLeft;
    private HashMap<String, Fish> allFish;

    public Journal() {
        fishDone = new HashMap<>();
        fishLeft = new HashMap<>();
        allFish = new HashMap<>();
    }

    public HashMap<String, Fish> getFishDone() {
        return fishDone;
    }

    public void setFishDone(HashMap<String, Fish> fishDone) {
        this.fishDone = fishDone;
    }

    public HashMap<String, Fish> getFishLeft() {
        return fishLeft;
    }

    public void setFishLeft(HashMap<String, Fish> fishLeft) {
        this.fishLeft = fishLeft;
    }

    public HashMap<String, Fish> getAllFish() {
        return allFish;
    }

    public void setAllFish(HashMap<String, Fish> allFish) {
        this.allFish = allFish;
    }

    /**
     * prints all fish in color based on your progress
     * @return fish species name
     */
    public String fishJournal(){
        for (Fish fish : allFish.values()) {
            if(fishLeft.containsKey(fish.getName().toLowerCase())){
                System.out.println(Toolbox.coloredText("red", fish.getSpecies()));
            }
            if(fishDone.containsKey(fish.getName().toLowerCase())){
                System.out.println(Toolbox.coloredText("green",fish.getSpecies()));
            }
        }
        return "";
    }

    public void takephoto(String fish){
        System.out.println("say cheese fishie!!!");
        Toolbox.enter();
        fishLeft.remove(fish);
        fishDone.put(fish, allFish.get(fish));
    }

    @Override
    public String toString() {
        return "Journal{" +
                "fishDone=" + fishDone +
                ", fishLeft=" + fishLeft +
                '}';
    }
}
