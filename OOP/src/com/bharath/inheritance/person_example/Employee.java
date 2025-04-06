package com.bharath.inheritance.person_example;

public class Employee extends Person {
    protected String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public void work() {
        System.out.println(name + " is working. [Employee ID: " + employeeId + "]");
    }
}
