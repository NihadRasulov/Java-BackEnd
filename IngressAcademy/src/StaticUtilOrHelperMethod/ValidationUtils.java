package StaticUtilOrHelperMethod;

public class ValidationUtils {

    // Validate email format (basic regex)
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && email.matches(emailRegex);
    }

    // Validate if a string contains only digits
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    // Validate password strength (min 8 chars, at least 1 letter and 1 number)
    public static boolean isStrongPassword(String password) {
        return password != null && password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
    }
}
