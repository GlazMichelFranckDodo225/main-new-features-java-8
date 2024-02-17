package com.dgmf.b.methodreferences;

import java.util.*;
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

        // 2. Using Method Reference to call an Instance Method of an Object
        MethodReferences methodReferencesObject = new MethodReferences();

        // Lambda Expression
        Printable printableLambda = msg ->
                methodReferencesObject.display(msg);

        printableLambda.print("Hello World from Lambda Expression !");

        // Method Reference
        Printable printableMethodReference = methodReferencesObject::display;

        printableMethodReference.print("Hello World from Method References !");

        // 3. Method Reference to call the Instance Method of an Arbitrary Object
        // Sometimes, we call a Method of Argument in the Lambda Expression
        // In that case, we can use a Method Reference to call an Instance
        // Method of an Arbitrary Object of a specific Type

        // Lambda Expression
        Function<String, String> strinFunction =
                (String input) -> input.toLowerCase();
        System.out.println(strinFunction.apply("JAVA 8 - LAMBDA " +
                "EXPRESSION FEATURE"));

        // Method Reference
        Function<String, String> strinFunctionMethodReference = String::toLowerCase;
        System.out.println(strinFunctionMethodReference.apply("JAVA 8 - METHOD " +
                "REFERENCE FEATURE"));

        // Another example
        String[] stringArray1 = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
        String[] stringArray2 = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};

        // Lambda Expression
        Arrays.sort(stringArray1, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.stream(stringArray1).toList());

        // Method Reference
        Arrays.sort(stringArray2, String::compareToIgnoreCase);
        System.out.println(Arrays.stream(stringArray2).toList());

        // 4. Method Reference to call a Constructor
        // To Convert a "List<String>" into a Set<String>

        // Lambda Expression
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println(fruits);
        Function<List<String>, Set<String>> setFunctionLambda =
                fruitsList -> new HashSet<>(fruitsList);
        System.out.println(setFunctionLambda.apply(fruits));

        // Method Reference
        List<String> shoes = new ArrayList<>();
        shoes.add("Nike");
        shoes.add("Puma");
        shoes.add("Winston");
        shoes.add("Nike");
        shoes.add("Charles");
        shoes.add("Adidas");
        shoes.add("Puma");
        shoes.add("Winston");
        System.out.println(shoes);

        Function<List<String>, Set<String>> setFunctionMethodReference = HashSet::new;
        System.out.println(setFunctionMethodReference.apply(shoes));
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public void display(String msg) {
        msg = msg.toUpperCase();

        System.out.println(msg);
    }
}
