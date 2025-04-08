package Sorting;

public class Bubble_Sort {

    public static void main(String[] args) {

        int [] array = {2,5,1,9,6};
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) { // Swap if needed
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, the list is already sorted
            if (!swapped) break;
        }

    }
}
