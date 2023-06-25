package com.test.basics;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int add(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int subtract(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }

    public int subtract(int num1, int num2, int num3, int num4) {
        return num1 - num2 - num3 - num4;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double subtract(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    public double subtract(double num1, double num2, double num3, double num4) {
        return num1 - num2 - num3 - num4;
    }

    // Implement the methods for multiplication and division in a similar manner

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition:");
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2, 3, 4));
        System.out.println(calculator.add(2, 3, 4, 5));
        System.out.println(calculator.add(2.5, 3.7));
        System.out.println(calculator.add(2.5, 3.7, 4.2));
        System.out.println(calculator.add(2.5, 3.7, 4.2, 5.1));

        System.out.println("Subtraction:");
        System.out.println(calculator.subtract(5, 3));
        System.out.println(calculator.subtract(10, 5, 2));
        System.out.println(calculator.subtract(20, 5, 3, 2));
        System.out.println(calculator.subtract(5.5, 2.3));
        System.out.println(calculator.subtract(10.7, 4.2, 2.1));
        System.out.println(calculator.subtract(20.5, 5.2, 3.1, 2.4));
        System.out.println("I am Vandana");
    }


	public double multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
