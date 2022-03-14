package com.thisgary.lab.module1;

// Activity 3
public class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return (length);
    }

    public double getWidth() {
        return (width);
    }

    public double area() {
        return (this.getLength() * this.getWidth());
    }

    public double perimeter() {
        return (2 * (this.getLength() + this.getWidth()));
    }
}
