package com.thisgary.lab.module6;

import com.thisgary.library.Dumpster;

public class Test {
    public static void activity1() {
        Rectangle rectangle = new Rectangle("Lol", 8, 7);
        System.out.println(rectangle);
        Circle circle = new Circle("Lmao", 6);
        System.out.println(circle);
    }

    public static void activity2() {
        JavaConsultant javaConsultant = new JavaConsultant("Ben", "Smith", 69, 420);
        System.out.println(javaConsultant);
    }

    public static void activity3() {
        Commission commission = new Commission("Ali", 69);
        System.out.println(commission);
    }

    public static void activity4() {

    }

    public static void activity5() {

    }

    public static void main(String[] args) {
        Dumpster.testModule(6);
    }
}
