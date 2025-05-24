package Tasks.Task8;

import java.time.LocalTime;
import java.time.ZoneId;

public class Task2 {

    public static void main(String[] args) {


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime1 = LocalTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(localTime1);
    }
}
