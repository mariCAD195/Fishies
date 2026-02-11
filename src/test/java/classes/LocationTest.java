package classes;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LocationTest {

    Location location1;

    @Before
    public void setUp() throws Exception {
        location1 = new Location();
        location1.setName("test location");
        location1.setNeighbours(new ArrayList<>());
        location1.getNeighbours().add("idk");
        location1.getNeighbours().add("IDK");
        location1.getNeighbours().add("i dont knoooow");
    }

    @Test
    public void neighboursMenu() {
        assertEquals("1) idk\n" +
                "2) IDK\n" +
                "3) i dont knoooow",location1.neighboursMenu());
    }

    @Test
    public void interactWithMenu() {
    }

    @Test
    public void talkToMenu() {
    }

    @Test
    public void searchMenu() {
    }

    @Test
    public void lookAroundLocationMenu() {
    }
}