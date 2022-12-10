package com.stackDS;

public class MyStack {

    int a[];
    int top;
    int capacity;

    MyStack(int capacity){
        this.capacity=capacity;
        top =-1;
        a= new int[capacity];
    }

    void push(int data) throws Exception {
        if(top==capacity-1){
            throw new Exception("capacity is full");
        }
        top ++;
        a[top]=data;
    }

    int pop() throws Exception {
        if(top==-1){
            throw new Exception("Stack is empty");
        }
        int res = a[top];
        top--;
        return res;
    }

    int peek() throws Exception {
        if(top==-1){
            throw new Exception("Stack is empty");
        }
        int[] res = new int[a.length];
        return res[top];
    }

    boolean isEmpty(){
        return top==-1;
    }
}
