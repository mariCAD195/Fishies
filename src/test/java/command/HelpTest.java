package command;

import classes.Toolbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelpTest {

    Help help;

    @Before
    public void setUp() throws Exception {
        help = new Help();
    }

    @Test
    public void execute() {
        assertEquals(Toolbox.coloredText("blue", "\"look around\" - look for everything insteresting in the room\n"+
                "\"interact with\" - interact with an object in the room\n"+
                "\"talk to\" - talk to NPC in the room\n"+
                "\"search\" - search closely a fish tank in the room\n"+
                "\"go home\" - end the day and come back the next morning\n"+
                "\"move\" - move to a different room\n"+
                "\"open journal\" - open journal where you can look at your progress\n" +
                "\"backpack\" - see what items you have in your inventory\n"+
                "\"exit\" - exit the game duh\n"),help.execute());
    }
}