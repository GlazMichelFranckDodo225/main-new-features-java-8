package com.dgmf.subject1functionalinterfaces.withoutlambdas;

import com.dgmf.subject1functionalinterfaces.withoutlambdas.impl.Circle;
import com.dgmf.subject1functionalinterfaces.withoutlambdas.impl.Rectangle;

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
