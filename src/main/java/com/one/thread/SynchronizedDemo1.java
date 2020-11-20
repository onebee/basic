package com.one.thread;

public class SynchronizedDemo1 implements TestDemo {
    private boolean running = true;
    private void stop() {
        running = false;
    }
    @Override
    public void runTest() {
        new Thread(){
            @Override
            public void run() {
                while (running) {

                }
            }
        }.start();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop();
    }
}
