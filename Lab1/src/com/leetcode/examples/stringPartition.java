package com.leetcode.examples;
import java.util.*;

public class stringPartition {
	
	public static int[] partitionlabels(String S){
		List<Integer> partitionLengths = new ArrayList<>();
		int[] lastIndexes = new int[26];
		
		for(int i=0; i<S.length(); i++) {
			lastIndexes[S.charAt(i)-'a'] = i ;
			System.out.print(S.charAt(i)-'a'+ " ");
			System.out.println(Arrays.toString(lastIndexes));
			
		}
		
		int i=0;
		while(i<S.length()) {
			int end = lastIndexes[S.charAt(i)-'a'];
			System.out.println(" end " +end + " " + " i " + i +" S.charAt(i)-'a' " + (S.charAt(i)-'a'));
			
			int j=i;
			while(j!=end) {
				end = Math.max(end, lastIndexes[S.charAt(j++)-'a']);
				System.out.print("end " + end + " lastIndex " + lastIndexes[S.charAt(j-1)-'a']+ " j "+ j);
				System.out.println();
			}
			
			partitionLengths.add(j-i+1);
			i=j+1;
			System.out.print(" i "+ i + " j " + j);
		}
		
		
		System.out.println(" partition length " + partitionLengths);
		System.out.println();
		
		return lastIndexes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("String values " + Arrays.toString(partitionlabels("florida")));
		//int[] temp = partitionlabels("floridaklamxzv");z
		int[] temp = partitionlabels("pezaakkaayyypezzzccccccccccccccbbbbbbbbb");
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}
