package com.thisgary.lab.module5;

import java.util.Arrays;

public class Square extends Rectangle {
    public Square(Coordinate[] coordinates) {
        super(coordinates);
        isSquare(coordinates);
    }

    protected static void isSquare(Coordinate[] cs) {
        double[] sides = {
                getDistance(cs[0], cs[1]),
                getDistance(cs[1], cs[2]),
                getDistance(cs[2], cs[3]),
                getDistance(cs[3], cs[0])
        };
        assert Arrays.stream(sides).allMatch(side -> side == sides[0]) : "Not a square";
    }

    public String toString() {
        Coordinate[] cs = getCoordinates();
        return "This square has a side of " + getDistance(cs[0], cs[1]) + " and an area of " + getArea();
    }
}
