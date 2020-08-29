package com.one.proxy;

public class StudentImp implements Student {
    @Override
    public void login() {
        System.out.println("登录");
    }

    @Override
    public void submit() {
        System.out.println("提交");
    }
}
