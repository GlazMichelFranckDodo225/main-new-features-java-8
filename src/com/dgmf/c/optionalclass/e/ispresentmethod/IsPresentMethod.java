package com.dgmf.c.optionalclass.e.ispresentmethod;

import java.util.Optional;

public class IsPresentMethod {
    public static void main(String[] args) {
        /* Create an Optional of */
        String email = "johndoe@gmail.com";
        // String email = null;
        Optional<String> emailOptional = Optional.of(email);
        // Returns "Optional[johndoe@gmail.com]
        System.out.println(emailOptional);

        /* Create an Optional of "null" Value */
        String firstName = null;
        Optional<String> firstNameOptional = Optional.ofNullable(firstName);
        // Returns "Optional.empty"
        System.out.println(firstNameOptional);

        // isPresent() Method
        if(emailOptional.isPresent()) {
            System.out.println(emailOptional.get());
        } else {
            System.out.println("Please Enter a Email");
        }

        if(firstNameOptional.isPresent()) {
            System.out.println(firstNameOptional.get());
        } else {
            System.out.println("Please Enter a First Name");
        }
    }
}
