package StaticUtilOrHelperMethod;

public class MathUtils {

    // Find the maximum of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Calculate factorial of a number
    public static long factorial(int num) {
        if (num < 0) throw new IllegalArgumentException("Number must be non-negative.");
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
