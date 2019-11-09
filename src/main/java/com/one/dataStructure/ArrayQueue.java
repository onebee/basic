package com.one.dataStructure;

import java.util.Arrays;

/**
 * ������ʵ�ֵĶ���
 */
public class ArrayQueue {


    private String[] items;
    private int n;

    // ��ͷ�±�
    private int head = 0;

    // ��β�±�
    private int tail = 0;

    /**
     * �����СΪcapacity ������
     *
     * @param capacity
     */
    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }


    // ���
    public boolean enqueue(String item) {
        // tail == n ��ʾ����ĩβû�пռ���
        if (tail == n) {

            //   tail == n && head==0 ��ʾ����û�пռ���
            if (head == 0) return false;
            // ���ݰ���
            for (int i = head; i < tail; i++) {
                items[i-head] = items[i];
            }
            // ����֮����� head �� tail
            tail = tail-head;
            head =0;

        }


        items[tail] = item;
        ++tail;
        return true;
    }

    // ����
    public String dequeue() {
        // ����Ϊ��
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
