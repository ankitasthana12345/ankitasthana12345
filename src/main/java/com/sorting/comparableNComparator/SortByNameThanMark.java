package com.sorting.comparableNComparator;

import java.util.Comparator;

public class SortByNameThanMark implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)) {
			return o1.mark -o2.mark;
		}else {
		return o1.name.compareTo(o2.name);
		}
	}

	
}
