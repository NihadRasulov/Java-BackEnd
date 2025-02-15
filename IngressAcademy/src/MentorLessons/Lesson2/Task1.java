package MentorLessons.Lesson2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Please enter your name: ");
        person.name = sc.nextLine();
        System.out.print("Please enter your budget: ");
        person.budget = sc.nextInt();
        System.out.print("Please enter your priority: ");
        person.priority = sc.nextInt();

        Person person2 = new Person();
        System.out.print("Please enter your name: ");
        person2.name = sc.next();
        System.out.print("Please enter your budget: ");
        person2.budget = sc.nextInt();
        System.out.print("Please enter your priority: ");
        person2.priority = sc.nextInt();

        Order order = new Order();
        order.name = "Computer";
        order.price = 200;

        if (person.budget == person2.budget && person.budget > order.price) {
            if (person.priority > person2.priority) {
                System.out.println(person.name + " has budget $" + person.budget);
            }
            else {
                System.out.println(person2.name + " has priority $" + person2.priority);
            }

        }
        else if (person.priority == person2.priority) {
            if (person.budget > person2.budget && person.budget>order.price) {
                System.out.println(person.name + " has budget $" + person.budget);
            }
            else {
                System.out.println(person2.name + " has priority $" + person2.priority);
            }
        }

    }
}
