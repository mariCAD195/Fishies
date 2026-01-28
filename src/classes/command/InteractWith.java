package classes.command;

import classes.GameData;
import classes.Larry;
import classes.Map;

import java.util.Scanner;

public class InteractWith extends Command {

    private Map map;
    private Larry larry;
    Scanner scanner = new Scanner(System.in);

    public InteractWith(Map map, Larry larry) {
        this.map = map;
        this.larry = larry;
    }

    @Override
    public String execute() {
        System.out.println("\n...");
        larry.getCurrentLocation().interactWithMenu();
        System.out.println("\n(type object name)");
        String input = scanner.nextLine();
        if(map.getLocations().get(larry.getCurrentLocation().getName().toLowerCase()).getInteractableObjects().contains(input)) {
            return map.getInteractableObjects().get(input).getDescription();
        }
        if(map.getLocations().get(larry.getCurrentLocation().getName().toLowerCase()).getItems().contains(input)){
            return map.getItems().get(input).getDescription();
        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
