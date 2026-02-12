package classes;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LarryTest {

    Larry larry;

    @Before
    public void setUp() throws Exception {
        larry = new Larry();
        larry.setTime(new HashMap<>());
    }

    @Test
    public void createTime() {
        larry.createTime();
        assertEquals(5,larry.getTime().size());
    }
}