package com.company;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberDivisionBy {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 21, 74, 49);
// Filter numbers divisible by 7 and collect them into a list
        List<Integer> result = list.stream().filter(number -> number % 7 == 0).collect(Collectors.toList());
// Print the numbers divisible by 7
        System.out.println("Numbers divisible by 7:");
        result.forEach(num -> System.out.println(num));
    }
}