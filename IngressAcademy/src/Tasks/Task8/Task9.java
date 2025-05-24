package Tasks.Task8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Task9 {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss Z");

        ZonedDateTime utcTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("UTC time: " + utcTime.format(formatter));

//        ZonedDateTime berlinTime = utcTime.withZoneSameInstant(ZoneId.of("Europe/Berlin"));

        ZonedDateTime berlinTime = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        String formattedBerlinTime = berlinTime.format(formatter);
        System.out.println("Berlin time: " + formattedBerlinTime);
    }
}
