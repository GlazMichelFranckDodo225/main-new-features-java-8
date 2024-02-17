package com.dgmf.c.optionalclass.f.defaultvalue.orelsemethod;

import java.util.Optional;

public class DefaultValue {
    public static void main(String[] args) {
        /* Create an Optional of */
        // String email = "johndoe@gmail.com";
        String email = null;
        Optional<String> emailOptional = Optional.ofNullable(email);
        // Returns "Optional[johndoe@gmail.com]"
        // Returns "Optional.empty"
        System.out.println(emailOptional);

        // To Get a Default Value of an Optional : orElse() Method
        String defaultOptional = emailOptional.orElse("default@gmail.com");
        System.out.println(defaultOptional);
    }
}
