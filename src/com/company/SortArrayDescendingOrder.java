package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayDescendingOrder {
    public static void main(String[] args) {

        List<Double> decimals = Arrays.asList(3.14, 2.718, 1.618, 2.236, 1.414);

        // Sorting the list in descending order using Java 8 stream
        List<Double> sortedDecimals = decimals.stream()
                .sorted((d1, d2) -> Double.compare(d2, d1))
                .collect(Collectors.toList());


        // Printing the sorted list
        System.out.println("Sorted Decimals in Descending Order: " + sortedDecimals);
    }
}
