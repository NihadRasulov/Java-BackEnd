package University.src.University.Task;

import java.util.Scanner;

public class GetAndSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name1 = sc.next();

        System.out.print("Please enter your surename: ");
        String surename1 = sc.next();

        System.out.print("Please enter your age: ");
        int age1 = sc.nextInt();

        Solider esger = new Solider();

        System.out.println(esger.getName(name1,surename1));
        esger.setage(age1);
    }
}

class Solider{

    String name;
    String surename;
    int age;

    public String getName(String name1, String surename1) {
        return  "Your full name is: " + name1 + " " + surename1;
    }

     void setage(int age1) {

         if(age1 < 18){
             System.out.println("You can not go to military.Because your age is: " + age1);
         }
         else if(age1 >= 18 && age1 < 35 ){
             System.out.println("You can go to military.Because your age is: " + age1);
         }
         else if(age1 >= 18 && age1 < 35){
             System.out.println("You can not go to military.Because your age is: " + age1);
             System.out.println("And you are a student");
         }
         else {
             System.out.println("You have done your military because your age is: " + age1);
         }
    }
}
