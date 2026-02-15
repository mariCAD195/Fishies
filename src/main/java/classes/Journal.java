package classes;

import java.util.HashMap;

/**
 * stores your progress and fish
 * @author mari
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

    //region getters setters
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
    //endregion

    /**
     * prints all fish in color based on your progress
     * @return fish species name
     */
    public String fishJournal(Larry larry){
        int width = 50;
        int i = 0;
        System.out.println(Toolbox.coloredText("yellow","\ncamera film left: "+larry.getPhotosTaken()+"\n"));
        for (Fish fish : allFish.values()) {
            String spaced = String.format("%-" + width + "s", fish.getSpecies());
            if (fishLeft.containsKey(fish.getName().toLowerCase())) {
                System.out.print(Toolbox.coloredText("red", spaced));
                i++;
            }
            else if (fishDone.containsKey(fish.getName().toLowerCase())) {
                System.out.print(Toolbox.coloredText("green", spaced));
                i++;
            }
            if (i % 2 == 0) {
                System.out.println();
            }
        }
        return "";
    }

    public void takePhoto(String fish,Story story, Larry larry){
        if(larry.getPhotosTaken()<=8){
            System.out.println("\nsay cheese fishie!!!");
            Toolbox.enter();
            fishLeft.remove(fish);
            fishDone.put(fish, allFish.get(fish));
            larry.setPhotosTaken(larry.getPhotosTaken()+1);
            story.printPolaroid();
        }else{
            System.out.println("\nOH NO! You've run out of film, you can't take any more photos for today\ngo home, refill your stock and come back tomorrow");
        }
    }

    @Override
    public String toString() {
        return "classes.Journal{" +
                "fishDone=" + fishDone +
                ", fishLeft=" + fishLeft +
                '}';
    }
}