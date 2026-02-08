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
    private ArrayList<String> interactableObjects;
    private ArrayList<String> aquariums;
    private ArrayList<String> items;
    private boolean timePassable;
    private String description;


    public Location() {
    }

    //region gettersSetters
    public String getName() {
        return name;
    }

    public ArrayList<String> getNeighbours() {
        return neighbours;
    }

    public ArrayList<String> getAquariums() {
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

    public void setInteractableObjects(ArrayList<String> interactableObjects) {
        this.interactableObjects = interactableObjects;
    }

    public void setAquariums(ArrayList<String> aquariums) {
        this.aquariums = aquariums;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("NPCsPresent")
    public ArrayList<String> getNPCsPresent() {
        return NPCsPresent;
    }

    public ArrayList<String> getInteractableObjects() {
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

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
    //endregion

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
     * prints all thing the player is able to interact with
     * @return list of available objects and items
     */
    public String interactWithMenu() {
        int count = 0;
        for (int i = 0; i < interactableObjects.size(); i++) {
            System.out.println(Toolbox.coloredText("blue",(i+1) +") " + interactableObjects.get(i)));
            count++;
        }
        if(items.size()>0){
            for (int i = 0; i < items.size(); i++) {
                System.out.println(Toolbox.coloredText("blue",(count+1) +") " + items.get(i)));
            }
        }
        return "";
    }

    /**
     * prints list of all available NPCs in location
     */
    public String talkToMenu(){
        for (int i = 0; i < NPCsPresent.size(); i++) {
            System.out.println(Toolbox.coloredText("blue",(i+1) +") " + NPCsPresent.get(i)));
        }
        return "";
    }

    public String searchMenu(){
        for (int i = 0; i < aquariums.size(); i++) {
            System.out.println(Toolbox.coloredText("blue",(i+1) +") " + aquariums.get(i)));
        }
        return "";
    }

    /**
     * prints list of all thing available for the player to explore
     */
    public String lookAroundLocationMenu(){

        if(NPCsPresent.size() == 0){
            System.out.println("\nnobody...nobody seems to have the time for you at least\n");
        }else{
            System.out.println("\nPeople you can try talking to : ");
            for (int i = 0; i < NPCsPresent.size(); i++) {
                System.out.println(Toolbox.coloredText("blue", NPCsPresent.get(i)));
            }
        }

        if(interactableObjects.size() == 0){
            System.out.println("nothing...nothing in this room worth looking at\n");
        }else{
            System.out.println("\nthings maybe worth exploring closer : ");
            for (int i = 0; i < interactableObjects.size(); i++) {
                System.out.println(Toolbox.coloredText("blue",interactableObjects.get(i)));
            }
        }

        if(aquariums.size() == 0){
            System.out.println("no fishies in this room :(\n");
        }else{
            System.out.println("\naquariums you should check out : ");
            for (int i = 0; i < aquariums.size(); i++) {
                System.out.println(Toolbox.coloredText("blue",aquariums.get(i)));
            }
        }
        if(items.size() > 0){
            System.out.println("\nitems you can get : ");
            for (int i = 0; i < items.size(); i++) {
                System.out.println(Toolbox.coloredText("blue",items.get(i)));
            }
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
