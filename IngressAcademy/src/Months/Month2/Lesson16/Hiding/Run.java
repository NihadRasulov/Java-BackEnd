package Months.Month2.Lesson16.Hiding;

public class Run {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Eagle eagle = new Eagle();
        Bird bird_Eagle = new Eagle();

//        System.out.println(bird.voise());
//        System.out.println(eagle.voise());
//        System.out.println(bird_Eagle.voise());

        bird.makeVoseBird();
        eagle.makeVoseEagle();
        bird_Eagle.makeVoseBird();
    }
}
