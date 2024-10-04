package com.company;
import java.util.*;

public class OccurenceOfEachElementAndCount {

    public static void main(String[] args) {
        // Create a list of elements
        List<Integer> list = Arrays.asList(1,2,1,2,3,4,5,2,4,5,1,2);

        // Get the occurrences of each element
        Map<Integer, Integer> occurrences = getElementOccurrences(list);

        // Print the occurrences
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<Integer, Integer> getElementOccurrences(List<Integer> elements) {
        // Create a HashMap to store the occurrences
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Traverse through the list
        for (Integer element : elements) {
            // If the element is already in the map, increment its count
            if (occurrences.containsKey(element)) {
                occurrences.put(element, occurrences.get(element) + 1);
            } else {
                // Otherwise, add the element to the map with count 1
                occurrences.put(element, 1);
            }
        }

        return occurrences;
    }
}

