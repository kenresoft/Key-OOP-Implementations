package com.cms.assignment.activity1;

import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void main(String[] args) {
        System.out.println("Celsius To Fahrenheit. \n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius: ");
        double celsius = scanner.nextDouble(); // Temperature in celsius

        double fahrenheit = (celsius * 1.8) + 32; //formula

        System.out.print(celsius + " Celsius = " + fahrenheit + " Fahrenheit"); // Output
    }
}
