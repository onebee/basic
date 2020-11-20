package com.one.thread;


public class SingleMan {
    /**
     * volatile 的目的是为了 确保初始化完成
     */
    public static volatile SingleMan singleMan;
    private SingleMan() {
    }

    public static SingleMan getInstance() {
        if (singleMan == null) {
            synchronized (SingleMan.class) {
                if (singleMan == null) {
                    singleMan = new SingleMan();
                }
            }
        }
        return singleMan;
    }
}
