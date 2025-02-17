package Section6.Slide70;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println("The even digit's sum is: " + getEvenDigitSum(1245872));
    }

    public static int getEvenDigitSum(int number) {
        if (number<0) {
            return -1;
        }
        else {
            int sum = 0;
            int digit;
            while(number!=0) {
                digit = number%10;
                number = number/10;

                if(digit%2 == 0) {
                    sum+=digit;
                }
            }
            return sum;
        }
    }
}
