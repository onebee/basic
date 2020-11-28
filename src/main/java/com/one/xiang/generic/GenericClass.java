package com.one.xiang.generic;

public class GenericClass<T> {

    T t;

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        String str = "onebit";
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setT(str);
        System.out.println(genericClass.getT());

    }
}
