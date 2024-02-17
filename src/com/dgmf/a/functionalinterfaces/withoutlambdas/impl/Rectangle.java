package com.dgmf.a.functionalinterfaces.withoutlambdas.impl;

import com.dgmf.a.functionalinterfaces.withoutlambdas.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle Class : draw() Method");
    }
}
