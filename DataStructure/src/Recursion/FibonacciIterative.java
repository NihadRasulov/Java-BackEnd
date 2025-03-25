package Recursion;

public class FibonacciIterative {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int twoBefore = 0;
        int oneBefore = 1;
        int next;
        for (int i = 2; i <= n; i++) {
            next = oneBefore + twoBefore;
            twoBefore = oneBefore;
            oneBefore = next;
        }
        return oneBefore;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci of 5: " + fibonacci(5));
    }
}
