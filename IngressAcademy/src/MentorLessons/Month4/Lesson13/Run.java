package MentorLessons.Month4.Lesson13;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {

    static final List<Event> EVENT_LIST = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addEvent();
    }

    public static void addEvent() {

        System.out.print("Please enter title: ");
        String title = scanner.nextLine();
        System.out.println("Please enter description: ");
        String description = scanner.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        boolean check = true;
        LocalDateTime localDateTime = null;
        Duration duration1 = null;
        while (check) {
            System.out.println("Please enter date and time: ");
            String dateTime = scanner.nextLine();
            try {
                localDateTime = LocalDateTime.parse(dateTime, formatter);
                check = false;
            } catch (DateTimeException e) {
                System.out.println("Please write like this 'dd-MM-yyyy HH:mm:ss'");
                System.out.println(e.getMessage());
            }
        }
        while (true){
            System.out.println("Please enter duration: ");
            String duration = scanner.nextLine();
            try {
                String[] arr = duration.trim().split(" ");
                if (duration.trim().length()>3){
                    throw new NumberFormatException("duration length must be 3");
                }

                if (arr[1].equals("h") || arr[1].equals("H")) {
                    duration1 = Duration.ofHours(Long.parseLong(arr[0]));
                    break;
                } else if (arr[1].equals("m") || arr[1].equals("M")) {
                    duration1 = Duration.ofMinutes(Long.parseLong(arr[0]));
                    break;
                }
            }catch (NumberFormatException ex){
                System.out.println(ex.getMessage());
            }
            catch (DateTimeParseException e) {
                System.out.println(e.getMessage());
            }
        }
        Event event = new Event(title,description,localDateTime,duration1);
        EVENT_LIST.add(event);
        System.out.println(EVENT_LIST);
    }
}






/*
 * add event method void
 * Scanner title description
 *
 * Date time pattern
 *
 * try catch
 * Duration
 *
 * */