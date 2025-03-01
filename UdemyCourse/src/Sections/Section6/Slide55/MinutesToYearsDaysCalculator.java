package Sections.Section6.Slide55;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }
    public static void printYearsAndDays(long minutes) {

        if(minutes<0) {
            System.out.println("Invalid Value");
        }

        else {
            long day = minutes/1440;
            long year = day/365;
            long days = day % 365;
            System.out.println(minutes + "min = " + year + "y and " + days + "d");
        }
    }
}
