package Section6.Slide70;

public class NumberPolindrom {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-123321));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int lastDigit;
        int original = number;
        while (number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return reverse == original; // reverse == number this number different from firs number
    }
}
