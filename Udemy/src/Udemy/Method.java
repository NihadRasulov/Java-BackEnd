package Udemy;

public class Method {

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }
    public static String name(String name1, String name2) {
        return name1 + " " + name2;
    }
    public static boolean number(int number1) {
        if (number1 % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }
    public static String greeting(String name) {
        return String.format("Hello %s, Welcome to Java", name);
    }

    public static void main(String[] args) {
        greet("World");
        greet("World");
        System.out.println(name("Hello", "World"));
        System.out.println("Is number even? " + number(2));
        System.out.println("Is number even? " + number(5));
        System.out.println("Is number even? " + number(14));

        System.out.println(greeting("Nihad"));

    }
}
