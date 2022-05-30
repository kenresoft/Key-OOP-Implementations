package com.cms.assignment.activity5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("To check if a word specified is a palindrome");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a input to check - ");
        String input = scanner.next(); // Input input

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(input); // function call

        if (result)
            System.out.println("\n" + input + " is a Palindrome.");
        else
            System.out.println("\n" + input + " is not a Palindrome.");
    }

    private boolean isPalindrome(String word) { // function
        StringBuilder reverseWord = new StringBuilder();
        word = word.toLowerCase(); // changing all character to lower case

        for (int i = word.toCharArray().length - 1; i >= 0; i--) {  // reversing word
            reverseWord.append(word.toCharArray()[i]);
        }
        return word.equals(reverseWord.toString()); // comparing words
    }
}
