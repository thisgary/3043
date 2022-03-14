package com.thisgary.lab.module1;

// Activity 2
public class Arithmetic {
    private final int number1;
    private final int number2;

    public Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return (number1);
    }

    public int getNumber2() {
        return (number2);
    }

    public int addition() {
        return (number1 + number2);
    }

    public int subtraction() {
        return (number1 - number2);
    }
}
