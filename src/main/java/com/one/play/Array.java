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

    // 获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    //获取数组中元素的个数
    public int getSize() {
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size==0;
    }

    // 在index 索引的位置插入一个新元素e
    void add(int index,E e) {
        if (index<0 || index > size)
           throw  new IllegalArgumentException("Add failed ! Require index=>0 and index <=size");

        if (size==data.length)
            resize(2*data.length);

    }



    // 向所有元素后添加一个新元素

    // 向所有元素前添加一个新元素

    // 获取 index 索引位置的元素

    // 修改 index 索引位置的元素 为 e

    // 查找数组中是否有元素e

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1


    // 从数组中删除index位置的元素, 返回删除的元素

    // 从数组中删除第一个元素, 返回删除的元素


    // 从数组中删除最后一个元素, 返回删除的元素

    // 从数组中删除元素e


    // 将数组空间的容量变成newCapacity大小
    private void resize(int capacity) {

    }

}
