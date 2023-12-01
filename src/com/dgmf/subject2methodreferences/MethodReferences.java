package com.dgmf.subject2methodreferences;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferences {
    public static void main(String[] args) {
        // 1. Using Method Reference to call a Static Method
        // Lambda Expression
        Function<Integer, Double> function = input -> Math.sqrt(input);
        System.out.println(function.apply(4));

        BiFunction<Integer, Integer, Integer> additionLambda =
                // (a, b) -> MethodReferences.addition(a, b);
                (a, b) -> addition(a, b); // Inferred MethodReferences Type
        System.out.println(additionLambda.apply(15, 35));

        // Method Reference
        Function<Integer, Double> functionMethodReference = Math::sqrt;
        System.out.println(functionMethodReference.apply(4));

        BiFunction<Integer, Integer, Integer> additionMethodReference =
                MethodReferences::addition;
        System.out.println(additionMethodReference.apply(15, 35));

    }

    public static int addition(int a, int b) {
        return a + b;
    }
}
