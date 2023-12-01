package com.dgmf.subject1lambdaexpressions.runnablelambda;

public class RunnableLambdaClient {
    public static void main(String[] args) {
        // Traditional way to create a Thread Object
        Thread thread = new Thread(new LambdaThread());
        thread.start();

        // Using Lambda Expression to create a Thread Object
        // Runnable runnable = () -> System.out.println("Runnable run() Method called " +
        //         "using Lambda Expression ...");
        // Thread lambdaThread = new Thread(runnable);
        // Thread lambdaThread = new Thread(runnable);
        Thread lambdaThread = new Thread(() -> System.out.println("Runnable run() Method called " +
                "using Lambda Expression ..."));
        lambdaThread.start();
    }
}
