package com.dgmf.lambdaexpressions.withoutlambdas.impl;

import com.dgmf.lambdaexpressions.withoutlambdas.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle Class : draw() Method");
    }
}
