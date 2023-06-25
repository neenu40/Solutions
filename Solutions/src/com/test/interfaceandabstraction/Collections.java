package com.test.interfaceandabstraction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collections {
	    public static void main(String[] args) {
	        Organization organization = new Organization();

	        // Add employees using ArrayList
	        Employee employee1 = new Employee("John Doe", 30, 50000);
	        Employee employee2 = new Employee("Jane Smith", 35, 60000);
	        organization.addEmployee(employee1);
	        organization.addEmployee(employee2);

	        // Add employees using Set
	        Employee employee3 = new Employee("David Johnson", 28, 45000);
	        Employee employee4 = new Employee("Emily Davis", 32, 55000);
	        organization.addEmployee(employee3);
	        organization.addEmployee(employee4);

	        // Add employees using HashMap
	        Employee employee5 = new Employee("Michael Brown", 29, 52000);
	        Employee employee6 = new Employee("Olivia Wilson", 34, 62000);
	        organization.addEmployee(employee5);
	        organization.addEmployee(employee6);

	        // Get employees from ArrayList
	        ArrayList<Employee> employeesArrayList = organization.getEmployees();
	        System.out.println("Employees (ArrayList):");
	        for (Employee employee : employeesArrayList) {
	            employee.displayInfo();
	            System.out.println();
	        }

	        // Implement set and map similar to array list
	    }
	}

	 

