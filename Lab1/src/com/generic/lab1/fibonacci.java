package com.generic.lab1;

public class fibonacci {
	
	public static long fib(int n) {
		long[] fibarr = new long[n+2];
		
		if(n <= 1)
			return 1;
		
		fibarr[0] =0;
		fibarr[1] =1;
		
		for(int i=2; i<=n; i++) {
			fibarr[i] = fibarr[i-1] + fibarr[i-2];
		}
		return fibarr[n];
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(100));
		
		
	
	}

}
