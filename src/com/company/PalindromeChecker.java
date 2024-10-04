package com.company;

import java.io.Serializable;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;

public class PalindromeChecker extends Exception implements Serializable, Cloneable {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove any non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int length = str.length();

        // Use a for loop to compare characters from both ends
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
