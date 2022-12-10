package com.binarySerach;

public class RotatedSortedArraySearch {

    public int search(final int[] A, int B) {

        int start = 0;
        int end = A.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] == B) {
                return mid;
            } else if (A[mid] >= A[start]) {
                if (B >= A[start] && B < A[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
              if(B<=A[end] && B>A[mid]){
                  start=mid+1;
              }else{
                  end = mid-1;
              }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int B=4;
        RotatedSortedArraySearch ra = new RotatedSortedArraySearch();
        int ans = ra.search(arr,B);
        System.out.println(ans);
    }
}
