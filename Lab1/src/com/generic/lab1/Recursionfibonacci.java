package com.generic.lab1;

public class Recursionfibonacci {
	
	public static long[] fibArray = new long[100];
	
	static int fib(int n) {
		if(n >= 3)
			return(fib(n-1) + fib(n-2));
		else
			return 1;
	}
	
	static long fibwithmemory(int n) {
		long result =  0;
		
		if(fibArray[n]!=0) return fibArray[n];
		
		if(n >= 3) {
			result = (fibwithmemory(n-1) + fibwithmemory(n-2));
			
		}
		else
			result = 1;
		
		fibArray[n]=result;
		return result;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		System.out.println(fibwithmemory(45)); 
		long endTime = System.nanoTime();
		
		System.out.println("Total time: " +(endTime-startTime));

		
		 startTime = System.nanoTime();
		System.out.println(fib(45)); 
		 endTime = System.nanoTime();
		
		System.out.println("Total time: " +(endTime-startTime));
		
	
	}

}
