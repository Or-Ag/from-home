package com.company;  // Correct package declaration

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username;
        String password;
        int numberSelection = 0;  // Correct variable name

        System.out.println("Hi! This is a system for managing user and passwords");
        System.out.println("for register pls press 1");
        System.out.println("for login pls press 2");
        System.out.println("for exit press 3");
        Scanner inputScanner = new Scanner(System.in);  // Renamed to inputScanner for better clarity
        numberSelection = inputScanner.nextInt();  // Correct variable name

        if (numberSelection == 1) {
            System.out.println("Pls create a username");   // Your code for option 1 goes here
            username = inputScanner.next();
            System.out.println("Pls create a password");
            password = inputScanner.next();
            System.out.println("Thank you very much!");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                // Handle the exception if needed
                e.printStackTrace();
            }

        }
        if ((numberSelection == 2))
        {
            System.out.println("Pls write a username");   // Your code for option 1 goes here
            username = inputScanner.next();
            System.out.println("Pls write a password");
            password = inputScanner.next();
            System.out.println("Thank you very much!");
        }

        if (numberSelection == 3);
            System.exit(404);
        // Close the scanner to avoid resource leaks
        inputScanner.close();
    }
}
