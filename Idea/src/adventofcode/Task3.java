package adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void main(String[] args) {


//        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Java\\Task3.txt"))) {
//            String line;
//            int lineNumber = 1;
//            long sum = 0;
//
//            while ((line = reader.readLine()) != null) {
//                Matcher matcher = pattern.matcher(line);
//                List<String> mulList = new ArrayList<>();
//                int lineSum = 0;
//
//                while (matcher.find()) {
//                    String match = matcher.group(0); // Full match, e.g., mul(123,456)
//                    int a = Integer.parseInt(matcher.group(1));
//                    int b = Integer.parseInt(matcher.group(2));
//                    mulList.add(match);
//                    lineSum += a * b;
//                }
//
//                if (!mulList.isEmpty()) {
//                    System.out.println("Line " + lineNumber + ": " + mulList);
//                    System.out.println("Line Sum: " + lineSum);
//                }
//                sum +=lineSum;
//                lineNumber++;
//                System.out.println("Total: " + sum);
//            }
//
//        }catch (IOException e){
//            e.getMessage();
//        }

        Pattern mulPattern = Pattern.compile("mul\\((\\d{1,3}),(\\d{1,3})\\)");
        Pattern controlPattern = Pattern.compile("do\\(\\)|don't\\(\\)");

        int totalSum = 0;
        int lineNumber = 1;
        boolean enabled = true; // 👈 persist across lines

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Java\\Task3.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                int lineSum = 0;
                List<String> validMuls = new ArrayList<>();

                // Combine all matches (control + mul) in one list
                List<Match> allMatches = new ArrayList<>();

                Matcher controlMatcher = controlPattern.matcher(line);
                while (controlMatcher.find()) {
                    allMatches.add(new Match(controlMatcher.start(), controlMatcher.group(), "control"));
                }

                Matcher mulMatcher = mulPattern.matcher(line);
                while (mulMatcher.find()) {
                    int x = Integer.parseInt(mulMatcher.group(1));
                    int y = Integer.parseInt(mulMatcher.group(2));
                    allMatches.add(new Match(mulMatcher.start(), mulMatcher.group(), "mul", x, y));
                }

                // Sort all matches by position in line
                allMatches.sort(Comparator.comparingInt(m -> m.index));

                // Process all in order
                for (Match m : allMatches) {
                    if (m.type.equals("control")) {
                        if (m.content.equals("do()")) {
                            enabled = true;
                        } else if (m.content.equals("don't()")) {
                            enabled = false;
                        }
                    } else if (m.type.equals("mul")) {
                        if (enabled) {
                            validMuls.add(m.content);
                            lineSum += m.x * m.y;
                        }
                    }
                }

                // Output result for this line
                if (!validMuls.isEmpty()) {
                    System.out.println("Line " + lineNumber + ": " + validMuls);
                    System.out.println("Line Sum (X * Y): " + lineSum);
                    totalSum += lineSum;
                }

                lineNumber++;
            }

            // Output final result
            System.out.println("\nTotal Sum of All Line Products: " + totalSum);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    // Helper class to hold match info
    static class Match {
        int index;
        String content;
        String type;
        int x = 0, y = 0;

        public Match(int index, String content, String type) {
            this.index = index;
            this.content = content;
            this.type = type;
        }

        public Match(int index, String content, String type, int x, int y) {
            this(index, content, type);
            this.x = x;
            this.y = y;
        }
    }
}
