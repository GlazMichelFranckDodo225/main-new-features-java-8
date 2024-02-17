package com.dgmf.c.optionalclass.c.optionalofnullable;

import java.util.Optional;

public class OptionalOfNullable {
    public static void main(String[] args) {
        /* Create an Optional of "null" Value */
        String firstName = null;
        Optional<String> firstNameOptional = Optional.ofNullable(firstName);
        // Returns "Optional.empty"
        System.out.println(firstNameOptional);
    }
}
