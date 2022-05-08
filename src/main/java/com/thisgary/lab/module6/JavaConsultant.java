package com.thisgary.lab.module6;

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
