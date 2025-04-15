package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your name");

        System.out.println("Fist name:");
        String firstName = scanner.nextLine().trim();

        System.out.println("Middle name:");
        String middleName = scanner.nextLine().trim();

        System.out.println("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine().trim();

        StringBuilder fullName = new StringBuilder();
        fullName.append(firstName);

        if(!middleName.isEmpty()){
            if (!middleName.endsWith(".")){
                middleName = middleName + ".";
            }
            fullName.append(" ");
            fullName.append(middleName);
        }

        fullName.append(" ").append(lastName);

        if(!suffix.isEmpty()) {
            fullName.append(" , ").append(suffix);
        }

        System.out.println("Full name: " + fullName);

        scanner.close();

    }
}
