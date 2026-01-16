package classes;

import java.util.ArrayList;

public class Location {
    String name;
    ArrayList<Location> neighbours;
    ArrayList<NPC> NPCsPresent;
    ArrayList<InteractableObject> interactableObjects;
    boolean isTimePassable;
}
