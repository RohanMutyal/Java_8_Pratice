package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 6, 7,5,4); // Sample list of numbers
        int target = 10; // Sample target sum

        System.out.println("Combinations that sum up to " + target + ":");
        findCombinations(numbers, target, new ArrayList<>(), 0);
    }

    public static void findCombinations(List<Integer> numbers, int target, List<Integer> combination, int index) {
        if (target == 0) {
            // Combination found
            System.out.println(combination);
            return;
        }
        if (target < 0 || index >= numbers.size()) {
            // Not a valid combination
            return;
        }

        // Include the current number
        List<Integer> combinationWithCurrent = new ArrayList<>(combination);
        combinationWithCurrent.add(numbers.get(index));
        findCombinations(numbers, target - numbers.get(index), combinationWithCurrent, index);

        // Exclude the current number
        findCombinations(numbers, target, combination, index + 1);
    }
}
