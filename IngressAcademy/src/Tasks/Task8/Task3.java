package Tasks.Task8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Task3 {

    public static void main(String[] args) {


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(" EEEE, dd MMMM yyyy HH:mm");

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(localDateTime.format(dateTimeFormatter));
    }
}
