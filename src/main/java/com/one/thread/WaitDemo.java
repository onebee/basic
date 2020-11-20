package com.one.thread;

public class WaitDemo implements TestDemo {


    private String name;


    private synchronized void initName() {
        name = "onebit";
        notifyAll();
    }

    private  synchronized void printName() {
        while (name == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("name = " + name);
    }

    @Override
    public void runTest() {

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println("thread1 start");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread1 running");
                initName();
            }
        };
        thread1.start();

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                System.out.println("thread2 start");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread2 running");
                printName();
            }
        };

        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main running");
    }
}
