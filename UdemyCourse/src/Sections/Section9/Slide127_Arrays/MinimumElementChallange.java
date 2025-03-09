package Sections.Section9.Slide127_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallange {

    public static void main(String[] args) {
        int [] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedValue = findMin(returnedArray);
        System.out.println("Minimum element is " + returnedValue);
    }

    public static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        String n = sc.nextLine();
        String[] arr = n.split(",");
        int [] value = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            value[i] = Integer.parseInt(arr[i].trim());
        }
        return value;
    }

    public static int findMin(int [] array) {

        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
