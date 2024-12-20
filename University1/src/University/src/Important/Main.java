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
                    case 1:
                        System.out.println("31");
                        break;
                    case 2:
                        System.out.println("28");
                        break;
                    case 3:
                        System.out.println("31");
                        break;
                    case 4:
                        System.out.println("30");
                        break;
                    case 5:
                        System.out.println("31");
                        break;
                    case 6:
                        System.out.println("30");
                        break;
                    case 7:
                        System.out.println("31");
                        break;
                    case 8:
                        System.out.println("31");
                        break;
                    case 9:
                        System.out.println("30");
                        break;
                    case 10:
                        System.out.println("31");
                        break;
                    case 11:
                        System.out.println("30");
                        break;
                    case 12:
                        System.out.println("31");
                        break;
                    default:
                        System.out.println("Invalid Number");
                }
                break;
            }
        }
    }
}