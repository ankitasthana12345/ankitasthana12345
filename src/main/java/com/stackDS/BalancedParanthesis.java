package com.stackDS;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParanthesis {
    public static int solve(String A) {

        HashMap<Character,Character> mp = new   HashMap<Character,Character>();
        mp.put('(', ')');
        mp.put('{','}');
        mp.put('[',']');

        Stack<Character> st = new Stack<Character>();

        for(int i =0;i<A.length();i++){
            char c = A.charAt(i);
            if(mp.containsKey(c)){
                st.push(c);
            }else if(!st.isEmpty() && c==mp.get(st.peek())){
                st.pop();
            }else{
                return 0;
            }
        }


        return st.isEmpty() ? 1:0;
    }

    public static void main(String[] args) {
        String s ="{}()[]";
        int ans = solve(s);
        System.out.println(ans);
    }
}
