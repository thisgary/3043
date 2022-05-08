package com.thisgary.lab.module6;

/*
Activity 2
----------
The Java Consultant class has the following requirements:
- Has a number of working days and a salary rate as MYR800.00 per day.
- Has a method to calculate and display salary. The salary is based on number of working days
  x salary rate per day.
 */

public class JavaConsultant extends Consultant {
    private int workingDays;

    public JavaConsultant(String name, String company, int age, int workingDays) {
        super(name, company, age);
        this.workingDays = workingDays;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public double getSalary() {
        return workingDays * 800.0f;
    }

    public String toString() {
        return super.toString() + ", Salary: " + workingDays + " * 800 = " + getSalary() + "\n";
    }
}
