package com.sorting.lab;

import java.util.Arrays;

public class QuickSort {
	
	public void qsort(int[] inputarr, int start, int end) {
		if(start < end) {
			int partitionindex = partition(inputarr,start,end);
			qsort(inputarr,start, partitionindex-1);
			qsort(inputarr, partitionindex+1,end);
		}
		
	}
	
	public int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int partitionIndex = start;
		for(int i=start; i<end; i++) {
			if(arr[i]<=pivot) {
				swap(arr, i, partitionIndex);
				partitionIndex++;
			}
		}
		swap(arr, partitionIndex,end);
		
		return partitionIndex;
		
	}
	
	public void swap(int[] arr, int a, int b) {
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,2,1,6,8,5,3,4};
		
		QuickSort qs = new QuickSort();
		
		qs.qsort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
