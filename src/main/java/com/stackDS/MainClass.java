package com.stackDS;

import java.util.Stack;

public class MainClass {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.size());
        s.empty();

    }
}
