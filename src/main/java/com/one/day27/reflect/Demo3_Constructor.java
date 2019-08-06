package com.one.day27.reflect;

import com.one.day27.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo3_Constructor {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class clazz1 = Class.forName("com.one.day27.bean.Person");
//        Person p = (Person) clazz1.newInstance();
//        System.out.printf(" ", p.toString());
        Constructor constructor = clazz1.getConstructor(String.class, int.class);
        Person person = (Person) constructor.newInstance("hand", 30);
        System.out.println(person);
    }
}
