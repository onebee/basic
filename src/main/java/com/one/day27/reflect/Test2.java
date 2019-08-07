package com.one.day27.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {


        BufferedReader bufferedReader = new BufferedReader(new FileReader("xxx.properties"));
        Class clazz = (Class) Class.forName(bufferedReader.readLine());


        // 通过字节码对象创建对象
        DemoClass dc = (DemoClass) clazz.newInstance();
        dc.run();
    }
}
