package com.one.file;

import java.io.File;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        //�����ļ�����
        File file = new File("Test22.java");
        if (!file.exists()) {
                file.createNewFile();
        }
        //��ȡ�ļ��ľ���·������ȫ·��
        String absPath = file.getAbsolutePath();
        //File�з�װ��·����ʲô��ȡ���ľ���ʲô��
        String path = file.getPath();
        //��ȡ�ļ�����
        String filename = file.getName();
        //��ȡ�ļ���С
        long size = file.length();

        System.out.println("absPath="+absPath);
        System.out.println("path="+path);
        System.out.println("filename="+filename);
        System.out.println("size="+size);

    }
}
