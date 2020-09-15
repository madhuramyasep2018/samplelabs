package com.exercise.templatelab;

import java.util.Arrays;

public class LeftRotate {
	
	public static int[] lrotate(int[] arr, int rotation) {
		int absoluteRotation = rotation%arr.length;
		int[] rotatedArray = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(i-absoluteRotation >= 0)
				rotatedArray[i-absoluteRotation] = arr[i];
			else
				rotatedArray[i-absoluteRotation+arr.length] = arr[i];
			
		}
		return rotatedArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		int[] rotatedArray = lrotate(arr, 23);
		
		System.out.println(Arrays.toString(rotatedArray));
		

	}

}
