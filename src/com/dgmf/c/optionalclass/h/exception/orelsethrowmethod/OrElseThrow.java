package com.dgmf.c.optionalclass.h.exception.orelsethrowmethod;

import java.util.Optional;

public class OrElseThrow {
    public static void main(String[] args) {
        /* Create an Optional of */
        // String email = "johndoe@gmail.com";
        String email = null;
        Optional<String> emailOptional = Optional.ofNullable(email);
        // Returns "Optional[johndoe@gmail.com]"
        // Returns "Optional.empty"
        System.out.println(emailOptional);

        // Whenever there is no Value ==> Throws an Exception : orElseThrow() Method
        // with Lambda Expression
        String defaultOptional = emailOptional.orElseThrow(() ->
                new IllegalArgumentException("Email Does Not Exists"));

        System.out.println(defaultOptional);
    }
}
