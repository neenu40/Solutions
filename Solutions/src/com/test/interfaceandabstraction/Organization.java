package com.test.interfaceandabstraction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Organization {
	private ArrayList<Employee> employees;
	
	private HashSet<Employee> employeeSet;

	public Organization() {
		employees = new ArrayList<>();
		employeeSet = new HashSet();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	
	public void addEmployeeSet(Employee employee) {
		employeeSet.add(employee);
	}

	public HashSet<Employee> getEmployeeset() {
		return employeeSet;
	}

}