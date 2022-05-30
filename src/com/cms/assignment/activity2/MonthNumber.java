package com.cms.assignment.activity2;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        System.out.println("To convert a month number (1 to 12) entered by the user into the month name \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Month Number - ");
        int monthNumber = scanner.nextInt(); //Month number input

        // Output
        if (monthNumber == 1) System.out.println("The Month Name Is: January");
        else if (monthNumber == 2) System.out.println("The Month Name Is: February");
        else if (monthNumber == 3) System.out.println("The Month Name Is: March");
        else if (monthNumber == 4) System.out.println("The Month Name Is: April");
        else if (monthNumber == 5) System.out.println("The Month Name Is: May");
        else if (monthNumber == 6) System.out.println("The Month Name Is: June");
        else if (monthNumber == 7) System.out.println("The Month Name Is: July");
        else if (monthNumber == 8) System.out.println("The Month Name Is: August");
        else if (monthNumber == 9) System.out.println("The Month Name Is: September");
        else if (monthNumber == 10) System.out.println("The Month Name Is: October");
        else if (monthNumber == 11) System.out.println("The Month Name Is: November");
        else if (monthNumber == 12) System.out.println("The Month Name Is: December");
        else System.out.println("The Month is not valid"); // if the number is a number from 1 to 12
    }
}
