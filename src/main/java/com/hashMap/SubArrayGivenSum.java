package com.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubArrayGivenSum {

	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		
		int start =0;
		int end =-1;
		int curr_sum=0;
		HashMap<Integer, Integer>  mapa = new HashMap<Integer, Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		

		for (int i = 0; i < A.size(); i++) {
			curr_sum +=A.get((int) i);
			
			if(curr_sum -B==0) {
				start = 0;
				end = i;
				break;
			}
			// Index
			if(mapa.containsKey(curr_sum -B)) {
				start = mapa.get(curr_sum-B) +1;
				end = i;
				break;
			}
			
			mapa.put(curr_sum, i);
		}
		  
		   if(end ==-1) {
			   ans.add(-1);
			   return ans;
		   }
		    
		    ans.add(start);
		    ans.add(end);
	        return ans;
	        
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> as = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
         
         System.out.println(solve(as, 5));
	}

}
