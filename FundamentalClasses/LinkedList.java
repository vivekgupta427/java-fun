package linkedList;
public class LinkedList {
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data =d;
			next = null;
		}
	}
	
	private void printList(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n= n.next;
		}
	}
	
	private void push(int newNode){
		Node newNode1 = new Node(newNode);
		newNode1.next = head;
		head = newNode1;
	}
	
	private void deleteNode(int key){
		Node tempNode = head;
		Node prev= null;
		
		if(tempNode==null){
			return;
		}
		
		if(tempNode!=null && tempNode.data==key){
			System.out.println("This section executed...Deleted Node is Head");
			head = tempNode.next;
			return;
		}
		
		while(tempNode.data!=key && tempNode!=null){
			prev =  tempNode;
			tempNode = tempNode.next;
		}		
		prev.next = tempNode.next;		
	}
	
	private void DeleteAtAPosition(int position){
		if(head == null){
			return;
		}
		Node temp = head;
		Node prev = null;
		if(position==0){
			head = temp.next;
			return;
		}
		int i=0;
		while(i<position && temp.next!= null){
			prev = temp;
			temp = temp.next;
			i++;
		}
		if(temp==null){
			return;
		}
		prev.next = temp.next;
		
	}
	
	private void pushAfter(Node preNode,int data){
		if(preNode==null){
			System.out.println("Pre Node can not be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = preNode.next;
		preNode.next = newNode;		
	}
	
	private void addLast(int data){
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			return;
		}
		Node n = head;
		while(n.next!=null){
			n= n.next;
		}
		n.next = newNode;
	}
	
	private int getSize(Node head){
		int count =0;
		if(head== null){
			return 0;
		}
		Node n = head;
		while(n!=null){
			n=n.next;
			count++;
		}
		return count;
	}
	
	private int getSizeRec(Node node){
		if(node==null){
			return 0;
		}
		else			
			return 1+getSizeRec(node.next);			
		}
	
	private Node reverseList(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current!= null){
			next= current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	public static void main(String[] args){
		
		LinkedList lList = new LinkedList();
		head = new Node(10);
		Node second = new Node(20);
	    Node third = new Node(10);		
		head.next = second;
		second.next = third;	
		
		lList.printList();
		//lList.push(5);
		System.out.println();
		lList.printList();		
		//lList.pushAfter(lList.head.next,15);
		System.out.println();
		lList.printList();
		//lList.addLast(35);
		System.out.println();
		lList.printList();
		
		//lList.DeleteAtAPosition(3);
		System.out.println();
		lList.printList();
		
		int n = lList.getSize(lList.head);
		System.out.println(n);
		int size = lList.getSizeRec(lList.head);
		System.out.println(size);
		System.out.println();
		System.out.println("The reverse of the list is :");
		head = lList.reverseList(head);
		lList.printList();
	}
}
