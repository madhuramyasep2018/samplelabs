package com.generic.lab1;

public class RecursionFactorial {
	
	static int factorial(int n) {
		if(n>=1)
			return(n*factorial(n-1));
		else
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(10));

	}

}
