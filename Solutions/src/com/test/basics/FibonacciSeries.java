package com.test.basics;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 20; // Change this value to set the desired limit
        int firstNumber = 0;
        int secondNumber = 1;
        
        System.out.println("Fibonacci Series up to " + n + ":");
        System.out.print(firstNumber + " " + secondNumber);

        while (secondNumber <= n) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(" " + nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}

