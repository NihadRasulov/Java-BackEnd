package Section.Slide51;

public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(1,1,1);
    }

    public static boolean  hasEqualSum(int a, int b, int c) {
        if ((a+b) == c) {
            return true;
        }
        else {
            return false;
        }
    }
}
