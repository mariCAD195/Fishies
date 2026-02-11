package command;

import classes.Larry;

/**
 * allows the player to look into their inventory
 * @author mari
 */
public class Backpack extends Command {

    Larry larry;
    public Backpack(Larry larry) {
        this.larry = larry;
    }

    /**
     * shows player's inventory
     * @return current inventory
     */
    @Override
    public String execute() {
        return larry.whatsInMyBackpack();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
