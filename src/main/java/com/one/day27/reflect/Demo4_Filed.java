package com.one.day27.reflect;

import com.one.day27.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo4_Filed {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        Class clazz = Class.forName("com.one.day27.bean.Person");
        Constructor constructor = clazz.getConstructor(String.class, int.class);

        Person person = (Person) constructor.newInstance("hand", 30);


        Field f = clazz.getField("name");
        f.setAccessible(true);
        f.set(person,"我们");
        System.out.println(person);
    }
}
