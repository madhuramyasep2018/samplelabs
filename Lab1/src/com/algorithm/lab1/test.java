package com.algorithm.lab1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
	public static void moveZeros(int[] arr){
		int writeIndex = arr.length-1;
		int readIndex = arr.length-1;
		
		while(readIndex >= 0) {
			if(arr[readIndex]!=0) {
				arr[writeIndex] = arr[readIndex];
				writeIndex--;
			}
			readIndex--;
		}
		
		while(writeIndex>0) {
			arr[writeIndex]=0;
			writeIndex--;
		}
		
		for(int i=0; i<arr.length-1; i++)
			System.out.println(arr[i] +" ");
		
	}
	
	public static void overlappingScan()
	{
		List<Integer> arrayList = new ArrayList<>();
		
		
	}
	
	public static void moveZerosBruteForce() {

		int[] arr = {1,0,2,0,3,0,4,0};
		int[] temp = new int[arr.length];
		int count =0;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==0)
				count++;
		}
		
		for(int i =0; i<count; i++) {
			temp[i]=0;
		}
		
		for(int i =0, j= count; i<arr.length; i++) {
			if(arr[i] !=0)
				temp[j++]=arr[i];
				
		}
		System.out.println(Arrays.toString(temp));

	}
	

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="hello World";
		test.toUpperCase();
		
		//System.out.println(test.substring(1,4));
		
		int[] arr = {1,0,2,0,3,0,4,0};
		
		moveZeros(arr);
	}
		

}
