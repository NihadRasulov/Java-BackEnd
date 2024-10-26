import java.util.Scanner;
public class New {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = number.nextInt();
        if(a % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }

}
