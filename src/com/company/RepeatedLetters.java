package com.company;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RepeatedLetters {
    public static void main(String[] args) {
        String input = "ABCDDEFEFGGH"; // Example input string
        Map<Character, Integer> repeatedLetters = findRepeatedLetters(input);
        System.out.println("Repeated letters:");
        repeatedLetters.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + " - " + value + " times");
            }
        });
    }

    public static Map<Character, Integer> findRepeatedLetters(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        if (str == null || str.isEmpty()) {
            return frequencyMap;
        }

       // str = str.toUpperCase(); // Convert to lowercase to handle both cases

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        return frequencyMap;
    }
}

