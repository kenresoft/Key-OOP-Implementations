package com.cms.assignment.activity4;

public class SummationInArray {
    public static void main(String[] args) {
        System.out.println("To find the sum of all elements in an array \n");

        int sum = 0;
        int[] mArray = {6, 3, 8, 9, 2, 1, 3, 7}; //Initializing an Array of 7 elements

        for (int i = 0; i <= 7; i++) // loop
            sum += mArray[i];
        System.out.print("Sum of array is: " + sum); // Result
    }
}
