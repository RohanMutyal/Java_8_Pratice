package com.company;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ThirdHighestNumberFromString {
    public static void main(String[] args) {
        String value = "56834901";

        List<Integer> sortedNumbers = value.chars()
                .map(Character::getNumericValue) // Convert character to its numeric value
                .boxed() // Box each int to Integer
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .collect(Collectors.toList()); // Collect to a list

        if (sortedNumbers.size() < 3) {
            System.out.println("The string does not have at least 3 unique digits.");
        } else {
            // Get the 3rd highest unique number
            int thirdHighest = sortedNumbers.stream()
                    .distinct()
                    .skip(2)
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("No 3rd highest number found"));
            System.out.println("The 3rd highest number is: " + thirdHighest);
        }
    }
}
