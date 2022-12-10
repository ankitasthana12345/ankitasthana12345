package com.prac.arr;

public class SubarrayWithLeastAverage {
	
	 public static int solve(int[] A, int B) {
	        
	        int n = A.length;
	        int start =0;
	        int endI =0;
	        int curr_sum =0;
	        
	        
	       // create k sum 
	        
	        for(int i =0;i< B;i++) curr_sum +=A[i];
	        int min_sum = curr_sum;
	        
	        for(int end=B;end <n;end++){
	            curr_sum +=A[end] - A[end -B];
	            
	            if(curr_sum < min_sum){
	                min_sum = curr_sum;
	                start = (end - B + 1);
	                endI = start+B-1;
	                int[] intArray = new int[] {start,end};
	                System.out.println(endI);
	            }
	        }
	        return start;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A= {3, 7, 90, 20, 10, 50, 40};
		
		System.out.println(solve(A,3));

	}

}
