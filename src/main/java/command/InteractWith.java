package command;

import classes.GameData;
import classes.Larry;
import classes.Map;

import java.util.Scanner;

/**
 * allows the player to interact with objects
 * @author mari
 */
public class InteractWith extends Command {

    private Map map;
    private Larry larry;
    Scanner scanner = new Scanner(System.in);

    public InteractWith(Map map, Larry larry) {
        this.map = map;
        this.larry = larry;
    }

    /**
     * allows object interaction and also buying items
     */
    @Override
    public String execute() {
        System.out.println("\n...");
        larry.getCurrentLocation().interactWithMenu(map);
        System.out.println("\n(type object name)");
        String input = scanner.nextLine();
        if(map.getLocations().get(larry.getCurrentLocation().getName().toLowerCase()).getInteractableObjects().contains(input)) {
            return map.getInteractableObjects().get(input).getDescription();
        }
        if(map.getLocations().get(larry.getCurrentLocation().getName().toLowerCase()).getItems().contains(input)){
            System.out.println(map.getItems().get(input).getDescription());
            System.out.println("\ndo you want to buy this? (don't worry i promise it's in your student's budget)\n"+"(y/n)");
            boolean answered = false;
            while(answered == false) {
                String answer = scanner.next();
                scanner.nextLine();
                if(answer.equalsIgnoreCase("n")||answer.equalsIgnoreCase("no")){
                    return "\nokey sure, you can always come back for it if you'd like";
                }
                if(answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("yes")){
                    if(larry.getInventory().size()<5){
                        larry.getInventory().add(map.getItems().get(input));
                        map.getItems().get(input).setBought(true);
                        return "\ngreat, you now have it in your inventory :)\n";
                    }else{
                        return "oh...it looks like you can't pick up any more items, i'm sorry :(";
                    }
                }else{
                    System.out.println("\nem...i gave you a simple question, try again");
                }
            }
        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
