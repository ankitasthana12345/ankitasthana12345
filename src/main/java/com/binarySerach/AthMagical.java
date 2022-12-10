/*You are given three positive integers, A, B, and C.

        Any positive integer is magical if divisible by either B or C.

        Return the Ath smallest magical number. Since the answer may be very large, return modulo 109 + 7.*/
package com.binarySerach;

public class AthMagical {
    public int solve(int A, int B, int C) {
        int mode=1000*1000*1000+7;
        long low =0;  long high = ((long)A*Math.min(B,C));
        int lcm= (B*C)/gcd(B,C);
        long ans =0;

        while(low<=high){
            long mid =low+(high-low)/2;

            if((mid/B + mid/C - mid/lcm)>=A){
                ans = mid;
                high = mid-1;
            }else{

                low=mid+1;
            }
        }

        return (int)(ans%mode);
    }

    public int gcd(int x, int y) {
        if (x == 0) return y;
        return gcd(y % x, x);
    }

    public static void main(String[] args) {
        AthMagical an = new AthMagical();
        int x=an.solve(4,2,3);
        System.out.println(x);
    }
}
