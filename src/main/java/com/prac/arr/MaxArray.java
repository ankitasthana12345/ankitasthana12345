package com.prac.arr;

import java.util.ArrayList;

public class MaxArray {
	
    static int arr[] = {10, 324, 45, 9808, 9808};

    static int N = arr.length;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> as = new ArrayList<Integer>();
		as.add(1);
		as.remove(as);
		as.add(2);
		
		System.out.println(as);
    //    System.out.println("Largest in given array is " + largest());


	}

	private static int largest() {
		// TODO Auto-generated method stub
	
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
	    int count =0;
	    
	    for(int i=0;i<N;i++) {
	    	if(max == arr[i]) {
	    		count++;
	    	}
	    }
		
		return N - count;
	}
	
}
