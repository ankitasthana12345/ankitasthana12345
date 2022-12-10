package com.hashMap;

import java.util.HashMap;

public class CountSubArrayWithSumZero {
	
	public static int solution(int[] arr) {
		int count =0;
		int sum =0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(sum,1);
		
		for(int i=0;i< arr.length;i++ ) {
			sum +=arr[i];
			if(map.containsKey(sum)){
				count += map.get(sum);
				map.put(sum, map.get(sum) +1);
			}else {
				map.put(sum, 1);
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,0,5,5,0,0};
		
		System.out.println(solution(arr));

	}

}
