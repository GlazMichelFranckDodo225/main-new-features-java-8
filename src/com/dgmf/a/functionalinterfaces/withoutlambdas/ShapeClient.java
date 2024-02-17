package com.dgmf.a.functionalinterfaces.withoutlambdas;

import com.dgmf.a.functionalinterfaces.withoutlambdas.impl.Circle;
import com.dgmf.a.functionalinterfaces.withoutlambdas.impl.Rectangle;

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
