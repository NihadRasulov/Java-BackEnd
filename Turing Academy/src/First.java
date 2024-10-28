import java.util.Scanner;
public class First {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a = number.nextInt();
        String b = a % 2 == 0 ? "even" : "odd";
        System.out.println(" The number is " + b);



        byte a=111;
        short b=222;
        int c=333;
        long d=444L;
        float e=555.555F;
        double f=666.666;
        char g='A';
        boolean h=true;
        int number1 = 15;
        int number2 = 7;
        int sum = number1 + number2;
        int min1 = number1 - number2;
        int vur = number1 * number2;
        int div = number1 / number2;
        int bol = number1 % number2;
        System.out.println("The number 1 is: " + number1);
        System.out.println("The number 2 is: " + number2);

        System.out.println("The sum is:" + sum);
        System.out.println("The ferq is:" + min1);
        System.out.println("The multiple is: " + vur);
        System.out.println("The div is: " + div);
        System.out.println("The bol is: " + bol);





    }
}
