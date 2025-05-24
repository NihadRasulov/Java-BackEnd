package MentorLessons.Month3.Lesson12.Demo;

public sealed class Animal permits Dog, Cat {
    public void animal() {
        System.out.println("Animal Class");
    }
}
