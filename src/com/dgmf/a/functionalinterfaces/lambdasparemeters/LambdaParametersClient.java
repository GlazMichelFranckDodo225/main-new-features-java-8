package com.dgmf.a.functionalinterfaces.lambdasparemeters;

public class LambdaParametersClient {
    public static void main(String[] args) {
        // Implementation of "Addable" Functional Interface
        // Lambda with Parameters
        System.out.println("====== Lambda Parameters ======");
        // Addable addable =  (int a, int b) -> a + b;
        Addable addable =  (a, b) -> a + b; // Parameter Type Inferring

        int result = addable.addition(15, 20);
        System.out.println(result);

        // Lambda with Multiple Statements
        System.out.println("====== Lambda with Multiple Statements ======");
        Addable addable2 = (c, d) -> {
            int result2 = c + d;

            return result2;
        };

        int result3 = addable2.addition(12, 13);
        System.out.println(result3);
    }
}
