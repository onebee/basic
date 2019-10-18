package com.one.day27;

public class Tst {
    public static void main(String[] args) {




        Animate animate = new Animate() {
            @Override
            public void eat() {
                System.out.println("eat");
            }
        };

        animate.eat();

        String str = "hello onebit";
        int bit = str.indexOf("bit");
        System.out.println(bit);
    }
}
