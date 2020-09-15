package com.generic.lab1;

import java.util.LinkedList;
import java.util.Queue;

class BNode {
	BNode left, right;
	int data;

	public BNode(int num) {
		this.data = num;
		left = null;
		right = null;
	}	
}

public class binarytree {
	
	BNode root;
	
	binarytree(){
		this.root = null;
	}
	
	public static BNode insertBTNode(BNode current, int key) {
		if(current == null)
			return (new BNode(key));
		
		if(key < current.data) {
			current.left = insertBTNode(current.left, key);
		}
		else {
			current.right = insertBTNode(current.right, key);			
		}
		
		return current;
	}
	
	public void display(BNode root) {
		if(root == null) {			
			return;
		}
		
		display(root.left);
		System.out.print(root.data + " ");
		display(root.right);		
			
	}
	
	//Inorder traversal of binary tree. LRL
	public void inOrderTraversal(BNode root) {
		if(root == null)
			return;
		
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);		
		
	}
	
	//Preorder traversal of binary tree. RLR
	public void preOrderTraversal(BNode root) {
		if(root == null)
			return;
		
		System.out.print(root.data + " ");
		preOrderTraversal(root.left);	
		preOrderTraversal(root.right);
		
		
	}
	
	//Postorder traversal of binary tree.LRR
	public void postOrderTraversal(BNode root) {
		if(root == null)
			return;
		
		postOrderTraversal(root.left);	
		postOrderTraversal(root.right);
		System.out.print(root.data + " ");
		
	}
	
	public void btLevelprint(BNode root, int k) {
		if(root == null)
			return;
		
		if(k==0)
			System.out.print(root.data + " ");
		
			btLevelprint(root.left, k-1);	
			btLevelprint(root.right, k-1);
		
	}
	
	public void levelOrderTraversal(BNode root)
	{
		Queue<BNode> queue = new LinkedList<BNode>();
		queue.add(root);
		BNode current = null; 
		
		while(!queue.isEmpty()) {
			current = queue.poll();
			System.out.print(current.data + " ");
			if(current.left != null)
				queue.add(current.left);
			if(current.right != null)
				queue.add(current.right);
			
		}
	}
	
	
	
	public int height(BNode root) {
		if(root == null)
			return -1;
		return (Math.max(height(root.left),height(root.right)+1));
	}
	
	public boolean findKey(BNode root, int key) {
		if(root==null)
			return false;
		if(root.data == key)
			return true;
		if(root.left!=null && root.data<key)
			findKey(root.left, key);
		if(root.right!=null && root.data>key)
			findKey(root.right, key);
		
		return false;		
	}

	public static void main(String[] args) {
		int[] input= {20,30,10,5,50,60,45,28};
		
		binarytree bt = new binarytree();
		
		
		
		for(int key : input) {
			
			bt.root =insertBTNode(bt.root, key);
			
		}
		
		//bt.display(bt.root);
		//System.out.println();
		/*
		 * bt.inOrderTraversal(bt.root); System.out.println();
		 * bt.preOrderTraversal(bt.root); System.out.println();
		 * bt.postOrderTraversal(bt.root); System.out.println();
		 */
		
		bt.btLevelprint(bt.root, 2);
		System.out.println();
		
		bt.levelOrderTraversal(bt.root);
		System.out.println();
		
		int key = 1;
		
		System.out.println("Seraching for " + key);
		if(bt.findKey(bt.root, key)) {
			System.out.println(key + " present in the tree");
		}
		else {
			System.out.println(key + " not present in the tree");
		}
		
		System.out.println("Height of current binary tree is " + bt.height(bt.root));
		
				
		

	}

}
