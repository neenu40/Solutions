package com.test.classes;

public class MainClass {
	public static void main(String[] args) {
        Person person = new Person("John Smith", 25, "johnsmith@example.com");
        person.displayDetails();
        
        Employee employee = new Employee("John Doe", 25, "johndoe@example.com", 12345);
        employee.displayEmployeeDetails();
        
        employee.isEmployeeEligibleForRetirement(78);
system.out.println("hello from Anmol");
    }
}
