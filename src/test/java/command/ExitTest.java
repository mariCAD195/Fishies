package command;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExitTest {

    Exit exit;

    @Before
    public void setUp() throws Exception {
        exit = new Exit();
    }

    @Test
    public void execute() {
        assertEquals("\noki :(",exit.execute());
    }

    @Test
    public void exit() {
        assertEquals(true,exit.exit());
    }
}