package classes.command;

import classes.Larry;
import classes.Map;

public class Search extends Command {

    private Map map;
    private Larry larry;

    public Search(Map map,  Larry larry) {
        this.map = map;
        this.larry = larry;
    }

    @Override
    public String execute() {
        return larry.getCurrentLocation().searchLocationMenu();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
