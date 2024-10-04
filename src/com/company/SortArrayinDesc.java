package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayinDesc {

    public static void main(String[] args) {

        int[] array = {5, 2, 9, 1, 7};

        // Sorting the array in descending order using Java 8
        int[] sortedArray = Arrays.stream(array)
                .boxed()  // Convert int to Integer
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                //.sorted(Comparator.naturalOrder())
                .mapToInt(Integer::intValue)  // Convert Integer back to int
                .toArray(); // Collect into an array

        // Printing the sorted array
        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(sortedArray));
    }
}
