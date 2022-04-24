package com.thisgary.lab.module5;

/*
Activity 1
----------
The class Polygon provides a generic operation to calculate the length for width, height and area for Square
and Rectangle, and display purposes of each of the coordinate (x, y) respectively. Class Square and
Rectangle contain only the specific method to display the area for the class.

Write a program to demonstrate the implementation of the above class. To test the class, create a main
class known as ShapeTest. Instantiate the object for mySquare and myRectangle by passing the parameters
(0,0, 0,2, 2,2, 2,0) and (0,0, 0,2, 5,2, 5,0) respectively.

Editor note
-----------
In other news, I want to experiment on the class that can only have one instance.
 */

public class Polygon {
    private static Polygon existingInstance;
    private Coordinate[] coordinates;

    public Polygon(Coordinate[] coordinates) {
        if (existingInstance == null) existingInstance = this;
        else throw new IllegalStateException("Already instantiated");
        this.coordinates = coordinates;
    }

    protected static double calculateArea(Coordinate[] coordinates) {
        double area = 0;
        for (int i = 0; i < coordinates.length; i++) {
            int j = i + 1;
            if (j == coordinates.length) j = 0;
            area += coordinates[i].getX() * coordinates[j].getY() - coordinates[i].getY() * coordinates[j].getX();
        }
        return Math.abs(area) / 2;
    }

    public Coordinate[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate[] coordinates) {
        this.coordinates = coordinates;
    }

    public double getArea() {
        return calculateArea(coordinates);
    }

    public String toString() {
        return "This polygon has an area of " + getArea();
    }

    public void flush() {
        existingInstance = null;
        coordinates = null;
    }
}
