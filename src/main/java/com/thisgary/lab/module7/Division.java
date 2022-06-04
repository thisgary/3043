package com.thisgary.lab.module7;

public class Division {
    int dividend;
    int divisor;

    public Division(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public int getDividend() {
        return dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public int getQuotient() {
        return dividend / divisor;
    }

    public int getRemainder() {
        return dividend % divisor;
    }

    public String toString() {
        return "Division: " + dividend + " / " + divisor + " = " +
                getQuotient() + " with remainder " + getRemainder();
    }
}
