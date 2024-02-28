package com.dgmf.e.streamapi;
<<<<<<< HEAD
=======

>>>>>>> 73fde2fe363d1cbb7548459851b3cea5f5bdfa47
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
        // Create a Stream
<<<<<<< HEAD
        Stream<String> stringStream = Stream.of("a", "b", "c");
        // Perform "forEach" Method
        stringStream.forEach(System.out::println);
=======
        Stream<String> stream = Stream.of("a", "b", "c");

        // Perform "forEach" Method
        stream.forEach(System.out::println);
>>>>>>> 73fde2fe363d1cbb7548459851b3cea5f5bdfa47
    }
}
