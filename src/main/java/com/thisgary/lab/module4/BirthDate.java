package com.thisgary.lab.module4;

import com.thisgary.lab.module3.Date;
import com.thisgary.library.GetNumber;
import com.thisgary.library.NumberScanner;

import java.util.Scanner;

public class BirthDate {
    private String name;
    private Date birthDate;

    public BirthDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        NumberScanner numberScanner = new NumberScanner();
        int birthDay = numberScanner.getInt("Birth day: ");
        int birthMonth = numberScanner.getInt("Birth month: ");
        int birthYear = numberScanner.getInt("Birth year: ");
        this.birthDate = new Date(birthDay, birthMonth, birthYear);
        scanner.close();
    }

    public void overview() {
        System.out.println("Hello " + this.name + ", your birth date is " + this.birthDate);
    }
}
