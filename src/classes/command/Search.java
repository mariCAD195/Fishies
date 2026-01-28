package classes.command;

import classes.Larry;
import classes.Map;
import classes.Toolbox;

/**
 * allows player to see all available activities in the room
 */
public class Search extends Command {

    private Map map;
    private Larry larry;

    public Search(Map map,  Larry larry) {
        this.map = map;
        this.larry = larry;
    }

    /**
     * prints all available things in the current room
     * @return NPCs present, interactable objects, fish tanks in the room
     */
    @Override
    public String execute() {
        System.out.println("\nhmmm...you look around the room and find...");
        return larry.getCurrentLocation().searchLocationMenu();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
