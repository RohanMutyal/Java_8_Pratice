package com.company;

public class StringReversal {
    public static void main(String[] args) {
        // Example input string
        String input = "Hello, World!";
        System.out.println("Original String: " + input);


        // Reverse the string using a char array
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Initialize two pointers
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from the two ends of the array until the pointers meet in the middle
        while (left < right) {
            // Swap the characters at left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards the middle
            left++;
            right--;
        }

        // Convert the char array back to a string and return
        return new String(charArray);
    }
}

