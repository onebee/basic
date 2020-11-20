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
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                initName();
            }
        };
        thread1.start();

        Thread thread2 = new Thread(){
            @Override
            public void run() {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                printName();
            }
        };

        thread2.start();

    }
}
