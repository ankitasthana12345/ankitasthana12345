package com.binarySerach;

public class MaximumheightoStaircase {

    public int solve(int A) {
        long l =1; long r = A;
        long ans =1;
        if(A==0) return 0;
        while(l<=r){
            long mid = (l+r)/2;
            if((mid*(mid+1))/2<=A){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }

        return (int)ans;
    }

    public static void main(String[] args) {
        MaximumheightoStaircase  mxh =  new MaximumheightoStaircase();
        int x = mxh.solve(10);
        System.out.println(x);
    }
}
