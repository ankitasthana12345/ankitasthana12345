package com.hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElement {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mapa = new HashMap<>();
        int n = A.size();

        for (int i=0; i<n;i++){
            int ele= A.get(i);
            if(mapa.containsKey(ele)){
                mapa.put(ele,mapa.get(ele)+1);
            }else{
                mapa.put(ele,1);
            }
        }

        n = B.size();

        for(int i=0;i<n;i++){
            int ele = B.get(i);
            if(mapa.containsKey(ele) && mapa.get(ele)>1){
                ans.add(ele);
                mapa.put(ele,mapa.get(ele)-1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
