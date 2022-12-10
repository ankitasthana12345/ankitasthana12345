package com.prac.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubArray {
	
	public static int maxSubArray(final List<Integer> A) {
        int n = A.size();
        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int sum = 0;

            for(int j=i;j< n;j++){
                sum +=A.get(j);
            }
            
            if(sum > maxsum){
                maxsum =sum;
            }
        }
        return maxsum;
    }
	
public static int solve(int[] A) {
        
        int n = A.length;
        Arrays.sort(A);
        
        if(A[n-1] ==0 ) return 1;
        for(int i=0; i<n;i++){
            if(A[i] == n-i-1 && A[i]!=A[i+1]) return 1;
        
            
        }
        
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * List<Integer> list = new ArrayList<>( Arrays.asList(1,2,3,4));
		 * System.out.println(maxSubArray(list));
		 */
		
		int A[] = {5,6,2};
		System.out.println(solve(A));
       
	}

}
