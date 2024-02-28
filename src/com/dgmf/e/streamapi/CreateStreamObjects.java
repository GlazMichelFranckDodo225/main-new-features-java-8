package com.dgmf.e.streamapi;

import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
        // Create a Stream
        Stream<String> stream = Stream.of("a", "b", "c");

        // Perform "forEach" Method
        stream.forEach(System.out::println);
    }
}
