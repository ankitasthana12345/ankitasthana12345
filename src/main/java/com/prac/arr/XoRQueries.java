package com.prac.arr;

import java.util.ArrayList;

public class XoRQueries {
	
  public int[][] solve(int[] A, int[][] B) {
	 
	 int n = A.length;
	 int [] prefixArray = new int[n+1];
	 
	 prefixArray[0]=A[0];
	 
	 for (int i = 1; i <=A.length; i++) {
		 
		 prefixArray[i] = prefixArray[i-1]+A[i];
		 
		 
	}
     
	return B;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
