package com.dgmf.subject1functionalinterfaces.withoutlambdas.impl;

import com.dgmf.subject1functionalinterfaces.withoutlambdas.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle Class : draw() Method");
    }
}
