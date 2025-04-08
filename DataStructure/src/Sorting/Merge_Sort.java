package Sorting;

import java.util.Arrays;

public class Merge_Sort {

    // Main method to test the merge sort
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Merge sort function
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;  // Base case: array is already sorted
        }

        int mid = arr.length / 2;  // Find the middle index
        int[] left = Arrays.copyOfRange(arr, 0, mid);  // Left half of the array
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);  // Right half of the array

        mergeSort(left);  // Recursively sort the left half
        mergeSort(right);  // Recursively sort the right half

        merge(arr, left, right);  // Merge the sorted halves
    }

    // Function to merge two sorted arrays into a single sorted array
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // If there are remaining elements in the left array
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // If there are remaining elements in the right array
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}

