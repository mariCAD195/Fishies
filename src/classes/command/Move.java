package classes.command;

import classes.Larry;
import classes.Map;

import java.util.HashMap;
import java.util.Scanner;

public class Move extends Command {

    private Larry larry;
    private Map map;
    private Scanner scanner = new Scanner(System.in);

    public Move(Larry larry, Map map) {
        this.larry = larry;
        this.map = map;
    }

    @Override
    public String execute() {
        System.out.println("\nI should probably get a change of scenery, but...where should I go?\n");
        System.out.println(map.getLocations().get(larry.getCurrentLocation().getId()).neighboursMenu(map));
        String input = scanner.nextLine();
        larry.setCurrentLocation(map.getLocations().get(input));
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
