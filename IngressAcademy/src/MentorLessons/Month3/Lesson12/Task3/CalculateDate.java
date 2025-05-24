package MentorLessons.Month3.Lesson12.Task3;

import java.time.LocalDate;
import java.time.Period;

public class CalculateDate {
    public static void main(String[] args) {

        LocalDate myDate = LocalDate.of(2006,7,12);

        Period period = Period.between(myDate,LocalDate.now());
        System.out.println(period);
        System.out.println("Year: " + period.getYears());
        System.out.println("Month: " + period.getMonths());
        System.out.println("Day: " + period.getDays());
    }

}
