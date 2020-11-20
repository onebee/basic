package com.one.thread;

import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

//        thread();
//        runnable();
//        callable();

        executor();

    }

    static void thread() {
        Thread thread = new Thread() {

            @Override
            public void run() {
                super.run();
                System.out.println("Thread start ! ");
            }
        };

        thread.start();
    }

    static void runnable() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread start with runnable");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();


    }

    static void executor(){
        ExecutorService executorService = Executors.newFixedThreadPool(25);


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(" runnable running and thread name = " + name);
            }
        };

        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);

        executorService.shutdown();
    }

    static void callable() {
        Callable<String> callable = new Callable<String>() {

            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "Done";
            }
        };


        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(callable);
        while (true) {
            if (future.isDone()) {
                try {
                    String s = future.get();
                    System.out.println(" result : " + s);
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}



