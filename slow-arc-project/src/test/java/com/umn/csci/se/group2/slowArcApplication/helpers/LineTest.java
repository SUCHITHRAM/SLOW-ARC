package com.umn.csci.se.group2.slowArcApplication.helpers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This class contains unit tests for the Line class.
 */
public class LineTest {

    /**
     * Tests the constructor and getters of the Line class.
     * Verifies that the constructor sets the points correctly, and getters return the expected points.
     */
    @Test
    public void testConstructorAndGetters() {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(3.0, 4.0);

        Line line = new Line(p1, p2);

        assertSame(p1, line.p1);
        assertSame(p2, line.p2);
    }

}
