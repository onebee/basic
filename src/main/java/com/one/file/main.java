package com.one.file;

import java.io.File;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        //创建文件对象
        File file = new File("Test22.java");
        if (!file.exists()) {
                file.createNewFile();
        }
        //获取文件的绝对路径，即全路径
        String absPath = file.getAbsolutePath();
        //File中封装的路径是什么获取到的就是什么。
        String path = file.getPath();
        //获取文件名称
        String filename = file.getName();
        //获取文件大小
        long size = file.length();

        System.out.println("absPath="+absPath);
        System.out.println("path="+path);
        System.out.println("filename="+filename);
        System.out.println("size="+size);

    }
}
