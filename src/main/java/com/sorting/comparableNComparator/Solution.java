package com.sorting.comparableNComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	 public String largestNumber(final List < Integer > A) {
		 StringBuffer strBuf = new StringBuffer();
		 int n = A.size();
		 Node[] num;
		 int i=0;
		 num = new Node[n];
		 for (int x : A) {
			num[i]=new Node(x);
			i++;
		}
		 
		 Arrays.sort(num);
		 
		  for (Node n1: num) {
	            if (n1.number == 0 && strBuf.length() != 0)
	                continue;
	            strBuf.append(n1.number);
	        }
	        return strBuf.toString();
		 
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> as = new ArrayList<Integer>(Arrays.asList(9, 5, 34, 3, 30));
        Solution sol = new Solution();
        System.out.println(sol.largestNumber(as));
	}
	

}
