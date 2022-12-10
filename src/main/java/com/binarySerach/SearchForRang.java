/*Given a sorted array of integers A(0 based index) of size N, find the starting and the ending position of a given integer B in array A
        Your algorithm's runtime complexity must be in the order of O(log n).
        Return an array of size 2, such that the first element = starting position of B in A and
        the second element = ending position of B in A, if B is not found in A return [-1, -1].*/

package com.binarySerach;

public class SearchForRang {

    public int[] searchRange(final int[] A, int B) {
        int start =-1;int end=-1;
        int n=A.length;
        if(n==0) return new int[]{-1,-1};
        start = this.firstoccrance(A,B);
        if(start==-1) return new int[]{-1,-1};
        end = this.lastoccrance(A,B);
        return new int[] {start,end};
    }

    public int firstoccrance(int []arr,int target){
        int l=0; int r = arr.length -1;

        while(l<=r){
            int mid = (l+r)/2;
            if((mid==0|| target>arr[mid-1]) && arr[mid]==target){
                return mid;
            }else if(target>arr[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }

    public int lastoccrance(int []arr,int target){
        int l=0; int r = arr.length -1;

        while(l<=r){
            int mid = (l+r)/2;
            if((mid==r|| target<arr[mid+1]) && arr[mid]==target){
                return mid;
            }else if(target<arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        SearchForRang sr = new SearchForRang();
        int ans[] = sr.searchRange(arr,8);
        sr.printArray(ans);

    }
}
