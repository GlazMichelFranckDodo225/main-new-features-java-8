package com.dgmf.lambdaexpressions.withlambdas;

import com.dgmf.lambdaexpressions.withoutlambdas.Shape;

public class ShapeClient {
    public static void main(String[] args) {
        // Using Lambdas to implement the "Shape" Functional Interface
        System.out.println("======= Using Lambdas to implement the \"Shape\" " +
                "Functional Interface =======");
        Shape circle = () -> System.out.println("Circle Class : draw() Method");
        circle.draw();

        Shape rectangle = () -> System.out.println("Rectangle Class : draw() Method");
        rectangle.draw();

        Shape square = () -> System.out.println("Square Class : draw() Method");
        square.draw();

        // Pass a Lambda Expression as a Method Parameter
        System.out.println("======= Pass a Lambda Expression as a Method " +
                "Parameter =======");
        print(circle);
        print(rectangle);
        print(square);

    }

    // Pass a Lambda Expression as a Method Parameter
    public static void print(Shape shape) {
        shape.draw();
    }
}
