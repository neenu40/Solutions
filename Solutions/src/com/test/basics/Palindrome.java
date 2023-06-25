package com.test.basics;

public class Palindrome {
	public static boolean isPalindrome(String str) {
	    int left = 0;                 // Initialize the left pointer to the start of the string
	    int right = str.length() - 1; // Initialize the right pointer to the end of the string

	    while (left < right) {        // Iterate until the left pointer crosses or reaches the right pointer
	        if (str.charAt(left) != str.charAt(right)) { // Compare the characters at the corresponding positions
	            return false;         // If they are not equal, it's not a palindrome, return false
	        }
	        left++;                   // Move the left pointer towards the center of the string
	        right--;                  // Move the right pointer towards the center of the string
	    }

	    return true;                  // If the loop completes without returning false, it's a palindrome, return true
	}

    public static void main(String[] args) {
        String str1 = "madam";
        System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));

        String str2 = "hello";
        System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));

        String str3 = "racecar";
        System.out.println(str3 + " is a palindrome: " + isPalindrome(str3));
    }
}
