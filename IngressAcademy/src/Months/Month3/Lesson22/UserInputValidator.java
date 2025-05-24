package Months.Month3.Lesson22;

import java.util.Scanner;

public class UserInputValidator {

    static Scanner input = new Scanner(System.in);

    public static String promptForName(Scanner input) {
        while (true) {
            System.out.print("Please enter your name: ");
            String name = input.next();
            try {
                validateName(name);
                return name;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void validateName(String name) throws IllegalArgumentException {
        if (name.length() <= 3) {
            throw new IllegalArgumentException("Name length must be greater than 3");
        }
    }


    public static int promptForAge(Scanner input) {
        while (true) {
            System.out.print("Please enter your age: ");
            String age = input.next();
            try {
                return validateAge(age);
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int validateAge(String age) throws NumberFormatException {
        int age1 = Integer.parseInt(age);
        if (age1 < 0 || age1 > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        } else {
            return age1;
        }
    }

    public static String promptForPassword(Scanner input) {
        while (true) {
            System.out.print("Please enter your password: ");
            String password = input.next();
            try {
                validatePassword(password);
                return password;
            } catch (InvalidPasswordException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

    public static void validatePassword(String password) {

        if (password.length() < 6 || !password.contains("0") && !password.contains("1") && !password.contains("2") &&
                !password.contains("3") && !password.contains("4") && !password.contains("5") && !password.contains("6") &&
                !password.contains("7") && !password.contains("8") && !password.contains("9")) {
            throw new InvalidPasswordException("Password length must greater than 6 and must at least one number");
        }

    }

    public static void main(String[] args) {

        System.out.println(promptForName(input));
        System.out.println(promptForAge(input));
        System.out.println(promptForPassword(input));

    }

}

