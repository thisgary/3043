package com.thisgary.lab.module6;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return 0.0;
    }

    public String toString() {
        return String.format("Shape: %s\n", name);
    }
}
