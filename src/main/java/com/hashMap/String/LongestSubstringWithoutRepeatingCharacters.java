package com.hashMap.String;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String A) {
        int  max_length =0;
        int n = A.length();
        HashMap<Character,Integer> seen = new HashMap<>();
        int start=0;
        for(int end=0; end<n;end++){
             char c= A.charAt(end);
            if(seen.containsKey(c)){
                start = Math.max(start,seen.get(c)+1);
            }
            seen.put(c,end);
            max_length = Math.max(max_length,end-start+1);
        }
        return max_length;
    }

    public static void main(String[] args) {
        String ans = "AaaA";
        int x = lengthOfLongestSubstring(ans);
        System.out.println(x);
    }
}
