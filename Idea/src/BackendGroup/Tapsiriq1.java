package BackendGroup;

public class Tapsiriq1 {

    public static void main(String[] args) {

        int [] array = new int[]{12, 45, 7, 89, 23};
        int max = array[0];
        int index = 0;
        for (int i=1;i<array.length ;i++){
            if (array[i]>max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("The array's max element is " + max + " and its index is " + index);
    }
}
