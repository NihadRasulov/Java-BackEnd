package Sections.Section9.Slide127_Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int []arr = new int[]{1,2,3,4,5};
        int []reversedArray = new int[arr.length];
        int count = 0;
        while (count < arr.length) {
        for (int i = arr.length - 1; i >= 0; i--) {
                reversedArray[count] = arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
