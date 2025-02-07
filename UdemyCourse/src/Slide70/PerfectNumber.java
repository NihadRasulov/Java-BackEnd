package Slide70;

public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {
        if(number<1) {
            return false;
        }
        int sum=0;
        int divisor;
        int original = number;
        for (int i=1;i<number ;i++) {
            if(number%i == 0){
                divisor = i;
                sum+=divisor;
            }
        }
        if (original == sum) {
            return true;
        }
        else {
            return false;
        }
    }
}
