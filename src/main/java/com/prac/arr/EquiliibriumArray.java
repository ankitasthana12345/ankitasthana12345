package com.prac.arr;

public class EquiliibriumArray {
	
	public static int solve(int[] A) {
        
        int n = A.length;
        int sum =0;
        int leftsum =0;
        
        for(int i=0;i<n;i++){
            sum =sum+A[i];
        }
        
        for(int i=0;i<n;i++){
            
            sum -=A[i];
            
            if(sum == leftsum) return i;
            
            leftsum +=A[i];
        }
        
        return -1;
    }
	
	public static int solve2(int[] A) {
		int n = A.length;
		int [] front= new int[n+1];
		int [] back= new int[n+1];
		
		front[0] = A[0];
		 
		for(int i=1;i<n;i++) {
			front[i] = front[i-1] +A[i];
		}
		
		back[n-1] = A[n-1];
		
		for(int i= n-2;i>0;i--) {
			back[i]= back[i+1] +A[i];	
		}
		
		for(int i=0;i<n;i++) {
			if(front[i] == back[i]) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1,2,3,7,1,2,3};
		
		System.out.println(solve2(A));

	}

}
