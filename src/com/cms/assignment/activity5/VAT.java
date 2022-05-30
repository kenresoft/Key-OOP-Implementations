package com.cms.assignment.activity5;

import java.util.Scanner;

public class VAT {
    public static void main(String[] arg) {
        System.out.println("Display resulting price, given a particular VAT.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a price - ");
        double productPrice = scanner.nextDouble(); // price input

        System.out.print("Enter a VAT rate (%) - ");
        double vatRate = scanner.nextDouble(); // rate input

        VAT vat = new VAT();
        double product = vat.getProduct(productPrice, vatRate); // function product stored in variable
        System.out.println("\nResulting price with a VAT of " + vatRate + "% is: " + product); // Output
    }

    private double getProduct(double netPrice, double vatRate)// function
    {
        return (1 + (vatRate / 100) * netPrice);
    }
}
