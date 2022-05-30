package com.cms.assignment.activity4;

public class PrintingArray {
    public static void main(String[] args) {
        System.out.println("Store elements in an array and print the array \n");

        int firstElement = 3; // First number
        int secondElement = 7;  // Second number
        int thirdElement = 2;  // Third number
        int fourthElement = 9;  // Fourth number
        int fifthElement = 4;  // Fifth number

        int[] mArray = new int[5]; //Creates an Array of 5 elements
        mArray[0] = firstElement;
        mArray[1] = secondElement;
        mArray[2] = thirdElement;
        mArray[3] = fourthElement;
        mArray[4] = fifthElement;

        for (int i = 0; i <= 4; i++) // loop
            System.out.print(mArray[i] + " ");
    }
}
