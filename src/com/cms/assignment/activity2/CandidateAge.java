package com.cms.assignment.activity2;

import java.util.Scanner;

public class CandidateAge {
    public static void main(String[] args) {
        System.out.println("To read the age of a candidate and determine whether they are eligible to vote \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age - ");
        int age = scanner.nextInt(); //Age input

        // Output
        if (age >= 18) System.out.println("Congrats, you are eligible to vote!");
        else System.out.println("We're sorry, you are not eligible to vote.");
    }

}
