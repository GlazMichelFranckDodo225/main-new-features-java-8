package com.dgmf.a.functionalinterfaces.withoutlambdas.impl;

import com.dgmf.a.functionalinterfaces.withoutlambdas.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square Class : draw() Method");
    }
}
