package com.exercise.templatelab;
import java.io.*;
import java.util.*;

public class LargeSum {
	
	static long aVeryBigSum(long[] ar) {
		long x = 0;
		for(int i=0; i<ar.length; i++)
			x += ar[i];
		
		return x;
			
	}
	
	
	private static final Scanner scanner = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		
		
		//Read input
		int arrayCount = scanner.nextInt();
		  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		long[] ar = new long[arrayCount];
		
		String[] arItems = scanner.nextLine().split(" ");
		
		
		for(int i=0; i<arrayCount; i++) {
			long arItem = Long.parseLong(arItems[i]);
			ar[i] = arItem;
		}
		
		long result = aVeryBigSum(ar);
		
		System.out.println("result = " + result);

	}

}
