package com.pluralsight;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your name: ");
        String fullName = scanner.nextLine().trim();

        System.out.println("What date would you like to reserve?(mm/dd/yyyy):");
        String dateInput = scanner.nextLine().trim();

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateInput, inputFormat);

        System.out.println("How many tickets would you like?");
        int tickets = scanner.nextInt();

//        Once the reservation is made, display a confirmation message to the customer in
//        this format:
//# ticket(s) reserved for (date) under (LastName, FirstName)
//        If only one ticket is reserved, the confirmation should not include an "s"
//        A sample trace of your program output is shown below. Bolded code is what the
//        user entered

        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        String ticketWord;
        if (tickets == 1) {
            ticketWord = "ticket";
        } else {
            ticketWord = "tickets";
        }

        System.out.println(tickets + " " + ticketWord + " reserved for " + date + " under " + lastName + ", " + firstName);

        scanner.close();
//    }
    }
}
