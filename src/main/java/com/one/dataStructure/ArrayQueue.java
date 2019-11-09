package com.one.dataStructure;

import java.util.Arrays;

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
     *
     * @param capacity
     */
    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }


    // 入队
    public boolean enqueue(String item) {
        // tail == n 表示队列末尾没有空间了
        if (tail == n) {

            //   tail == n && head==0 表示队列没有空间了
            if (head == 0) return false;
            // 数据搬移
            for (int i = head; i < tail; i++) {
                items[i-head] = items[i];
            }
            // 搬移之后更新 head 和 tail
            tail = tail-head;
            head =0;

        }


        items[tail] = item;
        ++tail;
        return true;
    }

    // 出队
    public String dequeue() {
        // 队列为空
        if (head == tail) return null;
        String ret = items[head];
        ++head;
        return ret;

    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "items=" + Arrays.toString(items) +
                '}' + "  ---- head : " + head + "  tail : " + tail;
    }
}
