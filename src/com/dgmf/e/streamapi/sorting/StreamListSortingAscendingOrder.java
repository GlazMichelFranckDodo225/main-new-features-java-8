package com.dgmf.e.streamapi.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSortingAscendingOrder {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        // Stream API : Sort in Ascending Order
        System.out.println(fruits); // [Banana, Apple, Mango, Orange]

        // "sorted()" Method
        List<String> sortedList = fruits.stream() // ==> Convert Lis Into Stream
                .sorted() // Ascending Order by Default
                .collect(Collectors.toList()); // Collect Back Stream As a List

        System.out.println(sortedList); // [Apple, Banana, Mango, Orange]

        // Natural Order
        List<String> naturalSortedList = fruits.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(naturalSortedList);

        // Using Lambda Expressions
        List<String> lambdaSortedList = fruits.stream()
                // .sorted((o1, o2) -> o1.compareTo(o2))
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println(lambdaSortedList);
    }
}
