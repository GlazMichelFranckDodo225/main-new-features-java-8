package com.dgmf.c.optionalclass.i.ifpresentmethod;

import java.util.Optional;

public class IfPresentMethod {
    public static void main(String[] args) {
        /* Create an Optional of */
        String gender = "Male";
        // String email = null;
        Optional<String> genderOptionalPresent = Optional.of(gender);
        Optional<String> genderOptionalEmpty = Optional.empty();
        // Returns "Optional[johndoe@gmail.com]"
        // Returns "Optional.empty"
        genderOptionalPresent
                .ifPresent(s -> System.out.println("Value is Present"));
        genderOptionalEmpty
                .ifPresent(s -> System.out.println("No Value Present"));
    }
}
