package com.dgmf.lambdaexpressions.runnablelambda;

public class RunnableLambdaClient {
    public static void main(String[] args) {
        // Traditional way to create a Thread Object
        System.out.println("====== Traditional way to create a Thread Object ======");
        Thread thread = new Thread(new LambdaThread());
        thread.start();

    }
}
