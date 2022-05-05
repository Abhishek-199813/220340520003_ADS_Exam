import java.io.*;
import java.util.*;

class LinkedList{
	static Node head;
	static class Node{
		int data;
		Node next;
		public Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	Node Reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		int cnt=0;
		
		
		while(current!=null){
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		node  = prev;
		return node;
	}
	
	void printList(Node node)
	{
		while(node!=null)
		{
			
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	
	
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		list.head.next = new Node(5);
		list.head.next.next = new Node(1);
		list.head.next.next.next = new Node(2);
		list.head.next.next.next.next = new Node(3);
		list.head.next.next.next.next.next = new Node(4);
		list.head.next.next.next.next.next.next = new Node(5);
		
		System.out.println("Given linked list is");
		list.printList(head);
		
		head  = list.Reverse(head);
		System.out.println("");
		System.out.println("Reverse Linked list is");
		
		list.printList(head);
		
		
	}
}