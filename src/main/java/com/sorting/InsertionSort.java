package com.sorting;

public class InsertionSort {
	
	 void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	 void insertionsort(int []arr) {
		 int n = arr.length;
		 
		 for (int i = 1; i < n; i++) {
			int temp=arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1] =arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
		
			
		}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = { 8,4,1, 5, 9,2};
		 
	        InsertionSort ob = new InsertionSort();
	        ob.insertionsort(arr);
	 
	        ob.printArray(arr);

	}

}
