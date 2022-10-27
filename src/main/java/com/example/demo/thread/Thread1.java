package com.example.demo.thread;

import com.example.demo.service.MathUtils;

public class Thread1 extends Thread {

    MathUtils mu;

    public Thread1(MathUtils mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        try {
            // System.out.println("Thread1 is running");
            mu.getMultiples(3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
