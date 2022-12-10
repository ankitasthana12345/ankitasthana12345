package com.stackDS;

import java.util.Stack;

public class DoubleTrouble {
    public static String solve(String A) {
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<A.length();i++){
            if(!stack.isEmpty() && stack.peek()==A.charAt(i)){
                stack.pop();
            }else{
                stack.push(A.charAt(i));
            }
        }

            StringBuilder sb = new StringBuilder();
           while(!stack.isEmpty()){
               sb.append(stack.peek());
               stack.pop();
           }
            return sb.reverse().toString();
        }

    public static void main(String[] args) {
        String st = "abccbc";
        String ans = solve(st);
        System.out.println(ans);
    }
}
