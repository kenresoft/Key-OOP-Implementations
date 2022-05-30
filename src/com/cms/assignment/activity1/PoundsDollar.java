package com.cms.assignment.activity1;

import java.util.Scanner;

public class PoundsDollar {

    public static void main(String[] args) {
        System.out.println("Convert Pounds to Dollars. \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount in GBP: ");
        double pounds = sc.nextDouble(); // Input in pounds

        double factor = 1.4;  // conversion factor
        double dollar = pounds * factor;

        System.out.print(pounds + " GBP = " + dollar + "USD");  // Output
    }
}
