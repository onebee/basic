package com.one.play;

public class Array<E> {

    private E[] data;
    private int size;

    public Array(int capacity) {
       data = (E[])new Object[capacity];
       size = 0;
    }

    public Array() {
        this(10);
    }

    // ��ȡ���������
    public int getCapacity() {
        return data.length;
    }

    //��ȡ������Ԫ�صĸ���
    public int getSize() {
        return size;
    }

    // ���������Ƿ�Ϊ��
    public boolean isEmpty(){
        return size==0;
    }

    // ��index ������λ�ò���һ����Ԫ��e
    void add(int index,E e) {
        if (index<0 || index > size)
           throw  new IllegalArgumentException("Add failed ! Require index=>0 and index <=size");

        if (size==data.length)
            resize(2*data.length);

    }



    // ������Ԫ�غ����һ����Ԫ��

    // ������Ԫ��ǰ���һ����Ԫ��

    // ��ȡ index ����λ�õ�Ԫ��

    // �޸� index ����λ�õ�Ԫ�� Ϊ e

    // �����������Ƿ���Ԫ��e

    // ����������Ԫ��e���ڵ����������������Ԫ��e���򷵻�-1


    // ��������ɾ��indexλ�õ�Ԫ��, ����ɾ����Ԫ��

    // ��������ɾ����һ��Ԫ��, ����ɾ����Ԫ��


    // ��������ɾ�����һ��Ԫ��, ����ɾ����Ԫ��

    // ��������ɾ��Ԫ��e


    // ������ռ���������newCapacity��С
    private void resize(int capacity) {

    }

}
