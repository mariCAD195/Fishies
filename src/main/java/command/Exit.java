package command;

/**
 * allows player to leave the game
 * @author mari
 */
public class Exit extends  Command {

    /**
     * unfortunately this method closes the game,  so sad right :(
     * @return my honest reaction to someone leaving my game
     */
    @Override
    public String execute() {
        return "\noki :(";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
