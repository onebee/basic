package com.one.hencoder;

public class Synchronized1Demo implements TestDemo {

    /***
     * 当有多个线程操作同一个对象时候 需要考虑同步性volatile
     */
    private volatile boolean running = true;

    private void stop() {
        running = false;
    }

    @Override
    public void runTest() {
        new Thread(() -> {
            while (running) {

            }
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stop();
    }
}
