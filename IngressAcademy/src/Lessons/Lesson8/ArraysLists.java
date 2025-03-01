package Lessons.Lesson8;

import java.util.Arrays;

public class ArraysLists {

    public static void main(String[] args) {

        String [] arr = new String[5];
        Arrays.fill(arr, "Hello");
        System.out.println(Arrays.toString(arr));

    }
    public void check() {
        System.out.println("This is a test");
    }
}
class NewClass extends ArraysLists {
    public static void main(String[] args) {

        NewClass obj = new NewClass();
        obj.check();
    }
    @Override
    public void check() {
        System.out.println("This is a NewClass test");
    }
}