package com.dgmf.lambdaexpressions.runnablelambda;

// "Runnable" is a Functional Interface itself
public class LambdaThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable run() Method called ...");
    }
}
