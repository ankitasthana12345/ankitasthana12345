package com.recursion;

public class TowerOfHonai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		towerOfHanoi(n, 'A', 'B', 'C');

	}

	private static void towerOfHanoi(int n, char start, char aux, char end) {
		// TODO Auto-generated method stub
		// A,B,C

		if (n == 0)
			return;
		// A,C,B
		towerOfHanoi(n - 1, start, end, aux);
		System.out.println("Move disk " + n + " from rod " + start + " to rod " + end);
		// B,C,A
		towerOfHanoi(n - 1, aux, start, end);
	}

}
