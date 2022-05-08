package com.thisgary.lab.module6;

/*
Activity 1
----------
Circle has the following requirements:
- Has a radius
- Has a method to calculate area of circle as 3.14 x radius x radius
 */

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.142 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return String.format("%sRadius: %.2f\nArea: %.2f\n", super.toString(), radius, getArea());
    }
}
