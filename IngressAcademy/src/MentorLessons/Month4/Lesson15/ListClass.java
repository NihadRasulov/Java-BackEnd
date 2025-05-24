package MentorLessons.Month4.Lesson15;

import java.util.*;

public class ListClass {

    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(12);
//        list.add(12);
//        System.out.println(list);
//
//        HashSet<String> hashSet = new HashSet<>();
//
//        hashSet.add("String");
//        hashSet.add("String");
//        hashSet.add("String");
//        hashSet.add("Salam");
//
//        System.out.println(hashSet);
//
//        HashSet<Integer> hashSet1 = new HashSet<>(list);
//        System.out.println(hashSet1);
//
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("note1");
//        linkedList.add("note2");
//        linkedList.add("note3");
//        linkedList.add("note4");
//        linkedList.removeLast();
//        System.out.println(linkedList);

//        Deque<String> listDeque = new ArrayDeque<>(Arrays.asList(
//                "Salam","Hello","Salam","Hello"
//        ));
//        listDeque.add("Salam");
//        listDeque.add("Hello");
//        listDeque.add("Salam");
//        listDeque.add("Hello");

//        System.out.println(listDeque.pop());

//        List<String> list1 = new ArrayList<>();
//        list1.add("A");
//        list1.add("b");
//        list1.add("A");
//        list1.add("B");
//        list1.add("A");
//        list1.add("B");
//        list1.add("A");
//        list1.add("a");
//        list1.add("a");
//        list1.add("S");

//        HashSet<String> hashSet2 = new HashSet<>();
//        Set<String> duplicate = new HashSet<>();
//        for (int i = 0; i < list1.size(); i++) {
//            if (!hashSet2.add(list1.get(i))){
//                duplicate.add(list1.get(i));
//            }
//        }
//        System.out.println("Duplicate values: " + duplicate);
//
//
//        List<Integer> list3 = new ArrayList<>();
//        list3.add(11);
//        list3.add(12);
//        list3.add(11);
//        list3.add(13);
//        list3.add(13);
//        list3.add(14);
//        list3.add(14);
//        list3.add(14);

//        HashSet<Integer> hashSet3 = new HashSet<>();
//        List<Integer> list4 = new ArrayList<>();
//        for (int i = 0;i<list3.size();i++) {
//            if (!hashSet3.add(list3.get(i))){
//                list4.add(list3.get(i));
//            }
//        }
//        for (int i = 0; i < list4.size(); i++) {
//            if (hashSet3.contains(list4.get(i))) {
//                System.out.println("This is unique value: " + list4.get(i));
//            }
//        }
//        method(list3);

        String [] array = {"Apple","Banana","Apple","Orange","Banana"};
        method2(array);
    }

    public static void method(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int i = 0;i<list.size();i++) {
            if (!seen.add(list.get(i))){
                duplicate.add(list.get(i));
            }
        }

        List<Integer> newList = new ArrayList<>();

        for (int element:list) {
            if (!duplicate.contains(element)){
                newList.add(element);
            }
        }
        System.out.println("Unique value: " + newList);
    }

    public static void method2(String []array) {

        Set<String> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            hashSet.remove(array[i]);
            hashSet.add(array[i]);
        }
        System.out.println(hashSet);

    }
}
// contextSwitch