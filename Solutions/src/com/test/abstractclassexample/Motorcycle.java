package com.test.abstractclassexample;


public class Motorcycle extends Vehicle {
	private boolean hasSideCar;

	public Motorcycle(String brand, double price, boolean hasSideCar) {
		super(brand, price);
		this.hasSideCar = hasSideCar;
	}

	@Override
	public void displayInfo() {
		System.out.println("Motorcycle Details:");
		System.out.println("Brand: " + brand);
		System.out.println("Price: $" + price);
		System.out.println("Has Sidecar: " + hasSideCar);
	}
}
