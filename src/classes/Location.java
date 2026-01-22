package classes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Location {
    private String name;
    private ArrayList<String> neighbours;
    private ArrayList<NPC> NPCsPresent;
    private ArrayList<InteractableObject> interactableObjects;
    private boolean timePassable;
    private String id;
    private String description;


    public Location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(ArrayList<String> neighbours) {
        this.neighbours = neighbours;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String neighboursMenu(Map map) {
        for (int i = 0; i < neighbours.size(); i++) {
            System.out.println(""+(i+1) +") " + map.getLocations().get(neighbours.get(i)).name);
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
