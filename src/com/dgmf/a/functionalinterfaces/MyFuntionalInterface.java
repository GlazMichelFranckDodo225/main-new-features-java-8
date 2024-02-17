package com.dgmf.a.functionalinterfaces;

@FunctionalInterface
public interface MyFuntionalInterface {
    void print(String msg);

    default void defaultMethod1() {
        System.out.println("Default Method 1 ...");
    }

    static void staticMethod1() {
        System.out.println("static Method 1 ...");
    }
}
