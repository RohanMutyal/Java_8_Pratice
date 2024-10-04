package com.company;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class

CharOccrenceFromString {

    public static void main(String[] args) {
        String str = "Rohan Dattatraya Mutyal";

        // Convert the string to a character stream, then collect into a map counting occurrences of each character
        Map<Character, Long> occurrences = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print each character and its occurrence count
        System.out.println("Character Occurrences:");
        occurrences.forEach((character, count) -> System.out.println(character + ": " + count));
    }
}
