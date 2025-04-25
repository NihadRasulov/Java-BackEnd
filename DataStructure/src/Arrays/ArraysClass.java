package Arrays;

import java.util.Arrays;

public class ArraysClass {

    public static int[] increaseArraySize(int[] arr) {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int[] insertElement(int element, int position, int[] arr, int size) {
        if (size == arr.length) {
            arr = increaseArraySize(arr);
        }
        for (int i = size - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = element;
        return arr;
    }

    public static int findElement(int element, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int deleteElement(int[] arr, int element) {
        int index = findElement(element, arr);
        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        }
        return element;
    }

    public static void main(String[] args) {
            int [] arr = new int[]{5,10,20,25,30,35};

            insertElement(50,5,arr,4); // best case - O(1) --> insert at the end
                                                            // worst case - O(n)

        System.out.println(Arrays.toString(arr));
    }

}
