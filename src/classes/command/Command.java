package classes.command;

public abstract class Command {
    protected String commandName;

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public abstract String execute();
    public abstract boolean exit();
}
