package com.bharath.inheritance.person_example;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(name + " is studying. [Student ID: " + studentId + "]");
    }
}
