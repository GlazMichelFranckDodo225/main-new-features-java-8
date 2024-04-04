package com.dgmf.e.streamapi.a.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSortingDescendingOrder {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        // Stream API : Sort in Descending Order
        System.out.println(fruits); // [Banana, Apple, Mango, Orange]

        // Reverse Order
        List<String> reverseSortedList = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(reverseSortedList);

        // Using Lambda Expressions
        List<String> lambdaSortedList = fruits.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());

        System.out.println(lambdaSortedList);
    }
}
