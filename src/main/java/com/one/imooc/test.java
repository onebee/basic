package com.one.imooc;

public class test {


    public static void main(String[] args) {


        String emoji = "😆";

        System.out.println(emoji.length());

        Foo foo = new Foo(){
            @Override
            int bar() {
                return super.bar();
            }
        };
    }
}
