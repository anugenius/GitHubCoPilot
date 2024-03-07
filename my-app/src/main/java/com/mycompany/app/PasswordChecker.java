package com.mycompany.app;

public class PasswordChecker {
    public static boolean checkPassword(String password) {
        // Password regex that enforces the following rules:
        // - At least one digit
        // - At least one special character
        // - No whitespace
        // - Minimum 8 characters
        // - Maximum 10 characters
        String passwordRegex = "^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,10}$";

        return password.matches(passwordRegex);
    }
}
