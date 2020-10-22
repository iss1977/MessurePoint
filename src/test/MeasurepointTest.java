package test;

import measurePoint.Measurepoint;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeasurepointTest {

    @Test
    public void testConstruction() {
        Measurepoint start = new Measurepoint(0, 0., 0.);
        assertEquals(0, start.getTime());
        assertEquals(0., start.getSpeed(), 0.);
        assertEquals(0., start.getDistance(), 0.);

        Measurepoint end = new Measurepoint(60, 50., 1000.);
        assertEquals(60, end.getTime());
        assertEquals(50., end.getSpeed(), 0.);
        assertEquals(1000., end.getDistance(), 0.);
    }

    /**
     * Test of toString method, of class measurePoint.MeasurePoint.
     */
    @Test
    public void testToString() {
        Measurepoint instance = new Measurepoint(5, 30., 100.);
        String expResult = "Time:    5 s, Speed:   30.00 m/s, Distance:  100.00 m";
        String result = instance.toString();
        assertEquals(expResult, result);

        instance = new Measurepoint(5000, 3000., 1000.);
        expResult = "Time: 5000 s, Speed: 3000.00 m/s, Distance: 1000.00 m";
        result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test compareTo whether it ignores speed.
     */
    @Test
    public void testCompareToIgnoresSpeed() {
        Measurepoint instance = new Measurepoint(10, 50., 100.);
        Measurepoint other = new Measurepoint(10, 15., 100.);

        assertEquals(0, instance.compareTo(other));
        assertEquals(0, other.compareTo(instance));
    }

    /**
     * Test compareTo if time is earlier.
     */
    @Test
    public void testCompareToEarlierInTime() {
        Measurepoint instance = new Measurepoint(3, 25., 80.);
        Measurepoint other = new Measurepoint(4, 25., 80.);
        assertTrue(instance.compareTo(other) < 0);
    }

    /**
     * Test compareTo if time is later.
     */
    @Test
    public void testCompareToLaterInTime() {
        Measurepoint instance = new Measurepoint(3, 25., 80.);
        Measurepoint other = new Measurepoint(4, 25., 80.);
        assertTrue(other.compareTo(instance) > 0);
    }

    /**
     * Test equals with two totally equal points.
     */
    @Test
    public void testEqualsTwoTotallyEqualPoints() {
        Measurepoint other = new Measurepoint(3, 20, 50);
        Measurepoint instance = new Measurepoint(3, 20, 50);
//        assertEquals(true, instance.equals(other));
        assertTrue(instance.equals(other));
    }
}