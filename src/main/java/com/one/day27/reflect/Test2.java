package com.one.day27.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

//        	 * (1) дһ��Properties��ʽ�������ļ�����������������ơ�
//	 * (2) дһ�����򣬶�ȡ���Properties�����ļ����������������Ʋ���������࣬�÷���ķ�ʽ����run������

        BufferedReader bufferedReader = new BufferedReader(new FileReader("xxx.properties"));
        Class clazz = (Class) Class.forName(bufferedReader.readLine());


        // ͨ���ֽ�����󴴽�����
        DemoClass dc = (DemoClass) clazz.newInstance();
        dc.run();
    }
}
