package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveAlphabets {
    public static void main(String[] args) {
        String input = "ABCDDEFEFGGH"; // Example input string
        List<String> consecutiveAlphabets = findConsecutiveAlphabets(input);
        System.out.println("Consecutive alphabets: " + consecutiveAlphabets);
    }

    public static List<String> findConsecutiveAlphabets(String str) {
        List<String> result = new ArrayList<>();

        if (str == null || str.isEmpty()) {
            return result;
        }

        str = str.toUpperCase(); // Convert to lowercase to handle both cases

        StringBuilder consecutive = new StringBuilder();
        consecutive.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char prevChar = str.charAt(i - 1);

            if (currentChar - prevChar == 1) {
                consecutive.append(currentChar);
            } else {
                if (consecutive.length() > 1) {
                    result.add(consecutive.toString());
                }
                consecutive.setLength(0); // Clear the StringBuilder
                consecutive.append(currentChar);
            }
        }

        if (consecutive.length() > 1) {
            result.add(consecutive.toString());
        }

        return result;
    }
}
