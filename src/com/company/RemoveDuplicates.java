package com.company;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        // LinkedHashSet maintains insertion order and removes duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        // Convert set to string
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }
}
