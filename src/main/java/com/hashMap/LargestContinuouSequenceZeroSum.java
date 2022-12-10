package com.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LargestContinuouSequenceZeroSum {

	public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<>();
		int sum = 0;
		int len = 0;
		int n = A.size();
		int r = -1, l = -1;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(sum, -1);
		for (int i = 0; i < n; i++) {
			sum += A.get(i);

			if (!map.containsKey(sum)) {
				map.put(sum, i);
			} else {
				int diff = i - map.get(sum);
				if (diff > len) {
					l = map.get(sum) + 1;
					r = i;
					len = i - map.get(sum);
				
				}

			}
		}

		if (l > -1 && r > -1) {
			for (int i = l; i <= r; i++) {
				ans.add(A.get(i));
			}
		}

		return ans;
	}

	public static void main(String[] args) {

		ArrayList<Integer> as = new ArrayList<Integer>(Arrays.asList(15, -2, 2, -8, 1, 7, 10, 23));
		System.out.println(lszero(as));

	}

}
