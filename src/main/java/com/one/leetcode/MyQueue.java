package com.one.leetcode;

class MyQueue {

    int[] items;
    int count;
    int n;
    /** Initialize your data structure here. */
    public MyQueue() {
        items = new int[10];
        n = 10;
        count =0;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        items[count] = x;
        ++count;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int tmp = items[count-1];
        --count;
        return tmp;
    }

    /** Get the front element. */
    public int peek() {
        return items[count-1];
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return count==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
