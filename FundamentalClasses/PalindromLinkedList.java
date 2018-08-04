package linkedList;

import java.util.Stack;

public class PalindromLinkedList {
	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public static void printList(){
		Node node = head;
		while(node!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	public static boolean isPalindrom(Node head){
		Stack st = new Stack();
		Node node = head;
		while(node!=null){
			st.push(node.data);
			node = node.next;
		}
		System.out.println(st);
	    node = head;
		int flag= 0;
		while(node!=null){
		    flag= 0;
			int d=  (Integer)st.pop();
			if(d==node.data){		
				flag = 1;
			}
			node = node.next;
		}
		if(flag==1){
			System.out.println("List is palindrom");
			return true;
		}
		else{
			System.out.println("List is not palindrom");
			return false;
		}	
	}

	public static void main(String[] args) {
		
		PalindromLinkedList list = new PalindromLinkedList();
		head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(40);
		head.next = second;
		second.next = third;
		printList();
	    isPalindrom(list.head);
	}

}
