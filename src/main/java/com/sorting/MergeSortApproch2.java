package com.sorting;

public class MergeSortApproch2 {
	
	void mergesort(int arr[], int start,int end) {
		
		 
        if(start==end) return;
        // Find the middle point
        int mid =start+ (end - start)/2;

        // Sort first and second halves
        mergesort(arr,start , mid);
        mergesort(arr, mid+ 1, end);

        // Merge the sorted halves
        merge(arr, start, mid, end);
    
	
}
	public void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            }
            else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= end) {
            temp[k++] = nums[j++];
        }

        for (int m = start; m <= end; m++) {
            nums[m] = temp[m -start];
        }
    }

	
	
	 /* A utility function to print array of size n */
    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = { 12, 11, 13, 5, 6, 7 };
		 
	        System.out.println("Given Array");
	        printArray(arr);
	        
	        MergeSortApproch2 ob = new MergeSortApproch2();
	        ob.mergesort(arr, 0, arr.length - 1);
	        System.out.println("\nSorted array");
	        printArray(arr);

	}

}
