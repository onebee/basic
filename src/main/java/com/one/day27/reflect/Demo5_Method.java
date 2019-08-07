package com.one.day27.reflect;

import com.one.day27.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo5_Method {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


        Class clazz = Class.forName("com.one.day27.bean.Person");
        Constructor c = clazz.getConstructor(String.class, int.class);
        Person person = (Person) c.newInstance("张三",23);

        Method m = clazz.getMethod("eat");

        m.invoke(person);

        Method m2 = clazz.getMethod("eat", int.class);
        m2.invoke(person, 55);
    }
}
