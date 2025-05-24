package Tasks.Task8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task6 {

    public static void main(String[] args) {

        String time = "20/07/2024";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(LocalDate.parse(time).format(formatter));

    }
}
