package MentorLessons.Lesson5;

public class Lesson5 {


    public static void main(String[] args) {

        String []arrays = new String[]{"Nihad","Eli","Anar","Subhan","Nicat"};

//        for(String a:arrays) {
//            System.out.println("The name is: " + a);
//        }
//        for(int i=arrays.length-1;i>=0;i--) {
//            System.out.println(i + " name is: " + arrays[i]);
//        }

//        array(arrays);


    }

    public static String[] array(String []arr) {
//        for(String a:arr) {
//            System.out.println("The name is: " + a);
//        }
        for(int i=arr.length-1;i>=0;i--) {
            System.out.println(i + " name is: " + arr[i]);
        }
        return arr;
    }
}
