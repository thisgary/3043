package com.thisgary.lab.module2;

// Activity 1
public class Welcome {
    final private String name;

    public Welcome(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("CSE3101 - Object Oriented Programming");
        System.out.println("Welcome to OOP class, " + this.name + "\n");
    }
}
