package classes.command;

import classes.Larry;

public class Backpack extends Command {

    Larry larry;
    public Backpack(Larry larry) {
        this.larry = larry;
    }

    @Override
    public String execute() {
        return larry.whatsInMyBackpack();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
