package com.hashMap;

import java.util.HashMap;

public class CountSunArraySumK {
	
	 public static int subarraySum(int[] nums, int k) {
		 
		 int sum =0;
		 int count =0;
		 
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 
		 map.put(0, 1);
		 
		 for (int i : nums) {
			 
			 sum +=i;
			 
			 if(map.containsKey(sum -k)) {
				 count +=map.get(sum -k);
			 }
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		 
		 return count;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3};
		
		System.out.println(subarraySum(arr,3));

	}

}
