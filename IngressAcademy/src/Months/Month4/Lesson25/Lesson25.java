package Months.Month4.Lesson25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lesson25 {

    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        strings.add("F");
        Iterator<String> iterator = strings.iterator();
        if (iterator.hasNext()) {
            iterator.next();
            iterator.next();
            iterator.remove();
        }
        System.out.println(strings);
    }
}