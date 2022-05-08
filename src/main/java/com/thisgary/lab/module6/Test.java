package com.thisgary.lab.module6;

import com.thisgary.library.Dumpster;

public class Test {
    /*
    At the main program, create the object by passing the following values:
    - For circle, define object name as “Circle” and radius = 4
    - For rectangle, define object name as “Rectangle”, width = 2 and length = 4.

    If the current object is rectangle, update the length = 6.
    Finally, display the area of circle and rectangle.
     */
    public static void activity1() {
        Rectangle rectangle = new Rectangle("Lol", 8, 7);
        System.out.println(rectangle);
        Circle circle = new Circle("Lmao", 6);
        System.out.println(circle);
    }

    /*
    Write a program to demonstrate the use of abstract class and method. In addition, show when
    the method overloading and overriding take place in your program.
     */
    public static void activity2() {
        JavaConsultant javaConsultant = new JavaConsultant("Ben", "Smith", 69, 420);
        System.out.println(javaConsultant);
    }

    public static void activity3() {
        Commission commission = new Commission("Ali", 69);
        System.out.println(commission);
    }

    /*
    Write a program to demonstrate the use of interface via class CreditCard(). Credit card has credit card
    number, transaction date, transaction description and transaction amount. The interface Payment()
    has a method to calculate the current payment amount of credit card that has to be paid for a month.
    Your output should display a credit card statement for a month in which consists of credit card number,
    several transaction details, total of transaction amounts and the current payment amount.
     */
    public static void activity4() {
        CreditCard transaction1 = new CreditCard(
                "123456789", "01/01/2020", "Lmao", 100);
        System.out.println(transaction1);
        CreditCard transaction2 = new CreditCard(
                "123456789", "02/01/2020", "Kek", 200);
        System.out.println(transaction2);
        CreditCard transaction3 = new CreditCard("123456789", "01/02/2020", "Lol", 100);
        System.out.println(transaction3);
    }

    public static void activity5() {

    }

    public static void main(String[] args) {
        Dumpster.testModule(6);
    }
}
