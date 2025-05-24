package Tasks.Task8;

import java.time.Duration;
import java.time.LocalTime;

public class Task7 {

    public static void main(String[] args) {

        Duration duration = Duration.between(LocalTime.of(9,30),LocalTime.of(18,15));
        System.out.println(duration.getSeconds()/60);
    }
}
