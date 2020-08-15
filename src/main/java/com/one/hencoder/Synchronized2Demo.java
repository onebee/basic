package com.one.hencoder;

import java.util.concurrent.atomic.AtomicInteger;

public class Synchronized2Demo implements TestDemo {

    private   int x = 0;
    AtomicInteger count = new AtomicInteger();


    private  void add() {
//
//        synchronized (this) {
        count.incrementAndGet();
            x++;
//        }
    }

    @Override
    public void runTest() {
        new Thread(() -> {
            for (int i = 0; i < 1000_000; i++) {
                add();
            }

            System.out.println("one thread final x = " + x + " , count "+ count);
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 1000_000; i++) {
                add();
            }


            System.out.println("two thread final x = " + x + " , count "+ count);
        }).start();

    }
}
