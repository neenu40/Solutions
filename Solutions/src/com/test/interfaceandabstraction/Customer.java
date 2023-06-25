package com.test.interfaceandabstraction;

public class Customer  implements Person {
    private String name;
    private int age;
    private String customerId;

    public Customer(String name, int age, String customerId) {
        this.name = name;
        this.age = age;
        this.customerId = customerId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Customer ID: " + customerId);
    }
    
    public void makePayment() {
        System.out.println("Payment has been made by " + name);
    }
}