package Months.Month4.Lesson28;

import java.util.List;
import java.util.Arrays;

public class Lesson28 {

    public static void main(String[] args) {

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> list = numbers.stream().map(p -> p*p).toList();
//
//        System.out.println(list);
//
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
//        String name = names.stream().reduce("",(a,b) -> a.length()>b.length() ? a:b);
//        String name = names.stream().max(Comparator.comparingInt(String::length)).get();
//
//        System.out.println(name.length());
//
//        List<String> sentences = Arrays.asList(
//                "Java Stream API provides a fluent interface for processing sequences of elements.",
//                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
//                "In this exercise, you need to count the total number of words in all sentences."
//        );
//        long count = sentences.stream().flatMap(string -> Arrays.stream(string.split(" ")).distinct()).count();
//        System.out.println(count);

//        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
//        String word = words.stream().filter(string -> string.length()%2==0).limit(2).collect(Collectors.joining());
//        System.out.println(word);
//        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
//        String word = words.stream().filter(string -> string.length()%2==0).limit(2).reduce("",(string, string2) -> string+string2);
//        System.out.println(word);


        List<Integer> numberArray = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long sum = numberArray.stream().filter(integer -> integer%2 ==0).mapToInt(value -> value*value).sum();
        System.out.println(sum);
    }
}
