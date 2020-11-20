package com.one.thread;

public class ThreadInteractionDemo implements TestDemo {

    @Override
    public void runTest() {

        Thread thread = new Thread() {
            @Override
            public void run() {

//                for (int i = 0; i < 1_000_000; i++) {
//                    if (isInterrupted()) {
//                        break;
//                    }
//
//                    /**
//                     * 会清除 interrupted 的中断标志位
//                     */
//                    if (Thread.interrupted()) {
//
//                    }
//
//
//                    System.out.println("number = " + i);
//                }

                try {
                    Thread.sleep(10*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
