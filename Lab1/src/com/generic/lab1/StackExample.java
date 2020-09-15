package com.generic.lab1;

class sNode{
	int data;
	sNode next;
	
	sNode(int data){
		this.data = data;
	}
	
}

public class StackExample {
	
	sNode head;
	
	public StackExample() {
		this.head = null;
	}
	
	public int peek() {
		if(!isEmpty())
			return head.data;
		return -1;
		
	}
	
	public void peekp() {
		if(!isEmpty())
			System.out.println();
		else
			System.out.println("Stack is empty");
		
	}
	
	public boolean isEmpty() {
		return(head == null);
	}
	
	public void display() {
		if(!isEmpty()) {
		sNode node = head;
		while(node!=null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
		}
		else
			System.out.println("Stack is empty");
	}
	
	public void push(int n) {
		
		sNode node = new sNode(n);
		
		if(isEmpty()) {
			head = node;
		}else {
			node.next = head;
			head = node;			
		}	
		
	}
	
	public int pop() {
		int data;
		if(!isEmpty()) {
			data = head.data;
			head = head.next;
			return data;
		}		
		
		return -1;
	}
	
	public void popp() {
		int data;
		if(!isEmpty()) {
			data = head.data;
			head = head.next;
			System.out.println(data);
		}else {
			System.out.println("Stack is empty");
		}
		
		
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackExample stack = new StackExample();
		
		for(int i=0; i<10; i++)
			stack.push(i);
		
		stack.display();
		
		for(int i=0; i<11; i++)
			stack.popp();
		
		stack.peekp();

	}

}
