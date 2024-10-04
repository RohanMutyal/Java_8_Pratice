package com.company;

public class MaxElementArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        try {
            int maxElement = getMaxElement(array);
            System.out.println("The maximum element in the array is: " + maxElement);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getMaxElement(int[] array) {
        // Check if the array is empty
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        // Initialize maxElement to the first element of the array
        int maxElement = array[0];

        // Loop through each element in the array
        for (int i = 1; i < array.length; i++) {
            // Update maxElement if the current element is greater
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }
}

