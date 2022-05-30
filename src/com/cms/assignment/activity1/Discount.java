package com.cms.assignment.activity1;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        System.out.println("N% Discount Off A Tag P \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tag: ");
        double price = sc.nextDouble(); // Tag input

        System.out.print("Enter Discount Rate: ");
        double rate = sc.nextDouble(); // Rate input

        double output = (rate / 100) * price; // Formula

        System.out.printf("A %s%% Discount Off %s is: %s%n", rate, price, output); // Output
    }
}
