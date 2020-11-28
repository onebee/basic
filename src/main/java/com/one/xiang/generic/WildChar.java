package com.one.xiang.generic;

import com.sun.scenario.effect.impl.sw.java.JSWPhongLighting_SPOTPeer;
import com.sun.tools.corba.se.idl.constExpr.Or;

public class WildChar {

    public static void print(GenericType<Fruit> fruitGenericType) {
        System.out.println(fruitGenericType.getData());
    }

    public void print2(GenericType<? extends  Fruit> f){
        System.out.println(f.getData());
    }

    public void printSuper(GenericType<? super  Apple> f){

        System.out.println(f.getData());
    }

    public void use() {
        GenericType<Fruit> f = new GenericType<>();
        print2(f);
        GenericType<Apple> a = new GenericType<>();
        print2(a);

        GenericType<Hongfushi> h = new GenericType<>();
        print2(h);

        GenericType<? extends Fruit> c = null;

        Apple apple = new Apple();
        Fruit fruit = new Fruit();


        Fruit data = c.getData();
    }

    public void useSuper() {
        GenericType<Fruit> fruitGenericType = new GenericType<>();
        GenericType<Apple> appleGenericType = new GenericType<>();
        GenericType<Hongfushi> hongfushiGenericType = new GenericType<>();
        GenericType<Orange> orangeGenericType = new GenericType<>();

        printSuper(fruitGenericType);
        printSuper(appleGenericType);
//        printSuper(hongfushiGenericType);
    }

    public static void main(String[] args) {

        WildChar wildChar = new WildChar();
        wildChar.use();
    }
}
