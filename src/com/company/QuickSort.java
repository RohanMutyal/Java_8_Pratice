package com.company;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println("Original Array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        // Choose the rightmost element as pivot
        int pivot = array[high];

        // Pointer for the greater element
        int i = low - 1;

        // Traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                // If element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // Swap elements at i and j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the greater element at i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the partition point
        return i + 1;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
