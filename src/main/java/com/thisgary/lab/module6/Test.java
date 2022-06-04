package com.thisgary.lab.module6;

import com.thisgary.lab.module3.Date;
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
        CreditCard transaction3 = new CreditCard(
                "123456789", "01/02/2020", "Lol", 100);
        System.out.println(transaction3);
    }

    /*
    Using classes, design an online address book to keep track of the names, addresses, phone numbers,
    and birthdays of family members, close friends, and certain business associates. Your program should
    be able to handle a maximum of 500 entries.
     */
    public static void activity5() {
        Date testDate = new Date(1, 1, 2000);
        Address testAddress = new Address("123 Main St", "San Francisco", "CA", "94105");
        AddressBook addressBook = new AddressBook();

        System.out.println("1. Test adding new entries");
        addressBook.addFamily("John", testAddress, "123-456-7890", testDate, "Father");
        System.out.println("\n" + addressBook);
        addressBook.addFamily("Mary", testAddress, "123-456-7890", testDate, "Mother");
        testAddress.setStreet("456 Main St");
        addressBook.addFriend("Bob", testAddress, "123-456-7890", testDate, "I hate this person");
        System.out.println("\n" + addressBook);
        System.out.println("See they are working\n");

        System.out.println("2. Test sorting entries");
        testAddress.setCity("Los Angeles");
        addressBook.addBusinessAssociate(
                "Ali", testAddress, "123-456-7890",
                testDate, "Google", "Software Engineer");
        System.out.println("\n" + addressBook);
        addressBook.sortByName();
        System.out.println(addressBook);
        System.out.println("Sorted this thing by name\n");
        addressBook.sortByCategory();
        System.out.println(addressBook);
        System.out.println("Sorted this thing by category\n");

        System.out.println("3. Test removing entries");
        addressBook.removeContactByName("John");
        System.out.println("\n" + addressBook);

        System.out.println("4. Category check");
        for (ExtPerson person : addressBook.getContacts())
            System.out.println(person.getName() + " is " + person.getCategory());
        System.out.println("\nPeople with category 'Family':\n");
        for (ExtPerson person : addressBook.getContactsByCategory("Family")) System.out.println(person);
    }

    public static void main(String[] args) {
        Dumpster.testModule(6);
    }
}
