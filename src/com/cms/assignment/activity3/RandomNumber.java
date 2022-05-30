package com.cms.assignment.activity3;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        System.out.println("Guess a random number between 1 and 100 \n");

        Random random = new Random(); // Creating Object the Random class
        int generatedNumber = 1 + random.nextInt(100); // Boundary for random number.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number - ");
        int guessNumber = scanner.nextInt(); // Guess input

        if (guessNumber > generatedNumber) System.out.println("Too High \n");
        else if (guessNumber < generatedNumber) System.out.println("Too Low \n");

        while (guessNumber != generatedNumber) // If the guess is incorrect, loop to reopen the Scanner for guessNumber.
        {
            System.out.print("Enter Number - ");
            guessNumber = scanner.nextInt();

            if (guessNumber > generatedNumber) System.out.println("Too High \n");
            else if (guessNumber < generatedNumber) System.out.println("Too Low \n");
        }
        System.out.println("Correct! Random number is: " + generatedNumber); // Result
    }
}
