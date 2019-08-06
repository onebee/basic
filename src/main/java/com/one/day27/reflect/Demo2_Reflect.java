package com.one.day27.reflect;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo2_Reflect {

    public static void main(String[] args) throws ClassNotFoundException, IOException, IllegalAccessException, InstantiationException {

        /**
        Juicer j = new Juicer();
        j.run(new Apple());
        j.run(new Orange());
        */


        BufferedReader br = new BufferedReader(new FileReader("config.properties"));
        Class clazz = Class.forName(br.readLine());
        Fruit f = (Fruit) clazz.newInstance();
        Juicer j = new Juicer();
        j.run(f);
    }
}


interface Fruit {
    void squeeze();
}

class Apple implements Fruit {

    public void squeeze() {
        System.out.println("榨出一杯苹果汁");
    }

}

class Orange implements Fruit {
    public void squeeze() {
        System.out.println("榨出一杯橘子汁");

    }
}

class Juicer {
//    public void run(Apple apple) {
//        apple.squeeze();
//    }
//
//    public void run(Orange o) {
//        o.squeeze();
//    }

    public void run(Fruit fruit) {
        fruit.squeeze();
    }
}
