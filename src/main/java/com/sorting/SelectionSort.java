package com.sorting;

import java.util.Iterator;

public class SelectionSort {
	
	
	public void selectionsort(int[] arr) {
		
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
		 int min_idx =i;//indexing 
			
			for (int j = i+1; j < n; j++) {
				
				if(arr[min_idx]>arr[j]) {
					min_idx =j;
				}
				
			}
			 
			//swap(A[i],A[j])
			int temp = arr[min_idx];
			arr[min_idx] =arr[i];
			arr[i]=temp;
		}
		
	}
	
	// Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort obj = new SelectionSort();
		int arr[] = {64,25,12,22,11};
        obj.selectionsort(arr);
        System.out.println("Sorted array");
        obj.printArray(arr);

	}

}
