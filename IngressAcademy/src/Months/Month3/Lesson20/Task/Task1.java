package Months.Month3.Lesson20.Task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task1 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        today = today.plusDays(10).minusMonths(2);

        LocalTime currentTime = LocalTime.now();
        currentTime = currentTime.plusHours(2).plusMinutes(45);
        currentTime = currentTime.minusMinutes(30);

        LocalDateTime time = LocalDateTime.of(today,currentTime);
        System.out.println(time);
    }
}
