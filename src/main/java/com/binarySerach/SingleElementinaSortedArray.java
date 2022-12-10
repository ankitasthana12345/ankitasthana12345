/*Given a sorted array of integers A where every element appears twice except for one element which appears once, find and return this single element that appears only once.

        NOTE: Users are expected to solve this in O(log(N)) time.*/
package com.binarySerach;

public class SingleElementinaSortedArray {
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
}
