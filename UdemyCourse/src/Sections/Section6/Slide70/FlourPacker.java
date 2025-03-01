package Sections.Section6.Slide70;

public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(2, 1, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int totalBigWeight = bigCount * 5;

        if (totalBigWeight >= goal) {
            int remaining = goal % 5;
            if (smallCount >= remaining) {
                return true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                return true;
            }
        }
        return false;
    }
}
