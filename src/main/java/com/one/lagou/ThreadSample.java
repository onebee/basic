package com.one.lagou;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 15; i++) {

            int finalI = i;

            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(" Thread " + Thread.currentThread().getName() + " 正在执行 任务 " + finalI);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        service.shutdown();
    }
}
