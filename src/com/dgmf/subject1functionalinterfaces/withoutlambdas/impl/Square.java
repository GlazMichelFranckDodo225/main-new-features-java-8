package com.dgmf.subject1functionalinterfaces.withoutlambdas.impl;

import com.dgmf.subject1functionalinterfaces.withoutlambdas.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square Class : draw() Method");
    }
}
