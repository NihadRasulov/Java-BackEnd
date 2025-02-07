package Slide62;

public class TheForLoopChallange {

    public static void main(String[] args) {

        int count = 0;
        for (int i=10;i<50;i++) {
            if (isPrime(i)) {
                System.out.println("This is prime number: " + i);
                count++;
                if (count == 5) {
                    System.out.println("Found more than 5 prime numbers! Exiting program.");
                    break;
                }
            }
        }
//        System.out.println("There are " + count + " prime numbers");
//        System.out.println("This is " + (isPrime(6) ? "prime number" : "not prime number"));

    }

    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
