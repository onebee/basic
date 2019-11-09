package com.one.day27.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

//        	 * (1) 写一个Properties格式的配置文件，配置类的完整名称。
//	 * (2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，用反射的方式运行run方法。

        BufferedReader bufferedReader = new BufferedReader(new FileReader("xxx.properties"));
        Class clazz = (Class) Class.forName(bufferedReader.readLine());


        // 通过字节码对象创建对象
        DemoClass dc = (DemoClass) clazz.newInstance();
        dc.run();
    }
}
