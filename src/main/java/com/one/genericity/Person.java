package com.one.genericity;

//含有泛型的类
public class Person<E> {

    E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    // 含有泛型的方法
    public <T> void show2(T t) {
        System.out.println(t);
    }


}
