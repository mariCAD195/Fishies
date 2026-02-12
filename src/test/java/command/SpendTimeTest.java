package command;

import classes.Larry;
import classes.Location;
import classes.Map;
import classes.Toolbox;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SpendTimeTest {

    SpendTime spendTime1;
    SpendTime spendTime2;
    Larry larry1;
    Larry larry2;
    Map map;

    @Before
    public void setUp() throws Exception {
        Location location = new Location();
        location.setName("cafe");
        larry1 = new Larry();
        larry1.setTime(new HashMap<>());
        larry1.createTime();
        map = new Map();
        larry1.setCurrentTime(2);
        larry1.setCurrentLocation(location);
        spendTime1 = new SpendTime(larry1, map);

        Location location2 = new Location();
        location2.setName("something wrong");
        larry2 = new Larry();
        larry2.setTime(new HashMap<>());
        larry2.createTime();
        larry2.setCurrentTime(1);
        larry2.setCurrentLocation(location2);
        spendTime2 = new SpendTime(larry2, map);
    }

    @Test
    public void execute() {
        assertEquals("you enjoy a bit of alone time\ntake a look at your photos and read a few pages of your book\nit feels like only a few minutes have passed but you soon realise it's already "+ Toolbox.coloredText("yellow", "afternoon"),spendTime1.execute());
        assertEquals("hmm...it would be nice to relax for a bit\nyou should head to the "+Toolbox.coloredText("yellow", "restaurant")+" or "+Toolbox.coloredText("yellow","cafe"),spendTime2.execute());
    }
}