package com.mycompany.app;

/**
 * The EmailValidator class provides a method to validate email addresses.
 */
public class emailValidater {
    
    /**
     * Validates an email address.
     * 
     * @param email The email address to be validated.
     * @return true if the email address is valid, false otherwise.
     */
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }

        int atSymbolIndex = email.indexOf("@");
        int dotSymbolIndex = email.lastIndexOf(".");

        if (atSymbolIndex > 0 && dotSymbolIndex > atSymbolIndex) {
            return true;
        } else {
            return false;
        }
    }
}