package com.thisgary.lab.module3;

import com.thisgary.library.Dumpster;
import com.thisgary.library.NumberScanner;

public class Test {
    public static void activity1() {
        Date date = new Date(31, 12, 2019);
        Employee employee = new Employee("John", "CSF3043", date);
        System.out.println(employee.toString());
    }

    public static void activity2() {
        Rectangle rectangle = new Rectangle(4, 2);
        System.out.printf("The area of rectangle is %d", rectangle.calculateArea());
    }

    public static void activity3() {
        NumberScanner scanner = new NumberScanner();
        Double miles = scanner.get("Enter the distance in miles: ").doubleValue();
        Distance distance = new Distance(miles);
        distance.overview();
        miles = scanner.get("Enter the distance in miles: ").doubleValue();
        distance.setMiles(miles);
        distance.overview();
    }

    public static void activity4() {
        Transaction transaction = new Transaction(10021, "Abdul Rahman", 'S');
        transaction.addTransactionDate(12, 8, 2011);
        transaction.overview();
    }

    public static void main(String[] args) throws Throwable {
        Dumpster.testModule(3);
    }
}
