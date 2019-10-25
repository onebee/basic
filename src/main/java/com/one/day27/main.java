package com.one.day27;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException, InterruptedException {

//        testImp testImp = new testImp();
//        testImp.hello();
//
//        test.world();
        Runtime runtime = Runtime.getRuntime();
        System.out.println("处理器个数：" + runtime.availableProcessors());
        System.out.println("空闲内存：" + runtime.freeMemory()/1024/1024 + "M");
        System.out.println("最大可用内存数量：" + runtime.maxMemory() / 1024 / 1024 + "M");

        Process process = runtime.exec("notepad.exe");
        Thread.sleep(3000);
        process.destroy();
    }
}
