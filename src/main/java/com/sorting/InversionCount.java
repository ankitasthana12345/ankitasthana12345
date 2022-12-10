package com.sorting;

import java.util.Arrays;

public class InversionCount {
	
	public static int solve(int[] A) {
		int n=A.length-1;
		return inversionCount(A,0,n);
    }
	
	static int inversionCount(int[] A,int l,int r) {
		long count=0;
		
		  if(l==r) return 0;
          // Find the middle point
          int m =l+ (r-l)/2;

          // Sort first and second halves
          count +=inversionCount(A, l, m);
          count +=inversionCount(A, m + 1, r);

          // Merge the sorted halves
          count +=mergeArrayCountInv(A, l, m, r);
		
		return (int) count;
		
	}

	private static int mergeArrayCountInv(int[] arr, int ll,
		    int mm, int rr) {
		    int[] left = Arrays.copyOfRange(arr, ll, mm + 1);

		    int[] right = Arrays.copyOfRange(arr, mm + 1, rr + 1);

		    int ii = 0, jj = 0, kk = ll, swaps = 0;

		    while (ii < left.length && jj < right.length) {
		      if (left[ii] <= right[jj])
		        arr[kk++] = left[ii++];
		      else {
		        arr[kk++] = right[jj++];
		        swaps += left.length -ii;
		      }
		    }
		    while (ii < left.length)
		      arr[kk++] = left[ii++];
		    while (jj < right.length)
		      arr[kk++] = right[jj++];
		    return swaps;
		  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 45, 10, 15, 25, 50};
		System.out.println(solve(arr));

	}

}
