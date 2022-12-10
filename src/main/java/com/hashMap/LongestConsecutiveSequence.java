package com.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequence {
	
	 public int diffPossible(final List<Integer> A, int B) {
	        
	        int result =0;
	        if(B<0) return 0;
	        
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        for(int num :A){
	            map.put(num,map.getOrDefault(num,0)+1);
	        }
	        
	        for(int num :map.keySet()){
	            
	            if(B==0 && map.get(num)>1 || map.containsKey(num+B)){
	                result++;
	            }
	    }
	    
	    return result++;
	}
	public static int longestConsecutive1(final int[] A) {
		
		int ans =0;
		
		HashMap<Integer, Boolean> mapa = new HashMap<Integer, Boolean>();
		
		for (int val : A) {
			mapa.put(val, true);
			//mapa.getOrDefault(mapa, 1)
			 }
		for (int val : A) {
			if(mapa.containsKey(val-1)) {
				mapa.put(val, false);
			}
		}
		
		int maxlen=0;
		int maxSp=0;
		for(int val :A) {
			if(mapa.get(val)==true) {
				int templ=1;
				int tsp = val;
				
				while(mapa.containsKey(tsp+templ)) {
					templ++;
				}
				
				if(templ > maxlen) {
					maxSp = tsp;
					maxlen = templ;
				}
			}
			
		}
		
		for( int i=0;i<maxlen;i++) {
			ans = maxSp +1;
		
	}
		
		
		return ans;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,14,12,1,2,3,4,17,13,16};
		System.out.println(longestConsecutive3(arr));

	}
	
	
	//Better Solution
	public static int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
	
	// By me 
	
	public static int longestConsecutive3( final int[] A) {
		
		int longestStreak =0;
		
		HashSet<Integer> hasSet = new HashSet<Integer>();
		
		for(int num :A) {
			hasSet.add(num);
		}
		
		for(int num :hasSet) {
		  if(!hasSet.contains(num-1)) {
			  int currentnum = num;
			  int currentstreak=1;
			  
			  while(hasSet.contains(currentnum +1)) {
				  currentnum +=1;
				  currentstreak +=1;
			  }
			  
			  longestStreak = Math.max(currentstreak, longestStreak);
		  }
		}
		return longestStreak;	
	}
}
