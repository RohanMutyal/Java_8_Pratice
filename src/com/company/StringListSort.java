package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StringListSort {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some strings to the list
        stringList.add("Rohan");
        stringList.add("Prashant");
        stringList.add("Rahul");
        stringList.add("Date");
        stringList.add("Elderberry");

        // Sort the list in ascending order
        Collections.sort(stringList);

        // Check if the list has at least 2 elements
        if (stringList.size() >= 2) {
            // Get the second string from the list
            String secondString = stringList.get(1);
            System.out.println("The second string in the sorted list is: " + secondString);
        } else {
            System.out.println("The list does not have enough elements.");
        }
    }
}
