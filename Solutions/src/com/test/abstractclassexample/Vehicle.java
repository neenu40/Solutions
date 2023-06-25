package com.test.abstractclassexample;

// Abstract Vehicle class
abstract class Vehicle {
	protected String brand;
	protected double price;

	public Vehicle(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public abstract void displayInfo();
}