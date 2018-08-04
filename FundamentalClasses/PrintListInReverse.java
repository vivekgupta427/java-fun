package linkedList;

public class PrintListInReverse {
	static Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public static void printList(Node node){
		Node temp = node;
		while(temp!=null){
			System.out.print(temp.data);
			System.out.print(" ");
			temp= temp.next;	
		}
	}
	
	public static void printInReverse(Node node){
		
		if(node.next!=null){
			printInReverse(node.next);
		}
		System.out.print(node.data+" ");
	}
	
	public static void main(String[] args) {
		PrintListInReverse list = new PrintListInReverse();
		head =  list.new Node(10);
		Node second = list.new Node(20);
		Node third = list.new Node(30);
		head.next = second;
		second.next = third;
		printList(list.head);
		System.out.println();
		printInReverse(list.head);
	}

}
