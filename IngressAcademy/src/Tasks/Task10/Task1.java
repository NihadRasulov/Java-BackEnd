package Tasks.Task10;

import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        Map<String, Object> map = Map.of("Name","Nihad",
                                         "Surname","Rasulov",
                                         "Age",18,
                                         "Position","Software Engineer",
                                         "Phone Number","0100000000");

        map.forEach((string, o) -> System.out.println(string + " " + o));
    }
}
