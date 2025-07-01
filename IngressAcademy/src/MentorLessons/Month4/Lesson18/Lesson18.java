package MentorLessons.Month4.Lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Lesson18 {

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//        System.out.println("Sum of nums array element is: " + sum);

//        String word = "level";
//        String palindrome = "";
//        for (int i = word.length()-1; i >= 0; i--) {
//            palindrome += word.charAt(i);
//        }
//        if (word.equals(palindrome)){
//            System.out.println("Word is palindrome");
//        }
//        System.out.println(palindrome);
    }

        public static int maxValue(List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max<list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }
}
