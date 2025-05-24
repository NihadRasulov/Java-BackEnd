package Tasks.Task9;

import java.util.Arrays;
import java.util.TreeSet;

public class Task1 {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(5, 10, 15, 20, 25, 30));

        System.out.println(treeSet.subSet(10,25));
        System.out.println(treeSet.headSet(20));
        System.out.println(treeSet.tailSet(15));

    }
}
