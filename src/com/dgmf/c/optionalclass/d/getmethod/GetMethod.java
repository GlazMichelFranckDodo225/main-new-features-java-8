package com.dgmf.c.optionalclass.d.getmethod;

import com.dgmf.c.optionalclass.a.emptyoptional.EmptyOptional;
import com.dgmf.c.optionalclass.b.optionalof.OptionalOf;

import java.util.Optional;

public class GetMethod {
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

        // Retrieve a Value from the Optional Class
        // get() Method
        // Returns "johndoe@gmail.com" as a String
        System.out.println(emailOptional.get());
        // Returns ==> NoSuchElementException: No value present
        // System.out.println(firstNameOptional.get());
    }
}
