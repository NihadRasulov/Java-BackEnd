package Sorting;

import java.util.Arrays;
public class Counting_Sort {

    public static int[] countingSort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();  // Find maximum value
        int[] count = new int[max + 1];                  // Create counting array

        // Step 1: Count occurrences
        for (int number : array) {
            count[number]++;
        }

        // Step 2: Build the sorted output array
        int[] output = new int[array.length];
        int index = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < count[i]; j++) {
                output[index] = i;
                index++;
            }
        }

        return output;
    }

    public static void main(String[] args) {

        int [] array = {2,5,1,9,6};
        System.out.println(Arrays.toString(countingSort(array)));
    }
}
