package com.thisgary.lab.module4;

import com.thisgary.library.Dumpster;
import com.thisgary.library.GetNumber;

import java.util.Arrays;

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
        System.out.println("Pound: " + currency1.getPound() + "\n");
    }

    public static void activity3() {
        // 1. Display all the subjects.
        Subject[] subjects = Subject.class.getEnumConstants();
        for (Subject subject : subjects) System.out.println(subject);
        System.out.println();
        // 2. Display the subject between subject code CSE3501 to CSE3503.
        Subject[] first3 = Arrays.copyOfRange(subjects, 0, 3);
        for (Subject subject : first3) System.out.println(subject);
        System.out.println();
        // 3. Display the subject code CSE3502 and CSE3504.
        System.out.println(Subject.CSE3502);
        System.out.println(Subject.CSE3504 + "\n");
    }

    public static void activity4() {
        BirthDate user = new BirthDate();
        user.overview();
        System.out.println("");
    }

    public static void activity5() {
        StringCollection collection = new StringCollection("Decide", "Up");
        System.out.println("ArrayList: " + collection.toString());
        collection.setStr1("Turn");
        System.out.println("ArrayList: " + collection.toString() + "\n");
    }

    public static void activity6() {
        BookSales bookSales = new BookSales('A', true, 69);
        bookSales.overview();
        System.out.println("");
    }

    public static void main(String[] args) {
        Dumpster.testModule(4);
    }
}
