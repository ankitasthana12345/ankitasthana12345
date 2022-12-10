package com.hashMap;

import java.util.HashMap;

public class GoodPairs {
	
public static int numIdenticalPairs(int[] nums) {
	int count=0;
	
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	for (int i = 0; i < nums.length; i++) {
		
		if(map.containsKey(nums[i])) {
			count +=map.get(nums[i]);
			map.put(nums[i], map.get(nums[i])+1);
			
		}else {
			map.put(nums[i], 1);
		}
	}
	 
	return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,1,1,3};
		
		System.out.println(numIdenticalPairs(arr));
	}

}
