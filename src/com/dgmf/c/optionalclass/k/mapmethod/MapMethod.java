package com.dgmf.c.optionalclass.k.mapmethod;

import java.util.Optional;

// Map Method, in Optional, Provides a Way to Transform
// Value in Optional from one Type to Another.
public class MapMethod {
    public static void main(String[] args) {
        String result = " abc ";

        if(result != null && result.contains("abc")) {
            System.out.println(result);
        }

        Optional<String> optionalResult = Optional.of(result);
        optionalResult.filter(res -> res.contains("abc"))
                .map(String::trim)
                .ifPresent(res -> System.out.println(res));
    }
}
