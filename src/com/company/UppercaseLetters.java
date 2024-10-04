package com.company;

import java.util.stream.Collectors;

public class UppercaseLetters {
    public static void main(String[] args) {
        String input = "jjJAaavvVAaa";
        String result = removeLowercase(input);
        System.out.println("Uppercase letters only: " + result);
    }

    public static String removeLowercase(String input) {
        return input.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
