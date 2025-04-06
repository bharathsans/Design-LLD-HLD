package com.bharath.inheritance.person_example;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, String employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting with a team of " + teamSize + " people.");
    }
}
