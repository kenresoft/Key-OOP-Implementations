package com.cms.assignment.activity1;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        System.out.println("Average Of Four Numbers. \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double firstNumber = scanner.nextDouble(); // First Number Input

        System.out.print("Enter Second Number: ");
        double secondNumber = scanner.nextDouble(); // Second Number Input

        System.out.print("Enter Third Number: ");
        double thirdNumber = scanner.nextDouble(); // Third Number Input

        System.out.print("Enter Fourth Number: ");
        double fourthNumber = scanner.nextDouble(); // Fourth Number Input

        double average = (firstNumber + secondNumber + thirdNumber + fourthNumber) / 4;

        System.out.print("The Average of these four numbers are:" + average); // Output
    }
}
