package com.thisgary.lab.module1;

import com.thisgary.library.Dumpster;
import com.thisgary.library.NumberScanner;

import java.util.Scanner;
import java.util.function.Function;

public class Test {
    public static void activity0() {
        System.out.println("Enter two numbers to add and subtract:");
        Function<Number, Boolean> rules = n -> n.intValue() > 0;
        NumberScanner ns = new NumberScanner("Positive integer only", rules);
        int num1 = ns.getInt("Enter the first number: ");
        int num2 = ns.getInt("Enter the second number: ");
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
    }

    public static void activity1() {
        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter first integer  : ");
        number1 = scanner.nextInt();

        System.out.println("Enter second integer : ");
        number2 = scanner.nextInt();

        if (number1 < 0 || number2 < 0) {
            number1 = 0;
            number2 = 0;
            System.out.println("Invalid entry of number....! ");
        }

        System.out.printf("\nAddition is %d\n", (number1 + number2));
        System.out.printf("Difference is %d\n", (number1 - number2));
    }

    public static void main(String[] args) {
        Dumpster.testModule(1);
    }
}

