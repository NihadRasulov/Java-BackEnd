package Tasks.Task8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task4 {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate localDate = LocalDate.now().plusDays(100);
        System.out.println(localDate.format(dateTimeFormatter));
    }
}
