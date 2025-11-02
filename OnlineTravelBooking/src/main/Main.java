package main;

import gui.LoginFrame;
import util.Constants;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Online Travel Booking Platform ===");
        System.out.println("Launching application...");

        try {
            // Initialize the login screen
            new LoginFrame();
            System.out.println("Welcome to the Online Travel Booking System!");
            System.out.println("User Roles Available: " + Constants.ROLE_ADMIN + ", " +
                    Constants.ROLE_AGENT + ", " + Constants.ROLE_TRAVELER);
        } catch (Exception e) {
            System.err.println("Error launching application: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
