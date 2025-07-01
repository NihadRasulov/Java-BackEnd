package adventofcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        try {
            List<String> lines = Files.readAllLines(Paths.get("C:\\Java\\Task2.txt"));
                String [] parts;
                long count = 0;
            for (String line : lines) {
                if (line.trim().isEmpty()) continue;

                parts = line.trim().split(" ");

                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < parts.length; i++) {
                    list.add(Integer.parseInt(parts[i]));
                }

//                boolean increasing = true;
//                boolean decreasing = true;
//
//                for (int i = 0; i < list.size() - 1; i++) {
//                    int diff = list.get(i + 1) - list.get(i);
//
//                    if (diff < 1 || diff > 3) {
//                        increasing = false;
//                    }
//                    if (diff > -1 || diff < -3) {
//                        decreasing = false;
//                    }
//                }
//                if (increasing || decreasing) {
//                    System.out.println("Safe");
//                    count+=1;
//                }
                if (isSafe(list)) {
                    count+=1;
                }else{
                    if (checkSafety(list)){
                        count+=1;
                    }
                }
            }
            System.out.println(" the count is : " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean isSafe(List<Integer> list) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            int diff = list.get(i + 1) - list.get(i);

            if (diff < 1 || diff > 3) {
                increasing = false;
            }
            if (diff > -1 || diff < -3) {
                decreasing = false;
            }
        }
        if (increasing || decreasing) {
            return true;
        }
        return false;
    }

    // Main method to check original and "remove one element" scenarios
    public static boolean checkSafety(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            List<Integer> modified = new ArrayList<>(list);
            modified.remove(i);
            if (isSafe(modified)) {
                return true;
            }
        }

        return false;
    }

}
