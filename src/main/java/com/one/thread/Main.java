package com.one.thread;

import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

//        thread();

//        runnable();

//        callable();

//        Random random = new Random();
//        boolean b = random.nextBoolean();
//
//        System.out.println(b)

        String aa="sdad中国,.ss。";
        char[] charArray = aa.toCharArray();
        for (char c : charArray) {

            String  cnorEn = isCnorEn(c);
            System.out.println(c+":"+cnorEn);
        }
    }
    static String isCnorEn(char c){
        if(c >= 0x0391 && c <= 0xFFE5) //中文字符
            return "中文";
        if(c>=0x0000 && c<=0x00FF){ //英文字符
            return "英文";
        }
        return "其他";
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



