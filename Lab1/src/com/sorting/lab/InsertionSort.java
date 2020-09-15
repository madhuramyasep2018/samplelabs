package com.sorting.lab;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,2,4,1,5,3};
		int value,insert;
				
		for(int i=1; i<arr.length; i++) {
			value = arr[i];
			insert = i;
			while(insert > 0 && arr[insert-1]>value) {
				arr[insert] = arr[insert-1];				
				--insert;				
			}	
			arr[insert] = value;
			
		}		
		 
		System.out.println(Arrays.toString(arr));
			

	}

}
