package com.test.basics;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int wordCount = countWords(sentence);
        System.out.println("Total number of words: " + wordCount);
    }

    public static int countWords(String sentence) {
        // Split the sentence into words using whitespace as the delimiter
        String[] words = sentence.trim().split("\\s+");

        // Return the length of the words array, which represents the number of words
        return words.length;
    }
}
