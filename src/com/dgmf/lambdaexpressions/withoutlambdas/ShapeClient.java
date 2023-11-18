package com.dgmf.lambdaexpressions.withoutlambdas;

import com.dgmf.lambdaexpressions.withoutlambdas.impl.Circle;
import com.dgmf.lambdaexpressions.withoutlambdas.impl.Rectangle;

public class ShapeClient {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Circle();

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
