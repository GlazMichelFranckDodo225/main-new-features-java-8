package com.dgmf.lambdaexpressions.withoutlambdas.impl;

import com.dgmf.lambdaexpressions.withoutlambdas.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square Class : draw() Method");
    }
}
