package MentorLessons.Lesson8.Task;

public class Run {

    public static void main(String[] args) {

//        System.out.println(TransportType.QATAR.calculateCost(100));
        for (TransportType value:TransportType.values()) {
            System.out.println("Transport Type: " + value + " transport cost in 100 km: " + value.calculateCost(100));
        }

    }
}
