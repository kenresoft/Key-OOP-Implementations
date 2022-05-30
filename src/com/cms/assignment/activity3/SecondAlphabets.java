package com.cms.assignment.activity3;

public class SecondAlphabets {
    public static void main(String[] args) {
        System.out.println("Printing every Second letter in the Alphabet in both lower case and upper case \n");

        for (int i = 65; i <= 122; i++) { // Iterating from the lowest to the highest char number
            while (i > 90 && i < 97) { // Skip any unneeded char numbers in the middle.
                i++;
            }

            char character = (char) i; //Convert the number to character
            char character2 = (char) (i + 1); //Convert the next character's number to character

            // Output
            if (i == 90 || i == 122)
                System.out.println(character); // Prevent the next symbol after character 'Z' and 'z' from printing
            else System.out.println(character + "" + character2); // Print current char and next char
        }
    }
}
