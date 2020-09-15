package com.generic.lab1;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	Node(int num){
		this.data = num;
	}
	
}

public class LinkedList {
	Node head;
	
	public void append(int num) {
		if(head == null) {
			head = new Node(num);
		return;
		}
		
		Node current = head;
		//Traverse to the end of the linked list
		while(current.next!=null) {
			current = current.next;
		}
		current.next = new Node(num);
	}
	
	public void print() {
		Node node = head;
		System.out.println("Output : ");
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	public static int[] readInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of digits to read : ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0; i<n; i++)
			array[i]=scanner.nextInt();
		return array;
		
	}
	
	public void addInput(int[] arr, LinkedList list) {
		for(int i=0; i<arr.length; i++)
			list.append(arr[i]);
			
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList llist = new LinkedList();
		
		int[] input = readInput();
		
		llist.addInput(input, llist);
		
		llist.print();

	}

}
