package com.dgmf.lambdaexpressions.withoutlambdas.impl;

import com.dgmf.lambdaexpressions.withoutlambdas.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle Class : draw() Method");
    }
}
