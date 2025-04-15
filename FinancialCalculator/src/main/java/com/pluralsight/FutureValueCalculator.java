package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalculator {
    public static void run(Scanner scanner) {
        System.out.println("Welcome to Future Value calculator");

        System.out.println("Enter the deposit amount ($):" );
        double principal = scanner.nextDouble();

        System.out.println("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter the number of years: ");
        int years = scanner.nextInt();

        double rateDecimal = annualRate / 100;

        int daysPerYear = 365;
        int totalDays = daysPerYear * years;

        double futureValue = principal * Math.pow(1+ (rateDecimal/daysPerYear), totalDays);

        double interestEarned = futureValue - principal;

        System.out.printf("Future Value: $%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: $%.2f%n", interestEarned);

    }
}
