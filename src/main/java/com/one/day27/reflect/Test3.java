package com.one.day27.reflect;

public class Test3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        Studnet studnet = new Studnet("张三", 25);
        System.out.println(studnet);
        Tool.setProperty(studnet, "name", "哈哈");
        System.out.println(studnet);

    }
}

class Studnet{

    private String name;
    private int age;

    public Studnet() {
    }

    public Studnet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studnet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
