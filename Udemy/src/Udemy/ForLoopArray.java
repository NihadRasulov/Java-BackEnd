package Udemy;

public class ForLoopArray {

    public static void main(String[] args) {

        int numlist[] = {104,65,45,78,97,100};

        for(int i=0; i<numlist.length; i++){
            System.out.println(numlist[i]);
        }

        int sum = 0;
        for(int i=0; i<numlist.length; i++){
            sum += numlist[i];

        }
        System.out.println("The sum of arrays number is: " + sum);

        int max = numlist[0];
        for(int i=0; i<numlist.length; i++){
            if(max < numlist[i]){
                max = numlist[i];
            }
        }
        System.out.println("The max number is: " + max);
    }
}
