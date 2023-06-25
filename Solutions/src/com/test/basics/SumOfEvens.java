package com.test.basics;

public class SumOfEvens {
	public static void main(String[] args) {
        int sumOfEvens = 0;

        for (int number = 2; number <= 100; number++) {
            if (number % 2 == 0) {
                sumOfEvens = sumOfEvens + number;
            }
        }

        System.out.println("The sum of even numbers from 1 to 100 is: " + sumOfEvens);
    }
}
