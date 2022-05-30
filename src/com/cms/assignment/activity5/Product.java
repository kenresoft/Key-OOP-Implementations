package com.cms.assignment.activity5;

import java.util.Scanner;

public class Product {
    public static void main(String[] arg) {
        System.out.println("Display Product of two numbers.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number - ");
        double firstNumber = scanner.nextDouble(); // first number  input

        System.out.print("Enter Second Number - ");
        double secondNumber = scanner.nextDouble(); // second number  input

        Product product = new Product();
        double output = product.getProduct(firstNumber, secondNumber); // function
        System.out.println("\nThe product of " + firstNumber + " and " + secondNumber + " is: " + output);
    }

    private double getProduct(double firstNumber, double secondNumber) //function
    {
        return firstNumber * secondNumber; // calculation
    }
}
