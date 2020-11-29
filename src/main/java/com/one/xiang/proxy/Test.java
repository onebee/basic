package com.one.xiang.proxy;

public class Test {


    public static void main(String[] args) {
        ManFactory manFactory = new AFactory();
        MarkCompany markCompany = new MarkCompany();
        markCompany.setFactory(manFactory);

        ManFactory proxyInstance = (ManFactory) markCompany.getProxyInstance();

        proxyInstance.setStore();
    }
}
