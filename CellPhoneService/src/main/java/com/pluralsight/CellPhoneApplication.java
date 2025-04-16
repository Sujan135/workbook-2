package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.println("What is the serial number?: ");
        int serialNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("What model is the phone?: ");
        String model = scanner.nextLine();

        System.out.println("Who is the carrier?: ");
        String carrier = scanner.nextLine();

        System.out.println("What is the phone number?: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone?: ");
        String owner = scanner.nextLine();

        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);


        System.out.println("Phone Information");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

        scanner.close();
    }
}
