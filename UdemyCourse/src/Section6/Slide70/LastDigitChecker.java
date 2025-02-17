package Section6.Slide70;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(22,23,34));
        System.out.println(isValid(234));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        int lastDigita;
        int lastDigitb;
        int lastDigitc;
        lastDigita = a % 10;
        lastDigitb = b % 10;
        lastDigitc = c % 10;
        if (a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000) {
            return false;
        }
        else if (lastDigita == lastDigitb || lastDigita == lastDigitc || lastDigitb == lastDigitc) {
            return true;
        }
        else {
            return false;
        }
}

    public static boolean isValid(int number) {
        if(number<10 || number >1000) {
            return false;
        }
        else {
            return true;
        }
    }
}
