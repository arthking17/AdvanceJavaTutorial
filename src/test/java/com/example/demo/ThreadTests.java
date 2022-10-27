package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.MathUtils;
import com.example.demo.thread.Thread1;
import com.example.demo.thread.Thread2;

@SpringBootTest
public class ThreadTests {

    @Test
    void test() {
        MathUtils obj = new MathUtils();

        // int n = 10;
        // for (int i = 0; i < n; i++) {
        // Thread1 t1 = new Thread1();
        // t1.start();

        // Thread t2 = new Thread(new Thread2());
        // t2.start();
        // }
        Thread1 t1 = new Thread1(obj);
        Thread t2 = new Thread(new Thread2(obj));

        t1.start();
        t2.start();
    }
}
