package Sections.Section6.Slide51;

public class BarkingDog {

    public static void main(String[] args) {

        shouldWakeUp(true,12);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}