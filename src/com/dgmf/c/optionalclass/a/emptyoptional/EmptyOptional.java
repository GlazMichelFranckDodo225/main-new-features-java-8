package com.dgmf.c.optionalclass.a.emptyoptional;

import java.util.Optional;

public class EmptyOptional {
    public static void main(String[] args) {
        // Static Methods to Create Optional Objects : empty, of, ofNullable
        /* Create an Empty Optional */
        // Returns "Optional.empty"
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
    }
}
