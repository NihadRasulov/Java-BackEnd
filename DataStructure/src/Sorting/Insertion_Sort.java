package Sorting;

public class Insertion_Sort {


    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
    }


    public static void main(String[] args) {

        int []arr = new int[]{7,2,9,3,1};
        insertionSort(arr);
    }
}
