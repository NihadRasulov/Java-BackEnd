package Slide51;

public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.1234,3.1239));
    }

    public static boolean areEqualByThreeDecimalPlaces( double a, double b) {
        long anum = (long) (a*1000);
        long bnum = (long) (b*1000);
        if (a==b) {
            return true;
        }
        else if (anum==bnum) {
            return true;
        }
        else {
            return false;
        }
    }

//    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
//
//        long firstRounded = (long) (first * 1000);
//        long secondRounded = (long) (second * 1000);
//        return firstRounded == secondRounded;
//    }
}
