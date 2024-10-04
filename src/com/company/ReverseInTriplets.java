package com.company;



class ReverseInTriplets{
    public static void main(String[] args) {
        // Example input array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println("Original Array: ");
        printArray(array);

        // Reverse the array in sets of three elements
        reverseInTriplets(array);

        System.out.println("Reversed in Triplets Array: ");
        printArray(array);
    }

    public static void reverseInTriplets(int[] array) {
        // Traverse the array in steps of 3
        for (int i = 0; i < array.length; i += 3) {
            int end = Math.min(i + 2, array.length - 1);
            reverseSubArray(array, i, end);
        }
    }

    // Helper method to reverse a subarray from start to end indices
    public static void reverseSubArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

