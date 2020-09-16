package com.java.basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class MapsLab {
	
	public HashMap<Integer, String> insertHashMap(int[] phone, String[] names, int n) {
		HashMap<Integer, String> hmap = new HashMap<Integer,String>();
		
		for(int i=0; i<n && (i<phone.length) && (i<names.length); i++) {
			hmap.put(phone[i], names[i]);
		}
		
		return hmap;
	}
	
	public void printHmap(HashMap<Integer, String> hmap) {
		Iterator<Map.Entry<Integer, String>> itr = hmap.entrySet().iterator();
		
		Map.Entry<Integer, String> entry;
		while(itr.hasNext()) {
			entry = itr.next();
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
		}
		
	}
	
	//Print hash map
	
	public void printHmapKeySet(HashMap<Integer, String> hmap) {
		Set<Integer> keys = hmap.keySet();
		for(Integer key : keys)
			System.out.println(key + " = " +hmap.get(key));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5,6,7,8,9};
		String[] name = {"aarya", "shaun", "samiksha", "Aarush", "Aarya", "anirudh", "harshith", "hanish", "haasini"};
		
		HashMap<Integer,String> hmap;
		MapsLab mlab = new MapsLab();
		hmap = mlab.insertHashMap(num, name, 9);
		
		mlab.printHmap(hmap);
		mlab.printHmapKeySet(hmap);
	}

}
