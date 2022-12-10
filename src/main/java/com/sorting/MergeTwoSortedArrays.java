package com.sorting;

public class MergeTwoSortedArrays {
	 static int res[];
    public  int[] solve(final int[] A, final int[] B) {
        int m = A.length;
        int n = B.length;
        res = new int[n+m];
        
        int p1=0;//A point
        int p2=0;//B point
        int p3=0; //C point
        
        while(p1<m && p2<n){
            if(A[p1]<B[p2]){
                res[p3] = A[p1];
                p3++;
                p1++;
            }else{
                res[p3]=B[p2];
                p3++;
                p2++;
            }
        }
        
        while(p1<m){
            res[p3]=A[p1];
            p1++;
            p3++;
        }
        while(p2<n){
            res[p3]=B[p2];
            p2++;p3++;
        }
        
        return res;
    }
  
     void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A= {-4, -3, 0};
		int[] B= {2};
		
		MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
		obj.solve(A, B);
		obj.printArray(res);
		


	}

}
