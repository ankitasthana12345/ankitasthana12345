/*
Given an integer A.

        Compute and return the square root of A.

        If A is not a perfect square, return floor(sqrt(A)).

        DO NOT USE SQRT FUNCTION FROM THE STANDARD LIBRARY.

        NOTE: Do not use the sqrt function from the standard library. Users are expected to solve this in O(log(A)) time.
*/

package com.binarySerach;

public class SqaureRootOfInteger {

    public int sqrt(int A) {

        if(A==0) return 0; int ans =0;
        int start =1; int end = A;

        while(start<=end){
            int mid=(start+end)/2;
            if(mid<=A/mid){
                ans = mid;
                start=mid+1;
            }else{
                end =mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SqaureRootOfInteger sqrt = new SqaureRootOfInteger();
        int ans =sqrt.sqrt(10);
        System.out.println(ans);
    }
}
