package com.prac.arr;

import java.util.ArrayList;

//Simple Java program to count distinct elements in every
//window of size k

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class CountDistWindowHM {
	// Counts distinct elements in window of size k
	
		
	public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
		 
		 ArrayList<Integer> ans = new ArrayList<Integer>();
		 
		 Map<Integer,Integer> map = new HashMap<>();
		 
		 for(int i=0;i<B;i++) {
			 map.put(A.get(i), map.getOrDefault(A.get(i), 0)+1);
		 }
		 ans.add(map.size());
		 
		 for(int i=B;i<A.size();i++) {
			 int leftKWin = A.get(i-B);
			 if(map.get(leftKWin)==1) {
				 map.remove(leftKWin);
			 }else {
				 map.put(leftKWin,map.get(leftKWin) -1);
			 }
			 
			 map.put(A.get(i), map.getOrDefault(A.get(i), 0)+1);
			 ans.add(map.size());
		 }
		  
		return ans; 
	    }
	
	public static void main(String args[])
	{
		 ArrayList<Integer> gfg = new ArrayList<Integer>(
		            Arrays.asList(1, 2, 1, 3, 4, 3));
        System.out.println(dNums(gfg,3));
	}
}
