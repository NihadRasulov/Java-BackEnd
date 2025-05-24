package MentorLessons.Month1.Lesson3;

import java.util.Scanner;

public class Counter {
    int count;

    public int postIncrement() {
        return count++;
    }

    public int postDecrement() {
        return count--;
    }

    public int preIncrement() {
        return ++count;
    }

    public int preDecrement() {
        return --count;
    }


    public static void main(String[] args) {

        Counter counter = new Counter();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        counter.count = sc.nextInt();

        System.out.println( "Post Increment count is: "+ counter.postIncrement());
        System.out.println("Post Decrement count is:" + counter.postDecrement());
        System.out.println("Pre Increment count is:" + counter.preIncrement());
        System.out.println("Pre Decrement count is:" + counter.preDecrement());
    }
}
