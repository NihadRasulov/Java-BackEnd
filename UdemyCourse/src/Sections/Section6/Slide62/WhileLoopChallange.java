package Sections.Section6.Slide62;

public class WhileLoopChallange {

    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        while (num <= 20) {
            num++;
            if (isEvenNumber(num) == true) {
                count++;
                System.out.println("Even Number: " + num);
                if (count == 5) {
                    System.out.println("Found 5 Even Number");
                    break;
                }
            }
//            else if (num%2 != 0) {
//                System.out.println("Odd Number: " + num);
//            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
