package com.one.genericity;

import java.util.Collections;

public class InterImp2<E> implements Inter<E> {

    @Override
    public void show(E e) {

        System.out.println("hhh" + e);
//        Collections.shuffle();
    }
}
