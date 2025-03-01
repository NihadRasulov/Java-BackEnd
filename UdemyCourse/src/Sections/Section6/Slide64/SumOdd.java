package Sections.Section6.Slide64;

public class SumOdd {

    public static void main(String[] args) {

        System.out.println(sumOdd(12,18));
    }

    public static boolean isOdd(int number) {
        if (number<0) {
            return false;
        }
        else if (number%2 == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum=0;
        if(end<start || start<0 || end<0 ) {
            return -1;
        }
        for (int i=start;i<=end;i++){
            if(isOdd(i) == true) {
                sum+=i;
            }
        }
        return sum;
    }
}
