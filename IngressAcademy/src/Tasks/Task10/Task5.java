package Tasks.Task10;

import java.util.Optional;

public class Task5 {

    public static void main(String[] args) {

        String name = "Nihad";
        Optional<String> optional = Optional.ofNullable(name);
        optional.map(string -> string.length()).ifPresent(integer -> System.out.println(integer * integer));
    }
}
