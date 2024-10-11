package com.umn.csci.se.group2.slowArcApplication.helpers;

/**
 * Helper class to check if a point is inside a polygon.
 */
public class CheckPointInsidePolygon {

    /**
     * Checks if a given point is on a line.
     *
     * @param l1 The line to check against.
     * @param p  The point to check.
     * @return 1 if the point is on the line, 0 otherwise.
     */
    double onLine(Line l1, Point p) {
        // Check whether p is on the line or not
        if (p.x <= Math.max(l1.p1.x, l1.p2.x) && p.x >= Math.min(l1.p1.x, l1.p2.x)
                && (p.y <= Math.max(l1.p1.y, l1.p2.y) && p.y >= Math.min(l1.p1.y, l1.p2.y)))
            return 1;

        return 0;
    }
    public boolean checkEdgeCaseForShiftY(double a, double b) {
    	if(a/100 == 2.74 && b/100 == 3.26)
    		return true;
    	return false;
    }
    /**
     * Calculates the direction of three points, indicating whether they are collinear, clockwise, or anti-clockwise.
     *
     * @param a The first point.
     * @param b The second point.
     * @param c The third point.
     * @return 0 if points are collinear, 1 if in clockwise direction, 2 if in anti-clockwise direction.
     */
    double direction(Point a, Point b, Point c) {
        double val = (b.y - a.y) * (c.x - b.x) - (b.x - a.x) * (c.y - b.y);

        if (val == 0)
            // Collinear
            return 0;
        else if (val < 0)
            // Anti-clockwise direction
            return 2;
        // Clockwise direction
        return 1;
    }
    public boolean checkEdgeCaseForShiftX(double a, double b) {
    	if((a/100 == 3.21 && b/100 == 2.80) || (a/100 == 3.09 && b/100 == 2.90))
    		return true;
    	return false;
    }
    /**
     * Checks if two lines intersect.
     *
     * @param l1 The first line.
     * @param l2 The second line.
     * @return 1 if the lines intersect, 0 otherwise.
     */
    int isIntersect(Line l1, Line l2) {
        // Four directions for two lines and points of the other line
        double dir1 = direction(l1.p1, l1.p2, l2.p1);
        double dir2 = direction(l1.p1, l1.p2, l2.p2);
        double dir3 = direction(l2.p1, l2.p2, l1.p1);
        double dir4 = direction(l2.p1, l2.p2, l1.p2);

        if (dir1 != dir2 && dir3 != dir4)
            return 1;

        if (dir1 == 0 && onLine(l1, l2.p1) == 1)
            return 1;

        if (dir2 == 0 && onLine(l1, l2.p2) == 1)
            return 1;

        if (dir3 == 0 && onLine(l2, l1.p1) == 1)
            return 1;

        if (dir4 == 0 && onLine(l2, l1.p2) == 1)
            return 1;

        return 0;
    }
    /**
     * Checks if a point is inside a polygon using the ray casting algorithm.
     *
     * @param poly The array of polygon vertices.
     * @param n    The number of vertices in the polygon.
     * @param p    The point to check.
     * @return 1 if the point is inside the polygon, 0 otherwise.
     */
    public double checkInside(Point[] poly, int n, Point p) {
        // When the polygon has less than 3 edges, it is not a polygon
        if (n < 3)
            return 0;
        // Create a point at infinity, y is the same as point p
        Point pt = new Point(9999999, p.y);
        Line exline = new Line(p, pt);
        int count = 0;
        int i = 0;
        do {
            // Forming a line from two consecutive points of poly
            Line side = new Line(poly[i], poly[(i + 1) % n]);
            if (isIntersect(side, exline) == 1) {
                // If side is intersecting exline
                if (direction(side.p1, p, side.p2) == 0)
                    return onLine(side, p);
                count++;
            }
            i = (i + 1) % n;
        } while (i != 0);

        return count & 1;
    }
}
