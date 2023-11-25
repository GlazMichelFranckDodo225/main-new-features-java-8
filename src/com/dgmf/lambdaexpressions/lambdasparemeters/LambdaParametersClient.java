package com.dgmf.lambdaexpressions.lambdasparemeters;

public class LambdaParametersClient {
    public static void main(String[] args) {
        // Implementation of "Addable" Functional Interface
        // Addable addable =  (int a, int b) -> a + b;
        Addable addable =  (a, b) -> a + b; // Parameter Type Inferring

        int result = addable.addition(15, 20);
        System.out.println(result);;
    }
}
