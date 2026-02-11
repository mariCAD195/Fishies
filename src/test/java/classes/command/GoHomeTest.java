package classes.command;

import classes.Larry;
import classes.Location;
import classes.Map;
import command.GoHome;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class GoHomeTest {

    Larry larry;
    GoHome goHome;
    Map map;

    @Before
    public void setUp() throws Exception {
        larry = new Larry();
        map = new Map();
        goHome = new GoHome(larry,map);
        Location firstLocation = new Location();
        firstLocation.setName("gift shop");
        larry.setCurrentLocation(firstLocation);
    }

    @Test
    public void execute() {
        goHome.execute();
        assertEquals("lobby",larry.getCurrentLocation().getName());
    }
}