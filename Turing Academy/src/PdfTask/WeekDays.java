package PdfTask;

import java.util.Scanner;

public class WeekDays {

        public static void main(String[] args) {

            String[][] schedule = new String[7][2];
            schedule[0][0] = "Sunday";
            schedule[0][1] = "do home work";
            schedule[1][0] = "Monday";
            schedule[1][1] = "go to courses; watch a film";
            schedule[2][0] = "Tuesday";
            schedule[2][1] = "go to the gym";
            schedule[3][0] = "Wednesday";
            schedule[3][1] = "read a book";
            schedule[4][0] = "Thursday";
            schedule[4][1] = "attend a meeting";
            schedule[5][0] = "Friday";
            schedule[5][1] = "complete assignments";
            schedule[6][0] = "Saturday";
            schedule[6][1] = "go shopping";

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Please, input the day of the week: ");
                String input = scanner.nextLine().trim().toLowerCase(); // Trim and convert input to lowercase

                if (input.equals("exit")) {
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                }

                if (input.startsWith("change") || input.startsWith("reschedule")) {
                    String[] parts = input.split(" ", 2);
                    if (parts.length == 2) {
                        String dayToChange = parts[1].trim();
                        int index = getDayIndex(dayToChange, schedule);

                        if (index != -1) {
                            System.out.print("Please, input new tasks for " + schedule[index][0] + ": ");
                            String newTasks = scanner.nextLine();
                            schedule[index][1] = newTasks;
                            System.out.println("Tasks for " + schedule[index][0] + " have been updated.");
                            continue;
                        } else {
                            System.out.println("Sorry, I don't understand you, please try again.");
                            continue;
                        }
                    } else {
                        System.out.println("Invalid format. Please specify a day of the week to change tasks.");
                        continue;
                    }
                }

                int dayIndex = getDayIndex(input, schedule);
                if (dayIndex != -1) {
                    System.out.println("Your tasks for " + schedule[dayIndex][0] + ": " + schedule[dayIndex][1]);
                } else {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
            }
        }
        private static int getDayIndex(String day, String[][] schedule) {
            for (int i = 0; i < schedule.length; i++) {
                if (schedule[i][0].equalsIgnoreCase(day)) {
                    return i;
                }
            }
            return -1;
        }
}