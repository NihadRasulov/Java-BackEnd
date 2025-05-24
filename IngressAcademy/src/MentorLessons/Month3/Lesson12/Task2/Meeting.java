package MentorLessons.Month3.Lesson12.Task2;

import java.time.LocalDate;

public class Meeting {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2025,5,1);
        for(int i = 0;i<5 ;i++ ){
            System.out.println(date);
            date = date.plusWeeks(3);
        }
    }
}
