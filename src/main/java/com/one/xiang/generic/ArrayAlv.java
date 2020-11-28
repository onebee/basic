package com.one.xiang.generic;

import java.io.Serializable;
import java.util.ArrayList;

public class ArrayAlv {

    /**
     * 可以类与接口混用,类需写在前面
     * @param t1
     * @param t2
     * @param <K>
     * @param <T>
     * @return
     */
    public static <K,T extends   Comparable & Serializable> T min(T t1, T t2) {
        return t1.compareTo(t2) > 0 ? t2 : t1;
    }
    static class Test{}
    public static void main(String[] args) {
        double a=9;
        double b= 6;
        System.out.println(min(a, b));
    }

}
