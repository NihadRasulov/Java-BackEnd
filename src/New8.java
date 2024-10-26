import java.util.Scanner;
public class New8 {
    public static void main (String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = number.nextInt();
        for ( int i=1;i<=10;i++)
            System.out.println(a + "*" + i + "=" + (a*i));

    }
}
