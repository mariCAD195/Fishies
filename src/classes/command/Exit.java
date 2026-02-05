package classes.command;

public class Exit extends  Command {
    @Override
    public String execute() {
        return "\noki :(";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
