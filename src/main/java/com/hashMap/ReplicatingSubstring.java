package com.hashMap;

import java.util.HashMap;

public class ReplicatingSubstring {

    public int solve(int A, String B) {

        int n = B.length();
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        for (int i = 0; i < n; i++) {
            char ch = B.charAt(i);
             if(freq.containsKey(ch)){
                 freq.put(ch,freq.get(ch)+1);
             }else{
                 freq.put(ch,1);
             }
        }

       for(Character c : freq.keySet()){
           int val = freq.get(c);

           if((val % A)!=0){
               return -1;
           }
       }

       return 1;
    }

    public static void main(String[] args) {
        String B = "bbaabb";
        int A =2;
        ReplicatingSubstring rps = new ReplicatingSubstring();
        int x = rps.solve(A,B);
        System.out.println(x);

    }
}
