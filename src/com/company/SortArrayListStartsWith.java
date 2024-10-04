package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayListStartsWith {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(19,1282,251,1967,13,51,17675,15,188,8853,24);

        // Find numbers starting with '1' using Stream API
        List<Integer> numbersStartingWithOne = numbers.stream()
                .filter(num -> Integer.toString(num).startsWith("1"))
                .collect(Collectors.toList());

        // Print the numbers starting with '1'
        System.out.println("Numbers starting with '1':");
        numbersStartingWithOne.forEach(System.out::println);
    }
}
