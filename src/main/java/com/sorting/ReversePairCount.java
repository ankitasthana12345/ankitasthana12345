package com.sorting;

public class ReversePairCount {
	
	public static int solve(int[] A) {
		int n=A.length-1;
		return reversePaircount(A,0,n);
    }
	
	 public static int reversePaircount(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		if(start==end) return 0;
		int count=0;
		int mid = start+(end-start)/2;
		count +=reversePaircount(arr,start,mid);
		count +=reversePaircount(arr,mid+1,end);
		count +=merge(arr,start,mid,end);
		
		return count;
	}

     static int merge(int[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
		  int count=0;
		  int i=start;
		  int j=mid+1;
		  int k=0;
		  int []temp = new int[end-start+1];
		  while(i<=mid &&j<=end) {
			  if((long)arr[i] > (long)2 *arr[j]) {
			      
			      count +=mid-i+1;
				  j++;
			  }else {
				  i++;
			//	  count +=(j-mid-1);
			  }
		  }
		  
		//  count +=(mid-i+1)*(end-mid);
		  
		  int i1=start;
		  int j1=mid+1;
		  while(i1<=mid && j1<=end) {
			  if(arr[i1]<arr[j1]) {
				  temp[k++] = arr[i1++];
			  }else {
				  temp[k++] = arr[j1++];
			  }
		  }
		  
		  while(i1<=mid) {
			  temp[k++] = arr[i1++];
		  }
		  
		  while(j1<=end) {
			  temp[k++] = arr[j1++];
		  }
		  
		  for (int m = start; m <= end; m++) {
	            arr[m] = temp[m -start];
	        }
		return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = { 1,3,2,3,1};
		 int x=solve(arr);
		 System.out.println(x);

	}

}
