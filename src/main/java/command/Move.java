package command;

import classes.Larry;
import classes.Map;
import classes.Toolbox;

import java.util.HashMap;
import java.util.Scanner;

/**
 * changes players current location
 */
public class Move extends Command{

    private Larry larry;
    private Map map;
    private Scanner scanner = new Scanner(System.in);

    public Move(Larry larry, Map map) {
        this.larry = larry;
        this.map = map;
    }

    /**
     * allows player to move around the map and change locations
     */
    @Override
    public String execute() {
        System.out.println("\nI should probably get a change of scenery, but . . . where should I go?\n");
        System.out.println(map.getLocations().get(larry.getCurrentLocation().getName().toLowerCase()).neighboursMenu());
        System.out.println("(type location name)");
        String input = scanner.nextLine();
        if (map.getLocations().containsKey(input)) {
            if(map.getLocations().get(larry.getCurrentLocation().getName().toLowerCase()).getNeighbours().contains(input)){
                if(input.equalsIgnoreCase("staff area")){
                    if(larry.getInventory().contains("key card")){
                        larry.setCurrentLocation(map.getLocations().get(input));
                        System.out.println( "\nyou excitedly pull out your key card and after a quiet beep open the door to the staff room");
                        Toolbox.enter();
                        System.out.println(Toolbox.clearConsole());
                        System.out.println(Toolbox.coloredText("yellow",larry.getCurrentLocation().getName().toUpperCase()));
                        return larry.getCurrentLocation().getDescription();
                    }else{
                        return "you sadly stare at the closed door and dream about all the cool fishies who are surely hidden behind them\nmaybe you could try talking about it with some staff members";
                    }
                }else{
                    larry.setCurrentLocation(map.getLocations().get(input));
                    System.out.println( "\ngreat choice! I'll be right there");
                    Toolbox.enter();
                    System.out.println(Toolbox.clearConsole());
                    System.out.println(Toolbox.coloredText("yellow",larry.getCurrentLocation().getName().toUpperCase()));
                    return larry.getCurrentLocation().getDescription();
                }
            }else{
                return "sure i would love to go there, but it's not possible from here";
            }
        }else{
            return "hmm . . . I don't think that's on the aquarium map";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
