package Tasks.Task8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task5 {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'saat' HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
