package Sorting;

public class Selection_Sort {

    public static void main(String[] args) {

        int [] array = {2,5,1,9,6};

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i; // Assume the first unsorted element is the smallest

            // Find the index of the smallest element in the remaining array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found smallest element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

    }
}
