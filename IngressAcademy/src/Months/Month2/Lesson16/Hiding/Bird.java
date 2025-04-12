package Months.Month2.Lesson16.Hiding;

public class Bird {
    public static String voise() {
        return "Bird Singing";
    }

    public void makeVoseBird() {
        System.out.println("Bird Make voise " + voise());
    }
}

class Eagle extends Bird {
    public void makeVoseEagle() {
        System.out.println("Eagle Make voise " + voise() + super.voise());
    }

    public static String voise() {
        return "Eagle Cry";
    }
}