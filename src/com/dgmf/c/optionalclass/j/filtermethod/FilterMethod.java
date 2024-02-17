package com.dgmf.c.optionalclass.j.filtermethod;

import java.util.Optional;

public class FilterMethod {
    public static void main(String[] args) {
        String result = "abc";

        if(result != null && result.contains("abc")) {
            System.out.println(result);
        }

        Optional<String> optionalResult = Optional.of(result);
        optionalResult.filter(res -> res.contains("abc"))
                .ifPresent(res -> System.out.println(res));
    }
}
