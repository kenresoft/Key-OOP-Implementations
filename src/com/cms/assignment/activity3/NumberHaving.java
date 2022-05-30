package com.cms.assignment.activity3;

import java.util.Scanner;

public class NumberHaving {
    public static void main(String[] args) {
        System.out.println("How many times a number can be halved before it becomes smaller than 1 \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number - "); //Number input
        double number = scanner.nextDouble();

        int counter = 0; // start with a zero counter

        while (number >= 1) { // performs the function until the value is less than one
            number = number / 2;
            counter += 1; // 1 counter is added and saved as a new counter.
        }

        System.out.println(number + " can be halved " + counter + " times"); // Output
    }
}
