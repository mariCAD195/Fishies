package classes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * game location aka one aquarium room
 */
public class Location {
    private String name;
    private ArrayList<String> neighbours;
    private ArrayList<String> NPCsPresent;
    private ArrayList<InteractableObject> interactableObjects;
    private ArrayList<Aquarium> aquariums;
    private boolean timePassable;
    private String description;


    public Location() {
    }

    /**
     * initializes all arrayLists
     */
    public void arrayListInit(){
        neighbours = new ArrayList<>();
        interactableObjects = new ArrayList<>();
        aquariums = new ArrayList<>();
        NPCsPresent = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getNeighbours() {
        return neighbours;
    }

    public ArrayList<Aquarium> getAquariums() {
        return aquariums;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNeighbours(ArrayList<String> neighbours) {
        this.neighbours = neighbours;
    }

    public void setNPCsPresent(ArrayList<String> NPCsPresent) {
        this.NPCsPresent = NPCsPresent;
    }

    public void setInteractableObjects(ArrayList<InteractableObject> interactableObjects) {
        this.interactableObjects = interactableObjects;
    }

    public void setAquariums(ArrayList<Aquarium> aquariums) {
        this.aquariums = aquariums;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("NPCsPresent")
    public ArrayList<String> getNPCsPresent() {
        return NPCsPresent;
    }

    public ArrayList<InteractableObject> getInteractableObjects() {
        return interactableObjects;
    }

    public boolean isTimePassable() {
        return timePassable;
    }

    public void setTimePassable(boolean timePassable) {
        this.timePassable = timePassable;
    }

    public String getDescription() {
        return description + "\n";
    }

    /**
     * prints location neighbours in a multiple-choice format
     * @return list of neighbours
     */
    public String neighboursMenu() {
        for (int i = 0; i < neighbours.size(); i++) {
            System.out.println(Toolbox.coloredText("blue",(i+1) +") " + neighbours.get(i)));
        }
        return "";
    }

    /**
     * prints list of all thing available for the player to explore
     */
    public String searchLocationMenu(){
        for (int i = 0; i < NPCsPresent.size(); i++) {
            System.out.println(NPCsPresent.get(i)+"\n");
        }
        for (int i = 0; i < interactableObjects.size(); i++) {
            System.out.println(interactableObjects.get(i)+"\n");
        }
        for (int i = 0; i < aquariums.size(); i++) {
            System.out.println(aquariums.get(i)+"\n");
        }
        return "";
    }

    @Override
    public String toString() {
        return "\nLocation : " +
                "\nname = '" + name + '\'' +
                "\nneighbours = " + neighbours +
                "\nNPCsPresent = " + NPCsPresent +
                "\ninteractableObjects = " + interactableObjects +
                "\ntimePassable = " + timePassable +
                "\ndescription = " + description + "\n\n";
    }
}
