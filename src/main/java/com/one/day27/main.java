package com.one.day27;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException, InterruptedException {

//        testImp testImp = new testImp();
//        testImp.hello();
//
//        test.world();
        Runtime runtime = Runtime.getRuntime();
        System.out.println("������������" + runtime.availableProcessors());
        System.out.println("�����ڴ棺" + runtime.freeMemory()/1024/1024 + "M");
        System.out.println("�������ڴ�������" + runtime.maxMemory() / 1024 / 1024 + "M");

        Process process = runtime.exec("notepad.exe");
        Thread.sleep(3000);
        process.destroy();
    }
}
