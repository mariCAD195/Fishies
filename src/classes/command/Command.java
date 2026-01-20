package classes.command;

public abstract class Command {
    protected String commandName;

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public abstract void execute();
    public abstract void exit();
}
