package com.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PalindromeCheck {
	
public static int solve(String A) {
        
        HashMap<Character,Integer> freq = new HashMap<Character,Integer>();
        
        int n = A.length();
        int count=0;
        for(int i=0; i <n;i++){
        	Character ch=A.charAt(i);
            if(!freq.containsKey(ch)){
                freq.put(ch,1);
            }else{
                freq.put(ch,freq.get(ch)+1);
            }
        }
        
       for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
    	   if(entry.getValue()%2==1) {
    		   count++;
    	   }
       }
        
        if(count >0){
            return 0;
        }
        
        return 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcabc";
		
		System.out.println(solve(s));

	}

}
