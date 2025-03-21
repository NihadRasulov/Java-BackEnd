package StaticUtilOrHelperMethod;

public class StringUtils {

    // Reverse a string
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Check if a string is empty or null
    public static boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    // Capitalize the first letter of a string
    public static String capitalize(String input) {
        if (isEmpty(input)) return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}

