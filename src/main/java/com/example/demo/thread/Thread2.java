package com.example.demo.thread;

import com.example.demo.service.MathUtils;

public class Thread2 implements Runnable {

    MathUtils mu;

    public Thread2(MathUtils mu) {
        this.mu = mu;
    }

    @Override
    public void run() {

        try {
            // System.out.println("Thread2 is running");
            mu.getMultiples(2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
