package day27.reflect;

import day27.bean.Person;

public class Demo3_Constructor {

    public static void main(String[] args) throws ClassNotFoundException {

        Class clazz1 = Class.forName("day27.bean.Person");
        Class clazz2 = Person.class;

        Person p = new Person();
        Class clazz3  = p.getClass();


        System.out.println(clazz1==clazz2);
        System.out.println(clazz3==clazz2);
    }
}
