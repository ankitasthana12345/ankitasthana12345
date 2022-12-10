/*Given an array of integers A and an integer B,
find and return the maximum value K such that there is no subarray
in A of size K with the
 sum of elements greater than B.*/

package com.binarySerach;

public class SpecailInteger {
    public int solve(int[] A, int B) {
       int start =0; int end =A.length-1;
       int ans =0;
       while(start<=end){
           int mid =(start+end)/2;

           if(checkSum(A,mid,B)==true){
               ans = mid;
               start=mid+1;
           }else{
               end=mid-1;
           }
       }
        return ans;
    }

    public boolean checkSum(int arr[], int k, int B){

        int sum=0;
        for (int i=0; i<k;i++){
            sum +=arr[i];
        }
        if(sum>B) return false;
        for(int end=k;end<arr.length;end++){
            sum +=arr[end]-arr[end-k];
            if(sum>B) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] ={5, 17, 100, 11};
        SpecailInteger si = new SpecailInteger();
        int ans =si.solve(arr,130);
        System.out.println(ans);
    }
}

