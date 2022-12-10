package com.prac.arr;

import java.util.ArrayList;
import java.util.Arrays;

public class CountWaySumOddEven {
	
	public static int solve(ArrayList<Integer> A) {
		int n = A.size();
		
		int ans=0;
		int evensum =0;
		int oddsum =0;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				ans=A.remove(j);
				break;
				}
			if(i%2==0) {
				evensum +=A.get(i);
			}else {
				oddsum +=A.get(i);
			}
		    
			if(evensum==oddsum) return ans;
			
		}
		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> gfg = new ArrayList<Integer>(
		            Arrays.asList(2, 1, 6, 4));
		System.out.println(solve(gfg));
		
		

	}

}
