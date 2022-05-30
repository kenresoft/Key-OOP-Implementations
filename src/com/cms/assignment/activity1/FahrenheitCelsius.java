package com.cms.assignment.activity1;

import java.util.Scanner;

public class FahrenheitCelsius {

    public static void main(String[] args) {
        System.out.println("Fahrenheit To Celsius. \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble(); // Temperature in fahrenheit

        double celsius = (fahrenheit - 32) / 1.8; // formula

        System.out.print(fahrenheit + " Fahrenheit = " + celsius + " Celsius"); // Output
    }
}
