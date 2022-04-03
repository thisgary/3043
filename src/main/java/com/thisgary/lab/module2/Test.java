package com.thisgary.lab.module2;

import com.thisgary.library.Dumpster;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void activity1() {
        Welcome welcome = new Welcome("Abdul Rahman");
        welcome.overview();
    }

    public static void activity2() {
        ThreadLocalRandom r = ThreadLocalRandom.current();
        String[] vehicleTypes = {
            "SEDAN", "COUPE", "SPORTS CAR", "STATION WAGON", "HATCHBACK", "CONVERTIBLE", "SUV", "MINIVAN"
        };
        int i = r.nextInt(10);
        Vehicle vehicle = new Vehicle();
        while (i-- > 0) {
            vehicle.setVehicleType(vehicleTypes[r.nextInt(vehicleTypes.length)]);
            vehicle.setChassisNo(r.nextInt(1000000, 9999999));
            vehicle.setProductionYear(r.nextInt(1990, 2019));
            vehicle.overview();
        }
    }

    public static void activity3() {
        Student student = new Student("CSF3043", "Abdul Rahman", "active");
        student.overview();
    }

    public static void activity4() {
        Scanner s = new Scanner(System.in);
        System.out.println("String Numebr: ");
        String stringNumber = s.nextLine();
        System.out.println("Integer Number: ");
        int intNumber = s.nextInt();
        
        NumberChecker nc = new NumberChecker(stringNumber, intNumber);
        nc.overview();
    }

    public static void activity5() {
        ThreadLocalRandom r = ThreadLocalRandom.current();
        TicketSale ticketSale = new TicketSale(
                r.nextDouble(100, 1000),
                r.nextDouble(100, 1000),
                r.nextDouble(100, 1000));
        ticketSale.calculateTotalSales(r.nextInt(100), r.nextInt(100), r.nextInt(100));
        ticketSale.overview();
    }

    public static void main(String[] args) {
        Dumpster.testModule(2);
    }
}
