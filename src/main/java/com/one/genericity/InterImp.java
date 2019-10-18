package com.one.genericity;

public class InterImp implements Inter<Integer> {
    @Override
    public void show(Integer integer) {

        System.out.println(" dd : " + integer);
    }
}
