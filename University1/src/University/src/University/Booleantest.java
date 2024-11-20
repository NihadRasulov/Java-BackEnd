package University.src.University;

import java.util.Scanner;

public class Booleantest {
  public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter your name: ");
            String name1 = sc.next();

            System.out.print("Please enter your age: ");
            int age1 = sc.nextInt();

            System.out.println("If you are student please say Yes: ");
            String oxuyur1 = sc.next();
            boolean oxuyur2 = oxuyur1.equals("Yes");

            Solider1 esger = new Solider1();
            esger.getName(name1);
            esger.setage(age1,oxuyur2);
        }
    }

    class Solider1 {

        String name;
        int age;
        String oxuyur1;

        public String getName(String name1) {
            return name1;
        }

        void setage(int age1, boolean oxuyur2) {
            if (age1 < 18) {
                System.out.println("You can not go to military.Because your age is: " + age1);
            }
            else if (age1 >= 18 && age1 < 35 && oxuyur2 != false) {
                System.out.println("You can go to military.Because your age is: " + age1);
                System.out.println("And your  is: " + oxuyur1);
            }
            else if (age1 >= 18 && age1 < 35 && oxuyur2 == true) {
                System.out.println("You can not go to military.Because your age is: " + age1);
                System.out.println("And you are a student");
            } else {
                System.out.println("You have done your military because your age is: " + age1);

            }
        }
    }
