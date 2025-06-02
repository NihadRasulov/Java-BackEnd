package Task;

import java.util.Scanner;

public class Timer {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.print("Input a minute: ");
        int minute = input.nextInt();

        System.out.print("Input a second: ");
        int second = input.nextInt();

        while (true) {
            System.out.printf("%02d:%02d\r", minute, second);
            Thread.sleep(1000);
            second--;

            if (minute == 0 && second == -1) {
                break;
            }
            if (second == -1) {
                minute--;
                second = 60;
            }
        }
        System.out.println("Vaxt Bitdi!");
    }
}
