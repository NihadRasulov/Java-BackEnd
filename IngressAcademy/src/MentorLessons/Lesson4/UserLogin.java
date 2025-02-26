package MentorLessons.Lesson4;

import java.util.Scanner;

public class UserLogin {


    public static void main(String[] args) {

//        String username = "Nihad";
//        String password = "1234";
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter your name: ");
//        String name = sc.nextLine();
//        System.out.print("Please enter your password: ");
//        String password1 = sc.nextLine();
//
//        boolean isValid = true;
//        while (isValid) {
//            if (name.equals(username) && password1.equals(password)) {
//                System.out.println("You have successfully logged in!");
//                isValid = false;
//            } else if (!name.equals(username)) {
//                System.out.println("Username do not match!");
//                System.out.print("Please enter name again: ");
//                name = sc.next();
//            } else if (!password1.equals(password)) {
//                System.out.println("Password do not match!");
//                System.out.print("Please enter password again: ");
//                password1 = sc.next();
//            } else {
//                System.out.println("Username do not match!");
//                System.out.println("Password do not match!");
//                System.out.print("Please enter name again: ");
//                name = sc.next();
//                System.out.print("Please enter password again: ");
//                password1 = sc.next();
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter money to change: ");
        int money = sc.nextInt();
        String result = money>=100 ? "You change money EUR from USD is: " + money*0.9 : "You change money EUR from USD is: " + money;

        System.out.println(result);
    }
}
