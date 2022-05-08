package com.thisgary.lab.module6;

public abstract class Consultant {
    private String name, company;
    private int age;

    public Consultant(String name, String company, int age) {
        this.name = name;
        this.company = company;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public abstract double getSalary();

    public void setCompany(String company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + ", Company: " + company + ", Age: " + age;
    }
}
