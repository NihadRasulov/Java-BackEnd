package Tasks.Task10;

import java.util.Map;

public class Task6 {

    public static void main(String[] args) {

        Map<String, String> map = Map.of("dev", "frontend",
                "db", "postgres");
        map.forEach((string, string2) -> {
            if (string2.contains("post")) {
                System.out.println("Key is: " + string + ", Value is: " + string2);
            }
        });
    }
}
