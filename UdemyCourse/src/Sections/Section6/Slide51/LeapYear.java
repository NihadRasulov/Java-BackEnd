package Sections.Section6.Slide51;

public class LeapYear {

    public static void main(String[] args) {
        isLeapYear(2400);
    }
    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9_999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            }
            else {
                if (year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        else {
            return false;
        }
    }


}