package Tasks.Task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task3 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One","Two","Three");
        List<String> newList = list.stream().map(String::toUpperCase).toList();
        System.out.println(newList);
    }
}
