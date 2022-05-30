package com.cms.assignment.activity2;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        System.out.println("To find the largest of three numbers \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number - ");
        int firstNumber = scanner.nextInt(); // First input

        System.out.print("Enter Second Number - ");
        int secondNumber = scanner.nextInt(); // Second input

        System.out.print("Enter Third Number - ");
        int thirdNumber = scanner.nextInt(); // Third input

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            // if firstNumber is greater than the other two, then it is the largest
            System.out.println("The Largest Among The Three Numbers Is: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            // if secondNumber is greater than the other two, then it is the largest
            System.out.println("The Largest Among The Three Numbers Is: " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            // if thirdNumber is greater than the other two, then it is the largest
            System.out.println("The Largest Among The Three Numbers Is: " + thirdNumber);
        } else{
            System.out.println("There is a Number Number Tie");
            //There is a tie
        }
    }
}
