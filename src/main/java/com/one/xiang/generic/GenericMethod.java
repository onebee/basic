package com.one.xiang.generic;

public class GenericMethod {

    public <T> T hello(T...a) {
        return a[a.length/2];
    }

    public static void main(String[] args) {
        GenericMethod method = new GenericMethod();
        int hello = method.hello(1,2,3);
        System.out.println(hello);
    }
}
