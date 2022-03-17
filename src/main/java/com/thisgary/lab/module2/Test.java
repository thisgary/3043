package com.thisgary.lab.module2;

import com.thisgary.library.Dumpster;
import com.thisgary.library.NumberScanner;

import java.util.concurrent.ThreadLocalRandom;

public class Test {
    //    Write a program to display the message “Welcome to OOP class, person_name”. The name of person must
//    be assigned through the constructor. In addition, the program should prompt message “CSF3043 – Object
//    Oriented Programming”, when you execute the default constructor. Run your program using default
//    constructor and your pre-defined constructor. Evaluate the output. You should produce the sample
//    output as below:
//
//    CSE3101 - Object Oriented Programming
//    Welcome to O0P class, Abdul Rahman
    public static void activity1() {
        Welcome welcome = new Welcome("Abdul Rahman");
        welcome.print();
    }

    public static void activity2() {
        ThreadLocalRandom r = ThreadLocalRandom.current();
        String[] VehicleTypes = {
                "SEDAN", "COUPE", "SPORTS CAR", "STATION WAGON", "HATCHBACK", "CONVERTIBLE", "SUV", "MINIVAN"
        };
        for (int i = 0; i < r.nextInt(10); i++) {
            String VehicleType = VehicleTypes[r.nextInt(VehicleTypes.length)];
            int ChassisNo = r.nextInt(1000000, 9999999);
            int ProductionYear = r.nextInt(1990, 2019);
            Vehicle vehicle = new Vehicle(VehicleType, ChassisNo, ProductionYear);
            vehicle.overview();
        }
    }

    //    The Student() class consists of attribute such as student id, name, and status. The status can be
//    assigned either active or suspend. Your program must have minimum three (3) constructors, that will behave
//    differently when the program is executed at runtime. Create the main program and display the student name,
//    course and his/her status.
    public static void activity3() {
        Student student = new Student("CSE3101", "Abdul Rahman", "active");
        student.overview();
    }

    //    Write a program to convert string number into integer, integer number into double. Prompt the user at main
//    program to enter two (2) numbers that representing string number and integer number. The program should
//    validate the string input key-in by user is number. If the input is string (a, b, c, etc.), then assigned the input
//    as “0”. Otherwise, display the error message. Finally, display the out of conversion.
    public static void activity4() {
        NumberScanner ns = new NumberScanner();
        int i = ns.getInt("Enter an integer: ");
        System.out.println("Integer: " + i);
    }

    //    You need to write the program to calculate the total ticket sales of a concert. There are three types of seating:
//    A, B and C. The program must accept the number of tickets sold and the price of a ticket for each of the three
//    types of seats. The total sales are computed as follows:
//    totalSales = numberofA_Seats * pricePerA_Seat +
//    numberofB_Seats * pricePerB_Seat +
//    numberofC_Seats * pricePerC_Seat
//    Write a class called Ticket Sale and use a class called TicketSaleTest to run the program and display total sales
//    for ticket A, B and C. Finally display total sales of the ticket
    public static void activity5() {
        ThreadLocalRandom r = ThreadLocalRandom.current();
        TicketSale ticketSale = new TicketSale(
                r.nextDouble(100, 1000),
                r.nextDouble(100, 1000),
                r.nextDouble(100, 1000));
        ticketSale.calculateTotalSales(r.nextInt(100), r.nextInt(100), r.nextInt(100));
        ticketSale.overview();
    }

    public static void main(String[] args) throws Throwable {
        Dumpster.testModule(2);
    }
}

