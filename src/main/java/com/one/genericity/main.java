package com.one.genericity;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {


//        Person<String> person = new Person<>();
//        person.setName("onebit");
//
//        person.show2(123.99);
//
//        InterImp interImp = new InterImp();
//        interImp.show(34);
        InterImp2<String> imp2 = new InterImp2<>();
        imp2.show("nihao ");

    }
}
