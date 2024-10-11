package com.umn.csci.se.group2.slowArcApplication.helpers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This class contains unit tests for the CheckPointInsidePolygon class.
 */
public class CheckPointInsidePolygonTest {

    /**
     * Tests the checkInside method with a rectangle and an inside point.
     * Verifies that the method returns 1 (inside).
     */
    @Test
    public void testCheckInsideWithRectangleAndInsidePoint() {
        // Rectangle vertices
        Point[] poly = { new Point(1, 1), new Point(5, 1), new Point(5, 5), new Point(1, 5) };
        int n = poly.length;
        Point insidePoint = new Point(3, 3);

        CheckPointInsidePolygon checker = new CheckPointInsidePolygon();
        double result = checker.checkInside(poly, n, insidePoint);

        assertEquals(1, result, 0.01);
    }

    /**
     * Tests the checkInside method with a rectangle and an outside point.
     * Verifies that the method returns 0 (outside).
     */
    @Test
    public void testCheckInsideWithRectangleAndOutsidePoint() {
        // Rectangle vertices
        Point[] poly = { new Point(1, 1), new Point(5, 1), new Point(5, 5), new Point(1, 5) };
        int n = poly.length;
        Point outsidePoint = new Point(0, 0);

        CheckPointInsidePolygon checker = new CheckPointInsidePolygon();
        double result = checker.checkInside(poly, n, outsidePoint);

        assertEquals(0, result, 0.01);
    }
}
