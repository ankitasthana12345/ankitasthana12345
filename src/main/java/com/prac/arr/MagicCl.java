package com.prac.arr;

public class MagicCl {
    int sum(int n){
        
    	if(n==0)
        {
            return 0;
        }
        else
        {
            return n%10 + sum(n/10);
        }
    }
    public int solve(int A) {
       int temp=0;
       
       while(temp>9){
            temp=sum(A);
        }
        
         if(temp==1) {
        	 return 1;
         }else {
        	 return 0;
         }
       
        
        
    }
    
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = 83557;
		
		MagicCl mg = new MagicCl();
		System.out.println(mg.solve(A));

	}

}
