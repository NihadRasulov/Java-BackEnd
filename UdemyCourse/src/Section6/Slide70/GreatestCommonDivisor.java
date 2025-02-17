package Section6.Slide70;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(16,56));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int min = first < second ? first : second;
        int commonDivisor = 1;
        for (int i = 1; i <= min; i++) {
            if (first % i == 0 && second % i == 0) {
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }
}
