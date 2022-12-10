package com.hashMap;

import java.util.HashMap;

public class LongestLengthSubArrayWithSumZero {
	
	public static int solution(int[] arr) {
		int maxlen =Integer.MIN_VALUE;
		int sum =0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(sum,-1);
		
		for(int i=0;i< arr.length;i++ ) {
			sum +=arr[i];
			if(map.containsKey(sum)){
				int len = i  - map.get(sum);
				maxlen=	Math.max(maxlen, len);
			}else {
				map.put(sum, i);
			}
		}
		
		return maxlen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
		
		int ans =solution(arr);
		System.out.println(ans);
	}

}
