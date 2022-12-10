package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test {
	
	 public static int solve(int[] A, int B) {
	        
	        int n =A.length;
	        if(n==0 || B==0) return 0;




	        
	        
	        int ans = Integer.MAX_VALUE;
	        
	        Arrays.sort(A);
	        for(int i=0;i<=n-B;i++){
	        int diff=A[i+B-1]-A[i];
	           ans=Math.min(ans,diff);
	        }
	        return ans;
	    }

	public int solve5(ArrayList<Integer> A) {

		int n=A.size();
		int maxfreq =0;

		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		for(int i=0;i<n;i++){
			int x=A.get(i);
			map.put(x,map.getOrDefault(x,0)+1);

			maxfreq=Math.max(maxfreq,map.get(x));
		}

		return maxfreq;
	}

		/*
		 * public static void main(String[] args) { // TODO Auto-generated method stub
		 * 
		 * int A[] = {3, 4, 1, 9, 56, 7, 9, 12}; int B=5;
		 * System.out.println(solve(A,B));
		 * 
		 * }
		 */
	 
	 public static void main(String args[])
	 {
	 int x = 9;
	 if (x == 9)
	 {
	// int  x= 8;
	 System.out.println(x);
	 }
	 }

}
