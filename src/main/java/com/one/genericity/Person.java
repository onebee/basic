package com.one.genericity;

//���з��͵���
public class Person<E> {

    E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    // ���з��͵ķ���
    public <T> void show2(T t) {
        System.out.println(t);
    }


}
