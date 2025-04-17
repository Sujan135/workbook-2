package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone1 = createPhone(scanner, 1);
        CellPhone cellPhone2 = createPhone(scanner, 2);

        CellPhone cellPhone3 = new CellPhone(22222, "Pixel 7", "T-Mobile", "855-555-2222", "Dana Wyatt");

        display(cellPhone1, 1);
        display(cellPhone2,2);
        display(cellPhone3,3);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        cellPhone1.dial(cellPhone3);

        scanner.close();
    }

    private static CellPhone createPhone(Scanner scanner, int index) {

        CellPhone phone = new CellPhone();

        System.out.println("\nInformation of phone #" + index);

        System.out.print("What is the serial number: ");
        phone.setSerialNumber(Integer.parseInt(scanner.nextLine()));

        System.out.print("What model is the phone? ");
        phone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        phone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner? ");
        phone.setOwner(scanner.nextLine());

        return phone;  // I return the phone here instead of using void.//
    }

    public static void display(CellPhone phone, int index) {
        System.out.println("\nPhone Information: " + index);
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
