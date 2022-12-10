package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumUnsortedSubarray {
	
	  public static int[] subUnsort(int[] A) {
	        int n = A.length;
	        int i = 0, j = n - 1;
	        while (i < n - 1 && A[i] <= A[i + 1]) {
	            i++;
	        }
	        while (j > 0 && A[j] >= A[j - 1]) {
	            j--;
	        }
	        if (i == n - 1) { // if array is already sorted, output -1
	            int ans[] = new int[1];
	            ans[0] = -1;
	            return ans;
	        }
	        int mn = A[i + 1], mx = A[i + 1];
	        for (int k = i; k <= j; k++) {
	            mx = Math.max(mx, A[k]);
	            mn = Math.min(mn, A[k]);
	        }
	        int l = 0, r = n - 1;
	        while (A[l] <= mn && l <= i) {
	            l++;
	        }
	        while (A[r] >= mx && r >= j) {
	            r--;
	        }
	        int ans[] = new int[2];
	        ans[0] = l;
	        ans[1] = r;
	        return ans;

	    }
	  
	  static void  printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	  
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1, 3, 2, 4, 5};
	//	subUnsort(arr);
		printArray(subUnsort(arr));
		
	}

}
