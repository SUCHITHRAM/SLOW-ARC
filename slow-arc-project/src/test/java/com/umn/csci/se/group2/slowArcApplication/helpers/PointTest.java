package com.umn.csci.se.group2.slowArcApplication.helpers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This class contains unit tests for the Point class.
 */
public class PointTest {

    /**
     * Tests the constructor and getters of the Point class.
     * Verifies that the constructor sets the coordinates correctly, and getters return the expected coordinates.
     */
    @Test
    public void testConstructorAndGetters() {
        double x = 3.14;
        double y = 2.71;

        Point point = new Point(x, y);

        assertEquals(x, point.x);
        assertEquals(y, point.y);
    }

}
