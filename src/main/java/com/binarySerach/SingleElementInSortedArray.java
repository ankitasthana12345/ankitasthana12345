package com.binarySerach;

public class SingleElementInSortedArray {

    public int solve(int[] A) {
        int start =0; int end = A.length -1;
        if(A[start]!=A[start+1]) return A[0];
        if(A[end]!=A[end-1]) return A[end];

        while(start<=end){
            int mid = (start+end)/2;
            if(A[mid-1]!=A[mid] && A[mid]!=A[mid+1]) return A[mid];
            if(A[mid]==A[mid+1] && mid%2==0 || A[mid]==A[mid-1] && mid%2!=0) {
                start=mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8};
        SingleElementInSortedArray sbr= new SingleElementInSortedArray();
        int x =sbr.solve(arr);
        System.out.println(x);
    }
}
