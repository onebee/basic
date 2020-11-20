package com.one.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo implements TestDemo {


    ReentrantLock lock = new ReentrantLock();


    ReentrantReadWriteLock lock1 = new ReentrantReadWriteLock();

    Lock readLock = lock1.readLock();
    Lock writeLock = lock1.writeLock();



    private int x = 0;
    private void set() {
        lock.lock();


        lock.unlock();
    }
    @Override
    public void runTest() {

    }
}
