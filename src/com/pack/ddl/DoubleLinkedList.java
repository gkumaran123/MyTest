package com.pack.ddl;

import java.util.ArrayList;

public class DoubleLinkedList {
	
	class Node{
		int data;
		Node prev;
		Node next;
		Node (int data){
			this.data = data;
			prev=next=null;
		}
	}
	
	Node head;
	DoubleLinkedList(){
		head=null;
	}
	
	public void push(int data)
	{
		Node new_node = new Node(data);
		new_node.next= head;
		new_node.prev = null;
		if(head!=null)
			head.prev=new_node;
		head = new_node;
	}
	public static void main(String[] args) {
		
		DoubleLinkedList ddl = new DoubleLinkedList();
		ddl.push(5);
	}
	
	

}
