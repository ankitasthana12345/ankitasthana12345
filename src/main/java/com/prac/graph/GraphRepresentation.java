package com.prac.graph;

import java.util.ArrayList;

public class GraphRepresentation {
	
	
	static private void method() {
		Test.method1();
		System.out.println("method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =3, m=3;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		/*
		 * int adj[][] = new int[n][m];
		 * 
		 * //edge 1---2 adj[1][2]=1; adj[2][1]=1;
		 * 
		 * //edge 2---3 adj[2][3]=1; adj[3][2]=1;
		 * 
		 * //edge 1---3 adj[1][3]=1; adj[3][1]=1;
		 */
		
		adj.get(0).add(2);
		adj.get(2).add(0);
		
		//edge 1---2
		adj.get(1).add(2);
		adj.get(2).add(1);
		
		
		
		//edge 2---3
		adj.get(2).add(3);
		adj.get(3).add(2);
		
		//edge 1---3
		adj.get(1).add(3);
		adj.get(3).add(1);
		
		for(int i=1;i<adj.size();i++) {
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.print(adj.get(i).get(j)+ " ");
			}
			System.out.println();
		}

	}

}
