package com.cms.assignment.activity4;

public class SeparationInArray {
    public static void main(String[] args) {
        System.out.println("To separate odd and even integers into separate arrays \n");

        int evenCount = 0;
        int oddCount = 0;

        int[] mArray = {16, 4, 10, 5, 2, 8, 4, 3, 1, 7}; //initializing an Array of 10 elements

        for (int i = 0; i <= 9; i++) { // to find the size of the new arrays first before creating them
            if (mArray[i] % 2 == 0) {
                evenCount += 1;
            } else oddCount += 1;
        }

        int[] evenArray = new int[evenCount]; // creating the new arrays
        int[] oddArray = new int[oddCount];

        int even = 0;
        int odd = 0;

        for (int i = 0; i <= 9; i++) { // sorting the array by divisibility by 2
            if (mArray[i] % 2 == 0) {
                evenArray[even] = mArray[i];
                even++;
            } else {
                oddArray[odd] = mArray[i];
                odd++;
            }
        }

        System.out.print("Even Arrays: ");
        for (int element : evenArray) // loop for even array
            System.out.print(element + " "); // Result

        System.out.print("\n"); // New line

        System.out.print("Odd Arrays: "); // loop for odd array
        for (int element : oddArray)
            System.out.print(element + " "); // Result

    }
}
