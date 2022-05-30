package com.cms.assignment.activity3;

public class Alphabets {
    public static void main(String[] args) {
        System.out.println("Alphabet in both lower case (a-z) and upper case (A-Z) \n");

        for (int i = 65; i <= 122; i++) { // Iterating from the lowest to the highest char number
            while (i > 90 && i < 97) { // Skip any unneeded char numbers in the middle.
                i++;
            }

            char character = (char) i; //Convert the number to character

            System.out.println(character); // Output

        }
    }

}
