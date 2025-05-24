package MentorLessons.Month4.Lesson14;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static <T> void printsArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.println(element);
        }
    }

    public static <T> T getFirstElement(List<T> list) {
        return list.getFirst();
    }


    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 3, 5};
        printsArray(arr);
        List<String> list = new ArrayList<>();
        list.add("Salam");
        list.add("Hello");
        list.add("Salam");
        System.out.println(getFirstElement(list));


    }
}
