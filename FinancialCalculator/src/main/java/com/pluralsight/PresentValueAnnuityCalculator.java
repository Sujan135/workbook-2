package com.pluralsight;

import java.util.Scanner;

public class PresentValueAnnuityCalculator {
    public static void run(Scanner scanner) {
        System.out.println("Present Value Annuity Calculator: ");

        System.out.println("Enter monthly payout ($): ");
        double monthlyPayout = scanner.nextDouble();

        System.out.println("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter number of years: ");
        int years = scanner.nextInt();

        double monthlyInterestRate = (annualRate/100) / 12;
        int numberOfPayments = years * 12;

        double presentValue = monthlyPayout * (1- Math.pow(1+ monthlyInterestRate, -numberOfPayments)) / monthlyInterestRate;


        System.out.printf("Present Value of Annuity: $%.2f%n", presentValue);

    }
}
