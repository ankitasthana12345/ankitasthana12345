package com.sorting.comparableNComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class BClosestPointstoOrigin {
	
	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
		
		   ArrayList <ArrayList <Integer>> ans = new ArrayList <ArrayList <Integer>>();
		   
		   Collections.sort(A,new Comparator<ArrayList <Integer>>(){

			@Override
			public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
				 long d1=(long)a.get(0)*a.get(0) + (long)b.get(1)*b.get(1);
				 long d2=(long)a.get(0)*a.get(0) + (long)b.get(1)*b.get(1);
				 
				 if(d1<d2) return -1;
				 else if(d2<d1)return 1;
				 
				return 0;
			}
		   });
			
			for(int i = 0; i < B; i++){
	            ans.add(A.get(i));
	        }
	        return ans;
			
			  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
