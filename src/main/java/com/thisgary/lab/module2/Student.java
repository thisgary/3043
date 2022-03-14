package com.thisgary.lab.module2;

// Activity 3
public class Student {
    private String studentId;
    private String studentName;
    private String studentStatus;

    public Student() {
        System.out.println("Student Class");
        System.out.println("=============");
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String studentName) {
        this(studentId);
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, String studentStatus) {
        this(studentId, studentName);
        this.studentStatus = studentStatus;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public void overview() {
        new Student();
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student Status: " + this.studentStatus + "\n");
    }
}
