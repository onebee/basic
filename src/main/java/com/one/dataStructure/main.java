package com.one.dataStructure;

public class main {
    public static void main(String[] args) {


        ArrayQueue queue = new ArrayQueue(15);
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");
        queue.enqueue("four");
        queue.enqueue("five");


        System.out.println(queue.toString());

        queue.dequeue();
        System.out.println(queue.toString());

    }
}
