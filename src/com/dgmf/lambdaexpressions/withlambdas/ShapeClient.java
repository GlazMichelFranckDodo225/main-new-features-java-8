package com.dgmf.lambdaexpressions.withlambdas;

import com.dgmf.lambdaexpressions.withoutlambdas.Shape;
import com.dgmf.lambdaexpressions.withoutlambdas.impl.Circle;
import com.dgmf.lambdaexpressions.withoutlambdas.impl.Rectangle;

public class ShapeClient {
    public static void main(String[] args) {
        // Using Lambdas to implement the "Shape" Functional Interface
        Shape circle = () -> System.out.println("Circle Class : draw() Method");
        circle.draw();

        Shape rectangle = () -> System.out.println("Rectangle Class : draw() Method");
        rectangle.draw();

        Shape square = () -> System.out.println("Square Class : draw() Method");
        square.draw();

    }
}
