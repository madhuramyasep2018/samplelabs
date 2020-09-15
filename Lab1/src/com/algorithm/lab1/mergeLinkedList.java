package com.algorithm.lab1;

import java.util.PriorityQueue;

class Node{
	Node next;
	int x;	
}
class LinkedList{
	int data;
	LinkedList next;
	LinkedList(int x){
		this.data = x;
		this.next = null;
	}
}
public class mergeLinkedList {
	Node root1 = new Node();
	Node root2 = new Node();
	
	
	
	
	public static Node mergeList(Node root1, Node root2) {
		Node result = new Node();
		int remainder = 0;
		
		if(root1 == null && root2 == null)
			return null;
		if(root1 == null) {
			return root2;
		}
		if(root2 == null) {
			return root1;
		}
			
		while(root1 !=null && root2 != null) {
			result.x = (root1.x + root2.x +remainder)%10 ;
			if((root1.x + root2.x + remainder)> 9) {
				remainder = (root1.x + root2.x)/10;
			}
			else {
				remainder = 0;
			}
			root1 = root1.next;
			root2 = root2.next;
			result.next = new Node();
		}
		
		while(root1 != null) {
			
			result.x = (root1.x +remainder)%10;
			
			if((root1.x  + remainder)> 9) {
				remainder = (root1.x + remainder)/10;
			}
			else {
				remainder = 0;
			}
			
			root1 = root1.next;
			
			result.next = new Node();
		}
		
		while(root2 != null) {
			
			result.x = (root2.x +remainder)%10;
			
			if((root2.x  + remainder)> 9) {
				remainder = (root2.x + remainder)/10;
			}
			else {
				remainder = 0;
			}
			
			root1 = root2.next;
			
			result.next = new Node();
		}
		return result;
		
	}
	
	//Merge two sorted linked list
	public static LinkedList mergeSortedList(LinkedList list1, LinkedList list2) {
		LinkedList result = null;

		if(list1 == null && list2 == null)
			return result;
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;

		while(list1 !=null || list2 != null) {
			if(list1 != null  && list2 !=null) {
				if(list1.data > list2.data) {
					result = new LinkedList(list1.data);
					list1 = list1.next;
				}
				else {
					result = new LinkedList(list2.data);
					list2 = list2.next;
				}

			}
			else if(list1 != null && list2 == null) {
				while(list1 != null) {
					result = new LinkedList(list1.data);
					list1 = list1.next;
				}
			}
			else {
				while(list2 != null) {
					result = new LinkedList(list2.data);
					list2 = list2.next;
				}

			}
			
		}
		return result;

		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
