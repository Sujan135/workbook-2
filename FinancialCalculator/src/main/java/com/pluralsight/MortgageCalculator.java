package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void run(Scanner scanner) {
        //Mortgage Calculator
        System.out.println("Welcome to Mortgage Calculator: ");

        System.out.print("Enter the loan principal ($): ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter the loan term (in years) ");
        int loanYears = scanner.nextInt();

        double monthlyInterestRate = (annualInterestRate / 100) / 12;


        int numberOfPayments = loanYears * 12;


        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) -1);

        double totalInterestPaid = (monthlyPayment * numberOfPayments) - principal;

        System.out.printf("Your monthly payment is: $%.2f%n", monthlyPayment);
        System.out.printf("The total interest paid over the life of loan is: $%.2f%n", totalInterestPaid);

    }

}
