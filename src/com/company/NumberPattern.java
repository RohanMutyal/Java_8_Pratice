package com.company;

public class NumberPattern {
    public static void main(String[] args) {
        int number = 1; // Initialize the starting number

        for (int i = 1; i <= 4; i++) { // Loop for 3 lines
            for (int j = 1; j <= i; j++) { // Loop for numbers in each line
                System.out.print(number + " ");
                number++; // Increment the number
            }
            System.out.println(); // Move to the next line
        }
    }
}

