package com.thisgary.lab.module7;

public class ZeroDivisionException extends ArithmeticException {
    public ZeroDivisionException() {
        super("Division by zero is not allowed. Because I say so.");
    }
}
