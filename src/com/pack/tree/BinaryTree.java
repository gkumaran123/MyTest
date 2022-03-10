package com.pack.tree;

public class BinaryTree {
	Node root;
	BinaryTree(){
		root=null;
	}
	void printInorder(Node node) {
		if(node == null) 
			return;
		printInorder(node.left);
		System.out.print(" "+node.data);
		printInorder(node.right);
	}
	
	void printPreOrder(Node node) {
		if(node == null) 
			return;
		System.out.print(" "+node.data);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	void printPostOrder(Node node) {
		if(node == null) 
			return;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(" "+node.data);
	}
	
	void printRightOrder(Node node) {
		if(node == null) 
			return;
		//printPostOrder(node.left);
		printRightOrder(node.right);
		System.out.print(" "+node.data);
		
	}
	void printInorder() {
		printInorder(root);
	}
	void printPreOrder() {
		printPreOrder(root);
	}
	
	void printPostOrder() {
		printPostOrder(root);
	}
	
	void printRightOrder() {
		printRightOrder(root);
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node("A");
		tree.root.left = new Node("B");
		tree.root.right = new Node("C");
		tree.root.left.right = new Node("D");
		tree.root.right.left = new Node("E");
		tree.root.right.right = new Node("F");
		tree.root.right.left.left = new Node("G");
		tree.root.right.right.left = new Node("H");
		tree.root.right.right.right = new Node("I");
		
		System.out.println("Inorder traversal");
		tree.printInorder();
		System.out.println();
		System.out.println("PreOrder traversal");
		tree.printPreOrder();
		System.out.println();
		System.out.println("PostOrder traversal");
		tree.printPostOrder();
		System.out.println();
		System.out.println("RightOrder traversal");
		tree.printRightOrder();
	}

}
