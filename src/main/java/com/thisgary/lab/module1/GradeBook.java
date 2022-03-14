package com.thisgary.lab.module1;

// Activity 5
public class GradeBook {
    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return (courseName);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for");
        System.out.println(this.getCourseName() + "!");
    }
}
