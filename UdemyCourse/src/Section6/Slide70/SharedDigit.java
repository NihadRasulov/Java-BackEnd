package Section6.Slide70;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(15,55     ));
    }

    public static boolean hasSharedDigit(int a, int b) {
        int firstDigita, lastDigita;
        int firstDigitb, lastDigitb;

        firstDigita = a/10;
        lastDigita = a%10;

        firstDigitb = b/10;
        lastDigitb = b%10;
        if (a<10 || a>99 || b<10 || b>99) {
            return false;
        }
        else if( firstDigita == firstDigitb || firstDigita == lastDigitb || lastDigita == firstDigitb || lastDigita == lastDigitb) {
            return true;
        }
        else {
            return false;
        }
    }
}
