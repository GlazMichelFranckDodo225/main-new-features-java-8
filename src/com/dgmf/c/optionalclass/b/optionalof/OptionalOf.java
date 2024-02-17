package com.dgmf.c.optionalclass.b.optionalof;

import java.util.Optional;

public class OptionalOf {
    public static void main(String[] args) {
        /* Create an Optional of */
        String email = "johndoe@gmail.com";
        // String email = null;
        Optional<String> emailOptional = Optional.of(email);
        // Returns "Optional[johndoe@gmail.com]
        System.out.println(emailOptional);
    }
}
