package com.mycompany.app;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (emailValidater.isValidEmail(email) && PasswordChecker.checkPassword(password)) {
            System.out.println("Login Success");
        } else {
            System.out.println("Invalid email or password");
        }

        scanner.close();
    }
}
