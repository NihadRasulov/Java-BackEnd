package MentorLessons.Lesson1;

import java.util.Scanner;
public class IfElse {

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        System.out.print("Please enter the day: ");
        String day1  = st.next();

        if(day1.equals("monday")) {
            System.out.println("Today is Monday");
        }
        else if (day1.equals("tuesday")) {
            System.out.println("Today is Tuesday");
        }
        else if (day1.equals("wednesday")) {
            System.out.println("Today is Wednesday");
        }
        else if (day1.equals("thursday")) {
            System.out.println("Today is Thursday");
        }
        else if (day1.equals("friday")) {
            System.out.println("Today is Friday");
        }
        else if (day1.equals("saturday")) {
            System.out.println("Today is Saturday");
        }
        else if (day1.equals("sunday")) {
            System.out.println("Today is Sunday");
        }
        else {
            System.out.println("Error");
        }
    }
}
