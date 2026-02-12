package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AquariumTest {

    Larry larry;
    Aquarium aquarium;

    @Before
    public void setUp() throws Exception {
        larry = new Larry();
        larry.setCurrentTime(2);
        aquarium = new Aquarium("testAquarium");
        aquarium.getEveryFish().add(new Fish("fish1",2));
        aquarium.getEveryFish().add(new Fish("fish2",3));
        aquarium.getEveryFish().add(new Fish("fish3",0));
    }

    @Test
    public void activateFish() {
        aquarium.activateFish(larry);
        assertEquals(2,aquarium.getActiveFish().size());
    }
}