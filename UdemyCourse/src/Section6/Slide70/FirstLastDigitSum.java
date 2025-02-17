package Section6.Slide70;

public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(-1234));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        else {
            int firstDigit;
            int lastDigit;
            int sum;

            lastDigit = number%10;

            while (number >=10) {
                number = number/10;
            }
            firstDigit =  number;

            sum = firstDigit + lastDigit;
            return sum;
        }
    }
}
