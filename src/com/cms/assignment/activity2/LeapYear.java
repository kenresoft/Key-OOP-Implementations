package com.cms.assignment.activity2;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("To find whether a given year is a leap year or not \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = scanner.nextInt(); // Year input

        if (year % 4 == 0) // if the year is not divisible by 4 then it is not a leap year
            System.out.println(year + " is a leap year."); // Result
        else System.out.println(year + " is not a leap year.");
    }
}
