package com.cms.assignment.activity4;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        System.out.println("Search for an element in a 2D array \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number To Search For - ");
        int searchedElement = sc.nextInt(); //Input number

        System.out.print("\n"); // New line

        int row = -1, column = -1;
        int[][] mArray = {{4, 6}, {3, 2}}; // creates a 2D array of 2 columns and 2 rows

        for (int i = 0; i < 2; i++) { // searching in columns by row for element
            for (int j = 0; j < 2; j++) {
                if (mArray[i][j] == searchedElement) {
                    row = i;
                    column = j;
                    break;
                }
            }
        }

        // Output
        if (row < 0) System.out.println("Element not found in the array");
        else System.out.print("Element found at: Row " + (row + 1) + ", Column " + (column + 1));

    }
}
