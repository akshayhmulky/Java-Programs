package com.day10.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceExample {

	public static void main(String[] args) {

		List<Course> list = new LinkedList<Course>();
		list.add(new Course("Java"));
		list.add(new Course("C++"));
		list.add(new Course("Python"));
		list.add(new Course("Javascript"));
		list.add(new Course("Golang"));

		List<Course> alist = new ArrayList<Course>();
		alist.add(new Course("Java"));
		alist.add(new Course("C++"));
		alist.add(new Course("Python"));
		alist.add(new Course("Javascript"));
		alist.add(new Course("Golang"));

		System.out.println(System.nanoTime());
		for(Course c : list) {
			System.out.println(c.courseName);
		}
		System.out.println(System.nanoTime());
		
		System.out.println(System.nanoTime());
		for(Course c : alist) {
			System.out.println(c.courseName);
		}
		System.out.println(System.nanoTime());
	}
}
