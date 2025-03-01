package Sections.Section9.Slide122;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallange {

    public static void main(String[] args) {

        Random random = new Random();
        int arr[] = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
