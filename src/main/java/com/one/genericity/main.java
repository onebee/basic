package com.one.genericity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {

    public static void main(String[] args) {


//        Person<String> person = new Person<>();
//        person.setName("onebit");
//
//        person.show2(123.99);
//
//        InterImp interImp = new InterImp();
//        interImp.show(34);
//        InterImp2<String> imp2 = new InterImp2<>();
//        imp2.show("nihao ");

        List<Student> list = new ArrayList();

        list.add(new Student("one"));
        list.add(new Student("one"));
        list.add(new Student("two"));
        list.add(new Student("three"));
        list.add(new Student("four"));

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(" name : " + next.getName()+"\n");
        }

        Student two = new Student("two");
        boolean contains = list.contains(two);
        System.out.println(contains);

    }
}
