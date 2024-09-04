package com.phaete;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // Print current date and time
        System.out.println("Current date and time: ");
        System.out.println(LocalDateTime.now());

        // Add a timespan of 2 weeks to the current date and output the date
        System.out.println("Current date plus 2 weeks: ");
        System.out.println(LocalDate.now().plusWeeks(2));

        // Compare current date with a future date and output if current is before future date
        if (LocalDate.now().isBefore(LocalDate.now().plusWeeks(2))) {
            System.out.println("Current date is before future date");
        } else {
            System.out.println("Current date is after future date");
        }

        // Calculate the difference in days between two arbitrary dates
        System.out.println("Difference in hours between two arbitrary dates: ");
        System.out.println(ChronoUnit.HOURS.between(LocalDateTime.now().minusWeeks(1), LocalDateTime.now().plusHours(2)));
    }
}