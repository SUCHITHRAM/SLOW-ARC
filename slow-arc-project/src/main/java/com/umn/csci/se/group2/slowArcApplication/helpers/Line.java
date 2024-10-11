package com.umn.csci.se.group2.slowArcApplication.helpers;

/**
 * Represents a line segment in 2D space defined by two points.
 */
public class Line {

    /** The starting point of the line. */
    public Point p1;

    /** The ending point of the line. */
    public Point p2;

    /**
     * Constructs a Line object with given start and end points.
     *
     * @param p1 The starting point of the line.
     * @param p2 The ending point of the line.
     */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}
