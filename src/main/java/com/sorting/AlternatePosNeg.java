package com.sorting;

import java.util.ArrayList;

public class AlternatePosNeg {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i) > 0)
            {
                pos.add(A.get(i));
            }
        }
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i) < 0)
            {
                neg.add(A.get(i));
            }
        }
        int e1 = 0;
        int e2 = 0;
        for(int i=0;i<A.size();i++)
        {
            if(i%2 == 0)
            {
                A.set(i,pos.get(e1));
                e1++;
            }
            else
            {
                A.set(i,pos.get(e2));
                e2++;
            }
        }
        return A;
    }

    public static void main(String[] args) {

    }
}
