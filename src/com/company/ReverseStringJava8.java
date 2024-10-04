package com.company;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringJava8 {

        public static void main(String[] args) {
            // Example input string
            String input = "Hello, World!";
            System.out.println("Original String: " + input);

            // Reverse the string using Stream API
            String reversed = reverseString(input);
            System.out.println("Reversed String: " + reversed);
        }

        public static String reverseString(String str) {
            // Convert the string to a stream of characters
            return IntStream.range(0, str.length())
                    .mapToObj(i -> str.charAt(str.length() - 1 - i))
                    .map(Object::toString)
                    .collect(Collectors.joining());
        }


}
