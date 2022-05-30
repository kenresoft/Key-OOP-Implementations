package com.cms.assignment.activity2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckDate {

    public static void main(String[] args) {
        System.out.println("To test if the date entered comes before or after today \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Date (yyyy-MM-dd): ");
        String date = scanner.next(); // Date input

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // DateTimeFormatter
        final LocalDate currentDate = LocalDate.now(); //Today's date

        LocalDate localDate = LocalDate.parse(date, formatter); //Parse Date Pattern to LocalDate
        boolean dateBefore = localDate.isBefore(currentDate);  // Date test

        // Output
        if (dateBefore) System.out.print(date + " is Before today."); // Date is before today
        else if (localDate.isEqual(currentDate))
            System.out.print(date + " is Same with today."); // Date is same with today
        else System.out.print(date + " is After today."); // Date is after today
    }
}
