package classes;

import java.util.ArrayList;

/**
 * stores your progress and fish
 */
public class Journal {
    private ArrayList<Fish> fishDone;
    private ArrayList<Fish> fishLeft;
    private ArrayList<Fish> allFish;

    public Journal() {
        fishDone = new ArrayList<>();
        fishLeft = new ArrayList<>();
        allFish = new ArrayList<>();
    }

    public ArrayList<Fish> getFishDone() {
        return fishDone;
    }

    public ArrayList<Fish> getFishLeft() {
        return fishLeft;
    }

    public ArrayList<Fish> getAllFish() {
        return allFish;
    }

    /**
     * prints all fish in color based on your progress
     * @return fish species name
     */
    public String fishJournal(){
        for (int i = 0; i < allFish.size(); i++) {
            if(fishLeft.contains(allFish.get(i))){
                System.out.println(Toolbox.coloredText("red", allFish.get(i).getSpecies()));
            }
            if(fishDone.contains(allFish.get(i))){
                System.out.println(Toolbox.coloredText("green",allFish.get(i).getSpecies()));
            }
        }
        return "";
    }

    @Override
    public String toString() {
        return "Journal{" +
                "fishDone=" + fishDone +
                ", fishLeft=" + fishLeft +
                '}';
    }
}
