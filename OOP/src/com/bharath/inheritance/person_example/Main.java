package com.bharath.inheritance.person_example;

public class Main {
    public static void main(String[] args) {
        // Single Inheritance
        Employee emp = new Employee("Alice", 30, "E123");
        emp.introduce();
        emp.work();

        System.out.println();

        // Multilevel Inheritance
        Manager mgr = new Manager("Bob", 40, "M456", 5);
        mgr.introduce();
        mgr.work();
        mgr.conductMeeting();

        System.out.println();

        // Hierarchical Inheritance
        Student stu = new Student("Charlie", 20, "S789");
        stu.introduce();
        stu.study();
    }
}
