package com.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test123 {
	
public int solve(ArrayList<Integer> A) {
        
        long n = A.size();
        long sum =0;
        
        HashSet<Long> set = new HashSet<Long>();
        set.add(sum);
        
        for(long i=0;i<n;i++){
            sum +=(long)A.get((int) i);
            if(set.contains(sum)){
                return 1;
            }else{
                set.add(sum);
            }
            
        }
         return 0;
    }

    public static void main(String[] arg) {
    	
    	HashMap<String, Integer> hm =new HashMap<String, Integer>();
    	
    	hm.put("z", 2);
    	hm.put("a", 1);
    	hm.put("c", 1);

    	
    	System.out.println(hm.getOrDefault("zm", 4));
    	
    }

}
