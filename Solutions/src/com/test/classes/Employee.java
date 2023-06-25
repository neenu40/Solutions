package com.test.classes;

public class Employee extends Person {
    private int employeeId;

    public Employee(String name, int age, String email, int employeeId) {
        super(name, age, email);
        this.employeeId = employeeId;
    }

    public void displayEmployeeDetails() {
        displayDetails();
        System.out.println("Employee ID: " + employeeId);
System.out.println("JAVA");

    }
    
    public boolean isEmployeeEligibleForRetirement(int retirementAge) {
        return retirementAge >= 65;
    }
}

