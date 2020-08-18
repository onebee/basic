package com.one.genericity.xiang;

import java.io.Serializable;

public class GenericMethod {

    public <T> T genericMethod(T... a) {
        return a[a.length / 2];
    }


//    public <T extends Comparable<Integer>> T addT(T a, T b){
//        return a+b;
//    }

    public static <T extends Comparable & Serializable> T min(T a, T b) {
        if (a.compareTo(b) > 0) return a;
        else return b;
    }

    public static void main(String[] args) {

        Integer min1 = GenericMethod.min(1, 5);
        String min = GenericMethod.min("2", "5");

        System.out.println(min);

    }
}
