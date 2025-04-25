package Tasks.Task6;

public class Run {

    public static void main(String[] args) {

        String story = StoryBuilder.builder().add("Hello, my name is Rovshan.").add("It's great to connect with you and discuss how we can work together.").build();
        System.out.println(story);
    }
}
