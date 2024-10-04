package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RhymingPairs {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> words = new ArrayList<>();
        words.add("abcd");
        words.add("java");
        words.add("dcba");
        words.add("ajav");
        words.add("xyz");
        words.add("epam");
        words.add("pame");
        words.add("aepm");

        // Find rhyming pairs (anagrams) using Stream API
        Map<String, List<String>> groupedAnagrams = words.stream()
                .collect(Collectors.groupingBy(RhymingPairs::sortedChars));

        // Print rhyming pairs
        System.out.println("Rhyming pairs (anagrams):");
        groupedAnagrams.values().stream()
                .filter(list -> list.size() > 1)
                .forEach(list -> System.out.println(list));
    }

    // Helper method to return the sorted character representation of a string
    private static String sortedChars(String word) {
        char[] chars = word.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}
