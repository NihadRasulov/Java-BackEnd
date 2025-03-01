package MentorLessons.Lesson5;

public class CollectionArrays {

    public static void main(String[] args) {

        int [] arrays = new int []{5,4,7,3,9,-2};
        printArray(arrays);

    }
    public static void printArray(int[] arr) {
        int sum=0;
        int max = 0;
        int min = arr[0];

        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
            if(max<arr[i]) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The sum is "+sum + "\nThe average is " + (double) sum/arr.length +
                            "\nThe max is " + max + "\nThe min is " + min);
//        System.out.println("The sum is: " + sum);
//        System.out.println("The average is: " + (double) sum/arr.length);
//        System.out.println("The max is: " + max);
//        System.out.println("The min is: " + min);
    }
}
