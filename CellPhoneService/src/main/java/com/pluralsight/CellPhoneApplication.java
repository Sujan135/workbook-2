package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone1 = createPhone(scanner);
        CellPhone cellPhone2 = createPhone(scanner);

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        scanner.close();
    }

    private static CellPhone createPhone(Scanner scanner) {
        CellPhone phone = new CellPhone();

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

        return phone;
    }

    public static void display(CellPhone phone) {
        System.out.println("\nPhone Information");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
