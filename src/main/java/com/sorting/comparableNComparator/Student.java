package com.sorting.comparableNComparator;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {

	int mark;
	String name;
	public Student(int mark, String name) {
		super();
		this.mark = mark;
		this.name = name;
	}
	/**
	 * @return the mark
	 */
	public int getMark() {
		return mark;
	}
	/**
	 * @param mark the mark to set
	 */
	public void setMark(int mark) {
		this.mark = mark;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [mark=" + mark + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		//  if(this.mark > o.mark) return 1; else if(this.mark <o.mark) return -1; return 0;
		if(o.mark< this.mark) return -1;
		
		 return this.name.compareTo(o.name);
	}
	
	

}
