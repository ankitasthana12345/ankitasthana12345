package com.binarySerach;

import java.util.Arrays;

public class CowAggressive {

    public int solve(int[] A, int B) {
      int res = 0;
      int n =A.length;
        Arrays.sort(A);
        int low =1; int high = A[n-1]-A[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(A,mid,B)){
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }


      return res;
    }

    private boolean isPossible(int[] a, int midDist, int b) {
        int cow=1;
        int lastCowPosition=a[0];

        for (int i=1;i<a.length;i++){
           if(a[i]-lastCowPosition >=midDist){
               cow++;
               lastCowPosition=a[i];
               if(cow>=b) return true;
           }
        }
       return false;
    }

    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
        CowAggressive cows= new CowAggressive();
        int ans = cows.solve(arr,3);
        System.out.println(ans);

    }
}
