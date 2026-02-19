package command;

import classes.Fish;
import classes.Journal;
import classes.Larry;
import classes.Map;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SearchTest {

    Search search1;
    Journal journal1;
    Search search2;
    Journal journal2;

    @Before
    public void setUp() throws Exception {
        journal1 = new Journal();
        journal1.setFishLeft(new HashMap<>());
        search1 = new Search(journal1);
        journal2 = new Journal();
        journal2.setFishLeft(new HashMap<>());
        journal2.getFishLeft().put("testFish",new Fish());
        search2 = new Search(journal2);
    }

    @Test
    public void exit() {
        assertEquals(true,search1.exit());
        assertEquals(false,search2.exit());
    }
}