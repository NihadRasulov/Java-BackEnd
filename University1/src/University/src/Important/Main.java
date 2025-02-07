package University.src.Important;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number of month: ");
            int a = n1.nextInt();
            if(a>12){
                System.out.println("Invalid month");
            }
            else {
                switch (a) {
                    case 1,3,5,7,8,10,12:
                        System.out.println("31");
                        break;
                    case 2:
                        System.out.println("28");
                        break;
                    case 4,6,9,11:
                        System.out.println("30");
                        break;
                    default:
                        System.out.println("Invalid Number");
                }
                break;
            }
        }
    }
}