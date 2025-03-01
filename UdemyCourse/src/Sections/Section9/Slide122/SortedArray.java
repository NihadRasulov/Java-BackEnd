package Sections.Section9.Slide122;

import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {

    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i=0; i<array.length; i++) {
            System.out.print("Please enter array's " + i + " index value: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = Arrays.copyOf(array, array.length);
//        boolean check = true;
//        while (check) {
//            check = false;
//            for (int i=0; i<sortedArray.length-1; i++) {
//                if (sortedArray[i] < sortedArray[i+1]) {
//                    int origin = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = origin;
//                    check = true;
//                }
//            }
//        }

        for (int i = 0; i < array.length / 2; i++) {
            int origin = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = origin;
        }
        return array;
    }

    public static void main(String[] args) {


        printArray(getIntegers(7));
        System.out.println(Arrays.toString(sortIntegers(getIntegers(7))));
    }
}
