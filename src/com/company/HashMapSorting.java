package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSorting {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(4, "Four");
        hashMap.put(2, "Two");

        // Print the original HashMap
        System.out.println("Original HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Create a TreeMap to sort the HashMap by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(hashMap);

        // Print the sorted HashMap
        System.out.println("\nSorted HashMap:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



