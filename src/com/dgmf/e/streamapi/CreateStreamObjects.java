package com.dgmf.e.streamapi;
import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
        // Create a Stream
        Stream<String> stringStream = Stream.of("a", "b", "c");
        // Perform "forEach" Method
        stringStream.forEach(System.out::println);

        // Create a Stream from Existing Sources
        // A Stream from a Collection
        Collection<String> collection =
                Arrays.asList("Java", "Jakarta", "Spring", "Hibernate");
        Stream<String> collectionStream = collection.stream();
        collectionStream.forEach(System.out::println);

        // A Stream from a List
        List<String> list =
                Arrays.asList("Mercedes", "Ferrari", "BMW");
        Stream<String> listStream = list.stream();
        listStream.forEach(System.out::println);

        // A Stream from a Set
        Set<String> set = new HashSet<>(list);
        Stream<String> setStream = set.stream();
        setStream.forEach(System.out::println);

        // A Stream from a Array
        String[] array = {"John Doe", "Manuela De Lalorga", "Vixente Lizzarazu"};
        Stream<String> arrayStream = Arrays.stream(array);
        arrayStream.forEach(System.out::println);

        // Stream API "filter()" Method ==> Search for a
        // Good Example on the Web
    }
}
