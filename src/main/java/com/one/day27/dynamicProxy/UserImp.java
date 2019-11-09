package com.one.day27.dynamicProxy;

public class UserImp implements User {


    @Override
    public void add() {
//        System.out.println("权限校验");
        System.out.println("this is add");
//        System.out.println("日志记录");
    }

    @Override
    public void delete() {
//        System.out.println("权限校验");
        System.out.println("this is delete");
//        System.out.println("日志记录");
    }
}
