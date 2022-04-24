package com.thisgary.lab.module5;

public class Rectangle extends Polygon {
    public Rectangle(Coordinate[] coordinates) {
        super(coordinates);
        isRectangle(coordinates);
    }

    private static void isRectangle(Coordinate[] coordinates) {
        assert coordinates.length == 4 : "Not a quadrilateral";
        
        assert (coordinates[0].getY() + coordinates[1].getY() == coordinates[2].getY() - coordinates[3].getY() &&
                coordinates[0].getX() + coordinates[1].getX() == coordinates[2].getX() - coordinates[3].getX())
                : "Not a rectangle";
    }

    protected static double getDistance(Coordinate c1, Coordinate c2) {
        return Math.sqrt(Math.pow(c1.getX() - c2.getX(), 2) + Math.pow(c1.getY() - c2.getY(), 2));
    }

    public String toString() {
        Coordinate[] cs = getCoordinates();
        double a = getDistance(cs[0], cs[1]), b = getDistance(cs[1], cs[2]);
        return "This rectangle has a height of " + Math.max(a, b) +
                ", a width of " + Math.min(a, b) + " and an area of " + getArea();
    }
}
