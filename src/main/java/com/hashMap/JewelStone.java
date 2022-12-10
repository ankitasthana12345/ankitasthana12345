/*You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3 */

package com.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelStone {
	
	  public static int numJewelsInStones(String jewels, String stones) {
		  
		int count =0;
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i < stones.length(); i++) {
			
			map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0)+1);
			
		}
		
		for(int i=0;i<jewels.length();i++) {
			if(map.containsKey(jewels.charAt(i))){
			   count +=map.get(jewels.charAt(i));
			}
		}
		
		return count;
	        
	    }
	  
	  public static int numJewelsInStones2(String J, String S) {
	        Set<Character> Jset = new HashSet();
	        for (char j: J.toCharArray())
	            Jset.add(j);

	        int ans = 0;
	        for (char s: S.toCharArray())
	            if (Jset.contains(s))
	                ans++;
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jewels ="aA";
		String stones = "aAAbbbb";
		
		System.out.println(numJewelsInStones2(jewels,stones));
		

	}

}
