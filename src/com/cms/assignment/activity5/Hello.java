package com.cms.assignment.activity5;

import java.util.Scanner;

public class Hello {
    public static void main(String[] arg) {
        System.out.println("Display \"Hello\" Message with Full Name.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Full Name - ");
        String name = scanner.nextLine(); // Input full name

        Hello hello = new Hello(); // instantiation
        hello.helloMessage(name); // function call
    }

    private void helloMessage(String name) { // function
        System.out.println("Hello " + name); // Output
    }
}
