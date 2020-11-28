package com.one.xiang.generic;

public class Generic3 {



    static class Person {
        @Override
        public String toString() {
            return "Person";
        }
    }
    static class Fruit {
        @Override
        public String toString() {
            return "Fruit";
        }
    }
    static class Apple extends Fruit {
        @Override
        public String toString() {
            return "Apple";
        }
    }
    static class GenericTest<T> {
        public void show_1(T t) {
            System.out.println(t.toString());
        }
        public <E> void show_3(E t) {
            System.out.println(t.toString());
        }
        public <T> void show_2(T t) {
            System.out.println(t.toString());
        }
        public <E> void show_25(T t) {
            System.out.println(t.toString());
        }
    }
    public static void main(String[] args) {
        Apple apple = new Apple();
        Person person = new Person();
        GenericTest<Fruit> genericTest = new GenericTest<>();
        genericTest.show_1(apple);
        genericTest.show_2(person);
        genericTest.show_3(person);
        genericTest.show_3(apple);
    }

}
