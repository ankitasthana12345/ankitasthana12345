/*
Given a sorted array A of size N and a target value B, return the index (0-based indexing) if the target is found.
        If not, return the index where it would be if it were inserted in order.

        NOTE: You may assume no duplicates in the array. Users are expected to solve this in O(log(N)) time.
*/



        package com.binarySerach;

public class BinarySearch {

    public int searchInsert(int[] A, int B) {
        int n = A.length;
        int low=0; int high =n-1;

        while(low<=high){
          //  int mid = low +(high-low)/2;
              int mid= (high+low)/2;
            if(A[mid]==B) return mid;

            if(B>A[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }

        return low;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        BinarySearch bs = new BinarySearch();
        int ans1=bs.searchInsert(arr,5);
        System.out.println(ans1);
        int arr2[] = {1, 3, 5, 6};
        int ans2=bs.searchInsert(arr2,7);
        System.out.println(ans2);
    }
}
