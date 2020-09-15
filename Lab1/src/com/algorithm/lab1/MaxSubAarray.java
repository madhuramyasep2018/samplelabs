package com.algorithm.lab1;
import java.util.*;

public class MaxSubAarray {
	
	public static int[] readInput()
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] input = new int[n];
		
		for(int i=0; i<n; i++) {
			input[i]=scanner.nextInt();
		}
		
		scanner.close();
		
		
		return input;
	}
	
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Kadanes algorithm
		int[] arr = readInput();
		System.out.println(Arrays.toString(arr));
		
		int currentMax = 0;
		int globalMax = 0;
		
		System.out.println("test");
		
		
		
		for(int i=0; i<arr.length; i++) {
			currentMax=Math.max(arr[i], arr[i]+currentMax);
			if(currentMax>globalMax)
				globalMax=currentMax;
		}
		
		
		
		System.out.println("Max subarray value "+ globalMax);
		
		

	}

}
