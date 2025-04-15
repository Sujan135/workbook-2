package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name: ");
        String name = scanner.nextLine().trim();

        String[] nameParts = name.split("\\s+");

//        Creating empty place
        String firstName = "";
        String middleName = "";
        String lastName = "";

        if(nameParts.length == 2){
            firstName = nameParts[0];
            lastName = nameParts[1];
            middleName = "(none)";
        } else if(nameParts.length == 3){
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {
            System.out.println("invalid name");
            scanner.close();
            return;
        }

        System.out.println("first name: " + firstName);
        System.out.println("middle name: " + middleName);
        System.out.println("last name: " + lastName);

        scanner.close();

    }
}
