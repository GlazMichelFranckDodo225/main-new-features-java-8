package com.dgmf.subject1functionalinterfaces.withoutlambdas.impl;

import com.dgmf.subject1functionalinterfaces.withoutlambdas.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle Class : draw() Method");
    }
}
