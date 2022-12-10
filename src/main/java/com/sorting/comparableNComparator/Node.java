package com.sorting.comparableNComparator;

import java.util.Comparator;

public class Node implements Comparable<Node>{
    int number;
	public Node(int number) {
		this.number=number;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Node o) {
		  String first = String.valueOf(this.number) + String.valueOf(o.number);
          String second = String.valueOf(o.number) + String.valueOf(this.number);
          return second.compareTo(first);
	}

	

}
