package com.company;

import java.util.*;

public class Keypad {

    // Mapping of digits to their corresponding characters on an old mobile keypad
    private static final Map<Character, String> keypadMapping = new HashMap<>();
    static {
        keypadMapping.put('2', "abc");
        keypadMapping.put('3', "def");
        keypadMapping.put('4', "ghi");
        keypadMapping.put('5', "jkl");
        keypadMapping.put('6', "mno");
        keypadMapping.put('7', "pqrs");
        keypadMapping.put('8', "tuv");
        keypadMapping.put('9', "wxyz");
    }

    // Recursive method to generate permutations
    private static List<String> generatePermutations(String digits) {
        if (digits == null || digits.isEmpty()) {
            System.out.println("empty digit");
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        generatePermutationsHelper(digits, 0, new StringBuilder(), result);
        return result;
    }

    private static void generatePermutationsHelper(String digits, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            System.out.println(result);
            return;
        }

        char digit = digits.charAt(index);
        String letters = keypadMapping.get(digit);
        if (letters != null) {
            for (char letter : letters.toCharArray()) {
                current.append(letter);
                generatePermutationsHelper(digits, index + 1, current, result);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }

    //main method ...
    public static void main(String[] args) {

        String digits = "2"; // Example digits
        List<String> permutations = generatePermutations(digits);

        // Print all permutations
        permutations.forEach(System.out::println);

    }
}
