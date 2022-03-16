package com.thisgary.lab.module3;

import com.thisgary.library.Dumpster;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = checkDay(year, month, day);
        this.month = checkMonth(month);
        this.year = checkYear(year);
        System.out.printf("Date object constructor for %s\n", toString());
    }

    private int checkDay(int year, int month, int day) {
        if (day > 0 && day <= Dumpster.dayInMonth(month, year)) {
            return day;
        } else {
            System.out.println("Invalid day");
            return 1;
        }
    }

    private int checkMonth(int month) {
        if (month > 0 && month <= 12) {
            return month;
        } else {
            System.out.println("Invalid month");
            return 1;
        }
    }

    private int checkYear(int year) {
        if (year > 0) {
            return year;
        } else {
            System.out.println("Invalid year");
            return 1;
        }
    }

    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
