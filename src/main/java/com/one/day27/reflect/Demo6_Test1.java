package com.one.day27.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo6_Test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);


        Class clazz = Class.forName("java.util.ArrayList");
        Method method = clazz.getMethod("add", Object.class);
        method.invoke(list, "abbbccc");
        System.out.println(list);


    }
}
