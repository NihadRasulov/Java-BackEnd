package MentorLessons.Month4.Lesson16.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<Character,Operation> map = new HashMap<>();
        map.put('+',(a, b) -> a+b);
        map.put('-',(a, b) -> a-b);
        map.put('*',(a, b) -> a*b);
        map.put('/',(a, b) -> a/b);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the operation: ");
        char operation = scanner.next().charAt(0);
        System.out.print("Please enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Please enter the second number: ");
        double number2 = scanner.nextDouble();

        if (map.containsKey(operation)){
            if (map.containsKey('/') && number2 == 0){
                System.out.println("0-a bolme ola bilmez");
            }
            else {
                System.out.println( map.get(operation).operate(number1,number2));
            }
        }
        else {
            System.out.println("There is no such character");
        }
    }
}
