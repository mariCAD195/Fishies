package classes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Location {
    String name;
    ArrayList<Integer> neighbours;
    ArrayList<NPC> NPCsPresent;
    ArrayList<InteractableObject> interactableObjects;
    boolean timePassable;

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

    @Override
    public String toString() {
        return "\nLocation : " +
                "\nname = '" + name + '\'' +
                "\nneighbours = " + neighbours +
                "\nNPCsPresent=" + NPCsPresent +
                "\ninteractableObjects=" + interactableObjects +
                "\ntimePassable=" + timePassable+"\n";
    }
}
