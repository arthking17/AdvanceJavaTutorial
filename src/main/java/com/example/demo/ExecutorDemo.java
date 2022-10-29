package com.example.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.demo.model.Caller;

public class ExecutorDemo {
    
    public static void main(String[] args) {
        executeInvoke();
        executorServiceInvoke();
    }

    private static void executeInvoke() {
        Executor executor = new Caller();
        executor.execute(() -> {
            System.out.println("executor example");
        });
    }

    private static void executorServiceInvoke() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            System.out.println("executor service exmple");
        });
    }
}
