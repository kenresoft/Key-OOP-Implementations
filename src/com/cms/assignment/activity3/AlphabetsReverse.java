package com.cms.assignment.activity3;

public class AlphabetsReverse {
    public static void main(String[] args) {
        System.out.println("Reverse Alphabet in both lower case (a-z) and upper case (A-Z) \n");

        int i;
        for (i = 122; i >= 65; i--) { // Iterating from the highest to the lowest char number
            while (i > 90 && i < 97) { // Skip any unneeded char numbers in the middle.
                i--;
            }

            char character = (char) i; //Converts the number to character

            System.out.println(character); //Output

        }
    }
}
