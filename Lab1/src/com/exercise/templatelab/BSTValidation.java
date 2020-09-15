package com.exercise.templatelab;

class TreeNode{
	int val;
	TreeNode Left;
	TreeNode Right;
	TreeNode(int x)
	{
		val = x;
	}
}

public class BSTValidation {
	
	public static Boolean validateBST(TreeNode root, Integer min, Integer max)
	{
		if(root == null) {
			return true;
		}
		else if(max != null && root.val >= max || min != null && root.val < min) {
			return false;
		}
		else
			return (validateBST(root.Left, min, root.val) && validateBST(root.Right,root.val, max));
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		root.Left = new TreeNode(9);
		root.Right =new TreeNode(5);
		
		System.out.println(validateBST(root, root.Left.val, root.Right.val));
		

	}

}
