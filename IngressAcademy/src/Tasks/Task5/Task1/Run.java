package Tasks.Task5.Task1;

public class Run {

    public static void main(String[] args) {

        for (WeekDay day:WeekDay.values()) {

            System.out.println(day + " is a work day or not? " + day.isWeekDay());
        }
    }
}
