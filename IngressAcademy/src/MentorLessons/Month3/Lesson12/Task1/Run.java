package MentorLessons.Month3.Lesson12.Task1;

import java.time.LocalDate;
import java.time.Period;

public class Run {
    public static void main(String[] args) {

        Book book1 = new Book("Book 1",5, LocalDate.of(2024,4,17));
        Book book2 = new Book("Book 2",8,LocalDate.of(2025,6,12));

        Period period = Period.between(book1.getCreationDate(),LocalDate.now());
        int year = period.getYears()*365;
        int month = period.getMonths()*30;
        int day = period.getDays();
        int total = year+month+day;
        book1.borc(total);

    }
}
