package com.company;

import java.util.ArrayList;
import java.util.List;

public class NumbersStartingWithOne {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(21);
        numbers.add(13);
        numbers.add(41);
        numbers.add(15);
        numbers.add(100);
        numbers.add(110);
        numbers.add(91);

        // Find numbers starting with '1' using a traditional approach
        List<Integer> numbersStartingWithOne = findNumbersStartingWithOne(numbers);

        // Print the numbers starting with '1'
        System.out.println("Numbers starting with '1':");
        for (Integer num : numbersStartingWithOne) {
            System.out.println(num);
        }
    }

    public static List<Integer> findNumbersStartingWithOne(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : numbers) {
            if (Integer.toString(num).startsWith("1")) {
                result.add(num);
            }
        }
        return result;
    }
}

