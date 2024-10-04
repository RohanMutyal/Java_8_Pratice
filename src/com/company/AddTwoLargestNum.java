package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddTwoLargestNum {
    public static BigInteger addTwoLargest(List<BigInteger> numbers) {
        // Check if the list has at least two elements
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("List must have at least two numbers");
        }

        // Sort the list in descending order
        Collections.sort(numbers, Collections.reverseOrder());

        // Return the sum of the two largest numbers
        return numbers.get(0).add(numbers.get(1));
    }

    public static void main(String[] args) {
        // Example usage:
        List<BigInteger> numbers = Arrays.asList(
                new BigInteger("123456789012345678901234567890123456789012345678901234567890"),
                new BigInteger("987654321098765432109876543210987654321098765432109876543210"),
                new BigInteger("111111111111111111111111111111111111111111111111111111111111")
        );

        BigInteger result = addTwoLargest(numbers);
        System.out.println("Sum of the two largest numbers: " + result);
    }
}

