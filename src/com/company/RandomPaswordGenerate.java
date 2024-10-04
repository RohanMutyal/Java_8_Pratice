package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RandomPaswordGenerate {

    public static void main(String[] args) {
        // Generate a random password
        String password = generatePassword(8);
        System.out.println("Generated Password: " + password);
    }

    private static String generatePassword(int length) {
        if (length < 4) {
            throw new IllegalArgumentException("Password length should be at least 4 to meet all the criteria.");
        }

        // Define the character sets
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=<>?";

        // Create a SecureRandom instance
        SecureRandom random = new SecureRandom();

        // Generate one random character from each set
        char upperCaseLetter = upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length()));
        char lowerCaseLetter = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        char digit = digits.charAt(random.nextInt(digits.length()));
        char specialCharacter = specialCharacters.charAt(random.nextInt(specialCharacters.length()));

        // Create a list to hold all characters of the password
        List<Character> passwordChars = new ArrayList<>();
        passwordChars.add(upperCaseLetter);
        passwordChars.add(lowerCaseLetter);
        passwordChars.add(digit);
        passwordChars.add(specialCharacter);

        // Fill the rest of the password length with random characters from all sets
        String allAllowedChars = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;
        for (int i = 4; i < length; i++) {
            passwordChars.add(allAllowedChars.charAt(random.nextInt(allAllowedChars.length())));
        }

        // Shuffle the list to ensure random order
        Collections.shuffle(passwordChars, random);

        // Convert the list to a string
        StringBuilder password = new StringBuilder();
        for (char c : passwordChars) {
            password.append(c);
        }

        return password.toString();
    }
}




