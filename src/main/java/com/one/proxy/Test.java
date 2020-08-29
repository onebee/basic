package com.one.proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {


        StudentImp s = new StudentImp();

        s.login();
        s.submit();

        System.out.println("---------------------------------");

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(s);

        Student s2 = (Student) Proxy.newProxyInstance(s.getClass().getClassLoader(),
                s.getClass().getInterfaces(), myInvocationHandler
        );


        s2.login();
        s2.submit();
    }
}
