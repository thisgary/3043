package com.thisgary.lab.module6;

public class Rectangle extends Shape {
    private double width, length;

    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return String.format("%sLength: %s\nWidth: %s\nArea: %s\n", super.toString(), length, width, getArea());
    }
}
