package classes;

import java.util.ArrayList;

/**
 * individual fish tanks which house local fish
 * @author mari
 */
public class Aquarium {
    private String name;
    private String description;
    private ArrayList<Fish> everyFish;
    private ArrayList<Fish> activeFish;

    public Aquarium() {
    }

    public void addFish(Fish fish) {
        everyFish.add(fish);
    }

    public String activeFishMenu(){
        for (int i = 0; i < activeFish.size(); i++) {
            System.out.println(Toolbox.coloredText("blue",activeFish.get(i).getSpecies()));
        }
        return "";
    }

    public String everyFishSign(){
        System.out.println("\nhere is every fish in this fish tank\n");
        for (int i = 0; i < everyFish.size(); i++) {
            System.out.println(Toolbox.coloredText("blue",everyFish.get(i).getSpecies()));
        }
        return "";
    }

    public String getName() {
        return name;
    }

    public void activateFish(Larry larry) {
        for (int i = 0; i < everyFish.size(); i++) {
            if(everyFish.get(i).getPreferredTime()==0){
                activeFish.add(everyFish.get(i));
            }
            if(everyFish.get(i).getPreferredTime()==larry.getCurrentTime()){
                activeFish.add(everyFish.get(i));
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Fish> getEveryFish() {
        return everyFish;
    }

    public void setEveryFish(ArrayList<Fish> everyFish) {
        this.everyFish = everyFish;
    }

    public ArrayList<Fish> getActiveFish() {
        return activeFish;
    }

    public void setActiveFish(ArrayList<Fish> activeFish) {
        this.activeFish = activeFish;
    }

}
