package com.sorting;

import java.util.Arrays;

public class CountingSort {
	
	static int[] countElements(int[] input, int k) {
	    int[] freq = new int[k + 1];
	    Arrays.fill(freq, 0);

	    for (int i : input) {
	    	freq[i] += 1;
	    }

	    for (int i = 1; i < freq.length; i++) {
	    	freq[i] += freq[i - 1];
	    }

	    return freq;
	}
	
	 static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int k = 5;
		    int[] input = { 4, 3, 2, 5, 4, 3, 5, 1, 0, 2, 5 };
		    
		   int[] c = CountingSort.countElements(input, k);
		   CountingSort.printArray(c);
		  
	

	}

}
