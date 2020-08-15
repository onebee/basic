package com.one.jiuzhang;


class Wrapper {
    int num;

    public Wrapper(int num) {
        this.num = num;
    }
}
public class test {

    public static void main(String[] args) {
        int a = 10;
        Wrapper wrapper = new Wrapper(10);
        add(a);
        add(wrapper);
        System.out.println("a="+a);
        System.out.println("wrapper num="+wrapper.num);
    }


    static void add(Wrapper wrapper) {
        wrapper.num ++;
    }

    static void add(int num) {
        num++;
    }

}
