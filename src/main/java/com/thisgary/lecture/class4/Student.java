package com.thisgary.lecture.class4;

public class Student extends Person {
    public Student(String name, char gender, int age) {
        super(name, gender, age);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge();
    }
}
