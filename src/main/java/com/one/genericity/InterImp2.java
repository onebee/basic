package com.one.genericity;

public class InterImp2<E> implements Inter<E> {

    @Override
    public void show(E e) {

        System.out.println("hhh" + e);
    }
}
