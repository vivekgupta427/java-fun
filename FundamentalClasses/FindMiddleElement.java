package linkedList;

public class FindMiddleElement {

	static Node head;
	 static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public static void printList(Node node){
		Node temp = node;
		System.out.println("Printing list.....");
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void printInReverse(Node node){
		Node temp  = node;
		if(temp.next!= null){
			printInReverse(temp.next);
		}
		System.out.print(temp.data+" ");
	}
	
	public static void findMiddleElement(Node head){
		Node slowPointer = head;
		Node fastpointer = head;
		if(head!=null){
		while(fastpointer.next != null){
			slowPointer = slowPointer.next;
			fastpointer = fastpointer.next.next;
			}
		}
		System.out.println();
		System.out.println("Middle Element of the list is: "+ slowPointer.data);
	}
	
	public static void push(int data){
		Node newNode = new Node(data);
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public static void pushAtPosition(int data, int position){
		Node newNode = new Node(data);
		Node temp  = head;
		int count=-1;
		while(temp.next!= null){
			count++;
			temp = temp.next;
			if(count==position){
				newNode.next = temp.next;
				
			}
		}
	}
	
	public static void main(String[] args) {
		FindMiddleElement list = new FindMiddleElement();
		head =  new Node(10);
		Node second = new Node(20);
		Node third =  new Node(30);
		Node fourth =   new Node(40);
		Node fifth =  new Node(50);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next= fifth;
		push(60);
		push(70);
		pushAtPosition(80, 7);
		printList(head);
		System.out.println();
		System.out.println("Printing list in reverse order....");
		printInReverse(head);
		findMiddleElement(head);
		
	}

}
