package com.dgmf.a.functionalinterfaces.withoutlambdas.impl;

import com.dgmf.a.functionalinterfaces.withoutlambdas.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle Class : draw() Method");
    }
}
