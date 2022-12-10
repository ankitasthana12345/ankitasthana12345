package com.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShaddyDistance {
	
	public static int solve(ArrayList<Integer> A) {
		
	   int diff =0;
	   int n = A.size();
	   
	   for(int i=0;i<n;i++) {
		   for(int j=i+1;j<n;j++) {
			   if(A.get(i)==A.get(j)) {
				   diff = Math.abs(j-i);
			   }
		   }
	   }
		
		return diff;
    }
	
	
	public static int solve2(ArrayList<Integer> A) {
		
		   int minDis =Integer.MAX_VALUE;
		   int n = A.size();
		   HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		   for(int i=0;i<n;i++) {
			   
			   int x = A.get(i);
			   if(hm.containsKey(x)) {
				   minDis = Math.min(minDis, i - hm.get(x));
			   }

			   hm.put(x,i);
		   }
		   
		   

			return minDis ==Integer.MAX_VALUE?-1:minDis;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> as = new ArrayList<Integer>(Arrays.asList(1,2,3,6,1,2,3,2,1));
		int ans =solve2(as);
		System.out.println(ans);

		ArrayList<Integer> as1 = new ArrayList<Integer>(Arrays.asList(7, 1, 3, 4, 1, 7));
		int ans1 = solve2(as1);
		System.out.println(ans1);

	}

}
