package com.day10.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

	List<String> contacts = new ArrayList<String>();
	contacts.add("Batman");
	contacts.add("Superman");
	contacts.add("Vampire");
	contacts.add("Mickeymouse");
	
//	for(String s : contacts) {
//	System.out.println(s);	
//	}
	
	for(int i=0; i<contacts.size();i++) {
		System.out.println(contacts.get(i)); //Display list of contacts
	}
	System.out.println();
	System.out.println("Size before clearing the list: " + contacts.size());
	contacts.clear();
	System.out.println("Size after clearing the list: " + contacts.size());
	}

}
