package MentorLessons.Month4.Lesson16.Task;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(new Address("Baki", "28 May"), "Nihat");
        System.out.println(customer);

        Optional<Address> optional = Optional.of(customer.getAddress());
        optional.ifPresent(address -> System.out.println(address.getCity()));


//        List<String> list = new ArrayList<>(Arrays.asList("One","Two","Three"));
//        System.out.println(list.stream().collect(Collectors.joining(" ")));l

//        List<String> strings = Arrays.asList("Alma","Alma","Banana","Armud","Armud");
//        Set<String> stringSet = new HashSet<>();
//
//        System.out.println(strings.stream().filter(string -> !stringSet.add(string)).toList());




    }
}
