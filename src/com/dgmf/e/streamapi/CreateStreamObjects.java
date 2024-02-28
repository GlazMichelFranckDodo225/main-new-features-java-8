package com.dgmf.e.streamapi;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
        // Create a Stream
        Stream<String> stringStream = Stream.of("a", "b", "c");
        // Perform "forEach" Method
        stringStream.forEach(System.out::println);
    }
}
