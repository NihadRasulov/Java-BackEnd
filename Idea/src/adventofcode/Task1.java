package adventofcode;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get("C:\\Java\\JavaFile.txt"));

            for (String line : lines) {
                if (line.trim().isEmpty()) continue;

                String[] parts = line.trim().split("   ");

                if (parts.length >= 2) {
                    listA.add(Integer.parseInt(parts[0]));
                    listB.add(Integer.parseInt(parts[1]));
                }
            }
            Collections.sort(listA);
            Collections.sort(listB);
            long count = 0;
            if (listA.size() == listB.size()) {
                for (int i = 0; i < listA.size(); i++) {
                    count += ((long) listA.get(i) * Collections.frequency(listB, listA.get(i)));
                }
            }
            if (listA.size() == listB.size()) {
                long totalDifference = 0;
                for (int i = 0; i < listA.size(); i++) {
                    int diff = Math.abs(listB.get(i) - listA.get(i));
                    totalDifference += diff;
                }
                System.out.printf("The sum of difference of lists is: " + totalDifference);
            }
            System.out.println("\nThe count of sum is : " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
