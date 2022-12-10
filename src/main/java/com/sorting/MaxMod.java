package com.sorting;

public class MaxMod {
	
	public static int solve(int[] A) {
		int n=A.length;
		int first=Integer.MIN_VALUE; int second = Integer.MIN_VALUE;
		if(n==0) return 0;
		
		for(int i=0;i<n;i++) {
			if(A[i]>first) {
				second=first;
				first=A[i];
			}else if(second<A[i] && A[i]!=first){
				second =A[i];
			}
		}
		
		if(second!=Integer.MIN_VALUE) return second;
		
		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1, 2, 44, 3};
		
		System.out.println(solve(arr));
	}

}
