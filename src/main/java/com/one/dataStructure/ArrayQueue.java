package com.one.dataStructure;

/**
 * 用数组实现的队列
 */
public class ArrayQueue {


    private String[] items;
    private int n;

    // 队头下标
    private int head = 0;

    // 队尾下标
    private int tail = 0;

    /**
     * 申请大小为capacity 的数组
     * @param capacity
     */
    public ArrayQueue(int capacity) {
        items = new String[capacity];
    }


    // 入队
    public boolean enqueue(String item) {
        // 队列已满
        if (tail==n)return false;
        items[tail] = item;
        ++tail;
        return true;
    }

    // 出队
    public String dequeue() {
        // 队列为空
        if (head==tail)return null;
        String ret = items[head];
        ++head;
        return ret;

    }
}
