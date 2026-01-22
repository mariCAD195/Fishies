package classes.command;

public class Move extends Command {

    @Override
    public String execute() {
        return "Move command";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
