package com.twopointer;

public class PairGivenSum2 {

    public  int solve(int[] A, int B) {
      int mod = 1000*1000*1000 +7;
      int ans =0;
      int i=0; int j = A.length-1;

      while(i<=j){
          int sum = A[i]+A[j];
          if(sum ==B && i!=j) {
              i++;
              j--;
              ans +=1;
          }else if(sum <B) i++;
          else j--;
      }
        return (ans%mod);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 6, 6, 7, 9, 9 };
        PairGivenSum2 sum = new PairGivenSum2();
        int ans =sum.solve(arr,13);
        System.out.println(ans);
    }
}
