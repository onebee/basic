package com.one.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedDemo2 implements TestDemo {

    private  int x = 0;


    /**
     *
     */
    private AtomicInteger atomicInteger = new AtomicInteger(0);


    private  void count() {
        /**
         * x++ 是两步操作
         */
        x++;
        atomicInteger.incrementAndGet();
    }

    @Override
    public void runTest() {

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    count();
                }
                System.out.println("final x = " + x);
                System.out.println("atomic integer = " + atomicInteger.get());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    count();
                }
                System.out.println("final x = " + x);
                System.out.println("atomic integer = " + atomicInteger.get());
            }
        }.start();


    }
}
