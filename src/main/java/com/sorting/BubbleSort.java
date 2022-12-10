package com.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BubbleSort ob = new BubbleSort();
	        int arr[] = { 4,3,7,1,5 };
	        ob.bubbleSort(arr);
	        System.out.println("Sorted array");
	        ob.printArray(arr);

	}
	
	/*
	 * public int solve(ArrayList<Integer> A) {
	 * 
	 * Collections.sort(A); int temp=0; int n = A.size(); for(int i=n-1;i>=0;i--){
	 * 
	 * if(A.get(i)-A.get(i-1)!=1) { temp =1; break; } } if(temp==1) return 0; return
	 * 1; }
	 */
	
	void bubbleSort(int arr[]) {
		int n=arr.length;
		boolean swaped = false;
		for (int i = 0; i < n-1; i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swaped = true;
					swap(arr,j+1,j);
				}
			}
			if(swaped == false) break;
		}
		
	}
	
	 void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	 void swap(int arr[],int i,int j) {
		 
		 int temp = arr[i];
		 arr[i]=arr[j];
		 arr[j] =temp;
		 
	 }

}
