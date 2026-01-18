package classes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Location {
    private String name;
    private ArrayList<Integer> neighbours;
    private ArrayList<NPC> NPCsPresent;
    private ArrayList<InteractableObject> interactableObjects;
    private boolean timePassable;
    private int key;
    private String description;


    public Location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(ArrayList<Integer> neighbours) {
        this.neighbours = neighbours;
    }

    @JsonProperty("NPCsPresent")
    public ArrayList<NPC> getNPCsPresent() {
        return NPCsPresent;
    }

    public void setNPCsPresent(ArrayList<NPC> NPCsPresent) {
        this.NPCsPresent = NPCsPresent;
    }

    public ArrayList<InteractableObject> getInteractableObjects() {
        return interactableObjects;
    }

    public void setInteractableObjects(ArrayList<InteractableObject> interactableObjects) {
        this.interactableObjects = interactableObjects;
    }

    public boolean isTimePassable() {
        return timePassable;
    }

    public void setTimePassable(boolean timePassable) {
        this.timePassable = timePassable;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nLocation : " +
                "\nname = '" + name + '\'' +
                "\nneighbours = " + neighbours +
                "\nNPCsPresent = " + NPCsPresent +
                "\ninteractableObjects = " + interactableObjects +
                "\ntimePassable = " + timePassable+
                "\ndescription = " + description+"\n\n";
    }
}
