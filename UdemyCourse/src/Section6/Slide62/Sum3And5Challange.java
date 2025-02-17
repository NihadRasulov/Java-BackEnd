package Section6.Slide62;

public class Sum3And5Challange {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i=1;i<=1000;i++) {
            if (i%15 == 0) {
                count++;
                System.out.println("Found number " + i);
                sum += i;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("The sum = " + sum);
    }
}
