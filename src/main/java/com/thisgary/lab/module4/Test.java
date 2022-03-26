package com.thisgary.lab.module4;

import com.thisgary.lab.module3.Date;
import com.thisgary.library.Dumpster;
import com.thisgary.library.GetNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void activity1() {
        Transaction transaction1 = new Transaction("Ali", 1002, 'W', 400);
        transaction1.overview();
        Transaction transaction2 = new Transaction("Ali", 1002, 'D', 100);
        transaction2.overview();
        Transaction transaction3 = new Transaction("Ali", 1002, 'W', 600);
        transaction3.overview();
    }

    public static void activity2() {
        double myr = GetNumber.scanDouble("MYR: ");
        Currency currency1 = new Currency(myr);
        System.out.println("Pound: " + currency1.getPound());
    }

    /*
    For testing purposes, create new main class known as SubjectEnumTest() and write the following
    implementation to test the enum Subject:
    1. Display all the subjects.
    2. Display the subject between subject code CSE3501 to CSE3503.
    3. Display the subject code CSE3502 and CSE3504.
     */
    public static void activity3() {
        // 1. Display all the subjects.
        Subject[] subjects = Subject.class.getEnumConstants();
        for (Subject subject : subjects) subject.overview();
        System.out.println();
        // 2. Display the subject between subject code CSE3501 to CSE3503.
        Subject[] first3 = Arrays.copyOfRange(subjects, 0, 3);
        for (Subject subject : first3) subject.overview();
        System.out.println();
        // 3. Display the subject code CSE3502 and CSE3504.
        Subject.CSE3502.overview();
        Subject.CSE3504.overview();
    }

    public static void activity4() {
        BirthDate user = new BirthDate();
        user.overview();
    }

    public static void activity5() {
        StringCollection collection = new StringCollection("Decide", "Up");
        System.out.println("ArrayList: " + collection.toString());
        collection.setStr1("Turn");
        System.out.println("ArrayList: " + collection.toString());
    }

    public static void activity6() {
        BookSales bookSales = new BookSales('A', true, 69);
        bookSales.overview();
    }

    public static void main(String[] args) throws Throwable {
        Dumpster.testModule(4);
    }
}
