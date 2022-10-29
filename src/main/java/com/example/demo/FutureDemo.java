package com.example.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(10000);
            return "Completed";
        });

        try {
            while (!future.isDone()) {
                System.out.println("Task still in progress...wait");
                Thread.sleep(500);
            }

            System.out.println("Task completed!");

            // 3000 waiting time before calling an exception if future doesn't provide an answer
            String result = future.get(300, TimeUnit.MILLISECONDS);
            System.out.println(result);

            // always stop the executor
            executorService.shutdown();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            
            // always stop the executor
            future.cancel(true);
            future.isDone();
            future.isCancelled();

            System.err.println(e);
        }
    }
    
}