package com.thisgary.lab.module4;

/*
Activity 2
----------
Write a program to convert the currency from Malaysian Ringgit (MYR) to Pounds Sterling (£). The rate is
1£ is equivalent to MYR4.320. Your program should accept the input MYR key-in by the user. Finally,
display the conversion.
 */

import com.thisgary.library.GetNumber;

public class Currency {
    private double myr;
    private double pound;

    public Currency(double myr) {
        this.myr = myr;
        this.pound = myr / 4.320;
    }

    public double getPound() {
        return pound;
    }

    public static void main(String[] args) {
        double myr = GetNumber.scanDouble("MYR: ");
        Currency currency = new Currency(myr);
        System.out.println("Pound: " + currency.getPound() + "\n");
    }
}
