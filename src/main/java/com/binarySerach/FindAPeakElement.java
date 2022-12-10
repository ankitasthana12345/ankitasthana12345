package com.binarySerach;

public class FindAPeakElement {

    public int solve(int[] A) {
        int n = A.length;
        if(n==1) return 0;
        if(A[0]>A[1]) return A[0];
        if(A[n-1]>A[n-2]) return A[n-1];

        int l=1;int r= n-2;

        while(l<=r){
            int mid = (l+r)/2;
            if(A[mid]>=A[mid-1] && A[mid]>=A[mid+1]){
                return A[mid];
            }else if(A[mid]>A[mid-1]){
                l=mid+1;
            }else{
                r=mid-1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
       int arr[] ={5, 17, 100, 11};
       FindAPeakElement fp = new FindAPeakElement();
       int ans =fp.solve(arr);
       System.out.println(ans);
        int arr1[] ={1, 2, 3, 4, 5};
        int ans2=fp.solve(arr1);
        System.out.println(ans2);
    }
}
