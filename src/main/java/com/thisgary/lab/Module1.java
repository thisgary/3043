package com.thisgary.lab;

import com.thisgary.library.Dumpster;
import com.thisgary.library.NumberScanner;

import java.util.Scanner;
import java.util.function.Function;

public class Module1 {
    public static void main(String[] args) throws Throwable {
        Dumpster.moduleActivity(1);
    }

//    You have been assigned to write a program to perform an arithmetic addition and subtraction for two (2)
//    integer numbers key-in by the user. The program should only accept the number key-in by the user as a
//    positive number. Finally, display the result for addition and subtraction. You should write your program
//    using an object-oriented approach.

    public static void activity0() {
        System.out.println("Enter two numbers to add and subtract:");
        Function<Number, Boolean> rules = n -> n.intValue() == n.doubleValue() && n.intValue() > 0;
        NumberScanner ns = new NumberScanner("Positive integer only", rules);
        int num1 = ns.getInt("Enter the first number: ");
        int num2 = ns.getInt("Enter the second number: ");
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
    }

    public static void activity1() {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter first integer  : ");
        number1 = input.nextInt();

        System.out.println("Enter second integer : ");
        number2 = input.nextInt();

        if (number1 < 0 || number2 < 0) {
            number1 = 0;
            number2 = 0;
            System.out.println("Invalid entry of number....! ");
        }

        System.out.printf("\nAddition is %d\n", (number1 + number2));
        System.out.printf("Difference is %d\n", (number1 - number2));
    }

    public static void activity2() {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter first integer  : ");
        number1 = input.nextInt();

        System.out.println("Enter second integer : ");
        number2 = input.nextInt();

        Activity2 arithmetic = new Activity2(number1, number2);

        System.out.printf("\nAddition is %d\n", arithmetic.addition());
        System.out.printf("Difference is %d\n", arithmetic.subtraction());
    }

//    Calculate the perimeter and area of the rectangle given that the length of the rectangle is 4 cm and the
//    width is 2 cm. Write your solution by initializing the length and width via constructor. Subsequently,
//    introduce the method for area() and perimeter(). Finally, in the main program, display the value for area
//    and perimeter for the rectangle. Compile your program and evaluate the output.
    public static void activity3() {
        Function<Number, Boolean> rules = n -> n.intValue() > 0;
        NumberScanner ns = new NumberScanner("Positive number only", rules);
        double length = ns.get("Enter the length of rectangle: ").doubleValue();
        double width = ns.get("Enter the width of rectangle: ").doubleValue();

        Activity3 rectangle = new Activity3(length, width);
        System.out.println("Area of the rectangle is " + rectangle.area());
        System.out.println("Perimeter of the rectangle is " + rectangle.perimeter() + "\n");
    }

//    Figure 1 show the UML diagram for Account’s class. Based on UML diagram, display the account number,
//    account name and balance for account number = “1001”. Write your solution using object-oriented
//    approach.
//
//            Account
//  - AcctNo        : String
//  - AcctName      : String
//  - Balance       : double
//  + getAcctNo()   : String
//  + setAcctNo()   : void
//  + getAcctName() : String
//  + setAcctName() : void
//  + getBalance()  : double
//
//    Algorithms:
//    Step 1 – Declare a class Account and attributes.
//    Step 2 – Create constructor
//    Step 3 – Initialize the values of account number, name and balance via constructor
//    Step 4 – Define getter and setter for each attributes
//    Step 5 - Declare a class AccountTest.
//    Step 6 – Instantiate Account class and display the account number, name and balance.
    public static void activity4() {
        Activity4 account = new Activity4("1001", "John Cena", 1000);
        System.out.println("Account number: " + account.getAcctNo());
        System.out.println("Account name: " + account.getAcctName());
        System.out.println("Account balance: " + account.getBalance());
    }


//      1. Given the UML class diagram below is designed for a simple program that displays the
//         Grade book course name as key-in by the user.
//
//          Grade book
//  - CourseName      : String
//  + getCourseName() : String
//  + setCourseName() : void
//  + displayMessage()
//
//      2. The specifications of the program are given below;
//          i.   Program will prompt “Please enter the course name”.
//          ii.  User will key-in the course name and press ENTER button.
//          iii. The program will display the output at window console as below;
    public static void activity5() {
        Activity5 gradeBook = new Activity5();
        System.out.print("Please enter the course name: ");
        gradeBook.setCourseName(new Scanner(System.in).nextLine());
        gradeBook.displayMessage();
    }
}

class Activity2 {
    private int number1;
    private int number2;

    public Activity2(int number1, int number2) {
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

class Activity3 {
    private double length;
    private double width;

    public Activity3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return (length);
    }

    public double getWidth() {
        return (width);
    }

    public double area() {
        return (length * width);
    }

    public double perimeter() {
        return (2 * (length + width));
    }
}

class Activity4 {
    private String acctNo;
    private String acctName;
    private double balance;

    public Activity4(String acctNo, String acctName, double balance) {
        this.acctNo = acctNo;
        this.acctName = acctName;
        this.balance = balance;
    }

    public String getAcctNo() {
        return (acctNo);
    }

    public String getAcctName() {
        return (acctName);
    }

    public double getBalance() {
        return (balance);
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }
}

class Activity5 {
    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return (courseName);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for");
        System.out.println(this.getCourseName() + "!");
    }
}