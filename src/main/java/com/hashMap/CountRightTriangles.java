package com.hashMap;

import java.util.HashMap;

public class CountRightTriangles {

    public int solve(int []a,int [] b){
      long ans =0;
      int mod = 1000*1000*1000+7;
      int n = a.length;
        HashMap<Integer,Integer> mpx = new HashMap<>();
        HashMap<Integer,Integer> mpy = new HashMap<>();

        for (int i=0; i<n;i++){

            if(mpx.get(a[i])==null){
                mpx.put(a[i],1);
            }else{
                mpx.put(a[i],mpx.get(a[i])+1);
            }

            if(mpy.get(b[i])==null){
                mpy.put(b[i],1);
            }else{
                mpy.put(b[i],mpy.get(b[i])+1);
            }
        }

        for (int i=0;i<n;i++){
            ans = (ans+(mpx.get(a[i]) -1) * (mpy.get(b[i]) -1))%mod;
        }

      return ((int)ans);
    }

    public static void main(String[] args) {
         int arr1[] ={1, 1, 2, 3, 3};
         int arr2[] ={1, 2, 1, 2, 1};
         CountRightTriangles cnt = new CountRightTriangles();
         int x= cnt.solve(arr1,arr2);
        System.out.println(x);
    }
}
