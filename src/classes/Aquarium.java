package classes;

import java.util.ArrayList;

/**
 * individual fish tanks which house local fish
 */
public class Aquarium {
    private String name;
    private String description;
    private ArrayList<Fish> EveryFIsh;
    private ArrayList<Fish> ActiveFish;

    public Aquarium() {
    }

    public String getName() {
        return name;
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

    public ArrayList<Fish> getEveryFIsh() {
        return EveryFIsh;
    }

    public void setEveryFIsh(ArrayList<Fish> everyFIsh) {
        EveryFIsh = everyFIsh;
    }

    public ArrayList<Fish> getActiveFish() {
        return ActiveFish;
    }

    public void setActiveFish(ArrayList<Fish> activeFish) {
        ActiveFish = activeFish;
    }
}
