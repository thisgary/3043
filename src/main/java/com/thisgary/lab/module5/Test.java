package com.thisgary.lab.module5;

import com.thisgary.library.Dumpster;

import java.util.Date;

public class Test {
    public static void activity1() {
        Coordinate[] coordinates = {
                new Coordinate(0, 0), new Coordinate(0, 2),
                new Coordinate(5, 2), new Coordinate(5, 0)
        };
        Rectangle myRectangle = new Rectangle(coordinates);
        System.out.println(myRectangle);

        myRectangle.flush();

        coordinates[2].setX(2);
        coordinates[3].setX(2);

        Square mySquare = new Square(coordinates);
        System.out.println(mySquare);
    }

    public static void activity2() {
        ContractEmployee john = new ContractEmployee(1, "John", 69);
        PermanentEmployee cena = new PermanentEmployee(2, "Cena");
        System.out.println(john);
        System.out.println(cena);
    }

    /*
    Copy your solution in Activity 2 and paste into CSF3043 -> Lab – Chapter 5 -> Activity 3. Based on the
    solution you wrote in Activity 2, modify the common method double calculateEmpSalary() to calculate
    the salary as below:
    Employee salary = basic salary

    In your Permanent Employee and Contract Employee’s class, rename the method to calculate salary as
    double calculateEmpSalary(). Create a main program as EmployeeTest and override the implementation
    of calculating salary at permanent and contract employee
     */
    public static void activity3() {
        ContractEmployee john = new ContractEmployee(3, "Kono", 24);
        PermanentEmployee cena = new PermanentEmployee(4, "Suba");
        System.out.println(john);
        System.out.println(cena);
    }

    public static void activity4() {
        Person person = new Person("John", "17, George Road, 1140, George, Uganda", "123456789");
        System.out.println(person);
        Employee employee = new Employee("John", "17, George Road, 1140, George, Uganda", "123456789",
                "123456789", "Astrology", "CEO", 8888, new Date());
        System.out.println(employee);
        Student student = new Student("John", "17, George Road, 1140, George, Uganda", "123456789",
                "123456789", "Astrology", 2048);
        System.out.println(student);
        Alumni alumni = new Alumni("John", "17, George Road, 1140, George, Uganda", "123456789",
                "123456789", "Astrology", 2048, new Date());
        System.out.println(alumni);
    }

    public static void main(String[] args) {
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
        Dumpster.testModule(5);
    }
}
