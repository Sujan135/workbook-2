package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose a calculator");
            System.out.println("1. Mortgage Calculator");
            System.out.println("2. Future Value Calculator");
            System.out.println("3. Present Value Annuity Calculator");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid choice, Try Again...");
                System.out.print("Enter your choice: ");
                scanner.next(); // Discard non-integer input
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    MortgageCalculator.run(scanner);
                    break;
                case 2:
                    FutureValueCalculator.run(scanner);
                    break;
                case 3:
                    PresentValueAnnuityCalculator.run(scanner);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting");
                    continue;
                default:
                    System.out.println("Invalid choice, Try Again...");
                    continue;
            }
            // Clear the buffer before asking to continue
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }


            System.out.print("\n Would you like to do another calculations? (yes/no) ");
            String again = scanner.nextLine().toLowerCase();
            if(!again.equals("yes")) {
                System.out.println("Thank you for using calculator");
                running = false;
            }
        }

    }
}

