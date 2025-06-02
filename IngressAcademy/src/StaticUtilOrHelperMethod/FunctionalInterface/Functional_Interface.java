package StaticUtilOrHelperMethod.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional_Interface {

    public static void main(String[] args) {
        Predicate<String> predicate = string -> string.length() % 2 == 0;  // Predicate have one value and return boolean
        Consumer<Integer> consumer = integer -> System.out.println(integer); // Consumer have one value and no return so mean void
        Function<String, Integer> function = string -> string.length(); // Function take two type and first is value and second is return type
        Supplier<Integer> supplier = () -> 2; // Supplier has no value and has return type
    }
}
