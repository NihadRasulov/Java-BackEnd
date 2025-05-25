package Tasks.Task10;

import java.util.Arrays;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Rovshan", "Nihad", "Subhan", "Nicat", "Ali", "Ad");

        System.out.println(list.stream().filter(string -> string.length() > 3).count());

    }
}
