package Months.Month1.Lesson1;

import java.util.Scanner;

public class MyFirstProgram {

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        System.out.print("Please enter the day: ");
        String day1  = st.next();

        if(day1 == "monday") {
            System.out.println("Today is Monday");
        }
        else if (day1 == "tuesday") {
            System.out.println("Today is Tuesday");
        }
        else if (day1 == "wednesday") {
            System.out.println("Today is Wednesday");
        }
        else if (day1 == "thursday") {
            System.out.println("Today is Thursday");
        }
        else if (day1 == "friday") {
            System.out.println("Today is Friday");
        }
        else if (day1 == "saturday") {
            System.out.println("Today is Saturday");
        }
        else if (day1 == "sunday") {
            System.out.println("Today is Sunday");
        }
        else {
            System.out.println("Error");
        }
    }
}
