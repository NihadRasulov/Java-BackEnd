package Tasks.Task10;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("One",1);
        hashMap.put("Two",2);
        hashMap.put("Three",3);
        hashMap.put("Four",4);
        hashMap.put("Five",5);

        System.out.println(hashMap.getOrDefault("One",11));
        System.out.println(hashMap.getOrDefault("Ten",10));

    }
}
