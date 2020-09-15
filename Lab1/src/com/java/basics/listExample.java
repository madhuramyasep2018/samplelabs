package com.java.basics;

import java.util.*;

public class listExample {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList<String>();
		
		mylist.add("one");
		mylist.add("two");
		mylist.add("three");
		
		System.out.println(mylist);
		
		mylist.remove(2);
		
		System.out.println(mylist);
		
		System.out.println("Size of mylist " + mylist.size());
		
		Iterator<String> itr = mylist.iterator();
		
		String str;
		
		
		while(itr.hasNext()) {
			str = itr.next();
			System.out.println("value " + str);
		}
		

	}

}
