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
        for (int i = 0; i < allFish.size(); i++) {
            if(fishLeft.containsKey(allFish.get(i).getName())){
                System.out.println(Toolbox.coloredText("red", allFish.get(i).getSpecies()));
            }
            if(fishDone.containsKey(allFish.get(i).getName())){
                System.out.println(Toolbox.coloredText("green",allFish.get(i).getSpecies()));
            }
        }
        return "";
    }

    public void takephoto(String fish){
        System.out.println("chci hrat life is strange :(");
        //TODO take photo method
    }

    @Override
    public String toString() {
        return "Journal{" +
                "fishDone=" + fishDone +
                ", fishLeft=" + fishLeft +
                '}';
    }
}
