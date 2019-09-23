import models.SightingAnimals;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SightingAnimalsTest{

    SightingAnimals testSightingAnimals;

    @Before
    public void iniatateUp() {
        SightingAnimals testSightingAnimals = new SightingAnimals();
    }

    @Test
    public void testSightingAnimals_instantiatesCorrectly_true() {
        assertTrue(testSightingAnimals instanceof SightingAnimals);
    }

    @Test
    public void getId_instantiatesCorrectly_true() {
        assertEquals(1, true, testSightingAnimals.getId());
    }

    @Test
    public void location_instantiatesCorrectly_true() {

        assertEquals("Zone A", testSightingAnimals.getLocation());
    }

    @Test
    public void rangerName_instantiatesCorrectly_true() {
        assertEquals("David", testSightingAnimals.getRangeName());

    }
}