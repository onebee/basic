package com.one.xiang.proxy;

public class AFactory implements ManFactory{
    @Override
    public void setStore() {
        System.out.println("i'm a Factory");
    }
}
