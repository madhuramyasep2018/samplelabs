package com.java.basics;
import java.util.*;

public class vectorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector = new Vector<Integer>();
		for(int i=0; i<10; i++) {
			vector.add(i);
		}
		
		System.out.println("Vector capacity " + vector.capacity());
		
		vector.removeAllElements();
		
		System.out.println("Vector size " + vector.size());
		
		for(int i : vector)
			System.out.print(" " + i);
		
		Collection values = new ArrayList();
		
		values.add("kangana");
		values.add("100Cr");
		
		for(Object val : values)
			System.out.println(val);
		
		Iterator itr = values.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
