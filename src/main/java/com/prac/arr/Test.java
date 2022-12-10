package com.prac.arr;

import java.util.Map;

public class Test {

	// String s1 = "I work for Walmart IDC walmart india work for walmart"
//	I  1
//	work 2
//	walmart 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "I work for Walmart IDC walmart india work for walmart";
		
	    String[] strarry = s1.split(" ");
	    int n = strarry.length;
	    for(int i=0; i<n;i++) {
	    	int count =1;
          for(int j=i+1;j<n;j++) {
        	   
	    		if(strarry[i].equals(strarry[j])); {
	    			count++;
	    		}
                 
	    	}
          System.out.println(strarry[i]+" count ="+count);
          
          if(count > 1)  count =1;
          
           
	    }
	    
	    
	}

}
