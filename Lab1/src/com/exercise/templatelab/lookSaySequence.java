package com.exercise.templatelab;

import java.util.Arrays;

public class lookSaySequence {
	
	public String nextnumber(String str) {
		String result="";
		char[]inputArr = str.toCharArray();
	
		int i = 0;
		while(i < str.length()) {
			int count = 1;
			while(i+1 <str.length() && inputArr[i] == inputArr[i+1]) {
				i +=1;
				count+=1;
			}
			result += Integer.toString(count)+ inputArr[i];
			i+=1;
		
		}
		return (result);
	}

	public static void main(String[] args) {
		String str ="k";
		int n=10;
		lookSaySequence obj = new lookSaySequence();
		for(int i=0; i<20; i++) {
			str = obj.nextnumber(str);
			System.out.println(str);
		}
	}

}
