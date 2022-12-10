package com.sorting.comparableNComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> student = new ArrayList<Student>();
		student.add(new Student(15,"Ankit"));
		student.add(new Student(90,"Ram"));
		student.add(new Student(92,"Ram"));
		student.add(new Student(35,"Zivu"));
		student.add(new Student(35,"Gopal"));
		
		//Collections.sort(student,new SortByNameThanMark());
		Collections.sort(student,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.name.equals(o2.name)) {
					return o1.mark -o2.mark;
				}else {
				return o1.name.compareTo(o2.name);
				}
			}
			
		});
		
		student.forEach(System.out::println);
		//System.out.println(student);
	}

}
