package com.cms.assignment.activity7;

import java.util.Scanner;

public class Purchase extends Tag { // subclass of Tag class
    private static String product;
    private static int price;

    public Purchase(String product) { // constructor initialization
        super(product, price);
    }

    public static void main(String[] args) {
        System.out.println("Purchase a product\n"); // Title
        System.out.println("Welcome to our store!\n");

        Purchase purchase = new Purchase(product); // instantiation
        purchase.transactionProcessor(); // method call
    }

    private void transactionProcessor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your budget? ($) - "); // budget input
        int budget = scanner.nextInt();

        System.out.print("Enter a product to buy: - "); // product input
        product = scanner.next();

        Purchase purchase = new Purchase(product); // Instantiation of class
        price = purchase.getPrice(); // accessing the superclass method

        System.out.print("\n"); // New line

        System.out.println("Below are your details:");
        String[] array = new String[4]; // creating an array of the purchase details
        array[0] = "Product Name: " + product;
        array[1] = "Product Price: $" + price;
        array[2] = "Your Budget: $" + budget;
        array[3] = "Balance: $" + (budget - price);

        for (String element : array) { // loop to print all the  details
            System.out.println(element);
        }

        if (budget < price) {  // checking if budget is higher than price
            System.out.print("\nWe are sorry, your budget is low!\n");
            processPurchase(budget, price);
        } else {
            System.out.println("_______________________");
            System.out.print("Thank you, purchase successfully!");
        }
    }

    public static void processPurchase(int budget, int price) { // function to add students
        while (budget < price) { // Loops in order to validate name and age
            System.out.print("\n"); // New line
            Scanner scanner = new Scanner(System.in);

            System.out.print("What is your budget? ($) - "); // budget input
            budget = scanner.nextInt();

            System.out.print("Enter a product to buy: - "); // product input
            product = scanner.next();

            Purchase purchase = new Purchase(product); // Instantiation of class
            price = purchase.getPrice(); // accessing the superclass method

            System.out.print("\n"); // New line

            System.out.println("Below are your details:");
            String[] array = new String[4]; // creating an array of the student details
            array[0] = "Product Name: " + product;
            array[1] = "Product Price: " + price;
            array[2] = "Your Budget: " + budget;
            array[3] = "Balance: " + (budget - price);

            for (String element : array) { // foreach loop to print all the details
                System.out.println(element);
            }

            if (budget < price) { // checking if budget is higher than price
                System.out.print("\nWe are sorry, your budget is low!\n");
                processPurchase(budget, price);
            } else {
                System.out.println("_______________________");
                System.out.print("Thank you, purchase successful!");
            }

        }

    }
}
