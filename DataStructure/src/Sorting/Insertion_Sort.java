package Sorting;

public class Insertion_Sort {


    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];  // Element to be inserted
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than key
            // one step ahead
            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;  // Insert the key at the correct position
        }
    }


    public static void main(String[] args) {

        int []arr = new int[]{7,2,9,3,1};
        insertionSort(arr);
    }
}
