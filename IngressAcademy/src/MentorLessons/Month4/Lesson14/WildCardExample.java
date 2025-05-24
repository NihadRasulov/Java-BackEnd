package MentorLessons.Month4.Lesson14;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {

    public static void printList(List<?> list) {
        //List<String> obj =  List<>
        for (Object element : list) {
            System.out.println(element);
        }
    }
    public static double sumList(List<? extends Number> list) {
        double sum = 0;
        for (Number element:list){
            sum+= element.doubleValue();
        }
        return sum;
    }
    public static void addIntegerToList(List<? super Integer> list,int count) {
        for (int i = 1;i<count;i++) {
            list.add(i);
        }
        System.out.println("List first element: " + list.get(0));

//        System.out.println("List elements: ");
//        for (Object element:list) {
//            System.out.println(element);
//        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        printList(list);
//        System.out.println(sumList(list));
        addIntegerToList(list,4);
        System.out.println(list);

    }
}
