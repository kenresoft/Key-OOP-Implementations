package com.cms.assignment.activity5;

import java.util.Scanner;

public class TimeSeconds {
    public static void main(String[] arg) {
        System.out.println("Display Total seconds since midnight last night.");

        Scanner scanner = new Scanner(System.in); // Scanner
        System.out.print("Enter Current Time Hour - ");
        int hour = scanner.nextInt(); // hour input

        System.out.print("Enter Current Time Minute - ");
        int minute = scanner.nextInt(); // minute input

        System.out.print("Enter Current Time Second - ");
        int second = scanner.nextInt(); //  second input

        TimeSeconds timeSeconds = new TimeSeconds();
        int totalSeconds = timeSeconds.getTotalSeconds(hour, minute, second); // function call
        System.out.println("\nTotal seconds since midnight last night is: " + totalSeconds + " seconds");
    }

    private int getTotalSeconds(int hour, int minutes, int second) { // function
        int hourToSeconds = hour * 60 * 60; //hour to seconds
        int minuteToSeconds = second * 60; // minute to seconds
        return hourToSeconds + minuteToSeconds + second;
    }
}
