package Months.Month3.Lesson20.Task;

import java.time.LocalDateTime;

public class Task2 {

    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        time = time.plusWeeks(2).plusHours(5);
        time = time.minusYears(1).minusMonths(3).minusDays(15);
        System.out.println(time);

    }
}
